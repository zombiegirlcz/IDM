package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import au0.p2;
import aw0.d0;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.BackgroundGradientDrawable;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.ShimmeringRectView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.TextSwitcherView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ix0.d2;
import ix0.f2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.l3;
import mx0.fd;
import org.jetbrains.annotations.NotNull;
import tx0.a1;
import tx0.b1;
import tx0.c1;
import tx0.d1;
import tx0.f1;
import tx0.u2;
import tx0.w0;
import tx0.x0;
import tx0.x2;
import tx0.y0;
import tx0.z0;
import yp0.j0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u0019\u001a\u001b\u000b\u001c\u001d\u001e\u001fB\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/MarketingPhotoHeaderContentView;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "", "Lix0/d2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltx0/a1;", "model", "", "setModel", "(Ltx0/a1;)V", "", "offset", "setBackgroundOffset", "(I)V", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "Companion", "tx0/c1", "tx0/d1", "PageDelegate", "tx0/b1", "tx0/w0", "a", "akm/c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarketingPhotoHeaderContentView extends FrameLayout implements x2, d2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ihm.b A;
    public final f2 B;
    public final w0 C;
    public int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WallpaperAssetSwitcher f59246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f59247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextSwitcherView f59248c;
    public final SmallActionButton d;
    public final ProgressPagingIndicatorView e;
    public LinearLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ShimmerFrameLayout f59249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59250h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59251j;
    public x8 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a1 f59252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z0 f59254n;
    public d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b1 f59255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f59256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f59257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f59258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f59259t;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ifm.c f59260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u2 f59261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z4l.j f59262y;
    public final ihm.f z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/MarketingPhotoHeaderContentView$PageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Ltx0/d1;", "Lcom/revolut/core/ui_kit/views/navbar/g;", "Lcom/revolut/core/ui_kit/views/navbar/MarketingPhotoHeaderContentView;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class PageDelegate extends BaseRecyclerViewDelegate<d1, g> {
        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            View itemView = new View(context);
            itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            return new g(itemView);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingPhotoHeaderContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59250h = -1.0f;
        this.f59253m = -1;
        this.o = new d0(100, 83);
        this.f59255p = b1.MEDIUM;
        this.f59256q = 1.0f;
        int i = 0;
        z4l.j jVar = new z4l.j(7, zhm.u.c(new PageDelegate(0, new tw8.g(3))), false);
        this.f59262y = jVar;
        this.z = v0.a.d("create(...)");
        ihm.b bVarE = ihm.b.e(0);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.A = bVarE;
        f2 f2Var = new f2(this, this);
        this.B = f2Var;
        this.C = new w0(this);
        this.D = -1;
        AttributeSet attributeSet2 = null;
        int i2 = 6;
        WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(context, null, 6);
        wallpaperAssetSwitcher.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f59246a = wallpaperAssetSwitcher;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setUserInputEnabled(true);
        this.f59247b = viewPager2;
        TextSwitcherView textSwitcherView = new TextSwitcherView(context, null, 6, 0);
        textSwitcherView.setId(R$id.marketingPhotoHeader_titleSwitcher);
        textSwitcherView.setPlayStrategy(fd.TOGETHER);
        textSwitcherView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textSwitcherView.setClipChildren(false);
        textSwitcherView.setInAnimatorFactory(new akm.c(true));
        textSwitcherView.setOutAnimatorFactory(new akm.c(false));
        int i3 = R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage;
        jb3.l.e(textSwitcherView.f58901h, i3);
        jb3.l.e(textSwitcherView.i, i3);
        textSwitcherView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        textSwitcherView.setGravity(81);
        textSwitcherView.setLines(2);
        textSwitcherView.setEllipsize(TextUtils.TruncateAt.END);
        this.f59248c = textSwitcherView;
        SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
        smallActionButton.setId(R$id.marketingPhotoHeader_button);
        smallActionButton.i(h4.ACCENT);
        fp0.p clickHandler = smallActionButton.getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 12));
        this.d = smallActionButton;
        this.e = new ProgressPagingIndicatorView(context, attributeSet2, i2, i);
        viewPager2.setAdapter(jVar);
        viewPager2.registerOnPageChangeCallback(new c1(this));
        RecyclerView recyclerViewA = j0.a(viewPager2);
        recyclerViewA.setOverScrollMode(2);
        recyclerViewA.setItemAnimator(null);
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(context, attributeSet2, i2, i);
        nestedScrollableHost.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nestedScrollableHost.addView(viewPager2);
        View view2 = new View(context);
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Color.Solid color = new Color.Solid(R$attr.uikit_windowBackground);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        view2.setBackground(new BackgroundGradientDrawable(io0.a.c(context, color), 0.65f));
        addView(wallpaperAssetSwitcher);
        addView(view2);
        addView(nestedScrollableHost);
        f2Var.a();
        wallpaperAssetSwitcher.f59498m.subscribe(new twl.h(24, new tpl.o(this, 25)));
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        e();
    }

    @Override // tx0.x2
    public final void H(int i) {
        this.v = i;
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), i);
        }
        ShimmerFrameLayout shimmerFrameLayout = this.f59249g;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setPaddingRelative(shimmerFrameLayout.getPaddingStart(), shimmerFrameLayout.getPaddingTop(), shimmerFrameLayout.getPaddingEnd(), i);
        }
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ViewGroup.LayoutParams(-1, -2);
    }

    public final void a() {
        a1 a1Var = this.f59252l;
        x0 x0Var = a1Var instanceof x0 ? (x0) a1Var : null;
        if (x0Var == null) {
            return;
        }
        List list = x0Var.f275269b;
        if (list.size() < 2) {
            return;
        }
        int i = this.f59253m >= list.size() - 1 ? 0 : this.f59253m + 1;
        this.f59247b.setCurrentItem(i, i != 0);
    }

    public final void b(int i, boolean z) {
        z0 z0Var;
        long j2;
        a1 a1Var = this.f59252l;
        x0 x0Var = a1Var instanceof x0 ? (x0) a1Var : null;
        if (x0Var == null || (z0Var = (z0) zhm.d0.e0(i, x0Var.f275269b)) == null) {
            return;
        }
        NavBarWithContainerBackground.VideoBackground videoBackground = z0Var.f275287b;
        if (i != this.f59253m || z) {
            z0 z0Var2 = this.f59254n;
            this.f59253m = i;
            this.f59259t = -1L;
            this.f59258s = 0L;
            this.f59257r = false;
            c();
            w0 w0Var = this.C;
            WallpaperAssetSwitcher wallpaperAssetSwitcher = this.f59246a;
            if (videoBackground.equals(NavBarWithContainerBackground.TransparentBackground.f57882a)) {
                int i2 = f1.f275118a[this.f59255p.ordinal()];
                if (i2 == 1) {
                    j2 = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
                } else if (i2 == 2) {
                    j2 = 5000;
                } else if (i2 == 3) {
                    j2 = 8000;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = -1;
                }
                w0Var.f275258c = j2;
                w0Var.d = 0L;
                w0Var.f275257b = 0L;
                w0Var.f275256a.removeCallbacks(w0Var.f);
                w0Var.a();
                w0Var.b();
                wallpaperAssetSwitcher.setBackground(videoBackground, null);
            } else {
                w0Var.f275258c = -1L;
                w0Var.d = 0L;
                w0Var.f275257b = 0L;
                w0Var.f275256a.removeCallbacks(w0Var.f);
                w0Var.a();
                w0Var.b();
                if (videoBackground.equals(z0Var2 != null ? z0Var2.f275287b : null)) {
                    UiKitPlayerView uiKitPlayerView = wallpaperAssetSwitcher.f59491a;
                    uiKitPlayerView.f57710l = 0L;
                    ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
                    if (exoPlayer != null) {
                        exoPlayer.seekTo(0L);
                        uiKitPlayerView.f57710l = null;
                    }
                    if (wallpaperAssetSwitcher.k && wallpaperAssetSwitcher.f59497l.isEmpty()) {
                        uiKitPlayerView.i();
                    }
                } else {
                    wallpaperAssetSwitcher.setBackground(videoBackground, null);
                }
            }
            this.f59248c.setText(z0Var.f275288c, z0Var2 != null);
            this.d.setText(z0Var.d);
            this.f59254n = z0Var;
            this.A.onNext(Integer.valueOf(i));
        }
    }

    public final void c() {
        int size;
        a1 a1Var = this.f59252l;
        if (a1Var == null) {
            return;
        }
        if (a1Var instanceof x0) {
            size = ((x0) a1Var).f275269b.size();
        } else {
            if (!(a1Var instanceof y0)) {
                throw new NoWhenBranchMatchedException();
            }
            size = 0;
        }
        int i = size > 1 ? 0 : 8;
        ProgressPagingIndicatorView progressPagingIndicatorView = this.e;
        progressPagingIndicatorView.setVisibility(i);
        if (size <= 1) {
            return;
        }
        progressPagingIndicatorView.setModel(new l3(this.f59258s, this.f59253m, size, this.f59259t, this.f59257r));
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        this.f59256q = f;
        int i2 = (-i) / 2;
        if (i2 != this.i) {
            this.i = i2;
            this.f59246a.setTranslationY(i2 + this.f59251j);
        }
        e();
    }

    @Override // tx0.x2
    public final void d0(int i) {
        this.u = i;
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), i, linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        }
        ShimmerFrameLayout shimmerFrameLayout = this.f59249g;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setPaddingRelative(shimmerFrameLayout.getPaddingStart(), i, shimmerFrameLayout.getPaddingEnd(), shimmerFrameLayout.getPaddingBottom());
        }
    }

    public final void e() {
        List list;
        a1 a1Var = this.f59252l;
        x0 x0Var = a1Var instanceof x0 ? (x0) a1Var : null;
        boolean z = true;
        boolean z3 = (x0Var == null || (list = x0Var.f275269b) == null) ? false : !list.isEmpty();
        float f = this.f59250h;
        boolean z4 = f >= BitmapDescriptorFactory.HUE_RED && this.f59256q < f;
        if (z3 && this.f59255p != b1.NONE && !z4 && this.B.f169236c) {
            z = false;
        }
        this.f59246a.setPlaybackPaused(0, z);
        w0 w0Var = this.C;
        if (z == w0Var.e) {
            return;
        }
        w0Var.e = z;
        if (w0Var.f275258c <= 0) {
            return;
        }
        w0Var.f275256a.removeCallbacks(w0Var.f);
        if (!z) {
            w0Var.a();
            w0Var.b();
            return;
        }
        long jUptimeMillis = (SystemClock.uptimeMillis() + w0Var.d) - w0Var.f275257b;
        long j2 = w0Var.f275258c;
        if (jUptimeMillis > j2) {
            jUptimeMillis = j2;
        }
        w0Var.d = jUptimeMillis;
        w0Var.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59260w = this.f59246a.h().subscribe(new twl.h(23, new su0.c(1, this, MarketingPhotoHeaderContentView.class, "onPaletteChanged", "onPaletteChanged(Lcom/revolut/core/ui_kit/models/PicturePalette;)V", 0, 25)));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ifm.c cVar = this.f59260w;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f59260w = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 == 0 && (size2 = this.D) < 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            size2 = c8g.c.G(context);
            this.D = size2;
        }
        d0 d0Var = this.o;
        int i3 = (size * d0Var.f10275b) / d0Var.f10274a;
        int i5 = (int) (size2 * 0.75f);
        if (i3 > i5) {
            i3 = i5;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
        if (offset != this.f59251j) {
            this.f59251j = offset;
            this.f59246a.setTranslationY(offset + this.i);
        }
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59261x = listener;
        x8 x8Var = this.k;
        if (x8Var == null || listener == null) {
            return;
        }
        listener.a(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
    }

    public final void setModel(@NotNull a1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model, this.f59252l)) {
            return;
        }
        a1 a1Var = this.f59252l;
        this.f59252l = model;
        boolean z = model instanceof x0;
        ProgressPagingIndicatorView progressPagingIndicatorView = this.e;
        int i = 0;
        AttributeSet attributeSet = null;
        if (!z) {
            if (!(model instanceof y0)) {
                throw new NoWhenBranchMatchedException();
            }
            d0 d0Var = ((y0) model).f275275b;
            if (!Intrinsics.f(this.o, d0Var)) {
                this.o = d0Var;
                requestLayout();
            }
            ShimmerFrameLayout shimmerFrameLayout = this.f59249g;
            if (shimmerFrameLayout == null) {
                shimmerFrameLayout = new ShimmerFrameLayout(getContext());
                shimmerFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                shimmerFrameLayout.setVisibility(8);
                Context context = shimmerFrameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i2 = 6;
                View shimmeringRectView = new ShimmeringRectView(context, attributeSet, i2, i);
                Context context2 = shimmeringRectView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = kli.a.k(context2, 216.0f);
                Context context3 = shimmeringRectView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, kli.a.k(context3, 32.0f));
                layoutParams.gravity = 81;
                Context context4 = shimmeringRectView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                layoutParams.bottomMargin = kli.a.k(context4, 110.0f);
                Context context5 = shimmeringRectView.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                layoutParams.setMarginStart(kli.a.k(context5, 24.0f));
                Context context6 = shimmeringRectView.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                layoutParams.setMarginEnd(kli.a.k(context6, 24.0f));
                shimmeringRectView.setLayoutParams(layoutParams);
                Context context7 = shimmerFrameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                View shimmeringRectView2 = new ShimmeringRectView(context7, attributeSet, i2, i);
                Context context8 = shimmeringRectView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                int iK2 = kli.a.k(context8, 140.0f);
                Context context9 = shimmeringRectView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iK2, kli.a.k(context9, 40.0f));
                layoutParams2.gravity = 81;
                Context context10 = shimmeringRectView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                layoutParams2.bottomMargin = kli.a.k(context10, 58.0f);
                shimmeringRectView2.setLayoutParams(layoutParams2);
                shimmerFrameLayout.addView(shimmeringRectView);
                shimmerFrameLayout.addView(shimmeringRectView2);
                ifk.b.r(shimmerFrameLayout);
                shimmerFrameLayout.setPaddingRelative(shimmerFrameLayout.getPaddingStart(), this.u, shimmerFrameLayout.getPaddingEnd(), this.v);
                this.f59249g = shimmerFrameLayout;
                addView(shimmerFrameLayout);
            }
            shimmerFrameLayout.setVisibility(0);
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            progressPagingIndicatorView.setVisibility(8);
            this.f59254n = null;
            e();
            c();
            return;
        }
        x0 x0Var = (x0) model;
        boolean z3 = x0Var.e;
        x0 x0Var2 = a1Var instanceof x0 ? (x0) a1Var : null;
        d0 d0Var2 = x0Var.d;
        b1 b1Var = x0Var.f275270c;
        List list = x0Var.f275269b;
        boolean z4 = z3 != (x0Var2 != null ? x0Var2.e : false);
        boolean z6 = (x0Var2 != null ? x0Var2.f275270c : null) != b1Var;
        boolean zF = Intrinsics.f(x0Var2 != null ? x0Var2.f275269b : null, list);
        if (z4) {
            this.f59250h = z3 ? 0.7f : -1.0f;
        }
        if (z6) {
            this.f59255p = b1Var;
        }
        if (!Intrinsics.f(this.o, d0Var2)) {
            this.o = d0Var2;
            requestLayout();
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.f59249g;
        if (shimmerFrameLayout2 != null) {
            shimmerFrameLayout2.setVisibility(8);
        }
        if (!zF) {
            if (list.isEmpty()) {
                LinearLayout linearLayout2 = this.f;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                this.f59254n = null;
            } else {
                LinearLayout linearLayout3 = this.f;
                if (linearLayout3 == null) {
                    linearLayout3 = new LinearLayout(getContext());
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams3.gravity = 80;
                    linearLayout3.setLayoutParams(layoutParams3);
                    linearLayout3.setOrientation(1);
                    linearLayout3.setGravity(1);
                    Context context11 = linearLayout3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                    int iK3 = kli.a.k(context11, 24.0f);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    Context context12 = linearLayout3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                    layoutParams4.bottomMargin = kli.a.k(context12, 12.0f);
                    TextSwitcherView textSwitcherView = this.f59248c;
                    textSwitcherView.setPaddingRelative(iK3, 0, iK3, 0);
                    linearLayout3.addView(textSwitcherView, layoutParams4);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.setMarginStart(iK3);
                    layoutParams5.setMarginEnd(iK3);
                    Context context13 = linearLayout3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                    layoutParams5.bottomMargin = kli.a.k(context13, 24.0f);
                    linearLayout3.addView(this.d, layoutParams5);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams6.setMarginStart(iK3);
                    layoutParams6.setMarginEnd(iK3);
                    Context context14 = linearLayout3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                    layoutParams6.bottomMargin = kli.a.k(context14, 24.0f);
                    linearLayout3.addView(progressPagingIndicatorView, layoutParams6);
                    linearLayout3.setPaddingRelative(linearLayout3.getPaddingStart(), this.u, linearLayout3.getPaddingEnd(), this.v);
                    this.f = linearLayout3;
                    addView(linearLayout3);
                }
                linearLayout3.setVisibility(0);
                f0 f0Var = f0.f322471a;
                z4l.j jVar = this.f59262y;
                jVar.c(f0Var);
                List<z0> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (z0 z0Var : list2) {
                    arrayList.add(new d1(z0Var.f275286a, z0Var));
                }
                jVar.c(arrayList);
                b(0, true);
            }
        }
        if (!zF || z6 || z4) {
            e();
        }
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarketingPhotoHeaderContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
