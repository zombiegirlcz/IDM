package c7e;

import c69.v;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import com.revolut.feature.subaccount.api.BillAccountDetailDestination;
import com.revolut.feature.subaccount.api.ManageBillAccountDestination;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.bills_widget.ManageBillsData;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f21937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lqk.d f21938n;
    public final g6e.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c9e.c f21939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g6e.d f21940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w5i.b f21941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x6e.d f21942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ua7.f f21943t;
    public final y8k.b u;

    public g(n actionsHandler, lqk.d membersWidgetActionExtension, g6e.g subaccountsNavigationProvider, c9e.c subscriptionNaviProvider, g6e.d subaccountInteractor, w5i.b moveMoneyAccountEligibilityChecker, x6e.d subaccountEventProvider, ua7.f hiddenAccountsActionsExtension, y8k.b peerToPeerFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(membersWidgetActionExtension, "membersWidgetActionExtension");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(subscriptionNaviProvider, "subscriptionNaviProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountEligibilityChecker, "moveMoneyAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        this.f21937m = actionsHandler;
        this.f21938n = membersWidgetActionExtension;
        this.o = subaccountsNavigationProvider;
        this.f21939p = subscriptionNaviProvider;
        this.f21940q = subaccountInteractor;
        this.f21941r = moveMoneyAccountEligibilityChecker;
        this.f21942s = subaccountEventProvider;
        this.f21943t = hiddenAccountsActionsExtension;
        this.u = peerToPeerFeatureConfigProvider;
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, rd0.e.b(this.f21942s.f303064a), null, new f(this, null), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        yji.n[] elements = {this.f21937m, this.f21938n, this.f21943t};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x035a, code lost:
    
        if (d3((hpg.j) r12, r1, r3) == r4) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04b3, code lost:
    
        if (r1 != r4) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04cd, code lost:
    
        if (c3(r2, r9, r3) == r4) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0536, code lost:
    
        if (c3(r2, r9, r3) == r4) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r1 == r4) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r5.Y2(r3, new ah1.m((com.revolut.feature.subaccount.api.models.Subaccount) r1, r5, r6, 6)) == r4) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        if (r5.Y2(r3, new c7e.k(r5, (com.revolut.feature.subaccount.api.models.Subaccount) r1, null)) == r4) goto L266;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027c  */
    /* JADX WARN: Type inference failed for: r23v0, types: [c7e.g, yji.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$VatReminder] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7e.g.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c3(ProductAccountId productAccountId, BaseDraggableWidgetDelegate.a aVar, d dVar) {
        Object objD3;
        if (!(aVar instanceof i3)) {
            return Unit.f186387a;
        }
        Object obj2 = ((i3) aVar).f55382c.u;
        hpg.j jVar = obj2 instanceof hpg.j ? (hpg.j) obj2 : null;
        return (jVar != null && (objD3 = d3(jVar, productAccountId, dVar)) == fim.a.COROUTINE_SUSPENDED) ? objD3 : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x027e, code lost:
    
        if (r3.Z2(r1, r4) == r5) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(hpg.j r26, com.revolut.feature.tab.accounts.models.ProductAccountId r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7e.g.d3(hpg.j, com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    public final void e3(Object obj2, String str, String accountId) {
        boolean z = obj2 instanceof p;
        n nVar = this.f21937m;
        if (z) {
            p payment = (p) obj2;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            j60.a aVar = nVar.f21965l;
            nVar.f21967n.getClass();
            aVar.x(o7e.n.a(payment, accountId));
            return;
        }
        if (obj2 instanceof ManageBillsData) {
            ManageBillsData billsData = (ManageBillsData) obj2;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(billsData, "billsData");
            nVar.A2(new ManageBillAccountDestination(billsData.f98694a));
            return;
        }
        if (Intrinsics.f(str, "LIST_ID_BILLS_WIDGET_SEE_ALL")) {
            nVar.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            nVar.A2(new BillAccountDetailDestination(accountId));
        }
    }

    public final void f3(FreelancerWidgetClickData.TaxHub taxHub) {
        if (taxHub instanceof FreelancerWidgetClickData.TaxHub.CalendarEvent) {
            TaxHubCalendarEvent taxHubCalendarEvent = ((FreelancerWidgetClickData.TaxHub.CalendarEvent) taxHub).f74460a;
            A2(new FreelancerBizFeatureConfig.TaxHub(new FreelancerBizFeatureConfig.TaxHub.InitialStep.Assessment(taxHubCalendarEvent.f73484b, taxHubCalendarEvent.f73483a)));
        } else if (taxHub instanceof FreelancerWidgetClickData.TaxHub.C0496TaxHub) {
            A2(new FreelancerBizFeatureConfig.TaxHub(0));
        } else {
            if (!(taxHub instanceof FreelancerWidgetClickData.TaxHub.TaxProfile)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new FreelancerBizFeatureConfig.TaxHub(new FreelancerBizFeatureConfig.TaxHub.InitialStep.TaxProfile(((FreelancerWidgetClickData.TaxHub.TaxProfile) taxHub).f74462a)));
        }
    }

    public final void g3(FreelancerWidgetClickData.VatReminder vatReminder) {
        boolean z = vatReminder instanceof FreelancerWidgetClickData.VatReminder.SetUpTaxSorter;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            N2(o2(hr6.e.f154777a), bottom_dialog, new v(this, 4));
            return;
        }
        if (vatReminder.equals(FreelancerWidgetClickData.VatReminder.TaxHub.f74481a)) {
            A2(new FreelancerBizFeatureConfig.TaxHub(0));
            return;
        }
        if (vatReminder instanceof FreelancerWidgetClickData.VatReminder.VatSummary) {
            FreelancerWidgetClickData.VatReminder.VatSummary vatSummary = (FreelancerWidgetClickData.VatReminder.VatSummary) vatReminder;
            yji.n.P2(this, o2(new hr6.j(vatSummary.f74482a, vatSummary.f74483b)), bottom_dialog, null, 2);
        } else {
            if (vatReminder.equals(FreelancerWidgetClickData.VatReminder.CreateVatProfile.f74478a)) {
                A2(new FreelancerBizFeatureConfig.TaxProfile(ds6.j.VAT, null));
                return;
            }
            if (!(vatReminder instanceof FreelancerWidgetClickData.VatReminder.NotificationToggle)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerO2 = o2(new hr6.i(((FreelancerWidgetClickData.VatReminder.NotificationToggle) vatReminder).f74479a));
            byc.a block = new byc.a(this, vatReminder, 29);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerO2.H = block;
            yji.n.P2(this, viewControllerO2, bottom_dialog, null, 2);
        }
    }
}
