package com.revolut.core.ui_kit.views.navbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.collection.MutableIntSet;
import androidx.lifecycle.Lifecycle;
import au0.o5;
import aw0.s8;
import aw0.w8;
import aw0.x8;
import az0.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.ScaledDrawable;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.s0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jv0.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mx0.w5;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import tjf.p0;
import tx0.a5;
import tx0.b5;
import tx0.c5;
import tx0.d5;
import tx0.o1;
import tx0.s4;
import tx0.t4;
import tx0.u4;
import tx0.w4;
import tx0.x4;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00049!:;J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\r2\u001c\u0010\u0010\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010'R(\u0010-\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010\r8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/WallpaperAssetSwitcher;", "Landroid/widget/FrameLayout;", "Lau0/o5;", "Lny0/h;", "", "color", "", "setDefaultBackgroundColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "Lkotlin/Function1;", "Lyhm/m;", "onRenderResultAction", "(Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;Lkotlin/jvm/functions/Function1;)V", "backgroundDrawable", "setAverageColorAsBackground", "", "getContentPosition", "()J", "getContentDuration", "Loz0/b;", "scaleType", "setVideoScaleType", "(Loz0/b;)V", "token", "", "paused", "setPlaybackPaused", "(IZ)V", "Ltx0/t4;", "fixedBounds", "setFixedBounds", "(Ltx0/t4;)V", "enabled", "setScreenshotDrawingMode", "(Z)V", "value", "j", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "getCurrentBackground", "()Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "currentBackground", "Lkotlinx/coroutines/CoroutineScope;", "w", "Lkotlin/Lazy;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "Companion", "tx0/x4", "tx0/w4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WallpaperAssetSwitcher extends FrameLayout implements o5, ny0.h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitPlayerView f59491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f59492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f59493c;
    public ValueAnimator d;
    public final ColorDrawable e;
    public final ColorDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x8 f59494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f59495h;
    public NavBarWithContainerBackground i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public NavBarWithContainerBackground currentBackground;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableIntSet f59497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f59498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f59499n;
    public AnimatorSet o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f59500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Lifecycle f59502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f59503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a5 f59504t;
    public final b5 u;
    public final t70.x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy scope;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f59506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f59507y;
    public t4 z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperAssetSwitcher(@NotNull Context context) {
        this(context, null, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit b(WallpaperAssetSwitcher wallpaperAssetSwitcher, jv0.m mVar) {
        ihm.f fVar = wallpaperAssetSwitcher.f59498m;
        boolean z = mVar instanceof m.a;
        if (z && wallpaperAssetSwitcher.k) {
            if (wallpaperAssetSwitcher.getBackground() instanceof x4) {
                wallpaperAssetSwitcher.setBackground(wallpaperAssetSwitcher.e);
            }
        } else if (z) {
            if (!wallpaperAssetSwitcher.f59501q) {
                a2 a2Var = wallpaperAssetSwitcher.f59506x;
                Object[] objArr = 0;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                wallpaperAssetSwitcher.f59506x = null;
                if (wallpaperAssetSwitcher.f59499n) {
                    wallpaperAssetSwitcher.f59506x = e0.C(wallpaperAssetSwitcher.getScope(), null, null, new p0(wallpaperAssetSwitcher, objArr == true ? 1 : 0, 21), 3);
                } else {
                    NavBarWithContainerBackground currentBackground = wallpaperAssetSwitcher.getCurrentBackground();
                    Bitmap bitmapG = wallpaperAssetSwitcher.f59491a.g(null);
                    if (bitmapG != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(wallpaperAssetSwitcher.getContext().getResources(), bitmapG);
                        wallpaperAssetSwitcher.f59495h.onNext(new w8(wallpaperAssetSwitcher.g(bitmapDrawable, currentBackground), (!(currentBackground instanceof NavBarWithContainerBackground.ImageBackground) || ((NavBarWithContainerBackground.ImageBackground) currentBackground).d == null) ? bitmapDrawable : null));
                    }
                }
                wallpaperAssetSwitcher.f59501q = true;
            }
            wallpaperAssetSwitcher.f59503s.removeCallbacks(wallpaperAssetSwitcher.v);
            wallpaperAssetSwitcher.k = true;
            wallpaperAssetSwitcher.l();
            fVar.onNext(mVar);
        } else if (mVar instanceof jv0.p) {
            if (!((jv0.p) mVar).f178758a) {
                wallpaperAssetSwitcher.j();
            }
            fVar.onNext(mVar);
        } else if ((mVar instanceof jv0.o) || (mVar instanceof m.c) || (mVar instanceof jv0.q)) {
            fVar.onNext(mVar);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher r12, android.graphics.drawable.Drawable r13, com.revolut.core.ui_kit.models.NavBarWithContainerBackground r14, gim.c r15) throws java.lang.Exception {
        /*
            boolean r1 = r15 instanceof tx0.y4
            if (r1 == 0) goto L13
            r1 = r15
            tx0.y4 r1 = (tx0.y4) r1
            int r2 = r1.f275283y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.f275283y = r2
            goto L18
        L13:
            tx0.y4 r1 = new tx0.y4
            r1.<init>(r12, r15)
        L18:
            java.lang.Object r0 = r1.f275281w
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f275283y
            r10 = 2
            r11 = 1
            if (r2 == 0) goto L3d
            if (r2 == r11) goto L32
            if (r2 != r10) goto L2a
            yhm.o.b(r0)
            goto L80
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r2 = r1.v
            android.graphics.drawable.Drawable r4 = r1.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L3a
            goto L80
        L3a:
            r0 = move-exception
            r5 = r2
            goto L62
        L3d:
            yhm.o.b(r0)
            aw0.x8 r5 = r12.g(r13, r14)     // Catch: java.lang.Exception -> L5f
            skm.p0 r0 = skm.p0.f264001a     // Catch: java.lang.Exception -> L5f
            tkm.e r0 = zkm.o.f323119a     // Catch: java.lang.Exception -> L5f
            tx0.z4 r2 = new tx0.z4     // Catch: java.lang.Exception -> L5f
            r8 = 0
            r3 = 0
            r4 = r12
            r6 = r13
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L5f
            r1.u = r13     // Catch: java.lang.Exception -> L5f
            r1.v = r14     // Catch: java.lang.Exception -> L5f
            r1.f275283y = r11     // Catch: java.lang.Exception -> L5f
            java.lang.Object r0 = skm.e0.J(r0, r2, r1)     // Catch: java.lang.Exception -> L5f
            if (r0 != r9) goto L80
            goto L82
        L5f:
            r0 = move-exception
            r4 = r13
            r5 = r14
        L62:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L83
            skm.p0 r0 = skm.p0.f264001a
            tkm.e r0 = zkm.o.f323119a
            qqj.g r2 = new qqj.g
            r7 = 28
            r6 = 0
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r1.u = r6
            r1.v = r6
            r1.f275283y = r10
            java.lang.Object r0 = skm.e0.J(r0, r2, r1)
            if (r0 != r9) goto L80
            goto L82
        L80:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L82:
            return r9
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher.c(com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher, android.graphics.drawable.Drawable, com.revolut.core.ui_kit.models.NavBarWithContainerBackground, gim.c):java.lang.Object");
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    public final void d(ColorDrawable colorDrawable) {
        Drawable background = getBackground();
        ColorDrawable colorDrawable2 = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable2 == null || colorDrawable2.getColor() == colorDrawable.getColor()) {
            setBackground(colorDrawable);
            return;
        }
        ColorDrawable colorDrawable3 = new ColorDrawable(colorDrawable2.getColor());
        setBackground(colorDrawable3);
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(colorDrawable2.getColor(), colorDrawable.getColor());
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.addUpdateListener(new w5(colorDrawable3, 11));
        valueAnimatorOfArgb.addListener(new o0(this, colorDrawable, 11));
        valueAnimatorOfArgb.start();
        this.d = valueAnimatorOfArgb;
    }

    public final ObjectAnimator f(View view, boolean z, boolean z3) {
        boolean z4 = z3 || !this.f59499n;
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if ((view.getVisibility() == 0) == z && view.getAlpha() == f) {
            return null;
        }
        if (z4) {
            view.setVisibility(z ? 0 : 4);
            view.setAlpha(f);
            return null;
        }
        if (z) {
            view.setVisibility(0);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), f);
        if (!z) {
            Intrinsics.h(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addListener(new cx0.b(view, 11));
        }
        objectAnimatorOfFloat.setDuration(300L);
        return objectAnimatorOfFloat;
    }

    public final x8 g(Drawable drawable, NavBarWithContainerBackground navBarWithContainerBackground) {
        s8 d;
        Color color;
        if ((navBarWithContainerBackground instanceof NavBarWithContainerBackground.ImageBackground) && (color = ((NavBarWithContainerBackground.ImageBackground) navBarWithContainerBackground).d) != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable = new ColorDrawable(io0.a.c(context, color));
        }
        if (drawable == null || drawable.equals(this.f)) {
            return this.f59494g;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (navBarWithContainerBackground == null || (d = navBarWithContainerBackground.getD()) == null) {
            d = s8.DEFAULT;
        }
        return s0.d(drawable, context2, d);
    }

    public final long getContentDuration() {
        return this.f59491a.getContentDuration();
    }

    public final long getContentPosition() {
        return this.f59491a.getContentPosition();
    }

    @Override // au0.o5
    public NavBarWithContainerBackground getCurrentBackground() {
        return this.currentBackground;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF56471r() {
        return false;
    }

    public final efm.r h() {
        efm.r map = this.f59495h.map(new o1(new tx.f(4), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void i(Drawable drawable, NavBarWithContainerBackground navBarWithContainerBackground) {
        a2 a2Var = this.f59506x;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f59506x = null;
        if ((drawable instanceof BitmapDrawable) && this.f59499n) {
            this.f59506x = e0.C(getScope(), null, null, new twb.b0(this, drawable, navBarWithContainerBackground, continuation, 1), 3);
            return;
        }
        Drawable drawable2 = drawable;
        x8 x8VarG = g(drawable2, navBarWithContainerBackground);
        if ((navBarWithContainerBackground instanceof NavBarWithContainerBackground.ImageBackground) && ((NavBarWithContainerBackground.ImageBackground) navBarWithContainerBackground).d != null) {
            drawable2 = null;
        }
        this.f59495h.onNext(new w8(x8VarG, drawable2));
    }

    public final void j() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Bitmap bitmapG = this.f59491a.g(this.f59500p);
        this.f59500p = bitmapG;
        Intrinsics.checkNotNullParameter(resources, "resources");
        setBackground(new x4(new ScaledDrawable(new BitmapDrawable(resources, bitmapG), com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_CROP)));
    }

    public final void k() {
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AppCompatImageView appCompatImageView = this.f59493c;
        boolean z = appCompatImageView.getVisibility() == 0 && appCompatImageView.getAlpha() == 1.0f && appCompatImageView.getDrawable() != null;
        View view = this.f59492b;
        if (!z) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] elements = {f(view, true, z), f(appCompatImageView, false, !z)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        animatorSet2.playTogether(kotlin.collections.d.L(elements));
        this.o = animatorSet2;
        animatorSet2.start();
    }

    public final void l() {
        ArrayList<Animator> childAnimations;
        Animator animator;
        LottieAnimationView lottieAnimationView = this.f59492b;
        int visibility = lottieAnimationView.getVisibility();
        int i = 0;
        View view = this.f59491a;
        if (visibility != 0) {
            AppCompatImageView appCompatImageView = this.f59493c;
            boolean z = appCompatImageView.getVisibility() == 0 && appCompatImageView.getAlpha() == 1.0f && appCompatImageView.getDrawable() != null;
            AnimatorSet animatorSet = this.o;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            Animator[] elements = {f(view, true, z), f(appCompatImageView, false, !z)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            animatorSet2.playTogether(kotlin.collections.d.L(elements));
            animatorSet2.start();
            this.o = animatorSet2;
            return;
        }
        AnimatorSet animatorSet3 = this.o;
        ObjectAnimator objectAnimator = null;
        if (animatorSet3 != null && (childAnimations = animatorSet3.getChildAnimations()) != null) {
            int size = childAnimations.size();
            while (true) {
                if (i >= size) {
                    animator = null;
                    break;
                }
                animator = childAnimations.get(i);
                Animator animator2 = animator;
                if ((animator2 instanceof ObjectAnimator) && Intrinsics.f(((ObjectAnimator) animator2).getTarget(), lottieAnimationView)) {
                    break;
                } else {
                    i++;
                }
            }
            Animator animator3 = animator;
            if (animator3 != null) {
                objectAnimator = (ObjectAnimator) animator3;
            }
        }
        lottieAnimationView.setVisibility(4);
        view.setAlpha(lottieAnimationView.getAlpha());
        if (objectAnimator != null) {
            objectAnimator.addUpdateListener(new w5(this, 10));
        } else {
            view.setAlpha(1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t80.w wVar = t80.w.f268790a;
        Intrinsics.checkNotNullParameter(this, "hostView");
        b5 playbackOwner = this.u;
        Intrinsics.checkNotNullParameter(playbackOwner, "playbackOwner");
        WeakHashMap weakHashMap = t80.w.f268791b;
        if (!weakHashMap.containsKey(this)) {
            weakHashMap.put(this, playbackOwner);
            addOnAttachStateChangeListener(wVar);
        }
        Lifecycle lifecycleA = te0.w.A(this);
        Lifecycle lifecycle = this.f59502r;
        if (lifecycle == lifecycleA) {
            return;
        }
        a5 a5Var = this.f59504t;
        if (lifecycle != null) {
            lifecycle.removeObserver(a5Var);
        }
        this.f59502r = lifecycleA;
        lifecycleA.addObserver(a5Var);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f59499n = true;
    }

    public void setAverageColorAsBackground(Drawable backgroundDrawable) {
        a2 a2Var = this.f59507y;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f59507y = null;
        this.f59507y = e0.C(getScope(), null, null, new c5(backgroundDrawable, this, null), 3);
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.setBackground(background);
    }

    public void setDefaultBackgroundColor(int color) {
        NavBarWithContainerBackground navBarWithContainerBackground = this.i;
        this.f.setColor(color);
        this.i = new NavBarWithContainerBackground.ImageBackground(new ColorImage(new ColorImage.ColorInteger(color), null), (s8) null, (Color.SolidRes) null, 14);
        if (Intrinsics.f(getCurrentBackground(), navBarWithContainerBackground)) {
            setBackground(this.i, null);
        }
    }

    public final void setFixedBounds(@NotNull t4 fixedBounds) {
        Intrinsics.checkNotNullParameter(fixedBounds, "fixedBounds");
        if (getLayoutParams() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.z = fixedBounds;
        fixedBounds.getClass();
        w4 w4Var = fixedBounds.f275248a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        u4 u4Var = u4.f275249a;
        u4Var.b(context, layoutParams);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams2, "getLayoutParams(...)");
        w4Var.a(context2, layoutParams2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        LottieAnimationView lottieAnimationView = this.f59492b;
        ViewGroup.LayoutParams layoutParams3 = lottieAnimationView.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams3, "getLayoutParams(...)");
        u4Var.b(context3, layoutParams3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ViewGroup.LayoutParams layoutParams4 = lottieAnimationView.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams4, "getLayoutParams(...)");
        w4Var.a(context4, layoutParams4);
        if (getLayoutParams().height > 0) {
            Context context5 = getRootView().getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            float fA = d5.a(context5);
            setPivotY(BitmapDescriptorFactory.HUE_RED);
            setPivotX(getLayoutParams().width / 2.0f);
            setScaleY(fA);
            setScaleX(fA);
        } else {
            setPivotY(getLayoutParams().height / 2.0f);
            setPivotX(getLayoutParams().width / 2.0f);
            setScaleY(1.0f);
            setScaleX(1.0f);
        }
        setLayoutParams(getLayoutParams());
    }

    public final void setPlaybackPaused(int token, boolean paused) {
        LottieAnimationView lottieAnimationView = this.f59492b;
        UiKitPlayerView uiKitPlayerView = this.f59491a;
        MutableIntSet mutableIntSet = this.f59497l;
        if (paused) {
            if (mutableIntSet.add(token) && mutableIntSet.get_size() == 1) {
                uiKitPlayerView.h();
                lottieAnimationView.pauseAnimation();
                return;
            }
            return;
        }
        if (mutableIntSet.remove(token) && mutableIntSet.isEmpty()) {
            uiKitPlayerView.i();
            if ((or0.u.k(this).Q().d(lottieAnimationView) instanceof LottieImage) && mutableIntSet.isEmpty()) {
                lottieAnimationView.resumeAnimation();
            } else {
                lottieAnimationView.pauseAnimation();
            }
        }
    }

    public void setScreenshotDrawingMode(boolean enabled) {
        this.f59491a.setScreenshotDrawingMode(enabled);
    }

    public final void setVideoScaleType(@NotNull oz0.b scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f59491a.setScaleType(scaleType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperAssetSwitcher(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WallpaperAssetSwitcher(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        int i2 = 0;
        boolean z = (i & 4) != 0;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        int i3 = 6;
        UiKitPlayerView uiKitPlayerView = new UiKitPlayerView(context, attributeSet2, i3, i2);
        uiKitPlayerView.setId(R$id.navBarBackground_backgroundPlayerView);
        uiKitPlayerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        uiKitPlayerView.setVisibility(8);
        this.f59491a = uiKitPlayerView;
        UiKitMediaView uiKitMediaView = new UiKitMediaView(context, attributeSet2, i3, i2);
        uiKitMediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LottieAnimationView lottieAnimationViewI = uiKitMediaView.i();
        lottieAnimationViewI.setId(R$id.navBarBackground_mainImageView);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        lottieAnimationViewI.setScaleType(scaleType);
        lottieAnimationViewI.setVisibility(4);
        this.f59492b = lottieAnimationViewI;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.navBarBackground_secondaryImageView);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatImageView.setVisibility(4);
        appCompatImageView.setScaleType(scaleType);
        this.f59493c = appCompatImageView;
        addView(uiKitPlayerView);
        addView(uiKitMediaView);
        addView(appCompatImageView);
        int iS = kli.a.s(R$attr.uikit_colorShimmerPhotoHeader, context);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.e = colorDrawable;
        if (iS == 0) {
            this.f = colorDrawable;
            this.i = NavBarWithContainerBackground.TransparentBackground.f57882a;
        } else {
            this.f = new ColorDrawable(iS);
            this.i = new NavBarWithContainerBackground.ImageBackground(new ColorImage(new ColorImage.ColorInteger(iS), null), (s8) null, (Color.SolidRes) null, 14);
        }
        x8 x8VarD = s0.d(this.f, context, s8.DEFAULT);
        this.f59494g = x8VarD;
        ihm.b bVarE = ihm.b.e(new w8(x8VarD, this.f));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f59495h = bVarE;
        this.f59497l = new MutableIntSet(0, 1, null);
        this.f59498m = v0.a.d("create(...)");
        this.f59503s = new Handler(Looper.getMainLooper());
        this.f59504t = new a5(this);
        this.u = new b5(this);
        this.v = new t70.x(this, 14);
        uiKitPlayerView.setDetachBehavior(jv0.s.PAUSE_ON_DETACH);
        uiKitPlayerView.f57715r.filter(new o1(new s4(this, 0), 20)).subscribe(new o1(new s4(this, 1), 21));
        if (z) {
            setBackground(this.i, null);
        }
        c8g.a.a(this, ny0.a.f220589a, new s4(this, 2));
        this.scope = yhm.j.b(new ts1.h(28));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    @Override // au0.o5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBackground(com.revolut.core.ui_kit.models.NavBarWithContainerBackground r23, kotlin.jvm.functions.Function1<? super yhm.m<? extends android.graphics.drawable.Drawable>, kotlin.Unit> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher.setBackground(com.revolut.core.ui_kit.models.NavBarWithContainerBackground, kotlin.jvm.functions.Function1):void");
    }
}
