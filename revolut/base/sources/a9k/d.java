package a9k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import e4m.e;
import grl.k9;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements e {
    public static j9i.a a() {
        c.Companion.getClass();
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new j9i.a(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 23);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
