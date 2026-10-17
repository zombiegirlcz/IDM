package androidx.compose.animation.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "Landroidx/compose/animation/core/Easing;", "getFastOutSlowInEasing", "()Landroidx/compose/animation/core/Easing;", "LinearOutSlowInEasing", "getLinearOutSlowInEasing", "FastOutLinearInEasing", "getFastOutLinearInEasing", "LinearEasing", "getLinearEasing", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class EasingKt {

    @NotNull
    private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    @NotNull
    private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    @NotNull
    private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);

    @NotNull
    private static final Easing LinearEasing = new cie.b(23);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f) {
        return f;
    }

    @NotNull
    public static final Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    @NotNull
    public static final Easing getLinearEasing() {
        return LinearEasing;
    }
}
