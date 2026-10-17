package com.revolut.core.backend_flow.impl.ui.entities_list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.backend_flow.impl.ui.entities_list.EntitiesListController;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import fa0.l;
import hb0.b;
import hb0.c;
import hb0.d;
import hb0.f;
import hb0.h;
import hb0.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/entities_list/EntitiesListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltc0/b;", "Lno/k;", "Lno/m;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EntitiesListController extends ViewController<q> implements a, k, m {
    public static final /* synthetic */ KProperty[] T;
    public final h K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final ao.h N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final Object S;

    static {
        h0 h0Var = new h0(EntitiesListController.class, "fullscreenBinding", "getFullscreenBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        p0 p0Var = o0.f186429a;
        T = new KProperty[]{p0Var.j(h0Var), p.a.y(EntitiesListController.class, "bottomSheetBinding", "getBottomSheetBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0, p0Var)};
    }

    public EntitiesListController(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        this.N = s.t(this, c.f);
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: hb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntitiesListController f150538b;

            {
                this.f150538b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EntitiesListController entitiesListController = this.f150538b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EntitiesListController.T;
                        qji.b bVarU2 = entitiesListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.entities_list.di.EntitiesListControllerInjector");
                        l lVarT = ((na0.d) bVarU2).t();
                        h hVar = entitiesListController.K;
                        switch (lVarT.f133108a) {
                            case 0:
                                hVar.getClass();
                                lVarT.d = hVar;
                                break;
                            default:
                                hVar.getClass();
                                lVarT.d = hVar;
                                break;
                        }
                        return (fa0.m) ((l) lVarT.mo3808a(entitiesListController)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EntitiesListController.T;
                        fa0.m mVar = (fa0.m) entitiesListController.P.getValue();
                        switch (mVar.f133111a) {
                            case 0:
                                return new k(new ac4.g(mVar.f133112b, (eb0.a) mVar.f.get()), (gb0.a) mVar.d.get(), (qa0.b) ((fa0.j) mVar.f133114g).u.get());
                            default:
                                return new k(new ac4.g(mVar.f133112b, (eb0.a) mVar.f.get()), (gb0.a) mVar.d.get(), (qa0.b) ((fa0.h) mVar.f133114g).u.get());
                        }
                    default:
                        EntitiesListController entitiesListController2 = this.f150538b;
                        FullScreenStateDelegate fullScreenStateDelegate = entitiesListController2.L;
                        RowDelegate rowDelegate = entitiesListController2.M;
                        List listK = v.k(fullScreenStateDelegate, rowDelegate, new RowLoadingDelegate(), new SwipeToActionDelegate(rowDelegate, false));
                        return entitiesListController2.K.f150542c ? dli.f.a(entitiesListController2, entitiesListController2.R2(), listK, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56) : dli.f.a(entitiesListController2, entitiesListController2.R2(), listK, 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntitiesListController f150538b;

            {
                this.f150538b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EntitiesListController entitiesListController = this.f150538b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EntitiesListController.T;
                        qji.b bVarU2 = entitiesListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.entities_list.di.EntitiesListControllerInjector");
                        l lVarT = ((na0.d) bVarU2).t();
                        h hVar = entitiesListController.K;
                        switch (lVarT.f133108a) {
                            case 0:
                                hVar.getClass();
                                lVarT.d = hVar;
                                break;
                            default:
                                hVar.getClass();
                                lVarT.d = hVar;
                                break;
                        }
                        return (fa0.m) ((l) lVarT.mo3808a(entitiesListController)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EntitiesListController.T;
                        fa0.m mVar = (fa0.m) entitiesListController.P.getValue();
                        switch (mVar.f133111a) {
                            case 0:
                                return new k(new ac4.g(mVar.f133112b, (eb0.a) mVar.f.get()), (gb0.a) mVar.d.get(), (qa0.b) ((fa0.j) mVar.f133114g).u.get());
                            default:
                                return new k(new ac4.g(mVar.f133112b, (eb0.a) mVar.f.get()), (gb0.a) mVar.d.get(), (qa0.b) ((fa0.h) mVar.f133114g).u.get());
                        }
                    default:
                        EntitiesListController entitiesListController2 = this.f150538b;
                        FullScreenStateDelegate fullScreenStateDelegate = entitiesListController2.L;
                        RowDelegate rowDelegate = entitiesListController2.M;
                        List listK = v.k(fullScreenStateDelegate, rowDelegate, new RowLoadingDelegate(), new SwipeToActionDelegate(rowDelegate, false));
                        return entitiesListController2.K.f150542c ? dli.f.a(entitiesListController2, entitiesListController2.R2(), listK, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56) : dli.f.a(entitiesListController2, entitiesListController2.R2(), listK, 0, null, null, null, 60);
                }
            }
        });
        this.R = inputData.f150542c ? R$layout.screen_recycler_navbar_bottomsheet_nextbutton : R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: hb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntitiesListController f150538b;

            {
                this.f150538b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EntitiesListController entitiesListController = this.f150538b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EntitiesListController.T;
                        qji.b bVarU2 = entitiesListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.entities_list.di.EntitiesListControllerInjector");
                        l lVarT = ((na0.d) bVarU2).t();
                        h hVar = entitiesListController.K;
                        switch (lVarT.f133108a) {
                            case 0:
                                hVar.getClass();
                                lVarT.d = hVar;
                                break;
                            default:
                                hVar.getClass();
                                lVarT.d = hVar;
                                break;
                        }
                        return (fa0.m) ((l) lVarT.mo3808a(entitiesListController)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EntitiesListController.T;
                        fa0.m mVar = (fa0.m) entitiesListController.P.getValue();
                        switch (mVar.f133111a) {
                            case 0:
                                return new k(new ac4.g(mVar.f133112b, (eb0.a) mVar.f.get()), (gb0.a) mVar.d.get(), (qa0.b) ((fa0.j) mVar.f133114g).u.get());
                            default:
                                return new k(new ac4.g(mVar.f133112b, (eb0.a) mVar.f.get()), (gb0.a) mVar.d.get(), (qa0.b) ((fa0.h) mVar.f133114g).u.get());
                        }
                    default:
                        EntitiesListController entitiesListController2 = this.f150538b;
                        FullScreenStateDelegate fullScreenStateDelegate = entitiesListController2.L;
                        RowDelegate rowDelegate = entitiesListController2.M;
                        List listK = v.k(fullScreenStateDelegate, rowDelegate, new RowLoadingDelegate(), new SwipeToActionDelegate(rowDelegate, false));
                        return entitiesListController2.K.f150542c ? dli.f.a(entitiesListController2, entitiesListController2.R2(), listK, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56) : dli.f.a(entitiesListController2, entitiesListController2.R2(), listK, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        tc0.b uiState = (tc0.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f269564a;
        if (this.K.f150542c) {
            if (clause != null) {
                d3().f174546c.setHeaderModel(new lw0.a(clause, null, null, null, false, 30));
            }
        } else {
            NavBarWithToolbar navBarWithToolbar = f3().f174539b;
            navBarWithToolbar.setNavigationButtonImage(uiState.f269566c);
            navBarWithToolbar.setTitle(clause, null);
            if (clause != null) {
                navBarWithToolbar.setToolbarTitle(clause);
            }
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return ((fa0.m) this.P.getValue()).m().f312422a.getU();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fa0.m) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getF94770a0() {
        return new AnalyticsContext(((fa0.m) this.P.getValue()).m().a(this.K.f150540a));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.f150542c) {
            d3().f174545b.setText(new TextLocalisedClause(R$string.form_builder_entities_summary_bottom_sheet_got_it, null, null, 14));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new hb0.e(this, null), 3);
        if (this.K.f150542c) {
            ScreenContentRecyclerView navBarBottomSheetRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(navBarBottomSheetRecyclerView, "navBarBottomSheetRecyclerView");
            com.revolut.kompot.navigable.a.g2(this, sb0.e.a(navBarBottomSheetRecyclerView), null, new f(this, null, 0), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new f(this, null, 1), 3);
            return;
        }
        ScreenContentRecyclerView recyclerView = f3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        com.revolut.kompot.navigable.a.g2(this, sb0.e.a(recyclerView), null, new f(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f174539b.f59410q), null, new f(this, null, 3), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.O.getValue(this, T[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Q.getValue();
    }

    public final jii.m f3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
