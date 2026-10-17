package elf;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mq9.f f127352l;

    public j0(mq9.f groupsInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        this.f127352l = groupsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(oq9.j r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof elf.i0
            if (r0 == 0) goto L13
            r0 = r6
            elf.i0 r0 = (elf.i0) r0
            int r1 = r0.f127348x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127348x = r1
            goto L18
        L13:
            elf.i0 r0 = new elf.i0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127348x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oq9.j r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = r5.f227832c
            mq9.f r2 = r4.f127352l
            mr9.a r2 = (mr9.a) r2
            efm.d0 r6 = r2.d(r6)
            r0.u = r5
            r0.f127348x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.feature.payments.groups.api.models.PaymentGroup r6 = (com.revolut.feature.payments.groups.api.models.PaymentGroup) r6
            com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig$GroupBillDetails r0 = new com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig$GroupBillDetails
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.String r5 = r5.f227831b
            r0.<init>(r6, r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.c(r0)
            r4.A2(r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.j0.Z2(oq9.j, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "ID_PAYMENTS_GROUPS_GO_TO_GROUP_ITEM")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.payments.groups.api.models.PaymentGroup");
            A2(zh9.u0.c(new PaymentsGroupsRedesignFeatureConfig.GroupDetails((PaymentGroup) obj2, false)));
            z = true;
        } else if (obj2 instanceof oq9.j) {
            return Z2((oq9.j) obj2, (gim.c) continuation);
        }
        return Boolean.valueOf(z);
    }
}
