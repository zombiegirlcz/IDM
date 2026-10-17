package zz4;

import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements y44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l35.b f326510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz4.b f326511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f326512c;

    public d(l35.b loanInteractor, rz4.b forbearanceApplicationInteractor) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(forbearanceApplicationInteractor, "forbearanceApplicationInteractor");
        this.f326510a = loanInteractor;
        this.f326511b = forbearanceApplicationInteractor;
        this.f326512c = m72.b.y(null, null, true, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r8.collect(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y44.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zz4.a
            if (r0 == 0) goto L13
            r0 = r9
            zz4.a r0 = (zz4.a) r0
            int r1 = r0.f326506x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326506x = r1
            goto L1a
        L13:
            zz4.a r0 = new zz4.a
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f326506x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            goto L80
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L64
        L3b:
            yhm.o.b(r9)
            if (r8 == 0) goto L83
            w4l.i r9 = w4l.i.f294643c
            l35.b r2 = r7.f326510a
            y45.f r2 = (y45.f) r2
            efm.r r9 = r2.m(r8, r9)
            efm.r r9 = zi0.c.J(r9)
            zs4.d r2 = new zs4.d
            r6 = 21
            r2.<init>(r6)
            efm.r r9 = m70.a.g(r9, r5, r2, r4)
            r0.u = r8
            r0.f326506x = r4
            java.lang.Object r9 = nim.a.c(r9, r0)
            if (r9 != r1) goto L64
            goto L7f
        L64:
            p35.e0 r9 = (p35.e0) r9
            zz4.b r2 = new zz4.b
            r2.<init>(r7, r8, r9, r5)
            vkm.v1 r8 = ngm.n.K(r2)
            v20.c0 r9 = new v20.c0
            r2 = 6
            r9.<init>(r7, r2)
            r0.u = r5
            r0.f326506x = r3
            java.lang.Object r8 = r8.collect(r9, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L83:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zz4.d.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y44.a
    public final j2 b() {
        return this.f326512c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zz4.c
            if (r0 == 0) goto L13
            r0 = r8
            zz4.c r0 = (zz4.c) r0
            int r1 = r0.f326509w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326509w = r1
            goto L18
        L13:
            zz4.c r0 = new zz4.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f326509w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L7a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            rz4.b r8 = r5.f326511b
            r8.getClass()
            java.lang.String r2 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            uz4.c r4 = r8.f258509a
            r4.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.feature.credit.forbearance.application.impl.network.ForbearanceApplicationService r2 = r4.f284588a
            efm.b r2 = r2.signForbearanceApplicationAgreements(r6)
            pfm.r r2 = te0.w.g0(r2)
            rfm.y r7 = r8.a(r6, r7)
            rfm.e r8 = new rfm.e
            r4 = 0
            r8.<init>(r7, r2, r4)
            zp5.f r7 = new zp5.f
            r2 = 24
            r7.<init>(r5, r6, r2)
            zx0.b r6 = new zx0.b
            r2 = 27
            r6.<init>(r7, r2)
            rfm.l r7 = new rfm.l
            r2 = 0
            r7.<init>(r8, r6, r2)
            java.lang.String r6 = "flatMapSingle(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f326509w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zz4.d.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
