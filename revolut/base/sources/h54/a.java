package h54;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static y0 a(a aVar, AnalyticsProduct.Retail analyticsProduct, nii.y yVar, int i) {
        boolean z = (i & 1) == 0;
        nii.y errorContext = (i & 4) != 0 ? new nii.y(3, null, null) : yVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(errorContext, "errorContext");
        return new y0(null, new nii.z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, z, analyticsProduct, null, null, null, errorContext, null, 23798), false, 5);
    }
}
