package a08;

import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderActivity;
import com.revolut.feature.junior_consent.api.navigation.JuniorPaymentLinksConsentApproveDestination;
import com.revolut.feature.onboarding.api.user_migration.UserMigrationFeatureConfig;
import com.revolut.feature.us_direct_deposit.DirectDepositFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.trading_hours.api.TradingHoursDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen.NationalIdentifierDocumentFragment;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f176b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f175a = i;
        this.f176b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kfm.a
    public final void run() {
        boolean z = true;
        boolean z3 = false;
        Integer num = null;
        switch (this.f175a) {
            case 0:
                PetPlanBuilderActivity petPlanBuilderActivity = (PetPlanBuilderActivity) this.f176b;
                int i = PetPlanBuilderActivity.J0;
                petPlanBuilderActivity.Z0().smoothScrollToPosition(((z4l.j) petPlanBuilderActivity.I0.getValue()).getItemCount());
                return;
            case 1:
                ((ad9.a) this.f176b).f3291a.c(zh9.u0.f(new UserMigrationFeatureConfig.UserMigrationDestination(null, null)));
                return;
            case 2:
                ((anf.k) this.f176b).e.a();
                return;
            case 3:
                ((anf.o) this.f176b).f.a();
                return;
            case 4:
                c03.l lVar = (c03.l) this.f176b;
                opi.d dVar = lVar.f20131j;
                lVar.f20133m.getClass();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_action_remove_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_alert_terminate_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.card_replacement_expectation_actions_terminate_and_order, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i2 = R$attr.uikit_dp16;
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("TERMINATE_AND_REORDER_CONFIRM_ID", defaultFilledButton, null, textLocalisedClause3, false, null, null, i2, R$attr.uikit_dp8, i2, i2, 496);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                int i3 = R$attr.uikit_dp8;
                int i5 = R$attr.uikit_dp16;
                ((opi.b) dVar).Z(new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("TERMINATE_AND_REORDER_CANCEL_ID", defaultFilledButton2, null, textLocalisedClause4, false, null, null, i3, R$attr.uikit_dp24, i5, i5, 496)), new rp0.t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, "TERMINATE_AND_REORDER_RECYCLER_DELEGATES_KEY", null, null, null, 3836));
                return;
            case 5:
                ((ne0.j) ((a61.a) this.f176b).f1532c).clear();
                return;
            case 6:
                ((rpi.b) ((com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a) this.f176b).f96930m).N(true);
                return;
            case 7:
                ((cb6.a) this.f176b).f22724a.c(new FeatureCommand(DonationsKompotFeatureConfig.CharitiesOverview.f71976g));
                return;
            case 8:
                ((com.revolut.feature.kyc.impl.b) this.f176b).f77568c.f229570a.clear();
                return;
            case 9:
                cx2.g gVar = (cx2.g) ((cx2.e) this.f176b).f109886b;
                gVar.f109890b.getValue(gVar, cx2.g.f109889c[0]).set(Boolean.FALSE);
                return;
            case 10:
                ((dlg.a) this.f176b).f115765a.c(zh9.u0.f(DirectDepositFlowDestination.f94577a));
                return;
            case 11:
                ((dwi.h) this.f176b).f120425b.onNext(Unit.f186387a);
                return;
            case 12:
                NationalIdentifierDocumentFragment nationalIdentifierDocumentFragment = (NationalIdentifierDocumentFragment) this.f176b;
                int i6 = NationalIdentifierDocumentFragment.j0;
                RecyclerView recyclerViewE = nationalIdentifierDocumentFragment.E();
                recyclerViewE.smoothScrollBy(0, recyclerViewE.computeVerticalScrollExtent() + recyclerViewE.getScrollY());
                return;
            case 13:
                IllegalStateException illegalStateException = new IllegalStateException("Handler for action " + ((mm.a) this.f176b) + " is not registered.");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            case 14:
                com.revolut.core.ui_kit.internal.views.timer.a.setupTimer$lambda$7((com.revolut.core.ui_kit.internal.views.timer.a) this.f176b);
                return;
            case 15:
                f5l.d.a(((f5l.c) this.f176b).i);
                return;
            case 16:
                ((f6j.b) this.f176b).f132451a.c(zh9.u0.f(TradingHoursDestination.CommodityMarketHours.f104065a));
                return;
            case 17:
                yf.c cVar = ((f9b.f) this.f176b).f132902a;
                BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) ((WeakReference) cVar.b).get();
                if (baseDelegatesActivity != null) {
                    baseDelegatesActivity.runOnUiThread(new f9b.a(cVar, z3, z));
                    return;
                }
                return;
            case 18:
                ((be6.j) ((fe6.a) this.f176b).f134453a).a(null);
                return;
            case 19:
                ((sri.m) ((zjh.f) this.f176b).f322835b).c(gc0.c.f(new KompotOverlayFeatureConfig(JuniorPaymentLinksConsentApproveDestination.f76869a, yhi.b.SOLID, num, 12)));
                return;
            case 20:
                ((fif.m) this.f176b).f135419p.b();
                return;
            case 21:
                ((fpj.e) this.f176b).d.d = true;
                return;
            case 22:
                fwj.b bVar = (fwj.b) this.f176b;
                bVar.f138657a.a();
                sre.h hVar = (sre.h) bVar.f138658b.f238999a;
                hVar.f265199c.clear();
                hVar.d.clear();
                ((hoe.a) bVar.f138659c).clear();
                return;
            case 23:
                ((gae.d) this.f176b).f142149a.onNext(new FinishCommand(null, null, null, 7));
                return;
            case 24:
                gif.h hVar2 = (gif.h) this.f176b;
                tif.b bVar2 = hVar2.f144182c;
                q6 q6Var = hVar2.f144184h;
                if (q6Var == null) {
                    Intrinsics.r("transactionScope");
                    throw null;
                }
                bVar2.e(q6Var, true);
                ((ihm.f) hVar2.f144185j.getValue()).onNext(Boolean.TRUE);
                return;
            case 25:
                gv9.j jVar = (gv9.j) this.f176b;
                gv9.b bVar3 = gv9.c.Companion;
                if (((Integer) DBUtil.performBlocking(jVar.f147114a, false, true, new gul.f(27))).intValue() > 0) {
                    gv9.b.f147092b.onNext(Unit.f186387a);
                    return;
                }
                return;
            case 26:
                gx2.k kVar = (gx2.k) this.f176b;
                ((k3l.d) kVar.f147628m).O(new StatusViewConfiguration.Success("SUCCESS_STATUS_VIEW_ID", new TextLocalisedClause(R$string.card_sca_limit_reset_success_title, null, null, 14), kVar.k.f ? new TextLocalisedClause(R$string.card_sca_limit_reset_success_text, null, null, 14) : null, null, null, 2040));
                return;
            case 27:
                ((rpi.b) ((h2i.c) this.f176b).f148823j).N(false);
                return;
            case 28:
                ((hl0.c) this.f176b).f152973a.c(new IntentCommand(new Intent("android.settings.LOCALE_SETTINGS"), null));
                return;
            default:
                ((hp5.o) this.f176b).o.c(null, (1 & 2) == 0, new hp3.r(17));
                return;
        }
    }
}
