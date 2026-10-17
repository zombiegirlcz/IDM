package um2;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnalyticsProduct.Shared f281197b = new AnalyticsProduct.Shared(k9.Profile, x0.RevolutUIKit, q6.RevolutUiKit, w2.Profile, od.RevolutUIKit);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f281198a;

    public h0(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f281198a = dateProvider;
    }
}
