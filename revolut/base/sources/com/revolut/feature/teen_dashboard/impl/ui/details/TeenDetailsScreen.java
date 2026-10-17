package com.revolut.feature.teen_dashboard.impl.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreen;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nqe.c;
import qg4.d;
import qqe.b;
import qqe.e;
import qqe.f;
import qqe.g;
import qqe.i;
import qqe.j;
import te0.w;
import tx0.t3;
import vc.s;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/teen_dashboard/impl/ui/details/TeenDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqqe/i;", "feature_teen_dashboard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TeenDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TeenDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TeenDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final CellDetailsLoadingDelegate Q;
    public final FullScreenStateDelegate R;
    public final CellDetailsActionListDelegate S;
    public final ListSubheaderDelegate T;

    public TeenDetailsScreen(TeenDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qqe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeenDetailsScreen f248522b;

            {
                this.f248522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TeenDetailsScreen teenDetailsScreen = this.f248522b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TeenDetailsScreen.U;
                        return (j) ((nqe.c) teenDetailsScreen.P.getValue()).f218435c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TeenDetailsScreen.U;
                        TeenDetailsScreen teenDetailsScreen2 = this.f248522b;
                        return dli.f.a(teenDetailsScreen2, (j) teenDetailsScreen2.N.getValue(), v.k(teenDetailsScreen2.Q, teenDetailsScreen2.R, teenDetailsScreen2.S, teenDetailsScreen2.T), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TeenDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(teenDetailsScreen.m2()).a().get(nqe.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nqe.b.class, " is not found"));
                        }
                        nqe.b bVar = ((nqe.b) aVar2.b()).d;
                        TeenDetailsScreenContract$InputData teenDetailsScreenContract$InputData = teenDetailsScreen.K;
                        teenDetailsScreenContract$InputData.getClass();
                        return new nqe.c(bVar, teenDetailsScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qqe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeenDetailsScreen f248522b;

            {
                this.f248522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TeenDetailsScreen teenDetailsScreen = this.f248522b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TeenDetailsScreen.U;
                        return (j) ((nqe.c) teenDetailsScreen.P.getValue()).f218435c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TeenDetailsScreen.U;
                        TeenDetailsScreen teenDetailsScreen2 = this.f248522b;
                        return dli.f.a(teenDetailsScreen2, (j) teenDetailsScreen2.N.getValue(), v.k(teenDetailsScreen2.Q, teenDetailsScreen2.R, teenDetailsScreen2.S, teenDetailsScreen2.T), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TeenDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(teenDetailsScreen.m2()).a().get(nqe.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nqe.b.class, " is not found"));
                        }
                        nqe.b bVar = ((nqe.b) aVar2.b()).d;
                        TeenDetailsScreenContract$InputData teenDetailsScreenContract$InputData = teenDetailsScreen.K;
                        teenDetailsScreenContract$InputData.getClass();
                        return new nqe.c(bVar, teenDetailsScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qqe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeenDetailsScreen f248522b;

            {
                this.f248522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TeenDetailsScreen teenDetailsScreen = this.f248522b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TeenDetailsScreen.U;
                        return (j) ((nqe.c) teenDetailsScreen.P.getValue()).f218435c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TeenDetailsScreen.U;
                        TeenDetailsScreen teenDetailsScreen2 = this.f248522b;
                        return dli.f.a(teenDetailsScreen2, (j) teenDetailsScreen2.N.getValue(), v.k(teenDetailsScreen2.Q, teenDetailsScreen2.R, teenDetailsScreen2.S, teenDetailsScreen2.T), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TeenDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(teenDetailsScreen.m2()).a().get(nqe.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nqe.b.class, " is not found"));
                        }
                        nqe.b bVar = ((nqe.b) aVar2.b()).d;
                        TeenDetailsScreenContract$InputData teenDetailsScreenContract$InputData = teenDetailsScreen.K;
                        teenDetailsScreenContract$InputData.getClass();
                        return new nqe.c(bVar, teenDetailsScreenContract$InputData);
                }
            }
        });
        this.Q = new CellDetailsLoadingDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new CellDetailsActionListDelegate();
        this.T = new ListSubheaderDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        qqe.h hVar = uiState.f248529a;
        if (!(hVar instanceof e)) {
            if (hVar.equals(f.f248527a)) {
                d3().f174539b.l0();
                return;
            }
            if (!hVar.equals(g.f248528a)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        navBarWithToolbar2.l0();
        e eVar = (e) hVar;
        Clause clause = eVar.f248525b;
        TextLocalisedClause textLocalisedClause = eVar.f248524a;
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        if (clause != null) {
            navBarWithToolbar2.setDescriptionVisible(true);
            navBarWithToolbar2.setDescriptionText(clause);
        } else {
            navBarWithToolbar2.setDescriptionVisible(false);
        }
        navBarWithToolbar2.setDescriptionClickable(false);
        yy0.i iVar = l.Companion;
        ContactImage contactImage = eVar.f248526c;
        iVar.getClass();
        navBarWithToolbar2.setEndImage(yy0.i.a(contactImage));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new qqe.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 19), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
