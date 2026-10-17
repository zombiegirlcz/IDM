package whd;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import no.m;

/* JADX INFO: loaded from: classes7.dex */
public interface b extends m {
    default k9 f0() {
        k9 value = k9.Shops;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
