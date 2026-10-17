package o1a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.splitbill.impl.ui_new.e f221368b;

    public /* synthetic */ c(com.revolut.feature.payments.splitbill.impl.ui_new.e eVar, int i) {
        this.f221367a = i;
        this.f221368b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f221367a
            switch(r0) {
                case 0: goto L86;
                default: goto L5;
            }
        L5:
            bp9.c r9 = (bp9.c) r9
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r9 instanceof bp9.b
            com.revolut.feature.payments.splitbill.impl.ui_new.e r2 = r8.f221368b
            if (r0 == 0) goto L76
            bp9.b r9 = (bp9.b) r9
            com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$InputData r0 = r2.f79858t
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration r0 = r0.f79834a
            boolean r1 = r0 instanceof com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithBills
            if (r1 == 0) goto L23
            r1 = r0
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration$WithBills r1 = (com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithBills) r1
            com.revolut.core.model.account.AccountId$Joint r1 = r1.e
        L21:
            r4 = r1
            goto L33
        L23:
            boolean r1 = r0 instanceof com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithContacts
            if (r1 == 0) goto L2d
            r1 = r0
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration$WithContacts r1 = (com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithContacts) r1
            com.revolut.core.model.account.AccountId$Joint r1 = r1.f79820b
            goto L21
        L2d:
            boolean r1 = r0 instanceof com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.Empty
            if (r1 == 0) goto L70
            r1 = 0
            goto L21
        L33:
            boolean r1 = r0 instanceof com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithContacts
            if (r1 == 0) goto L5b
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration$WithContacts r0 = (com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithContacts) r0
            java.util.List r0 = r0.f79819a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5b
            java.util.List r3 = r9.f17563a
            com.revolut.feature.payments.bills_chooser.api.common.SplitMethod r5 = r9.f17564b
            com.revolut.feature.payments.splitbill.impl.ui_new.d r1 = new com.revolut.feature.payments.splitbill.impl.ui_new.d
            r7 = 0
            r6 = r4
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            yi5.b r9 = new yi5.b
            r0 = 26
            r9.<init>(r0)
            r2.l2(r1, r9)
            goto L7d
        L5b:
            java.util.List r3 = r9.f17563a
            com.revolut.feature.payments.bills_chooser.api.common.SplitMethod r5 = r9.f17564b
            o1a.e r1 = new o1a.e
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            yi5.b r9 = new yi5.b
            r0 = 26
            r9.<init>(r0)
            r2.l2(r1, r9)
            goto L7d
        L70:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L76:
            boolean r9 = r9 instanceof bp9.a
            if (r9 == 0) goto L80
            r2.I2()
        L7d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L80:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L86:
            aii.q r9 = (aii.q) r9
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.revolut.feature.payments.splitbill.impl.ui_new.e r9 = r8.f221368b
            r9.I2()
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o1a.c.invoke(java.lang.Object):java.lang.Object");
    }
}
