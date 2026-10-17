package au0;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.camerakit.ui.views.view.TrackingFaceMaskView;
import com.revolut.core.ui_kit.delegates.fg;
import com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.card_design.CardsEmptyStateView;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable;
import com.revolut.core.ui_kit.views.TwoViewsSwitcherView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.status.StatusView;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import fr0.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import mx0.ed;

/* JADX INFO: loaded from: classes19.dex */
public final class l5 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9268b;

    public /* synthetic */ l5(Object obj2, int i) {
        this.f9267a = i;
        this.f9268b = obj2;
    }

    private final void A(Animator animator) {
    }

    private final void A0(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void B0(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
    }

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
    }

    private final void K(Animator animator) {
    }

    private final void L(Animator animator) {
    }

    private final void M(Animator animator) {
    }

    private final void N(Animator animator) {
    }

    private final void O(Animator animator) {
    }

    private final void P(Animator animator) {
    }

    private final void Q(Animator animator) {
    }

    private final void R(Animator animator) {
    }

    private final void S(Animator animator) {
    }

    private final void T(Animator animator) {
    }

    private final void U(Animator animator) {
    }

    private final void V(Animator animator) {
    }

    private final void W(Animator animator) {
    }

    private final void X(Animator animator) {
    }

    private final void Y(Animator animator) {
    }

    private final void Z(Animator animator) {
    }

    private final void a(Animator animator) {
    }

    private final void a0(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void b0(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void c0(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void d0(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void e0(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void f0(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void g0(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void h0(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void i0(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void j0(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void k0(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void l0(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void m0(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void n0(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void o0(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void p0(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void q0(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void r0(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void s0(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void t0(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void u0(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void v0(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void w0(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void x0(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void y0(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    private final void z0(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f9267a) {
            case 8:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 14:
                ((Ref$BooleanRef) this.f9268b).f186407a = true;
                break;
            case 23:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 28:
                ((TrackingFaceMaskView) this.f9268b).o = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f9267a) {
            case 0:
                ((WallpaperAssetOverlayDrawable) this.f9268b).f57375m = false;
                break;
            case 1:
                ((u5) this.f9268b).e = null;
                break;
            case 2:
                RevolutShimmerDrawable revolutShimmerDrawable = (RevolutShimmerDrawable) this.f9268b;
                revolutShimmerDrawable.f56066j = false;
                revolutShimmerDrawable.e = false;
                break;
            case 3:
                CrossfadeDrawable crossfadeDrawable = (CrossfadeDrawable) this.f9268b;
                Drawable drawable = crossfadeDrawable.f55945c;
                if (drawable != null) {
                    drawable.setCallback(null);
                }
                crossfadeDrawable.f55945c = null;
                crossfadeDrawable.d = null;
                break;
            case 4:
                ((TransferToChatTransitionFlowContainerLayout) this.f9268b).k = false;
                break;
            case 5:
                ((StatusView) this.f9268b).f59715b.onNext(gy0.b.FINISHED);
                break;
            case 6:
                ((Function0) this.f9268b).invoke();
                break;
            case 7:
                break;
            case 8:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((iu0.f) this.f9268b).f168437b.start();
                break;
            case 9:
                ((iv0.j) this.f9268b).f.onAnimationEnd();
                break;
            case 10:
                break;
            case 11:
                ((jj2.a) this.f9268b).invoke();
                break;
            case 12:
                ((jy0.m) this.f9268b).o = null;
                break;
            case 13:
                lki.f fVar = (lki.f) this.f9268b;
                lea.b bVar = fVar.f196459h;
                fVar.f196459h = null;
                if (bVar != null) {
                    bVar.invoke();
                }
                break;
            case 14:
                break;
            case 15:
                ((Function1) this.f9268b).invoke(animation);
                break;
            case 16:
                ((mx0.x3) this.f9268b).invoke(animation);
                break;
            case 17:
                fr0.a aVar = (fr0.a) this.f9268b;
                aVar.f137319s = !aVar.f137319s;
                aVar.f137346c.add(j.d.f137354a);
                break;
            case 18:
                fr0.b bVar2 = (fr0.b) this.f9268b;
                bVar2.f137327t = !bVar2.f137327t;
                bVar2.f137346c.add(j.e.f137355a);
                break;
            case 19:
                TwoViewsSwitcherView twoViewsSwitcherView = (TwoViewsSwitcherView) this.f9268b;
                twoViewsSwitcherView.d = null;
                twoViewsSwitcherView.e = ed.IDLE;
                break;
            case 20:
                qo0.i iVar = (qo0.i) this.f9268b;
                if (iVar.f == animation) {
                    iVar.f = null;
                }
                break;
            case 21:
                rp0.f2 f2Var = (rp0.f2) this.f9268b;
                f2Var.d.getOverlay().remove(f2Var.f256080b);
                break;
            case 22:
                break;
            case 23:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((vt0.m) this.f9268b).setVisibility(8);
                break;
            case 24:
                ((ComparisonLineChartView) this.f9268b).I = null;
                break;
            case 25:
                break;
            case 26:
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = (TravelHotelsSearchResultsMapScreen) this.f9268b;
                p6.e eVar = travelHotelsSearchResultsMapScreen.f94045d0;
                travelHotelsSearchResultsMapScreen.f94045d0 = null;
                if (eVar != null) {
                    eVar.run();
                }
                break;
            case 27:
                ux0.s0 s0Var = (ux0.s0) this.f9268b;
                s0Var.getAccountsSelectionView().setHasTransientState(false);
                s0Var.f = null;
                s0Var.i(s0Var.i.o());
                break;
            case 28:
                ((TrackingFaceMaskView) this.f9268b).o = false;
                break;
            default:
                vs0.e eVar2 = (vs0.e) this.f9268b;
                eVar2.f291710b = null;
                eVar2.b(1.0f);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f9267a) {
            case 2:
                ((RevolutShimmerDrawable) this.f9268b).f56066j = false;
                break;
            case 7:
                fg fgVar = (fg) this.f9268b;
                RecyclerView recyclerView = fgVar.f;
                fgVar.getClass();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                recyclerView.smoothScrollToPosition(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() + 1);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f9267a) {
            case 8:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 9:
                ((iv0.j) this.f9268b).f.onAnimationStart();
                break;
            case 10:
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.f9268b;
                appCompatImageView.setAlpha(1.0f);
                appCompatImageView.setVisibility(0);
                break;
            case 22:
                CardsEmptyStateView.c((CardsEmptyStateView) this.f9268b);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 25:
                ((NavBarWithContainer) this.f9268b).H = true;
                break;
            case 28:
                ((TrackingFaceMaskView) this.f9268b).o = true;
                break;
        }
    }
}
