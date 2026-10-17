package xq3;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq3.a f308097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f308098b;

    public t(bq3.a repository, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f308097a = repository;
        this.f308098b = featuresInteractor;
    }

    public final ufm.n a() {
        xr3.u uVar = (xr3.u) this.f308097a;
        d0<tt3.a> d0VarAcceptCreditLimitIncreasePreQualificationOffer = uVar.f308241b.acceptCreditLimitIncreasePreQualificationOffer();
        xo8.u uVar2 = new xo8.u(9, new xr3.r(uVar, 1));
        d0VarAcceptCreditLimitIncreasePreQualificationOffer.getClass();
        ufm.i iVar = new ufm.i(new ufm.f(d0VarAcceptCreditLimitIncreasePreQualificationOffer, uVar2, 3), new xo8.u(10, new xr3.r(uVar, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final sfm.b b() {
        sfm.b bVar = new sfm.b(((cpj.b) this.f308098b).f(yoj.c.CREDIT_CARD_LIMIT_INCREASE, yoj.d.DISABLED), new xo8.u(6, new xng.l(this, 13)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r13 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, xp3.d r14, gim.c r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof xq3.s
            if (r0 == 0) goto L13
            r0 = r15
            xq3.s r0 = (xq3.s) r0
            int r1 = r0.f308096x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308096x = r1
            goto L18
        L13:
            xq3.s r0 = new xq3.s
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308096x
            bq3.a r3 = r12.f308097a
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r15)
            goto L7c
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            java.lang.String r13 = r0.u
            yhm.o.b(r15)
            goto L62
        L3b:
            yhm.o.b(r15)
            r0.u = r13
            r0.f308096x = r5
            r7 = r3
            xr3.u r7 = (xr3.u) r7
            r7.getClass()
            xge.f r6 = new xge.f
            r11 = 16
            r8 = r13
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r6, r0)
            if (r13 != r1) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L5e:
            if (r13 != r1) goto L61
            goto L7b
        L61:
            r13 = r8
        L62:
            r0.u = r10
            r0.f308096x = r4
            xr3.u r3 = (xr3.u) r3
            x4l.c r14 = r3.f
            xr3.t r15 = new xr3.t
            r15.<init>(r13)
            r13 = 0
            java.lang.Object r13 = r14.d(r15, r13, r0)
            if (r13 != r1) goto L77
            goto L79
        L77:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L79:
            if (r13 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.t.c(java.lang.String, xp3.d, gim.c):java.lang.Object");
    }
}
