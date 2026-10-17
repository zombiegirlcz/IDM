package q2j;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f241679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f241680c;

    public /* synthetic */ h(x xVar, xi0.b bVar, int i) {
        this.f241678a = i;
        this.f241679b = xVar;
        this.f241680c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f241678a
            q2j.r r4 = (q2j.r) r4
            switch(r0) {
                case 0: goto L51;
                case 1: goto L2a;
                default: goto L7;
            }
        L7:
            boolean r0 = r4 instanceof q2j.q
            q2j.x r1 = r3.f241679b
            if (r0 == 0) goto L14
            r4 = 1
            xi0.b r0 = r3.f241680c
            r1.T(r0, r4)
            goto L21
        L14:
            boolean r0 = r4 instanceof q2j.p
            if (r0 == 0) goto L24
            q2j.p r4 = (q2j.p) r4
            eda.e r4 = r4.f241692a
            io3.d r4 = r4.f124961a
            r1.S(r4)
        L21:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L24:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L2a:
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof q2j.p
            if (r0 == 0) goto L46
            q2j.x r0 = r3.f241679b
            com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$Configuration r1 = r0.i
            boolean r2 = r1.f99579m
            if (r2 == 0) goto L46
            wsg.n r0 = r0.k
            com.revolut.core.model.account.AccountId r1 = r1.f99584s
            xi0.b r2 = r3.f241680c
            pfm.r r0 = r0.n0(r2, r1)
            goto L48
        L46:
            pfm.m r0 = pfm.m.f235744a
        L48:
            ufm.b r4 = te0.w.j(r4)
            rfm.f0 r4 = r0.f(r4)
            return r4
        L51:
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof q2j.q
            q2j.x r1 = r3.f241679b
            if (r0 == 0) goto L63
            r4 = 0
            xi0.b r0 = r3.f241680c
            r1.T(r0, r4)
            goto L70
        L63:
            boolean r0 = r4 instanceof q2j.p
            if (r0 == 0) goto L73
            q2j.p r4 = (q2j.p) r4
            eda.e r4 = r4.f241692a
            io3.d r4 = r4.f124961a
            r1.V(r4)
        L70:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L73:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q2j.h.invoke(java.lang.Object):java.lang.Object");
    }
}
