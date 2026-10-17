package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class s2 extends AtomicInteger implements fgm.l, Disposable {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f263145c;
    public final int d;
    public final boolean e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Disposable f263146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f263147h = new AtomicBoolean();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public s2(fgm.l lVar, igm.o oVar, igm.o oVar2, int i2, boolean z) {
        this.f263143a = lVar;
        this.f263144b = oVar;
        this.f263145c = oVar2;
        this.d = i2;
        this.e = z;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263147h.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.f263146g.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263147h.get();
    }

    @Override // fgm.l
    public final void onComplete() {
        ConcurrentHashMap concurrentHashMap = this.f;
        ArrayList arrayList = new ArrayList(concurrentHashMap.values());
        concurrentHashMap.clear();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            u2 u2Var = ((t2) it8.next()).f263176b;
            u2Var.e = true;
            u2Var.a();
        }
        this.f263143a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        ArrayList arrayList = new ArrayList(this.f.values());
        this.f.clear();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            u2 u2Var = ((t2) it8.next()).f263176b;
            u2Var.f = th10;
            u2Var.e = true;
            u2Var.a();
        }
        this.f263143a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        boolean z;
        Object obj3 = i;
        fgm.l lVar = this.f263143a;
        ConcurrentHashMap concurrentHashMap = this.f;
        try {
            Object objApply = this.f263144b.apply(obj2);
            Object obj4 = objApply != null ? objApply : obj3;
            t2 t2Var = (t2) concurrentHashMap.get(obj4);
            if (t2Var != null) {
                z = false;
            } else {
                if (this.f263147h.get()) {
                    return;
                }
                t2Var = new t2(objApply, new u2(this.d, this, objApply, this.e));
                concurrentHashMap.put(obj4, t2Var);
                getAndIncrement();
                z = true;
            }
            try {
                u2 u2Var = t2Var.f263176b;
                Object objApply2 = this.f263145c.apply(obj2);
                Objects.requireNonNull(objApply2, "The value supplied is null");
                u2Var.f263198b.offer(objApply2);
                u2Var.a();
                if (z) {
                    lVar.onNext(t2Var);
                    AtomicInteger atomicInteger = u2Var.i;
                    if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 2)) {
                        if (objApply != null) {
                            obj3 = objApply;
                        }
                        this.f.remove(obj3);
                        if (decrementAndGet() == 0) {
                            this.f263146g.dispose();
                        }
                        u2 u2Var2 = t2Var.f263176b;
                        u2Var2.e = true;
                        u2Var2.a();
                    }
                }
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.f263146g.dispose();
                if (z) {
                    lVar.onNext(t2Var);
                }
                onError(th10);
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            this.f263146g.dispose();
            onError(th11);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263146g, disposable)) {
            this.f263146g = disposable;
            this.f263143a.onSubscribe(this);
        }
    }
}
