package fp3;

import a08.o0;
import a08.p0;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import ap3.e;
import com.google.gson.reflect.TypeToken;
import com.revolut.chat.ui.agentinfo.AgentInfoScreen;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.PaymentsBreakdownController;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlow;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyActivity;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyContract$Configuration;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select.CryptoCommodityBuyCollectionSelectCryptoScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreen;
import com.revolut.feature.joint.impl.ui.phone_confirmation.JointContactPhoneConfirmationScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import com.revolut.feature.selfserve.sow.impl.ui.status.SowStatusFragment;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingActivity;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingContract$Configuration;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlow;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import fa9.c;
import fq3.j;
import fq7.f;
import ft4.w;
import ft9.i;
import fu8.t;
import fu8.u;
import fu8.v;
import fwf.h;
import fx5.g;
import g2g.n;
import hvf.s;
import java.lang.reflect.Type;
import jb3.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kr9.r;
import mw5.k;
import ql7.i0;
import rp0.k1;
import zrk.d;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f137045b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f137044a = i;
        this.f137045b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f137044a;
        int i2 = 14;
        Object obj2 = this.f137045b;
        switch (i) {
            case 0:
                return (b) ((e) ((CorporateEventsHomeFlow) obj2).P.getValue()).d.get();
            case 1:
                BaseProfileCardScreen baseProfileCardScreen = (BaseProfileCardScreen) obj2;
                return n14.e.a(baseProfileCardScreen, baseProfileCardScreen.d3());
            case 2:
                int i3 = CreditApplicationCloseLegacyActivity.f66215v0;
                return ((CreditApplicationCloseLegacyContract$Configuration) ((CreditApplicationCloseLegacyActivity) obj2).G0()).f66218a;
            case 3:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((j) obj2).i);
                return Unit.f186387a;
            case 4:
                KProperty[] kPropertyArr = ClaimsScreen.f75650b0;
                return (f) ((i0) ((ClaimsScreen) obj2).X.getValue()).f247331c.get();
            case 5:
                StockFinancialsStatementFragment stockFinancialsStatementFragment = (StockFinancialsStatementFragment) obj2;
                int i5 = StockFinancialsStatementFragment.f103802k0;
                return new d(((zrk.e) ((dsk.a) l.q(stockFinancialsStatementFragment))).d, new o0h.b(), (StockFinancialsStatementContract$Configuration) stockFinancialsStatementFragment.A());
            case 6:
                KProperty[] kPropertyArr2 = GroupDetailsSettlementScreen.f0;
                r rVar = (r) ((GroupDetailsSettlementScreen) obj2).f79416b0.getValue();
                switch (rVar.f188791a) {
                    case 0:
                        return (i) rVar.d.get();
                    default:
                        return (i) rVar.d.get();
                }
            case 7:
                ((k1) ((com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) obj2).u).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "COPY_TO_CLIPBOARD_SHOT_ID", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, null, 60));
                return Unit.f186387a;
            case 8:
                v vVar = (v) obj2;
                efm.r rVarN = vVar.N();
                Intrinsics.checkNotNullExpressionValue(rVarN, "observeBehavior(...)");
                efm.b bVarFlatMapCompletable = mo3.a.t(rVarN, vVar.f138141m).flatMapCompletable(new fs5.d(i2, new w(12)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                p0 p0Var = new p0(13, new c(new BreadcrumbException(), 26));
                bVarFlatMapCompletable.getClass();
                pfm.a aVar = new pfm.a(bVarFlatMapCompletable, p0Var, 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar.w(new o0(16, u.f138137a), t.f138136a), "subscribe(...)");
                return Unit.f186387a;
            case 9:
                KProperty[] kPropertyArr3 = TransportHubTicketsScreen.f0;
                return (h) ((s) ((TransportHubTicketsScreen) obj2).W.getValue()).o.get();
            case 10:
                KProperty[] kPropertyArr4 = CryptoCommodityBuyCollectionSelectCryptoScreen.f71548b0;
                return (g) ((k) ((CryptoCommodityBuyCollectionSelectCryptoScreen) obj2).X.getValue()).f209372c.get();
            case 11:
                return Boolean.valueOf(((jte.d) ((fyg.g) obj2).d).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c));
            case 12:
                int i6 = SowStatusFragment.j0;
                return new SwipeToActionDelegate((RowDelegate) ((SowStatusFragment) obj2).f0.getValue(), false);
            case 13:
                return MouseWheelScrollingLogic.sumOrNull$lambda$0((ukm.u) obj2);
            case 14:
                com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar2 = (com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a) obj2;
                aVar2.f85999q.getClass();
                yji.l.a1(aVar2, aVar2.X1(new mii.k("SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 15:
                int i21 = StockLendingOnboardingActivity.K0;
                return (StockLendingOnboardingContract$Configuration) ((StockLendingOnboardingActivity) obj2).G0();
            case 16:
                return SnapshotStateObserver.sendNotifications$lambda$0((SnapshotStateObserver) obj2);
            case 17:
                int i22 = PaymentsBreakdownController.U;
                return (g22.a) ((p12.o0) ((PaymentsBreakdownController) obj2).T.getValue()).e.get();
            case 18:
                KProperty[] kPropertyArr5 = TravelExperiencesFilterScreen.f93064h0;
                return (n) ((z0g.i) ((TravelExperiencesFilterScreen) obj2).Y.getValue()).d.get();
            case 19:
                te0.u uVar = ((g3b.i) obj2).f140257a;
                Type type = new TypeToken<Long>() { // from class: com.revolut.feature.retail.cfd.impl.repository.CfdRiskWarningRepositoryImpl$cfdRiskWarningAcknowledgeDate_delegate$lambda$0$$inlined$provide$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return uVar.a(0L, "cfd_risk_warning_acknowledge_date", type);
            case 20:
                lk0.g gVar = (lk0.g) ((g3e.i) obj2).f140276c.f();
                if (gVar != null) {
                    rfm.u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 21:
                return g40.e.a((g40.e) obj2);
            case 22:
                AgentInfoScreen.a aVar3 = AgentInfoScreen.Companion;
                return (g40.b) ((h30.i) ((AgentInfoScreen) obj2).V.getValue()).f148899c.get();
            case 23:
                KProperty[] kPropertyArr6 = JointContactPhoneConfirmationScreen.c0;
                return (g58.d) ((e48.k) ((JointContactPhoneConfirmationScreen) obj2).X.getValue()).f122452c.get();
            case 24:
                return new g58.b(((g58.j) obj2).f140695p.f76592a, null);
            case 25:
                return Boolean.valueOf(((g5a.d) obj2).f140703a.f80150a == c5a.n.EMBEDDED);
            case 26:
                return Boolean.valueOf(((ChatTransferScreenContract$InputData) ((r10.w) obj2).f250865a).f80150a == c5a.n.EMBEDDED);
            case 27:
                ((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) obj2).I2(false);
                return Unit.f186387a;
            case 28:
                com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i.P2((com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) obj2);
                return Unit.f186387a;
            default:
                return (g8e.a) ((r6e.h) ((InviteMembersFlow) obj2).P.getValue()).f251738b.get();
        }
    }
}
