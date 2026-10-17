package com.revolut.core.ui_kit.internal.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import bp0.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.p;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.k1;
import ms0.l1;
import ms0.m1;
import ofm.q;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0002Z[B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ!\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ!\u0010\"\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#JM\u0010.\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020)¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0011\u0010<\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010A\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0000¢\u0006\u0004\b?\u0010@J\u0019\u0010C\u001a\u00020\f2\b\b\u0001\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bC\u0010\u000eJ\u000f\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010\u000eR$\u0010R\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010X\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LabelView;", "Lcom/revolut/core/ui_kit/views/ProgressSwitcher;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gravity", "", "setGravity", "(I)V", "textAlignment", "setTextAlignment", "Landroid/content/res/ColorStateList;", "colorStateList", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "attr", "setTextAppearance", "top", "bottom", "setTextPadding", "(II)V", "padding", "setEndIconPadding", "maxLines", "setMaxLines", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "invisibleMode", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Landroid/view/animation/Animation;", "inAnimation", "outAnimation", "", "animateToSelf", "repeatCount", "", "animationDelay", "setStartIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Landroid/view/animation/Animation;Landroid/view/animation/Animation;ZIJ)V", "setEndIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "visible", "setUnderlineVisible", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/animation/Animator;", "getEndImageAlphaAnimator$ui_kit_components_release", "()Landroid/animation/Animator;", "getEndImageAlphaAnimator", "", "rotation", "setEndImageRotation$ui_kit_components_release", "(F)V", "setEndImageRotation", "style", "setTextAppearanceStyle", "Landroid/widget/ImageSwitcher;", "getStartImageViewSwitcher", "()Landroid/widget/ImageSwitcher;", "Landroidx/appcompat/widget/AppCompatImageView;", "getEndImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setGravityInternal", "Landroid/os/Parcelable;", "j", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lfp0/p;", "k", "Lfp0/p;", "getClickHandler$ui_kit_components_release", "()Lfp0/p;", "clickHandler", "Companion", "ms0/m1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LabelView extends ProgressSwitcher implements TrackableItem {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f56193x = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f56194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageSwitcher f56195h;
    public AppCompatImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final p clickHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f56197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f56199n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m1 f56200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f56201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f56202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f56203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56204t;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k1 f56205w;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void d(LabelView labelView, int i, yy0.f fVar, Image image, long j2) {
        if (labelView.v < i) {
            q.e(fVar, image, labelView.getStartImageViewSwitcher());
            labelView.v++;
            labelView.postDelayed(labelView.f56205w, j2);
        }
    }

    private final AppCompatImageView getEndImageView() {
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        int i = this.o;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = this.f56204t;
        int i2 = R$id.labelView_endImage;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setId(i2);
        View view = this.f56194g;
        if (view == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        addView(appCompatImageView2, indexOfChild(view) + 1, layoutParams);
        this.i = appCompatImageView2;
        return appCompatImageView2;
    }

    private final ImageSwitcher getStartImageViewSwitcher() {
        ImageSwitcher imageSwitcher = this.f56195h;
        if (imageSwitcher != null) {
            return imageSwitcher;
        }
        int i = this.f56199n;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = this.f56204t;
        final ImageSwitcher imageSwitcher2 = new ImageSwitcher(getContext());
        imageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() { // from class: ms0.j1
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                int i2 = LabelView.f56193x;
                AppCompatImageView appCompatImageView = new AppCompatImageView(imageSwitcher2.getContext());
                appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return appCompatImageView;
            }
        });
        addView(imageSwitcher2, 0, layoutParams);
        this.f56195h = imageSwitcher2;
        return imageSwitcher2;
    }

    private final void setGravityInternal(int gravity) {
        this.f56203s = gravity;
        this.f56204t = (gravity & 112) | 3;
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        uIKitTextView.setGravity(gravity);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != getProgressView()) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).gravity = this.f56204t;
            }
        }
        setProgressGravity(gravity);
        requestLayout();
    }

    public static /* synthetic */ void setStartIcon$default(LabelView labelView, Image image, Animation animation, Animation animation2, boolean z, int i, long j2, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animation = null;
        }
        if ((i2 & 4) != 0) {
            animation2 = null;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            j2 = 0;
        }
        labelView.setStartIcon(image, animation, animation2, z, i, j2);
    }

    public static /* synthetic */ void setText$default(LabelView labelView, Clause clause, int i, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        labelView.setText(clause, i);
    }

    private final void setTextAppearanceStyle(int style) {
        if (this.f56201q != style) {
            this.f56201q = style;
            UIKitTextView uIKitTextView = this.f56194g;
            if (uIKitTextView == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            uIKitTextView.setTextAppearance(style);
            if (uIKitTextView == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            Paint.FontMetrics fontMetrics = uIKitTextView.getPaint().getFontMetrics();
            setProgressSize((int) (fontMetrics.bottom - fontMetrics.top));
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF52639p() {
        return this.analyticsContext;
    }

    @NotNull
    /* JADX INFO: renamed from: getClickHandler$ui_kit_components_release, reason: from getter */
    public final p getClickHandler() {
        return this.clickHandler;
    }

    public final Animator getEndImageAlphaAnimator$ui_kit_components_release() {
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView == null) {
            return null;
        }
        return ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) FrameLayout.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        if (hasOnClickListeners()) {
            gq0.g.b(info);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[PHI: r0
      0x002d: PHI (r0v3 android.view.View) = (r0v2 android.view.View), (r0v2 android.view.View), (r0v16 android.view.View), (r0v16 android.view.View) binds: [B:27:0x003f, B:29:0x0047, B:15:0x0022, B:17:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.LabelView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int iMax2;
        if (this.f56201q == 0) {
            setTextAppearance(R$attr.internal_textAppearanceEmphasis2);
        }
        if (this.f56202r == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setTextColor(kli.a.u(R$attr.uikit_colorForeground, context));
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Rect rect = rr0.c.f256608a;
        ImageSwitcher imageSwitcher = this.f56195h;
        if (imageSwitcher == null || !rr0.c.e(imageSwitcher)) {
            iMax = 0;
            iMax2 = 0;
        } else {
            int i3 = this.f56197l;
            rr0.i.b(imageSwitcher, i, i2, paddingRight + i3, paddingBottom);
            iMax2 = Math.max(0, imageSwitcher.getMeasuredHeight());
            iMax = imageSwitcher.getMeasuredWidth() + i3;
        }
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView != null && rr0.c.e(appCompatImageView)) {
            rr0.i.b(appCompatImageView, i, i2, paddingRight + iMax + this.f56198m, paddingBottom);
            iMax2 = Math.max(iMax2, appCompatImageView.getMeasuredHeight());
            iMax += appCompatImageView.getMeasuredWidth() + this.f56198m;
        }
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        if (rr0.c.e(uIKitTextView)) {
            rr0.i.b(uIKitTextView, i, i2, paddingRight + iMax, paddingBottom);
            Layout layout = uIKitTextView.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                float fMax = BitmapDescriptorFactory.HUE_RED;
                for (int i5 = 0; i5 < lineCount; i5++) {
                    fMax = Math.max(fMax, layout.getLineWidth(i5));
                }
                int compoundPaddingRight = uIKitTextView.getCompoundPaddingRight() + uIKitTextView.getCompoundPaddingLeft() + ((int) Math.ceil(fMax));
                if (compoundPaddingRight < uIKitTextView.getMeasuredWidth()) {
                    uIKitTextView.measure(View.MeasureSpec.makeMeasureSpec(compoundPaddingRight, 1073741824), ViewGroup.getChildMeasureSpec(i2, paddingBottom, uIKitTextView.getLayoutParams().height));
                }
            }
            iMax2 = Math.max(iMax2, uIKitTextView.getMeasuredHeight());
            iMax += uIKitTextView.getMeasuredWidth();
        }
        Rect rect2 = rr0.c.f256608a;
        AppCompatImageView appCompatImageViewM3751getProgressView = getProgressView();
        if (appCompatImageViewM3751getProgressView != null && rr0.c.e(appCompatImageViewM3751getProgressView)) {
            rr0.i.b(appCompatImageViewM3751getProgressView, i, i2, paddingRight, paddingBottom);
            iMax2 = Math.max(iMax2, appCompatImageViewM3751getProgressView.getMeasuredHeight());
            iMax = Math.max(iMax, appCompatImageViewM3751getProgressView.getMeasuredWidth());
        }
        this.u = iMax;
        setMeasuredDimension(iMax + paddingRight, iMax2 + paddingBottom);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setEndIcon(Image image) {
        if (image == null && this.i == null) {
            return;
        }
        zi0.c.g(getEndImageView(), image);
    }

    public final void setEndIconPadding(int padding) {
        if (this.f56198m != padding) {
            this.f56198m = padding;
            requestLayout();
        }
    }

    public final void setEndImageRotation$ui_kit_components_release(float rotation) {
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView != null) {
            appCompatImageView.setRotation(rotation);
        }
    }

    public final void setGravity(int gravity) {
        if (gravity != this.f56203s) {
            setGravityInternal(gravity);
        }
    }

    public final void setMaxLines(int maxLines) {
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        if (maxLines != uIKitTextView.getMaxLines()) {
            if (uIKitTextView != null) {
                uIKitTextView.setMaxLines(maxLines);
            } else {
                Intrinsics.r("titleView");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        kp0.l lVar = l2 != null ? new kp0.l(this, l2, 5) : null;
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        u.n(uIKitTextView, lVar != null);
        super.setOnClickListener(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Runnable, ms0.k1] */
    public final void setStartIcon(final Image image, Animation inAnimation, Animation outAnimation, boolean animateToSelf, final int repeatCount, long animationDelay) {
        if (image == null) {
            removeCallbacks(this.f56205w);
            this.f56205w = null;
            this.v = 0;
            ImageSwitcher imageSwitcher = this.f56195h;
            if (imageSwitcher != null) {
                imageSwitcher.setVisibility(8);
            }
        } else {
            ImageSwitcher startImageViewSwitcher = getStartImageViewSwitcher();
            startImageViewSwitcher.setVisibility(0);
            startImageViewSwitcher.setInAnimation(inAnimation);
            startImageViewSwitcher.setOutAnimation(outAnimation);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final yy0.f fVarQ = jh.d.f(context).Q();
            View nextView = startImageViewSwitcher.getNextView();
            Intrinsics.i(nextView, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            if (((AppCompatImageView) nextView).getDrawable() == null) {
                startImageViewSwitcher.setAnimateFirstView(false);
                q.e(fVarQ, image, startImageViewSwitcher);
                if (animateToSelf) {
                    startImageViewSwitcher.post(new b0.d(fVarQ, 14, image, startImageViewSwitcher));
                }
            } else {
                q.e(fVarQ, image, startImageViewSwitcher);
            }
            if (inAnimation != null && outAnimation != null && repeatCount > 0) {
                final long jMax = animationDelay + Math.max(inAnimation.getDuration(), outAnimation.getDuration());
                removeCallbacks(this.f56205w);
                this.v = 0;
                ?? r62 = new Runnable() { // from class: ms0.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LabelView.d(this.f208306a, repeatCount, fVarQ, image, jMax);
                    }
                };
                this.f56205w = r62;
                postDelayed(r62, jMax);
            }
        }
    }

    public final void setText(Clause clause, int invisibleMode) {
        ty0.c cVarB0 = u.k(this).b0();
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        boolean zF = Intrinsics.f(((y) cVarB0).o(uIKitTextView), clause);
        kli.a.e(uIKitTextView, clause, null, null, invisibleMode, 6);
        if (zF || this.f56200p != m1.LastLineBottom) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public void setTextAlignment(int textAlignment) {
        super.setTextAlignment(textAlignment);
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView != null) {
            if (uIKitTextView != null) {
                uIKitTextView.setTextAlignment(textAlignment);
            } else {
                Intrinsics.r("titleView");
                throw null;
            }
        }
    }

    public final void setTextAppearance(int attr) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setTextAppearanceStyle(kli.a.x(attr, context));
    }

    public final void setTextColor(@NotNull ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(colorStateList, "colorStateList");
        this.f56202r = colorStateList;
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        uIKitTextView.setTextColor(colorStateList);
        setProgressTintColor(colorStateList.getDefaultColor());
    }

    public final void setTextPadding(int top, int bottom) {
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView != null) {
            uIKitTextView.setPadding(uIKitTextView.getPaddingLeft(), top, uIKitTextView.getPaddingRight(), bottom);
        } else {
            Intrinsics.r("titleView");
            throw null;
        }
    }

    public final void setUnderlineVisible(boolean visible) {
        UIKitTextView uIKitTextView = this.f56194g;
        if (uIKitTextView != null) {
            uIKitTextView.setUnderlineVisible(visible);
        } else {
            Intrinsics.r("titleView");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelView(@NotNull Context context, AttributeSet attributeSet, int i) {
        Object next;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        p.Companion.getClass();
        this.clickHandler = fp0.m.a(this, gp0.b.f145198a);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.LabelView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_textPaddingTop, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_textPaddingBottom, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.LabelView_android_maxLines, Integer.MAX_VALUE);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.LabelView_android_gravity, 8388659);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.LabelView_android_textAlignment, getTextAlignment());
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.LabelView_android_textAlignment);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.LabelView_android_textColor);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_iconPadding, kli.a.k(context, 8.0f));
        this.f56197l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_startIconPadding, dimensionPixelSize3);
        this.f56198m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_endIconPadding, dimensionPixelSize3);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_iconSize, kli.a.k(context, 16.0f));
        this.f56199n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_startIconSize, dimensionPixelSize4);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_endIconSize, dimensionPixelSize4);
        l1 l1Var = m1.Companion;
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.LabelView_endIconPlacement, m1.TextBounds.a());
        l1Var.getClass();
        Iterator<E> it8 = m1.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((m1) next).a() == i3) {
                    break;
                }
            }
        }
        m1 m1Var = (m1) next;
        this.f56200p = m1Var == null ? m1.TextBounds : m1Var;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LabelView_android_textAppearance, 0);
        typedArrayObtainStyledAttributes.recycle();
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 0);
        uIKitTextView.setId(R$id.labelView_textView);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        uIKitTextView.setMaxLines(integer);
        this.f56194g = uIKitTextView;
        addView(uIKitTextView, new FrameLayout.LayoutParams(-2, -2));
        setGravityInternal(integer2);
        if (zHasValue) {
            setTextAlignment(i2);
        }
        setTextPadding(dimensionPixelSize, dimensionPixelSize2);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
        if (resourceId != 0) {
            setTextAppearanceStyle(resourceId);
        }
        setClipToPadding(false);
        setClipChildren(false);
    }

    public /* synthetic */ LabelView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
