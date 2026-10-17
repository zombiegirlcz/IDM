package com.revolut.feature.tab.crypto.impl.ui;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import cli.o;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.feature.tab.crypto.impl.R$id;
import com.revolut.feature.tab.crypto.impl.R$layout;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import fnc.s;
import hx0.d0;
import java.util.List;
import jji.h;
import jji.u;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import qh0.d;
import qje.g;
import qje.i;
import qje.j;
import qje.k;
import qje.l;
import qje.p;
import qji.b;
import r10.v;
import ski.c;
import te0.w;
import tx0.t2;
import ux0.s0;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lski/a;", "Lqje/p;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$TabPagerItem;", "Lhx0/d0;", "Lkji/f;", "Lno/d1;", "Ljji/h;", "<init>", "()V", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabCryptoFlow extends ViewController<q> implements ski.a, d0, f, d1, h {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TabCryptoFlow.class, "binding", "getBinding()Lcom/revolut/feature/tab/crypto/impl/databinding/FlowTabCryptoBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object P;
    public final s K = new s(new u(this));
    public final ao.h L = vc.s.t(this, a.f);
    public final int M = R$layout.flow_tab_crypto;
    public final Object Q = w.y0(new d(19));

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, fje.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/tab/crypto/impl/databinding/FlowTabCryptoBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return fje.a.a(p0);
        }
    }

    public TabCryptoFlow() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qje.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCryptoFlow f246837b;

            {
                this.f246837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TabCryptoFlow tabCryptoFlow = this.f246837b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TabCryptoFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(tabCryptoFlow.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new jje.d(((jje.c) aVar2.b()).V, tabCryptoFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TabCryptoFlow.R;
                        return (l) ((jje.d) tabCryptoFlow.N.getValue()).f174858q.get();
                    default:
                        KProperty[] kPropertyArr3 = TabCryptoFlow.R;
                        return czi.c.c(tabCryptoFlow, R$id.flowTabCrypto_Pager, tabCryptoFlow.R2());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qje.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCryptoFlow f246837b;

            {
                this.f246837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TabCryptoFlow tabCryptoFlow = this.f246837b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabCryptoFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(tabCryptoFlow.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new jje.d(((jje.c) aVar2.b()).V, tabCryptoFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TabCryptoFlow.R;
                        return (l) ((jje.d) tabCryptoFlow.N.getValue()).f174858q.get();
                    default:
                        KProperty[] kPropertyArr3 = TabCryptoFlow.R;
                        return czi.c.c(tabCryptoFlow, R$id.flowTabCrypto_Pager, tabCryptoFlow.R2());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qje.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCryptoFlow f246837b;

            {
                this.f246837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TabCryptoFlow tabCryptoFlow = this.f246837b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabCryptoFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(tabCryptoFlow.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new jje.d(((jje.c) aVar2.b()).V, tabCryptoFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TabCryptoFlow.R;
                        return (l) ((jje.d) tabCryptoFlow.N.getValue()).f174858q.get();
                    default:
                        KProperty[] kPropertyArr3 = TabCryptoFlow.R;
                        return czi.c.c(tabCryptoFlow, R$id.flowTabCrypto_Pager, tabCryptoFlow.R2());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        s0.setModels$default(d3().f135606b, uiState.f246844b, null, 2, null);
        NavBarWithContainer navBarWithContainer = d3().f135607c;
        List<? extends NavBarMenuItem> list = uiState.f246845c;
        navBarWithContainer.setMenuItems(list);
        ((vqi.a) ((jje.d) this.N.getValue()).f174849b.W.get()).b(list);
        navBarWithContainer.setAvatar(new t2(uiState.f246843a.f168357a, uiState.e));
        navBarWithContainer.setMessage(uiState.f);
        Clause clause = uiState.d;
        if (clause != null) {
            navBarWithContainer.setHeaderDisclaimer(clause);
        }
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TabCryptoFlowContract$TabPagerItem pagerItem2 = (TabCryptoFlowContract$TabPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        qje.u uVar = (qje.u) R2();
        uVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        uVar.J2().e3(pagerItem2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jje.d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (jje.d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.home_crypto, null, null, 14));
        ((j60.a) ((jje.d) this.N.getValue()).f.get()).d(zhm.u.c((AccountCellItemDelegate) this.Q.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f135607c.setSearchButtonText(new TextLocalisedClause(R$string.tab_crypto_home_header_search_placeholder, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.j()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.k()), null, new qje.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.e.f59175q), null, new qje.h(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.e.f59176r), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.e.f59173n), null, new qje.h(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135607c.D()), null, new qje.h(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135607c.F()), null, new qje.h(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135607c.b()), null, new g(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135607c.L()), null, new qje.h(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.f283811r), null, new g(this, null, 0), 3);
        v vVar = d3().f135607c.f59369w;
        vVar.c();
        com.revolut.kompot.navigable.a.g2(this, kii.e.t(((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).S, "hide(...)"), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135606b.e.f59171l), null, new qje.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((AccountCellItemDelegate) this.Q.getValue()).f51551c.f53218h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135607c.H()), null, new g(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135607c.I()), null, new g(this, null, 3), 3);
    }

    public final fje.a d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (fje.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.O.getValue();
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
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getK() {
        return this.K;
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f135605a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }
}
