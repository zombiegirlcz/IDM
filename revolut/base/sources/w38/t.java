package w38;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.api.navigation.PendingJointAccountBottomSheetDestination;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t {
    public final ActionsBottomSheetController a(h38.d variant) {
        int i;
        Intrinsics.checkNotNullParameter(variant, "variant");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_pending_account_bottom_sheet_title, null, null, 14);
        Intrinsics.checkNotNullParameter(variant, "<this>");
        switch (u.f294214a[variant.ordinal()]) {
            case 1:
                i = R$string.joint_pending_account_bottom_sheet_home_description;
                break;
            case 2:
                i = R$string.joint_pending_account_bottom_sheet_statement_description;
                break;
            case 3:
                i = R$string.joint_pending_account_bottom_sheet_order_card_description;
                break;
            case 4:
                i = R$string.joint_pending_account_bottom_sheet_joint_pocket_description;
                break;
            case 5:
                i = R$string.joint_pending_account_bottom_sheet_joint_savings_description;
                break;
            case 6:
                i = R$string.joint_pending_account_bottom_sheet_joint_invest_description;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_time, null, null, 6)), null, false, 24);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.joint_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.JointAccounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    public final FeatureCommand b(h38.d variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new FeatureCommand(new KompotOverlayFeatureConfig(new PendingJointAccountBottomSheetDestination(variant), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
    }
}
