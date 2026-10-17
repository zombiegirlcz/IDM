package ep4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import no.m;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f128075a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnalyticsProduct.Retail f128076b;

    static {
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        f128076b = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    private b() {
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return f128076b;
    }
}
