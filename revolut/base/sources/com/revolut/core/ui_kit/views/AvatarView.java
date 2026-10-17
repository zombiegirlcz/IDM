package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.o9;
import aw0.t1;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.MaskedImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Contextual;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$InternalColorStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dr0.z;
import ip0.ra0;
import ip0.v7;
import ix0.h0;
import ix0.k0;
import ix0.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.a1;
import mx0.c1;
import mx0.g1;
import mx0.i1;
import mx0.j1;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import zhm.a0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 º\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003'»\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u001aH\u0003¢\u0006\u0004\b0\u0010\u001dJ\u0017\u00101\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b1\u0010\u0019J\u0017\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010\u0019J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00132\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00132\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\bL\u0010\u0019J\u0019\u0010O\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b]\u0010\u0019R\u001b\u0010c\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010`\u001a\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010`\u001a\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010`\u001a\u0004\bu\u0010vR\u001b\u0010z\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010`\u001a\u0004\by\u0010vR#\u0010\u0080\u0001\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0004\b\u007f\u0010\u001dR4\u0010\u0088\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008e\u0001\u001a\u00030\u0089\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0099\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R,\u0010¤\u0001\u001a\u00030\u009f\u00012\b\u0010\u0082\u0001\u001a\u00030\u009f\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010\u00ad\u0001\u001a\u00030©\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b¬\u0001\u0010\u009d\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010°\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/AvatarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lxv0/m;", "", "Ljr0/i;", "Ljy0/n;", "Ljx0/b;", "Lur0/a;", "Lny0/o;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "background", "", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "newModel", "setModel", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;)V", "", "enabled", "setReflectiveOuterBorderEnabled$ui_kit_components_release", "(Z)V", "setReflectiveOuterBorderEnabled", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Default;", "model", "allowCustomScaleType", "setModel$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Default;Z)V", "getUnclippedWidth", "()I", "getUnclippedHeight", "Lmx0/i1;", "style", "setDefaultAvatarStyle$ui_kit_components_release", "(Lmx0/i1;)V", "setDefaultAvatarStyle", "defaultSize", "setupAvatarViewForNewNavbarDesign", "(Landroid/content/Context;Lmx0/i1;)V", "drawOutside", "setDrawOutside", "setOffsets", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State;", "state", "setState", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State;)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "tagData", "setTagData", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "setProgressStyle", "setAvatarImage", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setSingleImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$LayeredImage;", "avatarImage", "setLayeredImage", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$LayeredImage;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration;", "decoration", "setBottomDecoration", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration;)V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setImageScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "setSecondaryImage", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImage;", "icon", "setMiddleIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImage;)V", "Lcom/revolut/core/ui_kit/internal/views/CutoutImageView;", "getOrCreateBorderView", "()Lcom/revolut/core/ui_kit/internal/views/CutoutImageView;", "Lmx0/c1;", "getOrCreateAvatarLayeredImageView", "()Lmx0/c1;", "Lmx0/a1;", "getOrCreateAvatarGridImageView", "()Lmx0/a1;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "getMatchImageLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "setOverlays", "Landroid/widget/FrameLayout;", "i", "Lkotlin/Lazy;", "getProgressContainer", "()Landroid/widget/FrameLayout;", "progressContainer", "Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "j", "getProgress", "()Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "progress", "Lpt0/v;", "k", "getSegmentedProgress", "()Lpt0/v;", "segmentedProgress", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "q", "getTagView", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tagView", "Lix0/l0;", "r", "getCutoutStage", "()Lix0/l0;", "cutoutStage", "s", "getMiddleBadgeCutoutStage", "middleBadgeCutoutStage", "A", "Z", "getSuppressLayout", "()Z", "setSuppressLayout", "suppressLayout", "", "value", "F", "getContentAlpha", "()F", "setContentAlpha", "(F)V", "contentAlpha", "Lfp0/p;", "H", "Lfp0/p;", "getClickHandler$ui_kit_components_release", "()Lfp0/p;", "clickHandler", "Lix0/h0;", "I", "Lix0/h0;", "getCutoutReceiverForBlur", "()Lix0/h0;", "cutoutReceiverForBlur", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "Landroid/widget/ImageView;", "getBottomDecorationBadgeView$ui_kit_components_release", "()Landroid/widget/ImageView;", "getBottomDecorationBadgeView$ui_kit_components_release$annotations", "()V", "bottomDecorationBadgeView", "Lxv0/i;", "getItemRenderState", "()Lxv0/i;", "setItemRenderState", "(Lxv0/i;)V", "itemRenderState", "Landroid/view/View;", "getRenderView", "()Landroid/view/View;", "renderView", "Lmx0/g1;", "getTimeProgressController$ui_kit_components_release", "()Lmx0/g1;", "getTimeProgressController$ui_kit_components_release$annotations", "timeProgressController", "Lcom/revolut/core/ui_kit/internal/views/badge/CircleBadgeView;", "getBadgeMiddle", "()Lcom/revolut/core/ui_kit/internal/views/badge/CircleBadgeView;", "badgeMiddle", "getBadgeTop", "badgeTop", "getBadgeBottom", "badgeBottom", "Landroidx/appcompat/widget/AppCompatImageView;", "getBottomDecorationBadge", "()Landroidx/appcompat/widget/AppCompatImageView;", "bottomDecorationBadge", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AvatarView extends ConstraintLayout implements xv0.m, jr0.i, jy0.n, jx0.b, ur0.a, ny0.o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Object J = new Object();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean suppressLayout;
    public final Object B;
    public StylableContactImage$Contextual C;
    public v1 D;
    public boolean E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public float contentAlpha;
    public final GradientDrawable G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final fp0.p clickHandler;
    public final k0 I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageWithAnimatedBackgroundView f58348b;
    public CutoutImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c1 f58349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a1 f58350h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f58351j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f58352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f58353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f58354n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ix0.x f58355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f58356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f58357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f58358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f58359t;
    public UIKitImageView u;
    public AvatarModel v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i1 f58360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f58361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Function1 f58362y;
    public final ny0.q z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.AvatarView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static CircleProgressBar f0(AvatarView avatarView) {
        return avatarView.getProgress();
    }

    public static g1 g0(AvatarView avatarView) {
        return new g1(avatarView.getProgress(), avatarView.getTagView());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CircleBadgeView getBadgeBottom() {
        return (CircleBadgeView) this.f58354n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CircleBadgeView getBadgeMiddle() {
        return (CircleBadgeView) this.f58352l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CircleBadgeView getBadgeTop() {
        return (CircleBadgeView) this.f58353m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatImageView getBottomDecorationBadge() {
        return (AppCompatImageView) this.o.getValue();
    }

    public static /* synthetic */ void getBottomDecorationBadgeView$ui_kit_components_release$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final l0 getCutoutStage() {
        return (l0) this.f58357r.getValue();
    }

    private final ConstraintLayout.LayoutParams getMatchImageLayoutParams() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        int i = R$id.avatar_image;
        layoutParams.startToStart = i;
        layoutParams.endToEnd = i;
        layoutParams.topToTop = i;
        layoutParams.bottomToBottom = i;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final l0 getMiddleBadgeCutoutStage() {
        return (l0) this.f58358s.getValue();
    }

    private final a1 getOrCreateAvatarGridImageView() {
        a1 a1Var = this.f58350h;
        if (a1Var != null) {
            return a1Var;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        a1 a1Var2 = new a1(context, null, 6, 0);
        a1Var2.setId(R$id.avatar_grid_image);
        a1Var2.setLayoutParams(getMatchImageLayoutParams());
        a1Var2.setVisibility(8);
        addView(a1Var2, indexOfChild(this.f58348b));
        this.f58350h = a1Var2;
        return a1Var2;
    }

    private final c1 getOrCreateAvatarLayeredImageView() {
        c1 c1Var = this.f58349g;
        if (c1Var != null) {
            return c1Var;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c1 c1Var2 = new c1(context, null, 6, 0);
        c1Var2.setId(R$id.avatar_layered_image);
        c1Var2.setLayoutParams(getMatchImageLayoutParams());
        c1Var2.setVisibility(8);
        addView(c1Var2, indexOfChild(this.f58348b));
        this.f58349g = c1Var2;
        return c1Var2;
    }

    private final CutoutImageView getOrCreateBorderView() {
        CutoutImageView cutoutImageView = this.f;
        if (cutoutImageView != null) {
            return cutoutImageView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CutoutImageView cutoutImageView2 = new CutoutImageView(context, null, 6, 0);
        cutoutImageView2.setId(R$id.avatar_border);
        cutoutImageView2.setLayoutParams(getMatchImageLayoutParams());
        addView(cutoutImageView2, 0);
        this.f = cutoutImageView2;
        return cutoutImageView2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CircleProgressBar getProgress() {
        return (CircleProgressBar) this.f58351j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getProgressContainer() {
        return (FrameLayout) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final pt0.v getSegmentedProgress() {
        return (pt0.v) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TagView getTagView() {
        return (TagView) this.f58356q.getValue();
    }

    public static /* synthetic */ void getTimeProgressController$ui_kit_components_release$annotations() {
    }

    public static pt0.v h0(Context context, AvatarView avatarView) {
        pt0.v vVar = new pt0.v(context, null, 6, 0);
        vVar.setId(R$id.avatar_segmented_progress);
        vVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        vVar.setVisibility(8);
        avatarView.getProgressContainer().addView(vVar);
        return vVar;
    }

    public static CircleProgressBar i0(Context context, AvatarView avatarView) {
        CircleProgressBar circleProgressBar = new CircleProgressBar(context, null, 6, 0);
        circleProgressBar.setId(R$id.avatar_progress);
        circleProgressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        circleProgressBar.setVisibility(8);
        avatarView.getProgressContainer().addView(circleProgressBar);
        return circleProgressBar;
    }

    public static FrameLayout j0(Context context, AvatarView avatarView) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.avatar_progress_container);
        frameLayout.setLayoutParams(avatarView.getMatchImageLayoutParams());
        frameLayout.setVisibility(8);
        avatarView.addView(frameLayout, avatarView.indexOfChild(avatarView.f58348b) + 1);
        return frameLayout;
    }

    private final void setAvatarImage(AvatarModel newModel) {
        AvatarModel.AvatarImage avatarImageA = newModel.a();
        if (avatarImageA instanceof AvatarModel.AvatarImage.LayeredImage) {
            setLayeredImage((AvatarModel.AvatarImage.LayeredImage) avatarImageA);
        } else if (avatarImageA instanceof AvatarModel.AvatarImage.SingleImage) {
            setSingleImage(((AvatarModel.AvatarImage.SingleImage) avatarImageA).f57997a);
        } else if (avatarImageA instanceof AvatarModel.AvatarImage.GridImage) {
            o0();
            p0();
            a1 orCreateAvatarGridImageView = getOrCreateAvatarGridImageView();
            orCreateAvatarGridImageView.setVisibility(0);
            orCreateAvatarGridImageView.setImages((AvatarModel.AvatarImage.GridImage) avatarImageA);
        } else {
            if (avatarImageA != null) {
                throw new NoWhenBranchMatchedException();
            }
            p0();
            o0();
            n0();
        }
        E0(B0(newModel));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    private final void setBottomDecoration(AvatarModel.BottomDecoration decoration) {
        TagViewData tagViewData;
        boolean z;
        Image image;
        if (decoration instanceof AvatarModel.BottomDecoration.Badge) {
            Image image2 = ((AvatarModel.BottomDecoration.Badge) decoration).f58004a;
            getCutoutStage().a(this.f58355p);
            z = true;
            image = image2;
            tagViewData = null;
        } else if (decoration == null) {
            z = false;
            tagViewData = null;
            image = null;
        } else {
            if (!(decoration instanceof AvatarModel.BottomDecoration.Tag)) {
                throw new NoWhenBranchMatchedException();
            }
            tagViewData = ((AvatarModel.BottomDecoration.Tag) decoration).f58005a;
            z = false;
            image = null;
        }
        setTagData(tagViewData);
        ?? r4 = this.o;
        Intrinsics.checkNotNullParameter(r4, "<this>");
        if ((r4.isInitialized() ? r4.getValue() : null) != null || z) {
            getBottomDecorationBadge().setVisibility(z ? 0 : 8);
            if (image != null) {
                yy0.f.e(or0.u.k(this).Q(), new MaskedImage(image, new MaskedImage.MaskType.Circle(24.0f, BitmapDescriptorFactory.HUE_RED)), getBottomDecorationBadge(), null, null, 12);
            }
        }
    }

    private final void setDrawOutside(boolean drawOutside) {
        if (this.f58361x == drawOutside) {
            return;
        }
        this.f58361x = drawOutside;
        requestLayout();
        invalidate();
    }

    private final void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f58348b.setImageScaleType$ui_kit_components_release(scaleType);
        c1 c1Var = this.f58349g;
        if (c1Var != null) {
            c1Var.setScaleType(scaleType);
        }
        ImageView imageView = this.f58359t;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
    }

    private final void setLayeredImage(AvatarModel.AvatarImage.LayeredImage avatarImage) {
        p0();
        n0();
        c1 orCreateAvatarLayeredImageView = getOrCreateAvatarLayeredImageView();
        orCreateAvatarLayeredImageView.setVisibility(0);
        orCreateAvatarLayeredImageView.setImages(avatarImage);
    }

    private final void setMiddleIcon(GlyphImage icon) {
        if (icon == null) {
            UIKitImageView uIKitImageView = this.u;
            if (uIKitImageView != null) {
                uIKitImageView.setVisibility(8);
                return;
            }
            return;
        }
        UIKitImageView uIKitImageView2 = this.u;
        if (uIKitImageView2 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uIKitImageView2 = new UIKitImageView(context, null, 6, 0);
            uIKitImageView2.setId(R$id.avatar_middleIcon);
            Context context2 = uIKitImageView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 24.0f);
            Context context3 = uIKitImageView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, kli.a.k(context3, 24.0f));
            int i = R$id.avatar_image;
            layoutParams.startToStart = i;
            layoutParams.endToEnd = i;
            layoutParams.topToTop = i;
            layoutParams.bottomToBottom = i;
            uIKitImageView2.setLayoutParams(layoutParams);
            uIKitImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            rd0.e.u(uIKitImageView2, new yp0.o(yp0.n.FACTOR_100, R$attr.uikit_colorAccentNeutral), false);
            addView(uIKitImageView2, indexOfChild(this.f58348b) + 1);
            this.u = uIKitImageView2;
        }
        UIKitImageView uIKitImageView3 = uIKitImageView2;
        yy0.f.e(or0.u.k(this).Q(), icon, uIKitImageView3, null, null, 12);
        uIKitImageView3.setVisibility(0);
    }

    private final void setOffsets(AvatarModel model) {
        int iK;
        int iK2;
        AvatarModel.Border f = model.getF();
        float fU0 = BitmapDescriptorFactory.HUE_RED;
        if (f != null) {
            fU0 = BitmapDescriptorFactory.HUE_RED + u0(model);
        }
        if (model.getF58044h() == null || this.f58361x) {
            iK = 0;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 4.0f);
        }
        int i = (int) (fU0 + iK);
        this.f58348b.setPadding(i, i, i, i);
        c1 c1Var = this.f58349g;
        if (c1Var != null) {
            c1Var.setPadding(i, i, i, i);
        }
        a1 a1Var = this.f58350h;
        if (a1Var != null) {
            a1Var.setPadding(i, i, i, i);
        }
        CutoutImageView cutoutImageView = this.f;
        if (cutoutImageView != null) {
            cutoutImageView.setPadding(iK, iK, iK, iK);
        }
        if ((model.getF58035m() == null && model.getK() == null) || this.f58361x) {
            iK2 = 0;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK2 = kli.a.k(context2, 4.0f);
        }
        this.z.b(iK2, J, iK2, iK2, iK2);
        setClipToPadding(iK2 == 0);
    }

    private final void setOverlays(AvatarModel style) {
        InsetDrawable insetDrawable;
        if (style instanceof AvatarModel.Card) {
            A0();
            return;
        }
        if (style instanceof AvatarModel.Default) {
            A0();
            return;
        }
        if (style instanceof AvatarModel.Layered) {
            A0();
            return;
        }
        if (!(style instanceof AvatarModel.AddCard)) {
            if (style instanceof AvatarModel.SegmentedProgress) {
                A0();
                return;
            }
            if (style instanceof AvatarModel.Builder) {
                A0();
                return;
            } else if (style instanceof AvatarModel.GridImage) {
                A0();
                return;
            } else {
                if (!(style instanceof AvatarModel.TimeProgress)) {
                    throw new NoWhenBranchMatchedException();
                }
                A0();
                return;
            }
        }
        ImageView imageView = this.f58359t;
        if (imageView != null) {
            imageView.setForeground(r0());
        }
        ImageView imageView2 = this.f58359t;
        if (imageView2 != null) {
            imageView2.setScaleType(z0(style));
        }
        GradientDrawable gradientDrawableR0 = r0();
        Drawable drawable = getContext().getDrawable(R$drawable.uikit_icn_24_plus);
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawableMutate.setTint(kli.a.s(R$attr.uikit_colorWhite, context));
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "apply(...)");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iL = (int) kli.a.l(context2, 24.0f);
            int iW0 = (w0(style) - iL) / 2;
            int iV0 = (v0(style) - iL) / 2;
            insetDrawable = new InsetDrawable(drawableMutate, iW0, iV0, iW0, iV0);
        } else {
            insetDrawable = null;
        }
        m0(new LayerDrawable(new Drawable[]{gradientDrawableR0, insetDrawable}));
    }

    private final void setProgressStyle(AvatarModel model) {
        boolean z;
        getProgressContainer().setVisibility(model.getF58044h() != null ? 0 : 8);
        boolean z3 = true;
        if (model instanceof AvatarModel.SegmentedProgress) {
            pt0.v segmentedProgress = getSegmentedProgress();
            ProgressStyle progressStyle = ((AvatarModel.SegmentedProgress) model).d;
            segmentedProgress.setModel(new pt0.u(progressStyle.f56332a, progressStyle.f56333b, new TextClause(String.valueOf(progressStyle.f56332a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
            z = true;
            z3 = false;
        } else if ((model instanceof AvatarModel.AddCard) || (model instanceof AvatarModel.Card) || (model instanceof AvatarModel.Default) || (model instanceof AvatarModel.Layered) || (model instanceof AvatarModel.GridImage) || (model instanceof AvatarModel.TimeProgress)) {
            ProgressStyle f58044h = model.getF58044h();
            if (f58044h != null) {
                getProgress().a(f58044h);
            }
            z = false;
        } else {
            if (!(model instanceof AvatarModel.Builder)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
            z3 = false;
        }
        getProgress().setVisibility(z3 ? 0 : 8);
        getSegmentedProgress().setVisibility(z ? 0 : 8);
    }

    private final void setSecondaryImage(AvatarModel style) {
        if (style.getF57990c() == null) {
            ImageView imageView = this.f58359t;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f58359t;
            if (imageView2 != null) {
                removeView(imageView2);
                this.f58359t = null;
                return;
            }
            return;
        }
        if (this.f58359t == null) {
            ImageView imageView3 = new ImageView(getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((int) (w0(style) * 0.8f), (int) (v0(style) * 0.8f));
            int i = R$id.avatar_image;
            layoutParams.startToStart = i;
            layoutParams.bottomToBottom = i;
            layoutParams.topToTop = i;
            Context context = imageView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.setMarginStart(kli.a.k(context, 28.0f));
            imageView3.setLayoutParams(layoutParams);
            this.f58359t = imageView3;
            addView(this.f58359t, indexOfChild(this.f58348b));
        }
        yy0.f fVarQ = or0.u.k(this).Q();
        Image f57990c = style.getF57990c();
        ImageView imageView4 = this.f58359t;
        Intrinsics.h(imageView4);
        yy0.f.e(fVarQ, f57990c, imageView4, null, null, 12);
        ImageView imageView5 = this.f58359t;
        if (imageView5 != null) {
            imageView5.setVisibility(0);
        }
    }

    private final void setSingleImage(Image image) {
        o0();
        n0();
        this.f58348b.setVisibility(0);
        s0(image);
    }

    private final void setState(AvatarModel.State state) {
        int i = 0;
        if (Intrinsics.f(state, AvatarModel.State.Enabled.f58039a)) {
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).setAlpha(this.contentAlpha * 1.0f);
                i++;
            }
            return;
        }
        if (!Intrinsics.f(state, AvatarModel.State.DisabledExceptBadge.f58038a)) {
            throw new NoWhenBranchMatchedException();
        }
        int childCount2 = getChildCount();
        while (i < childCount2) {
            View childAt = getChildAt(i);
            int id10 = childAt.getId();
            childAt.setAlpha(((id10 == R$id.avatar_badgeTop || id10 == R$id.avatar_badgeBottom || id10 == R$id.avatar_bottomDecorationBadge || id10 == R$id.avatar_middleIcon) ? 1.0f : 0.5f) * this.contentAlpha);
            i++;
        }
    }

    private final void setTagData(TagViewData tagData) {
        getTagView().setVisibility(tagData != null ? 0 : 8);
        if (tagData == null) {
            return;
        }
        getTagView().setStyle$ui_kit_components_release(this.f58360w.d());
        TagView tagView = getTagView();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tagView.setTranslationY(kli.a.l(context, this.f58360w.d().b() / 2.0f));
        getTagView().setContent(tagData);
    }

    public static ImageView.ScaleType z0(AvatarModel avatarModel) {
        if ((avatarModel instanceof AvatarModel.Default) || (avatarModel instanceof AvatarModel.Layered) || (avatarModel instanceof AvatarModel.SegmentedProgress) || (avatarModel instanceof AvatarModel.Builder) || (avatarModel instanceof AvatarModel.GridImage) || (avatarModel instanceof AvatarModel.TimeProgress)) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if ((avatarModel instanceof AvatarModel.Card) || (avatarModel instanceof AvatarModel.AddCard)) {
            return ImageView.ScaleType.FIT_XY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void A0() {
        m0(null);
        ImageView imageView = this.f58359t;
        if (imageView != null) {
            imageView.setForeground(null);
        }
    }

    public final boolean B0(AvatarModel avatarModel) {
        AvatarModel.AvatarImage avatarImageA = avatarModel.a();
        if (avatarImageA instanceof AvatarModel.AvatarImage.LayeredImage) {
            int i = j1.f209768a[((AvatarModel.AvatarImage.LayeredImage) avatarImageA).f57996c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this.f58361x) {
                return false;
            }
        } else {
            if (!(avatarImageA instanceof AvatarModel.AvatarImage.SingleImage) && !(avatarImageA instanceof AvatarModel.AvatarImage.GridImage) && avatarImageA != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f58361x) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x0384  */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(com.revolut.core.ui_kit.models.avatar.AvatarModel r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.AvatarView.C0(com.revolut.core.ui_kit.models.avatar.AvatarModel, boolean):void");
    }

    public final void D0(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
        imageWithAnimatedBackgroundView.d = numValueOf;
        imageWithAnimatedBackgroundView.e = Integer.valueOf(i2);
        imageWithAnimatedBackgroundView.f58650b.d(i2, i);
        imageWithAnimatedBackgroundView.a(imageWithAnimatedBackgroundView.f.getDrawable(), imageWithAnimatedBackgroundView.getCurrentImage$ui_kit_components_release());
    }

    public final void E0(boolean z) {
        setClipChildren(z);
        Function1 function1 = this.f58362y;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!z));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getBottomDecorationBadgeView$ui_kit_components_release() {
        ?? r110 = this.o;
        Intrinsics.checkNotNullParameter(r110, "<this>");
        return (ImageView) (r110.isInitialized() ? r110.getValue() : null);
    }

    @NotNull
    /* JADX INFO: renamed from: getClickHandler$ui_kit_components_release, reason: from getter */
    public final fp0.p getClickHandler() {
        return this.clickHandler;
    }

    public final float getContentAlpha() {
        return this.contentAlpha;
    }

    @Override // jx0.b
    @NotNull
    public h0 getCutoutReceiverForBlur() {
        return this.I;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public /* bridge */ boolean getF56471r() {
        return false;
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        jr0.g.Companion.getClass();
        return jr0.f.a(this);
    }

    @Override // xv0.m
    @NotNull
    public xv0.i getItemRenderState() {
        return this.f58348b.getItemRenderState();
    }

    @Override // xv0.m
    @NotNull
    public View getRenderView() {
        return this.f58348b.getRenderView();
    }

    public boolean getSuppressLayout() {
        return this.suppressLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public final g1 getTimeProgressController$ui_kit_components_release() {
        return (g1) this.B.getValue();
    }

    public int getUnclippedHeight() {
        boolean z = this.f58361x;
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
        if (!z) {
            return imageWithAnimatedBackgroundView.getUnclippedHeight();
        }
        int measuredHeight = imageWithAnimatedBackgroundView.getMeasuredHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (kli.a.k(context, 4.0f) * 2) + measuredHeight;
    }

    public int getUnclippedWidth() {
        boolean z = this.f58361x;
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
        if (!z) {
            return imageWithAnimatedBackgroundView.getUnclippedWidth();
        }
        int measuredWidth = imageWithAnimatedBackgroundView.getMeasuredWidth();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (kli.a.k(context, 4.0f) * 2) + measuredWidth;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Image l0(Image image) {
        StylableContactImage$Contextual stylableContactImage$Contextual;
        if ((image instanceof UserAvatarImage) && (stylableContactImage$Contextual = this.C) != null) {
            StylableContactImage$ContactStyle stylableContactImage$ContactStyle = ((UserAvatarImage) image).f60045b;
            boolean zBooleanValue = ((Boolean) jo0.g.A.getValue()).booleanValue();
            if (stylableContactImage$ContactStyle == null || (stylableContactImage$ContactStyle instanceof StylableContactImage$Contextual)) {
                zBooleanValue = true;
            } else if (stylableContactImage$ContactStyle instanceof StylableContactImage$InternalColorStyle) {
                zBooleanValue = false;
            } else if (!(stylableContactImage$ContactStyle instanceof StylableContactImage$Style)) {
                throw new NoWhenBranchMatchedException();
            }
            if (zBooleanValue) {
                return UserAvatarImage.b((UserAvatarImage) image, stylableContactImage$Contextual);
            }
        }
        return image;
    }

    public final void m0(LayerDrawable layerDrawable) {
        View view = this.f58349g;
        View view2 = this.f58350h;
        View view3 = this.f58348b;
        if (view != null && view.getVisibility() == 0) {
            view3.setForeground(null);
            if (view2 != null) {
                view2.setForeground(null);
            }
        } else if (view2 == null || view2.getVisibility() != 0) {
            if (view != null) {
                view.setForeground(null);
            }
            if (view2 != null) {
                view2.setForeground(null);
            }
            view = view3;
        } else {
            view3.setForeground(null);
            if (view != null) {
                view.setForeground(null);
            }
            view = view2;
        }
        if (!(view instanceof a1)) {
            view.setBackground(null);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, 0, 4);
        fp0.g surface = new fp0.g(new Color.Solid(R$attr.uikit_colorWhite));
        Intrinsics.checkNotNullParameter(surface, "surface");
        z zVar = new z(surface);
        if (!Intrinsics.f(roundedBackgroundDrawable.i, zVar)) {
            roundedBackgroundDrawable.i = zVar;
            roundedBackgroundDrawable.f56010m = true;
        }
        if (layerDrawable == null) {
            view.setForeground(roundedBackgroundDrawable);
        } else {
            view.setForeground(new LayerDrawable(new Drawable[]{layerDrawable, roundedBackgroundDrawable}));
        }
    }

    public final void n0() {
        a1 a1Var = this.f58350h;
        if (a1Var == null || a1Var.getVisibility() == 8) {
            return;
        }
        ArrayList<ImageView> arrayList = a1Var.f209569c;
        a2 a2Var = a1Var.f209567a;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a1Var.f209568b = null;
        for (ImageView imageView : arrayList) {
            imageView.setImageDrawable(null);
            a1Var.removeView(imageView);
        }
        arrayList.clear();
        a1Var.setVisibility(8);
    }

    public final void o0() {
        c1 c1Var = this.f58349g;
        if (c1Var == null || c1Var.getVisibility() == 8) {
            return;
        }
        c1Var.d = null;
        if (c1Var.getChildCount() > 0) {
            int childCount = c1Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c1.c(c1Var.getChildAt(i));
            }
            c1Var.removeAllViews();
        }
        c1Var.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CutoutImageView cutoutImageView = this.f;
        Drawable drawable = cutoutImageView != null ? cutoutImageView.getDrawable() : null;
        AnimatedBorderGradientDrawable animatedBorderGradientDrawable = drawable instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) drawable : null;
        if (animatedBorderGradientDrawable != null) {
            animatedBorderGradientDrawable.start();
        }
        if (this.B.isInitialized()) {
            getTimeProgressController$ui_kit_components_release().e.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CutoutImageView cutoutImageView = this.f;
        Drawable drawable = cutoutImageView != null ? cutoutImageView.getDrawable() : null;
        AnimatedBorderGradientDrawable animatedBorderGradientDrawable = drawable instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) drawable : null;
        if (animatedBorderGradientDrawable != null) {
            animatedBorderGradientDrawable.stop();
        }
        if (this.B.isInitialized()) {
            com.revolut.core.ui_kit.internal.views.k kVar = getTimeProgressController$ui_kit_components_release().e;
            kVar.f57224h = false;
            Choreographer.getInstance().removeFrameCallback(kVar.k);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.f58361x) {
            int unclippedWidth = getUnclippedWidth();
            int unclippedHeight = getUnclippedHeight();
            ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
            int measuredWidth = imageWithAnimatedBackgroundView.getMeasuredWidth();
            int measuredHeight = imageWithAnimatedBackgroundView.getMeasuredHeight();
            float f = (measuredWidth - unclippedWidth) * 0.5f;
            if (getLayoutDirection() == 1) {
                f = -f;
            }
            getProgressContainer().offsetLeftAndRight(rim.d.c(f));
            getProgressContainer().offsetTopAndBottom(rim.d.c((measuredHeight - unclippedHeight) * 0.5f));
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.z.d(i);
        super.onMeasure(i, i2);
        if (this.f58361x) {
            getProgressContainer().measure(View.MeasureSpec.makeMeasureSpec(getUnclippedWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getUnclippedHeight(), 1073741824));
        }
    }

    public final void p0() {
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
        if (imageWithAnimatedBackgroundView.getVisibility() == 0) {
            imageWithAnimatedBackgroundView.setModel(null);
            imageWithAnimatedBackgroundView.setBackgroundAnimationImage$ui_kit_components_release(null);
            imageWithAnimatedBackgroundView.setVisibility(4);
        }
    }

    public final ArrayList q0() {
        ArrayList arrayList = new ArrayList(5);
        AvatarModel avatarModel = this.v;
        AvatarModel.AvatarImage avatarImageA = avatarModel != null ? avatarModel.a() : null;
        if (avatarImageA instanceof AvatarModel.AvatarImage.LayeredImage) {
            c1 c1Var = this.f58349g;
            if (c1Var != null) {
                arrayList.addAll(c1Var.getCutoutReceivers());
            }
        } else {
            boolean z = avatarImageA instanceof AvatarModel.AvatarImage.SingleImage;
            ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
            if (z) {
                arrayList.add(imageWithAnimatedBackgroundView.getCutoutImageCutoutReceiver());
                h0 backgroundAnimationCutoutReceiver = imageWithAnimatedBackgroundView.getBackgroundAnimationCutoutReceiver();
                if (backgroundAnimationCutoutReceiver != null) {
                    arrayList.add(backgroundAnimationCutoutReceiver);
                }
            } else if (avatarImageA instanceof AvatarModel.AvatarImage.GridImage) {
                a1 a1Var = this.f58350h;
                if (a1Var != null) {
                    a0.y(arrayList, a1Var.getCutoutReceivers());
                }
            } else {
                if (avatarImageA != null) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(imageWithAnimatedBackgroundView.getCutoutImageCutoutReceiver());
                h0 backgroundAnimationCutoutReceiver2 = imageWithAnimatedBackgroundView.getBackgroundAnimationCutoutReceiver();
                if (backgroundAnimationCutoutReceiver2 != null) {
                    arrayList.add(backgroundAnimationCutoutReceiver2);
                }
            }
        }
        arrayList.add(new k0(new ra0(this, 1)));
        arrayList.add(new k0(new ra0(this, 4)));
        arrayList.add(getCutoutReceiverForBlur());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        boolean zBooleanValue = ((Boolean) jo0.g.D.getValue()).booleanValue();
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.f58348b;
        if (zBooleanValue && this.D != colorScheme) {
            this.D = colorScheme;
            imageWithAnimatedBackgroundView.setReflectiveSurfaceColorScheme$ui_kit_components_release(colorScheme);
        }
        Image currentImage$ui_kit_components_release = imageWithAnimatedBackgroundView.getCurrentImage$ui_kit_components_release();
        UserAvatarImage userAvatarImage = currentImage$ui_kit_components_release instanceof UserAvatarImage ? (UserAvatarImage) currentImage$ui_kit_components_release : null;
        if (userAvatarImage == null) {
            return;
        }
        StylableContactImage$ContactStyle stylableContactImage$ContactStyle = userAvatarImage.f60045b;
        if (userAvatarImage.f60044a == null) {
            return;
        }
        boolean zBooleanValue2 = ((Boolean) jo0.g.A.getValue()).booleanValue();
        if (stylableContactImage$ContactStyle == null || (stylableContactImage$ContactStyle instanceof StylableContactImage$Contextual)) {
            zBooleanValue2 = true;
        } else if (stylableContactImage$ContactStyle instanceof StylableContactImage$InternalColorStyle) {
            zBooleanValue2 = false;
        } else if (!(stylableContactImage$ContactStyle instanceof StylableContactImage$Style)) {
            throw new NoWhenBranchMatchedException();
        }
        if (zBooleanValue2) {
            StylableContactImage$Contextual.Companion companion = StylableContactImage$Contextual.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(companion, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            StylableContactImage$Contextual stylableContactImage$Contextual = new StylableContactImage$Contextual(kli.a.s(R$attr.uikit_colorForeground, new gs0.c(context, colorScheme)));
            if (Intrinsics.f(stylableContactImage$ContactStyle, stylableContactImage$Contextual) && Intrinsics.f(this.C, stylableContactImage$Contextual)) {
                return;
            }
            this.C = stylableContactImage$Contextual;
            if (this.f58353m.isInitialized()) {
                getBadgeTop().b(stylableContactImage$Contextual);
            }
            if (this.f58352l.isInitialized()) {
                getBadgeMiddle().b(stylableContactImage$Contextual);
            }
            if (this.f58354n.isInitialized()) {
                getBadgeBottom().b(stylableContactImage$Contextual);
            }
            Image currentImage$ui_kit_components_release2 = imageWithAnimatedBackgroundView.getCurrentImage$ui_kit_components_release();
            UserAvatarImage userAvatarImage2 = currentImage$ui_kit_components_release2 instanceof UserAvatarImage ? (UserAvatarImage) currentImage$ui_kit_components_release2 : null;
            if (userAvatarImage2 == null) {
                return;
            }
            AvatarModel avatarModel = this.v;
            AvatarModel.AvatarImage avatarImageA = avatarModel != null ? avatarModel.a() : null;
            AvatarModel.AvatarImage.SingleImage singleImage = avatarImageA instanceof AvatarModel.AvatarImage.SingleImage ? (AvatarModel.AvatarImage.SingleImage) avatarImageA : null;
            Image image = singleImage != null ? singleImage.f57997a : null;
            UserAvatarImage userAvatarImage3 = image instanceof UserAvatarImage ? (UserAvatarImage) image : null;
            if (userAvatarImage3 == null) {
                userAvatarImage3 = userAvatarImage2;
            }
            Image imageL0 = l0(userAvatarImage3);
            if (Intrinsics.f(imageL0, userAvatarImage2)) {
                return;
            }
            s0(imageL0);
        }
    }

    public final GradientDrawable r0() {
        GradientDrawable gradientDrawableK = v7.k(0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawableK.setCornerRadius(kli.a.l(context, 3.5f));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorBlack_60, context2));
        return gradientDrawableK;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getSuppressLayout()) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(com.revolut.core.ui_kit_core.displayers.image.Image r6) {
        /*
            r5 = this;
            com.revolut.core.ui_kit_core.displayers.image.Image r6 = r5.l0(r6)
            int r0 = com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView.f58648h
            com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView r0 = r5.f58348b
            com.revolut.core.ui_kit.internal.views.CutoutImageView r1 = r0.f
            boolean r2 = r6 instanceof com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage
            if (r2 == 0) goto L1d
            r2 = r6
            com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage r2 = (com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage) r2
            com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder r3 = r2.f60044a
            if (r3 == 0) goto L1d
            com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle r2 = r2.f60045b
            boolean r2 = r2 instanceof com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Contextual
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            l1.e r3 = new l1.e
            r4 = 13
            r3.<init>(r0, r2, r6, r4)
            r4 = 4
            xv0.m.e0(r0, r6, r1, r3, r4)
            if (r2 == 0) goto L3e
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 == 0) goto L39
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            boolean r2 = r2 instanceof yy0.m
            if (r2 == 0) goto L3e
        L39:
            com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable r2 = r0.f58650b
            r1.setBackground(r2)
        L3e:
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            r0.a(r1, r6)
            aw0.v1 r6 = r5.D
            r0.setReflectiveSurfaceColorScheme$ui_kit_components_release(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.AvatarView.s0(com.revolut.core.ui_kit_core.displayers.image.Image):void");
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        if (background == null) {
            background = this.G;
        }
        super.setBackground(background);
    }

    public final void setContentAlpha(float f) {
        AvatarModel.State e;
        if (this.contentAlpha == f) {
            return;
        }
        this.contentAlpha = f;
        AvatarModel avatarModel = this.v;
        if (avatarModel == null || (e = avatarModel.getE()) == null) {
            e = AvatarModel.State.Enabled.f58039a;
        }
        setState(e);
    }

    public final void setDefaultAvatarStyle$ui_kit_components_release(@NotNull i1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f58360w = style;
    }

    @Override // xv0.m
    public void setItemRenderState(@NotNull xv0.i value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f58348b.setItemRenderState(value);
    }

    public final void setModel(@NotNull AvatarModel newModel) {
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        C0(newModel, false);
    }

    @yhm.d
    public final void setModel$ui_kit_components_release(@NotNull AvatarModel.Default model, boolean allowCustomScaleType) {
        Intrinsics.checkNotNullParameter(model, "model");
        C0(model, allowCustomScaleType);
    }

    public final void setReflectiveOuterBorderEnabled$ui_kit_components_release(boolean enabled) {
        if (this.E == enabled) {
            return;
        }
        this.E = enabled;
        this.f58348b.setReflectiveOuterBorderEnabled$ui_kit_components_release(enabled);
    }

    @Override // ny0.o
    public void setSuppressLayout(boolean z) {
        this.suppressLayout = z;
    }

    public final void setupAvatarViewForNewNavbarDesign(@NotNull Context context, @NotNull i1 defaultSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultSize, "defaultSize");
        setBackground(this.G);
        or0.u.A(this, kli.a.k(context, 44.0f), kli.a.k(context, 44.0f));
        setDefaultAvatarStyle$ui_kit_components_release(i1.SIZE_44_44);
    }

    public final void t0(Function1 function1) {
        this.f58362y = function1;
        setDrawOutside(true);
        AvatarModel avatarModel = this.v;
        if (avatarModel != null) {
            E0(B0(avatarModel));
        }
    }

    public final float u0(AvatarModel avatarModel) {
        if (avatarModel instanceof AvatarModel.AddCard) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return kli.a.l(context, 2.0f);
        }
        if (avatarModel instanceof AvatarModel.Card) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return kli.a.l(context2, 2.0f);
        }
        if (avatarModel instanceof AvatarModel.SegmentedProgress) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return kli.a.l(context3, 2.0f);
        }
        if (avatarModel instanceof AvatarModel.Default) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            return kli.a.l(context4, this.f58360w.a());
        }
        if (avatarModel instanceof AvatarModel.Layered) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            return kli.a.l(context5, this.f58360w.a());
        }
        if ((avatarModel instanceof AvatarModel.Builder) || (avatarModel instanceof AvatarModel.GridImage)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (!(avatarModel instanceof AvatarModel.TimeProgress)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        return kli.a.l(context6, this.f58360w.a());
    }

    public final int v0(AvatarModel avatarModel) {
        if (avatarModel instanceof AvatarModel.AddCard) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return kli.a.k(context, ((AvatarModel.AddCard) avatarModel).e);
        }
        if (avatarModel instanceof AvatarModel.Card) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return kli.a.k(context2, ((AvatarModel.Card) avatarModel).f58014l);
        }
        if (avatarModel instanceof AvatarModel.SegmentedProgress) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return kli.a.k(context3, 44.0f);
        }
        if (avatarModel instanceof AvatarModel.Default) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            return kli.a.k(context4, this.f58360w.b());
        }
        if (avatarModel instanceof AvatarModel.Layered) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            return kli.a.k(context5, this.f58360w.b());
        }
        if (avatarModel instanceof AvatarModel.Builder) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            return kli.a.k(context6, ((AvatarModel.Builder) avatarModel).f);
        }
        if (avatarModel instanceof AvatarModel.GridImage) {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            return kli.a.k(context7, this.f58360w.b());
        }
        if (!(avatarModel instanceof AvatarModel.TimeProgress)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        return kli.a.k(context8, this.f58360w.b());
    }

    public final int w0(AvatarModel avatarModel) {
        if (avatarModel instanceof AvatarModel.AddCard) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return kli.a.k(context, ((AvatarModel.AddCard) avatarModel).f);
        }
        if (avatarModel instanceof AvatarModel.Card) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return kli.a.k(context2, ((AvatarModel.Card) avatarModel).f58015m);
        }
        if (avatarModel instanceof AvatarModel.SegmentedProgress) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return kli.a.k(context3, 44.0f);
        }
        if (avatarModel instanceof AvatarModel.Default) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            return kli.a.k(context4, this.f58360w.b());
        }
        if (avatarModel instanceof AvatarModel.Layered) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            return kli.a.k(context5, this.f58360w.b());
        }
        if (avatarModel instanceof AvatarModel.Builder) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            return kli.a.k(context6, ((AvatarModel.Builder) avatarModel).f58008g);
        }
        if (avatarModel instanceof AvatarModel.GridImage) {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            return kli.a.k(context7, this.f58360w.b());
        }
        if (!(avatarModel instanceof AvatarModel.TimeProgress)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        return kli.a.k(context8, this.f58360w.b());
    }

    public final os0.a x0(AvatarModel avatarModel) {
        if (!(avatarModel instanceof AvatarModel.AddCard) && !(avatarModel instanceof AvatarModel.Card) && !(avatarModel instanceof AvatarModel.SegmentedProgress)) {
            if (!(avatarModel instanceof AvatarModel.Default) && !(avatarModel instanceof AvatarModel.Layered) && !(avatarModel instanceof AvatarModel.Builder) && !(avatarModel instanceof AvatarModel.GridImage) && !(avatarModel instanceof AvatarModel.TimeProgress)) {
                throw new NoWhenBranchMatchedException();
            }
            return this.f58360w.c();
        }
        return os0.a.SMALL;
    }

    public final c8g.a y0(AvatarModel.Border border, float f) {
        int i = j1.f209769b[border.getF58003b().ordinal()];
        if (i == 1) {
            return new dr0.q(f);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new dr0.r(kli.a.l(context, 3.0f), f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 2;
        this.i = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i3) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i5 = R$id.avatar_image;
                        layoutParams.startToStart = i5;
                        layoutParams.endToEnd = i5;
                        layoutParams.bottomToBottom = i5;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i6 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i6;
                        layoutParams2.startToStart = i6;
                        layoutParams2.endToEnd = i6;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i21 = R$id.avatar_image;
                        layoutParams3.startToStart = i21;
                        layoutParams3.endToEnd = i21;
                        layoutParams3.topToTop = i21;
                        layoutParams3.bottomToBottom = i21;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i22 = R$id.avatar_image;
                        layoutParams4.endToEnd = i22;
                        layoutParams4.topToTop = i22;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i32 = R$id.avatar_image;
                        layoutParams5.endToEnd = i32;
                        layoutParams5.bottomToBottom = i32;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        final int i3 = 3;
        this.f58351j = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i32) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i5 = R$id.avatar_image;
                        layoutParams.startToStart = i5;
                        layoutParams.endToEnd = i5;
                        layoutParams.bottomToBottom = i5;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i6 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i6;
                        layoutParams2.startToStart = i6;
                        layoutParams2.endToEnd = i6;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i21 = R$id.avatar_image;
                        layoutParams3.startToStart = i21;
                        layoutParams3.endToEnd = i21;
                        layoutParams3.topToTop = i21;
                        layoutParams3.bottomToBottom = i21;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i22 = R$id.avatar_image;
                        layoutParams4.endToEnd = i22;
                        layoutParams4.topToTop = i22;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i322 = R$id.avatar_image;
                        layoutParams5.endToEnd = i322;
                        layoutParams5.bottomToBottom = i322;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        final int i5 = 4;
        this.k = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i32) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i59 = R$id.avatar_image;
                        layoutParams.startToStart = i59;
                        layoutParams.endToEnd = i59;
                        layoutParams.bottomToBottom = i59;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i6 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i6;
                        layoutParams2.startToStart = i6;
                        layoutParams2.endToEnd = i6;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i21 = R$id.avatar_image;
                        layoutParams3.startToStart = i21;
                        layoutParams3.endToEnd = i21;
                        layoutParams3.topToTop = i21;
                        layoutParams3.bottomToBottom = i21;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i22 = R$id.avatar_image;
                        layoutParams4.endToEnd = i22;
                        layoutParams4.topToTop = i22;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i322 = R$id.avatar_image;
                        layoutParams5.endToEnd = i322;
                        layoutParams5.bottomToBottom = i322;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        final int i6 = 5;
        this.f58352l = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i32) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i59 = R$id.avatar_image;
                        layoutParams.startToStart = i59;
                        layoutParams.endToEnd = i59;
                        layoutParams.bottomToBottom = i59;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i66 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i66;
                        layoutParams2.startToStart = i66;
                        layoutParams2.endToEnd = i66;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i21 = R$id.avatar_image;
                        layoutParams3.startToStart = i21;
                        layoutParams3.endToEnd = i21;
                        layoutParams3.topToTop = i21;
                        layoutParams3.bottomToBottom = i21;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i22 = R$id.avatar_image;
                        layoutParams4.endToEnd = i22;
                        layoutParams4.topToTop = i22;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i322 = R$id.avatar_image;
                        layoutParams5.endToEnd = i322;
                        layoutParams5.bottomToBottom = i322;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        final int i21 = 6;
        this.f58353m = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i21;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i32) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i59 = R$id.avatar_image;
                        layoutParams.startToStart = i59;
                        layoutParams.endToEnd = i59;
                        layoutParams.bottomToBottom = i59;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i66 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i66;
                        layoutParams2.startToStart = i66;
                        layoutParams2.endToEnd = i66;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i212 = R$id.avatar_image;
                        layoutParams3.startToStart = i212;
                        layoutParams3.endToEnd = i212;
                        layoutParams3.topToTop = i212;
                        layoutParams3.bottomToBottom = i212;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i22 = R$id.avatar_image;
                        layoutParams4.endToEnd = i22;
                        layoutParams4.topToTop = i22;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i322 = R$id.avatar_image;
                        layoutParams5.endToEnd = i322;
                        layoutParams5.bottomToBottom = i322;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        final int i22 = 7;
        this.f58354n = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i22;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i32) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i59 = R$id.avatar_image;
                        layoutParams.startToStart = i59;
                        layoutParams.endToEnd = i59;
                        layoutParams.bottomToBottom = i59;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i66 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i66;
                        layoutParams2.startToStart = i66;
                        layoutParams2.endToEnd = i66;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i212 = R$id.avatar_image;
                        layoutParams3.startToStart = i212;
                        layoutParams3.endToEnd = i212;
                        layoutParams3.topToTop = i212;
                        layoutParams3.bottomToBottom = i212;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i222 = R$id.avatar_image;
                        layoutParams4.endToEnd = i222;
                        layoutParams4.topToTop = i222;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i322 = R$id.avatar_image;
                        layoutParams5.endToEnd = i322;
                        layoutParams5.bottomToBottom = i322;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        final int i32 = 0;
        this.o = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i32;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i322) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i59 = R$id.avatar_image;
                        layoutParams.startToStart = i59;
                        layoutParams.endToEnd = i59;
                        layoutParams.bottomToBottom = i59;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i66 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i66;
                        layoutParams2.startToStart = i66;
                        layoutParams2.endToEnd = i66;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i212 = R$id.avatar_image;
                        layoutParams3.startToStart = i212;
                        layoutParams3.endToEnd = i212;
                        layoutParams3.topToTop = i212;
                        layoutParams3.bottomToBottom = i212;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i222 = R$id.avatar_image;
                        layoutParams4.endToEnd = i222;
                        layoutParams4.topToTop = i222;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i3222 = R$id.avatar_image;
                        layoutParams5.endToEnd = i3222;
                        layoutParams5.bottomToBottom = i3222;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        this.f58355p = new ix0.x(new ra0(this, 2));
        final int i33 = 1;
        this.f58356q = te0.w.y0(new Function0() { // from class: mx0.h1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i33;
                Context context2 = context;
                AvatarView avatarView = this;
                switch (i322) {
                    case 0:
                        AvatarView.Companion companion = AvatarView.INSTANCE;
                        View appCompatImageView = new AppCompatImageView(context2);
                        appCompatImageView.setId(R$id.avatar_bottomDecorationBadge);
                        int iK = kli.a.k(context2, 24.0f);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                        int i59 = R$id.avatar_image;
                        layoutParams.startToStart = i59;
                        layoutParams.endToEnd = i59;
                        layoutParams.bottomToBottom = i59;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setTranslationY(kli.a.l(context2, 12.0f));
                        appCompatImageView.setVisibility(8);
                        avatarView.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        AvatarView.Companion companion2 = AvatarView.INSTANCE;
                        View tagView = new TagView(context2, null, 6, 0);
                        tagView.setId(R$id.avatar_tag);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i66 = R$id.avatar_image;
                        layoutParams2.bottomToBottom = i66;
                        layoutParams2.startToStart = i66;
                        layoutParams2.endToEnd = i66;
                        tagView.setLayoutParams(layoutParams2);
                        tagView.setTranslationY(kli.a.l(context2, 12.0f));
                        tagView.setVisibility(8);
                        avatarView.addView(tagView);
                        return tagView;
                    case 2:
                        return AvatarView.j0(context2, avatarView);
                    case 3:
                        return AvatarView.i0(context2, avatarView);
                    case 4:
                        return AvatarView.h0(context2, avatarView);
                    case 5:
                        AvatarView.Companion companion3 = AvatarView.INSTANCE;
                        View circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
                        circleBadgeView.setId(R$id.avatar_badgeMiddle);
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i212 = R$id.avatar_image;
                        layoutParams3.startToStart = i212;
                        layoutParams3.endToEnd = i212;
                        layoutParams3.topToTop = i212;
                        layoutParams3.bottomToBottom = i212;
                        circleBadgeView.setLayoutParams(layoutParams3);
                        circleBadgeView.setVisibility(8);
                        avatarView.addView(circleBadgeView);
                        return circleBadgeView;
                    case 6:
                        AvatarView.Companion companion4 = AvatarView.INSTANCE;
                        Context context3 = context;
                        View circleBadgeView2 = new CircleBadgeView(context3, null, 0, null, 14);
                        circleBadgeView2.setId(R$id.avatar_badgeTop);
                        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i222 = R$id.avatar_image;
                        layoutParams4.endToEnd = i222;
                        layoutParams4.topToTop = i222;
                        circleBadgeView2.setLayoutParams(layoutParams4);
                        circleBadgeView2.setTranslationX(kli.a.l(context3, 4.0f));
                        circleBadgeView2.setTranslationY(kli.a.l(context3, -4.0f));
                        circleBadgeView2.setVisibility(8);
                        avatarView.addView(circleBadgeView2);
                        return circleBadgeView2;
                    default:
                        AvatarView.Companion companion5 = AvatarView.INSTANCE;
                        Context context4 = context;
                        View circleBadgeView3 = new CircleBadgeView(context4, null, 0, null, 14);
                        circleBadgeView3.setId(R$id.avatar_badgeBottom);
                        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                        int i3222 = R$id.avatar_image;
                        layoutParams5.endToEnd = i3222;
                        layoutParams5.bottomToBottom = i3222;
                        circleBadgeView3.setLayoutParams(layoutParams5);
                        circleBadgeView3.setTranslationX(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setTranslationY(kli.a.l(context4, 4.0f));
                        circleBadgeView3.setVisibility(8);
                        avatarView.addView(circleBadgeView3);
                        return circleBadgeView3;
                }
            }
        });
        this.f58357r = te0.w.y0(new ra0(this, 3));
        this.f58358s = te0.w.y0(new ra0(this, 5));
        this.f58360w = i1.SIZE_56_56;
        this.z = new ny0.q(this);
        this.B = te0.w.y0(new ra0(this, 6));
        v1.Companion.getClass();
        this.D = t1.a(context);
        this.E = true;
        this.contentAlpha = 1.0f;
        GradientDrawable gradientDrawableK = v7.k(1);
        this.G = gradientDrawableK;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.clickHandler = fp0.m.a(this, gVar);
        View.inflate(context, R$layout.internal_view_avatar, this);
        View viewFindViewById = findViewById(R$id.avatar_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f58348b = (ImageWithAnimatedBackgroundView) viewFindViewById;
        setBackground(gradientDrawableK);
        m0(null);
        this.I = new k0(this);
    }

    public /* synthetic */ AvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
