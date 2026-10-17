package com.revolut.feature.freelancer.impl.ui.profile.terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.e1;
import us6.q;
import vc.s;
import w07.b;
import w07.g;
import w07.i;
import w07.k;
import xki.e;
import yhm.d;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/terms/FreelancerTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/freelancer/impl/ui/profile/terms/FreelancerTermsScreenContract$OutputData;", "Ldli/a;", "Lw07/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class FreelancerTermsScreen extends ViewController<FreelancerTermsScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final FreelancerTermsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FreelancerTermsScreen(FreelancerTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: w07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTermsScreen f293651b;

            {
                this.f293651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerTermsScreen freelancerTermsScreen = this.f293651b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTermsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerTermsScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerTermsScreenContract$InputData freelancerTermsScreenContract$InputData = freelancerTermsScreen.K;
                        freelancerTermsScreenContract$InputData.getClass();
                        return new e1(qVar, freelancerTermsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTermsScreen.S;
                        return (i) ((e1) freelancerTermsScreen.P.getValue()).f282505c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTermsScreen.S;
                        FreelancerTermsScreen freelancerTermsScreen2 = this.f293651b;
                        return dli.f.a(freelancerTermsScreen2, freelancerTermsScreen2.d(), v.k(new RowLoadingDelegate(), freelancerTermsScreen2.N, freelancerTermsScreen2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: w07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTermsScreen f293651b;

            {
                this.f293651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerTermsScreen freelancerTermsScreen = this.f293651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTermsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerTermsScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerTermsScreenContract$InputData freelancerTermsScreenContract$InputData = freelancerTermsScreen.K;
                        freelancerTermsScreenContract$InputData.getClass();
                        return new e1(qVar, freelancerTermsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTermsScreen.S;
                        return (i) ((e1) freelancerTermsScreen.P.getValue()).f282505c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTermsScreen.S;
                        FreelancerTermsScreen freelancerTermsScreen2 = this.f293651b;
                        return dli.f.a(freelancerTermsScreen2, freelancerTermsScreen2.d(), v.k(new RowLoadingDelegate(), freelancerTermsScreen2.N, freelancerTermsScreen2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: w07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTermsScreen f293651b;

            {
                this.f293651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerTermsScreen freelancerTermsScreen = this.f293651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTermsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerTermsScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerTermsScreenContract$InputData freelancerTermsScreenContract$InputData = freelancerTermsScreen.K;
                        freelancerTermsScreenContract$InputData.getClass();
                        return new e1(qVar, freelancerTermsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTermsScreen.S;
                        return (i) ((e1) freelancerTermsScreen.P.getValue()).f282505c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTermsScreen.S;
                        FreelancerTermsScreen freelancerTermsScreen2 = this.f293651b;
                        return dli.f.a(freelancerTermsScreen2, freelancerTermsScreen2.d(), v.k(new RowLoadingDelegate(), freelancerTermsScreen2.N, freelancerTermsScreen2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        g gVar = uiState.f293658b;
        boolean z = gVar instanceof w07.h;
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView.setVisibility(z ? 0 : 8);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setVisibility(z ? 0 : 8);
        if (z) {
            d3().f174558c.setTextClause(((w07.h) gVar).f293656a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e1) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_terms_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.freelancer_terms_action_confirm, null, null, 14));
        largeActionButton.setTag("TAG_CONFIRM_BUTTON");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new w07.d(this, null, 0), 3);
        ViewController.P2(this, new v2e.h0(rd0.e.b(this.N.f53218h), 25), new vrl.d(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new w07.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new w07.d(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
