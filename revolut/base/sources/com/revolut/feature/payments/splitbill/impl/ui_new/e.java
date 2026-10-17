package com.revolut.feature.payments.splitbill.impl.ui_new;

import ang.f;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillFlowInputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.SplitBillsSummaryFlow;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$InputData;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$Step;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.create.PaymentsGroupsCreateFlow;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nvg.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends g implements o1a.a {

    @NotNull
    public static final o1a.d Companion = new o1a.d();
    public final r1a.e A;
    public final SplitBillsFlowContract$Step.InitFlow B;
    public final SplitBillsFlowContract$State C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SplitBillsFlowContract$InputData f79858t;
    public final kp9.a u;
    public final ln3.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.feature.payments.groups.api.navigation.a f79859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o1a.b f79860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cl3.a f79861y;
    public final f z;

    public e(SplitBillsFlowContract$InputData inputData, kp9.a billsChooserNavigationScreenProvider, ln3.b contactsChooserNavigationScreenProvider, com.revolut.feature.payments.groups.api.navigation.a groupBillsNavigationScreenProvider, o1a.b splitBillsInteractor, cl3.a contactsInteractor, f userInteractor, r1a.e splitBillLinkContextHandlerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billsChooserNavigationScreenProvider, "billsChooserNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(groupBillsNavigationScreenProvider, "groupBillsNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(splitBillsInteractor, "splitBillsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(splitBillLinkContextHandlerProvider, "splitBillLinkContextHandlerProvider");
        this.f79858t = inputData;
        this.u = billsChooserNavigationScreenProvider;
        this.v = contactsChooserNavigationScreenProvider;
        this.f79859w = groupBillsNavigationScreenProvider;
        this.f79860x = splitBillsInteractor;
        this.f79861y = contactsInteractor;
        this.z = userInteractor;
        this.A = splitBillLinkContextHandlerProvider;
        this.B = SplitBillsFlowContract$Step.InitFlow.f79842a;
        this.C = SplitBillsFlowContract$State.f79836a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[LOOP:0: B:22:0x0051->B:24:0x0057, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.navigable.a O2() {
        /*
            r6 = this;
            zhm.f0 r0 = zhm.f0.f322471a
            com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$InputData r1 = r6.f79858t
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration r1 = r1.f79834a
            boolean r2 = r1 instanceof com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithContacts
            r3 = 0
            if (r2 == 0) goto Le
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration$WithContacts r1 = (com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration.WithContacts) r1
            goto Lf
        Le:
            r1 = r3
        Lf:
            com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig$DisallowAll r2 = com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig.DisallowAll.f79193a
            if (r1 == 0) goto L72
            java.util.List r1 = r1.f79819a
            if (r1 == 0) goto L72
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L27
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L27
            goto L42
        L27:
            java.util.Iterator r4 = r1.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r4.next()
            zm3.a r5 = (zm3.a) r5
            java.lang.String r5 = hx7.q.s(r5)
            int r5 = r5.length()
            if (r5 != 0) goto L2b
            goto L72
        L42:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L51:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r1.next()
            zm3.a r4 = (zm3.a) r4
            java.lang.String r4 = hx7.q.s(r4)
            wi0.b r4 = com.bumptech.glide.d.c(r4)
            r2.add(r4)
            goto L51
        L69:
            java.util.Set r1 = zhm.d0.i1(r2)
            com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig$AllowOnlyForCountries r2 = new com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig$AllowOnlyForCountries
            r2.<init>(r1)
        L72:
            com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData r1 = new com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData
            r4 = 1
            r1.<init>(r4, r0, r3, r2)
            kp9.a r0 = r6.u
            r0.getClass()
            java.lang.String r0 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen r0 = new com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen
            r0.<init>(r1)
            o1a.c r1 = new o1a.c
            r2 = 1
            r1.<init>(r6, r2)
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r0.H = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.splitbill.impl.ui_new.e.O2():com.revolut.kompot.navigable.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen P2(com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step.SelectContacts r26) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.splitbill.impl.ui_new.e.P2(com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step$SelectContacts):com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SplitBillsFlowContract$Step step = (SplitBillsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SplitBillsFlowContract$Step.InitFlow) {
            SplitBillConfiguration splitBillConfiguration = this.f79858t.f79834a;
            if (!(splitBillConfiguration instanceof SplitBillConfiguration.Empty) && !(splitBillConfiguration instanceof SplitBillConfiguration.WithContacts)) {
                if (!(splitBillConfiguration instanceof SplitBillConfiguration.WithBills)) {
                    throw new NoWhenBranchMatchedException();
                }
                SplitBillConfiguration.WithBills withBills = (SplitBillConfiguration.WithBills) splitBillConfiguration;
                return P2(new SplitBillsFlowContract$Step.SelectContacts(withBills.f79816a, withBills.f79817b, withBills.f79818c, withBills.d, withBills.e, SplitMethod.Multiple.f79178a));
            }
            return O2();
        }
        if (step instanceof SplitBillsFlowContract$Step.SelectContacts) {
            return P2((SplitBillsFlowContract$Step.SelectContacts) step);
        }
        boolean z = step instanceof SplitBillsFlowContract$Step.CreateGroup;
        com.revolut.feature.payments.groups.api.navigation.a aVar = this.f79859w;
        if (z) {
            SplitBillsFlowContract$Step.CreateGroup createGroup = (SplitBillsFlowContract$Step.CreateGroup) step;
            PaymentsGroupsCreateNavigationFlow$InputData inputData = new PaymentsGroupsCreateNavigationFlow$InputData(createGroup.f79837a, PaymentsGroupsCreateNavigationFlow$Step.Customize.f79296a, rq9.c.RESULT);
            ((zr9.b) aVar).getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            PaymentsGroupsCreateFlow paymentsGroupsCreateFlow = new PaymentsGroupsCreateFlow(inputData);
            b0 b0Var = new b0(this, createGroup, 18);
            Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
            paymentsGroupsCreateFlow.J = b0Var;
            return paymentsGroupsCreateFlow;
        }
        if (step instanceof SplitBillsFlowContract$Step.Group) {
            SplitBillsFlowContract$Step.Group group = (SplitBillsFlowContract$Step.Group) step;
            PaymentsGroupsRedesignFeatureConfig.BillSplit featureConfig = new PaymentsGroupsRedesignFeatureConfig.BillSplit(group.f79841c, group.f79840b.f79216a, group.f79839a);
            ((zr9.b) aVar).getClass();
            Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
            PaymentsGroupsBillsSplitFlow paymentsGroupsBillsSplitFlow = new PaymentsGroupsBillsSplitFlow(new PaymentsGroupsBillsSplitFlowContract$InputData(featureConfig.f79301g, featureConfig.f79302h, featureConfig.i));
            o1a.c cVar = new o1a.c(this, 0);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            paymentsGroupsBillsSplitFlow.J = cVar;
            return paymentsGroupsBillsSplitFlow;
        }
        if (!(step instanceof SplitBillsFlowContract$Step.SplitSummary)) {
            throw new NoWhenBranchMatchedException();
        }
        SplitBillsFlowContract$Step.SplitSummary splitSummary = (SplitBillsFlowContract$Step.SplitSummary) step;
        SplitBillFlowInputData inputData2 = new SplitBillFlowInputData(splitSummary.f79847b, splitSummary.f79846a, splitSummary.f79848c);
        this.u.getClass();
        Intrinsics.checkNotNullParameter(inputData2, "inputData");
        SplitBillsSummaryFlow splitBillsSummaryFlow = new SplitBillsSummaryFlow(inputData2);
        b0 b0Var2 = new b0(splitSummary, this, 20);
        Intrinsics.checkNotNullParameter(b0Var2, "<set-?>");
        splitBillsSummaryFlow.J = b0Var2;
        return splitBillsSummaryFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.C;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.B;
    }
}
