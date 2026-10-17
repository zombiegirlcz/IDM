package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010/\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0017\u00101\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0017\u00103\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u0017\u00105\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u0017\u00107\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,R\u0017\u00109\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u0017\u0010;\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,¨\u0006="}, d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraExtraLarge", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCornerExtraExtraLarge", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLarge", "getCornerExtraLarge", "CornerExtraLargeIncreased", "getCornerExtraLargeIncreased", "CornerExtraLargeTop", "getCornerExtraLargeTop", "CornerExtraSmall", "getCornerExtraSmall", "CornerExtraSmallTop", "getCornerExtraSmallTop", "CornerFull", "getCornerFull", "CornerLarge", "getCornerLarge", "CornerLargeEnd", "getCornerLargeEnd", "CornerLargeIncreased", "getCornerLargeIncreased", "CornerLargeStart", "getCornerLargeStart", "CornerLargeTop", "getCornerLargeTop", "CornerMedium", "getCornerMedium", "Landroidx/compose/ui/graphics/Shape;", "CornerNone", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerSmall", "getCornerSmall", "Landroidx/compose/foundation/shape/CornerSize;", "CornerValueExtraExtraLarge", "Landroidx/compose/foundation/shape/CornerSize;", "getCornerValueExtraExtraLarge", "()Landroidx/compose/foundation/shape/CornerSize;", "CornerValueExtraLarge", "getCornerValueExtraLarge", "CornerValueExtraLargeIncreased", "getCornerValueExtraLargeIncreased", "CornerValueExtraSmall", "getCornerValueExtraSmall", "CornerValueLarge", "getCornerValueLarge", "CornerValueLargeIncreased", "getCornerValueLargeIncreased", "CornerValueMedium", "getCornerValueMedium", "CornerValueNone", "getCornerValueNone", "CornerValueSmall", "getCornerValueSmall", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShapeTokens {

    @NotNull
    private static final RoundedCornerShape CornerExtraExtraLarge;

    @NotNull
    private static final RoundedCornerShape CornerExtraLarge;

    @NotNull
    private static final RoundedCornerShape CornerExtraLargeIncreased;

    @NotNull
    private static final RoundedCornerShape CornerExtraLargeTop;

    @NotNull
    private static final RoundedCornerShape CornerExtraSmall;

    @NotNull
    private static final RoundedCornerShape CornerExtraSmallTop;

    @NotNull
    private static final RoundedCornerShape CornerLarge;

    @NotNull
    private static final RoundedCornerShape CornerLargeEnd;

    @NotNull
    private static final RoundedCornerShape CornerLargeIncreased;

    @NotNull
    private static final RoundedCornerShape CornerLargeStart;

    @NotNull
    private static final RoundedCornerShape CornerLargeTop;

    @NotNull
    private static final RoundedCornerShape CornerMedium;

    @NotNull
    private static final RoundedCornerShape CornerSmall;

    @NotNull
    private static final CornerSize CornerValueExtraExtraLarge;

    @NotNull
    private static final CornerSize CornerValueExtraLarge;

    @NotNull
    private static final CornerSize CornerValueExtraLargeIncreased;

    @NotNull
    private static final CornerSize CornerValueExtraSmall;

    @NotNull
    private static final CornerSize CornerValueLarge;

    @NotNull
    private static final CornerSize CornerValueLargeIncreased;

    @NotNull
    private static final CornerSize CornerValueMedium;

    @NotNull
    private static final CornerSize CornerValueNone;

    @NotNull
    private static final CornerSize CornerValueSmall;

    @NotNull
    public static final ShapeTokens INSTANCE = new ShapeTokens();

    @NotNull
    private static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.getCircleShape();

    @NotNull
    private static final Shape CornerNone = RectangleShapeKt.getRectangleShape();

    static {
        float f = (float) 48.0d;
        CornerExtraExtraLarge = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f));
        float f4 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f4));
        float f5 = (float) 32.0d;
        CornerExtraLargeIncreased = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f5));
        float f6 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4(Dp.m3297constructorimpl(f4), Dp.m3297constructorimpl(f4), Dp.m3297constructorimpl(f6), Dp.m3297constructorimpl(f6));
        float f32 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f32));
        CornerExtraSmallTop = RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4(Dp.m3297constructorimpl(f32), Dp.m3297constructorimpl(f32), Dp.m3297constructorimpl(f6), Dp.m3297constructorimpl(f6));
        float f35 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f35));
        CornerLargeEnd = RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4(Dp.m3297constructorimpl(f6), Dp.m3297constructorimpl(f35), Dp.m3297constructorimpl(f35), Dp.m3297constructorimpl(f6));
        float f36 = (float) 20.0d;
        CornerLargeIncreased = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f36));
        CornerLargeStart = RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4(Dp.m3297constructorimpl(f35), Dp.m3297constructorimpl(f6), Dp.m3297constructorimpl(f6), Dp.m3297constructorimpl(f35));
        CornerLargeTop = RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4(Dp.m3297constructorimpl(f35), Dp.m3297constructorimpl(f35), Dp.m3297constructorimpl(f6), Dp.m3297constructorimpl(f6));
        float f37 = (float) 12.0d;
        CornerMedium = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f37));
        float f41 = (float) 8.0d;
        CornerSmall = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f41));
        CornerValueExtraExtraLarge = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f));
        CornerValueExtraLarge = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f4));
        CornerValueExtraLargeIncreased = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f5));
        CornerValueExtraSmall = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f32));
        CornerValueLarge = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f35));
        CornerValueLargeIncreased = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f36));
        CornerValueMedium = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f37));
        CornerValueNone = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f6));
        CornerValueSmall = CornerSizeKt.m967CornerSize0680j_4(Dp.m3297constructorimpl(f41));
    }

    private ShapeTokens() {
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraExtraLarge() {
        return CornerExtraExtraLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraLargeIncreased() {
        return CornerExtraLargeIncreased;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    @NotNull
    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerLargeIncreased() {
        return CornerLargeIncreased;
    }

    @NotNull
    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    @NotNull
    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }

    @NotNull
    public final CornerSize getCornerValueExtraExtraLarge() {
        return CornerValueExtraExtraLarge;
    }

    @NotNull
    public final CornerSize getCornerValueExtraLarge() {
        return CornerValueExtraLarge;
    }

    @NotNull
    public final CornerSize getCornerValueExtraLargeIncreased() {
        return CornerValueExtraLargeIncreased;
    }

    @NotNull
    public final CornerSize getCornerValueExtraSmall() {
        return CornerValueExtraSmall;
    }

    @NotNull
    public final CornerSize getCornerValueLarge() {
        return CornerValueLarge;
    }

    @NotNull
    public final CornerSize getCornerValueLargeIncreased() {
        return CornerValueLargeIncreased;
    }

    @NotNull
    public final CornerSize getCornerValueMedium() {
        return CornerValueMedium;
    }

    @NotNull
    public final CornerSize getCornerValueNone() {
        return CornerValueNone;
    }

    @NotNull
    public final CornerSize getCornerValueSmall() {
        return CornerValueSmall;
    }
}
