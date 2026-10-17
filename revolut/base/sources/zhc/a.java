package zhc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import no.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f322393a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k9 f322394b;

    static {
        k9 value = k9.Rewards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        f322394b = value;
    }

    private a() {
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return new AnalyticsProduct.Retail(f322394b);
    }
}
