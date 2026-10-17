package q97;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class f2 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final et6.h3 f243689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sha.c f243690c;
    public final p97.b d;
    public final cs6.c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(t97.c productCellProvider, et6.h3 freelancerSaleTypeAvailabilityInteractor, sha.c proOnboardingCommandFactory, t97.d id10, cs6.c saleType) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        this.f243689b = freelancerSaleTypeAvailabilityInteractor;
        this.f243690c = proOnboardingCommandFactory;
        this.d = id10;
        this.e = saleType;
    }

    @Override // r97.b
    public final Flow d() {
        return new vkm.v1(new prl.k(this, null, 24));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q97.e2
            if (r0 == 0) goto L13
            r0 = r6
            q97.e2 r0 = (q97.e2) r0
            int r1 = r0.f243681w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243681w = r1
            goto L1a
        L13:
            q97.e2 r0 = new q97.e2
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243681w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$NewSale r6 = new com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$NewSale
            cs6.c r2 = r5.e
            r4 = 0
            r6.<init>(r2, r4)
            r0.f243681w = r3
            sha.c r2 = r5.f243690c
            zha.d r2 = (zha.d) r2
            java.lang.Object r6 = r2.d(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            aii.u r6 = (aii.u) r6
            o97.d r0 = new o97.d
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.f2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
