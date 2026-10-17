package com.revolut.core.ui_kit.internal.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import aw0.u1;
import aw0.v1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$dimen;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import ms0.e4;
import ms0.h4;
import ms0.m4;
import ms0.n4;
import ms0.o4;
import ms0.p4;
import ms0.q4;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.x;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\u001aEFB'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010#J\u0019\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R.\u0010?\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SmallActionButtonWithPager;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ltx0/x;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lur0/a;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "count", "", "setTotalPages", "(I)V", "position", "setCurrentPage", "normalColor", "selectedColor", "setIndicatorColors", "(II)V", "getPagesCount", "()I", "Lms0/n4;", "newModel", "setModel", "(Lms0/n4;)V", "setPagerTotalPages", "setPagerCurrentPage", "", "isLoading", "setLoading", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "isClickable", "setIsClickable", "notificationCount", "setNotificationCount", "(Ljava/lang/Integer;)V", "Lcom/revolut/core/ui_kit/views/ScrollingPagerIndicatorView;", "h", "Lkotlin/Lazy;", "getPagerIndicatorView", "()Lcom/revolut/core/ui_kit/views/ScrollingPagerIndicatorView;", "pagerIndicatorView", "Landroid/os/Parcelable;", "value", "v", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Companion", "a", "ms0/o4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallActionButtonWithPager extends ConstraintLayout implements x, TrackableItem, ur0.a, LifecycleEventObserver {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f56399w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f56400b;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f56401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f56402h;
    public final kt0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o4 f56403j;
    public AnimatorSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f56404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f56405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f56406n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f56407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SmallActionButton f56408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TagView f56409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ShimmerFrameLayout f56410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n4 f56411t;
    public Lifecycle u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallActionButtonWithPager(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ScrollingPagerIndicatorView getPagerIndicatorView() {
        return (ScrollingPagerIndicatorView) this.f56402h.getValue();
    }

    private final void setIcon(Image image) {
        this.f56408q.setIcon(image);
        n4 n4Var = this.f56411t;
        if (n4Var == null || !n4Var.e || image == null) {
            return;
        }
        this.f56401g.setVisibility(4);
    }

    private final void setIsClickable(boolean isClickable) {
        setClickable(isClickable);
        SmallActionButton smallActionButton = this.f56408q;
        smallActionButton.setEnabled(isClickable);
        smallActionButton.setState(isClickable ? e4.EnabledClickable : e4.DisabledNonClickable);
    }

    private final void setLoading(boolean isLoading) {
        int i;
        float f;
        SmallActionButton smallActionButton = this.f56408q;
        if (isLoading) {
            g0();
            if (this.f56410s == null) {
                View view = new View(getContext());
                view.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
                RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iS = kli.a.s(R$attr.uikit_colorGreyTone8, context);
                companion.getClass();
                view.setBackground(RoundedBackgroundDrawable.Companion.c(iS, context));
                ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(getContext());
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
                layoutParams.startToStart = smallActionButton.getId();
                layoutParams.endToEnd = smallActionButton.getId();
                layoutParams.topToTop = smallActionButton.getId();
                layoutParams.bottomToBottom = smallActionButton.getId();
                shimmerFrameLayout.setLayoutParams(layoutParams);
                shimmerFrameLayout.setVisibility(8);
                shimmerFrameLayout.addView(view);
                ifk.b.q(shimmerFrameLayout, null, 3);
                addView(shimmerFrameLayout);
                this.f56410s = shimmerFrameLayout;
            }
            smallActionButton.setVisibility(isLoading ? 4 : 0);
            ShimmerFrameLayout shimmerFrameLayout2 = this.f56410s;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.setVisibility(isLoading ? 0 : 8);
            }
            l0();
            ShimmerFrameLayout shimmerFrameLayout3 = this.f56410s;
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.e();
                return;
            }
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout4 = this.f56410s;
        if (shimmerFrameLayout4 != null) {
            shimmerFrameLayout4.f();
        }
        smallActionButton.setVisibility(isLoading ? 4 : 0);
        ShimmerFrameLayout shimmerFrameLayout5 = this.f56410s;
        if (shimmerFrameLayout5 != null) {
            shimmerFrameLayout5.setVisibility(isLoading ? 0 : 8);
        }
        l0();
        o4 o4Var = this.f56403j;
        n4 n4Var = this.f56411t;
        if (n4Var == null || !n4Var.e) {
            g0();
            AnimatorSet animatorSet = this.k;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f56403j = o4Var;
            int i2 = p4.f208368a[o4Var.ordinal()];
            float f4 = 1.0f;
            float f5 = BitmapDescriptorFactory.HUE_RED;
            ImageView imageView = this.f56401g;
            if (i2 == 1) {
                i = imageView.getDrawable() != null ? 0 : 8;
                f = i == 0 ? 1.0f : 0.0f;
                f5 = 1.0f;
                f4 = 0.0f;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = imageView.getDrawable() == null ? 8 : 4;
                i = 0;
                f = 0.0f;
            }
            getPagerIndicatorView().setAlpha(f4);
            getPagerIndicatorView().setVisibility(i);
            TextView textView = this.f;
            textView.setAlpha(f5);
            textView.setVisibility(0);
            imageView.setAlpha(f);
            imageView.setVisibility(i);
        }
        if (this.f56403j == o4.INDICATOR_VISIBLE && this.f56404l) {
            i0();
        }
    }

    private final void setNotificationCount(Integer notificationCount) {
        this.f56406n = notificationCount != null ? notificationCount.intValue() : 0;
        l0();
    }

    private final void setPagerCurrentPage(int position) {
        getPagerIndicatorView().setCurrentPosition(position);
    }

    private final void setPagerTotalPages(int count) {
        Integer num = this.f56405m;
        if (num != null && num.intValue() == count) {
            return;
        }
        this.f56405m = Integer.valueOf(count);
        getPagerIndicatorView().setDotCount(count);
        j0();
        if (this.f56403j == o4.INDICATOR_VISIBLE && this.f56404l) {
            i0();
        }
    }

    private final void setText(Clause clause) {
        this.f56408q.setText(clause);
        n4 n4Var = this.f56411t;
        if (n4Var == null || !n4Var.e) {
            return;
        }
        this.f.setVisibility(4);
    }

    @Override // tx0.x
    public final void K(float f, int i) {
        getPagerIndicatorView().K(f, i);
        j0();
        if (this.f56403j == o4.INDICATOR_VISIBLE && this.f56404l) {
            i0();
        }
    }

    @Override // tx0.x
    public final void P(ViewPager2 pager) {
        Intrinsics.checkNotNullParameter(pager, "pager");
        getPagerIndicatorView().P(pager);
    }

    @Override // tx0.x
    public final void a() {
        getPagerIndicatorView().a();
    }

    public final void g0() {
        removeCallbacks(this.i);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    public int getPagesCount() {
        return getPagerIndicatorView().getPagesCount();
    }

    @Override // tx0.x
    @NotNull
    public View getView() {
        return this;
    }

    public final void h0() {
        int visibility;
        int visibility2;
        int i;
        int i2;
        float f;
        int i3;
        int visibility3;
        n4 n4Var = this.f56411t;
        if (n4Var == null || !n4Var.e) {
            AnimatorSet animatorSet = this.k;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.k = null;
            ImageView imageView = this.f56401g;
            boolean z = imageView.getDrawable() != null;
            int i5 = p4.f208368a[this.f56403j.ordinal()];
            float f4 = BitmapDescriptorFactory.HUE_RED;
            TextView textView = this.f;
            if (i5 == 1) {
                visibility = z ? 0 : imageView.getVisibility();
                int visibility4 = getPagerIndicatorView().getVisibility();
                visibility2 = z ? 0 : imageView.getVisibility();
                i = 0;
                i2 = 8;
                f = 0.0f;
                f4 = 1.0f;
                i3 = visibility4;
                visibility3 = 0;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                visibility3 = textView.getVisibility();
                visibility = imageView.getVisibility();
                int visibility5 = textView.getVisibility();
                visibility2 = z ? 4 : imageView.getVisibility();
                i2 = 0;
                i = visibility5;
                f = 1.0f;
                i3 = 0;
            }
            int i6 = visibility2;
            int i21 = visibility;
            float f5 = f4;
            textView.setVisibility(visibility3);
            imageView.setVisibility(i21);
            getPagerIndicatorView().setVisibility(i3);
            ArrayList arrayList = new ArrayList();
            float[] fArr = {f4};
            Property property = ViewGroup.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
            boolean z3 = z;
            objectAnimatorOfFloat.setDuration(300L);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
            arrayList.add(objectAnimatorOfFloat);
            if (z3) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, f5);
                objectAnimatorOfFloat2.setDuration(300L);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "apply(...)");
                arrayList.add(objectAnimatorOfFloat2);
            }
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getPagerIndicatorView(), (Property<ScrollingPagerIndicatorView, Float>) property, f);
            objectAnimatorOfFloat3.setDuration(300L);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat3, "apply(...)");
            arrayList.add(objectAnimatorOfFloat3);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.addListener(new q4(this, i, i6, i2));
            animatorSet2.start();
            this.k = animatorSet2;
        }
    }

    public final void i0() {
        n4 n4Var = this.f56411t;
        if (n4Var == null || !n4Var.e) {
            g0();
            postDelayed(this.i, 1600L);
        }
    }

    public final void j0() {
        o4 o4Var = this.f56403j;
        o4 o4Var2 = o4.INDICATOR_VISIBLE;
        if (o4Var != o4Var2 && getPagerIndicatorView().getPagesCount() >= getPagerIndicatorView().getF58856g()) {
            g0();
            this.f56403j = o4Var2;
            h0();
        }
    }

    public final void l0() {
        n4 n4Var = this.f56411t;
        if (n4Var != null && n4Var.e) {
            TagView tagView = this.f56409r;
            if (tagView != null) {
                tagView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f56406n <= 0) {
            TagView tagView2 = this.f56409r;
            if (tagView2 != null) {
                tagView2.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f56409r == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TagView tagView3 = new TagView(context, null, 6, 0);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.topToTop = 0;
            layoutParams.endToEnd = 0;
            addView(tagView3, layoutParams);
            this.f56409r = tagView3;
        }
        TagView tagView4 = this.f56409r;
        if (tagView4 != null) {
            NumberClause numberClause = new NumberClause(this.f56406n, (NumberClause.Format.Compact) null, new Custom(Integer.valueOf(this.f56407p), false, null, false, null, 254), 2);
            int i = this.o;
            tagView4.setContent(new TagViewData(null, numberClause, new Color.Solid(i), i, null, 1000));
        }
        TagView tagView5 = this.f56409r;
        if (tagView5 != null) {
            tagView5.setVisibility(0);
        }
    }

    public final void m0() {
        int currentTextColor = this.f.getCurrentTextColor();
        getPagerIndicatorView().setDotColor(currentTextColor);
        getPagerIndicatorView().setSelectedDotColor(currentTextColor);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycleA = w.A(getView());
        this.u = lifecycleA;
        if (lifecycleA != null) {
            lifecycleA.addObserver(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Lifecycle lifecycle = this.u;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        this.u = null;
        g0();
        super.onDetachedFromWindow();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (p4.f208370c[event.ordinal()]) {
            case 1:
                j0();
                if (this.f56403j == o4.INDICATOR_VISIBLE && this.f56404l) {
                    i0();
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.o = colorScheme.a();
        int i6 = u1.f10553a[colorScheme.ordinal()];
        if (i6 == 1) {
            i5 = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnLightBackground;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnDarkBackground;
        }
        this.f56407p = i5;
        foh.i.e(this.f56408q, colorScheme, i, i2, i3);
        m0();
        l0();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
        this.f56408q.setAnalyticsContext(parcelable);
    }

    public void setCurrentPage(int position) {
        setPagerCurrentPage(position);
    }

    @Override // tx0.x
    public void setIndicatorColors(int normalColor, int selectedColor) {
        getPagerIndicatorView().setDotColor(normalColor);
        getPagerIndicatorView().setSelectedDotColor(selectedColor);
    }

    public final void setModel(@NotNull n4 newModel) {
        h4 h4Var;
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        if (Intrinsics.f(this.f56411t, newModel)) {
            return;
        }
        n4 n4Var = this.f56411t;
        this.f56411t = newModel;
        newModel.getClass();
        boolean z = newModel.e;
        boolean z3 = newModel.f208340b;
        Integer num = newModel.f208341c;
        Clause clause = newModel.f208339a;
        if (!Intrinsics.f(n4Var != null ? n4Var.f208339a : null, clause)) {
            setText(clause);
        }
        if (!Intrinsics.f(n4Var != null ? n4Var.f208341c : null, num)) {
            setNotificationCount(num);
        }
        if (n4Var == null || n4Var.f208340b != z3) {
            setIsClickable(z3);
        }
        m4 m4Var = n4Var != null ? n4Var.d : null;
        m4 m4Var2 = newModel.d;
        if (m4Var != m4Var2) {
            int i = p4.f208369b[m4Var2.ordinal()];
            if (i == 1) {
                h4Var = h4.CONTEXTUAL;
            } else if (i == 2) {
                h4Var = h4.WHITE_OR_BLACK_INVERTED;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                h4Var = h4.CONTEXTUAL;
            }
            this.f56408q.i(h4Var);
            m0();
        }
        if (n4Var == null || n4Var.e != z) {
            setLoading(z);
        }
    }

    @Override // tx0.x
    public void setTotalPages(int count) {
        setPagerTotalPages(count);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallActionButtonWithPager(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallActionButtonWithPager(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56402h = yhm.j.c(yhm.k.NONE, new r(this, 18));
        this.i = new kt0.d(this, 12);
        this.f56403j = o4.CONTENT_VISIBLE;
        this.f56404l = true;
        this.o = R$attr.uikit_colorForeground;
        this.f56407p = R$attr.uikit_colorBackground;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.internal_dp4);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
        smallActionButton.setId(R$id.uikit_accountSwitcherPagerIndicatorButton);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        int dimensionPixelSize2 = smallActionButton.getResources().getDimensionPixelSize(R$dimen.internal_dp4);
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        smallActionButton.setLayoutParams(layoutParams);
        this.f56408q = smallActionButton;
        addView(smallActionButton);
        this.f56400b = smallActionButton.getContainer$ui_kit_components_release();
        this.f = smallActionButton.getActionText$ui_kit_components_release();
        this.f56401g = smallActionButton.getActionIcon$ui_kit_components_release();
        m0();
        setClipToPadding(false);
        setClipChildren(false);
    }

    public /* synthetic */ SmallActionButtonWithPager(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
