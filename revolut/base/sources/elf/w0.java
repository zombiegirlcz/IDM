package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c9e.c f127427l;

    public w0(c9e.c subscriptionNavigationProvider) {
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        this.f127427l = subscriptionNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.Object r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof elf.v0
            if (r0 == 0) goto L13
            r0 = r6
            elf.v0 r0 = (elf.v0) r0
            int r1 = r0.f127421x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127421x = r1
            goto L18
        L13:
            elf.v0 r0 = new elf.v0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127421x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            elf.w0 r5 = r0.u
            yhm.o.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            qua.p r5 = (qua.p) r5
            r6 = 0
            c9e.c r2 = r4.f127427l
            rae.c r2 = (rae.c) r2
            efm.d0 r5 = r2.c(r5, r6)
            r0.u = r4
            r0.f127421x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.A2(r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.w0.Z2(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_GO_TO_SUBSCRIPTION_DETAILS") ? Z2(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
