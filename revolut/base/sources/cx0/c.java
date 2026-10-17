package cx0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import au0.o4;
import az0.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f109879a = j.b(new af0.a(7));

    public static final class a {
        private a() {
        }

        public static final void a(a aVar, Animator animator, View view) {
            aVar.getClass();
            animator.addListener(new o0(view, new d(animator), 2));
            animator.addListener(new b(view, 0));
            animator.start();
        }

        public static final Float b(a aVar, ValueAnimator valueAnimator) {
            aVar.getClass();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Float) {
                return (Float) animatedValue;
            }
            return null;
        }
    }

    public static void b(StickerView view) {
        Animator animatorA;
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.internal_jump_animation_tag);
        d dVar = tag2 instanceof d ? (d) tag2 : null;
        if (dVar != null && (animatorA = dVar.a()) != null) {
            animatorA.end();
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.getOverlay().clear();
    }

    public static void c(ViewGroup view) {
        Animator animatorA;
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.internal_jump_animation_tag);
        d dVar = tag2 instanceof d ? (d) tag2 : null;
        if (dVar != null && (animatorA = dVar.a()) != null) {
            animatorA.end();
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    public static ValueAnimator e(float f, float f4, long j2, long j3, Function1 function1, cx0.a aVar, Function0 function0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f4);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setStartDelay(j3);
        valueAnimatorOfFloat.addUpdateListener(new o4(1, function1));
        valueAnimatorOfFloat.addListener(new f(aVar, function0, 0));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "also(...)");
        return valueAnimatorOfFloat;
    }

    public static /* synthetic */ ValueAnimator f(c cVar, float f, float f4, long j2, long j3, Function1 function1, Function0 function0, int i) {
        Function0 function02 = (i & 64) != 0 ? null : function0;
        cVar.getClass();
        return e(f, f4, j2, j3, function1, null, function02);
    }

    public final void a(View view, long j2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getTag() instanceof d) {
            return;
        }
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        a aVar = Companion;
        ValueAnimator valueAnimatorF = f(this, BitmapDescriptorFactory.HUE_RED, 1.0f, 300L, j2, new ccb.b(view, 2), null, 32);
        valueAnimatorF.setInterpolator((PathInterpolator) this.f109879a.getValue());
        a.a(aVar, valueAnimatorF, view);
    }

    public final ValueAnimator d(View view, float f, float f4, long j2, long j3) {
        ValueAnimator valueAnimatorF = f(this, f, f4, j2, j3, new ccb.b(view, 1), null, 96);
        valueAnimatorF.setInterpolator((PathInterpolator) this.f109879a.getValue());
        return valueAnimatorF;
    }
}
