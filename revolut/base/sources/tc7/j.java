package tc7;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements e4m.e {
    public static AnalyticsProduct.Retail a() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137495b;
        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
