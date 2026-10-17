package com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.R$string;
import iog.c;
import iog.d;
import iog.i;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nng.k;
import nng.p;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/a;", "Lkji/f;", "Ldli/a;", "Liog/i;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PepFormScreen extends ViewController<a> implements f, dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PepFormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PepFormScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputTextDelegate P;
    public final Object Q;

    public PepFormScreen(PepFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, iog.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: iog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PepFormScreen f163317b;

            {
                this.f163317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PepFormScreen pepFormScreen = this.f163317b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PepFormScreen.R;
                        qji.b bVarU2 = pepFormScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.di.PepFormScreenInjector");
                        nng.j jVar = (nng.j) bVarU2;
                        p pVar = jVar.f217658b;
                        nng.j jVar2 = jVar.f217659c;
                        PepFormScreenContract$InputData pepFormScreenContract$InputData = pepFormScreen.K;
                        pepFormScreenContract$InputData.getClass();
                        return new nng.k(pVar, jVar2, pepFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PepFormScreen.R;
                        return (h) ((nng.k) pepFormScreen.N.getValue()).f217662c.get();
                    default:
                        KProperty[] kPropertyArr3 = PepFormScreen.R;
                        PepFormScreen pepFormScreen2 = this.f163317b;
                        return dli.f.a(pepFormScreen2, pepFormScreen2.d(), u.c(pepFormScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: iog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PepFormScreen f163317b;

            {
                this.f163317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PepFormScreen pepFormScreen = this.f163317b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PepFormScreen.R;
                        qji.b bVarU2 = pepFormScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.di.PepFormScreenInjector");
                        nng.j jVar = (nng.j) bVarU2;
                        p pVar = jVar.f217658b;
                        nng.j jVar2 = jVar.f217659c;
                        PepFormScreenContract$InputData pepFormScreenContract$InputData = pepFormScreen.K;
                        pepFormScreenContract$InputData.getClass();
                        return new nng.k(pVar, jVar2, pepFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PepFormScreen.R;
                        return (h) ((nng.k) pepFormScreen.N.getValue()).f217662c.get();
                    default:
                        KProperty[] kPropertyArr3 = PepFormScreen.R;
                        PepFormScreen pepFormScreen2 = this.f163317b;
                        return dli.f.a(pepFormScreen2, pepFormScreen2.d(), u.c(pepFormScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputTextDelegate(null);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PepFormScreen f163317b;

            {
                this.f163317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PepFormScreen pepFormScreen = this.f163317b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PepFormScreen.R;
                        qji.b bVarU2 = pepFormScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.di.PepFormScreenInjector");
                        nng.j jVar = (nng.j) bVarU2;
                        p pVar = jVar.f217658b;
                        nng.j jVar2 = jVar.f217659c;
                        PepFormScreenContract$InputData pepFormScreenContract$InputData = pepFormScreen.K;
                        pepFormScreenContract$InputData.getClass();
                        return new nng.k(pVar, jVar2, pepFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PepFormScreen.R;
                        return (h) ((nng.k) pepFormScreen.N.getValue()).f217662c.get();
                    default:
                        KProperty[] kPropertyArr3 = PepFormScreen.R;
                        PepFormScreen pepFormScreen2 = this.f163317b;
                        return dli.f.a(pepFormScreen2, pepFormScreen2.d(), u.c(pepFormScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f163320a, null);
        navBarWithToolbar.setDescriptionText(uiState.f163321b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setEnabled(uiState.f163322c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174564b.setText(new TextLocalisedClause(R$string.pep_close_connection_personal_details_cta, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        InputTextDelegate inputTextDelegate = this.P;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new iog.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new iog.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.p0()), new iog.e(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final iog.h d() {
        return (iog.h) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
