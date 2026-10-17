package htk;

import g2e.t;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f155452c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4h.a f155453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f155454b;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0.05d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        f155452c = bigDecimalValueOf;
    }

    public g(f4h.a expectedPriceChangeItemMapper, t expectedReturnItemMapper, k riskItemMapper) {
        Intrinsics.checkNotNullParameter(expectedPriceChangeItemMapper, "expectedPriceChangeItemMapper");
        Intrinsics.checkNotNullParameter(expectedReturnItemMapper, "expectedReturnItemMapper");
        Intrinsics.checkNotNullParameter(riskItemMapper, "riskItemMapper");
        this.f155453a = expectedPriceChangeItemMapper;
        this.f155454b = expectedReturnItemMapper;
    }
}
