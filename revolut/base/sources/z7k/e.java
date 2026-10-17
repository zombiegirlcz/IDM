package z7k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements e4m.e {
    public static j9i.a a() {
        d.Companion.getClass();
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new j9i.a(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 23);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
