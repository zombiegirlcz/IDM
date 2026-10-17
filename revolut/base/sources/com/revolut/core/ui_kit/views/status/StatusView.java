package com.revolut.core.ui_kit.views.status;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.widget.NestedScrollView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import au0.l5;
import aw0.o9;
import bp0.y;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.internal.drawables.RevolutAnimatableDrawable;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.sound.Sound;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.r;
import fp0.l;
import gy0.c;
import gy0.e;
import ihm.f;
import ix0.c2;
import ix0.v0;
import ix0.w0;
import ix0.x0;
import java.util.List;
import jo0.k;
import jo0.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTimeUtils;
import rr0.a;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004`abcB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u000f2\b\b\u0001\u0010!\u001a\u00020\t2\b\b\u0001\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\u0011J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b/\u0010\u0011J\u0017\u00100\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b3\u00101J\u0017\u00104\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b4\u00101J\u0017\u00107\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b9\u00108J\u001f\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020+¢\u0006\u0004\b>\u0010.J\u0015\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020+¢\u0006\u0004\b@\u0010.J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u001c\u0010=\u001a\u00020+8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010M\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u00106\u001a\u0004\u0018\u0001058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u00108R\u0014\u0010\\\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010GR\u0014\u0010^\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010G¨\u0006d"}, d2 = {"Lcom/revolut/core/ui_kit/views/status/StatusView;", "Landroidx/core/widget/NestedScrollView;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lix0/w0;", "Lrr0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "maxLines", "setTitleMaxLines", "(I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "imageWidthDp", "imageHeightDp", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Ljava/lang/Float;Ljava/lang/Float;)V", "getTitle$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/models/Clause;", "getTitle", "getImage", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "progress", "colorAttr", "setDescriptionProgress", "(II)V", "setDescription", "setPrimaryButtonText", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "largeActionButtonStyle", "setPrimaryButtonStyle", "(Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;)V", "", "visible", "setPrimaryButtonVisible", "(Z)V", "setSecondaryButtonText", "setTitleImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "icon", "setPrimaryButtonIcon", "setSecondaryButtonIcon", "Landroid/os/Parcelable;", "analyticsContext", "setPrimaryButtonsAnalyticsContext", "(Landroid/os/Parcelable;)V", "setSecondaryButtonAnalyticsContext", "drawableRes", "setImageRes", "(ILjava/lang/Integer;)V", "allowSwipeToDismiss", "setAllowSwipeToDismiss", "enabled", "setPrimaryButtonEnabled", "Landroid/graphics/drawable/Drawable;", "getClonableBackground", "()Landroid/graphics/drawable/Drawable;", "e", "Z", "getAllowSwipeToDismiss", "()Z", "Landroid/widget/LinearLayout;", "s", "Landroid/widget/LinearLayout;", "getTitleContainer$ui_kit_components_release", "()Landroid/widget/LinearLayout;", "titleContainer", "", "D", "Ljava/lang/Object;", "getAnalyticsProduct", "()Ljava/lang/Object;", "setAnalyticsProduct", "(Ljava/lang/Object;)V", "analyticsProduct", "E", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "getInsetsAdjustable", "insetsAdjustable", "getHandlesBottomSheetInsets", "handlesBottomSheetInsets", "Companion", "gy0/c", "a", "gy0/b", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class StatusView extends NestedScrollView implements TrackableItem, w0, a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int L = R$attr.uikit_colorPopoverBackground;
    public boolean A;
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Object analyticsProduct;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Parcelable analyticsContext;
    public final int F;
    public final int G;
    public final c2 H;
    public int I;
    public int J;
    public b K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f59714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f59715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f59716c;
    public final gy0.a d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean allowSwipeToDismiss;
    public ObjectAnimator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59718h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59719j;
    public final GestureDetectorCompat k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f59720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f59721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LottieAnimationView f59722n;
    public final ProgressBar o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FrameLayout f59723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CircleProgressBar f59724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f59725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final LinearLayout titleContainer;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f59727t;
    public final TextView u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ProgressBar f59728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LargeActionButton f59729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LargeActionButton f59730y;
    public final qu0.a z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.status.StatusView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f59731a;

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f59731a = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f59731a = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f59731a = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f59731a = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f59731a = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getAllowSwipeToDismiss() {
        int i = gy0.d.f147771a[this.f59714a.ordinal()];
        if (i == 1) {
            return this.allowSwipeToDismiss;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean getHandlesBottomSheetInsets() {
        return this.f59714a == c.EMBEDDED_IN_BOTTOM_SHEET;
    }

    public static /* synthetic */ void setImage$default(StatusView statusView, Image image, Float f, Float f4, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            f4 = null;
        }
        statusView.setImage(image, f, f4);
    }

    public static void u(StatusView statusView, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) == 0;
        boolean z6 = (i & 8) == 0;
        ProgressBar progressBar = statusView.o;
        statusView.f59721m.setVisibility(!z ? 4 : 0);
        statusView.f59722n.setVisibility(z3 ? 0 : 8);
        statusView.f59723p.setVisibility(z4 ? 0 : 8);
        statusView.f59725r.setVisibility(z4 ? 0 : 8);
        if (z6 && !statusView.C) {
            progressBar.setIndeterminateDrawable(new RevolutAnimatableDrawable(statusView.getContext().getDrawable(R$drawable.uikit_icn_48_loading_anim)));
            Context context = statusView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            progressBar.setIndeterminateTintList(kli.a.u(R$attr.uikit_colorAccent, context));
            statusView.C = true;
        }
        progressBar.setVisibility(z6 ? 0 : 8);
        statusView.f59729x.setVisibility(8);
        statusView.f59730y.setVisibility(8);
        statusView.f59727t.setVisibility(8);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    public final Object getAnalyticsProduct() {
        return this.analyticsProduct;
    }

    @Override // rr0.a
    @NotNull
    public Drawable getClonableBackground() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ColorDrawable(kli.a.s(L, context));
    }

    public final Image getImage() {
        return u.k(this).Q().d(this.f59722n);
    }

    @Override // ix0.w0, ix0.v0
    public boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable() || getHandlesBottomSheetInsets();
    }

    public final Clause getTitle$ui_kit_components_release() {
        return ((y) u.k(this).b0()).o(this.u);
    }

    @NotNull
    /* JADX INFO: renamed from: getTitleContainer$ui_kit_components_release, reason: from getter */
    public final LinearLayout getTitleContainer() {
        return this.titleContainer;
    }

    public final void l() {
        TransitionSet transition = new TransitionSet();
        int i = 0;
        transition.setOrdering(0);
        int i2 = gy0.d.f147771a[this.f59714a.ordinal()];
        TextView textView = this.u;
        if (i2 == 1) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(500L);
            changeBounds.excludeTarget((View) textView, true);
            transition.addTransition(changeBounds);
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Fade fade = new Fade();
        fade.addTarget(this.f59721m);
        fade.addTarget(textView);
        fade.addTarget(this.v);
        fade.addTarget(this.f59728w);
        fade.addTarget(this.f59729x);
        fade.addTarget(this.f59730y);
        fade.setDuration(250L);
        fade.setStartDelay(250L);
        transition.addTransition(fade);
        Transition dVar = new hs0.d(i);
        dVar.addTarget(this.f59722n);
        dVar.addTarget(this.f59723p);
        ProgressBar progressBar = this.o;
        dVar.addTarget(progressBar);
        dVar.setDuration(500L);
        transition.addTransition(dVar);
        hs0.c cVar = new hs0.c();
        cVar.setDuration(500L);
        cVar.addTarget(textView);
        transition.addTransition(cVar);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        RevolutAnimatableDrawable drawable = indeterminateDrawable instanceof RevolutAnimatableDrawable ? (RevolutAnimatableDrawable) indeterminateDrawable : null;
        if (drawable != null) {
            hs0.f.Companion.getClass();
            Intrinsics.checkNotNullParameter(transition, "transition");
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            drawable.c(true);
            transition.addListener((Transition.TransitionListener) new hs0.f(drawable));
        }
        b bVar = new b();
        this.K = bVar;
        transition.addListener((Transition.TransitionListener) bVar);
        TransitionManager.beginDelayedTransition(this, transition);
    }

    public final void m() {
        this.z.a();
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f59721m.setProgress(100);
        this.f59715b.onNext(gy0.b.FINISHED);
    }

    public final r n() {
        return this.f59716c;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final f getF59715b() {
        return this.f59715b;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean handlesBottomSheetInsets = getHandlesBottomSheetInsets();
        c2 c2Var = this.H;
        if (handlesBottomSheetInsets) {
            insets = c2Var.c(insets);
        }
        c2Var.getClass();
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (((v0) c2Var.f169221a).getInsetsAdjustable()) {
            insets = x0.a(insets);
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        c cVar = c.STANDALONE;
        c cVar2 = this.f59714a;
        if (cVar2 == cVar && motionEvent.getActionMasked() == 0) {
            this.z.b();
        }
        if (cVar2 != cVar || !getAllowSwipeToDismiss() || this.f != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f59719j = false;
            this.f59718h = motionEvent.getY(motionEvent.getActionIndex());
            this.f59717g = motionEvent.getPointerId(0);
        } else if (actionMasked == 2 && (iFindPointerIndex = motionEvent.findPointerIndex(this.f59717g)) >= 0 && getScrollY() == 0 && motionEvent.getY(iFindPointerIndex) - this.f59718h > this.f59720l) {
            this.f59719j = true;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.status.StatusView.onMeasure(int, int):void");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = gy0.d.f147771a[this.f59714a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return super.onTouchEvent(event);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (getAllowSwipeToDismiss() && this.f != null) {
            return super.onTouchEvent(event);
        }
        if (!this.k.onTouchEvent(event)) {
            int actionMasked = event.getActionMasked();
            qu0.a aVar = this.z;
            if (actionMasked == 0) {
                aVar.b();
                this.f59718h = event.getY(event.getActionIndex());
                this.f59717g = event.getPointerId(0);
                super.onTouchEvent(event);
                return true;
            }
            float f = BitmapDescriptorFactory.HUE_RED;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 6) {
                            return super.onTouchEvent(event);
                        }
                        int actionIndex = event.getActionIndex();
                        int pointerId = event.getPointerId(actionIndex);
                        Integer numValueOf = Integer.valueOf(pointerId);
                        if (pointerId != this.f59717g) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int i2 = actionIndex == 0 ? 1 : 0;
                            this.f59718h = event.getY(i2);
                            this.f59717g = event.getPointerId(i2);
                            return true;
                        }
                    }
                } else {
                    if (!this.f59719j) {
                        return super.onTouchEvent(event);
                    }
                    float y2 = event.getY(event.findPointerIndex(this.f59717g));
                    this.i = (y2 - this.f59718h) + this.i;
                    float translationY = getTranslationY() + this.i;
                    if (translationY >= BitmapDescriptorFactory.HUE_RED) {
                        f = translationY;
                    }
                    setTranslationY(f);
                    invalidate();
                    this.f59718h = y2;
                    if (Math.abs(getTranslationY() / getHeight()) > 0.3f) {
                        aVar.a();
                        s();
                    }
                }
            }
            this.f59717g = -1;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.f59719j = false;
            aVar.c();
            super.onTouchEvent(event);
            return true;
        }
        return true;
    }

    public final r p() {
        return this.f59729x.o;
    }

    public final r q() {
        return this.f59730y.o;
    }

    public final void r() {
        this.z.b();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        int i = gy0.d.f147771a[this.f59714a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f59715b.onNext(gy0.b.FINISHED);
            return;
        }
        float height = getHeight();
        float fAbs = (height * 0.5f) + Math.abs(height - getTranslationY());
        boolean z = m.f176847a;
        long integer = getResources().getInteger(R.integer.config_mediumAnimTime);
        k animationType = k.DISMISS;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), getTranslationY() + fAbs);
        objectAnimatorOfFloat.setDuration(integer);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new e());
        objectAnimatorOfFloat.addListener(new l5(this, 5));
        objectAnimatorOfFloat.start();
        this.f = objectAnimatorOfFloat;
    }

    public final void setAllowSwipeToDismiss(boolean allowSwipeToDismiss) {
        this.allowSwipeToDismiss = allowSwipeToDismiss;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setAnalyticsProduct(Object obj2) {
        this.analyticsProduct = obj2;
    }

    public final void setDescription(Clause clause) {
        kli.a.d(this.v, clause, this, this.d, 8);
    }

    public final void setDescriptionProgress(int progress, int colorAttr) {
        ProgressBar progressBar = this.f59728w;
        progressBar.setVisibility(0);
        progressBar.setProgress(progress);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(colorAttr, context)));
    }

    public final void setImage(Image image, Float imageWidthDp, Float imageHeightDp) {
        int iK;
        int iK2;
        if (imageWidthDp != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, imageWidthDp.floatValue());
        } else {
            iK = this.F;
        }
        if (imageHeightDp != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK2 = kli.a.k(context2, imageHeightDp.floatValue());
        } else {
            iK2 = this.G;
        }
        LottieAnimationView lottieAnimationView = this.f59722n;
        u.A(lottieAnimationView, iK2, iK);
        zi0.c.g(lottieAnimationView, image);
    }

    public final void setImageRes(int drawableRes, Integer colorAttr) {
        LottieAnimationView lottieAnimationView = this.f59722n;
        lottieAnimationView.cancelAnimation();
        u.A(lottieAnimationView, this.G, this.F);
        yy0.f.e(u.k(this).Q(), new ResourceImage(drawableRes, (Integer) null, (Integer) null, colorAttr, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 182), this.f59722n, null, null, 12);
    }

    public final void setPrimaryButtonEnabled(boolean enabled) {
        this.f59729x.setEnabled(enabled);
    }

    public final void setPrimaryButtonIcon(Image icon) {
        this.f59729x.setIcon(icon);
    }

    public final void setPrimaryButtonStyle(@NotNull LargeActionButton.ButtonStyle largeActionButtonStyle) {
        Intrinsics.checkNotNullParameter(largeActionButtonStyle, "largeActionButtonStyle");
        this.f59729x.o(largeActionButtonStyle);
    }

    public final void setPrimaryButtonText(Clause clause) {
        this.f59729x.setText(clause);
        setPrimaryButtonVisible(clause != null);
    }

    public final void setPrimaryButtonVisible(boolean visible) {
        this.f59729x.setVisibility(visible ? 0 : 8);
    }

    public final void setPrimaryButtonsAnalyticsContext(Parcelable analyticsContext) {
        this.f59729x.setAnalyticsContext(analyticsContext);
    }

    public final void setSecondaryButtonAnalyticsContext(Parcelable analyticsContext) {
        this.f59730y.setAnalyticsContext(analyticsContext);
    }

    public final void setSecondaryButtonIcon(Image icon) {
        this.f59730y.setIcon(icon);
    }

    public final void setSecondaryButtonText(Clause clause) {
        LargeActionButton largeActionButton = this.f59730y;
        largeActionButton.setText(clause);
        largeActionButton.setVisibility(clause != null ? 0 : 8);
    }

    public final void setTitle(Clause clause) {
        kli.a.d(this.u, clause, this, this.d, 8);
    }

    public final void setTitleImage(Image image) {
        int i = image != null ? 0 : 8;
        AppCompatImageView appCompatImageView = this.f59727t;
        appCompatImageView.setVisibility(i);
        yy0.f.e(u.k(appCompatImageView).Q(), image, this.f59727t, null, null, 12);
    }

    public final void setTitleMaxLines(int maxLines) {
        this.u.setMaxLines(maxLines);
    }

    public final void t(Sound.UrlSound sound) {
        Intrinsics.checkNotNullParameter(sound, "sound");
        ((com.revolut.core.ui_kit_core.displayers.sound.a) u.k(this).c0()).a(sound);
    }

    public final void w() {
        this.z.c();
    }

    public final void x(long j2) {
        boolean z = m.f176847a;
        k animationType = k.PROGRESS;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        l onEnd = new l(this, 4);
        qu0.a aVar = this.z;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        aVar.a();
        aVar.e = DateTimeUtils.currentTimeMillis();
        long j3 = j2 < 0 ? 0L : j2;
        aVar.f = j3;
        aVar.f249172g = onEnd;
        aVar.i = false;
        aVar.f249170b.postDelayed(aVar.d, j3);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(aVar.f249169a, "progress", 0, 100);
        if (j2 < 0) {
            j2 = 0;
        }
        objectAnimatorOfInt.setDuration(j2);
        objectAnimatorOfInt.setInterpolator(aVar.f249171c);
        objectAnimatorOfInt.start();
        aVar.f249173h = objectAnimatorOfInt;
    }

    public final void y(int i) {
        int i2;
        boolean z = this.B;
        CircleProgressBar circleProgressBar = this.f59724q;
        if (z) {
            i2 = i;
            circleProgressBar.setProgress(i2);
        } else {
            int i3 = R$attr.uikit_colorAccent;
            i2 = i;
            circleProgressBar.a(new ProgressStyle(i2, 100, i3, i3, R$attr.uikit_colorGreyTone10, 3.5f, 3.5f, null, ViewUtils.EDGE_TO_EDGE_FLAGS));
            this.B = true;
        }
        kli.a.b(this.f59725r, new TextClause(a0.d.h(i2, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StatusView(@org.jetbrains.annotations.NotNull android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.status.StatusView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ StatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
