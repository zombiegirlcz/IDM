package com.revolut.feature.subaccount.impl.ui.edit.billl.flow;

import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$Step;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreen;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import d34.b;
import d8e.c;
import d8e.d;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BillsEditFlowContract$InputData f89062t;
    public final g6e.d u;
    public final xua.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g6e.g f89063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j60.a f89064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BillsEditFlowContract$Step.BillsSelector f89065y;
    public final BillsEditFlowContract$State z;

    public a(BillsEditFlowContract$InputData inputData, g6e.d subaccountInteractor, xua.a recurringPaymentInteractor, g6e.g subaccountsNavigationProvider, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f89062t = inputData;
        this.u = subaccountInteractor;
        this.v = recurringPaymentInteractor;
        this.f89063w = subaccountsNavigationProvider;
        this.f89064x = bottomExpandableDialogControllerExtension;
        this.f89065y = BillsEditFlowContract$Step.BillsSelector.f89061a;
        this.z = BillsEditFlowContract$State.f89060a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r5.Q2(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof d8e.e
            if (r0 == 0) goto L13
            r0 = r6
            d8e.e r0 = (d8e.e) r0
            int r1 = r0.f112224x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112224x = r1
            goto L18
        L13:
            d8e.e r0 = new d8e.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112224x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L62
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.String r2 = r0.u
            yhm.o.b(r6)
            goto L4e
        L38:
            yhm.o.b(r6)
            com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$InputData r6 = r5.f89062t
            java.lang.String r2 = r6.f89059a
            g6e.d r6 = r5.u
            r0.u = r2
            r0.f112224x = r4
            s6e.z r6 = (s6e.z) r6
            java.lang.Object r6 = r6.l(r2, r0)
            if (r6 != r1) goto L4e
            goto L61
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4 = 0
            if (r6 == 0) goto L65
            r0.u = r4
            r0.f112224x = r3
            java.lang.Object r5 = r5.Q2(r2, r0)
            if (r5 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L65:
            r5.s1()
            j60.a r6 = r5.f89064x
            r0 = 0
            r1 = 3
            j60.a.v(r6, r0, r4, r1)
            r5.I2()
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a.O2(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a.P2(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(java.lang.String r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof d8e.g
            if (r0 == 0) goto L13
            r0 = r14
            d8e.g r0 = (d8e.g) r0
            int r1 = r0.f112226w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112226w = r1
            goto L18
        L13:
            d8e.g r0 = new d8e.g
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112226w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r14)
            goto L4f
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            yhm.o.b(r14)
            xua.a r14 = r12.v
            yua.q r14 = (yua.q) r14
            sfm.b r13 = r14.r(r13)
            d7j.o0 r14 = new d7j.o0
            r2 = 11
            r14.<init>(r2)
            efm.r r13 = m70.a.g(r13, r4, r14, r3)
            r0.f112226w = r3
            java.lang.Object r14 = nim.a.e(r13, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L5a
            java.lang.Object r13 = zhm.d0.d0(r14)
            qua.p r13 = (qua.p) r13
            goto L5b
        L5a:
            r13 = r4
        L5b:
            r14 = 14
            if (r13 == 0) goto L85
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_alert_update_recurring_title
            r5.<init>(r13, r4, r4, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_alert_update_recurring_message
            r6.<init>(r13, r4, r4, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_common_action_continue
            r8.<init>(r13, r4, r4, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_common_action_skip
            r7.<init>(r13, r4, r4, r14)
            r10 = 0
            r11 = 32
            java.lang.String r9 = "ON_TRACKING_DIALOG_LIST_ID"
            rp0.y r13 = q7e.a.a(r5, r6, r7, r8, r9, r10, r11)
            goto Laa
        L85:
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_alert_set_recurring_title
            r0.<init>(r13, r4, r4, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_alert_set_recurring_message
            r1.<init>(r13, r4, r4, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_common_action_continue
            r3.<init>(r13, r4, r4, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.subaccount.impl.R$string.bill_accounts_common_action_skip
            r2.<init>(r13, r4, r4, r14)
            r5 = 0
            r6 = 32
            java.lang.String r4 = "ON_TRACKING_DIALOG_LIST_ID"
            rp0.y r13 = q7e.a.a(r0, r1, r2, r3, r4, r5, r6)
        Laa:
            j60.a r14 = r12.f89064x
            r14.x(r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a.Q2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BillsEditFlowContract$Step step = (BillsEditFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof BillsEditFlowContract$Step.BillsSelector)) {
            throw new NoWhenBranchMatchedException();
        }
        BillSelectorScreen billSelectorScreen = new BillSelectorScreen(new BillSelectorScreenContract$InputData(this.f89062t.f89059a));
        b bVar = new b(this, 21);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        billSelectorScreen.H = bVar;
        return billSelectorScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f89065y;
    }
}
