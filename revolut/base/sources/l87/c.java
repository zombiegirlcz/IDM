package l87;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RoundingMode f192805b = RoundingMode.HALF_EVEN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f192806a;

    public c(adh.a assetPerformanceCalculator, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(assetPerformanceCalculator, "assetPerformanceCalculator");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f192806a = uiKitResources;
    }

    public static hyl.a a(BigDecimal bigDecimal) {
        int iD = xqi.a.d(bigDecimal, true, f192805b);
        return iD > 0 ? hyl.a.POSITIVE : iD < 0 ? hyl.a.NEGATIVE : hyl.a.NEUTRAL;
    }
}
