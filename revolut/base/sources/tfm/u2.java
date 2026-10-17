package tfm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends AtomicInteger implements efm.y, ifm.c {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f270860c;
    public final int d;
    public final boolean e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f270861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f270862h = new AtomicBoolean();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public u2(efm.y yVar, kfm.o oVar, kfm.o oVar2, int i2, boolean z) {
        this.f270858a = yVar;
        this.f270859b = oVar;
        this.f270860c = oVar2;
        this.d = i2;
        this.e = z;
        lazySet(1);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270862h.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.f270861g.dispose();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270862h.get();
    }

    @Override // efm.y
    public final void onComplete() {
        ArrayList arrayList = new ArrayList(this.f.values());
        this.f.clear();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            w2 w2Var = ((v2) it8.next()).f270884h;
            w2Var.e = true;
            w2Var.a();
        }
        this.f270858a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        ArrayList arrayList = new ArrayList(this.f.values());
        this.f.clear();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            w2 w2Var = ((v2) it8.next()).f270884h;
            w2Var.f = th10;
            w2Var.e = true;
            w2Var.a();
        }
        this.f270858a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f270859b.apply(obj2);
            Object obj3 = objApply != null ? objApply : i;
            ConcurrentHashMap concurrentHashMap = this.f;
            v2 v2Var = (v2) concurrentHashMap.get(obj3);
            if (v2Var == null) {
                if (this.f270862h.get()) {
                    return;
                }
                v2 v2Var2 = new v2(objApply, new w2(this.d, this, objApply, this.e));
                concurrentHashMap.put(obj3, v2Var2);
                getAndIncrement();
                this.f270858a.onNext(v2Var2);
                v2Var = v2Var2;
            }
            try {
                Object objApply2 = this.f270860c.apply(obj2);
                mfm.f.b(objApply2, "The value supplied is null");
                w2 w2Var = v2Var.f270884h;
                w2Var.f270915b.offer(objApply2);
                w2Var.a();
            } catch (Throwable th10) {
                m70.a.u(th10);
                this.f270861g.dispose();
                onError(th10);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            this.f270861g.dispose();
            onError(th11);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270861g, cVar)) {
            this.f270861g = cVar;
            this.f270858a.onSubscribe(this);
        }
    }
}
