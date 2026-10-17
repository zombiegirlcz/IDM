package up0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f281682a = Math.log(2000000.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigDecimal f281683b;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(400);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        f281683b = bigDecimalValueOf;
    }

    private c() {
    }
}
