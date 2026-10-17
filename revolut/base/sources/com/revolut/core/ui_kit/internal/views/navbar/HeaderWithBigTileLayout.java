package com.revolut.core.ui_kit.internal.views.navbar;

import a41.g0;
import ag.q;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import au0.a1;
import au0.b1;
import au0.c1;
import au0.d1;
import au0.e1;
import au0.f1;
import au0.g1;
import au0.h1;
import au0.j1;
import au0.k1;
import au0.l1;
import au0.m0;
import au0.m1;
import au0.n0;
import au0.o0;
import au0.o1;
import au0.p0;
import au0.q0;
import au0.r0;
import au0.r1;
import au0.s0;
import au0.s1;
import au0.t0;
import au0.t1;
import au0.u0;
import au0.v0;
import au0.w0;
import au0.x0;
import au0.y0;
import au0.z0;
import aw0.e4;
import aw0.f0;
import aw0.h0;
import aw0.i0;
import aw0.i3;
import aw0.k9;
import aw0.o9;
import aw0.v1;
import aw0.x8;
import bp0.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.BackgroundGradientDrawable;
import com.revolut.core.ui_kit.internal.views.ActionStatusView;
import com.revolut.core.ui_kit.internal.views.DuoAvatarView;
import com.revolut.core.ui_kit.internal.views.LazyInflatableCachedView;
import com.revolut.core.ui_kit.internal.views.LinePageIndicator;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.RatingBar;
import com.revolut.core.ui_kit.internal.views.SocialProofView;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import efm.r;
import fp0.p;
import ix0.c0;
import ix0.d2;
import ix0.f2;
import java.util.ArrayList;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lw0.n;
import ms0.l3;
import ms0.s4;
import mx0.i1;
import mx0.t;
import ny0.i;
import or0.m;
import or0.u;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import tx0.d5;
import tx0.o2;
import tx0.p2;
import tx0.q2;
import yp0.j0;
import z4l.j;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0012¦\u0001§\u0001¨\u0001©\u0001ª\u0001\u0085\u0001«\u0001¬\u0001\u00ad\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b/\u00100J%\u00103\u001a\u00020\u000f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020#0\u00122\u0006\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u001fH\u0016¢\u0006\u0004\b6\u0010\"J\u0019\u00109\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010>H\u0017¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ'\u0010I\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020>2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020>H\u0017¢\u0006\u0004\bI\u0010JJ\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\b@\u0010MJ\u0019\u0010P\u001a\u00020\u000f2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bR\u0010AJ\u0019\u0010R\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bR\u0010UJ\u001d\u0010X\u001a\u00020\u000f2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0012H\u0016¢\u0006\u0004\bX\u0010YJ#\u0010\\\u001a\u00020\u000f2\b\b\u0001\u0010Z\u001a\u00020\t2\b\b\u0001\u0010[\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\tH\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u001fH\u0016¢\u0006\u0004\bb\u0010\"J#\u0010c\u001a\u00020\u000f2\b\b\u0001\u0010Z\u001a\u00020\t2\b\b\u0001\u0010[\u001a\u00020\tH\u0016¢\u0006\u0004\bc\u0010]J\u0019\u0010f\u001a\u00020\u000f2\b\u0010e\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bf\u0010gJ\u0019\u0010j\u001a\u00020\u000f2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ\u0015\u0010q\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u001f¢\u0006\u0004\bq\u0010\"J\u0017\u0010v\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020rH\u0000¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\bw\u0010AJ\u0015\u0010z\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020x¢\u0006\u0004\bz\u0010{J\u0015\u0010~\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020|¢\u0006\u0004\b~\u0010\u007fJ\u0017\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0005\b\u0080\u0001\u0010\"J\u001a\u0010\u0083\u0001\u001a\u00020\u000f2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001e\u0010\u0089\u0001\u001a\u00020\u000f2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J$\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008a\u0001\u001a\u00020\t2\u0007\u0010\u008b\u0001\u001a\u00020rH\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u000f2\u0007\u0010\u008f\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0090\u0001\u0010`J\u001f\u0010\u0092\u0001\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0005\b\u0092\u0001\u0010YJ\u001a\u0010\u0094\u0001\u001a\u00020\u000f2\u0007\u0010\u0093\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0094\u0001\u0010`J\u001b\u0010\u0095\u0001\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0005\b\u0095\u0001\u0010AJ\u001c\u0010\u0098\u0001\u001a\u00020\u000f2\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009b\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020KH\u0002¢\u0006\u0005\b\u009b\u0001\u0010MJ\u001e\u0010\u009e\u0001\u001a\u00020\u000f2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010 \u0001\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010SH\u0002¢\u0006\u0005\b \u0001\u0010UR\u001a\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006®\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/HeaderWithBigTileLayout;", "Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "Lau0/c1;", "Lur0/a;", "Lix0/d2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau0/s0;", "layoutType", "", "setLayoutType", "(Lau0/s0;)V", "", "Lau0/u0;", "pages", "Lau0/f2;", "previewMode", "Lau0/v0;", "pageAutoScroll", "setPages", "(Ljava/util/List;Lau0/f2;Lau0/v0;)V", "Lau0/m0;", "decoration", "setBackgroundOverlayDecoration", "(Lau0/m0;)V", "", "enabled", "setThemeBasedColorSchemeEnabled", "(Z)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Lau0/r0;", "style", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lau0/r0;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "model", "setAvatar", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;Lau0/r0;)V", "Lau0/q0;", "avatar", "setDuoAvatar", "(Lau0/q0;Lau0/r0;)V", "avatars", "showOverflowCounter", "setAvatarGroup", "(Ljava/util/List;Z)V", "isClickable", "setIconClickable", "Lms0/s4;", "content", "setSocialProofLabel", "(Lms0/s4;)V", "Law0/k;", "setActionStatusLabel", "(Law0/k;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lau0/b1;", "setTitleStyle", "(Lau0/b1;)V", "firstText", "Lcom/revolut/core/ui_kit/models/ImageClause;", "icon", "secondText", "setCompoundTitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/ImageClause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lau0/a1;", "title", "(Lau0/a1;)V", "Law0/i3;", "customFont", "setCustomFont", "(Law0/i3;)V", "setDescription", "Lau0/p0;", "description", "(Lau0/p0;)V", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "(Ljava/util/List;)V", "baseColor", "progressColor", "setLinePageIndicatorColors", "(II)V", "percentage", "setLineProgressIndicatorPercentage", "(I)V", "visible", "setLineProgressIndicatorVisible", "setLineProgressIndicatorColors", "", "stars", "setRatingStars", "(Ljava/lang/Double;)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "tagViewData", "setTagViewData", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "Ltx0/q2;", "heightMode", "setHeightMode", "(Ltx0/q2;)V", "active", "setSearchButtonActive", "", "ratio", "setSearchButtonExpandRatio$ui_kit_components_release", "(F)V", "setSearchButtonExpandRatio", "setSearchButtonText", "Law0/k9;", "buttons", "setSearchButtonActionButtons", "(Law0/k9;)V", "Law0/e4;", "state", "setSearchButtonFilterState", "(Law0/e4;)V", "setSearchButtonSortingEnabled", "Llw0/n;", "mode", "setSearchButtonMode", "(Llw0/n;)V", "Lau0/f1;", "listener", "setColorSchemeListener$ui_kit_components_release", "(Lau0/f1;)V", "setColorSchemeListener", "offset", "expandRatio", "setParentScrollOffset$ui_kit_components_release", "(IF)V", "setParentScrollOffset", "topInset", "setTopInset$ui_kit_components_release", "setTopInset", "setPagesInternal", "color", "setBackgroundGradientOverlayWithColor", "setTitleInternal", "Lau0/t0;", "kind", "setImageTitleInternal", "(Lau0/t0;)V", "navBarTitle", "setTitleClickMode", "Lau0/w0;", "subtitle", "setSubtitle", "(Lau0/w0;)V", "setDescriptionInternal", "Lj70/a;", "getDevicePerformance", "()Lj70/a;", "devicePerformance", "Companion", "au0/k1", "NavBarBackgroundDelegate", "au0/g1", "au0/j1", "au0/h1", "ag/q", "au0/i1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeaderWithBigTileLayout extends UIKitConstraintLayout implements c1, ur0.a, d2 {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f57263w0 = 0;
    public p0 A;
    public q2 B;
    public s0 C;
    public DuoAvatarView D;
    public OverlappedIconsView E;
    public final ViewPager2 F;
    public final UIKitFrameLayout G;
    public final TagView H;
    public final AvatarView I;
    public final ViewGroup J;
    public final ImageView K;
    public m0 L;
    public m1 M;
    public final SocialProofView N;
    public final LazyInflatableCachedView O;
    public final LazyInflatableCachedView P;
    public final ActionStatusView Q;
    public final VersatileTitleView R;
    public final TextView S;
    public final ImageView T;
    public final TextView U;
    public final ImageView V;
    public final RatingBar W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsView f57264a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SearchButton f57265b0;
    public final Guideline c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Guideline f57266d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final TagView f57267e0;
    public final LinePageIndicator f0;
    public final HorizontalStepsProgressView g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57268h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressPagingIndicatorView f57269h0;
    public final NavBarBackgroundDelegate i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f2 f57270j;
    public final int j0;
    public final j k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public u0 f57271k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f57272l;
    public boolean l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f57273m;
    public q m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f57274n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f57275n0;
    public final ihm.f o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f57276o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f57277p;
    public boolean p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f57278q;
    public x8 q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f57279r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public f1 f57280r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f57281s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public k1 f57282s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f57283t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public x8 f57284t0;
    public final p u;
    public r0 u0;
    public v0 v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a2 f57285v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public au0.f2 f57286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f57287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Clause f57288y;
    public b1 z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/HeaderWithBigTileLayout$NavBarBackgroundDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lau0/g1;", "Lau0/h1;", "Lcom/revolut/core/ui_kit/internal/views/navbar/HeaderWithBigTileLayout;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class NavBarBackgroundDelegate extends BaseRecyclerViewDelegate<g1, h1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f57289c;

        public NavBarBackgroundDelegate() {
            super(0, new aqd.h1(12));
            this.f57289c = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HeaderWithBigTileLayout headerWithBigTileLayout = HeaderWithBigTileLayout.this;
            WallpaperView wallpaperView = new WallpaperView(context, null, null, !headerWithBigTileLayout.f57268h, 30);
            wallpaperView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            wallpaperView.setOnClickListener(new View.OnClickListener() { // from class: com.revolut.core.ui_kit.internal.views.navbar.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f57395a.f57289c.onNext(Unit.f186387a);
                }
            });
            return new h1(headerWithBigTileLayout, wallpaperView);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: k */
        public final void n(RecyclerView.ViewHolder viewHolder) {
            h1 holder = (h1) viewHolder;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(holder, "holder");
            WallpaperView wallpaperView = holder.f;
            HeaderWithBigTileLayout headerWithBigTileLayout = holder.f9218h;
            wallpaperView.d(headerWithBigTileLayout.f57276o0, headerWithBigTileLayout.f57275n0);
            headerWithBigTileLayout.l0();
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void n(koi.b bVar) {
            h1 holder = (h1) bVar;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(holder, "holder");
            WallpaperView wallpaperView = holder.f;
            HeaderWithBigTileLayout headerWithBigTileLayout = holder.f9218h;
            wallpaperView.d(headerWithBigTileLayout.f57276o0, headerWithBigTileLayout.f57275n0);
            headerWithBigTileLayout.l0();
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(h1 holder, g1 data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            boolean zN = ue0.e.n(payloads);
            int size = payloads.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = payloads.get(i2);
                if (obj2 instanceof j1) {
                    zN = ((j1) obj2).f9240a;
                }
            }
            if (zN) {
                holder.f.setBackground(data.f9208b, null);
            }
        }
    }

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderWithBigTileLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final j70.a getDevicePerformance() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return wr0.a.a(context);
    }

    public static final void h0(float f, float f4, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.horizontalBias = f;
        layoutParams2.verticalBias = f4;
        view.setLayoutParams(layoutParams2);
    }

    private final void setBackgroundGradientOverlayWithColor(int color) {
        if (this.L == m0.BOTTOM_BLUR) {
            return;
        }
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.F.setForeground(new GradientDrawable(orientation, new int[]{kli.a.s(R$attr.uikit_colorTransparent, context), color}));
    }

    private final void setDescriptionInternal(p0 description) {
        boolean z;
        int i;
        TextView textView = this.U;
        if (description == null) {
            ty0.c.b(u.k(textView).b0(), null, this.U, null, null, 12);
            textView.setVisibility(8);
            pd.b.h(textView, false);
            return;
        }
        boolean z3 = description instanceof o0;
        ImageView imageView = this.V;
        ImageView imageView2 = this.T;
        if (z3) {
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
            i = R$attr.internal_textAppearanceBody2;
            z = false;
        } else {
            if (!(description instanceof n0)) {
                throw new NoWhenBranchMatchedException();
            }
            z = ((n0) description).f9279b;
            imageView2.setVisibility(0);
            imageView2.setImageResource(R$drawable.uikit_icn_24_rev_points_mono);
            imageView.setVisibility(z ? 0 : 8);
            if (z) {
                imageView.setImageResource(R$drawable.uikit_icn_24_chevron_right);
            }
            i = R$attr.internal_textAppearanceHeading3;
        }
        l.e(textView, i);
        ty0.c.b(u.k(textView).b0(), description.a(), this.U, new a08.e(1, this.f57278q, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 27), null, 8);
        textView.setMovementMethod(((y) u.k(textView).b0()).g(description.a()) ? c0.f169220a : null);
        textView.setVisibility(0);
        if (z) {
            TrackableItem.INSTANCE.getClass();
            u.s(textView, TrackableItem.Companion.a(this, null), new py0.c(description.a()), new j01.c(new View[]{imageView2, textView, imageView}, Unit.f186387a, this.f57277p, null, 24));
        } else {
            u.o(textView);
        }
        pd.b.h(textView, z);
    }

    private final void setImageTitleInternal(t0 kind) {
        f fVar = new f(kind.b(), kind.c(), kind.a());
        VersatileTitleView versatileTitleView = this.R;
        versatileTitleView.setLayoutType(fVar);
        versatileTitleView.setVisibility(0);
    }

    private final void setPagesInternal(List<u0> pages) {
        List<u0> list = pages;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new g1(String.valueOf(i), this.u0 == r0.BLURRED_BACKGROUND ? NavBarWithContainerBackground.TransparentBackground.f57882a : ((u0) obj2).f9378a));
            i = i2;
        }
        this.k.c(arrayList);
        n0((u0) d0.e0(this.F.getCurrentItem(), pages));
    }

    private final void setSubtitle(w0 subtitle) {
        kli.a.b(this.S, subtitle != null ? subtitle.f9412a : null, ty0.f.f275450a);
    }

    private final void setTitleClickMode(a1 navBarTitle) {
        py0.d cVar;
        if (navBarTitle instanceof x0) {
            x0 x0Var = (x0) navBarTitle;
            cVar = new py0.c(yoj.b.w(x0Var.f9419a, x0Var.f9421c));
        } else if (navBarTitle instanceof y0) {
            cVar = new py0.b(t0.a.f9366b);
        } else {
            if (!(navBarTitle instanceof z0)) {
                throw new NoWhenBranchMatchedException();
            }
            Clause clause = ((z0) navBarTitle).f9448a;
            cVar = clause != null ? new py0.c(clause) : null;
        }
        TrackableItem.INSTANCE.getClass();
        CustomTrackableComponent customTrackableComponentA = TrackableItem.Companion.a(this, null);
        boolean zA = navBarTitle.a();
        p pVar = this.f57283t;
        p.b(pVar, zA);
        View view = pVar.f137029a;
        m.a(view);
        if (zA) {
            view.setOnClickListener(new s1(customTrackableComponentA, cVar, this, 1));
        } else {
            u.o(view);
        }
        pd.b.h(this.R, navBarTitle.a());
    }

    private final void setTitleInternal(Clause clause) {
        VersatileTitleView versatileTitleView = this.R;
        if (clause == null) {
            versatileTitleView.setVisibility(8);
        } else {
            versatileTitleView.setLayoutType(new h(clause, this.z == b1.LARGE_SINGLE_LINE));
            versatileTitleView.setVisibility(0);
        }
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        j0();
        o0();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void f0() {
        int iB;
        q2 q2Var = this.B;
        boolean z = q2Var instanceof o2;
        AvatarView avatarView = this.I;
        UIKitFrameLayout uIKitFrameLayout = this.G;
        if (!z) {
            if (!(q2Var instanceof p2)) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.connect(avatarView.getId(), 3, this.c0.getId(), 3);
            constraintSet.connect(uIKitFrameLayout.getId(), 4, 0, 4);
            constraintSet.setDimensionRatio(uIKitFrameLayout.getId(), null);
            constraintSet.applyTo(this);
            ViewGroup.LayoutParams layoutParams = uIKitFrameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = 0;
            uIKitFrameLayout.setLayoutParams(layoutParams);
            uIKitFrameLayout.setAspectRatio(null);
            return;
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(this);
        constraintSet2.clear(uIKitFrameLayout.getId(), 4);
        constraintSet2.connect(avatarView.getId(), 3, 0, 3);
        if (!((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
            int id10 = uIKitFrameLayout.getId();
            aw0.d0 d0Var = ((o2) q2Var).f275217a;
            constraintSet2.setDimensionRatio(id10, a0.d.g(d0Var.f10274a, d0Var.f10275b, "H,", ":"));
        }
        constraintSet2.applyTo(this);
        if (((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
            Context context = uIKitFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (i.d(context)) {
                Context context2 = uIKitFrameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iB = kli.a.k(context2, 380.0f);
            } else {
                Context context3 = uIKitFrameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                iB = d5.b(context3);
            }
            uIKitFrameLayout.setAspectRatio(new nt0.c(((o2) q2Var).f275217a, ut0.a.ADJUST_HEIGHT, iB));
            ViewGroup.LayoutParams layoutParams2 = uIKitFrameLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            uIKitFrameLayout.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g0() {
        mx0.l lVar;
        float f;
        float f4;
        i1 i1Var;
        boolean z;
        int iK;
        int iK2;
        int i;
        float f5;
        int i2 = l1.f9257a[this.C.ordinal()];
        if (i2 != 1) {
            i = 17;
            f4 = 0.5f;
            if (i2 == 2) {
                lVar = mx0.l.HEADER_CIRCLE_ACTIONS;
                i1 i1Var2 = i1.SIZE_72_72;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK3 = kli.a.k(context, 24.0f);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iK2 = kli.a.k(context2, 24.0f);
                f5 = 0.5f;
                f4 = 1.0f;
                i1Var = i1Var2;
                z = true;
                iK = iK3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    lVar = mx0.l.HEADER_CIRCLE_ACTIONS;
                    i1Var = i1.SIZE_72_72;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    int iK4 = kli.a.k(context3, 18.0f);
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    iK2 = kli.a.k(context4, 24.0f);
                    z = true;
                    iK = iK4;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar = mx0.l.SCROLLABLE_CENTERED;
                    i1Var = i1.SIZE_72_72;
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    iK = kli.a.k(context5, 18.0f);
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    iK2 = kli.a.k(context6, 24.0f);
                    z = false;
                }
                f = 0.5f;
            } else {
                lVar = mx0.l.SCROLLABLE_CENTERED;
                i1 i1Var3 = i1.SIZE_72_72;
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                int iK5 = kli.a.k(context7, 24.0f);
                Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                f5 = 0.5f;
                f4 = 1.0f;
                i1Var = i1Var3;
                z = true;
                iK = iK5;
                iK2 = kli.a.k(context8, 12.0f);
            }
            f = f5;
        } else {
            lVar = mx0.l.SCROLLABLE;
            i1 i1Var4 = i1.SIZE_56_56;
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            int iK6 = kli.a.k(context9, 24.0f);
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            int iK7 = kli.a.k(context10, 16.0f);
            f = BitmapDescriptorFactory.HUE_RED;
            f4 = 1.0f;
            i1Var = i1Var4;
            z = true;
            iK = iK6;
            iK2 = iK7;
            i = 8388611;
        }
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        int iK8 = kli.a.k(context11, i1Var.b());
        AvatarView avatarView = this.I;
        h0(f, f4, avatarView);
        VersatileTitleView versatileTitleView = this.R;
        h0(f, f4, versatileTitleView);
        TextView textView = this.S;
        h0(f, f4, textView);
        TextView textView2 = this.U;
        h0(f, f4, textView2);
        h0(f, f4, this.O);
        h0(f, f4, this.P);
        h0(f, f4, this.H);
        h0(f, f4, this.N);
        h0(f, f4, this.Q);
        h0(f, f4, this.W);
        versatileTitleView.setGravity(i);
        textView.setGravity(i);
        textView2.setGravity(i);
        ImageView imageView = this.T;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.horizontalBias = f;
        imageView.setLayoutParams(layoutParams2);
        ImageView imageView2 = this.V;
        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.horizontalBias = f;
        imageView2.setLayoutParams(layoutParams4);
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
        ImageView imageView3 = this.K;
        ViewGroup.LayoutParams layoutParams5 = imageView3.getLayoutParams();
        layoutParams5.height = iK8;
        layoutParams5.width = iK8;
        float f6 = getResources().getDisplayMetrics().widthPixels / iK8;
        imageView3.setScaleX(f6);
        imageView3.setScaleY(f6);
        this.f57266d0.setGuidelineEnd(iK);
        ActionsView actionsView = this.f57264a0;
        actionsView.setLayoutType(lVar);
        actionsView.setBrightDark(z);
        ViewGroup.LayoutParams layoutParams6 = actionsView.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) layoutParams6;
        ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = iK2;
        layoutParams7.goneTopMargin = iK2;
        actionsView.setLayoutParams(layoutParams7);
        setBackgroundOverlayDecoration(m0.NONE);
    }

    public final boolean i0() {
        j70.d dVarA;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        j70.a devicePerformance = getDevicePerformance();
        if (devicePerformance == null || (dVarA = ((j70.c) devicePerformance).a()) == null) {
            dVarA = j70.d.UNDEFINED;
        }
        return dVarA.compareTo(j70.d.LOW) > 0;
    }

    public final void j0() {
        long j2;
        removeCallbacks(this.m0);
        if (this.l0 || !this.f57270j.f169236c) {
            return;
        }
        int i = l1.f[this.v.ordinal()];
        if (i == 1) {
            j2 = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
        } else if (i == 2) {
            j2 = 5000;
        } else if (i == 3) {
            j2 = 8000;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = -1;
        }
        if (j2 > 0) {
            if (this.m0 == null) {
                this.m0 = new q(this, 2);
            }
            postDelayed(this.m0, j2);
        }
    }

    public final void l0() {
        x8 x8VarC;
        if (this.f57282s0 == k1.SOLID) {
            if (this.f57284t0 == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f57284t0 = ix0.s0.c(context);
            }
            x8VarC = this.f57284t0;
        } else {
            ViewPager2 viewPager2 = this.F;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = j0.a(viewPager2).findViewHolderForAdapterPosition(viewPager2.getCurrentItem());
            h1 h1Var = viewHolderFindViewHolderForAdapterPosition instanceof h1 ? (h1) viewHolderFindViewHolderForAdapterPosition : null;
            if (h1Var != null) {
                x8 x8VarB = h1Var.f9217g;
                if (x8VarB == null) {
                    Context context2 = h1Var.f9218h.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    x8VarB = ix0.s0.b(context2, false);
                    h1Var.f9217g = x8VarB;
                }
                x8VarC = x8VarB;
            } else {
                x8VarC = this.f57284t0;
                if (x8VarC == null) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    x8VarC = ix0.s0.c(context3);
                }
            }
        }
        if (x8VarC != null) {
            if (this.p0 || !x8VarC.equals(this.q0)) {
                this.p0 = false;
                this.q0 = x8VarC;
                f1 f1Var = this.f57280r0;
                if (f1Var != null) {
                    ((NavBarWithBigTile) f1Var).I(x8VarC.f10609a, x8VarC.f10610b, x8VarC.f10611c, x8VarC.e);
                }
            }
        }
    }

    public final r m0() {
        return this.i.f57289c;
    }

    public final void n0(u0 u0Var) {
        p0 p0Var;
        this.f57271k0 = u0Var;
        a1 a1Var = u0Var != null ? u0Var.f9379b : null;
        if (a1Var instanceof x0) {
            x0 x0Var = (x0) a1Var;
            e eVar = new e(x0Var.f9419a, x0Var.f9420b, x0Var.f9421c);
            VersatileTitleView versatileTitleView = this.R;
            versatileTitleView.setLayoutType(eVar);
            versatileTitleView.setVisibility(0);
        } else if (a1Var instanceof y0) {
            setImageTitleInternal(t0.a.f9365a);
        } else if (a1Var instanceof z0) {
            setTitleInternal(((z0) a1Var).f9448a);
        } else {
            if (a1Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            setTitleInternal(this.f57288y);
        }
        setSubtitle(u0Var != null ? u0Var.d : null);
        if (u0Var == null || (p0Var = u0Var.f9380c) == null) {
            p0Var = this.A;
        }
        setDescriptionInternal(p0Var);
        if (a1Var != null) {
            setTitleClickMode(a1Var);
        }
    }

    public final void o0() {
        long j2;
        ProgressPagingIndicatorView progressPagingIndicatorView = this.f57269h0;
        if (progressPagingIndicatorView != null && this.f57286w == au0.f2.DOT_INDICATOR) {
            v0 v0Var = this.v;
            boolean z = (v0Var == v0.NONE || this.l0 || !this.f57270j.f169236c) ? false : true;
            int i = l1.f[v0Var.ordinal()];
            if (i == 1) {
                j2 = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
            } else if (i == 2) {
                j2 = 5000;
            } else if (i == 3) {
                j2 = 8000;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 = -1;
            }
            int currentItem = this.F.getCurrentItem();
            int size = this.k.f319395l.size();
            if (!z) {
                j2 = 0;
            }
            progressPagingIndicatorView.setModel(new l3(0L, currentItem, size, j2, true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a2 a2Var = this.f57285v0;
        if (a2Var != null) {
            a2Var.f(null);
        }
        m1 m1Var = this.M;
        if (m1Var != null) {
            m1Var.cancel();
        }
        this.M = null;
    }

    public final void p0() {
        int currentItem = this.F.getCurrentItem();
        int size = this.k.f319395l.size();
        if (currentItem >= size) {
            return;
        }
        LinePageIndicator linePageIndicator = this.f0;
        if (linePageIndicator.getVisibility() == 0) {
            linePageIndicator.setPagesCount(size);
            linePageIndicator.setCurrentPage(currentItem);
        }
        TagView tagView = this.f57267e0;
        if (tagView.getVisibility() == 0) {
            tagView.setContent(new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(a0.d.g(currentItem + 1, size, " ", " / "), (Style) null, Integer.valueOf(R$attr.uikit_colorWhite), false, (o9) null, (List) null, 122), R$attr.uikit_colorBlack_80, null, R$attr.uikit_colorWhite, null, 1000));
        }
        o0();
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        int iS;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.f57282s0 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorForeground, context);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iS = kli.a.s(colorScheme.a(), context2);
        }
        this.R.setTextColor(iS);
        this.S.setTextColor(iS);
        this.T.setColorFilter(iS);
        this.V.setColorFilter(iS);
        this.U.setTextColor(iS);
        this.Q.setTintColor(iS);
        this.N.setTintColor(iS);
        this.f57265b0.setColors$ui_kit_components_release(iS, i);
        int alphaComponent = ColorUtils.setAlphaComponent(iS, rim.d.c(76.5f));
        HorizontalStepsProgressView horizontalStepsProgressView = this.g0;
        horizontalStepsProgressView.setProgressColor(iS);
        horizontalStepsProgressView.setBaseColor(alphaComponent);
        this.f0.setColorsInt(alphaComponent, iS);
        this.i0 = iS;
        ProgressPagingIndicatorView progressPagingIndicatorView = this.f57269h0;
        if (progressPagingIndicatorView != null) {
            progressPagingIndicatorView.setTintColorInt(iS);
        }
        if (this.f57282s0 != null) {
            if (this.f57268h) {
                setBackgroundGradientOverlayWithColor(this.j0);
            } else {
                setBackgroundGradientOverlayWithColor(i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setActionStatusLabel(aw0.k r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L9
            boolean r1 = r7.f10384c
            r2 = 1
            if (r1 != r2) goto L9
            goto La
        L9:
            r2 = r0
        La:
            if (r7 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 8
        Lf:
            com.revolut.core.ui_kit.internal.views.ActionStatusView r1 = r6.Q
            r1.setVisibility(r0)
            if (r7 == 0) goto L19
            r1.setContent(r7)
        L19:
            com.revolut.core.ui_kit_core.actionshandler.TrackableItem$a r0 = com.revolut.core.ui_kit_core.actionshandler.TrackableItem.INSTANCE
            r0.getClass()
            r0 = 0
            com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent r3 = com.revolut.core.ui_kit_core.actionshandler.TrackableItem.Companion.a(r6, r0)
            if (r7 == 0) goto L2e
            com.revolut.core.ui_kit.models.Clause r7 = r7.f10382a
            if (r7 == 0) goto L2e
            py0.c r0 = new py0.c
            r0.<init>(r7)
        L2e:
            fp0.p r7 = r6.u
            fp0.p.b(r7, r2)
            android.view.View r7 = r7.f137029a
            or0.m.a(r7)
            if (r2 == 0) goto L44
            au0.s1 r4 = new au0.s1
            r5 = 0
            r4.<init>(r3, r0, r6, r5)
            r7.setOnClickListener(r4)
            goto L47
        L44:
            or0.u.o(r7)
        L47:
            pd.b.h(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout.setActionStatusLabel(aw0.k):void");
    }

    public void setActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        ActionsView actionsView = this.f57264a0;
        actionsView.k(actions, t.f210002a);
        actionsView.setVisibility(!actions.isEmpty() ? 0 : 8);
    }

    @Override // au0.c1
    public void setAvatar(AvatarModel model, @NotNull r0 style) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(style, "style");
        AvatarView avatarView = this.I;
        if (model != null) {
            avatarView.setModel(model);
            int i = l1.f9259c[style.ordinal()];
            ViewGroup viewGroup = this.J;
            ImageView imageView = this.K;
            if (i == 1) {
                AvatarModel.AvatarImage avatarImageA = model.a();
                AvatarModel.AvatarImage.GridImage gridImage = avatarImageA instanceof AvatarModel.AvatarImage.GridImage ? (AvatarModel.AvatarImage.GridImage) avatarImageA : null;
                if (gridImage != null) {
                    if (i0()) {
                        a2 a2Var = this.f57285v0;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
                        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            int i2 = imageView.getLayoutParams().width / 2;
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            this.f57285v0 = e0.C(lifecycleScope, null, null, new r1(gridImage, this, jh.d.k(context), i2, null), 3);
                        }
                    }
                } else if (i0()) {
                    a2 a2Var2 = this.f57285v0;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    AvatarModel.AvatarImage avatarImageA2 = model.a();
                    Image colorImage = avatarImageA2 instanceof AvatarModel.AvatarImage.SingleImage ? ((AvatarModel.AvatarImage.SingleImage) avatarImageA2).f57997a : avatarImageA2 instanceof AvatarModel.AvatarImage.LayeredImage ? ((AvatarModel.AvatarImage.LayeredImage) avatarImageA2).f57995b : null;
                    yy0.f fVarQ = u.k(this).Q();
                    if (colorImage == null) {
                        colorImage = new ColorImage(new ColorImage.ColorInteger(0), null);
                    }
                    yy0.f.e(fVarQ, colorImage, this.K, null, null, 12);
                    if (!isLaidOut() || isLayoutRequested()) {
                        addOnLayoutChangeListener(new o1(this, 1));
                    } else {
                        d1.a(viewGroup);
                    }
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 a2Var3 = this.f57285v0;
                if (a2Var3 != null) {
                    a2Var3.f(null);
                }
                imageView.setImageDrawable(null);
                if (Build.VERSION.SDK_INT >= 31) {
                    g0.y(viewGroup);
                }
            }
        }
        avatarView.setVisibility(model == null ? 8 : 0);
        this.O.setVisibility(8);
        this.P.setVisibility(8);
        this.u0 = style;
        setPagesInternal(this.f57287x);
    }

    @Override // au0.c1
    public void setAvatarGroup(@NotNull List<? extends Image> avatars, boolean showOverflowCounter) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        OverlappedIconsView overlappedIconsView = this.E;
        LazyInflatableCachedView lazyInflatableCachedView = this.P;
        if (overlappedIconsView == null && !avatars.isEmpty()) {
            this.E = (OverlappedIconsView) lazyInflatableCachedView.a(R$layout.internal_view_header_avatar_group);
        }
        OverlappedIconsView overlappedIconsView2 = this.E;
        if (overlappedIconsView2 != null) {
            yp0.u.a(overlappedIconsView2, showOverflowCounter ? new i0(avatars, aw0.e0.DP_56, new f0(), 8) : new i0(d0.V0(avatars, 4), aw0.e0.DP_56, (h0) null, 12), 8);
        }
        lazyInflatableCachedView.setVisibility(!avatars.isEmpty() ? 0 : 8);
        this.I.setVisibility(8);
        this.O.setVisibility(8);
        this.u0 = r0.DEFAULT;
        setPagesInternal(this.f57287x);
    }

    @Override // au0.c1
    @yhm.d
    public /* bridge */ void setBackgroundImage(Image image) {
        super.setBackgroundImage(image);
    }

    @Override // au0.c1
    @yhm.d
    public /* bridge */ void setBackgroundImages(@NotNull List<? extends Image> list, @NotNull au0.f2 f2Var, boolean z) {
        super.setBackgroundImages(list, f2Var, z);
    }

    public void setBackgroundOverlayDecoration(@NotNull m0 decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        if (decoration == m0.FULL_GRADIENT && this.f57282s0 != null) {
            decoration = m0.NONE;
        }
        m0 m0Var = this.L;
        if (m0Var == decoration) {
            return;
        }
        m0 m0Var2 = m0.BOTTOM_BLUR;
        ViewPager2 viewPager2 = this.F;
        if (m0Var == m0Var2) {
            m1 m1Var = this.M;
            if (m1Var != null) {
                m1Var.cancel();
            }
            this.M = null;
            viewPager2.setForeground(null);
            j70.a devicePerformance = getDevicePerformance();
            if (devicePerformance != null) {
                kp0.w0.e(viewPager2, devicePerformance);
            }
        }
        this.L = decoration;
        int i = l1.f9258b[decoration.ordinal()];
        if (i == 1) {
            viewPager2.setForeground(null);
            return;
        }
        if (i == 2) {
            if (viewPager2.getForeground() == null) {
                if (this.f57268h) {
                    setBackgroundGradientOverlayWithColor(this.j0);
                    return;
                } else {
                    viewPager2.setForeground(getContext().getDrawable(com.revolut.core.ui_kit.R$drawable.internal_header_gradient_overlay));
                    return;
                }
            }
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        j70.a devicePerformance2 = getDevicePerformance();
        boolean z = devicePerformance2 != null && kp0.w0.n(devicePerformance2);
        float f = z ? 0.4f : 0.5f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Color.Solid color = new Color.Solid(R$attr.uikit_windowBackground);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        viewPager2.setForeground(new BackgroundGradientDrawable(io0.a.c(context, color), f));
        if (z) {
            m1 m1Var2 = new m1(viewPager2, this, devicePerformance2, 0);
            viewPager2.addOnLayoutChangeListener(m1Var2);
            if (ViewCompat.isLaidOut(viewPager2) && !viewPager2.isLayoutRequested() && this.L == m0Var2) {
                kp0.w0.b(viewPager2, zhm.u.c(new qo0.e(BitmapDescriptorFactory.HUE_RED, 100.0f, (int) (viewPager2.getHeight() * 0.6f), Integer.MAX_VALUE)), devicePerformance2);
            }
            this.M = m1Var2;
        }
    }

    public final void setColorSchemeListener$ui_kit_components_release(f1 listener) {
        this.f57280r0 = listener;
    }

    @yhm.d
    public void setCompoundTitle(@NotNull Clause firstText, @NotNull ImageClause icon, @NotNull Clause secondText) {
        Intrinsics.checkNotNullParameter(firstText, "firstText");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(secondText, "secondText");
        setTitle(new x0(firstText, icon, secondText));
    }

    public void setCustomFont(i3 customFont) {
        this.R.setCustomFont(customFont);
    }

    public void setDescription(Clause clause) {
        setDescription(clause != null ? new o0(clause) : null);
    }

    @Override // au0.c1
    public void setDuoAvatar(@NotNull q0 avatar, @NotNull r0 style) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(style, "style");
        DuoAvatarView duoAvatarView = this.D;
        LazyInflatableCachedView lazyInflatableCachedView = this.O;
        if (duoAvatarView == null) {
            this.D = (DuoAvatarView) lazyInflatableCachedView.a(R$layout.internal_view_header_duo_avatar);
        }
        DuoAvatarView duoAvatarView2 = this.D;
        if (duoAvatarView2 != null) {
            duoAvatarView2.setModel(new ms0.p0(avatar.f9319a, avatar.f9320b, avatar.f9321c));
        }
        lazyInflatableCachedView.setVisibility(0);
        this.I.setVisibility(8);
        this.P.setVisibility(8);
        this.u0 = style;
        setPagesInternal(this.f57287x);
    }

    public void setHeightMode(@NotNull q2 heightMode) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        if (Intrinsics.f(heightMode, this.B)) {
            return;
        }
        this.B = heightMode;
        f0();
    }

    @Override // au0.c1
    public void setIcon(Image image, @NotNull r0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        setAvatar(image != null ? new AvatarModel.Default(image, null, null, null, null, null, 126) : null, style);
    }

    public void setIconClickable(boolean isClickable) {
        this.I.setClickable(isClickable);
    }

    public void setLayoutType(@NotNull s0 layoutType) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        if (layoutType == this.C) {
            return;
        }
        this.C = layoutType;
        g0();
        l0();
    }

    public void setLinePageIndicatorColors(int baseColor, int progressColor) {
    }

    public void setLineProgressIndicatorColors(int baseColor, int progressColor) {
    }

    public void setLineProgressIndicatorPercentage(int percentage) {
        this.g0.setOverallProgress(percentage / 100.0f);
    }

    public void setLineProgressIndicatorVisible(boolean visible) {
        this.g0.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    @Override // au0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPages(@org.jetbrains.annotations.NotNull java.util.List<au0.u0> r13, @org.jetbrains.annotations.NotNull au0.f2 r14, @org.jetbrains.annotations.NotNull au0.v0 r15) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout.setPages(java.util.List, au0.f2, au0.v0):void");
    }

    public final void setParentScrollOffset$ui_kit_components_release(int offset, float expandRatio) {
        this.f57275n0 = offset;
        this.f57276o0 = expandRatio;
        RecyclerView recyclerViewA = j0.a(this.F);
        int childCount = recyclerViewA.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerViewA.getChildAt(i);
            if (childAt instanceof WallpaperView) {
                ((WallpaperView) childAt).d(expandRatio, offset);
            }
        }
    }

    public void setRatingStars(Double stars) {
        RatingBar ratingBar = this.W;
        ratingBar.setEnabled(false);
        if (stars == null) {
            ratingBar.setVisibility(8);
        } else {
            ratingBar.setRating$ui_kit_components_release((float) stars.doubleValue());
            ratingBar.setVisibility(0);
        }
    }

    public final void setSearchButtonActionButtons(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f57265b0.setActionButtons(buttons);
    }

    public final void setSearchButtonActive(boolean active) {
        this.f57265b0.setVisibility(active ? 0 : 8);
    }

    public final void setSearchButtonExpandRatio$ui_kit_components_release(float ratio) {
        this.f57265b0.setExpandRatio(ratio);
    }

    public final void setSearchButtonFilterState(@NotNull e4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f57265b0.setFiltersState(state);
    }

    public final void setSearchButtonMode(@NotNull n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z = mode == n.REGULAR_SEARCH;
        setClipChildren(z);
        setClipToPadding(z);
        this.f57265b0.setMode$ui_kit_components_release(mode);
    }

    public final void setSearchButtonSortingEnabled(boolean enabled) {
        this.f57265b0.setSortingEnabled(enabled);
    }

    public final void setSearchButtonText(Clause clause) {
        this.f57265b0.setText(clause);
    }

    public void setSocialProofLabel(s4 content) {
        SocialProofView socialProofView = this.N;
        if (content != null) {
            socialProofView.setContent(content);
        }
        socialProofView.setVisibility(content != null ? 0 : 8);
    }

    public void setTagViewData(TagViewData tagViewData) {
        TagView tagView = this.H;
        if (tagViewData != null) {
            tagView.setContent(tagViewData);
        }
        tagView.setVisibility(tagViewData != null ? 0 : 8);
        if (tagViewData != null) {
            tagView.setOnClickListener(new e1(this, 1));
        } else {
            tagView.setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setThemeBasedColorSchemeEnabled(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L14
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = jh.d.g(r0)
            if (r0 != 0) goto L14
            au0.k1 r3 = au0.k1.SOLID
            goto L1a
        L14:
            if (r3 == 0) goto L19
            au0.k1 r3 = au0.k1.MONO
            goto L1a
        L19:
            r3 = 0
        L1a:
            r2.f57282s0 = r3
            r3 = 1
            r2.p0 = r3
            r2.l0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout.setThemeBasedColorSchemeEnabled(boolean):void");
    }

    @yhm.d
    public void setTitle(Clause clause) {
        setTitle(new z0(clause, false));
    }

    public void setTitleStyle(@NotNull b1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (style != this.z) {
            this.z = style;
            int i = l1.d[style.ordinal()];
            VersatileTitleView versatileTitleView = this.R;
            if (i == 1) {
                int i2 = R$attr.internal_textAppearanceHeading1;
                versatileTitleView.e = i2;
                versatileTitleView.a(new a5g.i(i2, 5));
                versatileTitleView.requestLayout();
            } else if (i == 2 || i == 3) {
                int i3 = R$attr.internal_textAppearanceDisplay2;
                versatileTitleView.e = i3;
                versatileTitleView.a(new a5g.i(i3, 5));
                versatileTitleView.requestLayout();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage;
                versatileTitleView.e = i5;
                versatileTitleView.a(new a5g.i(i5, 5));
                versatileTitleView.requestLayout();
            }
            setTitleInternal(this.f57288y);
        }
    }

    public final void setTopInset$ui_kit_components_release(int topInset) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.c0.setGuidelineBegin(kli.a.k(context, 56.0f) + topInset);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderWithBigTileLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    public HeaderWithBigTileLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57268h = ((Boolean) jo0.g.M.getValue()).booleanValue();
        NavBarBackgroundDelegate navBarBackgroundDelegate = new NavBarBackgroundDelegate();
        this.i = navBarBackgroundDelegate;
        this.f57270j = new f2(this, this);
        j jVar = new j(7, zhm.u.c(navBarBackgroundDelegate), false);
        this.k = jVar;
        this.f57272l = v0.a.d("create(...)");
        this.f57273m = v0.a.d("create(...)");
        this.f57274n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        this.f57277p = v0.a.d("create(...)");
        this.f57278q = v0.a.d("create(...)");
        this.f57279r = v0.a.d("create(...)");
        this.f57281s = v0.a.d("create(...)");
        this.v = v0.NONE;
        this.f57286w = au0.f2.LINE_INDICATOR;
        this.f57287x = zhm.f0.f322471a;
        this.z = b1.DEFAULT;
        this.B = new o2(0);
        this.C = s0.LEFT_ALIGNED;
        this.L = m0.NONE;
        this.j0 = kli.a.s(R$attr.uikit_windowBackground, context);
        this.f57276o0 = 1.0f;
        this.u0 = r0.DEFAULT;
        View.inflate(context, R$layout.internal_view_header_with_big_tile, this);
        View viewFindViewById = findViewById(R$id.imagesViewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById;
        this.F = viewPager2;
        View viewFindViewById2 = findViewById(R$id.headerWithBigTile_scrollHost);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.G = (UIKitFrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.headerWithBigTile_imagesPreviewTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TagView tagView = (TagView) viewFindViewById3;
        this.f57267e0 = tagView;
        View viewFindViewById4 = findViewById(R$id.linePageIndicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f0 = (LinePageIndicator) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.headerWithBigTile_lineProgressIndicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        HorizontalStepsProgressView horizontalStepsProgressView = (HorizontalStepsProgressView) viewFindViewById5;
        this.g0 = horizontalStepsProgressView;
        View viewFindViewById6 = findViewById(R$id.icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById6;
        this.I = avatarView;
        View viewFindViewById7 = findViewById(R$id.blurred_icon_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById7;
        this.J = viewGroup;
        View viewFindViewById8 = findViewById(R$id.blurred_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.K = (ImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.socialProof);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.N = (SocialProofView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.actionStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ActionStatusView actionStatusView = (ActionStatusView) viewFindViewById10;
        this.Q = actionStatusView;
        View viewFindViewById11 = findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        VersatileTitleView versatileTitleView = (VersatileTitleView) viewFindViewById11;
        this.R = versatileTitleView;
        View viewFindViewById12 = findViewById(R$id.headerWithBigTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.S = (TextView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R$id.headerWithBigTile_descriptionPointsIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.T = (ImageView) viewFindViewById13;
        View viewFindViewById14 = findViewById(R$id.headerWithBigTile_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.U = (TextView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R$id.headerWithBigTile_descriptionChevronIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.V = (ImageView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R$id.headerWithBigTile_duoAvatarContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.O = (LazyInflatableCachedView) viewFindViewById16;
        View viewFindViewById17 = findViewById(R$id.headerWithBigTile_avatarGroupContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.P = (LazyInflatableCachedView) viewFindViewById17;
        View viewFindViewById18 = findViewById(R$id.actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.f57264a0 = (ActionsView) viewFindViewById18;
        View viewFindViewById19 = findViewById(R$id.headerWithBigTile_ratingStars);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        this.W = (RatingBar) viewFindViewById19;
        View viewFindViewById20 = findViewById(R$id.headerWithBigTile_tagView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        this.H = (TagView) viewFindViewById20;
        View viewFindViewById21 = findViewById(R$id.headerWithBigTile_searchButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        this.f57265b0 = (SearchButton) viewFindViewById21;
        View viewFindViewById22 = findViewById(R$id.headerWithBigTile_topGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        this.c0 = (Guideline) viewFindViewById22;
        View viewFindViewById23 = findViewById(R$id.headerWithBigTile_bottomGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        this.f57266d0 = (Guideline) viewFindViewById23;
        j0.a(viewPager2).setOverScrollMode(2);
        viewPager2.setAdapter(jVar);
        viewPager2.registerOnPageChangeCallback(new au0.i1(this));
        tagView.setOnClickListener(new e1(this, 0));
        TrackableItem.INSTANCE.getClass();
        CustomTrackableComponent customTrackableComponentA = TrackableItem.Companion.a(this, null);
        py0.a aVar = new py0.a("HeaderWithBigTileLayoutIcon");
        m.a(avatarView);
        avatarView.setOnClickListener(new t1(customTrackableComponentA, 0, aVar, this));
        viewGroup.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 1));
        horizontalStepsProgressView.setProgressBarRadiusDp(4.0f);
        g0();
        f0();
        setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        setReadableAreaGuidelinesEnabled(true);
        c8g.a.a(this, ny0.a.f220589a, new ar1.c(this, 14));
        p.Companion.getClass();
        gp0.b bVar = gp0.b.f145198a;
        this.f57283t = fp0.m.a(versatileTitleView, bVar);
        this.u = fp0.m.a(actionStatusView, bVar);
    }

    public void setDescription(p0 description) {
        this.A = description;
        u0 u0Var = this.f57271k0;
        if ((u0Var != null ? u0Var.f9380c : null) == null) {
            setDescriptionInternal(description);
        }
    }

    public void setTitle(@NotNull a1 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (title instanceof x0) {
            u0 u0Var = this.f57271k0;
            if ((u0Var != null ? u0Var.f9379b : null) == null) {
                x0 x0Var = (x0) title;
                e eVar = new e(x0Var.f9419a, x0Var.f9420b, x0Var.f9421c);
                VersatileTitleView versatileTitleView = this.R;
                versatileTitleView.setLayoutType(eVar);
                versatileTitleView.setVisibility(0);
            }
        } else if (title instanceof y0) {
            u0 u0Var2 = this.f57271k0;
            if ((u0Var2 != null ? u0Var2.f9379b : null) == null) {
                setImageTitleInternal(t0.a.f9365a);
            }
        } else if (title instanceof z0) {
            Clause clause = ((z0) title).f9448a;
            this.f57288y = clause;
            u0 u0Var3 = this.f57271k0;
            if ((u0Var3 != null ? u0Var3.f9379b : null) == null) {
                setTitleInternal(clause);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setTitleClickMode(title);
    }

    public /* synthetic */ HeaderWithBigTileLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
