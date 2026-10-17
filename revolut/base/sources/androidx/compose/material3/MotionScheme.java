package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.StandardMotionTokens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\ba\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\n\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/MotionScheme;", "", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "defaultSpatialSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "fastEffectsSpec", "slowEffectsSpec", "Companion", "StandardMotionSchemeImpl", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MotionScheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/material3/MotionScheme$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/MotionScheme;", "standard$material3", "()Landroidx/compose/material3/MotionScheme;", "standard", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final MotionScheme standard$material3() {
            return StandardMotionSchemeImpl.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\rH\u0016J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\rH\u0016J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\rH\u0016J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\rH\u0016J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\rH\u0016J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/MotionScheme$StandardMotionSchemeImpl;", "Landroidx/compose/material3/MotionScheme;", "<init>", "()V", "defaultSpatialSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "fastEffectsSpec", "slowEffectsSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "T", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StandardMotionSchemeImpl implements MotionScheme {

        @NotNull
        public static final StandardMotionSchemeImpl INSTANCE = new StandardMotionSchemeImpl();

        @NotNull
        private static final SpringSpec<Object> defaultEffectsSpec;

        @NotNull
        private static final SpringSpec<Object> defaultSpatialSpec;

        @NotNull
        private static final SpringSpec<Object> fastEffectsSpec;

        @NotNull
        private static final SpringSpec<Object> fastSpatialSpec;

        @NotNull
        private static final SpringSpec<Object> slowEffectsSpec;

        @NotNull
        private static final SpringSpec<Object> slowSpatialSpec;

        static {
            StandardMotionTokens standardMotionTokens = StandardMotionTokens.INSTANCE;
            defaultSpatialSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringDefaultSpatialDamping(), standardMotionTokens.getSpringDefaultSpatialStiffness(), null, 4, null);
            fastSpatialSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringFastSpatialDamping(), standardMotionTokens.getSpringFastSpatialStiffness(), null, 4, null);
            slowSpatialSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringSlowSpatialDamping(), standardMotionTokens.getSpringSlowSpatialStiffness(), null, 4, null);
            defaultEffectsSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringDefaultEffectsDamping(), standardMotionTokens.getSpringDefaultEffectsStiffness(), null, 4, null);
            fastEffectsSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringFastEffectsDamping(), standardMotionTokens.getSpringFastEffectsStiffness(), null, 4, null);
            slowEffectsSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringSlowEffectsDamping(), standardMotionTokens.getSpringSlowEffectsStiffness(), null, 4, null);
        }

        private StandardMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        @NotNull
        public <T> FiniteAnimationSpec<T> defaultEffectsSpec() {
            SpringSpec<Object> springSpec = defaultEffectsSpec;
            Intrinsics.i(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        @NotNull
        public <T> FiniteAnimationSpec<T> defaultSpatialSpec() {
            SpringSpec<Object> springSpec = defaultSpatialSpec;
            Intrinsics.i(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        @NotNull
        public <T> FiniteAnimationSpec<T> fastEffectsSpec() {
            SpringSpec<Object> springSpec = fastEffectsSpec;
            Intrinsics.i(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        @NotNull
        public <T> FiniteAnimationSpec<T> fastSpatialSpec() {
            SpringSpec<Object> springSpec = fastSpatialSpec;
            Intrinsics.i(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        @NotNull
        public <T> FiniteAnimationSpec<T> slowEffectsSpec() {
            SpringSpec<Object> springSpec = slowEffectsSpec;
            Intrinsics.i(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        @NotNull
        public <T> FiniteAnimationSpec<T> slowSpatialSpec() {
            SpringSpec<Object> springSpec = slowSpatialSpec;
            Intrinsics.i(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return springSpec;
        }
    }

    @NotNull
    <T> FiniteAnimationSpec<T> defaultEffectsSpec();

    @NotNull
    <T> FiniteAnimationSpec<T> defaultSpatialSpec();

    @NotNull
    <T> FiniteAnimationSpec<T> fastEffectsSpec();

    @NotNull
    <T> FiniteAnimationSpec<T> fastSpatialSpec();

    @NotNull
    <T> FiniteAnimationSpec<T> slowEffectsSpec();

    @NotNull
    <T> FiniteAnimationSpec<T> slowSpatialSpec();
}
