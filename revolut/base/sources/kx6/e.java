package kx6;

import et6.b1;
import gr6.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f190442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f190443b;

    public e(i freelancerCurrencyInteractor, b1 freelancerCustomersInteractor) {
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(freelancerCustomersInteractor, "freelancerCustomersInteractor");
        this.f190442a = freelancerCurrencyInteractor;
        this.f190443b = freelancerCustomersInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kx6.c
            if (r0 == 0) goto L13
            r0 = r7
            kx6.c r0 = (kx6.c) r0
            int r1 = r0.f190440x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190440x = r1
            goto L18
        L13:
            kx6.c r0 = new kx6.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190440x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r6 = r0.u
            yhm.o.b(r7)
            goto L4f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            gr6.i r7 = r5.f190442a
            et6.a1 r7 = (et6.a1) r7
            java.util.Set r2 = et6.a1.f129188c
            akg.n r7 = r7.c(r2)
            r2 = 3
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)
            r0.u = r6
            r0.f190440x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.util.Set r7 = (java.util.Set) r7
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig$CurrencyChooser r0 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig$CurrencyChooser
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = zhm.d0.d1(r7)
            java.lang.Integer r1 = new java.lang.Integer
            r2 = 4
            r1.<init>(r2)
            r0.<init>(r6, r7, r1, r2)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kx6.e.a(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kx6.d
            if (r0 == 0) goto L13
            r0 = r9
            kx6.d r0 = (kx6.d) r0
            int r1 = r0.f190441w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190441w = r1
            goto L18
        L13:
            kx6.d r0 = new kx6.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190441w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L4a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            et6.b1 r9 = r7.f190443b
            r2 = 0
            efm.r r8 = r9.b(r8, r2)
            r9 = 3
            java.lang.String r2 = "firstOrError(...)"
            r4 = 0
            efm.d0 r8 = prk.o.l(r8, r4, r4, r9, r2)
            r0.f190441w = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            com.revolut.feature.freelancer.common.models.FreelancerCustomer r9 = (com.revolut.feature.freelancer.common.models.FreelancerCustomer) r9
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$AddCustomerDestination r0 = new com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$AddCustomerDestination
            java.lang.String r1 = r9.f73281a
            java.lang.String r2 = r9.f73282b
            java.lang.String r3 = r9.f73283c
            java.lang.String r4 = r9.d
            java.lang.String r5 = r9.e
            com.revolut.feature.address.models.Address r6 = r9.f
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kx6.e.b(java.lang.String, gim.c):java.lang.Object");
    }
}
