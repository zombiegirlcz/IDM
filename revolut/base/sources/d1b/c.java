package d1b;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bv\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Ld1b/c;", "", "", "value", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "displayName", "a", "", "length", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "", "volumeBased", "Z", "e", "()Z", "WEEK_52_HIGH_LOW", "ACCELERATOR_OSCILLATOR", "ACCUMULATION_DISTRIBUTION", "ACCUMULATIVE_SWING_INDEX", "ADVANCE_DECLINE", "ARNAUD_LEGOUX_MOVING_AVERAGE", "AROON", "AVERAGE_DIRECTIONAL_INDEX", "AVERAGE_PRICE", "AVERAGE_TRUE_RANGE", "AWESOME_OSCILLATOR", "BALANCE_OF_POWER", "BOLLINGER_BANDS", "BOLLINGER_BANDS_20", "BOLLINGER_BANDS_PERCENT_B", "BOLLINGER_BANDS_WIDTH", "CHAIKIN_MONEY_FLOW", "CHAIKIN_OSCILLATOR", "CHAIKIN_VOLATILITY", "CHANDE_KROLL_STOP", "CHANDE_MOMENTUM_OSCILLATOR", "CHOP_ZONE", "CHOPPINESS_INDEX", "COMMODITY_CHANNEL_INDEX", "CONNORS_RSI", "COPPOCK_CURVE", "CORRELATION_LOG", "CORRELATION_COEFFICIENT", "DETRENDED_PRICE_OSCILLATOR", "DIRECTIONAL_MOVEMENT", "DONCHIAN_CHANNELS", "DOUBLE_EMA", "EASE_OF_MOVEMENT", "ELDERS_FORCE_INDEX", "EMA_CROSS", "ENVELOPES", "FISHER_TRANSFORM", "GUPPY_MULTIPLE_MOVING_AVERAGE", "HISTORICAL_VOLATILITY", "HULL_MOVING_AVERAGE", "ICHIMOKU_CLOUD", "KELTNER_CHANNELS", "KLINGER_OSCILLATOR", "KNOW_SURE_THING", "LEAST_SQUARES_MOVING_AVERAGE", "LINEAR_REGRESSION_CURVE", "LINEAR_REGRESSION_SLOPE", "MA_CROSS", "MA_WITH_EMA_CROSS", "MACD", "MAJORIT_YRULE", "MASS_INDEX", "MCGINLEY_DYNAMIC", "MEDIAN_PRICE", "MOMENTUM", "MONEY_FLOW_INDEX", "MOVING_AVERAGE", "MOVING_AVERAGE_SIMPLE_9", "MOVING_AVERAGE_SIMPLE_20", "MOVING_AVERAGE_SIMPLE_50", "MOVING_AVERAGE_SIMPLE_100", "MOVING_AVERAGE_SIMPLE_200", "MOVING_AVERAGE_ADAPTIVE", "MOVING_AVERAGE_CHANNEL", "MOVING_AVERAGE_DOUBLE", "MOVING_AVERAGE_EXPONENTIAL", "MOVING_AVERAGE_HAMMING", "MOVING_AVERAGE_MULTIPLE", "MOVING_AVERAGE_TRIPLE", "MOVING_AVERAGE_WEIGHTED", "NET_VOLUME", "ON_BALANCE_VOLUME", "PARABOLIC_SAR", "PIVOT_POINTS_STANDARD", "PRICE_CHANNEL", "PRICE_OSCILLATOR", "PRICE_VOLUME_TREND", "RATE_OF_CHANGE", "RATIO", "RELATIVE_STRENGTH_INDEX", "RELATIVE_STRENGTH_INDEX_14", "RELATIVE_VIGOR_INDEX", "RELATIVE_VOLATILITY_INDEX", "SMI_ERGODIC_INDICATOR_OSCILLATOR", "SMOOTHED_MOVING_AVERAGE", "SPREAD", "STANDARD_DEVIATION", "STANDARD_ERROR", "STANDARD_ERROR_BANDS", "STOCHASTIC", "STOCHASTIC_RSI", "SUPERTREND", "TREND_STRENGTH_INDEX", "TRIPL_EEMA", "TRIX", "TRUE_STRENGTH_INDEX", "TYPICAL_PRICE", "ULTIMATE_OSCILLATOR", "VOLATILITY_CLOSE_TO_CLOSE", "VOLATILITY_INDEX", "VOLATILITY_OHLC", "VOLATILITY_ZERO_TREND_CLOSE_TO_CLOSE", "VOLUME", "VOLUME_OSCILLATOR", "VOLUME_PROFILE_FIXED_RANGE", "VOLUME_PROFILE_VISIBLE_RANGE", "VORTEX_INDICATOR", "VWAP", "VWMA", "WILLIAMS_PERCENT_R", "WILLIAMS_ALLIGATOR", "WILLIAMS_FRACTAL", "ZIG_ZAG", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("ACCELERATOR_OSCILLATOR")
    public static final c ACCELERATOR_OSCILLATOR;

    @lg.b("ACCUMULATION_DISTRIBUTION")
    public static final c ACCUMULATION_DISTRIBUTION;

    @lg.b("ACCUMULATIVE_SWING_INDEX")
    public static final c ACCUMULATIVE_SWING_INDEX;

    @lg.b("ADVANCE_DECLINE")
    public static final c ADVANCE_DECLINE;

    @lg.b("ARNAUD_LEGOUX_MOVING_AVERAGE")
    public static final c ARNAUD_LEGOUX_MOVING_AVERAGE;

    @lg.b("AROON")
    public static final c AROON;

    @lg.b("AVERAGE_DIRECTIONAL_INDEX")
    public static final c AVERAGE_DIRECTIONAL_INDEX;

    @lg.b("AVERAGE_PRICE")
    public static final c AVERAGE_PRICE;

    @lg.b("AVERAGE_TRUE_RANGE")
    public static final c AVERAGE_TRUE_RANGE;

    @lg.b("AWESOME_OSCILLATOR")
    public static final c AWESOME_OSCILLATOR;

    @lg.b("BALANCE_OF_POWER")
    public static final c BALANCE_OF_POWER;

    @lg.b("BOLLINGER_BANDS")
    public static final c BOLLINGER_BANDS;

    @lg.b("BOLLINGER_BANDS_20")
    public static final c BOLLINGER_BANDS_20;

    @lg.b("BOLLINGER_BANDS_PERCENT_B")
    public static final c BOLLINGER_BANDS_PERCENT_B;

    @lg.b("BOLLINGER_BANDS_WIDTH")
    public static final c BOLLINGER_BANDS_WIDTH;

    @lg.b("CHAIKIN_MONEY_FLOW")
    public static final c CHAIKIN_MONEY_FLOW;

    @lg.b("CHAIKIN_OSCILLATOR")
    public static final c CHAIKIN_OSCILLATOR;

    @lg.b("CHAIKIN_VOLATILITY")
    public static final c CHAIKIN_VOLATILITY;

    @lg.b("CHANDE_KROLL_STOP")
    public static final c CHANDE_KROLL_STOP;

    @lg.b("CHANDE_MOMENTUM_OSCILLATOR")
    public static final c CHANDE_MOMENTUM_OSCILLATOR;

    @lg.b("CHOPPINESS_INDEX")
    public static final c CHOPPINESS_INDEX;

    @lg.b("CHOP_ZONE")
    public static final c CHOP_ZONE;

    @lg.b("COMMODITY_CHANNEL_INDEX")
    public static final c COMMODITY_CHANNEL_INDEX;

    @lg.b("CONNORS_RSI")
    public static final c CONNORS_RSI;

    @lg.b("COPPOCK_CURVE")
    public static final c COPPOCK_CURVE;

    @lg.b("CORRELATION_COEFFICIENT")
    public static final c CORRELATION_COEFFICIENT;

    @lg.b("CORRELATION_LOG")
    public static final c CORRELATION_LOG;

    @lg.b("DETRENDED_PRICE_OSCILLATOR")
    public static final c DETRENDED_PRICE_OSCILLATOR;

    @lg.b("DIRECTIONAL_MOVEMENT")
    public static final c DIRECTIONAL_MOVEMENT;

    @lg.b("DONCHIAN_CHANNELS")
    public static final c DONCHIAN_CHANNELS;

    @lg.b("DOUBLE_EMA")
    public static final c DOUBLE_EMA;

    @lg.b("EASE_OF_MOVEMENT")
    public static final c EASE_OF_MOVEMENT;

    @lg.b("ELDERS_FORCE_INDEX")
    public static final c ELDERS_FORCE_INDEX;

    @lg.b("EMA_CROSS")
    public static final c EMA_CROSS;

    @lg.b("ENVELOPES")
    public static final c ENVELOPES;

    @lg.b("FISHER_TRANSFORM")
    public static final c FISHER_TRANSFORM;

    @lg.b("GUPPY_MULTIPLE_MOVING_AVERAGE")
    public static final c GUPPY_MULTIPLE_MOVING_AVERAGE;

    @lg.b("HISTORICAL_VOLATILITY")
    public static final c HISTORICAL_VOLATILITY;

    @lg.b("HULL_MOVING_AVERAGE")
    public static final c HULL_MOVING_AVERAGE;

    @lg.b("ICHIMOKU_CLOUD")
    public static final c ICHIMOKU_CLOUD;

    @lg.b("KELTNER_CHANNELS")
    public static final c KELTNER_CHANNELS;

    @lg.b("KLINGER_OSCILLATOR")
    public static final c KLINGER_OSCILLATOR;

    @lg.b("KNOW_SURE_THING")
    public static final c KNOW_SURE_THING;

    @lg.b("LEAST_SQUARES_MOVING_AVERAGE")
    public static final c LEAST_SQUARES_MOVING_AVERAGE;

    @lg.b("LINEAR_REGRESSION_CURVE")
    public static final c LINEAR_REGRESSION_CURVE;

    @lg.b("LINEAR_REGRESSION_SLOPE")
    public static final c LINEAR_REGRESSION_SLOPE;

    @lg.b("MACD")
    public static final c MACD;

    @lg.b("MAJORIT_YRULE")
    public static final c MAJORIT_YRULE;

    @lg.b("MASS_INDEX")
    public static final c MASS_INDEX;

    @lg.b("MA_CROSS")
    public static final c MA_CROSS;

    @lg.b("MA_WITH_EMA_CROSS")
    public static final c MA_WITH_EMA_CROSS;

    @lg.b("MCGINLEY_DYNAMIC")
    public static final c MCGINLEY_DYNAMIC;

    @lg.b("MEDIAN_PRICE")
    public static final c MEDIAN_PRICE;

    @lg.b("MOMENTUM")
    public static final c MOMENTUM;

    @lg.b("MONEY_FLOW_INDEX")
    public static final c MONEY_FLOW_INDEX;

    @lg.b("MOVING_AVERAGE")
    public static final c MOVING_AVERAGE;

    @lg.b("MOVING_AVERAGE_ADAPTIVE")
    public static final c MOVING_AVERAGE_ADAPTIVE;

    @lg.b("MOVING_AVERAGE_CHANNEL")
    public static final c MOVING_AVERAGE_CHANNEL;

    @lg.b("MOVING_AVERAGE_DOUBLE")
    public static final c MOVING_AVERAGE_DOUBLE;

    @lg.b("MOVING_AVERAGE_EXPONENTIAL")
    public static final c MOVING_AVERAGE_EXPONENTIAL;

    @lg.b("MOVING_AVERAGE_HAMMING")
    public static final c MOVING_AVERAGE_HAMMING;

    @lg.b("MOVING_AVERAGE_MULTIPLE")
    public static final c MOVING_AVERAGE_MULTIPLE;

    @lg.b("MOVING_AVERAGE_SIMPLE_100")
    public static final c MOVING_AVERAGE_SIMPLE_100;

    @lg.b("MOVING_AVERAGE_SIMPLE_20")
    public static final c MOVING_AVERAGE_SIMPLE_20;

    @lg.b("MOVING_AVERAGE_SIMPLE_200")
    public static final c MOVING_AVERAGE_SIMPLE_200;

    @lg.b("MOVING_AVERAGE_SIMPLE_50")
    public static final c MOVING_AVERAGE_SIMPLE_50;

    @lg.b("MOVING_AVERAGE_SIMPLE_9")
    public static final c MOVING_AVERAGE_SIMPLE_9;

    @lg.b("MOVING_AVERAGE_TRIPLE")
    public static final c MOVING_AVERAGE_TRIPLE;

    @lg.b("MOVING_AVERAGE_WEIGHTED")
    public static final c MOVING_AVERAGE_WEIGHTED;

    @lg.b("NET_VOLUME")
    public static final c NET_VOLUME;

    @lg.b("ON_BALANCE_VOLUME")
    public static final c ON_BALANCE_VOLUME;

    @lg.b("PARABOLIC_SAR")
    public static final c PARABOLIC_SAR;

    @lg.b("PIVOT_POINTS_STANDARD")
    public static final c PIVOT_POINTS_STANDARD;

    @lg.b("PRICE_CHANNEL")
    public static final c PRICE_CHANNEL;

    @lg.b("PRICE_OSCILLATOR")
    public static final c PRICE_OSCILLATOR;

    @lg.b("PRICE_VOLUME_TREND")
    public static final c PRICE_VOLUME_TREND;

    @lg.b("RATE_OF_CHANGE")
    public static final c RATE_OF_CHANGE;

    @lg.b("RATIO")
    public static final c RATIO;

    @lg.b("RELATIVE_STRENGTH_INDEX")
    public static final c RELATIVE_STRENGTH_INDEX;

    @lg.b("RELATIVE_STRENGTH_INDEX_14")
    public static final c RELATIVE_STRENGTH_INDEX_14;

    @lg.b("RELATIVE_VIGOR_INDEX")
    public static final c RELATIVE_VIGOR_INDEX;

    @lg.b("RELATIVE_VOLATILITY_INDEX")
    public static final c RELATIVE_VOLATILITY_INDEX;

    @lg.b("SMI_ERGODIC_INDICATOR_OSCILLATOR")
    public static final c SMI_ERGODIC_INDICATOR_OSCILLATOR;

    @lg.b("SMOOTHED_MOVING_AVERAGE")
    public static final c SMOOTHED_MOVING_AVERAGE;

    @lg.b("SPREAD")
    public static final c SPREAD;

    @lg.b("STANDARD_DEVIATION")
    public static final c STANDARD_DEVIATION;

    @lg.b("STANDARD_ERROR")
    public static final c STANDARD_ERROR;

    @lg.b("STANDARD_ERROR_BANDS")
    public static final c STANDARD_ERROR_BANDS;

    @lg.b("STOCHASTIC")
    public static final c STOCHASTIC;

    @lg.b("STOCHASTIC_RSI")
    public static final c STOCHASTIC_RSI;

    @lg.b("SUPERTREND")
    public static final c SUPERTREND;

    @lg.b("TREND_STRENGTH_INDEX")
    public static final c TREND_STRENGTH_INDEX;

    @lg.b("TRIPL_EEMA")
    public static final c TRIPL_EEMA;

    @lg.b("TRIX")
    public static final c TRIX;

    @lg.b("TRUE_STRENGTH_INDEX")
    public static final c TRUE_STRENGTH_INDEX;

    @lg.b("TYPICAL_PRICE")
    public static final c TYPICAL_PRICE;

    @lg.b("ULTIMATE_OSCILLATOR")
    public static final c ULTIMATE_OSCILLATOR;

    @lg.b("VOLATILITY_CLOSE_TO_CLOSE")
    public static final c VOLATILITY_CLOSE_TO_CLOSE;

    @lg.b("VOLATILITY_INDEX")
    public static final c VOLATILITY_INDEX;

    @lg.b("VOLATILITY_OHLC")
    public static final c VOLATILITY_OHLC;

    @lg.b("VOLATILITY_ZERO_TREND_CLOSE_TO_CLOSE")
    public static final c VOLATILITY_ZERO_TREND_CLOSE_TO_CLOSE;

    @lg.b("VOLUME")
    public static final c VOLUME;

    @lg.b("VOLUME_OSCILLATOR")
    public static final c VOLUME_OSCILLATOR;

    @lg.b("VOLUME_PROFILE_FIXED_RANGE")
    public static final c VOLUME_PROFILE_FIXED_RANGE;

    @lg.b("VOLUME_PROFILE_VISIBLE_RANGE")
    public static final c VOLUME_PROFILE_VISIBLE_RANGE;

    @lg.b("VORTEX_INDICATOR")
    public static final c VORTEX_INDICATOR;

    @lg.b("VWAP")
    public static final c VWAP;

    @lg.b("VWMA")
    public static final c VWMA;

    @lg.b("WEEK_52_HIGH_LOW")
    public static final c WEEK_52_HIGH_LOW;

    @lg.b("WILLIAMS_ALLIGATOR")
    public static final c WILLIAMS_ALLIGATOR;

    @lg.b("WILLIAMS_FRACTAL")
    public static final c WILLIAMS_FRACTAL;

    @lg.b("WILLIAMS_PERCENT_R")
    public static final c WILLIAMS_PERCENT_R;

    @lg.b("ZIG_ZAG")
    public static final c ZIG_ZAG;
    private final String displayName;
    private final Integer length;

    @NotNull
    private final String value;
    private final boolean volumeBased;

    static {
        c cVar = new c("WEEK_52_HIGH_LOW", 0, "52 Week High/Low", null, null, 14);
        WEEK_52_HIGH_LOW = cVar;
        c cVar2 = new c("ACCELERATOR_OSCILLATOR", 1, "Accelerator Oscillator", null, null, 14);
        ACCELERATOR_OSCILLATOR = cVar2;
        c cVar3 = new c("ACCUMULATION_DISTRIBUTION", 2, "Accumulation/Distribution", null, null, 6);
        ACCUMULATION_DISTRIBUTION = cVar3;
        c cVar4 = new c("ACCUMULATIVE_SWING_INDEX", 3, "Accumulative Swing Index", null, null, 14);
        ACCUMULATIVE_SWING_INDEX = cVar4;
        c cVar5 = new c("ADVANCE_DECLINE", 4, "Advance/Decline", null, null, 14);
        ADVANCE_DECLINE = cVar5;
        c cVar6 = new c("ARNAUD_LEGOUX_MOVING_AVERAGE", 5, "Arnaud Legoux Moving Average", null, null, 14);
        ARNAUD_LEGOUX_MOVING_AVERAGE = cVar6;
        c cVar7 = new c("AROON", 6, "Aroon", null, null, 14);
        AROON = cVar7;
        c cVar8 = new c("AVERAGE_DIRECTIONAL_INDEX", 7, "Average Directional Index", null, null, 14);
        AVERAGE_DIRECTIONAL_INDEX = cVar8;
        c cVar9 = new c("AVERAGE_PRICE", 8, "Average Price", null, null, 14);
        AVERAGE_PRICE = cVar9;
        c cVar10 = new c("AVERAGE_TRUE_RANGE", 9, "Average True Range", null, null, 14);
        AVERAGE_TRUE_RANGE = cVar10;
        c cVar11 = new c("AWESOME_OSCILLATOR", 10, "Awesome Oscillator", null, null, 14);
        AWESOME_OSCILLATOR = cVar11;
        c cVar12 = new c("BALANCE_OF_POWER", 11, "Balance of Power", null, null, 14);
        BALANCE_OF_POWER = cVar12;
        c cVar13 = new c("BOLLINGER_BANDS", 12, "Bollinger Bands", null, null, 14);
        BOLLINGER_BANDS = cVar13;
        c cVar14 = new c("BOLLINGER_BANDS_20", 13, "Bollinger Bands", "Bollinger Bands (20 days)", 20, 8);
        BOLLINGER_BANDS_20 = cVar14;
        c cVar15 = new c("BOLLINGER_BANDS_PERCENT_B", 14, "Bollinger Bands %B", null, null, 14);
        BOLLINGER_BANDS_PERCENT_B = cVar15;
        c cVar16 = new c("BOLLINGER_BANDS_WIDTH", 15, "Bollinger Bands Width", null, null, 14);
        BOLLINGER_BANDS_WIDTH = cVar16;
        c cVar17 = new c("CHAIKIN_MONEY_FLOW", 16, "Chaikin Money Flow", null, null, 6);
        CHAIKIN_MONEY_FLOW = cVar17;
        c cVar18 = new c("CHAIKIN_OSCILLATOR", 17, "Chaikin Oscillator", null, null, 14);
        CHAIKIN_OSCILLATOR = cVar18;
        c cVar19 = new c("CHAIKIN_VOLATILITY", 18, "Chaikin Volatility", null, null, 14);
        CHAIKIN_VOLATILITY = cVar19;
        c cVar20 = new c("CHANDE_KROLL_STOP", 19, "Chande Kroll Stop", null, null, 14);
        CHANDE_KROLL_STOP = cVar20;
        c cVar21 = new c("CHANDE_MOMENTUM_OSCILLATOR", 20, "Chande Momentum Oscillator", null, null, 14);
        CHANDE_MOMENTUM_OSCILLATOR = cVar21;
        c cVar22 = new c("CHOP_ZONE", 21, "Chop Zone", null, null, 14);
        CHOP_ZONE = cVar22;
        c cVar23 = new c("CHOPPINESS_INDEX", 22, "Choppiness Index", null, null, 14);
        CHOPPINESS_INDEX = cVar23;
        c cVar24 = new c("COMMODITY_CHANNEL_INDEX", 23, "Commodity Channel Index", null, null, 14);
        COMMODITY_CHANNEL_INDEX = cVar24;
        c cVar25 = new c("CONNORS_RSI", 24, "Connors RSI", null, null, 14);
        CONNORS_RSI = cVar25;
        c cVar26 = new c("COPPOCK_CURVE", 25, "Coppock Curve", null, null, 14);
        COPPOCK_CURVE = cVar26;
        c cVar27 = new c("CORRELATION_LOG", 26, "Correlation - Log", null, null, 14);
        CORRELATION_LOG = cVar27;
        c cVar28 = new c("CORRELATION_COEFFICIENT", 27, "Correlation Coefficient", null, null, 14);
        CORRELATION_COEFFICIENT = cVar28;
        c cVar29 = new c("DETRENDED_PRICE_OSCILLATOR", 28, "Detrended Price Oscillator", null, null, 14);
        DETRENDED_PRICE_OSCILLATOR = cVar29;
        c cVar30 = new c("DIRECTIONAL_MOVEMENT", 29, "Directional Movement", null, null, 14);
        DIRECTIONAL_MOVEMENT = cVar30;
        c cVar31 = new c("DONCHIAN_CHANNELS", 30, "Donchian Channels", null, null, 14);
        DONCHIAN_CHANNELS = cVar31;
        c cVar32 = new c("DOUBLE_EMA", 31, "Double EMA", null, null, 14);
        DOUBLE_EMA = cVar32;
        c cVar33 = new c("EASE_OF_MOVEMENT", 32, "Ease Of Movement", null, null, 6);
        EASE_OF_MOVEMENT = cVar33;
        c cVar34 = new c("ELDERS_FORCE_INDEX", 33, "Elder's Force Index", null, null, 6);
        ELDERS_FORCE_INDEX = cVar34;
        c cVar35 = new c("EMA_CROSS", 34, "EMA Cross", null, null, 14);
        EMA_CROSS = cVar35;
        c cVar36 = new c("ENVELOPES", 35, "Envelopes", null, null, 14);
        ENVELOPES = cVar36;
        c cVar37 = new c("FISHER_TRANSFORM", 36, "Fisher Transform", null, null, 14);
        FISHER_TRANSFORM = cVar37;
        c cVar38 = new c("GUPPY_MULTIPLE_MOVING_AVERAGE", 37, "Guppy Multiple Moving Average", null, null, 14);
        GUPPY_MULTIPLE_MOVING_AVERAGE = cVar38;
        c cVar39 = new c("HISTORICAL_VOLATILITY", 38, "Historical Volatility", null, null, 14);
        HISTORICAL_VOLATILITY = cVar39;
        c cVar40 = new c("HULL_MOVING_AVERAGE", 39, "Hull Moving Average", null, null, 14);
        HULL_MOVING_AVERAGE = cVar40;
        c cVar41 = new c("ICHIMOKU_CLOUD", 40, "Ichimoku Cloud", null, null, 14);
        ICHIMOKU_CLOUD = cVar41;
        c cVar42 = new c("KELTNER_CHANNELS", 41, "Keltner Channels", null, null, 14);
        KELTNER_CHANNELS = cVar42;
        c cVar43 = new c("KLINGER_OSCILLATOR", 42, "Klinger Oscillator", null, null, 6);
        KLINGER_OSCILLATOR = cVar43;
        c cVar44 = new c("KNOW_SURE_THING", 43, "Know Sure Thing", null, null, 14);
        KNOW_SURE_THING = cVar44;
        c cVar45 = new c("LEAST_SQUARES_MOVING_AVERAGE", 44, "Least Squares Moving Average", null, null, 14);
        LEAST_SQUARES_MOVING_AVERAGE = cVar45;
        c cVar46 = new c("LINEAR_REGRESSION_CURVE", 45, "Linear Regression Curve", null, null, 14);
        LINEAR_REGRESSION_CURVE = cVar46;
        c cVar47 = new c("LINEAR_REGRESSION_SLOPE", 46, "Linear Regression Slope", null, null, 14);
        LINEAR_REGRESSION_SLOPE = cVar47;
        c cVar48 = new c("MA_CROSS", 47, "MA Cross", null, null, 14);
        MA_CROSS = cVar48;
        c cVar49 = new c("MA_WITH_EMA_CROSS", 48, "MA with EMA Cross", null, null, 14);
        MA_WITH_EMA_CROSS = cVar49;
        c cVar50 = new c("MACD", 49, "MACD", null, null, 14);
        MACD = cVar50;
        c cVar51 = new c("MAJORIT_YRULE", 50, "Majority Rule", null, null, 14);
        MAJORIT_YRULE = cVar51;
        c cVar52 = new c("MASS_INDEX", 51, "Mass Index", null, null, 14);
        MASS_INDEX = cVar52;
        c cVar53 = new c("MCGINLEY_DYNAMIC", 52, "McGinley Dynamic", null, null, 14);
        MCGINLEY_DYNAMIC = cVar53;
        c cVar54 = new c("MEDIAN_PRICE", 53, "Median Price", null, null, 14);
        MEDIAN_PRICE = cVar54;
        c cVar55 = new c("MOMENTUM", 54, "Momentum", null, null, 14);
        MOMENTUM = cVar55;
        c cVar56 = new c("MONEY_FLOW_INDEX", 55, "Money Flow Index", null, null, 6);
        MONEY_FLOW_INDEX = cVar56;
        c cVar57 = new c("MOVING_AVERAGE", 56, "Moving Average", null, null, 14);
        MOVING_AVERAGE = cVar57;
        c cVar58 = new c("MOVING_AVERAGE_SIMPLE_9", 57, "Moving Average", "Moving Average Simple (9 days)", 9, 8);
        MOVING_AVERAGE_SIMPLE_9 = cVar58;
        c cVar59 = new c("MOVING_AVERAGE_SIMPLE_20", 58, "Moving Average", "Moving Average Simple (20 days)", 20, 8);
        MOVING_AVERAGE_SIMPLE_20 = cVar59;
        c cVar60 = new c("MOVING_AVERAGE_SIMPLE_50", 59, "Moving Average", "Moving Average Simple (50 days)", 50, 8);
        MOVING_AVERAGE_SIMPLE_50 = cVar60;
        c cVar61 = new c("MOVING_AVERAGE_SIMPLE_100", 60, "Moving Average", "Moving Average Simple (100 days)", 100, 8);
        MOVING_AVERAGE_SIMPLE_100 = cVar61;
        c cVar62 = new c("MOVING_AVERAGE_SIMPLE_200", 61, "Moving Average", "Moving Average Simple (200 days)", 200, 8);
        MOVING_AVERAGE_SIMPLE_200 = cVar62;
        c cVar63 = new c("MOVING_AVERAGE_ADAPTIVE", 62, "Moving Average Adaptive", null, null, 14);
        MOVING_AVERAGE_ADAPTIVE = cVar63;
        c cVar64 = new c("MOVING_AVERAGE_CHANNEL", 63, "Moving Average Channel", null, null, 14);
        MOVING_AVERAGE_CHANNEL = cVar64;
        c cVar65 = new c("MOVING_AVERAGE_DOUBLE", 64, "Moving Average Double", null, null, 14);
        MOVING_AVERAGE_DOUBLE = cVar65;
        c cVar66 = new c("MOVING_AVERAGE_EXPONENTIAL", 65, "Moving Average Exponential", null, null, 14);
        MOVING_AVERAGE_EXPONENTIAL = cVar66;
        c cVar67 = new c("MOVING_AVERAGE_HAMMING", 66, "Moving Average Hamming", null, null, 14);
        MOVING_AVERAGE_HAMMING = cVar67;
        c cVar68 = new c("MOVING_AVERAGE_MULTIPLE", 67, "Moving Average Multiple", null, null, 14);
        MOVING_AVERAGE_MULTIPLE = cVar68;
        c cVar69 = new c("MOVING_AVERAGE_TRIPLE", 68, "Moving Average Triple", null, null, 14);
        MOVING_AVERAGE_TRIPLE = cVar69;
        c cVar70 = new c("MOVING_AVERAGE_WEIGHTED", 69, "Moving Average Weighted", null, null, 14);
        MOVING_AVERAGE_WEIGHTED = cVar70;
        c cVar71 = new c("NET_VOLUME", 70, "Net Volume", null, null, 6);
        NET_VOLUME = cVar71;
        c cVar72 = new c("ON_BALANCE_VOLUME", 71, "On Balance Volume", null, null, 6);
        ON_BALANCE_VOLUME = cVar72;
        c cVar73 = new c("PARABOLIC_SAR", 72, "Parabolic SAR", null, null, 14);
        PARABOLIC_SAR = cVar73;
        c cVar74 = new c("PIVOT_POINTS_STANDARD", 73, "Pivot Points Standard", null, null, 14);
        PIVOT_POINTS_STANDARD = cVar74;
        c cVar75 = new c("PRICE_CHANNEL", 74, "Price Channel", null, null, 14);
        PRICE_CHANNEL = cVar75;
        c cVar76 = new c("PRICE_OSCILLATOR", 75, "Price Oscillator", null, null, 14);
        PRICE_OSCILLATOR = cVar76;
        c cVar77 = new c("PRICE_VOLUME_TREND", 76, "Price Volume Trend", null, null, 6);
        PRICE_VOLUME_TREND = cVar77;
        c cVar78 = new c("RATE_OF_CHANGE", 77, "Rate Of Change", null, null, 14);
        RATE_OF_CHANGE = cVar78;
        c cVar79 = new c("RATIO", 78, "Ratio", null, null, 14);
        RATIO = cVar79;
        c cVar80 = new c("RELATIVE_STRENGTH_INDEX", 79, "Relative Strength Index", null, null, 14);
        RELATIVE_STRENGTH_INDEX = cVar80;
        c cVar81 = new c("RELATIVE_STRENGTH_INDEX_14", 80, "Relative Strength Index", "Relative Strength Index (14 days)", 14, 8);
        RELATIVE_STRENGTH_INDEX_14 = cVar81;
        c cVar82 = new c("RELATIVE_VIGOR_INDEX", 81, "Relative Vigor Index", null, null, 14);
        RELATIVE_VIGOR_INDEX = cVar82;
        c cVar83 = new c("RELATIVE_VOLATILITY_INDEX", 82, "Relative Volatility Index", null, null, 14);
        RELATIVE_VOLATILITY_INDEX = cVar83;
        c cVar84 = new c("SMI_ERGODIC_INDICATOR_OSCILLATOR", 83, "SMI Ergodic Indicator/Oscillator", null, null, 14);
        SMI_ERGODIC_INDICATOR_OSCILLATOR = cVar84;
        c cVar85 = new c("SMOOTHED_MOVING_AVERAGE", 84, "Smoothed Moving Average", null, null, 14);
        SMOOTHED_MOVING_AVERAGE = cVar85;
        c cVar86 = new c("SPREAD", 85, "Spread", null, null, 14);
        SPREAD = cVar86;
        c cVar87 = new c("STANDARD_DEVIATION", 86, "Standard Deviation", null, null, 14);
        STANDARD_DEVIATION = cVar87;
        c cVar88 = new c("STANDARD_ERROR", 87, "Standard Error", null, null, 14);
        STANDARD_ERROR = cVar88;
        c cVar89 = new c("STANDARD_ERROR_BANDS", 88, "Standard Error Bands", null, null, 14);
        STANDARD_ERROR_BANDS = cVar89;
        c cVar90 = new c("STOCHASTIC", 89, "Stochastic", null, null, 14);
        STOCHASTIC = cVar90;
        c cVar91 = new c("STOCHASTIC_RSI", 90, "Stochastic RSI", null, null, 14);
        STOCHASTIC_RSI = cVar91;
        c cVar92 = new c("SUPERTREND", 91, "SuperTrend", null, null, 14);
        SUPERTREND = cVar92;
        c cVar93 = new c("TREND_STRENGTH_INDEX", 92, "Trend Strength Index", null, null, 14);
        TREND_STRENGTH_INDEX = cVar93;
        c cVar94 = new c("TRIPL_EEMA", 93, "Triple EMA", null, null, 14);
        TRIPL_EEMA = cVar94;
        c cVar95 = new c("TRIX", 94, "TRIX", null, null, 14);
        TRIX = cVar95;
        c cVar96 = new c("TRUE_STRENGTH_INDEX", 95, "True Strength Index", null, null, 14);
        TRUE_STRENGTH_INDEX = cVar96;
        c cVar97 = new c("TYPICAL_PRICE", 96, "Typical Price", null, null, 14);
        TYPICAL_PRICE = cVar97;
        c cVar98 = new c("ULTIMATE_OSCILLATOR", 97, "Ultimate Oscillator", null, null, 14);
        ULTIMATE_OSCILLATOR = cVar98;
        c cVar99 = new c("VOLATILITY_CLOSE_TO_CLOSE", 98, "Volatility Close-to-Close", null, null, 14);
        VOLATILITY_CLOSE_TO_CLOSE = cVar99;
        c cVar100 = new c("VOLATILITY_INDEX", 99, "Volatility Index", null, null, 14);
        VOLATILITY_INDEX = cVar100;
        c cVar101 = new c("VOLATILITY_OHLC", 100, "Volatility O-H-L-C", null, null, 14);
        VOLATILITY_OHLC = cVar101;
        c cVar102 = new c("VOLATILITY_ZERO_TREND_CLOSE_TO_CLOSE", 101, "Volatility Zero Trend Close-to-Close", null, null, 14);
        VOLATILITY_ZERO_TREND_CLOSE_TO_CLOSE = cVar102;
        c cVar103 = new c("VOLUME", 102, "Volume", null, null, 14);
        VOLUME = cVar103;
        c cVar104 = new c("VOLUME_OSCILLATOR", 103, "Volume Oscillator", null, null, 14);
        VOLUME_OSCILLATOR = cVar104;
        c cVar105 = new c("VOLUME_PROFILE_FIXED_RANGE", 104, "Volume Profile Fixed Range", null, null, 14);
        VOLUME_PROFILE_FIXED_RANGE = cVar105;
        c cVar106 = new c("VOLUME_PROFILE_VISIBLE_RANGE", 105, "Volume Profile Visible Range", null, null, 14);
        VOLUME_PROFILE_VISIBLE_RANGE = cVar106;
        c cVar107 = new c("VORTEX_INDICATOR", 106, "Vortex Indicator", null, null, 14);
        VORTEX_INDICATOR = cVar107;
        c cVar108 = new c("VWAP", 107, "VWAP", null, null, 6);
        VWAP = cVar108;
        c cVar109 = new c("VWMA", LDSFile.EF_DG12_TAG, "VWMA", null, null, 6);
        VWMA = cVar109;
        c cVar110 = new c("WILLIAMS_PERCENT_R", LDSFile.EF_DG13_TAG, "Williams %R", null, null, 14);
        WILLIAMS_PERCENT_R = cVar110;
        c cVar111 = new c("WILLIAMS_ALLIGATOR", LDSFile.EF_DG14_TAG, "Williams Alligator", null, null, 14);
        WILLIAMS_ALLIGATOR = cVar111;
        c cVar112 = new c("WILLIAMS_FRACTAL", LDSFile.EF_DG15_TAG, "Williams Fractal", null, null, 14);
        WILLIAMS_FRACTAL = cVar112;
        c cVar113 = new c("ZIG_ZAG", 112, "Zig Zag", null, null, 14);
        ZIG_ZAG = cVar113;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar36, cVar37, cVar38, cVar39, cVar40, cVar41, cVar42, cVar43, cVar44, cVar45, cVar46, cVar47, cVar48, cVar49, cVar50, cVar51, cVar52, cVar53, cVar54, cVar55, cVar56, cVar57, cVar58, cVar59, cVar60, cVar61, cVar62, cVar63, cVar64, cVar65, cVar66, cVar67, cVar68, cVar69, cVar70, cVar71, cVar72, cVar73, cVar74, cVar75, cVar76, cVar77, cVar78, cVar79, cVar80, cVar81, cVar82, cVar83, cVar84, cVar85, cVar86, cVar87, cVar88, cVar89, cVar90, cVar91, cVar92, cVar93, cVar94, cVar95, cVar96, cVar97, cVar98, cVar99, cVar100, cVar101, cVar102, cVar103, cVar104, cVar105, cVar106, cVar107, cVar108, cVar109, cVar110, cVar111, cVar112, cVar113};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2, String str3, Integer num, int i2) {
        str3 = (i2 & 2) != 0 ? null : str3;
        num = (i2 & 4) != 0 ? null : num;
        boolean z = (i2 & 8) == 0;
        this.value = str2;
        this.displayName = str3;
        this.length = num;
        this.volumeBased = z;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getVolumeBased() {
        return this.volumeBased;
    }
}
