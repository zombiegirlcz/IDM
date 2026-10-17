package com.revolut.feature.junior.isa.impl.ui.jisa_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p0l.d;
import pa8.b;
import pa8.c;
import pa8.f;
import pa8.g;
import pa8.i;
import pa8.j;
import pa8.k;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import x98.l;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpa8/k;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorIsaDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final JuniorIsaDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsActionListDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorIsaDetailsScreen(JuniorIsaDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsActionListDelegate();
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaDetailsScreen f234436b;

            {
                this.f234436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorIsaDetailsScreen juniorIsaDetailsScreen = this.f234436b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaDetailsScreen.S;
                        JuniorIsaDetailsScreen juniorIsaDetailsScreen2 = this.f234436b;
                        return dli.f.a(juniorIsaDetailsScreen2, (j) juniorIsaDetailsScreen2.R.getValue(), v.k(juniorIsaDetailsScreen2.N, juniorIsaDetailsScreen2.O, new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaDetailsScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData = juniorIsaDetailsScreen.K;
                        juniorIsaDetailsScreenContract$InputData.getClass();
                        return new x98.l(oVar, juniorIsaDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaDetailsScreen.S;
                        x98.l lVar = (x98.l) juniorIsaDetailsScreen.Q.getValue();
                        x98.o oVar2 = lVar.f303624b;
                        z80.b bVarS = oVar2.f303633j.s();
                        s.j(bVarS);
                        o oVar3 = new o(bVarS, oVar2.c());
                        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData2 = lVar.f303623a;
                        hj8.a aVarA = oVar2.d.a();
                        s.j(aVarA);
                        z98.d dVar = (z98.d) oVar2.k.f303604h.get();
                        s.j(dVar);
                        return new com.revolut.feature.junior.isa.impl.ui.jisa_details.a(oVar3, juniorIsaDetailsScreenContract$InputData2, aVarA, dVar, oVar2.f303632h.f());
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaDetailsScreen f234436b;

            {
                this.f234436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorIsaDetailsScreen juniorIsaDetailsScreen = this.f234436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaDetailsScreen.S;
                        JuniorIsaDetailsScreen juniorIsaDetailsScreen2 = this.f234436b;
                        return dli.f.a(juniorIsaDetailsScreen2, (j) juniorIsaDetailsScreen2.R.getValue(), v.k(juniorIsaDetailsScreen2.N, juniorIsaDetailsScreen2.O, new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaDetailsScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData = juniorIsaDetailsScreen.K;
                        juniorIsaDetailsScreenContract$InputData.getClass();
                        return new x98.l(oVar, juniorIsaDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaDetailsScreen.S;
                        x98.l lVar = (x98.l) juniorIsaDetailsScreen.Q.getValue();
                        x98.o oVar2 = lVar.f303624b;
                        z80.b bVarS = oVar2.f303633j.s();
                        s.j(bVarS);
                        o oVar3 = new o(bVarS, oVar2.c());
                        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData2 = lVar.f303623a;
                        hj8.a aVarA = oVar2.d.a();
                        s.j(aVarA);
                        z98.d dVar = (z98.d) oVar2.k.f303604h.get();
                        s.j(dVar);
                        return new com.revolut.feature.junior.isa.impl.ui.jisa_details.a(oVar3, juniorIsaDetailsScreenContract$InputData2, aVarA, dVar, oVar2.f303632h.f());
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaDetailsScreen f234436b;

            {
                this.f234436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorIsaDetailsScreen juniorIsaDetailsScreen = this.f234436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaDetailsScreen.S;
                        JuniorIsaDetailsScreen juniorIsaDetailsScreen2 = this.f234436b;
                        return dli.f.a(juniorIsaDetailsScreen2, (j) juniorIsaDetailsScreen2.R.getValue(), v.k(juniorIsaDetailsScreen2.N, juniorIsaDetailsScreen2.O, new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaDetailsScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData = juniorIsaDetailsScreen.K;
                        juniorIsaDetailsScreenContract$InputData.getClass();
                        return new x98.l(oVar, juniorIsaDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaDetailsScreen.S;
                        x98.l lVar = (x98.l) juniorIsaDetailsScreen.Q.getValue();
                        x98.o oVar2 = lVar.f303624b;
                        z80.b bVarS = oVar2.f303633j.s();
                        s.j(bVarS);
                        o oVar3 = new o(bVarS, oVar2.c());
                        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData2 = lVar.f303623a;
                        hj8.a aVarA = oVar2.d.a();
                        s.j(aVarA);
                        z98.d dVar = (z98.d) oVar2.k.f303604h.get();
                        s.j(dVar);
                        return new com.revolut.feature.junior.isa.impl.ui.jisa_details.a(oVar3, juniorIsaDetailsScreenContract$InputData2, aVarA, dVar, oVar2.f303632h.f());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        i iVar = uiState.f234444b;
        if (iVar instanceof pa8.h) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else if (iVar instanceof g) {
            navBarWithToolbar.l0();
            navBarWithToolbar.setSecondDescriptionVisible(false);
        } else {
            if (!(iVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            navBarWithToolbar.setSecondDescriptionText(((f) iVar).f234440a);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_trading_holder_details_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_trading_holder_details_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 13), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new pa8.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
