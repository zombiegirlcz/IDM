package com.revolut.core.ui_kit.views.navbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.i4;
import tx0.j4;
import tx0.m4;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/SlidingFromTopViewContainer;", "Landroid/widget/LinearLayout;", "Lny0/h;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "tx0/j4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SlidingFromTopViewContainer extends LinearLayout implements ny0.h, ur0.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f59462q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecelerateInterpolator f59464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59465c;
    public final View d;
    public int e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GradientDrawable f59466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f59467h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f59468j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f59469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f59470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i4 f59471n;
    public m4 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0.e f59472p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingFromTopViewContainer(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(boolean z) {
        if (z == this.f59465c) {
            return;
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        final int i = 1;
        if (viewGroup != null && viewGroup.indexOfChild(this) < viewGroup.getChildCount() - 1) {
            bringToFront();
        }
        this.f59465c = z;
        ValueAnimator valueAnimator = this.f59469l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f59470m;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        final int i2 = 2;
        final int i3 = 0;
        DecelerateInterpolator decelerateInterpolator = this.f59464b;
        if (z) {
            setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.i, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tx0.h4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SlidingFromTopViewContainer f275154b;

                {
                    this.f275154b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    int i5 = i3;
                    SlidingFromTopViewContainer slidingFromTopViewContainer = this.f275154b;
                    switch (i5) {
                        case 0:
                            int i6 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.i = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            Iterator it8 = ViewGroupKt.getChildren(slidingFromTopViewContainer).iterator();
                            while (it8.hasNext()) {
                                ((View) it8.next()).setTranslationY(slidingFromTopViewContainer.i);
                            }
                            slidingFromTopViewContainer.invalidate();
                            break;
                        case 1:
                            int i21 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.i = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            Iterator it9 = ViewGroupKt.getChildren(slidingFromTopViewContainer).iterator();
                            while (it9.hasNext()) {
                                ((View) it9.next()).setTranslationY(slidingFromTopViewContainer.i);
                            }
                            slidingFromTopViewContainer.invalidate();
                            break;
                        default:
                            int i22 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.f59468j = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            slidingFromTopViewContainer.invalidate();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.setInterpolator(decelerateInterpolator);
            valueAnimatorOfFloat.setDuration(this.animationDuration);
            valueAnimatorOfFloat.start();
            this.f59469l = valueAnimatorOfFloat;
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.i, -getHeight());
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tx0.h4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SlidingFromTopViewContainer f275154b;

                {
                    this.f275154b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    int i5 = i;
                    SlidingFromTopViewContainer slidingFromTopViewContainer = this.f275154b;
                    switch (i5) {
                        case 0:
                            int i6 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.i = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            Iterator it8 = ViewGroupKt.getChildren(slidingFromTopViewContainer).iterator();
                            while (it8.hasNext()) {
                                ((View) it8.next()).setTranslationY(slidingFromTopViewContainer.i);
                            }
                            slidingFromTopViewContainer.invalidate();
                            break;
                        case 1:
                            int i21 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.i = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            Iterator it9 = ViewGroupKt.getChildren(slidingFromTopViewContainer).iterator();
                            while (it9.hasNext()) {
                                ((View) it9.next()).setTranslationY(slidingFromTopViewContainer.i);
                            }
                            slidingFromTopViewContainer.invalidate();
                            break;
                        default:
                            int i22 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.f59468j = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            slidingFromTopViewContainer.invalidate();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat2.addListener(new aq0.k(this, 15));
            valueAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
            valueAnimatorOfFloat2.setDuration(this.animationDuration);
            valueAnimatorOfFloat2.start();
            this.f59469l = valueAnimatorOfFloat2;
        }
        if (z || this.i + getHeight() > this.f59467h) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.f59468j, 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tx0.h4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SlidingFromTopViewContainer f275154b;

                {
                    this.f275154b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    int i5 = i2;
                    SlidingFromTopViewContainer slidingFromTopViewContainer = this.f275154b;
                    switch (i5) {
                        case 0:
                            int i6 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.i = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            Iterator it8 = ViewGroupKt.getChildren(slidingFromTopViewContainer).iterator();
                            while (it8.hasNext()) {
                                ((View) it8.next()).setTranslationY(slidingFromTopViewContainer.i);
                            }
                            slidingFromTopViewContainer.invalidate();
                            break;
                        case 1:
                            int i21 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.i = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            Iterator it9 = ViewGroupKt.getChildren(slidingFromTopViewContainer).iterator();
                            while (it9.hasNext()) {
                                ((View) it9.next()).setTranslationY(slidingFromTopViewContainer.i);
                            }
                            slidingFromTopViewContainer.invalidate();
                            break;
                        default:
                            int i22 = SlidingFromTopViewContainer.f59462q;
                            slidingFromTopViewContainer.f59468j = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            slidingFromTopViewContainer.invalidate();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat3.setDuration(this.animationDuration);
            valueAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
            valueAnimatorOfFloat3.start();
            this.f59470m = valueAnimatorOfFloat3;
        }
    }

    public final void b(au0.o appBarLayout, RecyclerView recyclerView, j4 slidingBehaviour, boolean z) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        Intrinsics.checkNotNullParameter(slidingBehaviour, "slidingBehaviour");
        Runnable runnable = this.f59472p;
        if (runnable != null) {
            appBarLayout.removeCallbacks(runnable);
        }
        this.f59472p = null;
        this.d.setVisibility(z ? 0 : 8);
        appBarLayout.s(this);
        b0.e eVar = new b0.e(this, appBarLayout, recyclerView, slidingBehaviour, 14);
        this.f59472p = eVar;
        appBarLayout.post(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (getBackground() != null) {
            throw new IllegalStateException("You must not set background to SlidingFromTopViewContainer. Set bbackground to it's children instead.");
        }
        int height = getHeight();
        int i = this.f59467h;
        int height2 = ((float) (height - i)) + this.i < ((float) i) ? (int) (getHeight() + this.i) : 0;
        GradientDrawable gradientDrawable = this.f59466g;
        Rect bounds = gradientDrawable.getBounds();
        bounds.left = 0;
        bounds.right = getWidth();
        bounds.top = height2;
        bounds.bottom = height2 + i;
        gradientDrawable.setAlpha((int) (255 * this.f59468j));
        gradientDrawable.draw(canvas);
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF57232a() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.k) {
            return;
        }
        View view = this.d;
        addView(view);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, iK));
        if (!this.f59465c) {
            this.i = (-getHeight()) - iK;
            Iterator it8 = ViewGroupKt.getChildren(this).iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).setTranslationY(this.i);
            }
        }
        this.k = true;
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.e != i3) {
            this.e = i3;
            int[] iArr = this.f;
            iArr[0] = i3;
            iArr[1] = io0.a.b(BitmapDescriptorFactory.HUE_RED, i3);
            this.f59466g.setColors(iArr);
        }
    }

    public final void setAnimationDuration(long j2) {
        this.animationDuration = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingFromTopViewContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animationDuration = 400L;
        this.f59464b = new DecelerateInterpolator(2.0f);
        int iS = kli.a.s(R$attr.uikit_windowBackground, context);
        this.e = iS;
        int[] iArr = {iS, io0.a.b(BitmapDescriptorFactory.HUE_RED, iS)};
        this.f = iArr;
        setOrientation(1);
        setVisibility(4);
        View view = new View(context);
        view.setBackground(view.getResources().getDrawable(R$drawable.uikit_bottom_bar_shadow, context.getTheme()));
        view.setRotation(180.0f);
        this.d = view;
        this.f59466g = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        this.f59467h = kli.a.k(context, 16.0f);
    }
}
