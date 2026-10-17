package com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pqc.d;
import pqc.f;
import pqc.h;
import pqc.i;
import pqc.j;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;
import zpc.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/bank_list/BankListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpqc/h;", "Ltki/c;", "Lpqc/j;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankListScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BankListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final ao.h Q;

    public BankListScreen(BankListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankListScreen f238716b;

            {
                this.f238716b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BankListScreen.R;
                        BankListScreen bankListScreen = this.f238716b;
                        return tki.g.a(bankListScreen, bankListScreen.d(), v.k((FullScreenStateDelegate) bankListScreen.O.getValue(), (RowDelegate) bankListScreen.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = BankListScreen.R;
                        return (i) ((zpc.b) this.f238716b.M.getValue()).f324235b.get();
                }
            }
        });
        this.M = w.y0(new pe2.c(this, inputData, 25));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankListScreen f238716b;

            {
                this.f238716b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankListScreen.R;
                        BankListScreen bankListScreen = this.f238716b;
                        return tki.g.a(bankListScreen, bankListScreen.d(), v.k((FullScreenStateDelegate) bankListScreen.O.getValue(), (RowDelegate) bankListScreen.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = BankListScreen.R;
                        return (i) ((zpc.b) this.f238716b.M.getValue()).f324235b.get();
                }
            }
        });
        this.O = w.y0(new pni.a(5));
        this.P = w.y0(new pni.a(6));
        this.Q = s.t(this, pqc.c.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f238725b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_br_bank_list_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.salary_switch_br_bank_list_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.salary_switch_br_bank_list_search_hint, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new pnb.b(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new pqc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
