package aee;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.ActionContent;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends oki.h implements m {
    public final TransferTrackerEstimationResultScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f3569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f3570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cee.a f3571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f3572s;

    public q(cli.n stateMapper, TransferTrackerEstimationResultScreenContract$InputData inputData, wsg.n walletInteractor, j60.a bottomSheetDialog, cee.a dialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "bottomSheetDialog");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = inputData;
        this.f3569p = walletInteractor;
        this.f3570q = bottomSheetDialog;
        this.f3571r = dialogMapper;
        this.f3572s = mra.d.b(this, new i(inputData.f89405b), stateMapper, null, false, 12);
    }

    public final void I2(ActionContent actionContent) {
        RowDelegate.Model model;
        this.f3571r.getClass();
        boolean z = false;
        RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_ITEM_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.locate_inbound_transfer_output_required_details_first_point, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        boolean z3 = false;
        RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_ITEM_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.locate_inbound_transfer_output_required_details_second_point, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        boolean z4 = false;
        RowDelegate.Model model4 = new RowDelegate.Model("LIST_ID_ITEM_3", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_send_message, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.locate_inbound_transfer_output_required_details_third_point, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        boolean z6 = false;
        int i = 6;
        RowDelegate.Model model5 = new RowDelegate.Model("LIST_ID_ITEM_4", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, i), new TextLocalisedClause(R$string.locate_inbound_transfer_output_required_details_fourth_point, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        if (actionContent != null) {
            boolean z11 = false;
            model = new RowDelegate.Model("LIST_ID_ITEM_5", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z11, z11, i), new TextClause(actionContent.f89366a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(actionContent.f89367b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        } else {
            model = null;
        }
        RowDelegate.Model[] elements = {model2, model3, model4, model5, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model6 = new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_DIALOG_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model6, 0, R$attr.uikit_dp24, 0, 0, 13);
        this.f3570q.x(new rp0.y(d0.F0(model6, listL), new rp0.t(new TextLocalisedClause(R$string.locate_inbound_transfer_output_required_details_header, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f3572s;
    }
}
