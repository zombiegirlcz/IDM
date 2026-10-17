package tfm;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class y2 extends AtomicInteger implements ifm.c, z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vfm.c f270962c;
    public final ifm.b d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f270963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270964h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kfm.c f270965j;
    public final AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f270966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f270967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f270968n;

    public y2(efm.y yVar, kfm.o oVar, kfm.o oVar2, kfm.c cVar, int i) {
        this.f270960a = i;
        switch (i) {
            case 1:
                this.f270961b = yVar;
                this.d = new ifm.b();
                this.f270962c = new vfm.c(efm.r.bufferSize());
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.f270963g = new AtomicReference();
                this.f270964h = oVar;
                this.i = oVar2;
                this.f270965j = cVar;
                this.k = new AtomicInteger(2);
                break;
            default:
                this.f270961b = yVar;
                this.d = new ifm.b();
                this.f270962c = new vfm.c(efm.r.bufferSize());
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.f270963g = new AtomicReference();
                this.f270964h = oVar;
                this.i = oVar2;
                this.f270965j = cVar;
                this.k = new AtomicInteger(2);
                break;
        }
    }

    @Override // tfm.z2
    public final void a(Throwable th10) {
        switch (this.f270960a) {
            case 0:
                if (!zfm.h.a(this.f270963g, th10)) {
                    mo3.a.m(th10);
                } else {
                    f();
                }
                break;
            default:
                if (!zfm.h.a(this.f270963g, th10)) {
                    mo3.a.m(th10);
                } else {
                    f();
                }
                break;
        }
    }

    @Override // tfm.z2
    public final void b(Throwable th10) {
        switch (this.f270960a) {
            case 0:
                if (!zfm.h.a(this.f270963g, th10)) {
                    mo3.a.m(th10);
                } else {
                    this.k.decrementAndGet();
                    f();
                }
                break;
            default:
                if (!zfm.h.a(this.f270963g, th10)) {
                    mo3.a.m(th10);
                } else {
                    this.k.decrementAndGet();
                    f();
                }
                break;
        }
    }

    @Override // tfm.z2
    public final void c(Object obj2, boolean z) {
        switch (this.f270960a) {
            case 0:
                synchronized (this) {
                    try {
                        this.f270962c.a(z ? 1 : 2, obj2);
                    } finally {
                    }
                    break;
                }
                f();
                return;
            default:
                synchronized (this) {
                    try {
                        this.f270962c.a(z ? 1 : 2, obj2);
                    } finally {
                    }
                    break;
                }
                f();
                return;
        }
    }

    @Override // tfm.z2
    public final void d(boolean z, a3 a3Var) {
        switch (this.f270960a) {
            case 0:
                synchronized (this) {
                    try {
                        this.f270962c.a(z ? 3 : 4, a3Var);
                    } finally {
                    }
                    break;
                }
                f();
                return;
            default:
                synchronized (this) {
                    try {
                        this.f270962c.a(z ? 3 : 4, a3Var);
                    } finally {
                    }
                    break;
                }
                f();
                return;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270960a) {
            case 0:
                if (!this.f270968n) {
                    this.f270968n = true;
                    this.d.dispose();
                    if (getAndIncrement() == 0) {
                        this.f270962c.clear();
                    }
                    break;
                }
                break;
            default:
                if (!this.f270968n) {
                    this.f270968n = true;
                    this.d.dispose();
                    if (getAndIncrement() == 0) {
                        this.f270962c.clear();
                    }
                }
                break;
        }
    }

    @Override // tfm.z2
    public final void e(b3 b3Var) {
        switch (this.f270960a) {
            case 0:
                this.d.b(b3Var);
                this.k.decrementAndGet();
                f();
                break;
            default:
                this.d.b(b3Var);
                this.k.decrementAndGet();
                f();
                break;
        }
    }

    public final void f() {
        switch (this.f270960a) {
            case 0:
                if (getAndIncrement() == 0) {
                    vfm.c cVar = this.f270962c;
                    efm.y yVar = this.f270961b;
                    int iAddAndGet = 1;
                    while (!this.f270968n) {
                        if (((Throwable) this.f270963g.get()) != null) {
                            cVar.clear();
                            this.d.dispose();
                            h(yVar);
                            break;
                        } else {
                            boolean z = this.k.get() == 0;
                            Integer num = (Integer) cVar.poll();
                            boolean z3 = num == null;
                            if (z && z3) {
                                Iterator it8 = this.e.values().iterator();
                                while (it8.hasNext()) {
                                    ((ihm.m) it8.next()).onComplete();
                                }
                                this.e.clear();
                                this.f.clear();
                                this.d.dispose();
                                yVar.onComplete();
                                break;
                            } else if (z3) {
                                iAddAndGet = addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    break;
                                }
                            } else {
                                Object objPoll = cVar.poll();
                                if (num == 1) {
                                    ihm.m mVar = new ihm.m(efm.r.bufferSize());
                                    int i = this.f270966l;
                                    this.f270966l = i + 1;
                                    this.e.put(Integer.valueOf(i), mVar);
                                    try {
                                        Object objApply = this.f270964h.apply(objPoll);
                                        mfm.f.b(objApply, "The leftEnd returned a null ObservableSource");
                                        efm.w wVar = (efm.w) objApply;
                                        a3 a3Var = new a3(this, true, i);
                                        this.d.a(a3Var);
                                        wVar.subscribe(a3Var);
                                        if (((Throwable) this.f270963g.get()) != null) {
                                            cVar.clear();
                                            this.d.dispose();
                                            h(yVar);
                                            break;
                                        } else {
                                            try {
                                                Object objApply2 = this.f270965j.apply(objPoll, mVar);
                                                mfm.f.b(objApply2, "The resultSelector returned a null value");
                                                yVar.onNext(objApply2);
                                                Iterator it9 = this.f.values().iterator();
                                                while (it9.hasNext()) {
                                                    mVar.onNext(it9.next());
                                                }
                                            } catch (Throwable th10) {
                                                i(th10, yVar, cVar);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th11) {
                                        i(th11, yVar, cVar);
                                        return;
                                    }
                                } else if (num == 2) {
                                    int i2 = this.f270967m;
                                    this.f270967m = i2 + 1;
                                    this.f.put(Integer.valueOf(i2), objPoll);
                                    try {
                                        Object objApply3 = this.i.apply(objPoll);
                                        mfm.f.b(objApply3, "The rightEnd returned a null ObservableSource");
                                        efm.w wVar2 = (efm.w) objApply3;
                                        a3 a3Var2 = new a3(this, false, i2);
                                        this.d.a(a3Var2);
                                        wVar2.subscribe(a3Var2);
                                        if (((Throwable) this.f270963g.get()) != null) {
                                            cVar.clear();
                                            this.d.dispose();
                                            h(yVar);
                                        } else {
                                            Iterator it10 = this.e.values().iterator();
                                            while (it10.hasNext()) {
                                                ((ihm.m) it10.next()).onNext(objPoll);
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        i(th12, yVar, cVar);
                                        return;
                                    }
                                    break;
                                } else if (num == 3) {
                                    a3 a3Var3 = (a3) objPoll;
                                    ihm.m mVar2 = (ihm.m) this.e.remove(Integer.valueOf(a3Var3.f270338c));
                                    this.d.c(a3Var3);
                                    if (mVar2 != null) {
                                        mVar2.onComplete();
                                    }
                                } else if (num == 4) {
                                    a3 a3Var4 = (a3) objPoll;
                                    this.f.remove(Integer.valueOf(a3Var4.f270338c));
                                    this.d.c(a3Var4);
                                }
                            }
                        }
                    }
                    cVar.clear();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    vfm.c cVar2 = this.f270962c;
                    efm.y yVar2 = this.f270961b;
                    int iAddAndGet2 = 1;
                    while (!this.f270968n) {
                        if (((Throwable) this.f270963g.get()) != null) {
                            cVar2.clear();
                            this.d.dispose();
                            h(yVar2);
                            break;
                        } else {
                            boolean z4 = this.k.get() == 0;
                            Integer num2 = (Integer) cVar2.poll();
                            boolean z6 = num2 == null;
                            if (z4 && z6) {
                                this.e.clear();
                                this.f.clear();
                                this.d.dispose();
                                yVar2.onComplete();
                                break;
                            } else if (z6) {
                                iAddAndGet2 = addAndGet(-iAddAndGet2);
                                if (iAddAndGet2 == 0) {
                                    break;
                                }
                            } else {
                                Object objPoll2 = cVar2.poll();
                                if (num2 == 1) {
                                    int i3 = this.f270966l;
                                    this.f270966l = i3 + 1;
                                    this.e.put(Integer.valueOf(i3), objPoll2);
                                    try {
                                        Object objApply4 = this.f270964h.apply(objPoll2);
                                        mfm.f.b(objApply4, "The leftEnd returned a null ObservableSource");
                                        efm.w wVar3 = (efm.w) objApply4;
                                        a3 a3Var5 = new a3(this, true, i3);
                                        this.d.a(a3Var5);
                                        wVar3.subscribe(a3Var5);
                                        if (((Throwable) this.f270963g.get()) != null) {
                                            cVar2.clear();
                                            this.d.dispose();
                                            h(yVar2);
                                            break;
                                        } else {
                                            Iterator it11 = this.f.values().iterator();
                                            while (it11.hasNext()) {
                                                try {
                                                    Object objApply5 = this.f270965j.apply(objPoll2, it11.next());
                                                    mfm.f.b(objApply5, "The resultSelector returned a null value");
                                                    yVar2.onNext(objApply5);
                                                } catch (Throwable th13) {
                                                    i(th13, yVar2, cVar2);
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        i(th14, yVar2, cVar2);
                                        return;
                                    }
                                } else if (num2 == 2) {
                                    int i5 = this.f270967m;
                                    this.f270967m = i5 + 1;
                                    this.f.put(Integer.valueOf(i5), objPoll2);
                                    try {
                                        Object objApply6 = this.i.apply(objPoll2);
                                        mfm.f.b(objApply6, "The rightEnd returned a null ObservableSource");
                                        efm.w wVar4 = (efm.w) objApply6;
                                        a3 a3Var6 = new a3(this, false, i5);
                                        this.d.a(a3Var6);
                                        wVar4.subscribe(a3Var6);
                                        if (((Throwable) this.f270963g.get()) != null) {
                                            cVar2.clear();
                                            this.d.dispose();
                                            h(yVar2);
                                            break;
                                        } else {
                                            Iterator it12 = this.e.values().iterator();
                                            while (it12.hasNext()) {
                                                try {
                                                    Object objApply7 = this.f270965j.apply(it12.next(), objPoll2);
                                                    mfm.f.b(objApply7, "The resultSelector returned a null value");
                                                    yVar2.onNext(objApply7);
                                                } catch (Throwable th15) {
                                                    i(th15, yVar2, cVar2);
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th16) {
                                        i(th16, yVar2, cVar2);
                                    }
                                } else if (num2 == 3) {
                                    a3 a3Var7 = (a3) objPoll2;
                                    this.e.remove(Integer.valueOf(a3Var7.f270338c));
                                    this.d.c(a3Var7);
                                } else {
                                    a3 a3Var8 = (a3) objPoll2;
                                    this.f.remove(Integer.valueOf(a3Var8.f270338c));
                                    this.d.c(a3Var8);
                                }
                            }
                        }
                    }
                    cVar2.clear();
                    break;
                }
                break;
        }
    }

    public final void h(efm.y yVar) {
        switch (this.f270960a) {
            case 0:
                Throwable thB = zfm.h.b(this.f270963g);
                LinkedHashMap linkedHashMap = this.e;
                Iterator it8 = linkedHashMap.values().iterator();
                while (it8.hasNext()) {
                    ((ihm.m) it8.next()).onError(thB);
                }
                linkedHashMap.clear();
                this.f.clear();
                yVar.onError(thB);
                break;
            default:
                Throwable thB2 = zfm.h.b(this.f270963g);
                this.e.clear();
                this.f.clear();
                yVar.onError(thB2);
                break;
        }
    }

    public final void i(Throwable th10, efm.y yVar, vfm.c cVar) {
        switch (this.f270960a) {
            case 0:
                m70.a.u(th10);
                zfm.h.a(this.f270963g, th10);
                cVar.clear();
                this.d.dispose();
                h(yVar);
                break;
            default:
                m70.a.u(th10);
                zfm.h.a(this.f270963g, th10);
                cVar.clear();
                this.d.dispose();
                h(yVar);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270960a) {
        }
        return this.f270968n;
    }
}
