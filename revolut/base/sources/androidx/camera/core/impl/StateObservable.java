package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public abstract class StateObservable<T> implements Observable<T> {
    private final AtomicReference<Object> mState;
    private final Object mLock = new Object();
    private int mVersion = 0;
    private boolean mUpdating = false;
    private final Map<Observable.Observer<? super T>, ObserverWrapper<T>> mWrapperMap = new HashMap();
    private final CopyOnWriteArraySet<ObserverWrapper<T>> mNotifySet = new CopyOnWriteArraySet<>();

    public static abstract class ErrorWrapper {
        public static ErrorWrapper wrap(Throwable th10) {
            return new AutoValue_StateObservable_ErrorWrapper(th10);
        }

        public abstract Throwable getError();
    }

    public static final class ObserverWrapper<T> implements Runnable {
        private static final Object NOT_SET = new Object();
        private final Executor mExecutor;
        private final Observable.Observer<? super T> mObserver;
        private final AtomicReference<Object> mStateRef;
        private final AtomicBoolean mActive = new AtomicBoolean(true);
        private Object mLastState = NOT_SET;
        private int mLatestSignalledVersion = -1;
        private boolean mWrapperUpdating = false;

        public ObserverWrapper(AtomicReference<Object> atomicReference, Executor executor, Observable.Observer<? super T> observer) {
            this.mStateRef = atomicReference;
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        public void close() {
            this.mActive.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.mActive.get()) {
                        this.mWrapperUpdating = false;
                        return;
                    }
                    Object obj2 = this.mStateRef.get();
                    int i = this.mLatestSignalledVersion;
                    while (true) {
                        if (!Objects.equals(this.mLastState, obj2)) {
                            this.mLastState = obj2;
                            if (obj2 instanceof ErrorWrapper) {
                                this.mObserver.onError(((ErrorWrapper) obj2).getError());
                            } else {
                                this.mObserver.onNewData(obj2);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i == this.mLatestSignalledVersion || !this.mActive.get()) {
                                    break;
                                }
                                obj2 = this.mStateRef.get();
                                i = this.mLatestSignalledVersion;
                            } finally {
                            }
                        }
                    }
                    this.mWrapperUpdating = false;
                } finally {
                }
            }
        }

        public void update(int i) {
            synchronized (this) {
                try {
                    if (this.mActive.get()) {
                        if (i <= this.mLatestSignalledVersion) {
                            return;
                        }
                        this.mLatestSignalledVersion = i;
                        if (this.mWrapperUpdating) {
                            return;
                        }
                        this.mWrapperUpdating = true;
                        try {
                            this.mExecutor.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.mWrapperUpdating = false;
                            }
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }

    public StateObservable(Object obj2, boolean z) {
        if (!z) {
            this.mState = new AtomicReference<>(obj2);
        } else {
            Preconditions.checkArgument(obj2 instanceof Throwable, "Initial errors must be Throwable");
            this.mState = new AtomicReference<>(ErrorWrapper.wrap((Throwable) obj2));
        }
    }

    private void removeObserverLocked(Observable.Observer<? super T> observer) {
        ObserverWrapper<T> observerWrapperRemove = this.mWrapperMap.remove(observer);
        if (observerWrapperRemove != null) {
            observerWrapperRemove.close();
            this.mNotifySet.remove(observerWrapperRemove);
        }
    }

    private void updateStateInternal(Object obj2) {
        Iterator<ObserverWrapper<T>> it8;
        int i;
        synchronized (this.mLock) {
            try {
                if (Objects.equals(this.mState.getAndSet(obj2), obj2)) {
                    return;
                }
                int i2 = this.mVersion + 1;
                this.mVersion = i2;
                if (this.mUpdating) {
                    return;
                }
                this.mUpdating = true;
                Iterator<ObserverWrapper<T>> it9 = this.mNotifySet.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        it9.next().update(i2);
                    } else {
                        synchronized (this.mLock) {
                            try {
                                if (this.mVersion == i2) {
                                    this.mUpdating = false;
                                    return;
                                } else {
                                    it8 = this.mNotifySet.iterator();
                                    i = this.mVersion;
                                }
                            } finally {
                            }
                        }
                        it9 = it8;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        ObserverWrapper<T> observerWrapper;
        synchronized (this.mLock) {
            removeObserverLocked(observer);
            observerWrapper = new ObserverWrapper<>(this.mState, executor, observer);
            this.mWrapperMap.put(observer, observerWrapper);
            this.mNotifySet.add(observerWrapper);
        }
        observerWrapper.update(0);
    }

    @Override // androidx.camera.core.impl.Observable
    public ListenableFuture<T> fetchData() {
        Object obj2 = this.mState.get();
        return obj2 instanceof ErrorWrapper ? Futures.immediateFailedFuture(((ErrorWrapper) obj2).getError()) : Futures.immediateFuture(obj2);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
        synchronized (this.mLock) {
            removeObserverLocked(observer);
        }
    }

    public void removeObservers() {
        synchronized (this.mLock) {
            try {
                Iterator it8 = new HashSet(this.mWrapperMap.keySet()).iterator();
                while (it8.hasNext()) {
                    removeObserverLocked((Observable.Observer) it8.next());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void updateState(T t2) {
        updateStateInternal(t2);
    }

    public void updateStateAsError(Throwable th10) {
        updateStateInternal(ErrorWrapper.wrap(th10));
    }
}
