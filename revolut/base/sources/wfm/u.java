package wfm;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
public final class u extends AtomicReferenceArray implements Runnable, Callable, ifm.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f297198b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f297199c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f297200a;

    public u(Runnable runnable, lfm.c cVar) {
        super(3);
        this.f297200a = runnable;
        lazySet(0, cVar);
    }

    public final void a(Future future) {
        Object obj2;
        do {
            obj2 = get(1);
            if (obj2 == e) {
                return;
            }
            if (obj2 == f297199c) {
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

    @Override // ifm.c
    public final void dispose() {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        while (true) {
            Object obj7 = get(1);
            obj2 = e;
            if (obj7 == obj2 || obj7 == (obj5 = f297199c) || obj7 == (obj6 = d)) {
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
            if (obj3 == obj2 || obj3 == (obj4 = f297198b) || obj3 == null) {
                return;
            }
        } while (!compareAndSet(0, obj3, obj4));
        ((lfm.c) obj3).b(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        Object obj2 = get(0);
        return obj2 == f297198b || obj2 == e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj2;
        boolean zCompareAndSet;
        Object obj3;
        Object obj4 = d;
        Object obj5 = f297199c;
        Object obj6 = f297198b;
        Object obj7 = e;
        lazySet(2, Thread.currentThread());
        try {
            this.f297200a.run();
        } finally {
            try {
            } catch (Throwable th10) {
                do {
                    if (obj2 == obj5 || obj2 == obj4) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj8 = get(0);
        if (obj8 != obj6 && compareAndSet(0, obj8, obj7) && obj8 != null) {
            ((lfm.c) obj8).b(this);
        }
        do {
            obj3 = get(1);
            if (obj3 == obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
