package com.revolut.feature.tab.crypto.impl.ui.v2;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import aw0.b;
import cli.o;
import cli.q;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.tab.crypto.impl.R$id;
import com.revolut.feature.tab.crypto.impl.R$layout;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$TabPagerItem;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import efm.r;
import fnc.s;
import hx0.d0;
import java.util.List;
import jje.e;
import jji.h;
import jji.u;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import r10.v;
import ski.c;
import te0.w;
import tx0.t2;
import zje.d;
import zje.g;
import zje.i;
import zje.j;
import zje.k;
import zje.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoFlowV2;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzje/j;", "Lski/a;", "Lzje/k;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$TabPagerItem;", "Lhx0/d0;", "Lkji/f;", "Lno/d1;", "Ljji/h;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabCryptoFlowV2 extends ViewController<j> implements ski.a, d0, f, d1, h {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TabCryptoFlowV2.class, "binding", "getBinding()Lcom/revolut/feature/tab/crypto/impl/databinding/FlowTabCryptoBinding;", 0))};
    public final zje.a K;
    public final ao.h L;
    public final Object M;
    public final s N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TabCryptoFlowV2(zje.a accountSelectionRelay) {
        Intrinsics.checkNotNullParameter(accountSelectionRelay, "accountSelectionRelay");
        this.K = accountSelectionRelay;
        this.L = vc.s.t(this, d.f);
        this.M = w.y0(new zj9.a(1));
        this.N = new s(new u(this));
        this.O = R$layout.flow_tab_crypto;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zje.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCryptoFlowV2 f322793b;

            {
                this.f322793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TabCryptoFlowV2 tabCryptoFlowV2 = this.f322793b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TabCryptoFlowV2.S;
                        phm.a aVar = (phm.a) ue0.e.j(tabCryptoFlowV2.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        a aVar3 = tabCryptoFlowV2.K;
                        aVar3.getClass();
                        return new jje.e(cVar, new d16.a(), tabCryptoFlowV2, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = TabCryptoFlowV2.S;
                        jje.e eVar = (jje.e) ((fke.e) tabCryptoFlowV2.P.getValue());
                        cli.n nVar = (cli.n) eVar.u.get();
                        eke.h hVar = (eke.h) eVar.f174874w.get();
                        eke.c cVar2 = (eke.c) eVar.z.get();
                        eke.d dVar = (eke.d) eVar.A.get();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize.addAll((Iterable) eVar.f174875x.get());
                        return new n(nVar, hVar, cVar2, dVar, j6.a.g(eVar.f174869p, builderBuilderWithExpectedSize), eVar.f174862c);
                    default:
                        KProperty[] kPropertyArr3 = TabCryptoFlowV2.S;
                        return czi.c.c(tabCryptoFlowV2, R$id.flowTabCrypto_Pager, tabCryptoFlowV2.R2());
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zje.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCryptoFlowV2 f322793b;

            {
                this.f322793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TabCryptoFlowV2 tabCryptoFlowV2 = this.f322793b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabCryptoFlowV2.S;
                        phm.a aVar = (phm.a) ue0.e.j(tabCryptoFlowV2.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        a aVar3 = tabCryptoFlowV2.K;
                        aVar3.getClass();
                        return new jje.e(cVar, new d16.a(), tabCryptoFlowV2, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = TabCryptoFlowV2.S;
                        jje.e eVar = (jje.e) ((fke.e) tabCryptoFlowV2.P.getValue());
                        cli.n nVar = (cli.n) eVar.u.get();
                        eke.h hVar = (eke.h) eVar.f174874w.get();
                        eke.c cVar2 = (eke.c) eVar.z.get();
                        eke.d dVar = (eke.d) eVar.A.get();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize.addAll((Iterable) eVar.f174875x.get());
                        return new n(nVar, hVar, cVar2, dVar, j6.a.g(eVar.f174869p, builderBuilderWithExpectedSize), eVar.f174862c);
                    default:
                        KProperty[] kPropertyArr3 = TabCryptoFlowV2.S;
                        return czi.c.c(tabCryptoFlowV2, R$id.flowTabCrypto_Pager, tabCryptoFlowV2.R2());
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zje.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCryptoFlowV2 f322793b;

            {
                this.f322793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TabCryptoFlowV2 tabCryptoFlowV2 = this.f322793b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabCryptoFlowV2.S;
                        phm.a aVar = (phm.a) ue0.e.j(tabCryptoFlowV2.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        a aVar3 = tabCryptoFlowV2.K;
                        aVar3.getClass();
                        return new jje.e(cVar, new d16.a(), tabCryptoFlowV2, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = TabCryptoFlowV2.S;
                        jje.e eVar = (jje.e) ((fke.e) tabCryptoFlowV2.P.getValue());
                        cli.n nVar = (cli.n) eVar.u.get();
                        eke.h hVar = (eke.h) eVar.f174874w.get();
                        eke.c cVar2 = (eke.c) eVar.z.get();
                        eke.d dVar = (eke.d) eVar.A.get();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize.addAll((Iterable) eVar.f174875x.get());
                        return new n(nVar, hVar, cVar2, dVar, j6.a.g(eVar.f174869p, builderBuilderWithExpectedSize), eVar.f174862c);
                    default:
                        KProperty[] kPropertyArr3 = TabCryptoFlowV2.S;
                        return czi.c.c(tabCryptoFlowV2, R$id.flowTabCrypto_Pager, tabCryptoFlowV2.R2());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AccountsNavBarContentView accountsNavBarContentView = d3().f135606b;
        List<b> list = uiState.f322799b;
        List<? extends NavBarMenuItem> list2 = uiState.e;
        accountsNavBarContentView.setModels(list, uiState.f322800c);
        String str = uiState.d;
        if (str != null) {
            accountsNavBarContentView.setCurrentPage(str);
        }
        NavBarWithContainer navBarWithContainer = d3().f135607c;
        navBarWithContainer.setMenuItems(list2);
        ((vqi.a) ((e) ((fke.e) this.P.getValue())).d.W.get()).b(list2);
        navBarWithContainer.setAvatar(new t2(uiState.f322798a.f168357a, uiState.f322801g));
        navBarWithContainer.setMessage(uiState.f322802h);
        navBarWithContainer.setHeaderDisclaimer(uiState.f);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TabCryptoFlowContract$TabPagerItem pagerItem2 = (TabCryptoFlowContract$TabPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        n nVarR2 = R2();
        nVarR2.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        ((eke.b) nVarR2.f322807q).a(pagerItem2.f89793a);
        ((eke.e) nVarR2.v.getValue()).e3(pagerItem2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (fke.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (fke.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.home_crypto, null, null, 14));
        ((j60.a) ((e) ((fke.e) this.P.getValue())).f174864h.get()).d(zhm.u.c((AccountCellItemDelegate) this.M.getValue()));
        d3().f135607c.setSearchButtonText(new TextLocalisedClause(R$string.tab_crypto_home_header_search_placeholder, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f135606b.j()), new zje.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f135606b.e.f59175q), new zje.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f135606b.e.f59176r), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f135606b.e.f59173n), new zje.e(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f135607c.D()), new zje.e(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f135607c.b()), new zje.f(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f135607c.L()), new zje.e(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f135606b.f283811r), new zje.f(this, continuation, 4), 3);
        v vVar = d3().f135607c.f59369w;
        vVar.c();
        ViewController.P2(this, kii.e.t(((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).S, "hide(...)"), new zje.f(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f135606b.e.f59171l), new zje.e(this, null, 0), 3);
        r rVarDistinctUntilChanged = w.b0(d3().f135606b.e.f59174p, new tx.f(1)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewController.P2(this, vkm.q.t(rd0.e.b(rVarDistinctUntilChanged), 1), new zje.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f135606b.e.i), new zje.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((AccountCellItemDelegate) this.M.getValue()).f51551c.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f135607c.H()), new zje.f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f135607c.I()), new zje.f(this, continuation, 2), 3);
    }

    public final fje.a d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (fje.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.Q.getValue();
    }

    @Override // jji.h
    public final NavBarWithContainer f() {
        NavBarWithContainer flowTabCryptoNavBarWithContainer = d3().f135607c;
        Intrinsics.checkNotNullExpressionValue(flowTabCryptoNavBarWithContainer, "flowTabCryptoNavBarWithContainer");
        return flowTabCryptoNavBarWithContainer;
    }

    @Override // jji.h
    public final View getContent() {
        ViewPager2 flowTabCryptoPager = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowTabCryptoPager, "flowTabCryptoPager");
        return flowTabCryptoPager;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getN() {
        return this.N;
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f135605a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }
}
