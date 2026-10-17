package vgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends AtomicReferenceArray implements Runnable, Callable, Disposable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f289247b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f289248c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f289249a;

    public q(Runnable runnable, ggm.a aVar) {
        super(3);
        this.f289249a = runnable;
        lazySet(0, aVar);
    }

    public final void a(Future future) {
        Object obj2;
        do {
            obj2 = get(1);
            if (obj2 == e) {
                return;
            }
            if (obj2 == f289248c) {
                future.cancel(false);
                return;
            } else if (obj2 == d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj2, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        while (true) {
            Object obj7 = get(1);
            obj2 = e;
            if (obj7 == obj2 || obj7 == (obj5 = f289248c) || obj7 == (obj6 = d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj5 = obj6;
            }
            if (compareAndSet(1, obj7, obj5)) {
                if (obj7 != null) {
                    ((Future) obj7).cancel(z);
                }
            }
        }
        do {
            obj3 = get(0);
            if (obj3 == obj2 || obj3 == (obj4 = f289247b) || obj3 == null) {
                return;
            }
        } while (!compareAndSet(0, obj3, obj4));
        ((ggm.a) obj3).b(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        Object obj2 = get(0);
        return obj2 == f289247b || obj2 == e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj2;
        Object obj3;
        Object obj4 = d;
        Object obj5 = f289248c;
        Object obj6 = f289247b;
        Object obj7 = e;
        lazySet(2, Thread.currentThread());
        try {
            this.f289249a.run();
            Object obj8 = get(0);
            if (obj8 != obj6 && compareAndSet(0, obj8, obj7) && obj8 != null) {
                ((ggm.a) obj8).b(this);
            }
            do {
                obj3 = get(1);
                if (obj3 == obj5 || obj3 == obj4) {
                    break;
                }
            } while (!compareAndSet(1, obj3, obj7));
            lazySet(2, null);
        } catch (Throwable th10) {
            try {
                jb3.l.v(th10);
                throw th10;
            } catch (Throwable th11) {
                Object obj9 = get(0);
                if (obj9 != obj6 && compareAndSet(0, obj9, obj7) && obj9 != null) {
                    ((ggm.a) obj9).b(this);
                }
                do {
                    obj2 = get(1);
                    if (obj2 == obj5 || obj2 == obj4) {
                        break;
                    }
                } while (!compareAndSet(1, obj2, obj7));
                lazySet(2, null);
                throw th11;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String strM;
        Object obj2 = get(1);
        if (obj2 == e) {
            strM = "Finished";
        } else if (obj2 == f289248c) {
            strM = "Disposed(Sync)";
        } else if (obj2 == d) {
            strM = "Disposed(Async)";
        } else {
            Object obj3 = get(2);
            strM = obj3 == null ? "Waiting" : a0.d.m(obj3, "Running on ");
        }
        return q.class.getSimpleName() + "[" + strM + "]";
    }
}
