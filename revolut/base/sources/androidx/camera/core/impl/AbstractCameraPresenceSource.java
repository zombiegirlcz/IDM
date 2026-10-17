package androidx.camera.core.impl;

import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.impl.Observable;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractCameraPresenceSource implements Observable<List<CameraIdentifier>> {
    private List<CameraIdentifier> mCurrentData;
    private final Object mLock = new Object();
    private final List<ObserverWrapper> mObservers = new CopyOnWriteArrayList();
    private Throwable mCurrentError = null;
    private boolean mIsActive = false;

    public static class ObserverWrapper {
        final Executor mExecutor;
        final Observable.Observer<? super List<CameraIdentifier>> mObserver;

        public ObserverWrapper(Executor executor, Observable.Observer<? super List<CameraIdentifier>> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }
    }

    public AbstractCameraPresenceSource(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(CameraIdentifier.Factory.create(it8.next()));
        }
        this.mCurrentData = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyObserver$0(Throwable th10, ObserverWrapper observerWrapper, List list) {
        if (th10 != null) {
            observerWrapper.mObserver.onError(th10);
        } else {
            observerWrapper.mObserver.onNewData(list);
        }
    }

    private void notifyObserver(final ObserverWrapper observerWrapper, final List<CameraIdentifier> list, final Throwable th10) {
        observerWrapper.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractCameraPresenceSource.lambda$notifyObserver$0(th10, observerWrapper, list);
            }
        });
    }

    private void updateState(List<CameraIdentifier> list, Throwable th10) {
        boolean z;
        List<CameraIdentifier> listUnmodifiableList;
        Throwable th11;
        synchronized (this.mLock) {
            try {
                if (th10 != null) {
                    z = this.mCurrentError == null || !this.mCurrentData.isEmpty();
                    this.mCurrentError = th10;
                    this.mCurrentData = Collections.EMPTY_LIST;
                } else {
                    Preconditions.checkNotNull(list);
                    boolean z3 = (this.mCurrentError == null && this.mCurrentData.equals(list)) ? false : true;
                    this.mCurrentError = null;
                    this.mCurrentData = list;
                    z = z3;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.mCurrentData);
                th11 = this.mCurrentError;
            } catch (Throwable th12) {
                throw th12;
            }
        }
        if (z) {
            StringBuilder sb6 = new StringBuilder("Data changed. Notifying ");
            sb6.append(this.mObservers.size());
            sb6.append(" observers. Error: ");
            sb6.append(th11 != null);
            sb6.toString();
            Iterator<ObserverWrapper> it8 = this.mObservers.iterator();
            while (it8.hasNext()) {
                notifyObserver(it8.next(), listUnmodifiableList, th11);
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super List<CameraIdentifier>> observer) {
        List<CameraIdentifier> listUnmodifiableList;
        Throwable th10;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(observer);
        this.mObservers.add(new ObserverWrapper(executor, observer));
        synchronized (this.mLock) {
            try {
                if (!this.mIsActive && !this.mObservers.isEmpty()) {
                    this.mIsActive = true;
                    startMonitoring();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.mCurrentData);
                th10 = this.mCurrentError;
            } catch (Throwable th11) {
                throw th11;
            }
        }
        notifyObserver(new ObserverWrapper(executor, observer), listUnmodifiableList, th10);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super List<CameraIdentifier>> observer) {
        ObserverWrapper next;
        Preconditions.checkNotNull(observer);
        Iterator<ObserverWrapper> it8 = this.mObservers.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (next.mObserver.equals(observer)) {
                    break;
                }
            }
        }
        if (next != null) {
            this.mObservers.remove(next);
        }
        synchronized (this.mLock) {
            try {
                if (this.mIsActive && this.mObservers.isEmpty()) {
                    this.mIsActive = false;
                    stopMonitoring();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public abstract void startMonitoring();

    public abstract void stopMonitoring();

    public void updateData(List<CameraIdentifier> list) {
        updateState(list, null);
    }

    public void updateError(Throwable th10) {
        updateState(null, th10);
    }
}
