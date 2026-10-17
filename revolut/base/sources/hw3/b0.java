package hw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n34.b f156054a;

    public b0(n34.b illionRepository) {
        Intrinsics.checkNotNullParameter(illionRepository, "illionRepository");
        this.f156054a = illionRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback r7, ft3.h1 r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof hw3.a0
            if (r0 == 0) goto L13
            r0 = r9
            hw3.a0 r0 = (hw3.a0) r0
            int r1 = r0.f156053w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156053w = r1
            goto L18
        L13:
            hw3.a0 r0 = new hw3.a0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156053w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            return r5
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            goto L7e
        L37:
            yhm.o.b(r9)
            int[] r9 = hw3.z.f156095a
            int r7 = r7.ordinal()
            r7 = r9[r7]
            n34.b r9 = r6.f156054a
            if (r7 == r4) goto L69
            if (r7 != r3) goto L63
            r0.f156053w = r3
            r9.getClass()
            n34.a r7 = new n34.a
            r7.<init>(r9, r8, r5, r4)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r8, r7, r0)
            if (r7 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L5f:
            if (r7 != r1) goto L62
            goto L7d
        L62:
            return r5
        L63:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L69:
            r0.f156053w = r4
            r9.getClass()
            n34.a r7 = new n34.a
            r7.<init>(r9, r8, r5, r3)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r8, r7, r0)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            it3.d r9 = (it3.d) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.b0.a(com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback, ft3.h1, gim.c):java.io.Serializable");
    }
}
