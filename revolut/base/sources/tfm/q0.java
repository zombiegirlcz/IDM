package tfm;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270738c;
    public final int d;
    public final zfm.f e;
    public final zfm.c f = new zfm.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f270739g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nfm.j f270740h;
    public ifm.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f270741j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f270742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ofm.o f270743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f270744n;

    public q0(efm.y yVar, kfm.o oVar, int i, int i2, zfm.f fVar) {
        this.f270736a = yVar;
        this.f270737b = oVar;
        this.f270738c = i;
        this.d = i2;
        this.e = fVar;
    }

    public final void a() {
        ofm.o oVar = this.f270743m;
        if (oVar != null) {
            lfm.d.a(oVar);
        }
        while (true) {
            ofm.o oVar2 = (ofm.o) this.f270739g.poll();
            if (oVar2 == null) {
                return;
            } else {
                lfm.d.a(oVar2);
            }
        }
    }

    public final void b() {
        Object objPoll;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        nfm.j jVar = this.f270740h;
        ArrayDeque arrayDeque = this.f270739g;
        efm.y yVar = this.f270736a;
        zfm.f fVar = this.e;
        int iAddAndGet = 1;
        while (true) {
            int i = this.f270744n;
            while (i != this.f270738c) {
                if (this.f270742l) {
                    jVar.clear();
                    a();
                    return;
                }
                if (fVar == zfm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                    jVar.clear();
                    a();
                    zfm.c cVar = this.f;
                    cVar.getClass();
                    yVar.onError(zfm.h.b(cVar));
                    return;
                }
                try {
                    Object objPoll2 = jVar.poll();
                    if (objPoll2 == null) {
                        break;
                    }
                    Object objApply = this.f270737b.apply(objPoll2);
                    mfm.f.b(objApply, "The mapper returned a null ObservableSource");
                    efm.w wVar = (efm.w) objApply;
                    ofm.o oVar = new ofm.o(this, this.d);
                    arrayDeque.offer(oVar);
                    wVar.subscribe(oVar);
                    i++;
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    this.i.dispose();
                    jVar.clear();
                    a();
                    zfm.c cVar2 = this.f;
                    cVar2.getClass();
                    zfm.h.a(cVar2, th10);
                    zfm.c cVar3 = this.f;
                    cVar3.getClass();
                    yVar.onError(zfm.h.b(cVar3));
                    return;
                }
            }
            this.f270744n = i;
            if (this.f270742l) {
                jVar.clear();
                a();
                return;
            }
            if (fVar == zfm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                jVar.clear();
                a();
                zfm.c cVar4 = this.f;
                cVar4.getClass();
                yVar.onError(zfm.h.b(cVar4));
                return;
            }
            ofm.o oVar2 = this.f270743m;
            if (oVar2 == null) {
                if (fVar == zfm.f.BOUNDARY && ((Throwable) this.f.get()) != null) {
                    jVar.clear();
                    a();
                    zfm.c cVar5 = this.f;
                    cVar5.getClass();
                    yVar.onError(zfm.h.b(cVar5));
                    return;
                }
                boolean z3 = this.f270741j;
                ofm.o oVar3 = (ofm.o) arrayDeque.poll();
                boolean z4 = oVar3 == null;
                if (z3 && z4) {
                    if (((Throwable) this.f.get()) == null) {
                        yVar.onComplete();
                        return;
                    }
                    jVar.clear();
                    a();
                    zfm.c cVar6 = this.f;
                    cVar6.getClass();
                    yVar.onError(zfm.h.b(cVar6));
                    return;
                }
                if (!z4) {
                    this.f270743m = oVar3;
                }
                oVar2 = oVar3;
            }
            if (oVar2 != null) {
                nfm.j jVar2 = oVar2.f224941c;
                while (!this.f270742l) {
                    boolean z6 = oVar2.d;
                    if (fVar == zfm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                        jVar.clear();
                        a();
                        zfm.c cVar7 = this.f;
                        cVar7.getClass();
                        yVar.onError(zfm.h.b(cVar7));
                        return;
                    }
                    try {
                        objPoll = jVar2.poll();
                        z = objPoll == null;
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        zfm.c cVar8 = this.f;
                        cVar8.getClass();
                        zfm.h.a(cVar8, th11);
                        this.f270743m = null;
                        this.f270744n--;
                    }
                    if (z6 && z) {
                        this.f270743m = null;
                        this.f270744n--;
                    } else if (!z) {
                        yVar.onNext(objPoll);
                    }
                }
                jVar.clear();
                a();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270742l) {
            return;
        }
        this.f270742l = true;
        this.i.dispose();
        if (getAndIncrement() == 0) {
            do {
                this.f270740h.clear();
                a();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270742l;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270741j = true;
        b();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.f270741j = true;
            b();
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.k == 0) {
            this.f270740h.offer(obj2);
        }
        b();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.i, cVar)) {
            this.i = cVar;
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(3);
                if (iB == 1) {
                    this.k = iB;
                    this.f270740h = eVar;
                    this.f270741j = true;
                    this.f270736a.onSubscribe(this);
                    b();
                    return;
                }
                if (iB == 2) {
                    this.k = iB;
                    this.f270740h = eVar;
                    this.f270736a.onSubscribe(this);
                    return;
                }
            }
            this.f270740h = new vfm.c(this.d);
            this.f270736a.onSubscribe(this);
        }
    }
}
