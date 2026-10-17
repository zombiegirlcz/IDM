package s5k;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import hrf.i;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5k.e;
import rp0.l;
import rp0.t;
import rp0.y;
import yji.n;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends n implements a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r5k.d f260098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f260099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r5k.b f260100n;

    public d(r5k.d mapper, j60.a bottomDialog, r5k.a flowLimitsErrorDialogProvider, r5k.b pocketTransferLimitsErrorDialogProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(flowLimitsErrorDialogProvider, "flowLimitsErrorDialogProvider");
        Intrinsics.checkNotNullParameter(pocketTransferLimitsErrorDialogProvider, "pocketTransferLimitsErrorDialogProvider");
        this.f260098l = mapper;
        this.f260099m = bottomDialog;
        this.f260100n = pocketTransferLimitsErrorDialogProvider;
    }

    public final void Z2() {
        ((e) this.f260098l).getClass();
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.fx_not_dealing_sheet_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.fx_not_dealing_transfer_sheet_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ITEM_ID_SUBTITLE_LEARN_MORE", false), 10))), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new b(this, 0));
    }

    public final void b3(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        dj0.d transferLimit = new dj0.d(j2, currency);
        this.f260100n.getClass();
        Intrinsics.checkNotNullParameter(transferLimit, "transferLimit");
        this.f260099m.x(new y(u.c(new CellDetailsDelegate.Model("POCKET_TRANSFERLIMIT_ITEM_ID", new TextLocalisedClause(R$string.transfer_pocket_limits_dialog_exceeded_limit_cell_title, null, null, 14), new MoneyClause(transferLimit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)), new t(new TextLocalisedClause(R$string.transfer_pocket_limits_dialog_exceeded_title, null, null, 14), new TextLocalisedClause(R$string.transfer_pocket_limits_dialog_exceeded_subtitle, null, null, 14), null, 28), l.WINDOW, null, null, null, 1016));
    }

    public final void c3(TransferAvailabilityReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ((e) this.f260098l).getClass();
        Intrinsics.checkNotNullParameter(reason, "reason");
        lw0.a aVar = new lw0.a(new TextClause(reason.f92279a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(reason.f92280b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new s4b.e(28));
    }

    public final void d3(WalletLimit.CounterLimit dailyLimit) {
        Intrinsics.checkNotNullParameter(dailyLimit, "dailyLimit");
        ((e) this.f260098l).getClass();
        Intrinsics.checkNotNullParameter(dailyLimit, "dailyLimit");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.transfer_limits_dialog_exceeded_new_bank_transfer_title, null, null, 14), new HtmlLocalisedClause(R$string.transfer_limits_dialog_exceeded_new_bank_transfer_subtitle_daily, (List) null, (Integer) null, (Object) null, 30), null, null, false, 28);
        CellDetailsDelegate.Model modelA = e.a(dailyLimit, R$string.transfer_limits_dialog_exceeded_new_bank_transfer_transfer_limit_title);
        List listL = v.l(modelA != null ? new eii.b(modelA) : null);
        k9 value = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar, new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.transfer_limits_dialog_exceeded_new_bank_transfer_cta_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listL, new AnalyticsProduct.Retail(value), null));
        b block = new b(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        n.P2(this, rowActionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    public final void e3(i limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        WalletLimit.CounterLimit counterLimit = limits.f154820a;
        WalletLimit.CounterLimit counterLimit2 = limits.f154821b;
        WalletLimit.CounterLimit counterLimit3 = limits.f154822c;
        WalletLimit.CounterLimit counterLimit4 = limits.d;
        ((e) this.f260098l).getClass();
        TextDelegate.Model model = new TextDelegate.Model("SUBTITLE_ID", new TextLocalisedClause(R$string.transfer_limits_dialog_exceeded_subtitle, null, null, 14), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        TextDelegate.Model model2 = new TextDelegate.Model("EXPLAINER_ID", new TextLocalisedClause(R$string.transfer_limits_dialog_exceeded_weekly_explainer, null, null, 14), false, new ck0(0), null, null, 0, R$attr.uikit_dp32, 0, 0, 1780);
        CellDetailsDelegate.Model[] elements = {e.a(counterLimit, R$string.transfer_limits_dialog_exceeded_daily), e.a(counterLimit2, R$string.transfer_limits_dialog_exceeded_weekly), e.a(counterLimit3, R$string.transfer_limits_dialog_exceeded_yearly), e.a(counterLimit4, R$string.transfer_limits_dialog_exceeded_yearly)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        this.f260099m.x(new y(d0.F0(model2, ue0.e.J(model, listL)), new t(new TextLocalisedClause(R$string.transfer_limits_dialog_exceeded_title, null, null, 14), null, new rp0.v("MENU_IMAGE_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", new ImageTransformations(null, null, null, null, null, 64, 64, 31), null, null, 28)), 26), l.WINDOW, null, null, null, 1016));
    }
}
