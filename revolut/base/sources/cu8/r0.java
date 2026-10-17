package cu8;

import kotlin.jvm.internal.Intrinsics;
import ks8.j;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 implements ks8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f108889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt8.d f108890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f108891c;
    public final mt8.a d;
    public final xoj.a e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.b f108892g;

    public r0(wsg.n walletInteractor, mt8.d kycInteractor, g kycFailedCheckResultFactory, mt8.a kycFeatureToggleProvider, xoj.a featuresInteractor, ang.f userInteractor, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(kycFailedCheckResultFactory, "kycFailedCheckResultFactory");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f108889a = walletInteractor;
        this.f108890b = kycInteractor;
        this.f108891c = kycFailedCheckResultFactory;
        this.d = kycFeatureToggleProvider;
        this.e = featuresInteractor;
        this.f = userInteractor;
        this.f108892g = newWalletsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(cu8.r0 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof cu8.m0
            if (r0 == 0) goto L13
            r0 = r6
            cu8.m0 r0 = (cu8.m0) r0
            int r1 = r0.f108857w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108857w = r1
            goto L18
        L13:
            cu8.m0 r0 = new cu8.m0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108857w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L49
        L36:
            yhm.o.b(r6)
            ang.f r6 = r5.f
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.f108857w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            goto L57
        L49:
            do3.n r6 = (do3.n) r6
            java.lang.String r6 = r6.f116424y
            if (r6 == 0) goto L59
            r0.f108857w = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L58
        L57:
            return r1
        L58:
            return r5
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cu8.r0.c(cu8.r0, gim.c):java.lang.Object");
    }

    public final ks8.j d(yt8.c cVar, ks8.c cVar2, long j2, boolean z) {
        if (!cVar.f() && (!cVar2.a() || j2 <= 0)) {
            boolean zG = cVar.g();
            g gVar = this.f108891c;
            if (zG) {
                return gVar.b(e.PENDING, cVar2, cVar.b(), z);
            }
            if (cVar.d()) {
                return gVar.b(e.FAILED, cVar2, cVar.b(), z);
            }
            if (cVar.e()) {
                return gVar.b(e.NOT_VERIFIED, cVar2, cVar.b(), z);
            }
        }
        return j.a.f189313a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof cu8.n0
            if (r0 == 0) goto L13
            r0 = r9
            cu8.n0 r0 = (cu8.n0) r0
            int r1 = r0.f108860w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108860w = r1
            goto L18
        L13:
            cu8.n0 r0 = new cu8.n0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108860w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L5c
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            wsg.b r9 = r8.f108892g
            kotlinx.coroutines.flow.Flow r9 = osg.a.a(r9)
            cs.a r2 = new cs.a
            r4 = 26
            r2.<init>(r4)
            akg.n r9 = nim.a.v(r9, r2)
            ct6.o r2 = new ct6.o
            r4 = 4
            r2.<init>(r4)
            ct6.o r4 = new ct6.o
            r5 = 5
            r4.<init>(r5)
            jhi.b r9 = mo3.a.e(r9, r2, r4)
            r0.f108860w = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r0 = r9 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L6e
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
        L6c:
            r3 = r1
            goto L90
        L6e:
            java.util.Iterator r9 = r9.iterator()
        L72:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r9.next()
            io3.d r0 = (io3.d) r0
            io3.k r2 = r0.r()
            io3.k r4 = io3.k.ACTIVE
            if (r2 != r4) goto L72
            long r4 = r0.d()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L72
        L90:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cu8.r0.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ks8.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof cu8.o0
            if (r0 == 0) goto L13
            r0 = r8
            cu8.o0 r0 = (cu8.o0) r0
            int r1 = r0.f108880x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108880x = r1
            goto L18
        L13:
            cu8.o0 r0 = new cu8.o0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108880x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ks8.c r7 = r0.u
            yhm.o.b(r8)
            goto L52
        L38:
            yhm.o.b(r8)
            yoj.c r8 = yoj.c.KYC_VERIFICATION
            yoj.d r2 = yoj.d.ENABLED
            xoj.a r5 = r6.e
            cpj.b r5 = (cpj.b) r5
            ufm.i r8 = r5.f(r8, r2)
            r0.u = r7
            r0.f108880x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L52
            goto L6a
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6c
            r8 = 0
            r0.u = r8
            r0.f108880x = r3
            cu8.q0 r2 = new cu8.q0
            r2.<init>(r6, r7, r8)
            java.lang.Object r7 = skm.e0.o(r2, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r7
        L6c:
            ks8.j$a r7 = ks8.j.a.f189313a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cu8.r0.f(ks8.c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
