package q97;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class y1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.e f243828c;
    public final sha.c d;
    public final t97.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(t97.c productCellProvider, gr6.e freelancerAvailabilityInteractor, sha.c proOnboardingCommandFactory, int i) {
        super(productCellProvider);
        this.f243827b = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
                super(productCellProvider);
                this.f243828c = freelancerAvailabilityInteractor;
                this.d = proOnboardingCommandFactory;
                this.e = t97.d.PRO_TERMINAL;
                break;
            default:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
                this.f243828c = freelancerAvailabilityInteractor;
                this.d = proOnboardingCommandFactory;
                this.e = t97.d.PRO_HARDWARE_SHOP;
                break;
        }
    }

    @Override // r97.b
    public final Flow d() {
        switch (this.f243827b) {
            case 0:
                return new vkm.v1(new prl.k(this, null, 23));
            default:
                return new vkm.v1(new prl.k(this, null, 25));
        }
    }

    @Override // r97.b
    public final p97.b f() {
        switch (this.f243827b) {
        }
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            int r0 = r4.f243827b
            switch(r0) {
                case 0: goto L54;
                default: goto L5;
            }
        L5:
            boolean r0 = r5 instanceof q97.g2
            if (r0 == 0) goto L18
            r0 = r5
            q97.g2 r0 = (q97.g2) r0
            int r1 = r0.f243697w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f243697w = r1
            goto L1f
        L18:
            q97.g2 r0 = new q97.g2
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1f:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243697w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r5)
            goto L4c
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            yhm.o.b(r5)
            com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination r5 = new com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination
            r2 = 0
            r5.<init>(r2)
            r0.f243697w = r3
            sha.c r2 = r4.d
            zha.d r2 = (zha.d) r2
            java.lang.Object r5 = r2.d(r5, r0)
            if (r5 != r1) goto L4c
            goto L53
        L4c:
            aii.u r5 = (aii.u) r5
            o97.d r1 = new o97.d
            r1.<init>(r5)
        L53:
            return r1
        L54:
            boolean r0 = r5 instanceof q97.x1
            if (r0 == 0) goto L67
            r0 = r5
            q97.x1 r0 = (q97.x1) r0
            int r1 = r0.f243820w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L67
            int r1 = r1 - r2
            r0.f243820w = r1
            goto L6e
        L67:
            q97.x1 r0 = new q97.x1
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L6e:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243820w
            r3 = 1
            if (r2 == 0) goto L85
            if (r2 != r3) goto L7d
            yhm.o.b(r5)
            goto L9b
        L7d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L85:
            yhm.o.b(r5)
            com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination r5 = new com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination
            r2 = 0
            r5.<init>(r2)
            r0.f243820w = r3
            sha.c r2 = r4.d
            zha.d r2 = (zha.d) r2
            java.lang.Object r5 = r2.d(r5, r0)
            if (r5 != r1) goto L9b
            goto La2
        L9b:
            aii.u r5 = (aii.u) r5
            o97.d r1 = new o97.d
            r1.<init>(r5)
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.y1.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
