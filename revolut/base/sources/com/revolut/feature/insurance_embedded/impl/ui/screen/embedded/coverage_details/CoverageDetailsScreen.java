package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.s;
import ov7.d;
import ov7.f;
import ov7.g;
import ov7.i;
import ov7.l;
import ov7.m;
import te0.w;
import tx0.j0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/coverage_details/CoverageDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/coverage_details/a;", "Ldli/a;", "Lov7/m;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoverageDetailsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CoverageDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CoverageDetailsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final CellDetailsDelegate N;
    public final PlainTextDelegate O;
    public final FullScreenStateDelegate P;
    public final LabelButtonDelegate Q;
    public final TextDelegate R;
    public final Object S;
    public final h T;
    public final Object U;
    public final Object V;

    public CoverageDetailsScreen(CoverageDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new RowDelegate(null, null, 7);
        this.N = new CellDetailsDelegate();
        this.O = new PlainTextDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new LabelButtonDelegate();
        this.R = new TextDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: ov7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageDetailsScreen f229970b;

            {
                this.f229970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CoverageDetailsScreen coverageDetailsScreen = this.f229970b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageDetailsScreen.W;
                        CoverageDetailsScreen coverageDetailsScreen2 = this.f229970b;
                        return dli.f.a(coverageDetailsScreen2, coverageDetailsScreen2.R2(), v.k(coverageDetailsScreen2.M, coverageDetailsScreen2.N, coverageDetailsScreen2.O, coverageDetailsScreen2.P, new ToDoItemDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), coverageDetailsScreen2.Q, coverageDetailsScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(coverageDetailsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = coverageDetailsScreen.K;
                        coverageDetailsScreenContract$InputData.getClass();
                        return new lu7.e(sVar, coverageDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageDetailsScreen.W;
                        return (l) ((lu7.e) coverageDetailsScreen.U.getValue()).f200087c.get();
                }
            }
        });
        this.T = vc.s.t(this, ov7.b.f);
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ov7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageDetailsScreen f229970b;

            {
                this.f229970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CoverageDetailsScreen coverageDetailsScreen = this.f229970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageDetailsScreen.W;
                        CoverageDetailsScreen coverageDetailsScreen2 = this.f229970b;
                        return dli.f.a(coverageDetailsScreen2, coverageDetailsScreen2.R2(), v.k(coverageDetailsScreen2.M, coverageDetailsScreen2.N, coverageDetailsScreen2.O, coverageDetailsScreen2.P, new ToDoItemDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), coverageDetailsScreen2.Q, coverageDetailsScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(coverageDetailsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = coverageDetailsScreen.K;
                        coverageDetailsScreenContract$InputData.getClass();
                        return new lu7.e(sVar, coverageDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageDetailsScreen.W;
                        return (l) ((lu7.e) coverageDetailsScreen.U.getValue()).f200087c.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: ov7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageDetailsScreen f229970b;

            {
                this.f229970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CoverageDetailsScreen coverageDetailsScreen = this.f229970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageDetailsScreen.W;
                        CoverageDetailsScreen coverageDetailsScreen2 = this.f229970b;
                        return dli.f.a(coverageDetailsScreen2, coverageDetailsScreen2.R2(), v.k(coverageDetailsScreen2.M, coverageDetailsScreen2.N, coverageDetailsScreen2.O, coverageDetailsScreen2.P, new ToDoItemDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), coverageDetailsScreen2.Q, coverageDetailsScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(coverageDetailsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = coverageDetailsScreen.K;
                        coverageDetailsScreenContract$InputData.getClass();
                        return new lu7.e(sVar, coverageDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageDetailsScreen.W;
                        return (l) ((lu7.e) coverageDetailsScreen.U.getValue()).f200087c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextClause textClause = uiState.f229977a;
        Clause clause = uiState.f229979c;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        Clause clause2 = uiState.f229978b;
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(clause == null ? 8 : 0);
        largeActionButton.setText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lu7.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setItemAnimator(null);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new ov7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.e), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new ov7.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d), null, new ov7.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(this.P.f52371h.f121375b), 25), null, new i(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.T.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
