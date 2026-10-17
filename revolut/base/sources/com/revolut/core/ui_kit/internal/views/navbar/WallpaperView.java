package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import atg.n;
import au0.n5;
import au0.o5;
import au0.q5;
import au0.u5;
import au0.w5;
import au0.x5;
import au0.y5;
import au0.z5;
import aw0.w8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import jb3.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.c2;
import skm.d0;
import skm.e0;
import skm.p0;
import yhm.m;
import zkm.o;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0004&'\u0019(J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\r\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0007J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperView;", "Landroid/widget/FrameLayout;", "Lau0/o5;", "", "offset", "", "setOffset", "(I)V", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "background", "Lkotlin/Function1;", "Lyhm/m;", "Landroid/graphics/drawable/Drawable;", "onRenderResultAction", "setBackground", "(Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;Lkotlin/jvm/functions/Function1;)V", "color", "setDefaultBackgroundColor", "backgroundDrawable", "setAverageColorAsBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "enabled", "setScreenshotDrawingMode", "(Z)V", "a", "Ljava/lang/Integer;", "getProjectionTag", "()Ljava/lang/Integer;", "projectionTag", "getCurrentBackground", "()Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "currentBackground", "", "getCollapseProgress", "()F", "collapseProgress", "Companion", "au0/x5", "au0/y5", "au0/w5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WallpaperView extends FrameLayout implements o5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Integer projectionTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WallpaperAssetSwitcher f57381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f57382c;
    public final boolean d;
    public w5 e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f57383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q5 f57384h;
    public ViewGroup i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57385j;
    public w8 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x5 f57386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zkm.d f57387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a2 f57388n;
    public final vo0.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f57389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f57390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f57391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WallpaperProjectionOverlayDrawable f57392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f57393t;
    public final int u;
    public final WallpaperAssetOverlayDrawable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n5 f57394w;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.navbar.WallpaperView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperView(@NotNull Context context) {
        this(context, null, null, false, 62);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float getCollapseProgress() {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.f57393t
            r1 = 0
            if (r0 == 0) goto L12
            int r2 = r0.intValue()
            if (r2 <= 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L10
            goto L12
        L10:
            r1 = r0
            goto L1d
        L12:
            int r0 = r3.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L1d
            r1 = r2
        L1d:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L2a
            int r1 = r1.intValue()
            int r2 = r3.u
            if (r1 > r2) goto L2a
            return r0
        L2a:
            float r1 = r3.f57383g
            float r1 = r0 - r1
            r2 = 0
            float r0 = kotlin.ranges.f.f(r1, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.WallpaperView.getCollapseProgress():float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(aw0.w8 r6, android.graphics.drawable.Drawable r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = jh.d.g(r0)
            if (r0 == 0) goto Lb8
            boolean r0 = r5.f57385j
            if (r0 == 0) goto Lb8
            boolean r0 = r5.d
            if (r0 != 0) goto L19
            goto Lb8
        L19:
            aw0.x8 r0 = r6.f10591a
            r2 = 0
            if (r7 == 0) goto L39
            com.revolut.core.ui_kit.internal.views.navbar.WallpaperProjectionOverlayDrawable r3 = r5.f57392s
            if (r3 == 0) goto L2a
            android.graphics.drawable.Drawable r4 = r3.f57377a
            if (r4 != r7) goto L27
            r2 = r3
        L27:
            if (r2 == 0) goto L2a
            goto L3b
        L2a:
            com.revolut.core.ui_kit.internal.views.navbar.WallpaperProjectionOverlayDrawable r2 = new com.revolut.core.ui_kit.internal.views.navbar.WallpaperProjectionOverlayDrawable
            android.content.Context r3 = r5.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r2.<init>(r3, r7)
            r5.f57392s = r2
            goto L3b
        L39:
            r5.f57392s = r2
        L3b:
            if (r2 == 0) goto L57
            float r1 = r5.getCollapseProgress()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = kotlin.ranges.f.f(r1, r3, r4)
            float r3 = r2.f
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L4f
            goto L57
        L4f:
            r2.f = r1
            r2.a()
            r2.invalidateSelf()
        L57:
            aw0.x8 r6 = r6.f10591a
            java.lang.String r1 = "palette"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            aw0.w8 r1 = new aw0.w8
            r1.<init>(r6, r2)
            au0.x5 r6 = r5.f57386l
            r6.f9436b = r1
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L6d
            r7 = r1
            goto L6e
        L6d:
            r7 = r2
        L6e:
            au0.w5 r3 = r5.e
            au0.w5 r4 = au0.w5.NONE
            if (r3 != r4) goto L75
            goto L8f
        L75:
            if (r7 == 0) goto L7a
            au0.w5 r7 = au0.w5.PROJECTION_MASK
            goto L7c
        L7a:
            au0.w5 r7 = au0.w5.OVERLAY_GRADIENT
        L7c:
            if (r3 == r7) goto L8f
            r5.e = r7
            au0.w5 r3 = au0.w5.OVERLAY_GRADIENT
            if (r7 != r3) goto L85
            r2 = r1
        L85:
            com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable r7 = r5.v
            r7.f57373j = r2
            r7.invalidateSelf()
            r5.invalidate()
        L8f:
            com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher r7 = r5.f57381b
            boolean r7 = r7.isAttachedToWindow()
            if (r7 != 0) goto Lb5
            au0.q5 r7 = r5.f57384h
            if (r7 == 0) goto L9c
            goto Lb5
        L9c:
            js0.e r7 = js0.f.Companion
            android.view.ViewGroup r7 = jb3.l.o(r7, r5, r1)
            if (r7 == 0) goto Lae
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            int r0 = r0.e
            r1.<init>(r0)
            r7.setBackground(r1)
        Lae:
            r5.removeCallbacks(r6)
            r5.post(r6)
            return
        Lb5:
            r6.run()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.WallpaperView.b(aw0.w8, android.graphics.drawable.Drawable):void");
    }

    public final void c() {
        if (this.e == w5.NONE) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            if (jh.d.g(context)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f57382c.getClass();
                knm.b.v(kli.a.k(context2, 80.0f), this);
                this.f57394w.a(getWidth(), getHeight(), getPaddingBottom());
                this.f57381b.setTranslationY((-this.f) / 2.0f);
                if (!this.f57389p) {
                    this.f57389p = true;
                    w8 w8Var = this.k;
                    if (w8Var != null) {
                        e(w8Var);
                    }
                }
                w8 w8Var2 = (w8) this.f57386l.f9436b;
                w5 w5Var = (w8Var2 != null ? w8Var2.f10592b : null) != null ? w5.PROJECTION_MASK : w5.OVERLAY_GRADIENT;
                this.e = w5Var;
                boolean z = w5Var == w5.OVERLAY_GRADIENT;
                WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = this.v;
                wallpaperAssetOverlayDrawable.f57373j = z;
                wallpaperAssetOverlayDrawable.invalidateSelf();
                invalidate();
            }
        }
    }

    public final void d(float f, int i) {
        if (this.f != i) {
            this.f = i;
            this.f57381b.setTranslationY((-i) / 2.0f);
        }
        this.f57393t = (f >= 1.0f || i == 0) ? this.f57393t : Integer.valueOf(rim.d.c(Math.abs(i) / (1.0f - f)));
        this.f57383g = f;
        WallpaperProjectionOverlayDrawable wallpaperProjectionOverlayDrawable = this.f57392s;
        if (wallpaperProjectionOverlayDrawable != null) {
            float f4 = kotlin.ranges.f.f(getCollapseProgress(), BitmapDescriptorFactory.HUE_RED, 1.0f);
            if (wallpaperProjectionOverlayDrawable.f == f4) {
                return;
            }
            wallpaperProjectionOverlayDrawable.f = f4;
            wallpaperProjectionOverlayDrawable.a();
            wallpaperProjectionOverlayDrawable.invalidateSelf();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.e != w5.PROJECTION_MASK) {
            super.draw(canvas);
            return;
        }
        n5 n5Var = this.f57394w;
        int i2 = n5Var.f9291c;
        if (i2 <= 0 || (i = n5Var.d) <= 0 || n5Var.f9289a <= BitmapDescriptorFactory.HUE_RED) {
            super.draw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2, i, null);
        super.draw(canvas);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, n5Var.e, n5Var.f9291c, n5Var.d, n5Var.f9290b);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(w8 w8Var) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jh.d.g(context) && this.f57385j && this.d) {
            Drawable drawable = w8Var.f10592b;
            if (this.i == null) {
                this.i = l.o(js0.f.Companion, this, true);
            }
            ViewGroup viewGroup = this.i;
            if (!this.f57389p || !((Boolean) jo0.g.z.getValue()).booleanValue() || drawable == null || viewGroup == null) {
                a2 a2Var = this.f57388n;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                this.f57388n = null;
                b(w8Var, null);
                return;
            }
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            a2 a2Var2 = this.f57388n;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            this.f57388n = null;
            this.f57388n = e0.C(this.f57387m, null, d0.UNDISPATCHED, new z5(this, drawable, width, height, w8Var, drawable, viewGroup, (Continuation) null), 1);
        }
    }

    @Override // au0.o5
    public NavBarWithContainerBackground getCurrentBackground() {
        return this.f57381b.getCurrentBackground();
    }

    public final Integer getProjectionTag() {
        return this.projectionTag;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w8 w8Var = this.k;
        if (w8Var != null) {
            e(w8Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a2 a2Var = this.f57388n;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f57388n = null;
        this.i = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        this.f57391r = false;
        int i6 = this.f57390q;
        if (i6 != 0) {
            setOffset(i6);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        w8 w8Var;
        super.onSizeChanged(i, i2, i3, i5);
        this.f57394w.a(i, i2, getPaddingBottom());
        if ((i == i3 && i2 == i5) || (w8Var = this.k) == null) {
            return;
        }
        e(w8Var);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        this.f57385j = z;
        super.onVisibilityAggregated(z);
        if (getWindowVisibility() == 0) {
            if (z) {
                w8 w8Var = this.k;
                if (w8Var != null) {
                    e(w8Var);
                    return;
                }
                return;
            }
            a2 a2Var = this.f57388n;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f57388n = null;
            removeCallbacks(this.f57386l);
            q5 q5Var = this.f57384h;
            if (q5Var != null) {
                u5.c((u5) q5Var, null, null, 2);
            }
        }
    }

    public void setAverageColorAsBackground(Drawable backgroundDrawable) {
        this.f57381b.setAverageColorAsBackground(backgroundDrawable);
    }

    @Override // au0.o5
    public void setBackground(NavBarWithContainerBackground background, Function1<? super m<? extends Drawable>, Unit> onRenderResultAction) {
        this.f57381b.setBackground(background, onRenderResultAction);
    }

    public void setDefaultBackgroundColor(int color) {
        this.f57381b.setDefaultBackgroundColor(color);
    }

    public final void setOffset(int offset) {
        int i;
        if (this.f57391r) {
            i = offset - this.f57390q;
        } else {
            this.f57391r = true;
            i = offset;
        }
        offsetTopAndBottom(i);
        this.f57390q = offset;
    }

    public void setScreenshotDrawingMode(boolean enabled) {
        this.f57381b.setScreenshotDrawingMode(enabled);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, false, 60);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public WallpaperView(Context context, AttributeSet attributeSet, Integer num, boolean z, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        num = (i & 4) != 0 ? null : num;
        WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(context, null, 6);
        y5 wallpaperViewConstants = new y5();
        z = (i & 32) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wallpaperAssetSwitcher, "wallpaperAssetSwitcher");
        Intrinsics.checkNotNullParameter(wallpaperViewConstants, "wallpaperViewConstants");
        super(context, attributeSet);
        this.projectionTag = num;
        this.f57381b = wallpaperAssetSwitcher;
        this.f57382c = wallpaperViewConstants;
        this.d = z;
        this.e = w5.NONE;
        this.f57383g = 1.0f;
        this.f57386l = new x5(this);
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.f57387m = e0.c(kotlin.coroutines.e.d(c2VarE, o.f323119a.e));
        this.o = new vo0.c(context);
        this.u = kli.a.k(context, 300.0f);
        WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = new WallpaperAssetOverlayDrawable(context, 120.0f, 288.0f);
        this.v = wallpaperAssetOverlayDrawable;
        this.f57394w = new n5(kli.a.l(context, 192.0f));
        setTag(Integer.valueOf(R$id.internal_app_entry_wallpaper_tag));
        addView(wallpaperAssetSwitcher, new FrameLayout.LayoutParams(-1, -1));
        setForeground(wallpaperAssetOverlayDrawable);
        wallpaperAssetSwitcher.f59495h.subscribe(new n(9, new ar1.c(this, 16)));
    }
}
