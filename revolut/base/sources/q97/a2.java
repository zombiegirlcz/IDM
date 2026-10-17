package q97;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class a2 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.e f243647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.v f243648c;
    public final sha.c d;
    public final t97.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(t97.c productCellProvider, gr6.e freelancerAvailabilityInteractor, r10.v freelancerSaleChannelAvailabilityInteractor, sha.c proOnboardingCommandFactory) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleChannelAvailabilityInteractor, "freelancerSaleChannelAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        this.f243647b = freelancerAvailabilityInteractor;
        this.f243648c = freelancerSaleChannelAvailabilityInteractor;
        this.d = proOnboardingCommandFactory;
        this.e = t97.d.PRO_PLUGINS;
    }

    @Override // r97.b
    public final Flow d() {
        return new vkm.v1(new l10.m(this, (Continuation) null, 12));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.e;
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
            boolean r0 = r5 instanceof q97.z1
            if (r0 == 0) goto L13
            r0 = r5
            q97.z1 r0 = (q97.z1) r0
            int r1 = r0.f243834w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243834w = r1
            goto L1a
        L13:
            q97.z1 r0 = new q97.z1
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243834w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f243834w = r3
            sha.c r5 = r4.d
            zha.d r5 = (zha.d) r5
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$ManageEcommercePlugin r2 = com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a
            java.lang.Object r5 = r5.d(r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            aii.u r5 = (aii.u) r5
            o97.d r0 = new o97.d
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.a2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
