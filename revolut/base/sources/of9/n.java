package of9;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {
    public static ActionsBottomSheetController a(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        lw0.a aVar = new lw0.a(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
