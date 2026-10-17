package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number;

import afj.k0;
import afj.o;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import chc.c0;
import cjj.b;
import cjj.c;
import cjj.d;
import cjj.f;
import cjj.g;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.EsimMobilePlanAddPhoneNumberScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.EsimMobilePlanAddPhoneNumberScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_add_phone_number/EsimMobilePlanAddPhoneNumberScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcjj/f;", "Ldli/a;", "Lcjj/h;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanAddPhoneNumberScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EsimMobilePlanAddPhoneNumberScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanAddPhoneNumberScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public EsimMobilePlanAddPhoneNumberScreen(EsimMobilePlanAddPhoneNumberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new c0(6));
        this.O = w.y0(new c0(7));
        this.P = w.y0(new c0(8));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: cjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanAddPhoneNumberScreen f24689b;

            {
                this.f24689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanAddPhoneNumberScreen esimMobilePlanAddPhoneNumberScreen = this.f24689b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanAddPhoneNumberScreen.T;
                        EsimMobilePlanAddPhoneNumberScreen esimMobilePlanAddPhoneNumberScreen2 = this.f24689b;
                        return dli.f.a(esimMobilePlanAddPhoneNumberScreen2, (g) esimMobilePlanAddPhoneNumberScreen2.S.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) esimMobilePlanAddPhoneNumberScreen2.N.getValue(), (CellDetailsDelegate) esimMobilePlanAddPhoneNumberScreen2.O.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanAddPhoneNumberScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanAddPhoneNumberScreen.T;
                        qji.b bVarU2 = esimMobilePlanAddPhoneNumberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.di.EsimMobilePlanAddPhoneNumberScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanAddPhoneNumberScreenContract$InputData esimMobilePlanAddPhoneNumberScreenContract$InputData = esimMobilePlanAddPhoneNumberScreen.K;
                        esimMobilePlanAddPhoneNumberScreenContract$InputData.getClass();
                        return new o(bVar, k0Var2, esimMobilePlanAddPhoneNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanAddPhoneNumberScreen.T;
                        return (g) ((o) esimMobilePlanAddPhoneNumberScreen.R.getValue()).f4368c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: cjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanAddPhoneNumberScreen f24689b;

            {
                this.f24689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanAddPhoneNumberScreen esimMobilePlanAddPhoneNumberScreen = this.f24689b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanAddPhoneNumberScreen.T;
                        EsimMobilePlanAddPhoneNumberScreen esimMobilePlanAddPhoneNumberScreen2 = this.f24689b;
                        return dli.f.a(esimMobilePlanAddPhoneNumberScreen2, (g) esimMobilePlanAddPhoneNumberScreen2.S.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) esimMobilePlanAddPhoneNumberScreen2.N.getValue(), (CellDetailsDelegate) esimMobilePlanAddPhoneNumberScreen2.O.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanAddPhoneNumberScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanAddPhoneNumberScreen.T;
                        qji.b bVarU2 = esimMobilePlanAddPhoneNumberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.di.EsimMobilePlanAddPhoneNumberScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanAddPhoneNumberScreenContract$InputData esimMobilePlanAddPhoneNumberScreenContract$InputData = esimMobilePlanAddPhoneNumberScreen.K;
                        esimMobilePlanAddPhoneNumberScreenContract$InputData.getClass();
                        return new o(bVar, k0Var2, esimMobilePlanAddPhoneNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanAddPhoneNumberScreen.T;
                        return (g) ((o) esimMobilePlanAddPhoneNumberScreen.R.getValue()).f4368c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: cjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanAddPhoneNumberScreen f24689b;

            {
                this.f24689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanAddPhoneNumberScreen esimMobilePlanAddPhoneNumberScreen = this.f24689b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanAddPhoneNumberScreen.T;
                        EsimMobilePlanAddPhoneNumberScreen esimMobilePlanAddPhoneNumberScreen2 = this.f24689b;
                        return dli.f.a(esimMobilePlanAddPhoneNumberScreen2, (g) esimMobilePlanAddPhoneNumberScreen2.S.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) esimMobilePlanAddPhoneNumberScreen2.N.getValue(), (CellDetailsDelegate) esimMobilePlanAddPhoneNumberScreen2.O.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanAddPhoneNumberScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanAddPhoneNumberScreen.T;
                        qji.b bVarU2 = esimMobilePlanAddPhoneNumberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.di.EsimMobilePlanAddPhoneNumberScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanAddPhoneNumberScreenContract$InputData esimMobilePlanAddPhoneNumberScreenContract$InputData = esimMobilePlanAddPhoneNumberScreen.K;
                        esimMobilePlanAddPhoneNumberScreenContract$InputData.getClass();
                        return new o(bVar, k0Var2, esimMobilePlanAddPhoneNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanAddPhoneNumberScreen.T;
                        return (g) ((o) esimMobilePlanAddPhoneNumberScreen.R.getValue()).f4368c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        cjj.h uiState = (cjj.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f24693b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plans_add_number_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plans_add_number_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.esim_mobile_plans_add_number_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
