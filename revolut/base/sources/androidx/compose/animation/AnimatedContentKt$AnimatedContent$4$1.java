package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/ContentTransform;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedContentKt$AnimatedContent$4$1<S> extends u implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {
    public static final AnimatedContentKt$AnimatedContent$4$1 INSTANCE = new AnimatedContentKt$AnimatedContent$4$1();

    public AnimatedContentKt$AnimatedContent$4$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), BitmapDescriptorFactory.HUE_RED, 2, null).plus(EnterExitTransitionKt.m551scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), BitmapDescriptorFactory.HUE_RED, 2, null));
    }
}
