package com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import i72.b0;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.a7;
import mx0.bc;
import my0.b;
import te0.w;
import vc.s;
import x5a.d;
import x82.c;
import x82.f;
import x82.g;
import x82.i;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lx82/c;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WithdrawalCodeDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(WithdrawalCodeDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final MultibancoCodeDetailsInputData.ByCode K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public WithdrawalCodeDetailsScreen(MultibancoCodeDetailsInputData.ByCode inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, f.f);
        this.O = w.y0(new d(8));
        this.P = w.y0(new d(9));
        this.Q = w.y0(new d(10));
        this.R = w.y0(new d(11));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: x82.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeDetailsScreen f303265b;

            {
                this.f303265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen = this.f303265b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeDetailsScreen.W;
                        return (my0.e) ((b0) withdrawalCodeDetailsScreen.U.getValue()).f159063g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeDetailsScreen.W;
                        WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen2 = this.f303265b;
                        d dVarR2 = withdrawalCodeDetailsScreen2.R2();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeDetailsScreen2.S.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeDetailsScreen2.O.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeDetailsScreen2.Q.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeDetailsScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeDetailsScreen2.R.getValue());
                        eVarB.add(new CellDetailsDelegate());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeDetailsScreen2, dVarR2, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeDetailsScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                        }
                        i72.m mVar = ((i72.m) aVar2.b()).A;
                        MultibancoCodeDetailsInputData.ByCode byCode = withdrawalCodeDetailsScreen.K;
                        byCode.getClass();
                        return new b0(mVar, new ari.b(), byCode);
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeDetailsScreen.W;
                        return (d) ((b0) withdrawalCodeDetailsScreen.U.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: x82.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeDetailsScreen f303265b;

            {
                this.f303265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen = this.f303265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeDetailsScreen.W;
                        return (my0.e) ((b0) withdrawalCodeDetailsScreen.U.getValue()).f159063g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeDetailsScreen.W;
                        WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen2 = this.f303265b;
                        d dVarR2 = withdrawalCodeDetailsScreen2.R2();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeDetailsScreen2.S.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeDetailsScreen2.O.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeDetailsScreen2.Q.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeDetailsScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeDetailsScreen2.R.getValue());
                        eVarB.add(new CellDetailsDelegate());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeDetailsScreen2, dVarR2, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeDetailsScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                        }
                        i72.m mVar = ((i72.m) aVar2.b()).A;
                        MultibancoCodeDetailsInputData.ByCode byCode = withdrawalCodeDetailsScreen.K;
                        byCode.getClass();
                        return new b0(mVar, new ari.b(), byCode);
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeDetailsScreen.W;
                        return (d) ((b0) withdrawalCodeDetailsScreen.U.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: x82.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeDetailsScreen f303265b;

            {
                this.f303265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen = this.f303265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeDetailsScreen.W;
                        return (my0.e) ((b0) withdrawalCodeDetailsScreen.U.getValue()).f159063g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeDetailsScreen.W;
                        WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen2 = this.f303265b;
                        d dVarR2 = withdrawalCodeDetailsScreen2.R2();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeDetailsScreen2.S.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeDetailsScreen2.O.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeDetailsScreen2.Q.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeDetailsScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeDetailsScreen2.R.getValue());
                        eVarB.add(new CellDetailsDelegate());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeDetailsScreen2, dVarR2, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeDetailsScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                        }
                        i72.m mVar = ((i72.m) aVar2.b()).A;
                        MultibancoCodeDetailsInputData.ByCode byCode = withdrawalCodeDetailsScreen.K;
                        byCode.getClass();
                        return new b0(mVar, new ari.b(), byCode);
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeDetailsScreen.W;
                        return (d) ((b0) withdrawalCodeDetailsScreen.U.getValue()).i.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: x82.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeDetailsScreen f303265b;

            {
                this.f303265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen = this.f303265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeDetailsScreen.W;
                        return (my0.e) ((b0) withdrawalCodeDetailsScreen.U.getValue()).f159063g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeDetailsScreen.W;
                        WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen2 = this.f303265b;
                        d dVarR2 = withdrawalCodeDetailsScreen2.R2();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeDetailsScreen2.S.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeDetailsScreen2.O.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeDetailsScreen2.Q.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeDetailsScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeDetailsScreen2.R.getValue());
                        eVarB.add(new CellDetailsDelegate());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeDetailsScreen2, dVarR2, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeDetailsScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                        }
                        i72.m mVar = ((i72.m) aVar2.b()).A;
                        MultibancoCodeDetailsInputData.ByCode byCode = withdrawalCodeDetailsScreen.K;
                        byCode.getClass();
                        return new b0(mVar, new ari.b(), byCode);
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeDetailsScreen.W;
                        return (d) ((b0) withdrawalCodeDetailsScreen.U.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f303263b;
        navBarWithToolbar.setLoadingVisible(clause == null);
        if (clause != null) {
            NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
            navBarWithToolbar2.setTitle(clause, null);
            d3().f174539b.setToolbarTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.multibanco_withdrawal_details_subtitle, null, null, 14));
        navBarWithToolbar.setLoadingVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new g(this, null, 0), 3);
        b bVar = ((my0.e) this.S.getValue()).f210285a;
        r map = ((ActionsDelegate) bVar.f210279b.getValue()).f51611c.f121375b.map(new bc(new a7(bVar, 11), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), null, new x82.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.Q.getValue()).f51611c.f121375b), null, new i(this, null, 0), 3);
        r rVarMerge = r.merge(w.a0(((RowDelegate) this.O.getValue()).f53218h, new x64.a(12)), w.a0(((CellDetailsChevronDelegate) this.P.getValue()).f51821c, new x64.a(13)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new i(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x82.d d() {
        return (x82.d) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
