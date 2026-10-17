package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.ShimmeringPillShapeView;
import com.revolut.core.ui_kit.internal.views.ShimmeringRectView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.c0;
import com.revolut.core.ui_kit.models.d0;
import com.revolut.core.ui_kit.models.e0;
import com.revolut.core.ui_kit.models.h0;
import com.revolut.core.ui_kit.models.i0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import ix0.b2;
import ix0.f0;
import ix0.g0;
import ix0.k0;
import ix0.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import mx0.d9;
import mx0.e9;
import mx0.hb;
import mx0.i1;
import mx0.i7;
import mx0.ib;
import mx0.jb;
import mx0.kb;
import mx0.lb;
import mx0.s2;
import mx0.ub;
import mx0.v9;
import mx0.vb;
import mx0.w9;
import mx0.x8;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import yp0.a0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0002opB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00106R\u001b\u0010=\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u00106R\u001b\u0010@\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u00106R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u0010DR\u001b\u0010I\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010/\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010/\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010/\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010/\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010/\u001a\u0004\be\u0010fR\u001b\u0010j\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010/\u001a\u0004\bi\u0010fR\u001b\u0010m\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010/\u001a\u0004\bl\u0010R¨\u0006q"}, d2 = {"Lcom/revolut/core/ui_kit/views/ProfileCardView;", "Landroid/widget/FrameLayout;", "Lix0/g0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lix0/b2;", "imageKey", "Landroid/view/ViewGroup;", "entrypointHost", "", "setImageEntryPointSize", "(Lix0/b2;Landroid/view/ViewGroup;)V", "Lcom/revolut/core/ui_kit/models/ProfileCardModel;", "model", "setModel", "(Lcom/revolut/core/ui_kit/models/ProfileCardModel;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "getBlurredQrCodeImage", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "getContentContainerParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "marginDp", "setContentContainerTopMargin", "(F)V", "getLoadingContentContainerParams", "Lmx0/a;", "getOrCreateActionAndLabelFooterView", "()Lmx0/a;", "Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "getOrCreateAvatarGroupView", "()Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "Lcom/revolut/core/ui_kit/internal/views/CutoutImageView;", "getOrCreateImageView", "()Lcom/revolut/core/ui_kit/internal/views/CutoutImageView;", "Lcom/revolut/core/ui_kit/views/AvatarView;", "getOrCreateAvatarView", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "Lcom/facebook/shimmer/ShimmerConstraintLayout;", "c", "Le8/q;", "getShimmer", "()Lcom/facebook/shimmer/ShimmerConstraintLayout;", "shimmer", "Landroidx/constraintlayout/widget/Guideline;", "d", "getStartBorder", "()Landroidx/constraintlayout/widget/Guideline;", "startBorder", "e", "getTopBorder", "topBorder", "f", "getEndBorder", "endBorder", "g", "getBottomBorder", "bottomBorder", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundView;", "h", "getBackgroundView", "()Lcom/revolut/core/ui_kit/background/AnimatedBackgroundView;", "backgroundView", "i", "getImageContainerView", "()Landroid/widget/FrameLayout;", "imageContainerView", "Lcom/revolut/core/ui_kit/internal/views/ShimmeringRectView;", "j", "getImageContainerLoadingView", "()Lcom/revolut/core/ui_kit/internal/views/ShimmeringRectView;", "imageContainerLoadingView", "Landroid/widget/ImageView;", "m", "getImageBadgeView", "()Landroid/widget/ImageView;", "imageBadgeView", "Lcom/revolut/core/ui_kit/views/ActionsView;", "n", "getActionsView", "()Lcom/revolut/core/ui_kit/views/ActionsView;", "actionsView", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "o", "getSmallActionButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "smallActionButton", "Lcom/revolut/core/ui_kit/internal/views/ShimmeringPillShapeView;", "p", "getSmallActionLoadingButton", "()Lcom/revolut/core/ui_kit/internal/views/ShimmeringPillShapeView;", "smallActionLoadingButton", "Landroidx/appcompat/widget/AppCompatTextView;", "q", "getImageTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "imageTitle", "r", "getImageSubtitle", "imageSubtitle", "s", "getLogoImageView", "logoImageView", "Companion", "mx0/ib", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileCardView extends FrameLayout implements g0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final float A;
    public final RectF B;
    public final Path C;
    public float D;
    public float E;
    public float F;
    public View[] G;
    public w9 H;
    public vb I;
    public d9 J;
    public ub K;
    public e9 L;
    public mx0.a M;
    public LinearLayout N;
    public Boolean O;
    public OverlappedIconsView P;
    public View Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f58826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final e8.q shimmer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final e8.q startBorder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q topBorder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q endBorder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q bottomBorder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q backgroundView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q imageContainerView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageContainerLoadingView;
    public CutoutImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AvatarView f58831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageBadgeView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q actionsView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q smallActionButton;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q smallActionLoadingButton;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageTitle;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageSubtitle;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q logoImageView;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f58838t;
    public ProfileCardModel u;
    public final ihm.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ihm.f f58839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ihm.f f58840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.f f58841y;
    public final v9 z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.ProfileCardView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ActionsView getActionsView() {
        return (ActionsView) this.actionsView.f();
    }

    private final AnimatedBackgroundView getBackgroundView() {
        return (AnimatedBackgroundView) this.backgroundView.f();
    }

    private final Image getBlurredQrCodeImage() {
        return new CdnImage("blurred_qr_code_light", "mobile/lounges/blurred_code", null, null, null, "blurred_qr_code_dark", 172);
    }

    private final Guideline getBottomBorder() {
        return (Guideline) this.bottomBorder.f();
    }

    private final ConstraintLayout.LayoutParams getContentContainerParams() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.bottomToTop = R$id.profileCard_actionsView;
        layoutParams.endToStart = R$id.profileCard_end;
        layoutParams.startToEnd = R$id.profileCard_start;
        layoutParams.topToBottom = R$id.profileCard_imageContainer;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.k(context, 8.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = kli.a.k(context2, 24.0f);
        layoutParams.verticalBias = BitmapDescriptorFactory.HUE_RED;
        return layoutParams;
    }

    private final Guideline getEndBorder() {
        return (Guideline) this.endBorder.f();
    }

    private final ImageView getImageBadgeView() {
        return (ImageView) this.imageBadgeView.f();
    }

    private final ShimmeringRectView getImageContainerLoadingView() {
        return (ShimmeringRectView) this.imageContainerLoadingView.f();
    }

    private final FrameLayout getImageContainerView() {
        return (FrameLayout) this.imageContainerView.f();
    }

    private final AppCompatTextView getImageSubtitle() {
        return (AppCompatTextView) this.imageSubtitle.f();
    }

    private final AppCompatTextView getImageTitle() {
        return (AppCompatTextView) this.imageTitle.f();
    }

    private final ConstraintLayout.LayoutParams getLoadingContentContainerParams() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.endToStart = R$id.profileCard_end;
        layoutParams.startToEnd = R$id.profileCard_start;
        layoutParams.topToBottom = R$id.profileCard_imageContainerLoading;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.k(context, 8.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = kli.a.k(context2, 24.0f);
        layoutParams.verticalBias = BitmapDescriptorFactory.HUE_RED;
        return layoutParams;
    }

    private final ImageView getLogoImageView() {
        return (ImageView) this.logoImageView.f();
    }

    private final mx0.a getOrCreateActionAndLabelFooterView() {
        mx0.a aVar = this.M;
        if (aVar != null) {
            return aVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        mx0.a aVar2 = new mx0.a(context, null, 6, 0);
        aVar2.setId(R$id.profileCard_footerLabelTitle);
        aVar2.setOnActionClickListener(new kb(1, 0, ihm.f.class, this.f58840x, "onNext", "onNext(Ljava/lang/Object;)V"));
        aVar2.setOnLabelClickListener(new lb(1, 0, ihm.f.class, this.f58841y, "onNext", "onNext(Ljava/lang/Object;)V"));
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.startToEnd = R$id.profileCard_start;
        layoutParams.endToStart = R$id.profileCard_end;
        layoutParams.bottomToTop = R$id.profileCard_bottom;
        aVar2.setLayoutParams(layoutParams);
        getShimmer().addView(aVar2);
        this.M = aVar2;
        l();
        return aVar2;
    }

    private final OverlappedIconsView getOrCreateAvatarGroupView() {
        OverlappedIconsView overlappedIconsView = this.P;
        if (overlappedIconsView != null) {
            return overlappedIconsView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlappedIconsView overlappedIconsView2 = new OverlappedIconsView(context, null, 6, 0);
        overlappedIconsView2.setId(R$id.profileCard_avatarGroup);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.topMargin = kli.a.k(context2, 16.0f);
        overlappedIconsView2.setLayoutParams(layoutParams);
        LinearLayout linearLayout = this.N;
        if (linearLayout == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        linearLayout.addView(overlappedIconsView2);
        this.P = overlappedIconsView2;
        return overlappedIconsView2;
    }

    private final AvatarView getOrCreateAvatarView() {
        AvatarView avatarView = this.f58831l;
        if (avatarView != null) {
            return avatarView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AvatarView avatarView2 = new AvatarView(context, null, 6, 0);
        avatarView2.setDefaultAvatarStyle$ui_kit_components_release(i1.SIZE_120_120);
        this.f58831l = avatarView2;
        getImageContainerView().addView(avatarView2, new FrameLayout.LayoutParams(-2, -2, 17));
        return avatarView2;
    }

    private final CutoutImageView getOrCreateImageView() {
        CutoutImageView cutoutImageView = this.k;
        if (cutoutImageView != null) {
            return cutoutImageView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CutoutImageView cutoutImageView2 = new CutoutImageView(context, null, 6, 0);
        this.k = cutoutImageView2;
        getImageContainerView().addView(cutoutImageView2, new ViewGroup.LayoutParams(-1, -1));
        return cutoutImageView2;
    }

    private final ShimmerConstraintLayout getShimmer() {
        return (ShimmerConstraintLayout) this.shimmer.f();
    }

    private final SmallActionButton getSmallActionButton() {
        return (SmallActionButton) this.smallActionButton.f();
    }

    private final ShimmeringPillShapeView getSmallActionLoadingButton() {
        return (ShimmeringPillShapeView) this.smallActionLoadingButton.f();
    }

    private final Guideline getStartBorder() {
        return (Guideline) this.startBorder.f();
    }

    private final Guideline getTopBorder() {
        return (Guideline) this.topBorder.f();
    }

    public static c0 h(ProfileCardModel profileCardModel) {
        if (profileCardModel == null) {
            return null;
        }
        if (profileCardModel instanceof ProfileCardModel.Error) {
            return ((ProfileCardModel.Error) profileCardModel).f57922c;
        }
        if (profileCardModel instanceof ProfileCardModel.Loaded) {
            return ((ProfileCardModel.Loaded) profileCardModel).d;
        }
        if (profileCardModel instanceof ProfileCardModel.Loading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Pair j(ProfileCardModel profileCardModel) {
        if (profileCardModel == null) {
            return null;
        }
        if (profileCardModel instanceof ProfileCardModel.Error) {
            ProfileCardModel.Error error = (ProfileCardModel.Error) profileCardModel;
            return new Pair(error.f57920a, error.f57921b);
        }
        if ((profileCardModel instanceof ProfileCardModel.Loaded) || (profileCardModel instanceof ProfileCardModel.Loading)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setContentContainerTopMargin(float marginDp) {
        LinearLayout linearLayout = this.N;
        if (linearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, marginDp);
        if (((ViewGroup.MarginLayoutParams) layoutParams2).topMargin != iK) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = iK;
            linearLayout.setLayoutParams(layoutParams2);
        }
    }

    @Override // ix0.g0
    public final f0 a(ViewGroup containerLayout) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        float width = getImageBadgeView().getWidth() / 2.0f;
        if (getImageBadgeView().getVisibility() != 0) {
            return null;
        }
        return new f0(knm.b.e(containerLayout, getImageBadgeView(), false) + width, knm.b.g(containerLayout, getImageBadgeView(), false) + width, width);
    }

    public final void b(ViewGroup viewGroup) {
        if (Intrinsics.f(this.Q, viewGroup)) {
            return;
        }
        LinearLayout linearLayout = this.N;
        if (linearLayout != null) {
            linearLayout.removeView(this.Q);
        }
        if (viewGroup == null) {
            LinearLayout linearLayout2 = this.N;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else {
            boolean z = viewGroup instanceof e9;
            LinearLayout linearLayout3 = this.N;
            if (linearLayout3 == null) {
                linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setId(R$id.profileCard_contentContainer);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(1);
                getShimmer().addView(linearLayout3);
                this.N = linearLayout3;
            }
            if (!Intrinsics.f(this.O, Boolean.valueOf(z))) {
                linearLayout3.setLayoutParams(z ? getLoadingContentContainerParams() : getContentContainerParams());
                this.O = Boolean.valueOf(z);
            }
            linearLayout3.setVisibility(0);
            linearLayout3.addView(viewGroup, 0, new LinearLayout.LayoutParams(-1, -2));
        }
        FrameLayout imageContainerView = getImageContainerView();
        ViewGroup.LayoutParams layoutParams = imageContainerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = viewGroup == null ? R$id.profileCard_bottom : -1;
        layoutParams2.bottomToTop = viewGroup != null ? R$id.profileCard_contentContainer : -1;
        imageContainerView.setLayoutParams(layoutParams2);
        this.Q = viewGroup;
        l();
    }

    public final void c(float f) {
        this.F = f;
        int width = (getImageContainerView().getVisibility() == 0 ? getImageContainerView() : getImageContainerLoadingView()).getWidth();
        if (width == 0) {
            return;
        }
        Float fValueOf = Float.valueOf(this.E);
        if (fValueOf.floatValue() == BitmapDescriptorFactory.HUE_RED) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : width;
        float f4 = fFloatValue / 2.0f;
        float f5 = width;
        float fLerp = AnimationUtils.lerp(fFloatValue / f5, 1.0f, f);
        this.D = AnimationUtils.lerp(f4, this.A, f);
        int i = width / 2;
        int left = getImageContainerView().getLeft() + i;
        int top = getImageContainerView().getTop() + i;
        float f6 = left;
        float fLerp2 = AnimationUtils.lerp(f6 - f4, BitmapDescriptorFactory.HUE_RED, f);
        float f32 = top;
        float fLerp3 = AnimationUtils.lerp(f32 - f4, BitmapDescriptorFactory.HUE_RED, f);
        float fLerp4 = AnimationUtils.lerp(f6 + f4, getWidth(), f);
        float fLerp5 = AnimationUtils.lerp(f32 + f4, getHeight(), f);
        RectF rectF = this.B;
        rectF.set(fLerp2, fLerp3, fLerp4, fLerp5);
        float fLerp6 = AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.5f, 1.0f, f);
        getBackgroundView().setAlpha(f);
        Path path = this.C;
        path.reset();
        float f35 = this.D;
        path.addRoundRect(rectF, f35, f35, Path.Direction.CW);
        float width2 = getImageContainerView().getWidth() * fLerp;
        float f36 = 2;
        float f37 = (rectF.top + ((width2 / f36) + f6)) / 2.0f;
        for (View view : this.G) {
            if (view.getVisibility() == 0) {
                if (f < 1.0f) {
                    view.setPivotY(f37 - view.getTop());
                } else {
                    view.setPivotY(view.getHeight() / 2.0f);
                }
                view.setPivotX(view.getWidth() / 2.0f);
                view.setScaleX(f);
                view.setScaleY(f);
                view.setAlpha(fLerp6);
            }
        }
        ImageView imageBadgeView = getImageBadgeView();
        imageBadgeView.setTranslationY((-(f5 - width2)) / f36);
        imageBadgeView.setScaleX(fLerp);
        imageBadgeView.setScaleY(fLerp);
        imageBadgeView.setAlpha(f);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.revolut.RevGhostViewFacade d() {
        /*
            r3 = this;
            com.revolut.core.ui_kit.internal.views.CutoutImageView r0 = r3.k
            r1 = 0
            if (r0 == 0) goto L10
            int r2 = r0.getVisibility()
            if (r2 != 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            goto L23
        L10:
            com.revolut.core.ui_kit.views.AvatarView r0 = r3.f58831l
            if (r0 == 0) goto L1b
            int r2 = r0.getVisibility()
            if (r2 != 0) goto L1b
            r1 = r0
        L1b:
            if (r1 == 0) goto L1f
            r0 = r1
            goto L23
        L1f:
            android.widget.FrameLayout r0 = r3.getImageContainerView()
        L23:
            androidx.transition.revolut.RevGhostViewFacade r1 = new androidx.transition.revolut.RevGhostViewFacade
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ProfileCardView.d():androidx.transition.revolut.RevGhostViewFacade");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        try {
            canvas.clipPath(this.C);
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final efm.r e() {
        efm.r rVarFilter = getActionsView().f58296a.f121375b.filter(new s2(new hb(this, 4), 27));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    public final efm.r f() {
        return getSmallActionButton().f56386h;
    }

    public final efm.r g() {
        efm.r rVarFilter = getSmallActionButton().f56386h.filter(new s2(new hb(this, 3), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    public final Image i(ProfileCardModel profileCardModel) {
        if (profileCardModel != null) {
            if (profileCardModel instanceof ProfileCardModel.Error) {
                Object obj2 = com.revolut.core.ui_kit.models.o.f58117a;
                if (obj2.equals(obj2)) {
                    return getBlurredQrCodeImage();
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(profileCardModel instanceof ProfileCardModel.Loaded)) {
                if (profileCardModel instanceof ProfileCardModel.Loading) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            i0 i0Var = ((ProfileCardModel.Loaded) profileCardModel).f57924b;
            if (i0Var instanceof d0) {
                return null;
            }
            if (i0Var instanceof com.revolut.core.ui_kit.models.f0) {
                return new ResourceImage(((com.revolut.core.ui_kit.models.f0) i0Var).f58079a, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190);
            }
            if (i0Var instanceof com.revolut.core.ui_kit.models.g0) {
                return ((com.revolut.core.ui_kit.models.g0) i0Var).f58085a;
            }
            if (i0Var instanceof e0) {
                return getBlurredQrCodeImage();
            }
            if (!(i0Var instanceof h0)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public final void k(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null) {
            Guideline startBorder = getStartBorder();
            ViewGroup.LayoutParams layoutParams = startBorder.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.guideBegin = num.intValue();
            startBorder.setLayoutParams(layoutParams2);
        }
        Guideline topBorder = getTopBorder();
        ViewGroup.LayoutParams layoutParams3 = topBorder.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.guideBegin = num2.intValue();
        topBorder.setLayoutParams(layoutParams4);
        if (num3 != null) {
            Guideline endBorder = getEndBorder();
            ViewGroup.LayoutParams layoutParams5 = endBorder.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.guideEnd = num3.intValue();
            endBorder.setLayoutParams(layoutParams6);
        }
        Guideline bottomBorder = getBottomBorder();
        ViewGroup.LayoutParams layoutParams7 = bottomBorder.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.guideEnd = num4.intValue();
        bottomBorder.setLayoutParams(layoutParams8);
    }

    public final void l() {
        ViewGroup[] elements = {getSmallActionButton(), getActionsView(), this.M, this.N};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.G = (View[]) kotlin.collections.d.L(elements).toArray(new View[0]);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        c(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        ib ibVar;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f = kli.a.z(size2, context) < 320.0f ? 24.0f : 32.0f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, f);
        ProfileCardModel profileCardModel = this.u;
        ProfileCardModel.Loaded loaded = profileCardModel instanceof ProfileCardModel.Loaded ? (ProfileCardModel.Loaded) profileCardModel : null;
        if ((loaded != null ? loaded.f57923a : null) != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK = kli.a.k(context3, 88.0f);
        } else {
            iK = iK2;
        }
        this.f58838t = true;
        if (iK != getPaddingTop() || iK2 != getPaddingBottom()) {
            k(null, Integer.valueOf(iK), null, Integer.valueOf(iK2));
        }
        ProfileCardModel profileCardModel2 = this.u;
        if (profileCardModel2 instanceof ProfileCardModel.Error) {
            ibVar = ib.ERROR;
        } else if (profileCardModel2 instanceof ProfileCardModel.Loaded) {
            i0 i0Var = ((ProfileCardModel.Loaded) profileCardModel2).f57924b;
            if (i0Var instanceof d0) {
                ibVar = ib.AVATAR;
            } else if (i0Var instanceof com.revolut.core.ui_kit.models.f0) {
                ibVar = ib.ICON;
            } else if (i0Var instanceof com.revolut.core.ui_kit.models.g0) {
                ibVar = ib.QR;
            } else if (i0Var instanceof e0) {
                ibVar = ib.QR_BLURRED;
            } else {
                if (!(i0Var instanceof h0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ibVar = ib.AVATAR;
            }
        } else if (profileCardModel2 instanceof ProfileCardModel.Loading) {
            ibVar = ib.QR;
        } else {
            if (profileCardModel2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            ibVar = ib.AVATAR;
        }
        int[] iArr = jb.f209786a;
        double d = iArr[ibVar.ordinal()] == 1 ? 0.47d : 0.65d;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iG = (int) (((double) c8g.c.G(context4)) * d);
        if (this.f58826b.b() && View.MeasureSpec.getMode(i2) == 1073741824) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            int iD = rr0.i.d(i2);
            if (iG > iD) {
                iG = iD;
            }
            size = iG;
        }
        int i3 = iArr[ibVar.ordinal()];
        if (i3 == 1) {
            FrameLayout imageContainerView = getImageContainerView();
            ViewGroup.LayoutParams layoutParams = imageContainerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintMaxWidth = size2;
            layoutParams2.matchConstraintMaxHeight = size2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
            layoutParams2.dimensionRatio = "1:1";
            imageContainerView.setLayoutParams(layoutParams2);
        } else if (i3 == 2) {
            int i5 = (int) (((double) size2) * 0.6d);
            FrameLayout imageContainerView2 = getImageContainerView();
            ViewGroup.LayoutParams layoutParams3 = imageContainerView2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.matchConstraintMaxWidth = i5;
            layoutParams4.matchConstraintMaxHeight = i5;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
            layoutParams4.dimensionRatio = "1:1";
            imageContainerView2.setLayoutParams(layoutParams4);
        } else if (i3 == 3) {
            int i6 = (int) (((double) size2) * 0.58d);
            FrameLayout imageContainerView3 = getImageContainerView();
            ViewGroup.LayoutParams layoutParams5 = imageContainerView3.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.matchConstraintMaxWidth = i6;
            layoutParams6.matchConstraintMaxHeight = i6;
            ((ViewGroup.MarginLayoutParams) layoutParams6).width = 0;
            layoutParams6.dimensionRatio = "1:1";
            imageContainerView3.setLayoutParams(layoutParams6);
        } else if (i3 == 4) {
            int i21 = (int) (((double) size2) * 0.5d);
            FrameLayout imageContainerView4 = getImageContainerView();
            ViewGroup.LayoutParams layoutParams7 = imageContainerView4.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.matchConstraintMaxWidth = i21;
            layoutParams8.matchConstraintMaxHeight = i21;
            ((ViewGroup.MarginLayoutParams) layoutParams8).width = 0;
            layoutParams8.dimensionRatio = "1:1";
            imageContainerView4.setLayoutParams(layoutParams8);
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int i22 = (int) (((double) size2) * 0.6d);
            FrameLayout imageContainerView5 = getImageContainerView();
            ViewGroup.LayoutParams layoutParams9 = imageContainerView5.getLayoutParams();
            if (layoutParams9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
            layoutParams10.matchConstraintMaxHeight = i22;
            int i32 = this.f58825a;
            layoutParams10.matchConstraintMaxWidth = i32;
            ((ViewGroup.MarginLayoutParams) layoutParams10).width = i32;
            m70.a.c(t0.f186434a);
            layoutParams10.dimensionRatio = "";
            imageContainerView5.setLayoutParams(layoutParams10);
        }
        this.f58838t = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f58838t) {
            return;
        }
        super.requestLayout();
    }

    public final void setImageEntryPointSize(@NotNull b2 imageKey, ViewGroup entrypointHost) {
        Intrinsics.checkNotNullParameter(imageKey, "imageKey");
        float f = this.E;
        float width = BitmapDescriptorFactory.HUE_RED;
        if (f != BitmapDescriptorFactory.HUE_RED || entrypointHost == null) {
            return;
        }
        View viewA = js0.d.a(imageKey, entrypointHost);
        if (viewA != null) {
            width = viewA.getWidth();
        }
        this.E = width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.revolut.core.ui_kit.background.AnimatedBackgroundView] */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, com.revolut.core.ui_kit.views.ProfileCardView] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.revolut.core.ui_kit.background.AnimatedBackgroundType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.models.ProfileCardModel r22) {
        /*
            Method dump skipped, instruction units count: 1825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ProfileCardView.setModel(com.revolut.core.ui_kit.models.ProfileCardModel):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCardView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58825a = kli.a.k(context, 52.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ProfileCardView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        EnumEntries enumEntriesA = i7.a();
        int i2 = R$styleable.ProfileCardView_uikit_profileCardHeightMode;
        i7 i7Var = i7.CAPPED;
        i7 i7Var2 = (i7) zhm.d0.e0(typedArrayObtainStyledAttributes.getInt(i2, i7Var.ordinal()), enumEntriesA);
        i7Var = i7Var2 != null ? i7Var2 : i7Var;
        typedArrayObtainStyledAttributes.recycle();
        this.f58826b = i7Var;
        this.shimmer = kli.a.J(R$id.profileCard_shimmer, this);
        this.startBorder = kli.a.J(R$id.profileCard_start, this);
        this.topBorder = kli.a.J(R$id.profileCard_top, this);
        this.endBorder = kli.a.J(R$id.profileCard_end, this);
        this.bottomBorder = kli.a.J(R$id.profileCard_bottom, this);
        this.backgroundView = kli.a.J(R$id.profileCard_animatedBackground, this);
        this.imageContainerView = kli.a.J(R$id.profileCard_imageContainer, this);
        this.imageContainerLoadingView = kli.a.J(R$id.profileCard_imageContainerLoading, this);
        this.imageBadgeView = kli.a.J(R$id.profileCard_imageBadge, this);
        this.actionsView = kli.a.J(R$id.profileCard_actionsView, this);
        this.smallActionButton = kli.a.J(R$id.profileCard_actionButton, this);
        this.smallActionLoadingButton = kli.a.J(R$id.profileCard_actionButtonLoading, this);
        this.imageTitle = kli.a.J(R$id.profileCard_imageTitle, this);
        this.imageSubtitle = kli.a.J(R$id.profileCard_imageSubtitle, this);
        this.logoImageView = kli.a.J(R$id.profileCard_logoImage, this);
        ihm.f fVarD = v0.a.d("create(...)");
        this.v = fVarD;
        this.f58839w = v0.a.d("create(...)");
        this.f58840x = v0.a.d("create(...)");
        this.f58841y = v0.a.d("create(...)");
        this.z = new v9(1, fVarD, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 2);
        float fK = kli.a.k(context, 24.0f);
        this.A = fK;
        this.B = new RectF();
        this.C = new Path();
        this.D = fK;
        this.F = 1.0f;
        this.G = new View[0];
        setWillNotDraw(false);
        View.inflate(context, R$layout.internal_profile_card_view, this);
        int iK = kli.a.k(context, 32.0f);
        int iK2 = kli.a.k(context, 24.0f);
        k(Integer.valueOf(iK2), Integer.valueOf(iK), Integer.valueOf(iK2), Integer.valueOf(iK));
        getActionsView().setLayoutType(mx0.l.HEADER_STYLED_CIRCLE_ACTIONS);
        getSmallActionButton().i(h4.ACCENT);
        new l0(this, zhm.u.c(new k0(new x8(this, 2)))).a(this);
        getShimmer().h0(a0.a(context));
        getShimmer().setShimmerMode(c9.f.SHIMMERING_CHILDREN_ONLY);
    }

    public /* synthetic */ ProfileCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
