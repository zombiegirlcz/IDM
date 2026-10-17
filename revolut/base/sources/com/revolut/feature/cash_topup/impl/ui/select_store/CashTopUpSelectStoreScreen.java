package com.revolut.feature.cash_topup.impl.ui.select_store;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.select_store.CashTopUpSelectStoreScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qc3.b;
import qc3.c;
import qc3.d;
import qc3.f;
import qc3.g;
import qc3.i;
import qc3.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/select_store/CashTopUpSelectStoreScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqc3/g;", "Ldli/a;", "Lqc3/j;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpSelectStoreScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CashTopUpSelectStoreScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final RowDelegate M;
    public final SingleChoiceDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CashTopUpSelectStoreScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new SingleChoiceDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpSelectStoreScreen f244539b;

            {
                this.f244539b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpSelectStoreScreen.R;
                        CashTopUpSelectStoreScreen cashTopUpSelectStoreScreen = this.f244539b;
                        return dli.f.a(cashTopUpSelectStoreScreen, (i) cashTopUpSelectStoreScreen.Q.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), cashTopUpSelectStoreScreen.M, cashTopUpSelectStoreScreen.N), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CashTopUpSelectStoreScreen.R;
                        return (i) ((mb3.v) this.f244539b.P.getValue()).d.get();
                }
            }
        });
        this.P = w.y0(new qba.b(this, inputData, 2));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: qc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpSelectStoreScreen f244539b;

            {
                this.f244539b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpSelectStoreScreen.R;
                        CashTopUpSelectStoreScreen cashTopUpSelectStoreScreen = this.f244539b;
                        return dli.f.a(cashTopUpSelectStoreScreen, (i) cashTopUpSelectStoreScreen.Q.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), cashTopUpSelectStoreScreen.M, cashTopUpSelectStoreScreen.N), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CashTopUpSelectStoreScreen.R;
                        return (i) ((mb3.v) this.f244539b.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mb3.v) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_cash_report_issue_store_list_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new q43.m(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.M.f53218h, new qb5.a(22))), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.p()), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
