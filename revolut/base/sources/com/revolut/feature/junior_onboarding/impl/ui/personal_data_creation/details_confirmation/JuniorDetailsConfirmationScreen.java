package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreen;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fi8.c;
import fi8.d;
import fi8.g;
import fi8.i;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qh8.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/JuniorDetailsConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfi8/g;", "Ldli/a;", "Lfi8/i;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorDetailsConfirmationScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(JuniorDetailsConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final JuniorDetailsConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsDelegate N;
    public final TextDelegate O;
    public final SelectableDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public JuniorDetailsConfirmationScreen(JuniorDetailsConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, c.f);
        this.N = new CellDetailsDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.O = textDelegate;
        this.P = new SelectableDelegate(textDelegate);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: fi8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorDetailsConfirmationScreen f135344b;

            {
                this.f135344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen = this.f135344b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorDetailsConfirmationScreen.T;
                        qji.b bVarU2 = juniorDetailsConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.di.JuniorDetailsConfirmationScreenInjector");
                        l lVar = (l) bVarU2;
                        qh8.k kVar = lVar.f246540a;
                        l lVar2 = lVar.f246541b;
                        JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData = juniorDetailsConfirmationScreen.K;
                        juniorDetailsConfirmationScreenContract$InputData.getClass();
                        return new qh8.h(kVar, lVar2, juniorDetailsConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorDetailsConfirmationScreen.T;
                        return (h) ((qh8.h) juniorDetailsConfirmationScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorDetailsConfirmationScreen.T;
                        JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen2 = this.f135344b;
                        return dli.f.a(juniorDetailsConfirmationScreen2, juniorDetailsConfirmationScreen2.d(), v.k(juniorDetailsConfirmationScreen2.N, juniorDetailsConfirmationScreen2.O, juniorDetailsConfirmationScreen2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: fi8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorDetailsConfirmationScreen f135344b;

            {
                this.f135344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen = this.f135344b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorDetailsConfirmationScreen.T;
                        qji.b bVarU2 = juniorDetailsConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.di.JuniorDetailsConfirmationScreenInjector");
                        l lVar = (l) bVarU2;
                        qh8.k kVar = lVar.f246540a;
                        l lVar2 = lVar.f246541b;
                        JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData = juniorDetailsConfirmationScreen.K;
                        juniorDetailsConfirmationScreenContract$InputData.getClass();
                        return new qh8.h(kVar, lVar2, juniorDetailsConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorDetailsConfirmationScreen.T;
                        return (h) ((qh8.h) juniorDetailsConfirmationScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorDetailsConfirmationScreen.T;
                        JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen2 = this.f135344b;
                        return dli.f.a(juniorDetailsConfirmationScreen2, juniorDetailsConfirmationScreen2.d(), v.k(juniorDetailsConfirmationScreen2.N, juniorDetailsConfirmationScreen2.O, juniorDetailsConfirmationScreen2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: fi8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorDetailsConfirmationScreen f135344b;

            {
                this.f135344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen = this.f135344b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorDetailsConfirmationScreen.T;
                        qji.b bVarU2 = juniorDetailsConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.di.JuniorDetailsConfirmationScreenInjector");
                        l lVar = (l) bVarU2;
                        qh8.k kVar = lVar.f246540a;
                        l lVar2 = lVar.f246541b;
                        JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData = juniorDetailsConfirmationScreen.K;
                        juniorDetailsConfirmationScreenContract$InputData.getClass();
                        return new qh8.h(kVar, lVar2, juniorDetailsConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorDetailsConfirmationScreen.T;
                        return (h) ((qh8.h) juniorDetailsConfirmationScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorDetailsConfirmationScreen.T;
                        JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen2 = this.f135344b;
                        return dli.f.a(juniorDetailsConfirmationScreen2, juniorDetailsConfirmationScreen2.d(), v.k(juniorDetailsConfirmationScreen2.N, juniorDetailsConfirmationScreen2.O, juniorDetailsConfirmationScreen2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(uiState.f135349a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f135349a);
        Clause clause = uiState.f135350b;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else {
            navBarWithToolbar.setSecondDescriptionVisible(false);
        }
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setModel(uiState.f135351c);
        actionFooterView.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qh8.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.r()), null, new fi8.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(this.O.d), rd0.e.b(d3().f174533b.e)), null, new f9d.c(this, (Continuation) null, 19), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fi8.h d() {
        return (fi8.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
