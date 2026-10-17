package a4b;

import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f1233a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CfdOpenPositionsDelegate$OpenPositions f1234b;

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        f1234b = new CfdOpenPositionsDelegate$OpenPositions(ZERO, ZERO);
    }

    private b() {
    }
}
