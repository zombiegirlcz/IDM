package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import b3j.t;
import b3j.x;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list.SearchListScreen;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m4j.c;
import m4j.d;
import m4j.g;
import m4j.h;
import m4j.i;
import m4j.j;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/search_list/SearchListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm4j/h;", "Ldli/a;", "Lm4j/j;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SearchListScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SearchListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final g K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SearchListScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, c.f);
        this.N = w.y0(new m3g.c(2));
        this.O = w.y0(new m3g.c(3));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: m4j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchListScreen f202732b;

            {
                this.f202732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SearchListScreen searchListScreen = this.f202732b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SearchListScreen.S;
                        return (i) ((x) searchListScreen.R.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SearchListScreen.S;
                        SearchListScreen searchListScreen2 = this.f202732b;
                        return dli.f.a(searchListScreen2, (i) searchListScreen2.P.getValue(), v.k((RowDelegate) searchListScreen2.N.getValue(), (FullScreenStateDelegate) searchListScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SearchListScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(searchListScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        g gVar = searchListScreen.K;
                        gVar.getClass();
                        return new x(tVar, searchListScreen, gVar);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: m4j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchListScreen f202732b;

            {
                this.f202732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SearchListScreen searchListScreen = this.f202732b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SearchListScreen.S;
                        return (i) ((x) searchListScreen.R.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SearchListScreen.S;
                        SearchListScreen searchListScreen2 = this.f202732b;
                        return dli.f.a(searchListScreen2, (i) searchListScreen2.P.getValue(), v.k((RowDelegate) searchListScreen2.N.getValue(), (FullScreenStateDelegate) searchListScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SearchListScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(searchListScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        g gVar = searchListScreen.K;
                        gVar.getClass();
                        return new x(tVar, searchListScreen, gVar);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: m4j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchListScreen f202732b;

            {
                this.f202732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SearchListScreen searchListScreen = this.f202732b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SearchListScreen.S;
                        return (i) ((x) searchListScreen.R.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SearchListScreen.S;
                        SearchListScreen searchListScreen2 = this.f202732b;
                        return dli.f.a(searchListScreen2, (i) searchListScreen2.P.getValue(), v.k((RowDelegate) searchListScreen2.N.getValue(), (FullScreenStateDelegate) searchListScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SearchListScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(searchListScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        g gVar = searchListScreen.K;
                        gVar.getClass();
                        return new x(tVar, searchListScreen, gVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f202741b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        d3().f174539b.setHint(uiState.f202742c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new lpl.c(this, continuation, 18), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new lph.h(this, continuation, 23), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new m4j.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
