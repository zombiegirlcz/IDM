package qfm;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class y2 extends AtomicInteger implements dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2[] f245587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp.r f245588c;
    public final AtomicLong d;
    public final zfm.c e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f245589g;

    public y2(dom.a aVar, mp.r rVar, int i, int i2) {
        this.f245586a = aVar;
        this.f245588c = rVar;
        z2[] z2VarArr = new z2[i];
        for (int i3 = 0; i3 < i; i3++) {
            z2VarArr[i3] = new z2(this, i2);
        }
        this.f245589g = new Object[i];
        this.f245587b = z2VarArr;
        this.d = new AtomicLong();
        this.e = new zfm.c();
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this.d, j2);
            c();
        }
    }

    public final void b() {
        for (z2 z2Var : this.f245587b) {
            z2Var.getClass();
            yfm.g.b(z2Var);
        }
    }

    public final void c() {
        int i;
        long j2;
        if (getAndIncrement() != 0) {
            return;
        }
        dom.a aVar = this.f245586a;
        z2[] z2VarArr = this.f245587b;
        int length = z2VarArr.length;
        Object[] objArr = this.f245589g;
        int iAddAndGet = 1;
        do {
            long j3 = this.d.get();
            long j5 = 0;
            while (true) {
                if (j3 == j5) {
                    j2 = 0;
                    break;
                }
                if (this.f) {
                    return;
                }
                if (this.e.get() != null) {
                    b();
                    zfm.c cVar = this.e;
                    p.a.C(cVar, cVar, aVar);
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    z2 z2Var = z2VarArr[i2];
                    if (objArr[i2] == null) {
                        try {
                            boolean z3 = z2Var.f;
                            nfm.j jVar = z2Var.d;
                            Object objPoll = jVar != null ? jVar.poll() : null;
                            boolean z4 = objPoll == null;
                            if (z3 && z4) {
                                b();
                                if (((Throwable) this.e.get()) == null) {
                                    aVar.onComplete();
                                    return;
                                }
                                zfm.c cVar2 = this.e;
                                cVar2.getClass();
                                aVar.onError(zfm.h.b(cVar2));
                                return;
                            }
                            if (z4) {
                                z = true;
                            } else {
                                objArr[i2] = objPoll;
                            }
                        } catch (Throwable th10) {
                            m70.a.u(th10);
                            zfm.c cVar3 = this.e;
                            cVar3.getClass();
                            zfm.h.a(cVar3, th10);
                            b();
                            zfm.c cVar4 = this.e;
                            p.a.C(cVar4, cVar4, aVar);
                            return;
                        }
                    }
                }
                j2 = 0;
                if (z) {
                    break;
                }
                try {
                    Object objApply = this.f245588c.apply(objArr.clone());
                    mfm.f.b(objApply, "The zipper returned a null value");
                    aVar.onNext(objApply);
                    j5++;
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    b();
                    zfm.c cVar5 = this.e;
                    cVar5.getClass();
                    zfm.h.a(cVar5, th11);
                    zfm.c cVar6 = this.e;
                    p.a.C(cVar6, cVar6, aVar);
                    return;
                }
            }
            if (j3 == j5) {
                if (this.f) {
                    return;
                }
                if (this.e.get() != null) {
                    b();
                    zfm.c cVar7 = this.e;
                    p.a.C(cVar7, cVar7, aVar);
                    return;
                }
                for (int i3 = 0; i3 < length; i3++) {
                    z2 z2Var2 = z2VarArr[i3];
                    if (objArr[i3] == null) {
                        try {
                            boolean z6 = z2Var2.f;
                            nfm.j jVar2 = z2Var2.d;
                            Object objPoll2 = jVar2 != null ? jVar2.poll() : null;
                            boolean z11 = objPoll2 == null;
                            if (z6 && z11) {
                                b();
                                if (((Throwable) this.e.get()) == null) {
                                    aVar.onComplete();
                                    return;
                                }
                                zfm.c cVar8 = this.e;
                                cVar8.getClass();
                                aVar.onError(zfm.h.b(cVar8));
                                return;
                            }
                            if (!z11) {
                                objArr[i3] = objPoll2;
                            }
                        } catch (Throwable th12) {
                            m70.a.u(th12);
                            zfm.c cVar9 = this.e;
                            cVar9.getClass();
                            zfm.h.a(cVar9, th12);
                            b();
                            zfm.c cVar10 = this.e;
                            p.a.C(cVar10, cVar10, aVar);
                            return;
                        }
                    }
                }
            }
            if (j5 != j2) {
                for (z2 z2Var3 : z2VarArr) {
                    z2Var3.a(j5);
                }
                if (j3 != Long.MAX_VALUE) {
                    this.d.addAndGet(-j5);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        b();
    }
}
