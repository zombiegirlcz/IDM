package svl;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ej0.b f266035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ej0.b f266036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ej0.b f266037c;
    public static final ej0.b d;
    public static final List e;
    public static final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f266038g;

    static {
        BigDecimal bigDecimal = new BigDecimal("3098.65");
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.i;
        ej0.b value = new ej0.b(bigDecimal, bVar);
        Intrinsics.checkNotNullParameter(value, "value");
        f266035a = value;
        ej0.b value2 = new ej0.b(new BigDecimal("199.50"), bVar);
        Intrinsics.checkNotNullParameter(value2, "value");
        f266036b = value2;
        ej0.b value3 = new ej0.b(new BigDecimal("46.00"), bVar);
        Intrinsics.checkNotNullParameter(value3, "value");
        f266037c = value3;
        ej0.b value4 = new ej0.b(new BigDecimal("144.00"), bVar);
        Intrinsics.checkNotNullParameter(value4, "value");
        d = value4;
        e = v.k("202.44", "202.71", "202.81", "202.22", "201.84", "201.02", "202.09", "202.40", "202.60", "202.47", "202.32", "201.69", "201.46", "201.84", "201.95", "201.95", "201.87", "201.71", "202.09", "201.95", "202.18", "202.39", "202.56", "202.84", "202.81", "202.77", "202.64", "203.08", "203.08", "203.37", "203.37", "203.02", "202.91", "203.54", "203.66", "203.84", "203.77", "203.88", "203.85", "203.70", "203.14", "202.88", "202.84", "202.80", "202.76", "202.86", "202.78", "202.77", "203.34", "202.84", "203.09", "203.11", "203.53", "203.30", "203.06", "203.12", "203.29", "203.44", "203.62", "203.60", "203.85", "203.97", "203.90", "204.21", "204.61", "204.53", "204.30", "203.97", "203.94", "203.56", "203.78", "203.66", "203.53", "203.08", "202.96", "202.74", "202.50", "202.56", "201.74", "202.30", "202.22", "202.75", "203.36", "204.25", "203.90", "204.17", "204.43", "203.91", "203.74", "203.62", "203.71", "203.85", "203.75", "203.82", "203.63", "203.16", "203.37", "203.44", "203.66", "203.64", "203.76", "203.64", "204.03", "203.99", "204.06", "203.93", "203.56", "203.73", "203.51", "203.56", "204.29", "204.46", "203.85", "203.88", "203.96", "203.97", "204.58", "204.22", "204.06", "204.10", "201.09", "201.09", "200.02", "200.36", "200.30", "200.28", "201.10", "200.56", "201.23", "201.28", "201.78", "201.96", "202.56", "202.92", "202.88", "202.85", "203.81", "203.28", "203.16", "203.50", "203.46", "203.48", "203.94", "203.77", "203.25", "203.46", "203.92", "203.87", "203.59", "203.63", "203.83", "203.94", "203.90", "203.53", "204.20", "204.31", "203.75", "203.61", "203.89", "204.17", "201.84", "201.84", "200.97", "200.28", "199.50", "199.47", "199.00", "198.88", "198.75", "198.20");
        f = v.k("3039.65", "3038.53", "3042.56", "3040.53", "3037.39", "3047.85", "3039.45", "3040.00", "3039.01", "3041.48", "3042.32", "3040.84", "3039.02", "3036.33", "3054.25", "3045.20", "3062.72", "3063.20", "3057.83", "3052.66", "3066.36", "3069.11", "3068.34", "3065.06", "3065.33", "3053.89", "3055.32", "3049.66", "3063.46", "3062.33", "3060.80", "3061.39", "3056.31", "3053.04", "3047.12", "3053.20", "3049.56", "3047.90", "3051.07", "3052.42", "3050.60", "3048.00", "3046.12", "3047.05", "3049.02", "3050.34", "3051.00", "3054.90", "3051.56", "3048.64", "3048.02", "3049.17", "3051.00", "3045.30", "3042.59", "3043.83", "3036.12", "3039.67", "3037.43", "3032.46", "3024.49", "3016.61", "3017.32", "3009.88", "3011.14", "2999.62", "3001.00", "3023.51", "3010.65", "3021.00", "3026.00", "3021.30", "3018.49", "3027.57", "3027.96", "3028.08", "3028.47", "3019.50", "3023.72", "3019.31", "3016.86", "3011.00", "2998.10", "3014.10", "3019.00", "3022.60", "3020.77", "3024.37", "3019.00", "3018.05", "3021.79", "3020.85", "3021.22", "3015.46", "3020.51", "3022.58", "3019.67", "3033.10", "3033.19", "3021.31", "3023.00", "3027.20", "3028.60", "3031.94", "3030.60", "3034.27", "3037.00", "3035.04", "3024.92", "3018.83", "3030.56", "3015.96", "3023.00", "3025.31", "3021.00", "3020.65", "3020.00", "3033.45", "3029.59", "3043.82", "3052.30", "3059.70", "3058.68", "3071.44", "3064.18", "3066.50", "3075.00", "3071.64", "3074.41", "3088.76", "3081.76", "3067.86", "3071.03", "3073.46", "3073.82", "3067.62", "3060.87", "3072.51", "3075.33", "3073.90", "3067.18", "3079.41", "3082.96", "3074.13", "3054.98", "3052.65", "3098.65", "3101.65", "3111.65", "3118.07");
        f266038g = r0.k(new Pair(0L, "84.59"), new Pair(5L, "78.87"), new Pair(8L, "66.99"), new Pair(10L, "91.18"), new Pair(12L, "69.63"), new Pair(15L, "74.91"), new Pair(18L, "101.74"), new Pair(21L, "106.14"), new Pair(22L, "118.90"), new Pair(27L, "125.50"), new Pair(29L, "111.42"), new Pair(31L, "116.70"), new Pair(34L, "112.30"), new Pair(38L, "137.81"), new Pair(40L, "136.05"), new Pair(42L, "147.49"), new Pair(46L, "151.01"), new Pair(48L, "145.29"), new Pair(52L, "170.81"), new Pair(55L, "168.17"), new Pair(57L, "160.25"), new Pair(59L, "162.89"), new Pair(64L, "173.00"), new Pair(68L, "153.65"), new Pair(70L, "157.17"), new Pair(72L, "149.69"), new Pair(74L, "153.65"), new Pair(75L, "152.65"), new Pair(77L, "153.65"), new Pair(78L, "148.37"), new Pair(80L, "151.01"), new Pair(82L, "145.29"), new Pair(84L, "147.49"), new Pair(87L, "141.77"), new Pair(89L, "121.54"), new Pair(91L, "134.29"), new Pair(93L, "129.46"), new Pair(95L, "136.05"), new Pair(100L, "143.97"), new Pair(101L, "137.81"), new Pair(104L, "139.13"), new Pair(106L, "132.97"), new Pair(109L, "134.29"), new Pair(111L, "141.77"), new Pair(113L, "145.29"), new Pair(115L, "128.14"), new Pair(119L, "123.74"), new Pair(121L, "132.97"), new Pair(123L, "123.74"), new Pair(128L, "129.46"), new Pair(130L, "110.10"), new Pair(134L, "111.42"), new Pair(136L, "120.22"), new Pair(138L, "116.26"), new Pair(142L, "116.70"), new Pair(144L, "121.54"), new Pair(147L, "113.62"), new Pair(150L, "116.70"), new Pair(154L, "118.90"), new Pair(156L, "116.70"), new Pair(158L, "125.50"), new Pair(161L, "123.74"), new Pair(164L, "125.50"), new Pair(169L, "116.26"), new Pair(177L, "136.05"), new Pair(179L, "132.97"), new Pair(182L, "136.05"), new Pair(182L, "132.97"), new Pair(187L, "137.81"), new Pair(187L, "132.97"), new Pair(191L, "132.97"), new Pair(193L, "52.45"), new Pair(198L, "77.55"), new Pair(201L, "31.80"), new Pair(206L, "37.11"), new Pair(219L, "11.54"), new Pair(228L, "113.62"), new Pair(230L, "104.82"), new Pair(232L, "106.14"), new Pair(235L, "99.10"), new Pair(236L, "99.10"), new Pair(239L, "104.82"), new Pair(242L, "106.14"));
    }

    private b() {
    }

    public static bfl.f a(String symbol, String ref2, bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneId.of("UTC"));
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant, "ofInstant(...)");
        ZonedDateTime zonedDateTimeOfInstant2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneId.of("UTC"));
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant2, "ofInstant(...)");
        xi0.b.Companion.getClass();
        return new bfl.f("", zonedDateTimeOfInstant, zonedDateTimeOfInstant2, symbol, ref2, new dj0.d(0L, xi0.b.i), BitmapDescriptorFactory.HUE_RED, null, null, null, tradeSide);
    }
}
