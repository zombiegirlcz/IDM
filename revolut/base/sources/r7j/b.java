package r7j;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f252263a = new b();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k9 k9Var = k9.Commodities;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }
}
