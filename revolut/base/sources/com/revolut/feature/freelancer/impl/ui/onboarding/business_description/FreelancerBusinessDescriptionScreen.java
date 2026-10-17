package com.revolut.feature.freelancer.impl.ui.onboarding.business_description;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jz6.b;
import jz6.c;
import jz6.d;
import jz6.h;
import jz6.i;
import jz6.j;
import jz6.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/business_description/FreelancerBusinessDescriptionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljz6/h;", "Ldli/a;", "Ljz6/l;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerBusinessDescriptionScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(FreelancerBusinessDescriptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final InputTextDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public FreelancerBusinessDescriptionScreen(FreelancerBusinessDescriptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        this.N = w.y0(new jnf.a(this, inputData, 17));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: jz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerBusinessDescriptionScreen f179588b;

            {
                this.f179588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerBusinessDescriptionScreen.Q;
                        return (i) ((us6.s) this.f179588b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerBusinessDescriptionScreen.Q;
                        FreelancerBusinessDescriptionScreen freelancerBusinessDescriptionScreen = this.f179588b;
                        return dli.f.a(freelancerBusinessDescriptionScreen, freelancerBusinessDescriptionScreen.R2(), u.c(freelancerBusinessDescriptionScreen.M), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerBusinessDescriptionScreen f179588b;

            {
                this.f179588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerBusinessDescriptionScreen.Q;
                        return (i) ((us6.s) this.f179588b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerBusinessDescriptionScreen.Q;
                        FreelancerBusinessDescriptionScreen freelancerBusinessDescriptionScreen = this.f179588b;
                        return dli.f.a(freelancerBusinessDescriptionScreen, freelancerBusinessDescriptionScreen.R2(), u.c(freelancerBusinessDescriptionScreen.M), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174558c.setTextClause(uiState.f179598b.f179596a);
        LargeActionButton largeActionButton = d3().f174557b;
        j jVar = uiState.f179599c;
        largeActionButton.setEnabled(jVar.f179593a);
        largeActionButton.setText(jVar.f179594b);
        largeActionButton.setIcon(jVar.f179595c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us6.s) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_business_description_header_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.freelancer_business_description_header_caption, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        largeActionButton.setEnabled(false);
        largeActionButton.setTag("TAG_CONTINUE_BUTTON");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174558c.f58608l), null, new jl6.b(2, R2(), i.class, "onFooterClauseClicked", "onFooterClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.e.f121375b), null, new d(2, 4, i.class, R2(), "onDescriptionChanged", "onDescriptionChanged(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$TextData;)V"), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
