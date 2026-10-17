package com.revolut.core.ui_kit.background;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import aq0.k;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import d7.e0;
import d7.j;
import java.util.ArrayDeque;
import k7.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import po0.a0;
import po0.b0;
import po0.c0;
import po0.v;
import po0.x;
import po0.y;
import po0.z;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/revolut/core/ui_kit/background/StatefulAnimatedBackground;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "type", "", "setBackgroundType", "(Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;)V", "Lcom/airbnb/lottie/LottieAnimationView;", "getLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "po0/b0", "po0/a0", "po0/x", "po0/z", "po0/y", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatefulAnimatedBackground extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f51498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f51499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f51500c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatefulAnimatedBackground(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LottieAnimationView getLottieView() {
        return this.f51498a.f237866b;
    }

    public final void a() {
        this.f51499b.clear();
        getLottieView().cancelAnimation();
        getLottieView().setMinAndMaxFrame(0, (int) getLottieView().getMaxFrame());
        getLottieView().setFrame(0);
    }

    public final void b(String markerName, b0 repeatCount) {
        Intrinsics.checkNotNullParameter(markerName, "markerName");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        ArrayDeque arrayDeque = this.f51499b;
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.add(new x(markerName, repeatCount));
        if (!zIsEmpty || getLottieView().getComposition() == null) {
            return;
        }
        c();
    }

    public final void c() {
        j composition = getLottieView().getComposition();
        if (composition == null) {
            return;
        }
        x xVar = (x) this.f51499b.peek();
        if (xVar == null && (xVar = this.f51500c.d) == null) {
            return;
        }
        i iVarD = composition.d(xVar.f237869a);
        if (iVarD == null) {
            a();
            return;
        }
        float f = iVarD.f181772b;
        int i = (int) f;
        getLottieView().setMinAndMaxFrame(i, (int) (f + iVarD.f181773c));
        getLottieView().setRepeatCount(xVar.f237870b.a());
        getLottieView().setFrame(i);
        if (getLottieView().isAnimating()) {
            return;
        }
        getLottieView().playAnimation();
    }

    public final void d(String markerName, b0 repeatCount) {
        Intrinsics.checkNotNullParameter(markerName, "markerName");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        ArrayDeque arrayDeque = this.f51499b;
        arrayDeque.clear();
        arrayDeque.add(new x(markerName, repeatCount));
        if (getLottieView().getComposition() != null) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51500c.f237874c) {
            ViewCompat.setWindowInsetsAnimationCallback(this, new y(this));
            ViewCompat.setOnApplyWindowInsetsListener(this, new o0.a(24));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f51500c.f237874c) {
            ViewCompat.setWindowInsetsAnimationCallback(this, null);
            ViewCompat.setOnApplyWindowInsetsListener(this, null);
            setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        j composition = getLottieView().getComposition();
        int size = View.MeasureSpec.getSize(i);
        if (composition != null && size > 0) {
            ViewGroup.LayoutParams layoutParams = getLottieView().getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int i3 = c0.f237846a[this.f51500c.f237872a.ordinal()];
                if (i3 == 1) {
                    getLottieView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    setClipChildren(false);
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    layoutParams2.gravity = 0;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    getLottieView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                    setClipChildren(true);
                    layoutParams2.width = -1;
                    layoutParams2.height = (int) (size * (composition.f111687q / composition.f111686p));
                    layoutParams2.gravity = 80;
                }
                int i5 = layoutParams2.height;
                getLottieView().setTranslationY(((i5 > 0 ? Integer.valueOf(i5) : null) != null ? r4.intValue() : composition.f111687q) * this.f51500c.f237873b);
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setBackgroundType(AnimatedBackgroundType type) {
        z zVar = this.f51500c;
        z.Companion.getClass();
        z zVar2 = Intrinsics.f(type, AnimatedBackgroundType.ONBOARDING.f51478a) ? new z(a0.FIT_BOTTOM, 0.375f, true, new x("loop", b0.INFINITE)) : z.e;
        this.f51500c = zVar2;
        boolean z = zVar.f237874c;
        boolean z3 = zVar2.f237874c;
        if (z != z3) {
            if (z3) {
                ViewCompat.setWindowInsetsAnimationCallback(this, new y(this));
                ViewCompat.setOnApplyWindowInsetsListener(this, new o0.a(24));
            } else {
                ViewCompat.setWindowInsetsAnimationCallback(this, null);
                ViewCompat.setOnApplyWindowInsetsListener(this, null);
                setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }
        this.f51498a.a(type);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatefulAnimatedBackground(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatefulAnimatedBackground(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51498a = new v(this);
        this.f51499b = new ArrayDeque();
        z.Companion.getClass();
        this.f51500c = z.e;
        e0 e0Var = new e0() { // from class: po0.w
            @Override // d7.e0
            public final void a() {
                int i2 = StatefulAnimatedBackground.d;
                StatefulAnimatedBackground statefulAnimatedBackground = this.f237868a;
                statefulAnimatedBackground.requestLayout();
                statefulAnimatedBackground.c();
            }
        };
        k kVar = new k(this, 10);
        getLottieView().addLottieOnCompositionLoadedListener(e0Var);
        getLottieView().addAnimatorListener(kVar);
    }

    public /* synthetic */ StatefulAnimatedBackground(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
