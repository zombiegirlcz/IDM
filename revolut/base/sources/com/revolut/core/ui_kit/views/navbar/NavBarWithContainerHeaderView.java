package com.revolut.core.ui_kit.views.navbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Parcelable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import au0.h4;
import au0.t2;
import au0.v2;
import aw0.k9;
import aw0.t1;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.f0;
import ix0.c0;
import ix0.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.s3;
import mx0.i1;
import mx0.w5;
import op0.r3;
import org.jetbrains.annotations.NotNull;
import tx0.a3;
import tx0.b3;
import tx0.c3;
import tx0.e3;
import tx0.f3;
import tx0.g3;
import tx0.h3;
import tx0.o1;
import tx0.x2;
import tx0.y2;
import tx0.z2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 Æ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\rL\u0094\u0001\u009f\u0001»\u0001Ç\u0001È\u0001!cB'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010)\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b*\u0010(J\u0011\u0010.\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020\r¢\u0006\u0004\b/\u0010\u0012J\u001b\u00103\u001a\u00020\u00182\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00182\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00182\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00182\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u000205¢\u0006\u0004\bB\u00108J!\u0010D\u001a\u00020\u00182\u0006\u0010A\u001a\u0002052\b\u0010C\u001a\u0004\u0018\u000105H\u0007¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00182\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00182\b\u0010J\u001a\u0004\u0018\u000105¢\u0006\u0004\bK\u00108J\u0017\u0010N\u001a\u00020\u00182\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u0016H\u0007¢\u0006\u0004\bQ\u0010\u001aJ\u0015\u0010T\u001a\u00020\u00182\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020\rH\u0000¢\u0006\u0004\bV\u0010\u0012J\u0011\u0010Z\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\bX\u0010YJ\u0017\u0010^\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\rH\u0000¢\u0006\u0004\b\\\u0010]J\u000f\u0010`\u001a\u00020\rH\u0000¢\u0006\u0004\b_\u0010\u0012R.\u0010i\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010t\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010sR\u001a\u0010w\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bu\u0010q\u0012\u0004\bv\u0010sR\u001a\u0010z\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010q\u001a\u0004\by\u0010-R\u001b\u0010\u0080\u0001\u001a\u00020{8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R/\u0010\u008b\u0001\u001a\u00020\r2\u0006\u0010b\u001a\u00020\r8\u0000@BX\u0081\u000e¢\u0006\u0016\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0005\b\u008a\u0001\u0010s\u001a\u0005\b\u0089\u0001\u0010\u0012R/\u0010\u008f\u0001\u001a\u00020\r2\u0006\u0010b\u001a\u00020\r8\u0000@BX\u0081\u000e¢\u0006\u0016\n\u0006\b\u008c\u0001\u0010\u0088\u0001\u0012\u0005\b\u008e\u0001\u0010s\u001a\u0005\b\u008d\u0001\u0010\u0012R/\u0010\u0093\u0001\u001a\u00020\r2\u0006\u0010b\u001a\u00020\r8\u0000@BX\u0081\u000e¢\u0006\u0016\n\u0006\b\u0090\u0001\u0010\u0088\u0001\u0012\u0005\b\u0092\u0001\u0010s\u001a\u0005\b\u0091\u0001\u0010\u0012R2\u0010\u009a\u0001\u001a\u00030\u0094\u00012\u0007\u0010b\u001a\u00030\u0094\u00018\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u0099\u0001\u0010s\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R/\u0010\u009e\u0001\u001a\u00020\r2\u0006\u0010b\u001a\u00020\r8\u0000@BX\u0081\u000e¢\u0006\u0016\n\u0006\b\u009b\u0001\u0010\u0088\u0001\u0012\u0005\b\u009d\u0001\u0010s\u001a\u0005\b\u009c\u0001\u0010\u0012R2\u0010¥\u0001\u001a\u00030\u009f\u00012\u0007\u0010b\u001a\u00030\u009f\u00018\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u0012\u0005\b¤\u0001\u0010s\u001a\u0006\b¢\u0001\u0010£\u0001R2\u0010¬\u0001\u001a\u00030¦\u00012\u0007\u0010b\u001a\u00030¦\u00018\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\b§\u0001\u0010¨\u0001\u0012\u0005\b«\u0001\u0010s\u001a\u0006\b©\u0001\u0010ª\u0001R(\u0010°\u0001\u001a\u00020\u00162\u0006\u0010b\u001a\u00020\u00168\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b\u00ad\u0001\u0010®\u0001\"\u0005\b¯\u0001\u0010\u001aR(\u0010¶\u0001\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010UR'\u0010º\u0001\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b·\u0001\u0010\u0088\u0001\u001a\u0005\b¸\u0001\u0010\u0012\"\u0005\b¹\u0001\u0010]R,\u0010Â\u0001\u001a\u0005\u0018\u00010»\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u001f\u0010Ã\u0001\u001a\u00020\u00168\u0016X\u0096D¢\u0006\u0010\n\u0006\bÃ\u0001\u0010®\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001¨\u0006É\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarWithContainerHeaderView;", "Landroid/widget/FrameLayout;", "Lur0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lny0/h;", "Liv0/m;", "Lau0/h4;", "Lau0/v2;", "Lsxl/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getTotalScrollRange", "()I", "Lgoi/f;", "getNavbarMaskState", "()Lgoi/f;", "", "hasDockedBottomView", "", "setHasDockedBottomView$ui_kit_components_release", "(Z)V", "setHasDockedBottomView", "Lkotlin/Function0;", "callback", "setNavbarPositionChangedCallback", "(Lkotlin/jvm/functions/Function0;)V", "enabled", "Ltx0/c3;", "setInteractiveMessageMode$ui_kit_components_release", "(ZLtx0/c3;)V", "setInteractiveMessageMode", "Lcom/revolut/core/ui_kit/models/navbar/NavBarMessage;", "message", "setInteractiveMessage$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/models/navbar/NavBarMessage;)V", "setInteractiveMessage", "setPersistentMessage", "Landroid/widget/TextView;", "getMessageView$ui_kit_components_release", "()Landroid/widget/TextView;", "getMessageView", "getGlowColor", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "setMenuItems", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "setSearchButtonText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Law0/k9;", "buttons", "setSearchButtonActions", "(Law0/k9;)V", "Ltx0/t2;", "avatar", "setAvatar", "(Ltx0/t2;)V", "title", "setTitle", "subtitle", "setTitleWithSubtitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setNavigationButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "headerDisclaimerClause", "setHeaderDisclaimer", "Ltx0/f3;", "model", "setTagView", "(Ltx0/f3;)V", "hideTitleWhenExpanded", "setHideTitleWhenExpanded", "", "expandRatio", "setExpandRatio", "(F)V", "getDefaultMessageInset$ui_kit_components_release", "getDefaultMessageInset", "getPersistentMessage$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/models/navbar/NavBarMessage;", "getPersistentMessage", "inset", "setMessageCurrentInset$ui_kit_components_release", "(I)V", "setMessageCurrentInset", "getMessageCurrentInset$ui_kit_components_release", "getMessageCurrentInset", "Landroid/os/Parcelable;", "value", "a", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lau0/t2;", "c", "Lkotlin/Lazy;", "getBackgroundDrawingStrategy", "()Lau0/t2;", "backgroundDrawingStrategy", "k", "Landroid/widget/TextView;", "getTitleChainedView$annotations", "()V", "titleChainedView", "l", "getSubtitleChainedView$annotations", "subtitleChainedView", "p", "getHeaderDisclaimer$ui_kit_components_release", "headerDisclaimer", "Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "q", "Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "getHeaderDisclaimerContainer$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "headerDisclaimerContainer", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "r", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "getTagView$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tagView", "x", "I", "getCollapsedBackgroundColor$ui_kit_components_release", "getCollapsedBackgroundColor$ui_kit_components_release$annotations", "collapsedBackgroundColor", "z", "getExpandedTintColor$ui_kit_components_release", "getExpandedTintColor$ui_kit_components_release$annotations", "expandedTintColor", "A", "getExpandedViewsBackgroundColor$ui_kit_components_release", "getExpandedViewsBackgroundColor$ui_kit_components_release$annotations", "expandedViewsBackgroundColor", "Ltx0/b3;", "B", "Ltx0/b3;", "getExpandedViewsBackgroundColorState$ui_kit_components_release", "()Ltx0/b3;", "getExpandedViewsBackgroundColorState$ui_kit_components_release$annotations", "expandedViewsBackgroundColorState", "E", "getMiddleBackgroundColor$ui_kit_components_release", "getMiddleBackgroundColor$ui_kit_components_release$annotations", "middleBackgroundColor", "Ltx0/a3;", "G", "Ltx0/a3;", "getExpandAnimatorTiming$ui_kit_components_release", "()Ltx0/a3;", "getExpandAnimatorTiming$ui_kit_components_release$annotations", "expandAnimatorTiming", "Law0/v1;", "M", "Law0/v1;", "getContextualColorScheme$ui_kit_components_release", "()Law0/v1;", "getContextualColorScheme$ui_kit_components_release$annotations", "contextualColorScheme", "b0", "Z", "setMessageAnimRunning", "messageAnimRunning", "m0", "F", "getExpandRatioToChangeAppearance", "()F", "setExpandRatioToChangeAppearance", "expandRatioToChangeAppearance", "n0", "getMenuItemsBackgroundType$ui_kit_components_release", "setMenuItemsBackgroundType$ui_kit_components_release", "menuItemsBackgroundType", "Ltx0/y2;", "o0", "Ltx0/y2;", "getAnimationCallback$ui_kit_components_release", "()Ltx0/y2;", "setAnimationCallback$ui_kit_components_release", "(Ltx0/y2;)V", "animationCallback", "fitsReadableArea", "getFitsReadableArea", "()Z", "Companion", "tx0/e3", "tx0/z2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarWithContainerHeaderView extends FrameLayout implements ur0.a, TrackableItem, ny0.h, iv0.m, h4, v2, sxl.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final ViewIdTarget f59372r0 = new ViewIdTarget(R$id.navBarWithContainerHeader_avatar);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public int expandedViewsBackgroundColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public b3 expandedViewsBackgroundColorState;
    public float C;
    public boolean D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int middleBackgroundColor;
    public ValueAnimator F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public a3 expandAnimatorTiming;
    public boolean H;
    public float I;
    public float J;
    public int K;
    public final v1 L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public v1 contextualColorScheme;
    public int N;
    public final int O;
    public final ihm.f P;
    public final ihm.f Q;
    public final ihm.f R;
    public final ihm.f S;
    public final ArrayList T;
    public final ihm.f U;
    public final ihm.f V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f59374a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.navbar.d f59375b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public boolean messageAnimRunning;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Lazy backgroundDrawingStrategy;
    public int c0;
    public final ArrayList d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c3 f59378d0;
    public boolean e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f59379e0;
    public NavBarMessage f;
    public AppCompatTextView f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f59380g;
    public InsetDrawable g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f59381h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public NavBarMessage f59382h0;
    public final TextView i;
    public NavBarMessage i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewGroup f59383j;
    public NavBarMessage j0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final TextView titleChainedView;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public e3 f59384k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final TextView subtitleChainedView;
    public s3 l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchButton f59386m;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public float expandRatioToChangeAppearance;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f59387n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public int menuItemsBackgroundType;
    public final NavBarNavigationButtonView o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public y2 animationCallback;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final TextView headerDisclaimer;
    public Function0 p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final UIKitFrameLayout headerDisclaimerContainer;
    public int q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final TagView tagView;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f59393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f59394t;
    public final int u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f59395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int collapsedBackgroundColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f59397y;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int expandedTintColor;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarWithContainerHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final t2 getBackgroundDrawingStrategy() {
        return (t2) this.backgroundDrawingStrategy.getValue();
    }

    public static /* synthetic */ void getCollapsedBackgroundColor$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getContextualColorScheme$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getExpandAnimatorTiming$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getExpandedTintColor$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getExpandedViewsBackgroundColor$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getExpandedViewsBackgroundColorState$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getMiddleBackgroundColor$ui_kit_components_release$annotations() {
    }

    @yhm.d
    private static /* synthetic */ void getSubtitleChainedView$annotations() {
    }

    @yhm.d
    private static /* synthetic */ void getTitleChainedView$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHeaderDisclaimer$lambda$1(NavBarWithContainerHeaderView navBarWithContainerHeaderView) {
        if (navBarWithContainerHeaderView.N == 0 && navBarWithContainerHeaderView.W == 0) {
            return;
        }
        navBarWithContainerHeaderView.m();
        navBarWithContainerHeaderView.requestLayout();
    }

    public static /* synthetic */ void setInteractiveMessageMode$ui_kit_components_release$default(NavBarWithContainerHeaderView navBarWithContainerHeaderView, boolean z, c3 c3Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            c3Var = null;
        }
        navBarWithContainerHeaderView.setInteractiveMessageMode$ui_kit_components_release(z, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMessageAnimRunning(boolean z) {
        this.messageAnimRunning = z;
        if (z || this.c0 != 1 || z) {
            return;
        }
        this.c0 = 2;
        c3 c3Var = this.f59378d0;
        if (c3Var != null) {
            ((dy0.h) c3Var).g();
        }
        t(false);
    }

    @Override // iv0.m
    public final void a() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((t2) arrayList.get(i)).a(this);
            }
        }
    }

    @Override // sxl.b
    public final void b(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        if (this.c0 != 3) {
            return;
        }
        this.c0 = 0;
        NavBarMessage navBarMessage = this.f;
        this.f = null;
        this.f59382h0 = navBarMessage;
        t(true);
    }

    @Override // sxl.b
    public final void f(txl.e nudge, float f) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        u(f);
    }

    @Override // sxl.b
    public final sxl.a g(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        float width = getWidth() / 2.0f;
        float height = getHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new sxl.a(width, kli.a.l(context, 32.0f) + height);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getE() {
        return this.analyticsContext;
    }

    /* JADX INFO: renamed from: getAnimationCallback$ui_kit_components_release, reason: from getter */
    public final y2 getAnimationCallback() {
        return this.animationCallback;
    }

    /* JADX INFO: renamed from: getCollapsedBackgroundColor$ui_kit_components_release, reason: from getter */
    public final int getCollapsedBackgroundColor() {
        return this.collapsedBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: getContextualColorScheme$ui_kit_components_release, reason: from getter */
    public final v1 getContextualColorScheme() {
        return this.contextualColorScheme;
    }

    public final int getDefaultMessageInset$ui_kit_components_release() {
        l();
        return this.f59374a0;
    }

    @NotNull
    /* JADX INFO: renamed from: getExpandAnimatorTiming$ui_kit_components_release, reason: from getter */
    public final a3 getExpandAnimatorTiming() {
        return this.expandAnimatorTiming;
    }

    public final float getExpandRatioToChangeAppearance() {
        return this.expandRatioToChangeAppearance;
    }

    /* JADX INFO: renamed from: getExpandedTintColor$ui_kit_components_release, reason: from getter */
    public final int getExpandedTintColor() {
        return this.expandedTintColor;
    }

    /* JADX INFO: renamed from: getExpandedViewsBackgroundColor$ui_kit_components_release, reason: from getter */
    public final int getExpandedViewsBackgroundColor() {
        return this.expandedViewsBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: getExpandedViewsBackgroundColorState$ui_kit_components_release, reason: from getter */
    public final b3 getExpandedViewsBackgroundColorState() {
        return this.expandedViewsBackgroundColorState;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r1 < 0.85f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (kli.a.q(r0) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getGlowColor() {
        /*
            r4 = this;
            int r0 = r4.f59395w
            if (r0 != 0) goto L14
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kli.a.q(r0)
            if (r0 != 0) goto L54
            goto L51
        L14:
            ms0.s3$a r1 = ms0.s3.Companion
            r1.getClass()
            r1 = 3
            float[] r1 = new float[r1]
            androidx.core.graphics.ColorUtils.colorToHSL(r0, r1)
            r0 = 0
            r0 = r1[r0]
            r2 = 1
            r2 = r1[r2]
            r3 = 2
            r1 = r1[r3]
            r3 = 1058642330(0x3f19999a, float:0.6)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L30
            goto L54
        L30:
            r3 = 1048576000(0x3e800000, float:0.25)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L37
            goto L51
        L37:
            r3 = 1112014848(0x42480000, float:50.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L54
            r3 = 1116471296(0x428c0000, float:70.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L54
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L54
            r0 = 1062836634(0x3f59999a, float:0.85)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L54
        L51:
            int r0 = ms0.s3.k
            return r0
        L54:
            int r0 = ms0.s3.f208414j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView.getGlowColor():int");
    }

    @NotNull
    /* JADX INFO: renamed from: getHeaderDisclaimer$ui_kit_components_release, reason: from getter */
    public final TextView getHeaderDisclaimer() {
        return this.headerDisclaimer;
    }

    @NotNull
    /* JADX INFO: renamed from: getHeaderDisclaimerContainer$ui_kit_components_release, reason: from getter */
    public final UIKitFrameLayout getHeaderDisclaimerContainer() {
        return this.headerDisclaimerContainer;
    }

    /* JADX INFO: renamed from: getMenuItemsBackgroundType$ui_kit_components_release, reason: from getter */
    public final int getMenuItemsBackgroundType() {
        return this.menuItemsBackgroundType;
    }

    /* JADX INFO: renamed from: getMessageCurrentInset$ui_kit_components_release, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final TextView getMessageView$ui_kit_components_release() {
        return this.f0;
    }

    /* JADX INFO: renamed from: getMiddleBackgroundColor$ui_kit_components_release, reason: from getter */
    public final int getMiddleBackgroundColor() {
        return this.middleBackgroundColor;
    }

    @Override // au0.v2
    @NotNull
    public goi.f getNavbarMaskState() {
        return getBackgroundDrawingStrategy().getNavbarMaskState();
    }

    /* JADX INFO: renamed from: getPersistentMessage$ui_kit_components_release, reason: from getter */
    public final NavBarMessage getF59382h0() {
        return this.f59382h0;
    }

    @NotNull
    /* JADX INFO: renamed from: getTagView$ui_kit_components_release, reason: from getter */
    public final TagView getTagView() {
        return this.tagView;
    }

    @Override // au0.h4
    /* JADX INFO: renamed from: getTotalScrollRange, reason: from getter */
    public int getQ0() {
        return this.q0;
    }

    @Override // sxl.b
    public final boolean i(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        return (((lie.a) nudge).c() instanceof txl.b) && this.K == 0;
    }

    @Override // sxl.b
    public final void j(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        lie.a aVar = (lie.a) nudge;
        txl.d dVarC = aVar.c();
        txl.b bVar = dVarC instanceof txl.b ? (txl.b) dVarC : null;
        if (bVar == null) {
            return;
        }
        NavBarMessage navBarMessage = new NavBarMessage(aVar.b(), (Clause) bVar.f275434a.f275436a, false, false, 24);
        if (this.c0 == 3) {
            return;
        }
        this.c0 = 3;
        this.f = this.f59382h0;
        this.f59379e0 = this.W;
        this.f59382h0 = navBarMessage;
        t(true);
        u(BitmapDescriptorFactory.HUE_RED);
    }

    public final AppCompatTextView l() {
        AppCompatTextView appCompatTextView = this.f0;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext(), null, R$attr.internal_textAppearanceEmphasis2);
            appCompatTextView.setVisibility(8);
            appCompatTextView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            appCompatTextView.setSingleLine();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 6.0f);
            gradientDrawable.setSize(iK, iK);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            appCompatTextView.setCompoundDrawablePadding(kli.a.k(context2, 10.0f));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            this.g0 = new InsetDrawable((Drawable) gradientDrawable, 0, kli.a.k(context3, 2.0f), 0, 0);
            Paint.FontMetricsInt fontMetricsInt = appCompatTextView.getPaint().getFontMetricsInt();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, fontMetricsInt.bottom - fontMetricsInt.top, 49);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int iK2 = kli.a.k(context4, 16.0f);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            layoutParams.topMargin = -kli.a.k(context5, 6.0f);
            layoutParams.leftMargin = iK2;
            layoutParams.rightMargin = iK2;
            addView(appCompatTextView, 0, layoutParams);
            this.f0 = appCompatTextView;
            int iC = rim.d.c(appCompatTextView.getTextSize());
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            this.f59374a0 = kli.a.k(context6, 16.0f) + iC;
            AppCompatTextView appCompatTextView2 = this.f0;
            if (appCompatTextView2 != null) {
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f59397y);
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                appCompatTextView2.setCompoundDrawableTintList(colorStateListValueOf);
                appCompatTextView2.setTextColor(colorStateListValueOf);
            }
        }
        return appCompatTextView;
    }

    public final void m() {
        int i = this.N + this.W;
        ViewGroup.LayoutParams layoutParams = this.f59383j.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            requestLayout();
        }
    }

    public final void n() {
        z2 z2Var;
        ArrayList arrayList = this.f59393s;
        if (arrayList == null || (z2Var = (z2) zhm.a0.I(arrayList)) == null) {
            return;
        }
        this.expandAnimatorTiming = z2Var.f275291a;
        this.expandedTintColor = z2Var.f275292b;
        this.expandedViewsBackgroundColor = z2Var.f275293c;
        this.expandedViewsBackgroundColorState = z2Var.d;
        this.middleBackgroundColor = z2Var.e;
        this.collapsedBackgroundColor = z2Var.f;
        this.contextualColorScheme = z2Var.f275294g;
        getBackgroundDrawingStrategy().b(this.contextualColorScheme);
        s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void o() {
        if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
            return;
        }
        boolean z = this.H;
        AvatarView avatarView = this.f59380g;
        if (z) {
            foh.i.e(avatarView, this.contextualColorScheme, this.expandedViewsBackgroundColor, this.middleBackgroundColor, this.collapsedBackgroundColor);
            return;
        }
        int i = this.v;
        int i2 = this.collapsedBackgroundColor;
        foh.i.e(avatarView, this.L, i, i2, i2);
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        a();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sxl.c cVar = sxl.e.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cVar.getClass();
        sxl.c.a(context).a(this);
        getBackgroundDrawingStrategy().onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f59384k0;
        if (e3Var != null) {
            e3Var.a(true);
        }
        getBackgroundDrawingStrategy().onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        a();
        AppCompatTextView appCompatTextView = this.f0;
        if (appCompatTextView != null) {
            appCompatTextView.offsetTopAndBottom((this.N + this.f59374a0) - appCompatTextView.getHeight());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.N + this.W;
        Rect rect = rr0.c.f256608a;
        UIKitFrameLayout uIKitFrameLayout = this.headerDisclaimerContainer;
        Intrinsics.checkNotNullParameter(uIKitFrameLayout, "<this>");
        if ((rr0.c.e(uIKitFrameLayout) ? uIKitFrameLayout : null) != null) {
            ViewGroup.LayoutParams layoutParams = uIKitFrameLayout.getLayoutParams();
            int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams2 = uIKitFrameLayout.getLayoutParams();
            int size = View.MeasureSpec.getSize(i) - (marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0));
            if (size > 0) {
                int mode = View.MeasureSpec.getMode(i);
                if (mode == 0) {
                    mode = Integer.MIN_VALUE;
                }
                uIKitFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = uIKitFrameLayout.getMeasuredHeight();
                TextView textView = this.headerDisclaimer;
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i5 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i = (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + i5;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.O + i + i3, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        a();
    }

    public final void p() {
        int iBlendARGB;
        if (this.J > BitmapDescriptorFactory.HUE_RED) {
            int i = this.middleBackgroundColor;
            iBlendARGB = ColorUtils.blendARGB(i, ColorUtils.setAlphaComponent(i, 0), this.J);
        } else {
            iBlendARGB = this.middleBackgroundColor;
        }
        getBackgroundDrawingStrategy().c(this.I, ColorUtils.blendARGB(iBlendARGB, this.collapsedBackgroundColor, 1 - this.C));
    }

    @Override // au0.h4
    public final void q() {
        Function0 function0 = this.p0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.expandAnimatorTiming = s0.f(i2) != colorScheme ? a3.COLLAPSE_EARLY : a3.DEFAULT;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.expandedTintColor = kli.a.s(colorScheme.a(), context);
        this.expandedViewsBackgroundColor = i;
        this.expandedViewsBackgroundColorState = b3.DEFAULT;
        this.middleBackgroundColor = i2;
        this.collapsedBackgroundColor = i3;
        if (this.f59395w != i2) {
            this.f59395w = i2;
            s3 s3Var = this.l0;
            if (s3Var != null) {
                s3Var.setColor(getGlowColor());
            }
        }
        boolean z = this.contextualColorScheme != colorScheme;
        this.contextualColorScheme = colorScheme;
        getBackgroundDrawingStrategy().b(colorScheme);
        s();
        if (z && this.H) {
            o();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void s() {
        int iE;
        int i;
        int iBlendARGB = ColorUtils.blendARGB(this.u, this.expandedTintColor, this.C);
        int iBlendARGB2 = ColorUtils.blendARGB(this.f59394t, this.expandedTintColor, this.C);
        this.f59397y = iBlendARGB;
        int i2 = g3.f275143a[this.expandedViewsBackgroundColorState.ordinal()];
        if (i2 == 1) {
            iE = this.expandedViewsBackgroundColor;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int[] iArr = io0.c.f163133a;
            iE = io0.c.e(((r2 >> 24) & 255) / 255.0f, this.expandedViewsBackgroundColor, this.middleBackgroundColor);
        }
        int i3 = (iE >> 24) & 255;
        int iE2 = this.v;
        if (i3 == 255 && (i = (iE2 >> 24) & 255) < 255) {
            int[] iArr2 = io0.c.f163133a;
            iE2 = io0.c.e(i / 255.0f, iE2, this.collapsedBackgroundColor);
        }
        int iBlendARGB3 = ColorUtils.blendARGB(iE2, iE, this.C);
        boolean zBooleanValue = ((Boolean) jo0.g.D.getValue()).booleanValue();
        com.revolut.core.ui_kit.internal.views.navbar.d dVar = this.f59375b;
        AvatarView avatarView = this.f59380g;
        SearchButton searchButton = this.f59386m;
        NavBarNavigationButtonView navBarNavigationButtonView = this.o;
        if (zBooleanValue) {
            v1 v1Var = this.H ? this.contextualColorScheme : this.L;
            getBackgroundDrawingStrategy().b(v1Var);
            foh.i.e(searchButton, v1Var, iBlendARGB, this.middleBackgroundColor, iBlendARGB3);
            foh.i.e(navBarNavigationButtonView, v1Var, iBlendARGB, this.middleBackgroundColor, iBlendARGB3);
            foh.i.e(avatarView, v1Var, iBlendARGB, this.middleBackgroundColor, iBlendARGB3);
            dVar.r(v1Var, iBlendARGB, this.middleBackgroundColor, iBlendARGB3);
        }
        if (this.menuItemsBackgroundType == 0) {
            dVar.f(iBlendARGB, iBlendARGB3);
            if (!((Boolean) jo0.g.D.getValue()).booleanValue()) {
                navBarNavigationButtonView.setBackgroundColor(iBlendARGB3);
            }
        }
        searchButton.setColors$ui_kit_components_release(iBlendARGB2, iBlendARGB3);
        TextView textView = this.i;
        textView.setTextColor(iBlendARGB);
        TextView textView2 = this.titleChainedView;
        textView2.setTextColor(iBlendARGB);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iBlendARGB4 = ColorUtils.blendARGB(kli.a.s(R$attr.uikit_colorGreyTone50, context), iBlendARGB, this.C);
        TextView textView3 = this.subtitleChainedView;
        textView3.setTextColor(iBlendARGB4);
        if (this.D) {
            float f = this.H ? 1.0f - this.C : 1.0f;
            textView.setAlpha(f);
            textView2.setAlpha(f);
            textView3.setAlpha(f);
        } else {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            textView3.setAlpha(1.0f);
        }
        if (!((Boolean) jo0.g.D.getValue()).booleanValue()) {
            navBarNavigationButtonView.setDrawableTint(iBlendARGB);
        }
        w();
        AppCompatTextView appCompatTextView = this.f0;
        if (appCompatTextView != null) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f59397y);
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
            appCompatTextView.setCompoundDrawableTintList(colorStateListValueOf);
            appCompatTextView.setTextColor(colorStateListValueOf);
        }
        p();
        if (!((Boolean) jo0.g.A.getValue()).booleanValue() || ((Boolean) jo0.g.D.getValue()).booleanValue()) {
            return;
        }
        avatarView.D0(iBlendARGB3, iBlendARGB2);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
        this.f59386m.setAnalyticsContext(parcelable);
    }

    public final void setAnimationCallback$ui_kit_components_release(y2 y2Var) {
        this.animationCallback = y2Var;
    }

    public final void setAvatar(tx0.t2 avatar) {
        AvatarModel.Default r62;
        this.o.setVisibility(8);
        int i = avatar != null ? 0 : 8;
        AvatarView avatarView = this.f59380g;
        avatarView.setVisibility(i);
        this.f59381h.setVisibility(avatar != null && avatar.f275247b ? 0 : 8);
        if (avatar == null || (r62 = avatar.f275246a) == null) {
            return;
        }
        avatarView.setModel(r62);
    }

    public final void setExpandRatio(float expandRatio) {
        this.I = expandRatio;
        this.J = (expandRatio - 0.8f) / 0.19999999f;
        int i = g3.f275143a[this.expandedViewsBackgroundColorState.ordinal()];
        float f = BitmapDescriptorFactory.HUE_RED;
        if (i == 1) {
            if (this.J < BitmapDescriptorFactory.HUE_RED) {
                this.expandedViewsBackgroundColorState = b3.OPAQUE;
                s();
            }
            p();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.J >= BitmapDescriptorFactory.HUE_RED) {
                this.expandedViewsBackgroundColorState = b3.DEFAULT;
                s();
            }
            p();
        }
        a();
        boolean z = expandRatio > this.expandRatioToChangeAppearance;
        if (z == this.H) {
            return;
        }
        this.H = z;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f4 = this.C;
        if (this.H) {
            f = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f);
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 8));
        valueAnimatorOfFloat.setDuration(150L);
        this.F = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        o();
    }

    public final void setExpandRatioToChangeAppearance(float f) {
        this.expandRatioToChangeAppearance = f;
    }

    public final void setHasDockedBottomView$ui_kit_components_release(boolean hasDockedBottomView) {
        if (this.e == hasDockedBottomView) {
            return;
        }
        this.e = hasDockedBottomView;
        getBackgroundDrawingStrategy().d(hasDockedBottomView);
    }

    public final void setHeaderDisclaimer(Clause headerDisclaimerClause) {
        UIKitFrameLayout uIKitFrameLayout = this.headerDisclaimerContainer;
        TextView textView = this.headerDisclaimer;
        if (headerDisclaimerClause == null) {
            textView.setVisibility(8);
            uIKitFrameLayout.setVisibility(8);
        } else {
            textView.setVisibility(0);
            uIKitFrameLayout.setVisibility(0);
            textView.setMovementMethod(c0.f169220a);
            ty0.c.b(or0.u.k(this).b0(), headerDisclaimerClause, this.headerDisclaimer, new twg.a(this, headerDisclaimerClause, 6), null, 8);
            CharSequence text = textView.getText();
            if (text instanceof Spannable) {
                ArrayList arrayList = this.T;
                arrayList.clear();
                Spannable spannable = (Spannable) text;
                Object[] spans = spannable.getSpans(0, spannable.length(), ix0.b0.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                zhm.a0.z(arrayList, spans);
            }
            w();
        }
        post(new t70.x(this, 11));
    }

    @yhm.d
    public final void setHideTitleWhenExpanded(boolean hideTitleWhenExpanded) {
        this.D = hideTitleWhenExpanded;
        s();
    }

    public final void setInteractiveMessage$ui_kit_components_release(NavBarMessage message) {
        if (Intrinsics.f(message, this.i0)) {
            return;
        }
        this.i0 = message;
        if (this.c0 == 2) {
            t(false);
        }
    }

    public final void setInteractiveMessageMode$ui_kit_components_release(boolean enabled, c3 callback) {
        this.f59378d0 = callback;
        int i = this.c0;
        if (enabled == (i != 0)) {
            if (i != 2 || callback == null) {
                return;
            }
            ((dy0.h) callback).g();
            return;
        }
        if (!enabled) {
            this.c0 = 0;
            t(true);
            return;
        }
        this.c0 = 1;
        if (this.messageAnimRunning) {
            return;
        }
        this.c0 = 2;
        if (callback != null) {
            ((dy0.h) callback).g();
        }
        t(false);
    }

    public final void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f59375b.setMenuItems(menuItems);
        this.f59387n.setVisibility(menuItems.isEmpty() ? 8 : 0);
    }

    public final void setMenuItemsBackgroundType$ui_kit_components_release(int i) {
        this.menuItemsBackgroundType = i;
    }

    public final void setMessageCurrentInset$ui_kit_components_release(int inset) {
        if (this.W != inset) {
            this.W = inset;
            m();
            y2 y2Var = this.animationCallback;
            if (y2Var != null) {
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) y2Var;
                FrameLayout frameLayout = navBarWithContainer.f59363n;
                navBarWithContainer.setClipChildren(inset == 0);
                navBarWithContainer.I = inset;
                navBarWithContainer.N();
                frameLayout.setClipChildren(inset == 0);
                or0.u.z(frameLayout, 0, inset, 0, 0, false, 29);
                KeyEvent.Callback callback = navBarWithContainer.F;
                x2 x2Var = callback instanceof x2 ? (x2) callback : null;
                if (x2Var != null) {
                    x2Var.setBackgroundOffset(-inset);
                }
            }
        }
    }

    @Override // au0.v2
    public void setNavbarPositionChangedCallback(Function0<Unit> callback) {
        this.p0 = callback;
    }

    public final void setNavigationButtonImage(Image image) {
        this.f59380g.setVisibility(8);
        this.f59381h.setVisibility(8);
        NavBarNavigationButtonView navBarNavigationButtonView = this.o;
        navBarNavigationButtonView.setVisibility(0);
        yy0.f.e(or0.u.k(this).Q(), image, this.o, null, null, 12);
        navBarNavigationButtonView.setContentDescription(navBarNavigationButtonView.getContext().getString(R$string.uikit_navigate_up_description));
    }

    public final void setPersistentMessage(NavBarMessage message) {
        if (this.c0 == 3) {
            this.f = message;
            return;
        }
        if (Intrinsics.f(message, this.f59382h0)) {
            return;
        }
        this.f59382h0 = message;
        int i = this.c0;
        if (i == 0 || i == 3) {
            t(false);
        }
    }

    public final void setSearchButtonActions(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f59386m.setActionButtons(buttons);
    }

    public final void setSearchButtonText(Clause text) {
        this.i.setVisibility(8);
        SearchButton searchButton = this.f59386m;
        searchButton.setVisibility(0);
        searchButton.setText(text);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setTagView(f3 model) {
        int i = model != null ? 0 : 8;
        TagView tagView = this.tagView;
        tagView.setVisibility(i);
        if (model != null) {
            tagView.setContent(new TagViewData(new ResourceImage(model.f275122a.intValue(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), model.f275123b, R$attr.uikit_colorBlack_30, null, R$attr.uikit_colorTransparent, null, 1000));
        }
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f59386m.setVisibility(8);
        this.i.setVisibility(0);
        this.titleChainedView.setVisibility(8);
        this.subtitleChainedView.setVisibility(8);
        ty0.c.b(or0.u.k(this).b0(), title, this.i, null, null, 12);
    }

    @yhm.d
    public final void setTitleWithSubtitle(@NotNull Clause title, Clause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f59386m.setVisibility(8);
        this.i.setVisibility(8);
        this.titleChainedView.setVisibility(0);
        ty0.c.b(or0.u.k(this).b0(), title, this.titleChainedView, null, null, 12);
        TextView textView = this.subtitleChainedView;
        if (subtitle == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            ty0.c.b(or0.u.k(this).b0(), subtitle, this.subtitleChainedView, null, null, 12);
        }
    }

    public final void t(boolean z) {
        NavBarWithContainerHeaderView navBarWithContainerHeaderView;
        AppCompatTextView appCompatTextView;
        NavBarMessage navBarMessage = this.c0 == 2 ? this.i0 : this.f59382h0;
        if (!(navBarMessage == null && this.f0 == null) && (z || !Intrinsics.f(navBarMessage, this.j0))) {
            this.j0 = navBarMessage;
            AppCompatTextView appCompatTextViewL = l();
            if (navBarMessage != null) {
                ty0.c.b(or0.u.k(this).b0(), navBarMessage.f58115b, appCompatTextViewL, null, null, 12);
                appCompatTextView = appCompatTextViewL;
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(navBarMessage.f58116c ? this.g0 : null, (Drawable) null, (Drawable) null, (Drawable) null);
                Clause clause = navBarMessage.f58115b;
                py0.c cVar = clause != null ? new py0.c(clause) : null;
                or0.m.a(appCompatTextView);
                navBarWithContainerHeaderView = this;
                appCompatTextView.setOnClickListener(new r3(navBarMessage, cVar, navBarWithContainerHeaderView, navBarMessage, 4));
            } else {
                navBarWithContainerHeaderView = this;
                appCompatTextView = appCompatTextViewL;
                or0.u.o(appCompatTextView);
            }
            int i = navBarWithContainerHeaderView.c0;
            if (i != 2 && i != 3) {
                new e3(this, appCompatTextView, navBarMessage != null ? 0 : 8, navBarMessage != null ? navBarMessage.d : false).a(false);
            } else if (navBarMessage != null) {
                appCompatTextView.setVisibility(0);
            }
        }
    }

    public final void u(float f) {
        if (this.c0 != 3) {
            return;
        }
        int i = this.f59374a0;
        setMessageCurrentInset$ui_kit_components_release((int) (((i - r1) * f) + this.f59379e0));
        AppCompatTextView appCompatTextView = this.f0;
        if (appCompatTextView != null) {
            appCompatTextView.setAlpha(f);
            appCompatTextView.setTranslationY(((1.0f - f) * this.f59374a0) / 2.0f);
        }
    }

    public final void w() {
        int i = this.f59397y;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ix0.b0) arrayList.get(i2)).k = i;
        }
        this.headerDisclaimer.setTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarWithContainerHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarWithContainerHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundDrawingStrategy = yhm.j.b(new tml.a(this, context, 24));
        int iS = kli.a.s(R$attr.uikit_colorBackground, context);
        View.inflate(context, R$layout.internal_view_nav_bar_with_container_header, this);
        setBackgroundColor(iS);
        View viewFindViewById = findViewById(R$id.navBarWithContainerHeader_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById;
        this.f59380g = avatarView;
        View viewFindViewById2 = findViewById(R$id.navBarWithContainerHeader_avatarBadgeDot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f59381h = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.navBarWithContainerHeader_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.navBarWithContainerHeader_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f59383j = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.navBarWithContainerHeader_titleChained);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.titleChainedView = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.navBarWithContainerHeader_subtitleChained);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.subtitleChainedView = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.navBarWithContainerHeader_searchButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f59386m = (SearchButton) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.navBarWithContainerHeader_menuRecycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById8;
        this.f59387n = recyclerView;
        View viewFindViewById9 = findViewById(R$id.navBarWithContainerHeader_navigationButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        NavBarNavigationButtonView navBarNavigationButtonView = (NavBarNavigationButtonView) viewFindViewById9;
        this.o = navBarNavigationButtonView;
        View viewFindViewById10 = findViewById(R$id.navBarWithContainerHeader_headerDisclaimer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.headerDisclaimer = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.navBarWithContainerHeader_headerDisclaimerWrapper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        UIKitFrameLayout uIKitFrameLayout = (UIKitFrameLayout) viewFindViewById11;
        this.headerDisclaimerContainer = uIKitFrameLayout;
        View viewFindViewById12 = findViewById(R$id.navBarWithContainerHeader_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.tagView = (TagView) viewFindViewById12;
        int iS2 = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.f59394t = iS2;
        int iS3 = kli.a.s(R$attr.uikit_colorForeground, context);
        this.u = iS3;
        int iS4 = kli.a.s(R$attr.uikit_colorGreyTone8, context);
        this.v = iS4;
        this.collapsedBackgroundColor = kli.a.s(R$attr.uikit_colorBackground, context);
        this.f59397y = iS3;
        this.expandedTintColor = iS2;
        this.expandedViewsBackgroundColor = iS4;
        this.expandedViewsBackgroundColorState = b3.DEFAULT;
        this.C = 1.0f;
        this.expandAnimatorTiming = a3.DEFAULT;
        this.H = true;
        this.I = 1.0f;
        this.J = 1.0f;
        v1.Companion.getClass();
        v1 v1VarA = t1.a(context);
        this.L = v1VarA;
        this.contextualColorScheme = v1VarA;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_toolbar_height);
        this.O = dimensionPixelSize;
        this.P = v0.a.d("create(...)");
        this.Q = v0.a.d("create(...)");
        this.R = v0.a.d("create(...)");
        this.S = v0.a.d("create(...)");
        this.T = new ArrayList();
        this.U = v0.a.d("create(...)");
        this.V = v0.a.d("create(...)");
        this.menuItemsBackgroundType = 1;
        setFitsSystemWindows(true);
        this.f59375b = new com.revolut.core.ui_kit.internal.views.navbar.d(recyclerView);
        t2 listener = getBackgroundDrawingStrategy();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.d = arrayList;
        }
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
        setMinimumHeight(dimensionPixelSize);
        ViewCompat.setOnApplyWindowInsetsListener(this, new o1(this, 8));
        avatarView.setupAvatarViewForNewNavbarDesign(context, i1.SIZE_36_36);
        or0.m.a(avatarView);
        avatarView.setOnClickListener(new h3(this, this, 0));
        avatarView.setOnLongClickListener(new f0(this, 4));
        fp0.p clickHandler = navBarNavigationButtonView.getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new h3(this, this, 1));
        uIKitFrameLayout.setReadableAreaGuidelinesEnabled(true);
    }

    public /* synthetic */ NavBarWithContainerHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
