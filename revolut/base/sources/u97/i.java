package u97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mre.c f278410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f278411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t97.c productCellProvider, mre.c termsNavigationFactory) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f278410b = termsNavigationFactory;
        this.f278411c = t97.d.PRIVACY_POLICY;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f278411c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u97.h
            if (r0 == 0) goto L13
            r0 = r5
            u97.h r0 = (u97.h) r0
            int r1 = r0.f278409w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278409w = r1
            goto L1a
        L13:
            u97.h r0 = new u97.h
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278409w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            com.revolut.feature.terms.api.model.TermsScope$a r5 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r5.getClass()
            com.revolut.feature.terms.api.model.TermsScope r5 = com.revolut.feature.terms.api.model.TermsScope.f90360a0
            mre.c r2 = r4.f278410b
            ufm.i r5 = mre.c.a(r2, r5)
            r0.f278409w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            o97.l r0 = new o97.l
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.i.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
