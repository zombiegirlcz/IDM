package com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow;

import ack.f;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements ah9.b {
    public final BillsCatalogueFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f78751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ep1.b f78752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wo1.b f78753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final im1.a f78754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f78755t;

    public b(BillsCatalogueFlowContract$InputData inputData, gte.a featureToggleInteractor, ep1.b billsDialogProvider, wo1.b billsInteractor, im1.a billersInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(billsDialogProvider, "billsDialogProvider");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(billersInteractor, "billersInteractor");
        this.o = inputData;
        this.f78751p = featureToggleInteractor;
        this.f78752q = billsDialogProvider;
        this.f78753r = billsInteractor;
        this.f78754s = billersInteractor;
        this.f78755t = d.a(this, new f(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b r20, java.lang.String r21, gim.c r22) {
        /*
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof ah9.g
            if (r2 == 0) goto L18
            r2 = r1
            ah9.g r2 = (ah9.g) r2
            int r3 = r2.f4915w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f4915w = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ah9.g r2 = new ah9.g
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f4915w
            r4 = 1
            r9 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r1)
            goto L75
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            yhm.o.b(r1)
            nii.c0 r10 = new nii.c0
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_mx_search_loading_title
            r3 = 14
            r11.<init>(r1, r9, r9, r3)
            r18 = 0
            r19 = 2046(0x7fe, float:2.867E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            a3b.h r5 = new a3b.h
            r1 = 2
            r5.<init>(r0, r1)
            ack.n r6 = new ack.n
            r1 = 1
            r6.<init>(r1)
            a41.s r7 = new a41.s
            r1 = 5
            r3 = r21
            r7.<init>(r0, r3, r9, r1)
            r8.f4915w = r4
            tji.f r3 = r0.X()
            r4 = r10
            java.lang.Object r1 = n14.k.P(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L75
            return r2
        L75:
            nii.e r1 = (nii.e) r1
            boolean r0 = r1 instanceof nii.d
            if (r0 == 0) goto La5
            nii.d r1 = (nii.d) r1
            java.lang.Object r0 = r1.f216133a
            ah9.f r0 = (ah9.f) r0
            boolean r1 = r0 instanceof ah9.e
            if (r1 == 0) goto L8f
            com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$Step$Bill r1 = new com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$Step$Bill
            ah9.e r0 = (ah9.e) r0
            com.revolut.feature.apm.bills.billers.api.model.Biller r0 = r0.f4914a
            r1.<init>(r0)
            return r1
        L8f:
            boolean r1 = r0 instanceof ah9.d
            if (r1 == 0) goto L9f
            com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$Step$Transfer r1 = new com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$Step$Transfer
            ah9.d r0 = (ah9.d) r0
            com.revolut.feature.apm.bills.billers.api.model.Biller r2 = r0.f4912a
            com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult r0 = r0.f4913b
            r1.<init>(r2, r0)
            return r1
        L9f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b.I2(com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78755t;
    }
}
