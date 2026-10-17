package et0;

import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.content.NavBackStackEntry;
import androidx.content.NavController;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tax_residency.impl.v2.models.Exemption;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.sso.impl.ui.passcode.change_flow.ChangePasscodeFlowContract$Step;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import mx0.m4;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f129097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129098c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q0(Object obj2, Object obj3, boolean z, int i) {
        this.f129096a = i;
        this.f129098c = obj2;
        this.d = obj3;
        this.f129097b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f129096a;
        int i2 = 12;
        Continuation continuation = null;
        boolean z = this.f129097b;
        Object obj2 = this.d;
        Object obj3 = this.f129098c;
        switch (i) {
            case 0:
                r0 r0Var = (r0) obj3;
                Function0 function0 = (Function0) obj2;
                int i3 = r0.f129102n;
                r0Var.setVisibility(z ? 0 : 8);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 1:
                AirportLoungesPassListScreen airportLoungesPassListScreen = (AirportLoungesPassListScreen) obj3;
                airportLoungesPassListScreen.Q = true;
                airportLoungesPassListScreen.h3((gyi.k) obj2, z);
                return Unit.f186387a;
            case 2:
                j50.o oVar = (j50.o) obj3;
                UUID uuid = (UUID) obj2;
                if (!z) {
                    oVar.h3(uuid);
                }
                return Unit.f186387a;
            case 3:
                m4 m4Var = (m4) obj3;
                Function0 function02 = (Function0) obj2;
                m4.a aVar = m4.Companion;
                m4Var.setVisibility(z ? 0 : 8);
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.f186387a;
            case 4:
                return new AnalyticsContext(m72.b.h("transaction_running_balance_calculations_result", com.bumptech.glide.c.g(new l1.e(z, (String) obj3, (Long) obj2, 19)), AnalyticsContext.INSTANCE));
            case 5:
                return NavController.NavControllerNavigatorState.pop$lambda$0((NavController.NavControllerNavigatorState) obj3, (NavBackStackEntry) obj2, z);
            case 6:
                return vhi.c.c(new KompotPricingPlanFeatureConfig.SwitchToAnnualBillingFlow((hha.d) obj3, ((PricingPlanSubscription) obj2).f81142t != null, z), yhi.b.SOLID, null, false, 12);
            case 7:
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) obj3).L2((EsimProfile) obj2, z);
                return Unit.f186387a;
            case 8:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a.L2((com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) obj3, Boolean.valueOf(z), null, ((Exemption) obj2).f90164a, 2);
                return Unit.f186387a;
            case 9:
                return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$1$0(z, (DrawerState) obj3, (CoroutineScope) obj2);
            case 10:
                vge.x xVar = (vge.x) obj3;
                ProductAccountDescriptor$Value.Main main = (ProductAccountDescriptor$Value.Main) obj2;
                pfe.b bVarH = xVar.h(main.f89727a);
                ProductAccountId productAccountId = main.f89728b;
                Flow flowB = bVarH.b(productAccountId);
                vkm.h hVarS = flowB != null ? vkm.q.s(flowB, new vga.g(10), vkm.q.f290100b) : null;
                return hVarS != null ? vkm.q.Q(hVarS, new bbg.c0(continuation, xVar, z, 7)) : bVarH.j(productAccountId, z);
            case 11:
                TicketDetails ticketDetails = (TicketDetails) obj3;
                vse.d dVar = (vse.d) obj2;
                SectionContent.ProgressionSteps progressionSteps = ticketDetails.f90449c;
                return progressionSteps != null ? z9l.i.a(dVar.f291770a, progressionSteps, false, null, null, ticketDetails.f90447a, this.f129097b, 14) : zhm.f0.f322471a;
            default:
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar2 = (com.revolut.sso.impl.ui.passcode.change_flow.a) obj3;
                aVar2.H2(aVar2.f106600x, new xf0.h((String) obj2, i2));
                oki.h.t2(aVar2, aVar2.f106599w, ChangePasscodeFlowContract$Step.CreateNewPasscode.f106593a, false, z ? TransitionAnimation.SLIDE_START_TO_END.f98396a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ q0(Object obj2, boolean z, Object obj3, int i) {
        this.f129096a = i;
        this.f129098c = obj2;
        this.f129097b = z;
        this.d = obj3;
    }

    public /* synthetic */ q0(boolean z, Object obj2, Object obj3, int i) {
        this.f129096a = i;
        this.f129097b = z;
        this.f129098c = obj2;
        this.d = obj3;
    }
}
