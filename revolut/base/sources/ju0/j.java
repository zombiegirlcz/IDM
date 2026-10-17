package ju0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import aw0.s8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.r;
import ix0.d2;
import ix0.f2;
import ix0.h1;
import ju0.a;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends FrameLayout implements d2 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WallpaperAssetSwitcher f178561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShimmerFrameLayout f178562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f178563c;
    public final l d;
    public final ihm.f e;
    public i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f178564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f178565h;
    public final f2 i;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setNewImageBackground(g gVar) throws Throwable {
        this.f178564g = false;
        k model = new k(gVar.f178558b, gVar.f178559c);
        l lVar = this.d;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        lVar.c();
        lVar.f178569b = model;
        this.f178561a.setBackground(new NavBarWithContainerBackground.ImageBackground(gVar.f178557a, (s8) null, (Color.SolidRes) null, 14), new e(this, 4));
    }

    private final void setNewVideoBackground(h hVar) {
        this.f178565h = false;
        this.f178561a.setBackground(new NavBarWithContainerBackground.VideoBackground(hVar.f178560a, (Image) null, (VideoShutter) null, (s8) null, 30), null);
    }

    @Override // ix0.d2
    public final void C() {
        this.d.c();
        Lazy lazy = h1.f169241a;
        h1.e(this.f178563c);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    @Override // ix0.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(boolean r15) {
        /*
            r14 = this;
            ju0.i r0 = r14.f
            boolean r0 = r0 instanceof ju0.g
            if (r0 == 0) goto L67
            boolean r0 = r14.f178564g
            if (r0 == 0) goto L67
            ju0.l r1 = r14.d
            if (r15 == 0) goto L12
            r1.b()
            return
        L12:
            boolean r15 = r1.f178570c
            if (r15 != 0) goto L17
            goto L67
        L17:
            ju0.k r15 = r1.f178569b
            if (r15 != 0) goto L1c
            goto L67
        L1c:
            long r2 = r15.f178566a
            long r4 = kotlin.time.b.f(r2)
            ju0.k r15 = r1.f178569b
            r2 = 0
            if (r15 != 0) goto L2a
        L28:
            r6 = r2
            goto L53
        L2a:
            long r6 = r15.f178566a
            long r6 = kotlin.time.b.f(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L35
            goto L28
        L35:
            boolean r0 = r1.f178570c
            if (r0 == 0) goto L44
            long r8 = r1.d
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r12 = r1.e
            long r10 = r10 - r12
            long r10 = r10 + r8
            goto L46
        L44:
            long r10 = r1.d
        L46:
            boolean r15 = r15.f178567b
            if (r15 == 0) goto L4d
            long r6 = r10 % r6
            goto L53
        L4d:
            int r15 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r15 <= 0) goto L52
            goto L53
        L52:
            r6 = r10
        L53:
            r1.d = r6
            r15 = 0
            r1.f178570c = r15
            kotlin.Lazy r15 = ix0.h1.f169241a
            fp0.l r15 = r1.f
            ix0.h1.e(r15)
            r1.e = r2
            r6 = 0
            long r2 = r1.d
            r1.a(r2, r4, r6)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.j.D(boolean):void");
    }

    public final void a() {
        Lazy lazy = h1.f169241a;
        h1.e(this.f178563c);
        ShimmerFrameLayout shimmerFrameLayout = this.f178562b;
        shimmerFrameLayout.animate().cancel();
        if (shimmerFrameLayout.getVisibility() == 8) {
            return;
        }
        shimmerFrameLayout.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(200L).withEndAction(new d(this, 1)).start();
    }

    public final boolean b() {
        i iVar = this.f;
        if ((iVar instanceof h) && this.f178565h) {
            return true;
        }
        return (iVar instanceof g) && this.f178564g;
    }

    public final void setBackground(@NotNull i background) {
        Intrinsics.checkNotNullParameter(background, "background");
        boolean zF = Intrinsics.f(background, this.f);
        this.f = background;
        l lVar = this.d;
        lVar.c();
        Lazy lazy = h1.f169241a;
        d dVar = this.f178563c;
        h1.e(dVar);
        if (background instanceof h) {
            this.f178564g = false;
            if (zF) {
                WallpaperAssetSwitcher wallpaperAssetSwitcher = this.f178561a;
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
                setNewVideoBackground((h) background);
            }
        } else {
            if (!(background instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!zF) {
                setNewImageBackground((g) background);
            } else if (this.f178564g) {
                this.f178564g = true;
                a();
                this.e.onNext(a.C1014a.f178545a);
                if (this.i.f169236c) {
                    lVar.b();
                }
            }
        }
        h1.e(dVar);
        if (b()) {
            return;
        }
        h1.d(1000L, dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, AttributeSet attributeSet, int i) {
        int iS;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(context, null, 6);
        wallpaperAssetSwitcher.setVideoScaleType(oz0.b.CENTER_CROP);
        this.f178561a = wallpaperAssetSwitcher;
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context);
        int iS2 = kli.a.s(R$attr.uikit_colorGroupedBackground, context);
        if (kli.a.q(context)) {
            iS = kli.a.s(R$attr.uikit_colorWhite, context);
        } else {
            iS = kli.a.s(R$attr.uikit_colorBlack, context);
        }
        c9.d dVar = new c9.d();
        dVar.o(iS2);
        c9.d dVar2 = (c9.d) ((c9.d) ((c9.d) dVar.j(0.1f)).i(true)).k(2000L);
        ((c9.e) dVar2.f22248b).d = iS;
        shimmerFrameLayout.d(((c9.d) dVar2.l(0.1f)).c());
        View view = new View(context);
        view.setBackgroundColor(iS2);
        shimmerFrameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        shimmerFrameLayout.setVisibility(8);
        this.f178562b = shimmerFrameLayout;
        this.f178563c = new d(this, 0);
        l lVar = new l();
        this.d = lVar;
        this.e = v0.a.d("create(...)");
        f2 f2Var = new f2(this, this);
        this.i = f2Var;
        addView(wallpaperAssetSwitcher, new FrameLayout.LayoutParams(-1, -1));
        addView(shimmerFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        wallpaperAssetSwitcher.f59498m.filter(new jof.a(27, new e(this, 0))).subscribe(new jof.a(28, new e(this, 1)));
        r rVarHide = lVar.f178568a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        rVarHide.filter(new jof.a(29, new e(this, 2))).subscribe(new f(0, new e(this, 3)));
        f2Var.a();
    }

    public /* synthetic */ j(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
