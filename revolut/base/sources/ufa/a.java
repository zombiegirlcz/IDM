package ufa;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C1546a Companion = new C1546a();

    /* JADX INFO: renamed from: ufa.a$a, reason: collision with other inner class name */
    public static final class C1546a {
        private C1546a() {
        }
    }

    public a() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137501m;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
    }
}
