package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import wyc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0018\u001a\u00020\t*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001a\u001a\u00020\t*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017\"\u001a\u0010\u001b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u001a\u0010\u001f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e\"\u001a\u0010!\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)\"\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00064"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "trackColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "gapSize", "CircularProgressIndicator-4lLiAd8", "(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawDeterminateCircularIndicator", "LinearIndicatorWidth", "F", "getLinearIndicatorWidth", "()F", "LinearIndicatorHeight", "getLinearIndicatorHeight", "StopIndicatorTrailingSpace", "getStopIndicatorTrailingSpace", "CircularIndicatorDiameter", "getCircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "LinearIndeterminateProgressEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getLinearIndeterminateProgressEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "CircularProgressEasing", "getCircularProgressEasing", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "getCircularIndeterminateGlobalRotationAnimationSpec", "()Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "circularIndeterminateGlobalRotationAnimationSpec", "getCircularIndeterminateRotationAnimationSpec", "circularIndeterminateRotationAnimationSpec", "getCircularIndeterminateProgressAnimationSpec", "circularIndeterminateProgressAnimationSpec", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ProgressIndicatorKt {

    @NotNull
    private static final CubicBezierEasing CircularProgressEasing;

    @NotNull
    private static final CubicBezierEasing LinearIndeterminateProgressEasing;
    private static final float LinearIndicatorWidth = Dp.m3297constructorimpl(240);
    private static final float LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m1501getHeightD9Ej5fM();
    private static final float StopIndicatorTrailingSpace = Dp.m3297constructorimpl(6);
    private static final float CircularIndicatorDiameter = CircularProgressIndicatorTokens.INSTANCE.m1437getSizeD9Ej5fM();

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        LinearIndeterminateProgressEasing = motionTokens.getEasingEmphasizedAccelerateCubicBezier();
        CircularProgressEasing = motionTokens.getEasingStandardCubicBezier();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX INFO: renamed from: CircularProgressIndicator-4lLiAd8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1385CircularProgressIndicator4lLiAd8(androidx.compose.ui.Modifier r32, long r33, float r35, long r36, int r38, float r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1385CircularProgressIndicator4lLiAd8(androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    @yhm.d
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1386CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier r20, long r21, float r23, long r24, int r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1386CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_4lLiAd8$lambda$34$lambda$33(State state, int i, float f, float f4, State state2, State state3, long j2, Stroke stroke, long j3, DrawScope drawScope) {
        float fFloatValue = ((Number) state.getValue()).floatValue() * 360.0f;
        if (!StrokeCap.m2111equalsimpl0(i, StrokeCap.INSTANCE.m2114getButtKaPHkGw()) && Float.intBitsToFloat((int) (drawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (drawScope.mo2212getSizeNHjbRc() >> 32))) {
            f = Dp.m3297constructorimpl(f + f4);
        }
        float fMo764toDpu2uoSUM = (f / ((float) (((double) drawScope.mo764toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo2212getSizeNHjbRc() >> 32)))) * 3.141592653589793d))) * 360.0f;
        float fFloatValue2 = ((Number) state3.getValue()).floatValue() + ((Number) state2.getValue()).floatValue();
        long jMo2211getCenterF1C5BW0 = drawScope.mo2211getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2195rotateUv8p0NA(fFloatValue2, jMo2211getCenterF1C5BW0);
            m1387drawCircularIndicator42QJj7c(drawScope, fFloatValue + Math.min(fFloatValue, fMo764toDpu2uoSUM), (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo764toDpu2uoSUM) * 2), j2, stroke);
            m1388drawDeterminateCircularIndicator42QJj7c(drawScope, BitmapDescriptorFactory.HUE_RED, fFloatValue, j3, stroke);
            com.revolut.data.database.models.openbanking.d.B(drawContext, jMo2190getSizeNHjbRc);
            return Unit.f186387a;
        } catch (Throwable th10) {
            com.revolut.data.database.models.openbanking.d.B(drawContext, jMo2190getSizeNHjbRc);
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_4lLiAd8$lambda$35(Modifier modifier, long j2, float f, long j3, int i, float f4, int i2, int i3, Composer composer, int i5) {
        m1385CircularProgressIndicator4lLiAd8(modifier, j2, f, j3, i, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_LxG7B9w$lambda$30(Modifier modifier, long j2, float f, long j3, int i, int i2, int i3, Composer composer, int i5) {
        m1386CircularProgressIndicatorLxG7B9w(modifier, j2, f, j3, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_circularIndeterminateProgressAnimationSpec_$lambda$42(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(6000);
        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.87f), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS), CircularProgressEasing);
        keyframesSpecConfig.at(Float.valueOf(0.1f), 6000);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_circularIndeterminateRotationAnimationSpec_$lambda$41(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(6000);
        Float fValueOf = Float.valueOf(90.0f);
        keyframesSpecConfig.using(keyframesSpecConfig.at(fValueOf, 300), MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier());
        keyframesSpecConfig.at(fValueOf, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        Float fValueOf2 = Float.valueOf(180.0f);
        keyframesSpecConfig.at(fValueOf2, 1800);
        keyframesSpecConfig.at(fValueOf2, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        Float fValueOf3 = Float.valueOf(270.0f);
        keyframesSpecConfig.at(fValueOf3, 3300);
        keyframesSpecConfig.at(fValueOf3, 4500);
        Float fValueOf4 = Float.valueOf(360.0f);
        keyframesSpecConfig.at(fValueOf4, 4800);
        keyframesSpecConfig.at(fValueOf4, 6000);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1387drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f4, long j2, Stroke stroke) {
        float f5 = 2;
        float width = stroke.getWidth() / f5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo2212getSizeNHjbRc() >> 32)) - (f5 * width);
        DrawScope.m2198drawArcyD3GUKo$default(drawScope, j2, f, f4, false, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(width)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32)), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax)), BitmapDescriptorFactory.HUE_RED, stroke, null, 0, 832, null);
    }

    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1388drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f4, long j2, Stroke stroke) {
        m1387drawCircularIndicator42QJj7c(drawScope, f, f4, j2, stroke);
    }

    @NotNull
    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateGlobalRotationAnimationSpec() {
        return AnimationSpecKt.m575infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
    }

    @NotNull
    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateProgressAnimationSpec() {
        return AnimationSpecKt.m575infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new p(28)), null, 0L, 6, null);
    }

    @NotNull
    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateRotationAnimationSpec() {
        return AnimationSpecKt.m575infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new p(29)), null, 0L, 6, null);
    }
}
