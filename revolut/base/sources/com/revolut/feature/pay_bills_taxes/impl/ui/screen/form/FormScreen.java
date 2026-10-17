package com.revolut.feature.pay_bills_taxes.impl.ui.screen.form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import wf6.p;
import wg9.b;
import wg9.d;
import wg9.f;
import wg9.g;
import wg9.i;
import wg9.j;
import wg9.l;
import wg9.m;
import wg9.n;
import wp5.y;
import xki.e;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/form/FormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwg9/l;", "Ldli/a;", "Lwg9/n;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final FormScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public FormScreen(FormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, b.f);
        this.N = w.y0(new wf5.a(5));
        this.O = w.y0(new wf5.a(6));
        this.P = w.y0(new wf5.a(7));
        final int i = 2;
        this.Q = w.y0(new Function0(this) { // from class: wg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f297244b;

            {
                this.f297244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FormScreen formScreen = this.f297244b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.V;
                        qji.b bVarU2 = formScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.di.FormScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormScreenContract$InputData formScreenContract$InputData = formScreen.K;
                        formScreenContract$InputData.getClass();
                        return new lf9.l(mVar, hVar2, formScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FormScreen.V;
                        return (m) ((lf9.l) formScreen.T.getValue()).f194732h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FormScreen.V;
                        qd0.b bVarN = ((lf9.l) formScreen.T.getValue()).f194729b.f194734b.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = FormScreen.V;
                        return new InputTextDelegate(new wde.f(formScreen, 7));
                    default:
                        KProperty[] kPropertyArr5 = FormScreen.V;
                        FormScreen formScreen2 = this.f297244b;
                        return dli.f.a(formScreen2, formScreen2.d(), v.k((RowDelegate) formScreen2.N.getValue(), (InputTextDelegate) formScreen2.R.getValue(), (ListSubheaderDelegate) formScreen2.O.getValue(), (InputChecklistDelegate) formScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 3;
        this.R = w.y0(new Function0(this) { // from class: wg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f297244b;

            {
                this.f297244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FormScreen formScreen = this.f297244b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.V;
                        qji.b bVarU2 = formScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.di.FormScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormScreenContract$InputData formScreenContract$InputData = formScreen.K;
                        formScreenContract$InputData.getClass();
                        return new lf9.l(mVar, hVar2, formScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FormScreen.V;
                        return (m) ((lf9.l) formScreen.T.getValue()).f194732h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FormScreen.V;
                        qd0.b bVarN = ((lf9.l) formScreen.T.getValue()).f194729b.f194734b.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = FormScreen.V;
                        return new InputTextDelegate(new wde.f(formScreen, 7));
                    default:
                        KProperty[] kPropertyArr5 = FormScreen.V;
                        FormScreen formScreen2 = this.f297244b;
                        return dli.f.a(formScreen2, formScreen2.d(), v.k((RowDelegate) formScreen2.N.getValue(), (InputTextDelegate) formScreen2.R.getValue(), (ListSubheaderDelegate) formScreen2.O.getValue(), (InputChecklistDelegate) formScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 4;
        this.S = w.y0(new Function0(this) { // from class: wg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f297244b;

            {
                this.f297244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FormScreen formScreen = this.f297244b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.V;
                        qji.b bVarU2 = formScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.di.FormScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormScreenContract$InputData formScreenContract$InputData = formScreen.K;
                        formScreenContract$InputData.getClass();
                        return new lf9.l(mVar, hVar2, formScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FormScreen.V;
                        return (m) ((lf9.l) formScreen.T.getValue()).f194732h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FormScreen.V;
                        qd0.b bVarN = ((lf9.l) formScreen.T.getValue()).f194729b.f194734b.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = FormScreen.V;
                        return new InputTextDelegate(new wde.f(formScreen, 7));
                    default:
                        KProperty[] kPropertyArr5 = FormScreen.V;
                        FormScreen formScreen2 = this.f297244b;
                        return dli.f.a(formScreen2, formScreen2.d(), v.k((RowDelegate) formScreen2.N.getValue(), (InputTextDelegate) formScreen2.R.getValue(), (ListSubheaderDelegate) formScreen2.O.getValue(), (InputChecklistDelegate) formScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 0;
        this.T = w.y0(new Function0(this) { // from class: wg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f297244b;

            {
                this.f297244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                FormScreen formScreen = this.f297244b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.V;
                        qji.b bVarU2 = formScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.di.FormScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormScreenContract$InputData formScreenContract$InputData = formScreen.K;
                        formScreenContract$InputData.getClass();
                        return new lf9.l(mVar, hVar2, formScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FormScreen.V;
                        return (m) ((lf9.l) formScreen.T.getValue()).f194732h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FormScreen.V;
                        qd0.b bVarN = ((lf9.l) formScreen.T.getValue()).f194729b.f194734b.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = FormScreen.V;
                        return new InputTextDelegate(new wde.f(formScreen, 7));
                    default:
                        KProperty[] kPropertyArr5 = FormScreen.V;
                        FormScreen formScreen2 = this.f297244b;
                        return dli.f.a(formScreen2, formScreen2.d(), v.k((RowDelegate) formScreen2.N.getValue(), (InputTextDelegate) formScreen2.R.getValue(), (ListSubheaderDelegate) formScreen2.O.getValue(), (InputChecklistDelegate) formScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 1;
        this.U = w.y0(new Function0(this) { // from class: wg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f297244b;

            {
                this.f297244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                FormScreen formScreen = this.f297244b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.V;
                        qji.b bVarU2 = formScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.di.FormScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormScreenContract$InputData formScreenContract$InputData = formScreen.K;
                        formScreenContract$InputData.getClass();
                        return new lf9.l(mVar, hVar2, formScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FormScreen.V;
                        return (m) ((lf9.l) formScreen.T.getValue()).f194732h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FormScreen.V;
                        qd0.b bVarN = ((lf9.l) formScreen.T.getValue()).f194729b.f194734b.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = FormScreen.V;
                        return new InputTextDelegate(new wde.f(formScreen, 7));
                    default:
                        KProperty[] kPropertyArr5 = FormScreen.V;
                        FormScreen formScreen2 = this.f297244b;
                        return dli.f.a(formScreen2, formScreen2.d(), v.k((RowDelegate) formScreen2.N.getValue(), (InputTextDelegate) formScreen2.R.getValue(), (ListSubheaderDelegate) formScreen2.O.getValue(), (InputChecklistDelegate) formScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f297257c;
        TextLocalisedClause textLocalisedClause = uiState.f297256b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setMenuItems(uiState.e ? u.c(new LabelNavBarMenuItem("ERRORS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_issue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_action_review_errors, null, null, 14), null, null, 504)) : f0.f322471a);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174533b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lf9.l) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new wg9.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.x0()), null, new wg9.e(this, continuation, 2), 3);
        ?? r72 = this.N;
        com.revolut.kompot.navigable.a.g2(this, y.x(((RowDelegate) r72.getValue()).f53218h, ((RowDelegate) r72.getValue()).f53220l, "mergeWith(...)"), null, new g(this, null), 3);
        ?? r710 = this.R;
        com.revolut.kompot.navigable.a.g2(this, y.x(((InputTextDelegate) r710.getValue()).f52575g.f121375b, ((InputTextDelegate) r710.getValue()).i.f121375b, "mergeWith(...)"), null, new wg9.h(this, null), 3);
        r rVarFilter = ((InputTextDelegate) r710.getValue()).e.f121375b.debounce(400L, TimeUnit.MILLISECONDS).filter(new wf6.o(5, new p(23)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.P.getValue()).f52518c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new f(this, continuation, 1), 3);
        r rVarFilter2 = ((ListSubheaderDelegate) this.O.getValue()).f52707c.filter(new wf6.o(6, new p(24)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.e), null, new wg9.e(this, continuation, 0), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
