package n5k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import n1.y;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends yji.n implements q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RateExplanationDialogMapper f212658l;

    public r(RateExplanationDialogMapper dialogMapper) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f212658l = dialogMapper;
    }

    public final void Z2() {
        k9 value = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
        this.f212658l.getClass();
        N2(RateExplanationDialogMapper.a(retail), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new y(this, 21));
    }
}
