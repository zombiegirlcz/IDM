package com.revolut.core.ui_kit.internal.views.tag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.BorderGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.LockableBoundsDrawableWrapper;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import cv0.a;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import jr0.f;
import jr0.g;
import jr0.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import pd.b;
import tz4.d;
import zhm.d0;
import zhm.w;
import zi0.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002\u0010)B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "Ljr0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "content", "", "setContent", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "Lcv0/a;", "style", "setStyle$ui_kit_components_release", "(Lcv0/a;)V", "setStyle", "", "progress", "setExpansion", "(F)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "value", "C", "Z", "setDirtyState", "(Z)V", "dirtyState", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TagView extends ShadowLayout implements i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Paint A;
    public StaticLayout B;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean dirtyState;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LockableBoundsDrawableWrapper f57629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LockableBoundsDrawableWrapper f57630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TagViewData f57631n;
    public ValueAnimator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f57632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f57633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f57634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f57635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f57636t;
    public int u;
    public LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AppCompatImageView f57637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AppCompatTextView f57638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f57639y;
    public final Paint z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.tag.TagView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setDirtyState(boolean z) {
        this.dirtyState = z;
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpansion(float progress) {
        int width;
        float fLerp = AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0.5f, progress);
        AppCompatImageView appCompatImageView = this.f57637w;
        if (appCompatImageView != null) {
            width = (this.f57636t * 2) + appCompatImageView.getWidth();
        } else {
            width = 0;
        }
        int width2 = (int) (((getWidth() - width) * fLerp) + width);
        int height = getHeight();
        LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper = this.f57629l;
        if (lockableBoundsDrawableWrapper != null) {
            lockableBoundsDrawableWrapper.c(0, 0, width2, height, true);
        }
        LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper2 = this.f57630m;
        if (lockableBoundsDrawableWrapper2 != null) {
            lockableBoundsDrawableWrapper2.c(0, 0, width2, height, true);
        }
        AppCompatImageView appCompatImageView2 = this.f57637w;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setTranslationX((fLerp - 1) * (this.f57635s - this.f57636t));
        }
        float fLerp2 = AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.5f, 1.0f, progress);
        AppCompatTextView appCompatTextView = this.f57638x;
        if (appCompatTextView != null) {
            appCompatTextView.setAlpha(fLerp2);
        }
    }

    private final void setIcon(Image icon) {
        AppCompatImageView appCompatImageView = this.f57637w;
        if (icon == null && appCompatImageView == null) {
            return;
        }
        if (appCompatImageView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 12.0f);
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
            appCompatImageView2.setId(R$id.tagView_icon);
            appCompatImageView2.setLayoutParams(new LinearLayout.LayoutParams(iK, iK));
            this.f57637w = appCompatImageView2;
            j();
            i().addView(appCompatImageView2, 0);
            appCompatImageView = appCompatImageView2;
        }
        c.g(appCompatImageView, icon);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.u;
        if (i != 0) {
            boolean z = this.dirtyState;
            Paint paint = this.A;
            Paint paint2 = this.z;
            if (z) {
                setDirtyState(false);
                AppCompatImageView appCompatImageView = this.f57637w;
                if (appCompatImageView != null && appCompatImageView.getWidth() > 0) {
                    paint2.setColor(i);
                    paint2.setMaskFilter(new BlurMaskFilter(appCompatImageView.getWidth() * 0.6f, BlurMaskFilter.Blur.NORMAL));
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float fK = kli.a.k(context, 6.0f);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                float fK2 = kli.a.k(context2, 1.0f);
                paint.setColor(i);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(fK, blur));
                paint.setStrokeWidth(fK2);
                AppCompatTextView appCompatTextView = this.f57638x;
                if (appCompatTextView != null) {
                    Layout layout = appCompatTextView.getLayout();
                    if (layout == null) {
                        this.B = null;
                    } else {
                        StaticLayout staticLayoutS = a.a.s(layout);
                        float textSize = appCompatTextView.getTextSize() * 0.8f;
                        TextPaint paint3 = staticLayoutS.getPaint();
                        paint3.setAntiAlias(true);
                        paint3.setColor(i);
                        paint3.setMaskFilter(new BlurMaskFilter(textSize, blur));
                        this.B = staticLayoutS;
                    }
                }
            }
            AppCompatImageView appCompatImageView2 = this.f57637w;
            int i2 = this.f57639y;
            if (appCompatImageView2 == null || appCompatImageView2.getWidth() <= 0) {
                canvas2 = canvas;
            } else {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                float fK3 = kli.a.k(context3, 1.5f);
                float f = i2;
                float left = appCompatImageView2.getLeft() + fK3 + f;
                float top = appCompatImageView2.getTop() + fK3 + f;
                float right = (appCompatImageView2.getRight() - fK3) + f;
                float bottom = (appCompatImageView2.getBottom() - fK3) + f;
                canvas2 = canvas;
                canvas2.drawOval(left, top, right, bottom, paint2);
            }
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            float fK4 = kli.a.k(context4, 24.0f);
            float f4 = i2;
            float f5 = f4 + BitmapDescriptorFactory.HUE_RED;
            canvas2.drawRoundRect(f5, f5, getWidth() - f4, getHeight() - f4, fK4, fK4, paint);
            AppCompatTextView appCompatTextView2 = this.f57638x;
            StaticLayout staticLayout = this.B;
            if (appCompatTextView2 != null && staticLayout != null) {
                a.a.h(staticLayout, canvas2, appCompatTextView2.getX() + f4, appCompatTextView2.getY() + f4);
                a.a.h(staticLayout, canvas2, appCompatTextView2.getX() + f4, appCompatTextView2.getY() + f4);
            }
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public final void e(a aVar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, aVar.b());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f57635s = kli.a.k(context2, aVar.c());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f57636t = kli.a.k(context3, aVar.d());
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            u.w(iK, linearLayout);
        }
        AppCompatTextView appCompatTextView = this.f57638x;
        if (appCompatTextView != null) {
            l.e(appCompatTextView, aVar.e());
        }
        j();
    }

    public final void f(int i) {
        if (i == this.f57633q) {
            return;
        }
        this.f57633q = i;
        if (i != 0) {
            if (i == 1) {
                AppCompatTextView appCompatTextView = this.f57638x;
                if (appCompatTextView != null) {
                    TagViewData tagViewData = this.f57631n;
                    appCompatTextView.setVisibility((tagViewData != null ? tagViewData.getF57641b() : null) != null ? 0 : 8);
                }
                AppCompatTextView appCompatTextView2 = this.f57638x;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setAlpha(1.0f);
                }
                AppCompatImageView appCompatImageView = this.f57637w;
                if (appCompatImageView != null) {
                    appCompatImageView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper = this.f57629l;
                if (lockableBoundsDrawableWrapper != null) {
                    lockableBoundsDrawableWrapper.f55994a = false;
                }
                LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper2 = this.f57630m;
                if (lockableBoundsDrawableWrapper2 != null) {
                    lockableBoundsDrawableWrapper2.f55994a = false;
                }
            } else if (i == 2) {
                LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper3 = this.f57629l;
                if (lockableBoundsDrawableWrapper3 != null) {
                    lockableBoundsDrawableWrapper3.f55994a = true;
                }
                LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper4 = this.f57630m;
                if (lockableBoundsDrawableWrapper4 != null) {
                    lockableBoundsDrawableWrapper4.f55994a = true;
                }
                AppCompatTextView appCompatTextView3 = this.f57638x;
                if (appCompatTextView3 != null) {
                    TagViewData tagViewData2 = this.f57631n;
                    appCompatTextView3.setVisibility((tagViewData2 != null ? tagViewData2.getF57641b() : null) != null ? 0 : 8);
                }
            }
        } else {
            AppCompatTextView appCompatTextView4 = this.f57638x;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setVisibility(8);
            }
            AppCompatTextView appCompatTextView5 = this.f57638x;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            AppCompatImageView appCompatImageView2 = this.f57637w;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            }
            LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper5 = this.f57629l;
            if (lockableBoundsDrawableWrapper5 != null) {
                lockableBoundsDrawableWrapper5.f55994a = false;
            }
            LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper6 = this.f57630m;
            if (lockableBoundsDrawableWrapper6 != null) {
                lockableBoundsDrawableWrapper6.f55994a = false;
            }
        }
        j();
    }

    @Override // jr0.i
    @NotNull
    public g getGlowHighlightManager() {
        g.Companion.getClass();
        return f.a(this);
    }

    public final LinearLayout i() {
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            return linearLayout;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, this.f57634r.b());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R$id.tagView_container);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, iK, 17));
        Context context2 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        linearLayout2.setMinimumWidth(kli.a.k(context2, 24.0f));
        this.v = linearLayout2;
        j();
        addView(this.v);
        return linearLayout2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r13 = this;
            int r0 = r13.f57635s
            int r1 = r13.f57633q
            r2 = 0
            if (r1 == 0) goto L16
            com.revolut.core.ui_kit.internal.views.tag.TagViewData r1 = r13.f57631n
            if (r1 == 0) goto L10
            com.revolut.core.ui_kit.models.Clause r1 = r1.getF57641b()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 != 0) goto L14
            goto L16
        L14:
            r1 = 1
            goto L19
        L16:
            int r0 = r13.f57636t
            r1 = r2
        L19:
            android.widget.LinearLayout r3 = r13.v
            if (r3 == 0) goto L28
            int r4 = r3.getPaddingTop()
            int r5 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r0, r5)
        L28:
            androidx.appcompat.widget.AppCompatImageView r6 = r13.f57637w
            if (r6 == 0) goto L47
            if (r1 == 0) goto L3d
            android.content.Context r0 = r13.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 1082130432(0x40800000, float:4.0)
            int r2 = kli.a.k(r0, r1)
        L3d:
            r9 = r2
            r11 = 0
            r12 = 27
            r7 = 0
            r8 = 0
            r10 = 0
            or0.u.z(r6, r7, r8, r9, r10, r11, r12)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.tag.TagView.j():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        if (hasOnClickListeners()) {
            gq0.g.b(info);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        setDirtyState(true);
        if (this.f57633q == 2) {
            setExpansion(this.f57632p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContent(@NotNull TagViewData content) {
        int i;
        AnimationRequest f57648a;
        Intrinsics.checkNotNullParameter(content, "content");
        if (Intrinsics.f(content, this.f57631n)) {
            return;
        }
        TagViewData tagViewData = this.f57631n;
        this.f57631n = content;
        setDirtyState(true);
        LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper = this.f57629l;
        if (lockableBoundsDrawableWrapper == null) {
            lockableBoundsDrawableWrapper = new LockableBoundsDrawableWrapper(new GradientDrawable());
            this.f57629l = lockableBoundsDrawableWrapper;
        }
        LockableBoundsDrawableWrapper lockableBoundsDrawableWrapper2 = this.f57630m;
        if (lockableBoundsDrawableWrapper2 == null) {
            lockableBoundsDrawableWrapper2 = new LockableBoundsDrawableWrapper(null);
            this.f57630m = lockableBoundsDrawableWrapper2;
        }
        Context context = getContext();
        TagViewData.TagBackground f57642c = content.getF57642c();
        int i2 = 0;
        if (f57642c instanceof TagViewData.TagBackground.Gradient) {
            Drawable drawable = lockableBoundsDrawableWrapper.getDrawable();
            Intrinsics.i(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setOrientation(((TagViewData.TagBackground.Gradient) content.getF57642c()).getF57651b());
            Intrinsics.h(context);
            gradientDrawable.setCornerRadius(kli.a.k(context, 24.0f));
            List f57650a = ((TagViewData.TagBackground.Gradient) content.getF57642c()).getF57650a();
            ArrayList arrayList = new ArrayList(w.t(f57650a, 10));
            Iterator it8 = f57650a.iterator();
            while (it8.hasNext()) {
                arrayList.add(Integer.valueOf(io0.a.c(context, (Color) it8.next())));
            }
            gradientDrawable.setColors(d0.c1(arrayList));
        } else {
            if (!(f57642c instanceof TagViewData.TagBackground.Solid)) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable drawable2 = lockableBoundsDrawableWrapper.getDrawable();
            Intrinsics.i(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable2 = (GradientDrawable) drawable2;
            Intrinsics.h(context);
            int iC = io0.a.c(context, ((TagViewData.TagBackground.Solid) content.getF57642c()).getF57652a());
            gradientDrawable2.setColors(new int[]{iC, iC});
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(kli.a.k(context, 24.0f));
        }
        TagViewData.TagOutline e = content.getE();
        if (e instanceof TagViewData.TagOutline.Gradient) {
            TagViewData.TagOutline.Gradient gradient = (TagViewData.TagOutline.Gradient) e;
            lockableBoundsDrawableWrapper2.setDrawable(new BorderGradientDrawable(kli.a.k(context, 24.0f), kli.a.l(context, this.f57634r.a()), d.k(gradient.getF57653a(), context), 0, gradient.getF57653a().getF55828b(), gradient.getF57653a().getF55829c()));
        } else {
            if (!(e instanceof TagViewData.TagOutline.Solid)) {
                throw new NoWhenBranchMatchedException();
            }
            GradientDrawable gradientDrawableK = v7.k(0);
            gradientDrawableK.setCornerRadius(kli.a.k(context, 24.0f));
            gradientDrawableK.setStroke(kli.a.k(context, this.f57634r.a()), kli.a.s(((TagViewData.TagOutline.Solid) content.getE()).getF57654a(), context));
            lockableBoundsDrawableWrapper2.setDrawable(gradientDrawableK);
        }
        setIcon(content.getF57640a());
        Clause f57641b = content.getF57641b();
        Integer i3 = content.getI();
        Clause f57641b2 = tagViewData != null ? tagViewData.getF57641b() : null;
        Integer i5 = tagViewData != null ? tagViewData.getI() : null;
        Integer numValueOf = tagViewData != null ? Integer.valueOf(tagViewData.getF57645j()) : null;
        int f57645j = content.getF57645j();
        if (!Intrinsics.f(f57641b2, f57641b) || !Intrinsics.f(i5, i3) || numValueOf == null || numValueOf.intValue() != f57645j) {
            AppCompatTextView appCompatTextView = this.f57638x;
            if (f57641b != null || appCompatTextView != null) {
                if (appCompatTextView == null) {
                    appCompatTextView = new AppCompatTextView(getContext(), null, this.f57634r.e());
                    appCompatTextView.setId(R$id.tagView_text);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    appCompatTextView.setMaxLines(1);
                    this.f57638x = appCompatTextView;
                    i().addView(appCompatTextView);
                }
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                appCompatTextView.setTextColor(kli.a.s(f57645j, context2));
                if (f57641b != null) {
                    appCompatTextView.setFilters(i3 != null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i3.intValue())} : new InputFilter[0]);
                }
                j();
                Object[] objArr = (f57641b == null || this.f57633q == 0) ? false : true;
                AppCompatTextView appCompatTextView2 = appCompatTextView;
                ty0.c.b(u.k(appCompatTextView).b0(), f57641b, appCompatTextView2, null, null, 12);
                appCompatTextView2.setVisibility(objArr != false ? 0 : 8);
                b.p(appCompatTextView2, f57641b);
                b.p(this, f57641b);
            }
        }
        TagViewData.CollapseState f57643g = tagViewData != null ? tagViewData.getF57643g() : null;
        TagViewData.CollapseState f57643g2 = content.getF57643g();
        if (!Intrinsics.f(f57643g, f57643g2)) {
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.o = null;
            if (f57643g2.getF57647b() == null || f57643g2.getF57647b().getF57724a()) {
                f(1 ^ (f57643g2.getF57646a() ? 1 : 0));
            } else {
                f57643g2.getF57647b().b();
                boolean f57646a = f57643g2.getF57646a();
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setStartDelay(1500L);
                valueAnimator2.setDuration(600L);
                if (f57646a) {
                    valueAnimator2.setFloatValues(1.0f, BitmapDescriptorFactory.HUE_RED);
                } else {
                    valueAnimator2.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
                }
                cv0.b bVar = new cv0.b(valueAnimator2, this, f57646a, valueAnimator2);
                valueAnimator2.addListener(bVar);
                valueAnimator2.addUpdateListener(bVar);
                this.o = valueAnimator2;
                valueAnimator2.start();
            }
        }
        Drawable layerDrawable = new LayerDrawable(new LockableBoundsDrawableWrapper[]{lockableBoundsDrawableWrapper, lockableBoundsDrawableWrapper2});
        TagViewData.Glowing f57644h = content.getF57644h();
        if (f57644h instanceof TagViewData.Glowing.Static) {
            int i6 = this.f57639y;
            InsetDrawable insetDrawable = new InsetDrawable(layerDrawable, i6);
            int iS = kli.a.s(((TagViewData.Glowing.Static) f57644h).getF57649a(), context);
            i = i6;
            i2 = iS;
            layerDrawable = insetDrawable;
        } else {
            i = 0;
        }
        this.u = i2;
        setPadding(i, i, i, i);
        Integer d = content.getD();
        ColorStateList colorStateListU = d != null ? kli.a.u(d.intValue(), context) : null;
        if (colorStateListU != null) {
            layerDrawable = new RippleDrawable(colorStateListU, layerDrawable, null);
        }
        setBackground(layerDrawable);
        if ((tagViewData != null ? tagViewData.getF57644h() : null) instanceof TagViewData.Glowing.Animated) {
            Q();
        }
        if ((content.getF57644h() instanceof TagViewData.Glowing.Animated) && (f57648a = ((TagViewData.Glowing.Animated) content.getF57644h()).getF57648a()) != null && !f57648a.getF57724a()) {
            ((TagViewData.Glowing.Animated) content.getF57644h()).getF57648a().b();
            y();
        }
        setCornersRadius(24.0f);
        boolean f = content.getF();
        float f4 = BitmapDescriptorFactory.HUE_RED;
        setShadowElevation(f ? 1.0f : 0.0f);
        setShadowColor(new Color.Solid(R$attr.uikit_colorBlack));
        boolean f5 = content.getF();
        if (this.f56559g == f5) {
            return;
        }
        this.f56559g = f5;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK = kli.a.k(context3, this.shadowElevation);
        if (this.f56559g) {
            f4 = iK;
        }
        setElevation(f4);
    }

    public final void setStyle$ui_kit_components_release(@NotNull a style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.f57634r != style) {
            this.f57634r = style;
            e(style);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57632p = 1.0f;
        this.f57633q = 1;
        this.f57634r = a.SIZE_24;
        this.f57639y = kli.a.k(context, 8.0f);
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setStyle(Paint.Style.FILL);
        this.z = paintC;
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC2.setStyle(Paint.Style.STROKE);
        this.A = paintC2;
        this.dirtyState = true;
        e(this.f57634r);
    }

    public /* synthetic */ TagView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
