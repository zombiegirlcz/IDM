package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import au0.g2;
import au0.r2;
import au0.x4;
import au0.z4;
import aw0.o9;
import aw0.v1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayoutProxy;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import ix0.u1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import no.f2;
import org.jetbrains.annotations.NotNull;
import tx0.d0;
import tx0.e0;
import tx0.e4;
import tx0.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\t\u0098\u0001\u0099\u0001\u009a\u00019\u009b\u0001B\u001d\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001cJ\u0019\u0010$\u001a\u00020\u000f2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J!\u0010$\u001a\u00020\u000f2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020\u0019¢\u0006\u0004\b$\u0010'J\u0017\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001f\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010&\u001a\u00020\u0019¢\u0006\u0004\b*\u0010,J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J%\u00106\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001d\u00106\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b6\u00108J\u0015\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0019¢\u0006\u0004\bB\u0010\u001cJ\u0015\u0010D\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020\u000f2\b\u0010F\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bG\u0010\u0011J\u0011\u0010H\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bH\u0010IR\u001b\u0010N\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010T\u001a\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010T\u001a\u0004\bh\u0010`R\u001b\u0010l\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010T\u001a\u0004\bk\u0010eR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010T\u001a\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010T\u001a\u0004\bt\u0010uR\u001b\u0010y\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010T\u001a\u0004\bx\u0010[R\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010T\u001a\u0004\b|\u0010}R\u001d\u0010\u0081\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010T\u001a\u0005\b\u0080\u0001\u0010}R \u0010\u0086\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010T\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0089\u0001\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010T\u001a\u0005\b\u0088\u0001\u0010`R,\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R5\u0010\u000e\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018F@FX\u0087\u000e¢\u0006\u0016\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\bH\u0010\u0094\u0001\"\u0005\b\u0010\u0010\u0095\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "Lcom/google/android/material/appbar/AppBarLayoutProxy;", "Lau0/g2;", "Ltx0/e4;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lur0/a;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "colorAttrId", "setTitleColor$ui_kit_components_release", "(I)V", "setTitleColor", "subtitle", "setSubtitle", "", "clickable", "setTitleClickable", "(Z)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "setTitleEndIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "centered", "setTitleCentered", "iconRes", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "keepInLayout", "(Ljava/lang/Integer;Z)V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ResourceImage;", "image", "setNavigationButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/ResourceImage;)V", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/ResourceImage;Z)V", "Landroid/view/View$OnClickListener;", "listener", "setOnNavigationButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "(Ljava/util/List;)V", "Ltx0/d0;", "background", "setBackground", "(Ltx0/d0;)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "content", "setTagContent", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "visible", "setTagVisible", "Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar$a;", "setHeaderContent", "(Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar$a;)V", "text", "setHeaderDisclaimerSticky", "getTitle", "()Lcom/revolut/core/ui_kit/models/Clause;", "h", "Lkotlin/Lazy;", "getNavBarHeight", "()I", "navBarHeight", "i", "getTitleContentHorizontalMargin", "titleContentHorizontalMargin", "Landroidx/recyclerview/widget/RecyclerView;", "q", "Le8/q;", "getMenuRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "menuRecyclerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "r", "getToolbarContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "toolbarContainer", "Landroid/widget/TextView;", "s", "getToolbarTitle", "()Landroid/widget/TextView;", "toolbarTitle", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "t", "getToolbarTitleLoadingContainer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "toolbarTitleLoadingContainer", "u", "getToolbarSubtitle", "toolbarSubtitle", "v", "getToolbarSubtitleLoadingContainer", "toolbarSubtitleLoadingContainer", "Landroid/widget/ImageView;", "w", "getToolbarEndIcon", "()Landroid/widget/ImageView;", "toolbarEndIcon", "Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "x", "getNavigationButton", "()Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "navigationButton", "y", "getBasicNavBarRootContainer", "basicNavBarRootContainer", "Landroidx/constraintlayout/widget/Guideline;", "z", "getContentTopGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "contentTopGuideline", "A", "getContentBottomGuideline", "contentBottomGuideline", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "B", "getTagView", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tagView", "C", "getHeaderDisclaimer", "headerDisclaimer", "Landroid/os/Parcelable;", "G", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "", "value", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getTitle$annotations", "()V", "com/revolut/core/ui_kit/views/navbar/f", "a", "b", "tx0/e0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BasicNavBar extends AppBarLayoutProxy implements g2, e4, TrackableItem, ur0.a {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final e8.q contentBottomGuideline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final e8.q tagView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final e8.q headerDisclaimer;
    public final ryc.a D;
    public int E;
    public int F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.navbar.d f59210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f59211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f59212c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4 f59213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f59214h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WindowInsetsCompat f59215j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f59216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f59217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f59218n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f59219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuRecyclerView;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q toolbarContainer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q toolbarTitle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final e8.q toolbarTitleLoadingContainer;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final e8.q toolbarSubtitle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q toolbarSubtitleLoadingContainer;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final e8.q toolbarEndIcon;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final e8.q navigationButton;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final e8.q basicNavBarRootContainer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final e8.q contentTopGuideline;

    /* JADX INFO: loaded from: classes20.dex */
    public static abstract class a {
        private a() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static abstract class b {
        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicNavBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ihm.f fVarD = v0.a.d("create(...)");
        this.f59211b = fVarD;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        z4 z4Var = new z4(this);
        this.f59213g = z4Var;
        this.f59214h = te0.w.y0(new a01.c(context, 16));
        this.i = te0.w.y0(new a01.c(context, 17));
        this.o = v0.a.d("create(...)");
        this.menuRecyclerView = kli.a.J(R$id.basicNavBar_menuRecyclerView, this);
        this.toolbarContainer = kli.a.J(R$id.basicNavBar_toolbarTitleContainer, this);
        this.toolbarTitle = kli.a.J(R$id.basicNavBar_toolbarTitle, this);
        this.toolbarTitleLoadingContainer = kli.a.J(R$id.basicNavBar_toolbarLoadingTitleContainer, this);
        this.toolbarSubtitle = kli.a.J(R$id.basicNavBar_toolbarSubtitle, this);
        this.toolbarSubtitleLoadingContainer = kli.a.J(R$id.basicNavBar_toolbarLoadingSubtitleContainer, this);
        this.toolbarEndIcon = kli.a.J(R$id.basicNavBar_toolbarEndIcon, this);
        this.navigationButton = kli.a.J(R$id.basicNavBar_navigationButton, this);
        this.basicNavBarRootContainer = kli.a.J(R$id.basicNavBar_rootContainer, this);
        this.contentTopGuideline = kli.a.J(R$id.basicNavBar_contentTopGuideline, this);
        this.contentBottomGuideline = kli.a.J(R$id.basicNavBar_contentBottomGuideline, this);
        this.tagView = kli.a.J(R$id.internalBasicNavBar_tagView, this);
        this.headerDisclaimer = kli.a.J(R$id.basicNavBar_headerDisclaimer, this);
        this.E = kli.a.s(R$attr.uikit_colorWhite, context);
        LayoutInflater.from(context).inflate(R$layout.internal_view_basic_nav_bar, (ViewGroup) this, true);
        fp0.p clickHandler = getNavigationButton().getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new r2(this, this, 24));
        fVarD.subscribe(new pv9.b(new f2(this, 17), 22));
        this.f59210a = new com.revolut.core.ui_kit.internal.views.navbar.d(getMenuRecyclerView());
        setStateListAnimator(null);
        setBackground(d0.TRANSPARENT);
        if (isAttachedToWindow()) {
            z4Var.a();
        } else {
            addOnAttachStateChangeListener(new x4(z4Var, 0));
        }
        final int paddingTop = getBasicNavBarRootContainer().getPaddingTop();
        or0.u.a(getBasicNavBarRootContainer(), new Function1() { // from class: tx0.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return BasicNavBar.j(this, paddingTop, (WindowInsets) obj2);
            }
        });
        this.D = new ryc.a(getHeaderDisclaimer());
    }

    private final ConstraintLayout getBasicNavBarRootContainer() {
        return (ConstraintLayout) this.basicNavBarRootContainer.f();
    }

    private final Guideline getContentBottomGuideline() {
        return (Guideline) this.contentBottomGuideline.f();
    }

    private final Guideline getContentTopGuideline() {
        return (Guideline) this.contentTopGuideline.f();
    }

    private final TextView getHeaderDisclaimer() {
        return (TextView) this.headerDisclaimer.f();
    }

    private final RecyclerView getMenuRecyclerView() {
        return (RecyclerView) this.menuRecyclerView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getNavBarHeight() {
        return ((Number) this.f59214h.getValue()).intValue();
    }

    private final NavBarNavigationButtonView getNavigationButton() {
        return (NavBarNavigationButtonView) this.navigationButton.f();
    }

    private final TagView getTagView() {
        return (TagView) this.tagView.f();
    }

    @yhm.d
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getTitleContentHorizontalMargin() {
        return ((Number) this.i.getValue()).intValue();
    }

    private final ConstraintLayout getToolbarContainer() {
        return (ConstraintLayout) this.toolbarContainer.f();
    }

    private final ImageView getToolbarEndIcon() {
        return (ImageView) this.toolbarEndIcon.f();
    }

    private final TextView getToolbarSubtitle() {
        return (TextView) this.toolbarSubtitle.f();
    }

    private final ShimmerFrameLayout getToolbarSubtitleLoadingContainer() {
        return (ShimmerFrameLayout) this.toolbarSubtitleLoadingContainer.f();
    }

    private final TextView getToolbarTitle() {
        return (TextView) this.toolbarTitle.f();
    }

    private final ShimmerFrameLayout getToolbarTitleLoadingContainer() {
        return (ShimmerFrameLayout) this.toolbarTitleLoadingContainer.f();
    }

    public static Unit j(BasicNavBar basicNavBar, int i, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i2 = insets2.top + i;
        basicNavBar.getContentTopGuideline().setGuidelineBegin(i2);
        basicNavBar.getContentBottomGuideline().setGuidelineBegin(i2 + basicNavBar.getNavBarHeight());
        return Unit.f186387a;
    }

    public static Unit k(BasicNavBar basicNavBar, Clause clause, ty0.a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        or0.u.k(basicNavBar).n0().a(basicNavBar.getToolbarSubtitle(), basicNavBar, clause != null ? new py0.c(clause) : null);
        basicNavBar.e.onNext(it8);
        return Unit.f186387a;
    }

    public static void l(BasicNavBar basicNavBar) {
        py0.f fVarN0 = or0.u.k(basicNavBar).n0();
        Clause title = basicNavBar.getTitle();
        fVarN0.a(basicNavBar, basicNavBar, title != null ? new py0.c(title) : null);
        basicNavBar.d.onNext(Unit.f186387a);
    }

    public static Unit n(BasicNavBar basicNavBar) {
        View.OnClickListener onClickListener = basicNavBar.f59212c;
        if (onClickListener != null) {
            onClickListener.onClick(basicNavBar.getNavigationButton());
        }
        return Unit.f186387a;
    }

    public static void p(TextView textView, ShimmerFrameLayout shimmerFrameLayout) {
        textView.animate().cancel();
        textView.setVisibility(8);
        textView.setAlpha(1.0f);
        knm.b.z(shimmerFrameLayout, false, 200L, 12);
    }

    @Override // au0.g2
    public final efm.r b() {
        throw null;
    }

    @Override // tx0.e4
    public final void d(int i) {
        this.k = i;
        View viewB = this.f59213g.b();
        if (viewB == null) {
            return;
        }
        int navBarHeight = getNavBarHeight();
        if (i > navBarHeight) {
            i = navBarHeight;
        }
        float f = i / navBarHeight;
        viewB.setAlpha(f);
        viewB.setVisibility((f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) <= 0 ? 4 : 0);
        viewB.setY(getY() + getHeight());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF52006p() {
        return this.analyticsContext;
    }

    /* JADX INFO: renamed from: getTitle, reason: collision with other method in class */
    public final String m3752getTitle() {
        return getToolbarTitle().getText().toString();
    }

    public final void o() {
        if (this.f59216l == null) {
            return;
        }
        getToolbarTitleLoadingContainer().f();
        getToolbarSubtitleLoadingContainer().f();
        if (getTitle() != null) {
            AccelerateInterpolator accelerateInterpolator = u1.f169315a;
            u1.c(getToolbarTitle(), getToolbarTitleLoadingContainer());
        } else {
            p(getToolbarTitle(), getToolbarTitleLoadingContainer());
        }
        CharSequence text = getToolbarSubtitle().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0) {
            AccelerateInterpolator accelerateInterpolator2 = u1.f169315a;
            u1.c(getToolbarSubtitle(), getToolbarSubtitleLoadingContainer());
        } else {
            p(getToolbarSubtitle(), getToolbarSubtitleLoadingContainer());
        }
        this.f59216l = null;
        s();
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (getFitsSystemWindows() && !ObjectsCompat.equals(this.f59215j, insets)) {
            this.f59215j = insets;
            ViewCompat.onApplyWindowInsets(getBasicNavBarRootContainer(), insets);
        }
        return super.onApplyWindowInsets(insets);
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (isLaidOut()) {
            return;
        }
        d(this.k);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        f fVar = this.f59217m;
        if (fVar == null && !this.f59219p) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f59219p) {
            rr0.i.b(getNavigationButton(), i, i2, 0, 0);
            rr0.i.b(getMenuRecyclerView(), i, i2, 0, 0);
        } else {
            super.onMeasure(i, i2);
        }
        if (getNavigationButton().getVisibility() == 8) {
            measuredWidth = 0;
        } else {
            ViewGroup.LayoutParams layoutParams = getNavigationButton().getLayoutParams();
            measuredWidth = getNavigationButton().getMeasuredWidth() + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        }
        ViewGroup.LayoutParams layoutParams2 = getMenuRecyclerView().getLayoutParams();
        int iMax = size - (Math.max(measuredWidth, size - ((size - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0)) - getMenuRecyclerView().getMeasuredWidth())) * 2);
        int i3 = iMax >= 0 ? iMax : 0;
        if (this.f59219p) {
            getToolbarContainer().getLayoutParams().width = i3;
            super.onMeasure(i, i2);
        }
        if (fVar != null && 1 <= i3 && i3 < fVar.getMeasuredWidth()) {
            fVar.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(fVar.getMeasuredHeight(), 1073741824));
        }
    }

    public final void q() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.E = kli.a.s(R$attr.uikit_colorWhite, context);
        this.F = 0;
        getNavigationButton().b();
        com.revolut.core.ui_kit.internal.views.navbar.d dVar = this.f59210a;
        dVar.d = null;
        dVar.e = null;
        z4l.j jVar = dVar.i;
        jVar.notifyItemRangeChanged(0, jVar.f319395l.size());
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.E = kli.a.s(colorScheme.a(), context);
        this.F = i;
        if (!((Boolean) jo0.g.j().getValue()).booleanValue()) {
            getNavigationButton().setBackgroundColor(this.F);
            getNavigationButton().setDrawableTint(this.E);
        }
        this.f59210a.f(this.E, this.F);
    }

    public final void s() {
        e0 e0Var = this.f59216l;
        int i = e0Var == null ? -1 : f0.f275116a[e0Var.ordinal()];
        if (i == -1 || i == 1) {
            ShimmerFrameLayout toolbarTitleLoadingContainer = getToolbarTitleLoadingContainer();
            ViewGroup.LayoutParams layoutParams = toolbarTitleLoadingContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomToTop = R$id.basicNavBar_toolbarLoadingSubtitleContainer;
            toolbarTitleLoadingContainer.setLayoutParams(layoutParams2);
            ShimmerFrameLayout toolbarSubtitleLoadingContainer = getToolbarSubtitleLoadingContainer();
            ViewGroup.LayoutParams layoutParams3 = toolbarSubtitleLoadingContainer.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToBottom = R$id.basicNavBar_toolbarLoadingTitleContainer;
            toolbarSubtitleLoadingContainer.setLayoutParams(layoutParams4);
            TextView toolbarTitle = getToolbarTitle();
            ViewGroup.LayoutParams layoutParams5 = toolbarTitle.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomToTop = R$id.basicNavBar_toolbarSubtitle;
            toolbarTitle.setLayoutParams(layoutParams6);
            TextView toolbarSubtitle = getToolbarSubtitle();
            ViewGroup.LayoutParams layoutParams7 = toolbarSubtitle.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.topToBottom = R$id.basicNavBar_toolbarTitle;
            toolbarSubtitle.setLayoutParams(layoutParams8);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ShimmerFrameLayout toolbarTitleLoadingContainer2 = getToolbarTitleLoadingContainer();
        ViewGroup.LayoutParams layoutParams9 = toolbarTitleLoadingContainer2.getLayoutParams();
        if (layoutParams9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        layoutParams10.bottomToTop = R$id.basicNavBar_toolbarLoadingSubtitleContainer;
        toolbarTitleLoadingContainer2.setLayoutParams(layoutParams10);
        ShimmerFrameLayout toolbarSubtitleLoadingContainer2 = getToolbarSubtitleLoadingContainer();
        ViewGroup.LayoutParams layoutParams11 = toolbarSubtitleLoadingContainer2.getLayoutParams();
        if (layoutParams11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
        layoutParams12.topToBottom = R$id.basicNavBar_toolbarTitle;
        toolbarSubtitleLoadingContainer2.setLayoutParams(layoutParams12);
        TextView toolbarTitle2 = getToolbarTitle();
        ViewGroup.LayoutParams layoutParams13 = toolbarTitle2.getLayoutParams();
        if (layoutParams13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
        layoutParams14.bottomToTop = R$id.basicNavBar_toolbarLoadingSubtitleContainer;
        toolbarTitle2.setLayoutParams(layoutParams14);
        TextView toolbarSubtitle2 = getToolbarSubtitle();
        ViewGroup.LayoutParams layoutParams15 = toolbarSubtitle2.getLayoutParams();
        if (layoutParams15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
        layoutParams16.topToBottom = R$id.basicNavBar_toolbarTitle;
        toolbarSubtitle2.setLayoutParams(layoutParams16);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setBackground(@NotNull d0 background) {
        Intrinsics.checkNotNullParameter(background, "background");
        int i = f0.f275117b[background.ordinal()];
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setBackgroundColor(kli.a.s(R$attr.uikit_windowBackground, context));
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setBackground(getContext().getDrawable(R$drawable.internal_gradient_top_to_bottom_dark));
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context2));
        }
    }

    public final void setHeaderContent(@NotNull a content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (Intrinsics.f(content, this.f59218n)) {
            return;
        }
        this.f59218n = content;
        if (!(content instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar = this.f59217m;
        if (fVar == null) {
            fVar = new f(this);
            this.f59217m = fVar;
            ConstraintLayout basicNavBarRootContainer = getBasicNavBarRootContainer();
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.topToBottom = R$id.basicNavBar_contentTopGuideline;
            layoutParams.bottomToTop = R$id.basicNavBar_contentBottomGuideline;
            Unit unit = Unit.f186387a;
            basicNavBarRootContainer.addView(fVar, layoutParams);
        }
        fVar.a((d) content);
    }

    public void setHeaderDisclaimerSticky(Clause text) {
        this.D.k(text);
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f59210a.setMenuItems(menuItems);
    }

    public final void setNavigationButtonIcon(Integer iconRes) {
        setNavigationButtonIcon(iconRes, true);
    }

    public final void setNavigationButtonImage(ResourceImage image) {
        setNavigationButtonImage(image, true);
    }

    public final void setOnNavigationButtonClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59212c = listener;
    }

    public final void setSubtitle(Clause subtitle) {
        Clause clause;
        twg.a aVar = new twg.a(this, subtitle, 5);
        if (this.f59216l == null) {
            clause = subtitle;
            kli.a.e(getToolbarSubtitle(), clause, aVar, null, 0, 12);
        } else {
            clause = subtitle;
            ty0.c.b(or0.u.k(this).b0(), clause, getToolbarSubtitle(), aVar, null, 8);
        }
        kli.a.I(getToolbarSubtitle(), clause);
    }

    public final void setTagContent(@NotNull TagViewData content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getTagView().setContent(content);
        knm.b.z(getTagView(), true, null, 14);
        getTagView().setOnClickListener(new kp0.l(this, content, 22));
        setTag(R$id.internal_nav_bar_title_clause, content.getF57641b());
    }

    public final void setTagVisible(boolean visible) {
        knm.b.z(getTagView(), visible, null, 14);
    }

    public final void setTitle(String str) {
        setTitle(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    public final void setTitleCentered(boolean centered) {
        if (this.f59219p == centered) {
            return;
        }
        this.f59219p = centered;
        int titleContentHorizontalMargin = centered ? getTitleContentHorizontalMargin() : 0;
        boolean z = this.f59219p;
        float f = z ? 0.5f : BitmapDescriptorFactory.HUE_RED;
        int i = z ? 17 : 8388627;
        getToolbarTitle().setGravity(i);
        getToolbarSubtitle().setGravity(i);
        ConstraintLayout toolbarContainer = getToolbarContainer();
        ConstraintSet constraintSetL = v7.l(toolbarContainer);
        hx7.q.W(constraintSetL, getToolbarTitle(), titleContentHorizontalMargin);
        hx7.q.V(constraintSetL, getToolbarTitle(), f);
        hx7.q.W(constraintSetL, getToolbarSubtitle(), titleContentHorizontalMargin);
        hx7.q.V(constraintSetL, getToolbarSubtitle(), f);
        hx7.q.W(constraintSetL, getToolbarTitleLoadingContainer(), titleContentHorizontalMargin);
        hx7.q.V(constraintSetL, getToolbarTitleLoadingContainer(), f);
        hx7.q.W(constraintSetL, getToolbarSubtitleLoadingContainer(), titleContentHorizontalMargin);
        hx7.q.V(constraintSetL, getToolbarSubtitleLoadingContainer(), f);
        constraintSetL.applyTo(toolbarContainer);
        ConstraintLayout basicNavBarRootContainer = getBasicNavBarRootContainer();
        ConstraintSet constraintSetL2 = v7.l(basicNavBarRootContainer);
        if (this.f59219p) {
            hx7.q.i(constraintSetL2, getToolbarContainer(), 0);
        } else {
            hx7.q.l(constraintSetL2, getToolbarContainer());
            hx7.q.Y(constraintSetL2, getToolbarContainer(), getNavigationButton(), 0);
            hx7.q.n(constraintSetL2, getToolbarContainer(), getMenuRecyclerView());
        }
        constraintSetL2.applyTo(basicNavBarRootContainer);
    }

    public final void setTitleClickable(boolean clickable) {
        if (clickable) {
            getToolbarContainer().setOnClickListener(new c9(this, 20));
        } else {
            or0.u.o(getToolbarContainer());
        }
    }

    public final void setTitleColor$ui_kit_components_release(int colorAttrId) {
        TextView toolbarTitle = getToolbarTitle();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        toolbarTitle.setTextColor(kli.a.s(colorAttrId, context));
    }

    public final void setTitleEndIcon(Image icon) {
        getToolbarEndIcon().setVisibility(icon != null ? 0 : 8);
        yy0.f.e(or0.u.k(this).Q(), icon, getToolbarEndIcon(), null, null, 12);
    }

    public final void u(e0 loadingType) {
        Intrinsics.checkNotNullParameter(loadingType, "loadingType");
        if (loadingType == this.f59216l) {
            return;
        }
        this.f59216l = loadingType;
        int i = f0.f275116a[loadingType.ordinal()];
        if (i == 1) {
            getToolbarTitleLoadingContainer().e();
            getToolbarSubtitleLoadingContainer().e();
            AccelerateInterpolator accelerateInterpolator = u1.f169315a;
            u1.c(getToolbarTitleLoadingContainer(), getToolbarTitle());
            u1.c(getToolbarSubtitleLoadingContainer(), getToolbarSubtitle());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getToolbarSubtitleLoadingContainer().e();
            AccelerateInterpolator accelerateInterpolator2 = u1.f169315a;
            u1.c(getToolbarSubtitleLoadingContainer(), getToolbarSubtitle());
            if (getToolbarTitleLoadingContainer().getVisibility() == 0) {
                getToolbarTitleLoadingContainer().f();
                u1.c(getToolbarTitle(), getToolbarTitleLoadingContainer());
            }
        }
        s();
    }

    private final Clause getTitle() {
        Object tag2 = getTag(R$id.internal_nav_bar_title_clause);
        if (tag2 instanceof Clause) {
            return (Clause) tag2;
        }
        return null;
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f59210a.setMenuItems(menuItems);
    }

    public final void setNavigationButtonIcon(Integer iconRes, boolean keepInLayout) {
        ResourceImage resourceImage;
        if (iconRes != null) {
            resourceImage = new ResourceImage(iconRes.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        } else {
            resourceImage = null;
        }
        setNavigationButtonImage(resourceImage, keepInLayout);
    }

    public final void setNavigationButtonImage(ResourceImage image, boolean keepInLayout) {
        getNavigationButton().setVisibility(image != null ? 0 : keepInLayout ? 4 : 8);
        yy0.f.e(or0.u.k(this).Q(), image, getNavigationButton(), null, null, 12);
        getNavigationButton().setContentDescription(getNavigationButton().getContext().getString(R$string.uikit_navigate_up_description));
    }

    public final void setTitle(Clause title) {
        setTag(R$id.internal_nav_bar_title_clause, title);
        e0 e0Var = this.f59216l;
        int i = e0Var == null ? -1 : f0.f275116a[e0Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                ty0.c.b(or0.u.k(this).b0(), title, getToolbarTitle(), null, null, 12);
                return;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        kli.a.b(getToolbarTitle(), title, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasicNavBar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
