package com.revolut.core.ui_kit.views.navbar;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import au0.p2;
import aw0.d0;
import aw0.q8;
import aw0.v1;
import aw0.x8;
import aw0.y9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.badge.UserStatusBadgeView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.n1;
import ix0.r1;
import ix0.s0;
import ix0.u1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mx0.i1;
import org.jetbrains.annotations.NotNull;
import tx0.c4;
import tx0.d4;
import tx0.o1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002()B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/PhotoHeaderView;", "Lau0/o;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkw0/g;", "model", "", "setContent", "(Lkw0/g;)V", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "setMenuItems", "(Ljava/util/List;)V", "Lkw0/k;", "toolbar", "setToolbar", "(Lkw0/k;)V", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "Lkw0/j;", "title", "setTitle", "(Lkw0/j;)V", "setMedia", "", "collapsed", "setBackgroundCollapsed", "(Z)V", "", "ratio", "setBackgroundCollapsedRatio", "(F)V", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhotoHeaderView extends au0.o implements ur0.a {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int U = 0;
    public kw0.g A;
    public boolean B;
    public ValueAnimator C;
    public boolean D;
    public int E;
    public final int F;
    public final int G;
    public x8 H;
    public x8 I;
    public final x8 J;
    public final b K;
    public final com.revolut.core.ui_kit.internal.views.navbar.d L;
    public n1 M;
    public y9 N;
    public y9 O;
    public int P;
    public final ihm.f Q;
    public final ihm.f R;
    public final ihm.f S;
    public final fp0.p T;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f59437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewGroup f59438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WallpaperAssetSwitcher f59439n;
    public final AvatarView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AppCompatTextView f59440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f59441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AppCompatTextView f59442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ActionsView f59443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f59444t;
    public final NavBarNavigationButtonView u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f59445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Guideline f59446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Guideline f59447y;
    public final UserStatusBadgeView z;

    public static final class a {
        private a() {
        }
    }

    public static final class b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f59448a;

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            if (this.f59448a == BitmapDescriptorFactory.HUE_RED) {
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
            }
            int iMin = Math.min(view.getHeight(), view.getWidth());
            int width = (view.getWidth() - iMin) / 2;
            int height = (view.getHeight() - iMin) / 2;
            float f = width;
            float f4 = this.f59448a;
            float f5 = height;
            int width2 = (int) (view.getWidth() - (f * this.f59448a));
            float height2 = view.getHeight();
            float f6 = this.f59448a;
            outline.setRoundRect((int) (f * f4), (int) (f4 * f5), width2, (int) (height2 - (f5 * f6)), iMin * f6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.E = kli.a.s(R$attr.uikit_colorWhite, context);
        this.F = kli.a.s(R$attr.uikit_colorForeground, context);
        this.G = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.J = s0.c(context);
        b bVar = new b();
        this.K = bVar;
        this.N = y9.THEME;
        this.P = -1;
        this.Q = v0.a.d("create(...)");
        this.R = v0.a.d("create(...)");
        this.S = v0.a.d("create(...)");
        v0.a.d("create(...)");
        setFitsSystemWindows(true);
        setStateListAnimator(null);
        setBackground(null);
        View.inflate(context, R$layout.view_photo_header, this);
        View viewFindViewById = findViewById(R$id.photoHeader_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.f59437l = constraintLayout;
        View viewFindViewById2 = constraintLayout.findViewById(R$id.photoHeader_topGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f59446x = (Guideline) viewFindViewById2;
        View viewFindViewById3 = constraintLayout.findViewById(R$id.photoHeader_bottomGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f59447y = (Guideline) viewFindViewById3;
        View viewFindViewById4 = constraintLayout.findViewById(R$id.photoHeader_avatarView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.o = (AvatarView) viewFindViewById4;
        View viewFindViewById5 = constraintLayout.findViewById(R$id.photoHeader_statusView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f59440p = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = constraintLayout.findViewById(R$id.photoHeader_titleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById6;
        this.f59441q = appCompatTextView;
        View viewFindViewById7 = constraintLayout.findViewById(R$id.photoHeader_descriptionView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f59442r = (AppCompatTextView) viewFindViewById7;
        View viewFindViewById8 = constraintLayout.findViewById(R$id.photoHeader_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        ActionsView actionsView = (ActionsView) viewFindViewById8;
        this.f59443s = actionsView;
        View viewFindViewById9 = constraintLayout.findViewById(R$id.photoHeader_userStatusBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.z = (UserStatusBadgeView) viewFindViewById9;
        View viewFindViewById10 = constraintLayout.findViewById(R$id.photoHeader_wallpaperContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById10;
        this.f59438m = viewGroup;
        View viewFindViewById11 = viewGroup.findViewById(R$id.photoHeader_wallpaperView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) viewFindViewById11;
        this.f59439n = wallpaperAssetSwitcher;
        View viewFindViewById12 = constraintLayout.findViewById(R$id.photoHeader_toolbarLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById12;
        this.f59444t = constraintLayout2;
        View viewFindViewById13 = constraintLayout2.findViewById(R$id.photoHeader_navigationButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        NavBarNavigationButtonView navBarNavigationButtonView = (NavBarNavigationButtonView) viewFindViewById13;
        this.u = navBarNavigationButtonView;
        View viewFindViewById14 = constraintLayout2.findViewById(R$id.photoHeader_toolbarTitleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.v = (TextView) viewFindViewById14;
        View viewFindViewById15 = constraintLayout2.findViewById(R$id.photoHeader_toolbarSubtitleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f59445w = (TextView) viewFindViewById15;
        View viewFindViewById16 = constraintLayout2.findViewById(R$id.photoHeader_menuRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        com.revolut.core.ui_kit.internal.views.navbar.d dVar = new com.revolut.core.ui_kit.internal.views.navbar.d((RecyclerView) viewFindViewById16);
        this.L = dVar;
        fp0.p clickHandler = navBarNavigationButtonView.getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 15));
        actionsView.f58296a.f121375b.subscribe(new o1(new c4(this, 0), 14));
        dVar.f57403b.subscribe(new o1(new c4(this, 1), 15));
        wallpaperAssetSwitcher.h().subscribe(new o1(new c4(this, 2), 16));
        wallpaperAssetSwitcher.setBackground(NavBarWithContainerBackground.TransparentBackground.f57882a, null);
        viewGroup.setOutlineProvider(bVar);
        viewGroup.setClipToOutline(true);
        fp0.p.Companion.getClass();
        this.T = fp0.m.a(appCompatTextView, gp0.b.f145198a);
    }

    private final void setActions(List<ActionsView.Item> actions) {
        boolean zIsEmpty = actions.isEmpty();
        ActionsView actionsView = this.f59443s;
        if (zIsEmpty) {
            actionsView.setVisibility(8);
            return;
        }
        actionsView.setLayoutType(mx0.l.HEADER_CIRCLE_ACTIONS);
        actionsView.k(actions, mx0.t.f210002a);
        actionsView.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setBackgroundCollapsed(boolean r5) {
        /*
            r4 = this;
            android.view.ViewGroup r0 = r4.f59438m
            int r1 = r0.getWidth()
            if (r1 == 0) goto L78
            int r0 = r0.getHeight()
            if (r0 == 0) goto L78
            boolean r0 = r4.B
            if (r5 != r0) goto L14
            goto L78
        L14:
            android.animation.ValueAnimator r0 = r4.C
            r1 = 0
            if (r0 == 0) goto L28
            boolean r2 = r0.isRunning()
            if (r2 == 0) goto L20
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.getAnimatedValue()
            goto L29
        L28:
            r0 = r1
        L29:
            boolean r2 = r0 instanceof java.lang.Float
            if (r2 == 0) goto L30
            r1 = r0
            java.lang.Float r1 = (java.lang.Float) r1
        L30:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r1 == 0) goto L3a
            float r1 = r1.floatValue()
            goto L3f
        L3a:
            if (r5 == 0) goto L3e
            r1 = r2
            goto L3f
        L3e:
            r1 = r0
        L3f:
            if (r5 == 0) goto L42
            goto L43
        L42:
            r0 = r2
        L43:
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 != 0) goto L4e
            r4.y()
            r4.C()
            return
        L4e:
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r2)
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            mx0.w5 r1 = new mx0.w5
            r2 = 9
            r1.<init>(r4, r2)
            r0.addUpdateListener(r1)
            r4.B = r5
            android.animation.ValueAnimator r5 = r4.C
            if (r5 == 0) goto L73
            r5.cancel()
        L73:
            r4.C = r0
            r0.start()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.PhotoHeaderView.setBackgroundCollapsed(boolean):void");
    }

    private final void setBackgroundCollapsedRatio(float ratio) {
        AvatarView avatarView = this.o;
        ViewGroup viewGroup = this.f59438m;
        float fMax = Math.max(AnimationUtils.lerp(1.0f, (avatarView.getWidth() * 1.0f) / viewGroup.getWidth(), ratio), AnimationUtils.lerp(1.0f, (avatarView.getHeight() * 1.0f) / viewGroup.getHeight(), ratio));
        viewGroup.setScaleX(fMax);
        viewGroup.setScaleY(fMax);
        viewGroup.setTranslationY((((avatarView.getHeight() - getHeight()) / 2) + avatarView.getTop()) * ratio);
        this.K.f59448a = ratio;
        viewGroup.invalidateOutline();
        C();
        y();
    }

    private final void setMedia(kw0.g model) {
        i1 i1Var;
        NavBarWithContainerBackground background;
        AvatarModel avatarModelV;
        kw0.f fVar = model.f190189b;
        if ((fVar instanceof kw0.d) || (fVar instanceof kw0.e)) {
            i1Var = i1.SIZE_100_100;
        } else {
            if (fVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            i1Var = i1.SIZE_80_80;
        }
        AvatarView avatarView = this.o;
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
        if (fVar != null && (avatarModelV = fVar.v()) != null) {
            avatarView.setModel(avatarModelV);
        }
        avatarView.setVisibility((fVar != null ? fVar.v() : null) != null ? 0 : 8);
        if (fVar == null || (background = fVar.getBackground()) == null) {
            background = NavBarWithContainerBackground.TransparentBackground.f57882a;
        }
        this.f59439n.setBackground(background, null);
        float f = A() ? 32.0f : 24.0f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f59447y.setGuidelineEnd(kli.a.k(context, f));
    }

    private final void setTitle(kw0.j title) {
        int i;
        dw0.b bVar;
        boolean z;
        kw0.i iVarA = title != null ? title.a() : null;
        int i2 = iVarA == null ? -1 : d4.f275106a[iVarA.ordinal()];
        if (i2 == -1) {
            i = 0;
        } else if (i2 == 1) {
            i = R$attr.internal_textAppearanceHeading1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceDisplay2;
        }
        AppCompatTextView appCompatTextView = this.f59441q;
        if (i != 0) {
            jb3.l.e(appCompatTextView, i);
        }
        if (title == null) {
            bVar = null;
            z = false;
        } else {
            if (!(title instanceof kw0.h)) {
                throw new NoWhenBranchMatchedException();
            }
            kw0.h hVar = (kw0.h) title;
            bVar = hVar.f190193b;
            kli.a.b(appCompatTextView, hVar.f190192a, ty0.f.f275450a);
            z = true;
        }
        UserStatusBadgeView userStatusBadgeView = this.z;
        if (bVar != null) {
            userStatusBadgeView.setModel(bVar);
        }
        userStatusBadgeView.setVisibility(bVar != null ? 0 : 8);
        appCompatTextView.setVisibility(z ? 0 : 8);
        appCompatTextView.setMaxLines(bVar != null ? 1 : 3);
        if (bVar != null) {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatTextView, 1);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatTextView, kli.a.B(context, 14.0f), (int) appCompatTextView.getTextSize(), 1, 0);
        } else {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatTextView, 0);
        }
        if (title != null) {
            TrackableItem.INSTANCE.getClass();
            TrackableItem.Companion.a(this, null);
            Clause clause = ((kw0.h) title).f190192a;
            if (clause != null) {
                Intrinsics.checkNotNullParameter(clause, "clause");
            }
            fp0.p pVar = this.T;
            fp0.p.b(pVar, false);
            View view = pVar.f137029a;
            or0.m.a(view);
            or0.u.o(view);
        }
    }

    private final void setToolbar(kw0.k toolbar) {
        zi0.c.g(this.u, toolbar.f190195a);
        this.L.setMenuItems(toolbar.f190196b);
        kli.a.b(this.v, toolbar.f190197c, ty0.f.f275450a);
        kli.a.b(this.f59445w, toolbar.d, ty0.f.f275450a);
    }

    public static void x(PhotoHeaderView photoHeaderView, ValueAnimator valueAnimator) {
        photoHeaderView.setBackgroundCollapsedRatio(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public final boolean A() {
        kw0.g gVar = this.A;
        return (gVar != null ? gVar.f190189b : null) instanceof kw0.d;
    }

    public final boolean B() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return this.B;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) animatedValue).floatValue() > 0.5f;
    }

    public final void C() {
        boolean z = A() && !B();
        if (z || this.P >= 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j70.a aVarA = wr0.a.a(context);
            if (aVarA == null) {
                return;
            }
            WallpaperAssetSwitcher wallpaperAssetSwitcher = this.f59439n;
            ViewGroup viewGroup = this.f59438m;
            if (!z) {
                if (this.P >= 0) {
                    this.P = -1;
                    Drawable foreground = viewGroup.getForeground();
                    if (foreground != null) {
                        foreground.setAlpha(0);
                    }
                    w0.e(wallpaperAssetSwitcher, aVarA);
                    return;
                }
                return;
            }
            Drawable foreground2 = viewGroup.getForeground();
            boolean z3 = foreground2 instanceof WallpaperAssetOverlayDrawable;
            Object obj2 = foreground2;
            if (!z3) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = new WallpaperAssetOverlayDrawable(context2, 28.0f, BitmapDescriptorFactory.HUE_RED);
                wallpaperAssetOverlayDrawable.f57373j = true;
                wallpaperAssetOverlayDrawable.invalidateSelf();
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                wallpaperAssetOverlayDrawable.a(new q8(kli.a.s(R$attr.uikit_windowBackground, context3), 0, BitmapDescriptorFactory.HUE_RED, false), false);
                viewGroup.setForeground(wallpaperAssetOverlayDrawable);
                obj2 = wallpaperAssetOverlayDrawable;
            }
            ((WallpaperAssetOverlayDrawable) obj2).setAlpha(255);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int height = getHeight() - kli.a.k(context4, 150.0f);
            int height2 = (getHeight() * 2) / 3;
            if (height > height2) {
                height = height2;
            }
            if (height == this.P) {
                return;
            }
            this.P = height;
            int height3 = getHeight();
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            w0.b(wallpaperAssetSwitcher, zhm.u.c(new qo0.e(BitmapDescriptorFactory.HUE_RED, kli.a.l(context5, 50.0f), height, height3)), aVarA);
        }
    }

    @Override // au0.o
    public final void k(float f, int i) {
        boolean z;
        this.f59444t.setTranslationY(-i);
        if (A()) {
            f = AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0.6f, f);
        }
        AccelerateInterpolator accelerateInterpolator = u1.f169315a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fA = u1.a(context, f);
        float fB = u1.b(f);
        float f4 = 1 - fB;
        TextView textView = this.v;
        textView.setTranslationY(fA);
        textView.setAlpha(f4);
        TextView textView2 = this.f59445w;
        textView2.setTranslationY(fA);
        textView2.setAlpha(f4);
        this.f59441q.setAlpha(f);
        this.f59440p.setAlpha(f);
        this.f59442r.setAlpha(f);
        this.f59443s.setAlpha(f);
        this.o.setContentAlpha(f);
        this.f59438m.setAlpha(f);
        this.z.setAlpha(f);
        float f5 = fB * fB;
        int iBlendARGB = ColorUtils.blendARGB(this.F, this.E, f5);
        int iBlendARGB2 = ColorUtils.blendARGB(this.G, this.E, f5);
        textView.setTextColor(iBlendARGB);
        textView2.setTextColor(iBlendARGB2);
        this.L.f(iBlendARGB, 0);
        if (A()) {
            setBackgroundCollapsed(getLastExpandRatio$ui_kit_components_release() < 0.8f);
            z = !this.B;
        } else {
            z = f > 0.6f;
        }
        y9 y9Var = z ? this.N : y9.THEME;
        this.O = y9Var;
        n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.a(y9Var);
        }
    }

    @Override // au0.o
    public final float l() {
        kw0.g gVar = this.A;
        kw0.f fVar = gVar != null ? gVar.f190189b : null;
        if (fVar instanceof kw0.e) {
            if (getLastExpandRatio$ui_kit_components_release() >= 0.5f) {
                return 1.0f;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (!(fVar instanceof kw0.d)) {
            if (fVar == null) {
                return -1.0f;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (getLastExpandRatio$ui_kit_components_release() >= 0.8f) {
            return 1.0f;
        }
        if (getLastExpandRatio$ui_kit_components_release() > 0.25f) {
            return 0.6f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        this.f59446x.setGuidelineBegin(this.f59437l.getMinimumHeight() + i);
        or0.u.z(this.f59444t, 0, i, 0, 0, false, 29);
        return super.onApplyWindowInsets(insets);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        h30.q qVar;
        Window window;
        View decorView;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a5.a styleApplicator = new a5.a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
        }
        ix0.o1 priority = ix0.o1.OVERLAY;
        Intrinsics.checkNotNullParameter(priority, "priority");
        n1 n1Var = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        this.M = n1Var;
        y9 y9Var2 = this.O;
        if (y9Var2 != null) {
            n1Var.a(y9Var2);
        }
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.b();
            this.M = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.D) {
            this.D = false;
            setBackgroundCollapsedRatio(BitmapDescriptorFactory.HUE_RED);
            if (this.B && A()) {
                setBackgroundCollapsedRatio(1.0f);
            }
            k(this.f9292a, this.f9294c);
        }
        C();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        kw0.c cVar;
        kw0.g gVar = this.A;
        kw0.b bVar = kw0.b.f190185a;
        if (gVar == null || (cVar = gVar.f190191g) == null) {
            cVar = bVar;
        }
        if (cVar instanceof kw0.a) {
            int size = View.MeasureSpec.getSize(i);
            d0 d0Var = ((kw0.a) cVar).f190184a;
            i2 = View.MeasureSpec.makeMeasureSpec((size * d0Var.f10275b) / d0Var.f10274a, 1073741824);
        } else if (!cVar.equals(bVar)) {
            throw new NoWhenBranchMatchedException();
        }
        super.onMeasure(i, i2);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorScheme.a(), context);
        this.f59441q.setTextColor(iS);
        this.f59442r.setTextColor(iS);
        this.E = iS;
        this.N = colorScheme.c();
        k(this.f9292a, this.f9294c);
    }

    public final void setContent(@NotNull kw0.g model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kw0.g gVar = this.A;
        if (Intrinsics.f(model, gVar)) {
            return;
        }
        this.A = model;
        kw0.f fVar = gVar != null ? gVar.f190189b : null;
        kw0.f fVar2 = model.f190189b;
        List<ActionsView.Item> list = model.f;
        kw0.k kVar = model.f190188a;
        Clause clause = model.e;
        kw0.j jVar = model.d;
        Clause clause2 = model.f190190c;
        if (!Intrinsics.f(fVar, fVar2)) {
            this.D = true;
            setMedia(model);
        }
        if (!Intrinsics.f(gVar != null ? gVar.f190190c : null, clause2)) {
            kli.a.b(this.f59440p, clause2, ty0.f.f275450a);
        }
        if (!Intrinsics.f(gVar != null ? gVar.d : null, jVar)) {
            setTitle(jVar);
        }
        if (!Intrinsics.f(gVar != null ? gVar.e : null, clause)) {
            kli.a.b(this.f59442r, clause, ty0.f.f275450a);
        }
        if (!Intrinsics.f(gVar != null ? gVar.f190188a : null, kVar)) {
            setToolbar(kVar);
        }
        if (!Intrinsics.f(gVar != null ? gVar.f : null, list)) {
            setActions(list);
        }
        if (Intrinsics.f(gVar != null ? gVar.f190191g : null, model.f190191g)) {
            return;
        }
        requestLayout();
    }

    public final void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.L.setMenuItems(menuItems);
    }

    public final void y() {
        x8 x8Var = this.H;
        x8 x8Var2 = this.J;
        if (x8Var == null) {
            x8Var = x8Var2;
        }
        if (!A() || !B()) {
            x8Var2 = x8Var;
        }
        if (Intrinsics.f(this.I, x8Var2)) {
            return;
        }
        this.I = x8Var2;
        foh.i.e(this, x8Var2.f10609a, x8Var2.f10610b, x8Var2.f10611c, x8Var2.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoHeaderView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
