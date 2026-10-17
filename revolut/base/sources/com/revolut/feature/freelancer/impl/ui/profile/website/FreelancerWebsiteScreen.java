package com.revolut.feature.freelancer.impl.ui.profile.website;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import buf.u;
import c17.c;
import c17.d;
import c17.f;
import c17.g;
import c17.i;
import c17.j;
import c17.k;
import c17.m;
import c17.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import us6.w1;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/website/FreelancerWebsiteScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc17/i;", "Ldli/a;", "Lc17/n;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerWebsiteScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerWebsiteScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final h K;
    public final InputTextDelegate L;
    public final LargeActionButtonDelegate M;
    public final TwinHorizontalButtonDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FreelancerWebsiteScreen(FreelancerWebsiteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, c.f);
        this.L = new InputTextDelegate(null);
        this.M = new LargeActionButtonDelegate();
        this.N = new TwinHorizontalButtonDelegate();
        this.O = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: c17.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerWebsiteScreen f20386b;

            {
                this.f20386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerWebsiteScreen.S;
                        FreelancerWebsiteScreen freelancerWebsiteScreen = this.f20386b;
                        return dli.f.a(freelancerWebsiteScreen, freelancerWebsiteScreen.R2(), zhm.u.c(freelancerWebsiteScreen.L), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FreelancerWebsiteScreen.S;
                        w1 w1Var = (w1) this.f20386b.Q.getValue();
                        switch (w1Var.f282787a) {
                            case 0:
                                return (j) w1Var.i.get();
                            case 1:
                                return (j) w1Var.i.get();
                            default:
                                return (j) w1Var.i.get();
                        }
                }
            }
        });
        this.Q = w.y0(new u(this, inputData, 17));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: c17.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerWebsiteScreen f20386b;

            {
                this.f20386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerWebsiteScreen.S;
                        FreelancerWebsiteScreen freelancerWebsiteScreen = this.f20386b;
                        return dli.f.a(freelancerWebsiteScreen, freelancerWebsiteScreen.R2(), zhm.u.c(freelancerWebsiteScreen.L), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FreelancerWebsiteScreen.S;
                        w1 w1Var = (w1) this.f20386b.Q.getValue();
                        switch (w1Var.f282787a) {
                            case 0:
                                return (j) w1Var.i.get();
                            case 1:
                                return (j) w1Var.i.get();
                            default:
                                return (j) w1Var.i.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        m mVar = uiState.f20400a;
        TextLocalisedClause textLocalisedClause = mVar.f20397a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(mVar.f20398b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setMenuItems(mVar.f20399c);
        LargeActionButton largeActionButton = d3().f174557b;
        k kVar = uiState.f20402c;
        largeActionButton.setEnabled(kVar.f20393a);
        largeActionButton.setText(kVar.f20394b);
        largeActionButton.setIcon(kVar.f20395c);
        d3().f174558c.setTextClause(uiState.d.f20396a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setEnabled(false);
        largeActionButton.setTag("SAVE_BUTTON_TAG");
        w1 w1Var = (w1) this.Q.getValue();
        switch (w1Var.f282787a) {
            case 0:
                aVar = (j60.a) w1Var.e.get();
                break;
            case 1:
                aVar = (j60.a) w1Var.e.get();
                break;
            default:
                aVar = (j60.a) w1Var.e.get();
                break;
        }
        aVar.d(v.k(this.M, this.N, new GridBoxDelegate(zhm.u.c(new IconDelegate()), 0, 24.0f, 24.0f, 2)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c17.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c17.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.p0()), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o.f57403b), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d.f121375b), null, new g(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new c17.e(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c17.e(this, null, 3), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
