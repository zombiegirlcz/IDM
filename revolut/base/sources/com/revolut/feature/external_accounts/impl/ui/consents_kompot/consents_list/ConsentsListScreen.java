package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.l;
import q97.b1;
import ql6.b;
import ql6.k;
import ql6.n;
import te0.w;
import tx0.j0;
import vc.s;
import xf6.k2;
import xf6.w2;
import xf6.x2;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_list/ConsentsListScreenContract$OutputData;", "Ldli/a;", "Lql6/o;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentsListScreen extends ViewController<ConsentsListScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ConsentsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ConsentsListScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final CellDetailsChevronDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public ConsentsListScreen(ConsentsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new RowDelegate(null, null, 7);
        this.N = new CellDetailsChevronDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ql6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentsListScreen f247201b;

            {
                this.f247201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentsListScreen consentsListScreen = this.f247201b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentsListScreen.S;
                        ConsentsListScreen consentsListScreen2 = this.f247201b;
                        return dli.f.a(consentsListScreen2, consentsListScreen2.d(), zhm.v.k(consentsListScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), consentsListScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentsListScreen.S;
                        qji.b bVarU2 = consentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.di.ConsentsListScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        ConsentsListScreenContract$InputData consentsListScreenContract$InputData = consentsListScreen.K;
                        consentsListScreenContract$InputData.getClass();
                        return new k2(w2Var, x2Var2, consentsListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentsListScreen.S;
                        return (n) ((k2) consentsListScreen.Q.getValue()).f304918c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ql6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentsListScreen f247201b;

            {
                this.f247201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentsListScreen consentsListScreen = this.f247201b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentsListScreen.S;
                        ConsentsListScreen consentsListScreen2 = this.f247201b;
                        return dli.f.a(consentsListScreen2, consentsListScreen2.d(), zhm.v.k(consentsListScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), consentsListScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentsListScreen.S;
                        qji.b bVarU2 = consentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.di.ConsentsListScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        ConsentsListScreenContract$InputData consentsListScreenContract$InputData = consentsListScreen.K;
                        consentsListScreenContract$InputData.getClass();
                        return new k2(w2Var, x2Var2, consentsListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentsListScreen.S;
                        return (n) ((k2) consentsListScreen.Q.getValue()).f304918c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ql6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentsListScreen f247201b;

            {
                this.f247201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsentsListScreen consentsListScreen = this.f247201b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentsListScreen.S;
                        ConsentsListScreen consentsListScreen2 = this.f247201b;
                        return dli.f.a(consentsListScreen2, consentsListScreen2.d(), zhm.v.k(consentsListScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), consentsListScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentsListScreen.S;
                        qji.b bVarU2 = consentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.di.ConsentsListScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        ConsentsListScreenContract$InputData consentsListScreenContract$InputData = consentsListScreen.K;
                        consentsListScreenContract$InputData.getClass();
                        return new k2(w2Var, x2Var2, consentsListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentsListScreen.S;
                        return (n) ((k2) consentsListScreen.Q.getValue()).f304918c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((ql6.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k2) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        ConsentsListScreenContract$InputData consentsListScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(consentsListScreenContract$InputData.f72781a.getF60399b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(consentsListScreenContract$InputData.f72781a.getF60399b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new k(this, null, 1), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, new l(new b1(rd0.e.b(rowDelegate.f53218h), 4), 22), new ql6.l(this, null, 0), 3);
        ViewController.P2(this, new l(new b1(rd0.e.b(rowDelegate.f53218h), 5), 20), new k(this, null, 2), 3);
        ViewController.P2(this, new l(new b1(rd0.e.b(rowDelegate.f53220l), 6), 23), new ql6.l(this, null, 1), 3);
        ViewController.P2(this, new l(new b1(rd0.e.b(this.N.f51821c), 7), 21), new k(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
