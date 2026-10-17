package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Outline;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.m6;
import com.revolut.core.ui_kit.delegates.n6;
import com.revolut.core.ui_kit.delegates.o6;
import com.revolut.core.ui_kit.delegates.p6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalSmallButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$dimen;
import ip0.kt;
import ix0.c0;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import mx0.bb;
import mx0.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0095\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\f¢\u0006\u0004\b)\u0010\u0010J#\u0010.\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b0\u0010/J\u001f\u00106\u001a\u00020\u000e2\u0006\u0010+\u001a\u0002022\u0006\u0010\u0016\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u001d\u00109\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\b¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\fH\u0007¢\u0006\u0004\b?\u0010\u0010R$\u0010G\u001a\u0004\u0018\u00010@8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR!\u0010O\u001a\u00020H8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010N\u001a\u0004\bK\u0010LR!\u0010S\u001a\u00020H8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bP\u0010J\u0012\u0004\bR\u0010N\u001a\u0004\bQ\u0010LR!\u0010Y\u001a\u00020T8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bU\u0010J\u0012\u0004\bX\u0010N\u001a\u0004\bV\u0010WR!\u0010_\u001a\u00020Z8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b[\u0010J\u0012\u0004\b^\u0010N\u001a\u0004\b\\\u0010]R!\u0010e\u001a\u00020`8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\ba\u0010J\u0012\u0004\bd\u0010N\u001a\u0004\bb\u0010cR!\u0010i\u001a\u00020`8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bf\u0010J\u0012\u0004\bh\u0010N\u001a\u0004\bg\u0010cR!\u0010o\u001a\u00020j8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bk\u0010J\u0012\u0004\bn\u0010N\u001a\u0004\bl\u0010mR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010J\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010J\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010J\u001a\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010J\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010J\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u0093\u0001\u001a\u00030\u008f\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0092\u0001\u0010N\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/FullScreenStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setContentEnabled", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "setTitleText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/delegates/p6;", "style", "setTitleStyle", "(Lcom/revolut/core/ui_kit/delegates/p6;)V", "singleLine", "setTitleSingleLine", "caption", "Lkotlin/Function1;", "Lty0/a;", "onClick", "setCaptionText", "(Lcom/revolut/core/ui_kit/models/Clause;Lkotlin/jvm/functions/Function1;)V", "setCaptionSingleLine", "clickable", "setCaptionClickable", "Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$a;", "action", "setMainAction", "(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$a;)V", "fitHeight", "setFitHeight", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;", "image", "Landroid/view/View$OnClickListener;", "clickListener", "setImage", "(Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage;Landroid/view/View$OnClickListener;)V", "setImageClickListener$ui_kit_components_release", "setImageClickListener", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Avatar;", "Lmx0/i1;", "setAvatarImage$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Avatar;Lmx0/i1;)V", "setAvatarImage", "widthDp", "heightDp", "setImageSize", "(II)V", "sizeDp", "setImagePaddings", "(I)V", "enableRounding", "setLottieImageRounding", "Landroid/os/Parcelable;", "b", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Landroid/widget/TextView;", "f", "Le8/q;", "getTitleView", "()Landroid/widget/TextView;", "getTitleView$annotations", "()V", "titleView", "g", "getCaptionView", "getCaptionView$annotations", "captionView", "Landroid/widget/FrameLayout;", "h", "getImageContainerView", "()Landroid/widget/FrameLayout;", "getImageContainerView$annotations", "imageContainerView", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "i", "getSmallActionButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "getSmallActionButton$annotations", "smallActionButton", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "j", "getPrimaryLargeActionButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "getPrimaryLargeActionButton$annotations", "primaryLargeActionButton", "k", "getSecondaryLargeActionButton", "getSecondaryLargeActionButton$annotations", "secondaryLargeActionButton", "Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalSmallButton;", "l", "getHorizontalButtons", "()Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalSmallButton;", "getHorizontalButtons$annotations", "horizontalButtons", "Landroid/widget/ImageView;", "m", "getRegularImageView", "()Landroid/widget/ImageView;", "regularImageView", "Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "n", "getOverlappedIconsView", "()Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "overlappedIconsView", "Lcom/airbnb/lottie/LottieAnimationView;", "o", "getLottieImageView", "()Lcom/airbnb/lottie/LottieAnimationView;", "lottieImageView", "Lcom/revolut/core/ui_kit/internal/views/videoplayer/UiKitPlayerView;", "p", "getVideoPlayerView", "()Lcom/revolut/core/ui_kit/internal/views/videoplayer/UiKitPlayerView;", "videoPlayerView", "Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "q", "getShadowVideo", "()Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "shadowVideo", "Lfp0/p;", "t", "Lkotlin/Lazy;", "getImageClickHandler", "()Lfp0/p;", "imageClickHandler", "Lcom/revolut/core/ui_kit/views/AvatarView;", "getAvatarView", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "getAvatarView$annotations", "avatarView", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FullScreenStateView extends ConstraintLayout implements TrackableItem, w0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q titleView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q captionView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageContainerView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q smallActionButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final e8.q primaryLargeActionButton;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final e8.q secondaryLargeActionButton;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q horizontalButtons;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q regularImageView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q overlappedIconsView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q lottieImageView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q videoPlayerView;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q shadowVideo;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final iv0.q f58620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2 f58621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f58622t;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.FullScreenStateView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenStateView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(LargeActionButton largeActionButton, n6 n6Var) {
        largeActionButton.setVisibility(0);
        largeActionButton.setText(n6Var.f54496a);
        largeActionButton.setIcon(n6Var.f54498c);
        largeActionButton.o(n6Var.f54497b);
        largeActionButton.setLoadingButtonTag(null);
        largeActionButton.setEnabled(n6Var.d);
    }

    public static /* synthetic */ void getAvatarView$annotations() {
    }

    public static /* synthetic */ void getCaptionView$annotations() {
    }

    public static /* synthetic */ void getHorizontalButtons$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final fp0.p getImageClickHandler() {
        return (fp0.p) this.f58622t.getValue();
    }

    public static /* synthetic */ void getImageContainerView$annotations() {
    }

    private final LottieAnimationView getLottieImageView() {
        return (LottieAnimationView) this.lottieImageView.f();
    }

    private final OverlappedIconsView getOverlappedIconsView() {
        return (OverlappedIconsView) this.overlappedIconsView.f();
    }

    public static /* synthetic */ void getPrimaryLargeActionButton$annotations() {
    }

    private final ImageView getRegularImageView() {
        return (ImageView) this.regularImageView.f();
    }

    public static /* synthetic */ void getSecondaryLargeActionButton$annotations() {
    }

    private final ShadowLayout getShadowVideo() {
        return (ShadowLayout) this.shadowVideo.f();
    }

    public static /* synthetic */ void getSmallActionButton$annotations() {
    }

    public static /* synthetic */ void getTitleView$annotations() {
    }

    private final UiKitPlayerView getVideoPlayerView() {
        return (UiKitPlayerView) this.videoPlayerView.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCaptionText$default(FullScreenStateView fullScreenStateView, Clause clause, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        fullScreenStateView.setCaptionText(clause, function1);
    }

    public static /* synthetic */ void setImage$default(FullScreenStateView fullScreenStateView, ComplexImage complexImage, View.OnClickListener onClickListener, int i, Object obj2) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        fullScreenStateView.setImage(complexImage, onClickListener);
    }

    public final ihm.f g0() {
        return getSmallActionButton().f56386h;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF() {
        return this.analyticsContext;
    }

    @NotNull
    public final AvatarView getAvatarView() {
        return (AvatarView) this.f58620r.a();
    }

    @NotNull
    public final TextView getCaptionView() {
        return (TextView) this.captionView.f();
    }

    @NotNull
    public final TwinHorizontalSmallButton getHorizontalButtons() {
        return (TwinHorizontalSmallButton) this.horizontalButtons.f();
    }

    @NotNull
    public final FrameLayout getImageContainerView() {
        return (FrameLayout) this.imageContainerView.f();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @NotNull
    public final LargeActionButton getPrimaryLargeActionButton() {
        return (LargeActionButton) this.primaryLargeActionButton.f();
    }

    @NotNull
    public final LargeActionButton getSecondaryLargeActionButton() {
        return (LargeActionButton) this.secondaryLargeActionButton.f();
    }

    @NotNull
    public final SmallActionButton getSmallActionButton() {
        return (SmallActionButton) this.smallActionButton.f();
    }

    @NotNull
    public final TextView getTitleView() {
        return (TextView) this.titleView.f();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return super.onApplyWindowInsets(this.f58621s.c(insets));
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setAvatarImage$ui_kit_components_release(@NotNull ComplexImage.Avatar image, @NotNull i1 style) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        getImageContainerView().setVisibility(0);
        getRegularImageView().setVisibility(8);
        getOverlappedIconsView().setVisibility(8);
        getLottieImageView().setVisibility(8);
        getVideoPlayerView().setVisibility(8);
        this.f58620r.d(true);
        getAvatarView().setDefaultAvatarStyle$ui_kit_components_release(style);
        getAvatarView().t0(new a7(this, 1));
        getAvatarView().setModel(image.f55833a);
    }

    public final void setCaptionClickable(boolean clickable) {
        getCaptionView().setMovementMethod(clickable ? c0.f169220a : null);
    }

    public final void setCaptionSingleLine(boolean singleLine) {
        getCaptionView().setSingleLine(singleLine);
    }

    public final void setCaptionText(Clause caption, Function1<? super ty0.a, Unit> onClick) {
        kli.a.d(getCaptionView(), caption, this, onClick, 8);
    }

    public final void setContentEnabled(boolean enabled) {
        TextView titleView = getTitleView();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        titleView.setTextColor(kli.a.s(enabled ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50, context));
        rd0.e.u(getRegularImageView(), new yp0.o(yp0.n.FACTOR_50, enabled ? 0 : R$attr.uikit_colorGreyTone50), true);
    }

    public final void setFitHeight(boolean fitHeight) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = fitHeight ? -1 : -2;
        setLayoutParams(layoutParams);
    }

    public final void setImage(ComplexImage image, View.OnClickListener clickListener) {
        boolean z = image instanceof ComplexImage.Regular;
        iv0.q qVar = this.f58620r;
        if (z) {
            getImageContainerView().setVisibility(0);
            getRegularImageView().setVisibility(0);
            getOverlappedIconsView().setVisibility(8);
            getLottieImageView().setVisibility(8);
            getVideoPlayerView().setVisibility(8);
            qVar.d(false);
            yy0.f.e(or0.u.k(this).Q(), ((ComplexImage.Regular) image).f55837a, getRegularImageView(), null, null, 12);
        } else if (image instanceof ComplexImage.Overlapped) {
            getImageContainerView().setVisibility(0);
            getRegularImageView().setVisibility(8);
            getOverlappedIconsView().setVisibility(0);
            getLottieImageView().setVisibility(8);
            getVideoPlayerView().setVisibility(8);
            qVar.d(false);
            OverlappedIconsView.setIcons$default(getOverlappedIconsView(), ((ComplexImage.Overlapped) image).f55836a, bb.LARGE, null, 0, false, 28, null);
        } else if (image instanceof ComplexImage.Lottie) {
            getImageContainerView().setVisibility(0);
            getRegularImageView().setVisibility(8);
            getOverlappedIconsView().setVisibility(8);
            getVideoPlayerView().setVisibility(8);
            getLottieImageView().setVisibility(0);
            qVar.d(false);
            ComplexImage.Lottie lottie = (ComplexImage.Lottie) image;
            setLottieImageRounding(lottie.f55835b);
            yy0.f.e(or0.u.k(this).Q(), lottie.f55834a, getLottieImageView(), null, null, 12);
        } else if (image instanceof ComplexImage.Video) {
            getImageContainerView().setVisibility(0);
            getRegularImageView().setVisibility(8);
            getOverlappedIconsView().setVisibility(8);
            getLottieImageView().setVisibility(8);
            getVideoPlayerView().setVisibility(0);
            qVar.d(false);
            getVideoPlayerView().setShutter(new VideoShutter.Colored(new Color.Solid(R$attr.uikit_colorGroupedBackground)));
            or0.u.k(this).V().a(((ComplexImage.Video) image).f55838a, getVideoPlayerView(), null);
        } else if (image instanceof ComplexImage.Avatar) {
            setAvatarImage$ui_kit_components_release((ComplexImage.Avatar) image, i1.SIZE_56_56);
        } else {
            if (image != null) {
                throw new NoWhenBranchMatchedException();
            }
            getImageContainerView().setVisibility(8);
            getRegularImageView().setVisibility(8);
            getOverlappedIconsView().setVisibility(8);
            getLottieImageView().setVisibility(8);
            getVideoPlayerView().setVisibility(8);
            qVar.d(false);
        }
        setImageClickListener$ui_kit_components_release(image, clickListener);
    }

    public final void setImageClickListener$ui_kit_components_release(ComplexImage image, View.OnClickListener clickListener) {
        py0.b bVar;
        if (image instanceof ComplexImage.Regular) {
            bVar = new py0.b(((ComplexImage.Regular) image).f55837a);
        } else if (image instanceof ComplexImage.Lottie) {
            bVar = new py0.b(((ComplexImage.Lottie) image).f55834a);
        } else {
            if (!(image instanceof ComplexImage.Overlapped) && !(image instanceof ComplexImage.Video) && !(image instanceof ComplexImage.Avatar) && image != null) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = null;
        }
        py0.b bVar2 = bVar;
        fp0.p imageClickHandler = getImageClickHandler();
        boolean z = (clickListener == null || image == null) ? false : true;
        fp0.p.b(imageClickHandler, z);
        View view = imageClickHandler.f137029a;
        or0.m.a(view);
        if (z) {
            view.setOnClickListener(new kt(this, bVar2, clickListener, this, 29));
        } else {
            or0.u.o(view);
        }
    }

    public final void setImagePaddings(int sizeDp) {
        FrameLayout imageContainerView = getImageContainerView();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, sizeDp);
        imageContainerView.setPadding(iK, iK, iK, iK);
    }

    public final void setImageSize(int widthDp, int heightDp) {
        if (heightDp > 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            heightDp = kli.a.k(context, heightDp);
        }
        if (widthDp > 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            widthDp = kli.a.k(context2, widthDp);
        }
        FrameLayout imageContainerView = getImageContainerView();
        ViewGroup.LayoutParams layoutParams = imageContainerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = heightDp;
        layoutParams.width = widthDp;
        imageContainerView.setLayoutParams(layoutParams);
    }

    @yhm.d
    public final void setLottieImageRounding(boolean enableRounding) {
        if (!enableRounding) {
            getLottieImageView().setClipToOutline(false);
        } else {
            getLottieImageView().setClipToOutline(true);
            getLottieImageView().setOutlineProvider(new b());
        }
    }

    public final void setMainAction(FullScreenStateDelegate.a action) {
        if (action instanceof n6) {
            getHorizontalButtons().setVisibility(8);
            getSmallActionButton().setVisibility(8);
            getSecondaryLargeActionButton().setVisibility(8);
            f0(getPrimaryLargeActionButton(), (n6) action);
            return;
        }
        if (action instanceof l6) {
            getHorizontalButtons().setVisibility(8);
            getPrimaryLargeActionButton().setVisibility(8);
            getSecondaryLargeActionButton().setVisibility(8);
            getSmallActionButton().setVisibility(0);
            SmallActionButton smallActionButton = getSmallActionButton();
            l6 l6Var = (l6) action;
            smallActionButton.setText(l6Var.f54423a);
            smallActionButton.setIcon(l6Var.f54425c);
            smallActionButton.i(l6Var.f54424b);
            smallActionButton.setLoadingButtonTag(null);
            return;
        }
        if (!(action instanceof m6)) {
            if (action instanceof o6) {
                getHorizontalButtons().setVisibility(8);
                getSmallActionButton().setVisibility(8);
                o6 o6Var = (o6) action;
                f0(getPrimaryLargeActionButton(), o6Var.f54532a);
                f0(getSecondaryLargeActionButton(), o6Var.f54533b);
                return;
            }
            if (action != null) {
                throw new NoWhenBranchMatchedException();
            }
            getHorizontalButtons().setVisibility(8);
            getSmallActionButton().setVisibility(8);
            getPrimaryLargeActionButton().setVisibility(8);
            getSecondaryLargeActionButton().setVisibility(8);
            return;
        }
        getSmallActionButton().setVisibility(8);
        getPrimaryLargeActionButton().setVisibility(8);
        getSecondaryLargeActionButton().setVisibility(8);
        TwinHorizontalSmallButton horizontalButtons = getHorizontalButtons();
        m6 m6Var = (m6) action;
        l6 l6Var2 = m6Var.f54461b;
        l6 l6Var3 = m6Var.f54460a;
        horizontalButtons.setPrimaryButtonText(l6Var3.f54423a);
        getHorizontalButtons().setPrimaryButtonIcon(l6Var3.f54425c);
        getHorizontalButtons().setPrimaryButtonStyle(l6Var3.f54424b);
        getHorizontalButtons().setPrimaryButtonLoadingTag(null);
        getHorizontalButtons().setSecondaryButtonText(l6Var2.f54423a);
        getHorizontalButtons().setSecondaryButtonIcon(l6Var2.f54425c);
        getHorizontalButtons().setSecondaryButtonStyle(l6Var2.f54424b);
        getHorizontalButtons().setSecondaryButtonLoadingTag(null);
        getHorizontalButtons().setVisibility(0);
    }

    public final void setTitleSingleLine(boolean singleLine) {
        getTitleView().setSingleLine(singleLine);
    }

    public final void setTitleStyle(@NotNull p6 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        jb3.l.e(getTitleView(), style.a());
    }

    public final void setTitleText(Clause title) {
        kli.a.b(getTitleView(), title, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenStateView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenStateView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleView = kli.a.J(R$id.fullScreenState_title, this);
        this.captionView = kli.a.J(R$id.fullScreenState_caption, this);
        this.imageContainerView = kli.a.J(R$id.imageContainer, this);
        this.smallActionButton = kli.a.J(R$id.fullScreenState_smallActionButton, this);
        this.primaryLargeActionButton = kli.a.J(R$id.fullScreenState_primaryLargeActionButton, this);
        this.secondaryLargeActionButton = kli.a.J(R$id.fullScreenState_secondaryLargeActionButton, this);
        this.horizontalButtons = kli.a.J(R$id.fullScreenState_horizontalButtons, this);
        this.regularImageView = kli.a.J(R$id.regularImageView, this);
        this.overlappedIconsView = kli.a.J(R$id.fullScreenState_overlappedIconsView, this);
        this.lottieImageView = kli.a.J(R$id.lottieImageView, this);
        this.videoPlayerView = kli.a.J(R$id.videoPlayerView, this);
        this.shadowVideo = kli.a.J(R$id.shadowVideo, this);
        this.f58620r = new iv0.q(this, R$id.fullScreenState_avatarViewStub);
        this.f58621s = new c2(this);
        this.f58622t = yhm.j.c(yhm.k.NONE, new maa.r(this, 29));
        LayoutInflater.from(context).inflate(R$layout.internal_view_full_screen_state, (ViewGroup) this, true);
        getShadowVideo().setCornersRadius(120.0f);
        FrameLayout imageContainerView = getImageContainerView();
        ViewGroup.LayoutParams layoutParams = imageContainerView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.verticalBias = 0.33f;
            imageContainerView.setLayoutParams(layoutParams2);
            setPaddingRelative(getPaddingStart(), context.getResources().getDimensionPixelSize(R$dimen.internal_dp16), getPaddingEnd(), context.getResources().getDimensionPixelSize(R$dimen.internal_dp24));
            getCaptionView().setMovementMethod(c0.f169220a);
            setContentEnabled(true);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public /* synthetic */ FullScreenStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
