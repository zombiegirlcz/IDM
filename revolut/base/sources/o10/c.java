package o10;

import android.content.Context;
import androidx.content.NavBackStackEntry;
import androidx.core.backported.fixes.SystemPropertyResolver;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.cache.SimpleCache;
import bgk.b;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.e2;
import com.revolut.core.ui_kit.delegates.widgets.i2;
import com.revolut.core.ui_kit.delegates.widgets.o0;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreen;
import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlow;
import com.revolut.feature.recurring_payments.api.RecurringPaymentApi$Toggles$PredictedSubscriptions;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutController;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreen;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.details.DetailsStepFragment;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.with_result_navigation.AddMoneyWithResultNavigationFlow;
import com.revolut.retail.feature.pda.impl.ui.intro.IntroPdaFragment;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import com.revolut.sso.impl.ui.auth.n;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheet;
import dw3.j9;
import dw3.v0;
import efm.r;
import j1a.j;
import java.io.File;
import java.util.ArrayList;
import jb3.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KProperty;
import o3g.i;
import o44.m;
import o69.g;
import o7e.h;
import o83.o;
import oo0.k;
import qlm.j1;
import vkm.c2;
import vkm.d2;
import vkm.q;
import z0g.n0;
import zhm.h0;
import zhm.p;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f221260b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f221259a = i;
        this.f221260b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj2;
        int i = 2;
        switch (this.f221259a) {
            case 0:
                return ((CarouselWithBottomSheetScreen) this.f221260b).getW();
            case 1:
                return (o1a.a) ((j) ((SplitBillsFlow) this.f221260b).Q.getValue()).e.get();
            case 2:
                return ((SystemPropertyResolver) this.f221260b).initAliases();
            case 3:
                TravelExperiencesDatesSelectionScreen travelExperiencesDatesSelectionScreen = (TravelExperiencesDatesSelectionScreen) this.f221260b;
                KProperty[] kPropertyArr = TravelExperiencesDatesSelectionScreen.S;
                n0 n0Var = (n0) travelExperiencesDatesSelectionScreen.Q.getValue();
                switch (n0Var.f318418a) {
                    case 0:
                        return (i) n0Var.d.get();
                    case 1:
                        return (i) n0Var.d.get();
                    default:
                        return (i) n0Var.d.get();
                }
            case 4:
                CreditAddressSearchScreen creditAddressSearchScreen = (CreditAddressSearchScreen) this.f221260b;
                KProperty[] kPropertyArr2 = CreditAddressSearchScreen.c0;
                return (m) ((v0) creditAddressSearchScreen.W.getValue()).f119964j.get();
            case 5:
                return NavBackStackEntry.savedStateHandle_delegate$lambda$0((NavBackStackEntry) this.f221260b);
            case 6:
                g gVar = (g) this.f221260b;
                r rVarSwitchMap = ue0.e.H(((z39.b) gVar.f222531c).f319221b.j(), h0.f322473a, new o5.b(27)).switchMap(new o5i.a(i, new o3k.a(gVar, 10)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return q.O(rd0.e.b(rVarSwitchMap), gVar.f222532g, c2.a(d2.Companion, 5000L, 2), new Data(null, null, true, 3, null));
            case 7:
                ((com.revolut.feature.apm.multibanco.impl.ui.a) this.f221260b).I2(null);
                return Unit.f186387a;
            case 8:
                BillAccountDetailScreen billAccountDetailScreen = (BillAccountDetailScreen) this.f221260b;
                KProperty[] kPropertyArr3 = BillAccountDetailScreen.f0;
                return (h) ((r6e.c) billAccountDetailScreen.Y.getValue()).i.get();
            case 9:
                return Boolean.valueOf(((jte.d) ((o) this.f221260b).f222930b).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c));
            case 10:
                return p.c((wi0.b[]) this.f221260b);
            case 11:
                IntroPdaFragment introPdaFragment = (IntroPdaFragment) this.f221260b;
                int i2 = IntroPdaFragment.g0;
                return (nak.a) l.q(introPdaFragment);
            case 12:
                return (ob6.a) ((pa6.e) ((CharityRecurringDonationFlow) this.f221260b).P.getValue()).e.get();
            case 13:
                PromotedMerchantCheckoutController promotedMerchantCheckoutController = (PromotedMerchantCheckoutController) this.f221260b;
                int i3 = PromotedMerchantCheckoutController.U;
                return (occ.b) ((jcc.a) promotedMerchantCheckoutController.S.getValue()).f172760c.get();
            case 14:
                return Boolean.valueOf(((jte.d) ((oee.c) this.f221260b).f224582a).c(CardsCoreApi$Toggles.PriorityDeliveryDateDisplaying.f65568c));
            case 15:
                DetailsStepFragment detailsStepFragment = (DetailsStepFragment) this.f221260b;
                KProperty[] kPropertyArr4 = DetailsStepFragment.j0;
                return v.k((LargeActionButtonDelegate) detailsStepFragment.g0.getValue(), (RowDelegate) detailsStepFragment.f89432h0.getValue());
            case 16:
                ((ohk.g) this.f221260b).o.k(b.a.f15209a);
                return Unit.f186387a;
            case 17:
                RequestConsentScreen requestConsentScreen = (RequestConsentScreen) this.f221260b;
                KProperty[] kPropertyArr5 = RequestConsentScreen.f68455b0;
                return (oi4.i) ((j9) requestConsentScreen.W.getValue()).f119063h.get();
            case 18:
                ((com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a) this.f221260b).J2(new til.o(3));
                return Unit.f186387a;
            case 19:
                ((hli.c) ((hli.a) this.f221260b)).b();
                return Unit.f186387a;
            case 20:
                return new GridBoxDelegate(u.c(((BasePricingPlanBEDrivenViewController) this.f221260b).Q), 8.0f, 8.0f, 3);
            case 21:
                ((n) this.f221260b).Z2(y0.b(jkl.i.BIO_SIGNATURE));
                return Unit.f186387a;
            case 22:
                olm.g gVar2 = (olm.g) this.f221260b;
                return Integer.valueOf(j1.c(gVar2, gVar2.k));
            case 23:
                k kVar = (k) this.f221260b;
                oo0.e eVar = oo0.e.f226974a;
                Context context = kVar.f226984a.getContext();
                Intrinsics.checkNotNullParameter(context, "context");
                SimpleCache simpleCache = oo0.e.f226975b;
                if (simpleCache != null) {
                    return simpleCache;
                }
                synchronized (eVar) {
                    SimpleCache simpleCache2 = oo0.e.f226975b;
                    if (simpleCache2 != null) {
                        return simpleCache2;
                    }
                    oo0.e.f226975b = new SimpleCache(new File(context.getCacheDir(), "audio"), new lx0.e(SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE, oo0.e.f226976c), new StandaloneDatabaseProvider(context));
                    Unit unit = Unit.f186387a;
                    SimpleCache simpleCache3 = oo0.e.f226975b;
                    Intrinsics.h(simpleCache3);
                    return simpleCache3;
                }
            case 24:
                com.revolut.core.ui_kit.delegates.widgets.m mVar = (com.revolut.core.ui_kit.delegates.widgets.m) this.f221260b;
                s0 s0Var = new s0(6);
                s0Var.a(mVar.f55421j);
                s0Var.a(mVar.k);
                s0Var.a(new ListSubheaderLoadingDelegate());
                s0Var.a(new BaseDynamicWidgetDelegate.BigHeaderLoadingDelegate());
                s0Var.a(mVar.f55422l);
                s0Var.b(mVar.H().toArray(new koi.k[0]));
                ArrayList arrayList = s0Var.f186433a;
                return new z4l.j(7, v.k(arrayList.toArray(new koi.k[arrayList.size()])), false);
            case 25:
                koi.j jVar = ((o0) this.f221260b).e;
                obj2 = jVar instanceof ContainerWidgetDelegate.Model ? (ContainerWidgetDelegate.Model) jVar : null;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalStateException("Item must be bound");
            case 26:
                koi.j jVar2 = ((e2) this.f221260b).e;
                obj2 = jVar2 instanceof GridWidgetDelegate.Model ? (GridWidgetDelegate.Model) jVar2 : null;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalStateException("Item must be bound");
            case 27:
                koi.j jVar3 = ((i2) this.f221260b).e;
                obj2 = jVar3 instanceof HorizontalScrollerWidgetDelegate.Model ? (HorizontalScrollerWidgetDelegate.Model) jVar3 : null;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalStateException("Item must be bound");
            case 28:
                ConnectedClientDisconnectBottomSheet connectedClientDisconnectBottomSheet = (ConnectedClientDisconnectBottomSheet) this.f221260b;
                int i5 = ConnectedClientDisconnectBottomSheet.T;
                return (opl.d) ((mjl.g) connectedClientDisconnectBottomSheet.Q.getValue()).f206082b.get();
            default:
                return (oqg.b) ((wpg.e) ((AddMoneyWithResultNavigationFlow) this.f221260b).P.getValue()).f299255c.get();
        }
    }
}
