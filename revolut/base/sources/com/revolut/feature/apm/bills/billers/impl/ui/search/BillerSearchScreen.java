package com.revolut.feature.apm.bills.billers.impl.ui.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dm1.d;
import hm1.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lk4.g;
import lm1.b;
import lm1.f;
import lm1.j;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/billers/impl/ui/search/BillerSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldm1/d;", "Ldli/a;", "Llm1/f;", "feature_apm_bills_billers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillerSearchScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BillerSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BillerSearchNavigation$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BillerSearchScreen(BillerSearchNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: lm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillerSearchScreen f196852b;

            {
                this.f196852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BillerSearchScreen billerSearchScreen = this.f196852b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BillerSearchScreen.S;
                        BillerSearchScreen billerSearchScreen2 = this.f196852b;
                        return dli.f.a(billerSearchScreen2, billerSearchScreen2.d(), v.k(billerSearchScreen2.N, billerSearchScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BillerSearchScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(billerSearchScreen.m2()).a().get(hm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm1.d.class, " is not found"));
                        }
                        hm1.d dVar = ((hm1.d) aVar2.b()).f153500c;
                        BillerSearchNavigation$InputData billerSearchNavigation$InputData = billerSearchScreen.K;
                        billerSearchNavigation$InputData.getClass();
                        return new hm1.c(dVar, billerSearchNavigation$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BillerSearchScreen.S;
                        return (j) ((hm1.c) billerSearchScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: lm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillerSearchScreen f196852b;

            {
                this.f196852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BillerSearchScreen billerSearchScreen = this.f196852b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BillerSearchScreen.S;
                        BillerSearchScreen billerSearchScreen2 = this.f196852b;
                        return dli.f.a(billerSearchScreen2, billerSearchScreen2.d(), v.k(billerSearchScreen2.N, billerSearchScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BillerSearchScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(billerSearchScreen.m2()).a().get(hm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm1.d.class, " is not found"));
                        }
                        hm1.d dVar = ((hm1.d) aVar2.b()).f153500c;
                        BillerSearchNavigation$InputData billerSearchNavigation$InputData = billerSearchScreen.K;
                        billerSearchNavigation$InputData.getClass();
                        return new hm1.c(dVar, billerSearchNavigation$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BillerSearchScreen.S;
                        return (j) ((hm1.c) billerSearchScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: lm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillerSearchScreen f196852b;

            {
                this.f196852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BillerSearchScreen billerSearchScreen = this.f196852b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BillerSearchScreen.S;
                        BillerSearchScreen billerSearchScreen2 = this.f196852b;
                        return dli.f.a(billerSearchScreen2, billerSearchScreen2.d(), v.k(billerSearchScreen2.N, billerSearchScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BillerSearchScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(billerSearchScreen.m2()).a().get(hm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm1.d.class, " is not found"));
                        }
                        hm1.d dVar = ((hm1.d) aVar2.b()).f153500c;
                        BillerSearchNavigation$InputData billerSearchNavigation$InputData = billerSearchScreen.K;
                        billerSearchNavigation$InputData.getClass();
                        return new hm1.c(dVar, billerSearchNavigation$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BillerSearchScreen.S;
                        return (j) ((hm1.c) billerSearchScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHint(uiState.f196858c);
        Clause clause = uiState.f196857b;
        navBarWithToolbar.setTitleVisible(clause != null);
        if (clause != null) {
            navBarWithToolbar.setTitle(clause, null);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!q2().d()) {
            return super.F2();
        }
        d().C2(dm1.b.f115816a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new la8.h(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new le8.d(this, (Continuation) null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new lm1.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new lm1.d(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.a(recyclerView, 50, false, new g(this, 8));
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
