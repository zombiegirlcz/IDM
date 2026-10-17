package dy4;

import android.os.Parcelable;
import aw0.i;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final ActionsBottomSheetController a(ActionsBottomSheetController.Companion credit, lw0.a header, i iVar, AnalyticsContext analyticsContext, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(credit, "$this$credit");
        Intrinsics.checkNotNullParameter(header, "header");
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(header, iVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), analyticsContext, textLocalisedClause));
    }

    public static /* synthetic */ ActionsBottomSheetController b(ActionsBottomSheetController.Companion aVar, lw0.a aVar2, i iVar, AnalyticsContext analyticsContext, int i) {
        if ((i & 4) != 0) {
            analyticsContext = null;
        }
        return a(aVar, aVar2, iVar, analyticsContext, null);
    }
}
