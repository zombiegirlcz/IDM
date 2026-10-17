package az0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.transition.RevTransitionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.internal.views.multibar.MultiBarView;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreen;
import ix0.g2;
import ix0.h2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import ms0.g3;
import ms0.i3;

/* JADX INFO: loaded from: classes20.dex */
public final class o0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11337c;

    public /* synthetic */ o0(Object obj2, Object obj3, int i) {
        this.f11335a = i;
        this.f11336b = obj2;
        this.f11337c = obj3;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
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

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f11335a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            default:
                zxl.a aVar = (zxl.a) this.f11336b;
                int i = zxl.a.d;
                aVar.a(true);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i = this.f11335a;
        Object obj2 = this.f11337c;
        Object obj3 = this.f11336b;
        switch (i) {
            case 0:
                ((LottieAnimationView) obj3).getOverlay().remove((LottieDrawable) obj2);
                break;
            case 1:
                PortfolioRevealLoadingScreen portfolioRevealLoadingScreen = (PortfolioRevealLoadingScreen) obj3;
                if (portfolioRevealLoadingScreen.N == ((AnimatorSet) obj2)) {
                    portfolioRevealLoadingScreen.N = null;
                    portfolioRevealLoadingScreen.d3().f174540c.setAlpha(1.0f);
                    b8f.n nVar = (b8f.n) portfolioRevealLoadingScreen.R.getValue();
                    nVar.H2(nVar.f13246t, new b73.h(26));
                    nVar.I2();
                }
                break;
            case 2:
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj3;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList.get(i2)).setHasTransientState(false);
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                h2 h2Var = (h2) obj2;
                h2Var.f169243b = null;
                g2 g2Var = (g2) obj3;
                if (!g2Var.f169239a) {
                    if (g2Var.f169240b) {
                        h2Var.c();
                    } else {
                        h2Var.d(false);
                    }
                }
                break;
            case 5:
                ViewParent parent = ((jji.c) obj3).f174958b.getParent();
                Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView((AppCompatImageView) obj2);
                break;
            case 6:
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    ((AnimatorSet) obj2).start();
                }
                break;
            case 7:
                i3 i3Var = (i3) obj3;
                i3Var.f208280a.setWillNotDraw(true);
                i3Var.f208281b = null;
                break;
            case 8:
                break;
            case 9:
                mt0.g gVar = (mt0.g) obj3;
                ShadowLayout shadowLayout = gVar.f208693a;
                Intrinsics.checkNotNullParameter(shadowLayout, "<this>");
                shadowLayout.resetPivot();
                ks0.l lVar = gVar.f;
                Object obj4 = gVar.e;
                Float fValueOf = Float.valueOf(1.0f);
                ks0.l.d(lVar, obj4, null, fValueOf, fValueOf, 6);
                View view = gVar.f208694b;
                view.setPivotX(BitmapDescriptorFactory.HUE_RED);
                view.setPivotY(BitmapDescriptorFactory.HUE_RED);
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.resetPivot();
                view.setScaleX(0.77f);
                view.setScaleY(0.77f);
                Rect rect = (Rect) obj2;
                RevTransitionUtils.setLeftTopRightBottom(shadowLayout, rect.left, rect.top, rect.right, rect.bottom);
                gVar.f208698j.invoke();
                break;
            case 10:
                ((NavBarWithContainer) obj3).H = false;
                ((CollapsingAppBarLayout$Behavior) obj2).setTopAndBottomOffset(0);
                break;
            case 11:
                ((WallpaperAssetSwitcher) obj3).setBackground((ColorDrawable) obj2);
                break;
            case 12:
                ux0.j jVar = (ux0.j) obj3;
                jVar.f283756a.setWillNotDraw(true);
                jVar.f283757b = null;
                break;
            case 13:
                ux0.s0 s0Var = (ux0.s0) obj3;
                s0Var.getAccountsSelectionView().setHasTransientState(false);
                s0Var.f = null;
                ux0.l0 l0Var = s0Var.i;
                if (Intrinsics.f(l0Var, (ux0.k0) obj2)) {
                    s0Var.i(l0Var.o());
                }
                break;
            case 14:
                vt0.d dVar = (vt0.d) obj2;
                if (((com.revolut.core.ui_kit.models.lightprompt.a) obj3) == null) {
                    dVar.setState(vt0.b.LIST_SCREEN);
                } else {
                    vt0.d.e(dVar);
                }
                break;
            case 15:
                ((xp0.c) obj3).invoke();
                ((xp0.f) obj2).e = null;
                break;
            case 16:
                MultiBarView multiBarView = (MultiBarView) obj3;
                multiBarView.items = (List) obj2;
                multiBarView.startRevealAnimation();
                break;
            default:
                int i3 = zxl.a.d;
                ((zxl.a) obj3).a(false);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f11335a) {
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) throws IOException {
        switch (this.f11335a) {
            case 0:
            case 1:
                break;
            case 2:
                ((View) this.f11336b).setTag(R$id.internal_jump_animation_tag, (cx0.d) this.f11337c);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f11337c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    view.setHasTransientState(true);
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (((g2) this.f11336b).f169239a) {
                    for (View view2 : ((h2) this.f11337c).f169242a) {
                        view2.setVisibility(0);
                        view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }
                }
                break;
            case 5:
            case 6:
                break;
            case 7:
                i3 i3Var = (i3) this.f11336b;
                i3Var.f208280a.setWillNotDraw(false);
                i3Var.f208280a.f0((g3) this.f11337c);
                break;
            case 8:
                mt0.g gVar = (mt0.g) this.f11336b;
                ks0.l lVar = gVar.f;
                Object obj2 = gVar.e;
                Float fValueOf = Float.valueOf(1.02f);
                ks0.l.d(lVar, obj2, null, fValueOf, fValueOf, 6);
                View view3 = gVar.f208694b;
                view3.setVisibility(0);
                view3.setAlpha(BitmapDescriptorFactory.HUE_RED);
                ShadowLayout shadowLayout = gVar.f208693a;
                float cornersRadius = shadowLayout.getCornersRadius();
                Context context = shadowLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float fZ = kli.a.z(gVar.f208697h / 2, context);
                Rect rect = new Rect(shadowLayout.getLeft(), shadowLayout.getTop(), shadowLayout.getWidth() + shadowLayout.getLeft(), shadowLayout.getHeight() + shadowLayout.getTop());
                Rect rect2 = new Rect(rect);
                rect2.top = rect2.bottom - gVar.f208697h;
                gVar.a((ValueAnimator) this.f11337c, new mt0.d(gVar, cornersRadius, fZ, rect, rect2));
                break;
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                ux0.j jVar = (ux0.j) this.f11336b;
                jVar.f283756a.setWillNotDraw(false);
                ux0.a aVar = jVar.f283756a;
                ux0.h hVar = (ux0.h) this.f11337c;
                kli.a.b(aVar.f283728s, hVar.f283750b.f283786a, ty0.f.f275450a);
                kli.a.b(aVar.f283729t, hVar.f283750b.f283787b, ty0.f.f275450a);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            default:
                ((qg7.k) this.f11337c).invoke();
                break;
        }
    }
}
