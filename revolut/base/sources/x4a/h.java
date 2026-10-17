package x4a;

import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import cu8.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends n implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecipientSelectionInputData f302836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f302837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x2k.e f302838n;
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rq9.a f302839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oy1.b f302840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hfe.a f302841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final un9.a f302842s;

    public h(RecipientSelectionInputData inputData, r0 kycTransformer, x2k.e bankTransferNaviCommandProvider, c recipientSelectionFeatureConfigProvider, rq9.a groupBillsNaviCommandProvider, oy1.b apmNavigationProvider, hfe.a suspiciousRecipientActionTransformer, un9.a counterpartyNavigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(bankTransferNaviCommandProvider, "bankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(recipientSelectionFeatureConfigProvider, "recipientSelectionFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(suspiciousRecipientActionTransformer, "suspiciousRecipientActionTransformer");
        Intrinsics.checkNotNullParameter(counterpartyNavigationProvider, "counterpartyNavigationProvider");
        this.f302836l = inputData;
        this.f302837m = kycTransformer;
        this.f302838n = bankTransferNaviCommandProvider;
        this.o = recipientSelectionFeatureConfigProvider;
        this.f302839p = groupBillsNaviCommandProvider;
        this.f302840q = apmNavigationProvider;
        this.f302841r = suspiciousRecipientActionTransformer;
        this.f302842s = counterpartyNavigationProvider;
    }

    public static m1l.a c3(RecipientSelectionType.Transfer transfer) {
        int i = e.f302831a[transfer.f80022b.ordinal()];
        if (i == 1 || i == 2) {
            return m1l.a.SCHEDULE_ENABLED;
        }
        if (i == 3) {
            return m1l.a.SCHEDULE_REQUIRED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType.Transfer r5, jq9.y r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x4a.f
            if (r0 == 0) goto L13
            r0 = r7
            x4a.f r0 = (x4a.f) r0
            int r1 = r0.f302833x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302833x = r1
            goto L18
        L13:
            x4a.f r0 = new x4a.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302833x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x4a.h r5 = r0.u
            yhm.o.b(r7)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r4
            r0.f302833x = r3
            x4a.c r7 = r4.o
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            com.revolut.retail.core.navigation.feature.FeatureConfig r7 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r7)
            r5.A2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4a.h.Z2(com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType$Transfer, jq9.y, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(jq9.b0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x4a.g
            if (r0 == 0) goto L13
            r0 = r6
            x4a.g r0 = (x4a.g) r0
            int r1 = r0.f302835x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302835x = r1
            goto L18
        L13:
            x4a.g r0 = new x4a.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302835x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x4a.h r5 = r0.u
            yhm.o.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            com.revolut.feature.payments.groups.api.models.PaymentGroup r5 = r5.f177496a
            java.lang.String r5 = r5.f79285a
            rq9.a r6 = r4.f302839p
            zr9.a r6 = (zr9.a) r6
            ufm.i r5 = r6.e(r5)
            r0.u = r4
            r0.f302835x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.A2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4a.h.b3(jq9.b0, gim.c):java.lang.Object");
    }
}
