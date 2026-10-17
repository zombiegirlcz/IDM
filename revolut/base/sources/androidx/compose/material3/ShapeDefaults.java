package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.tokens.ShapeTokens;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010 \u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001a\u0010$\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001a\u0010&\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001a\u0010*\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001b¨\u0006."}, d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "Small", "getSmall", "Medium", "getMedium", "Large", "getLarge", "LargeIncreased", "getLargeIncreased$material3", "ExtraLarge", "getExtraLarge", "ExtraLargeIncreased", "getExtraLargeIncreased$material3", "ExtraExtraLarge", "getExtraExtraLarge$material3", "Landroidx/compose/foundation/shape/CornerSize;", "CornerNone", "Landroidx/compose/foundation/shape/CornerSize;", "getCornerNone$material3", "()Landroidx/compose/foundation/shape/CornerSize;", "CornerExtraSmall", "getCornerExtraSmall$material3", "CornerSmall", "getCornerSmall$material3", "CornerMedium", "getCornerMedium$material3", "CornerLarge", "getCornerLarge$material3", "CornerLargeIncreased", "getCornerLargeIncreased$material3", "CornerExtraLarge", "getCornerExtraLarge$material3", "CornerExtraLargeIncreased", "getCornerExtraLargeIncreased$material3", "CornerExtraExtraLarge", "getCornerExtraExtraLarge$material3", "CornerFull", "getCornerFull$material3", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShapeDefaults {

    @NotNull
    private static final CornerSize CornerExtraExtraLarge;

    @NotNull
    private static final CornerSize CornerExtraLarge;

    @NotNull
    private static final CornerSize CornerExtraLargeIncreased;

    @NotNull
    private static final CornerSize CornerExtraSmall;

    @NotNull
    private static final CornerSize CornerFull;

    @NotNull
    private static final CornerSize CornerLarge;

    @NotNull
    private static final CornerSize CornerLargeIncreased;

    @NotNull
    private static final CornerSize CornerMedium;

    @NotNull
    private static final CornerSize CornerNone;

    @NotNull
    private static final CornerSize CornerSmall;

    @NotNull
    private static final CornerBasedShape ExtraExtraLarge;

    @NotNull
    private static final CornerBasedShape ExtraLarge;

    @NotNull
    private static final CornerBasedShape ExtraLargeIncreased;

    @NotNull
    private static final CornerBasedShape ExtraSmall;

    @NotNull
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();

    @NotNull
    private static final CornerBasedShape Large;

    @NotNull
    private static final CornerBasedShape LargeIncreased;

    @NotNull
    private static final CornerBasedShape Medium;

    @NotNull
    private static final CornerBasedShape Small;

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        ExtraSmall = shapeTokens.getCornerExtraSmall();
        Small = shapeTokens.getCornerSmall();
        Medium = shapeTokens.getCornerMedium();
        Large = shapeTokens.getCornerLarge();
        LargeIncreased = shapeTokens.getCornerLargeIncreased();
        ExtraLarge = shapeTokens.getCornerExtraLarge();
        ExtraLargeIncreased = shapeTokens.getCornerExtraLargeIncreased();
        ExtraExtraLarge = shapeTokens.getCornerExtraExtraLarge();
        CornerNone = shapeTokens.getCornerValueNone();
        CornerExtraSmall = shapeTokens.getCornerValueExtraSmall();
        CornerSmall = shapeTokens.getCornerValueSmall();
        CornerMedium = shapeTokens.getCornerValueMedium();
        CornerLarge = shapeTokens.getCornerValueLarge();
        CornerLargeIncreased = shapeTokens.getCornerValueLargeIncreased();
        CornerExtraLarge = shapeTokens.getCornerValueExtraLarge();
        CornerExtraLargeIncreased = shapeTokens.getCornerValueExtraLargeIncreased();
        CornerExtraExtraLarge = shapeTokens.getCornerValueExtraExtraLarge();
        CornerFull = CornerSizeKt.CornerSize(100);
    }

    private ShapeDefaults() {
    }

    @NotNull
    public final CornerSize getCornerNone$material3() {
        return CornerNone;
    }

    @NotNull
    public final CornerBasedShape getExtraExtraLarge$material3() {
        return ExtraExtraLarge;
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return ExtraLarge;
    }

    @NotNull
    public final CornerBasedShape getExtraLargeIncreased$material3() {
        return ExtraLargeIncreased;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return ExtraSmall;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return Large;
    }

    @NotNull
    public final CornerBasedShape getLargeIncreased$material3() {
        return LargeIncreased;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return Medium;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return Small;
    }
}
