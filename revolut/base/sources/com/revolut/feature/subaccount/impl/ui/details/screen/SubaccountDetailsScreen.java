package com.revolut.feature.subaccount.impl.ui.details.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import b8e.b;
import b8e.c;
import b8e.g;
import b8e.j;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreen;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r6e.o;
import r6e.p;
import te0.w;
import vc.s;
import xki.e;
import yy0.l;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/details/screen/SubaccountDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lb8e/j;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubaccountDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SubaccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SubaccountDetailsScreenContract$InputData K;
    public final h L;
    public final ProductSelectionDelegate M;
    public final CellDetailsDelegate N;
    public final CellDetailsChevronDelegate O;
    public final RowDelegate P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SubaccountDetailsScreen(SubaccountDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new ProductSelectionDelegate();
        this.N = new CellDetailsDelegate();
        this.O = new CellDetailsChevronDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: b8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubaccountDetailsScreen f13204b;

            {
                this.f13204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubaccountDetailsScreen subaccountDetailsScreen = this.f13204b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubaccountDetailsScreen.U;
                        return (g) ((p) subaccountDetailsScreen.T.getValue()).f251792h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubaccountDetailsScreen.U;
                        SubaccountDetailsScreen subaccountDetailsScreen2 = this.f13204b;
                        return dli.f.a(subaccountDetailsScreen2, (g) subaccountDetailsScreen2.R.getValue(), d0.E0(((fd6.a) ((p) subaccountDetailsScreen2.T.getValue()).d.get()).e, v.k(new RowLoadingDelegate(), subaccountDetailsScreen2.P, new HeaderDelegate(), new ListSubheaderDelegate(), subaccountDetailsScreen2.O, subaccountDetailsScreen2.N, subaccountDetailsScreen2.M, new FullScreenStateDelegate())), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SubaccountDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(subaccountDetailsScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        SubaccountDetailsScreenContract$InputData subaccountDetailsScreenContract$InputData = subaccountDetailsScreen.K;
                        subaccountDetailsScreenContract$InputData.getClass();
                        return new p(oVar, subaccountDetailsScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: b8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubaccountDetailsScreen f13204b;

            {
                this.f13204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubaccountDetailsScreen subaccountDetailsScreen = this.f13204b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubaccountDetailsScreen.U;
                        return (g) ((p) subaccountDetailsScreen.T.getValue()).f251792h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubaccountDetailsScreen.U;
                        SubaccountDetailsScreen subaccountDetailsScreen2 = this.f13204b;
                        return dli.f.a(subaccountDetailsScreen2, (g) subaccountDetailsScreen2.R.getValue(), d0.E0(((fd6.a) ((p) subaccountDetailsScreen2.T.getValue()).d.get()).e, v.k(new RowLoadingDelegate(), subaccountDetailsScreen2.P, new HeaderDelegate(), new ListSubheaderDelegate(), subaccountDetailsScreen2.O, subaccountDetailsScreen2.N, subaccountDetailsScreen2.M, new FullScreenStateDelegate())), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SubaccountDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(subaccountDetailsScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        SubaccountDetailsScreenContract$InputData subaccountDetailsScreenContract$InputData = subaccountDetailsScreen.K;
                        subaccountDetailsScreenContract$InputData.getClass();
                        return new p(oVar, subaccountDetailsScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: b8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubaccountDetailsScreen f13204b;

            {
                this.f13204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubaccountDetailsScreen subaccountDetailsScreen = this.f13204b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubaccountDetailsScreen.U;
                        return (g) ((p) subaccountDetailsScreen.T.getValue()).f251792h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubaccountDetailsScreen.U;
                        SubaccountDetailsScreen subaccountDetailsScreen2 = this.f13204b;
                        return dli.f.a(subaccountDetailsScreen2, (g) subaccountDetailsScreen2.R.getValue(), d0.E0(((fd6.a) ((p) subaccountDetailsScreen2.T.getValue()).d.get()).e, v.k(new RowLoadingDelegate(), subaccountDetailsScreen2.P, new HeaderDelegate(), new ListSubheaderDelegate(), subaccountDetailsScreen2.O, subaccountDetailsScreen2.N, subaccountDetailsScreen2.M, new FullScreenStateDelegate())), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SubaccountDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(subaccountDetailsScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        SubaccountDetailsScreenContract$InputData subaccountDetailsScreenContract$InputData = subaccountDetailsScreen.K;
                        subaccountDetailsScreenContract$InputData.getClass();
                        return new p(oVar, subaccountDetailsScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f13214b, null);
        Clause clause = uiState.f13215c;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setEndImage((l) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
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
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new i(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51821c), null, new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
