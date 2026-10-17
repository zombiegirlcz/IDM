package vt4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import grl.k9;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static ActionsBottomSheetController a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_error_generic, null, null, 14);
        BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 76);
    }
}
