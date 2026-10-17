package com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreenContract$InputData;
import dli.a;
import dze.n;
import e2l.b;
import e2l.f;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.p3;
import vc.s;
import xki.e;
import y1l.c;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/screens/enrollment/TravelStatusEnrollmentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le2l/f;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelStatusEnrollmentScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelStatusEnrollmentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final TravelStatusEnrollmentScreenContract$InputData K;
    public final int L;
    public final InputTextDelegate M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelStatusEnrollmentScreen(TravelStatusEnrollmentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = new InputTextDelegate(null);
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusEnrollmentScreen f122139b;

            {
                this.f122139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelStatusEnrollmentScreen travelStatusEnrollmentScreen = this.f122139b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusEnrollmentScreen.R;
                        qji.b bVarU2 = travelStatusEnrollmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.di.TravelStatusEnrollmentScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusEnrollmentScreenContract$InputData travelStatusEnrollmentScreenContract$InputData = travelStatusEnrollmentScreen.K;
                        travelStatusEnrollmentScreenContract$InputData.getClass();
                        return new y1l.c(bVar, dVar2, travelStatusEnrollmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusEnrollmentScreen.R;
                        return (e) ((y1l.c) travelStatusEnrollmentScreen.O.getValue()).f310402b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusEnrollmentScreen.R;
                        TravelStatusEnrollmentScreen travelStatusEnrollmentScreen2 = this.f122139b;
                        return dli.f.a(travelStatusEnrollmentScreen2, (e) travelStatusEnrollmentScreen2.P.getValue(), u.c(travelStatusEnrollmentScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusEnrollmentScreen f122139b;

            {
                this.f122139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelStatusEnrollmentScreen travelStatusEnrollmentScreen = this.f122139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusEnrollmentScreen.R;
                        qji.b bVarU2 = travelStatusEnrollmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.di.TravelStatusEnrollmentScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusEnrollmentScreenContract$InputData travelStatusEnrollmentScreenContract$InputData = travelStatusEnrollmentScreen.K;
                        travelStatusEnrollmentScreenContract$InputData.getClass();
                        return new y1l.c(bVar, dVar2, travelStatusEnrollmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusEnrollmentScreen.R;
                        return (e) ((y1l.c) travelStatusEnrollmentScreen.O.getValue()).f310402b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusEnrollmentScreen.R;
                        TravelStatusEnrollmentScreen travelStatusEnrollmentScreen2 = this.f122139b;
                        return dli.f.a(travelStatusEnrollmentScreen2, (e) travelStatusEnrollmentScreen2.P.getValue(), u.c(travelStatusEnrollmentScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusEnrollmentScreen f122139b;

            {
                this.f122139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelStatusEnrollmentScreen travelStatusEnrollmentScreen = this.f122139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusEnrollmentScreen.R;
                        qji.b bVarU2 = travelStatusEnrollmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.di.TravelStatusEnrollmentScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusEnrollmentScreenContract$InputData travelStatusEnrollmentScreenContract$InputData = travelStatusEnrollmentScreen.K;
                        travelStatusEnrollmentScreenContract$InputData.getClass();
                        return new y1l.c(bVar, dVar2, travelStatusEnrollmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusEnrollmentScreen.R;
                        return (e) ((y1l.c) travelStatusEnrollmentScreen.O.getValue()).f310402b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusEnrollmentScreen.R;
                        TravelStatusEnrollmentScreen travelStatusEnrollmentScreen2 = this.f122139b;
                        return dli.f.a(travelStatusEnrollmentScreen2, (e) travelStatusEnrollmentScreen2.P.getValue(), u.c(travelStatusEnrollmentScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(uiState.f122144b, null);
        Clause clause = uiState.f122145c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setEndImage(new p3(new AvatarModel.Default(uiState.d, null, null, null, null, null, 126)));
        d3().f174533b.setModel(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (e2l.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new n(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.e.f121375b), null, new e2l.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(d3().f174533b.f), rd0.e.b(d3().f174533b.f58955g)), null, new e0b.c(this, null, 8), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
