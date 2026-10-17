package com.revolut.feature.credit.direct.debit.account_confirm_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jm4.f3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lt.d;
import ly4.b;
import ly4.l;
import ly4.m;
import ly4.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_confirm_v2/DirectDebitConfirmScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lly4/l;", "Ldli/a;", "Lly4/n;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitConfirmScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DirectDebitConfirmScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    public DirectDebitConfirmScreen(DirectDebitConfirmScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = s.t(this, b.f);
        this.M = w.y0(new lv4.b(26));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ly4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitConfirmScreen f200674b;

            {
                this.f200674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitConfirmScreen.Q;
                        DirectDebitConfirmScreen directDebitConfirmScreen = this.f200674b;
                        return dli.f.a(directDebitConfirmScreen, (o) directDebitConfirmScreen.P.getValue(), u.c((CellDetailsDelegate) directDebitConfirmScreen.M.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitConfirmScreen.Q;
                        return (o) ((f3) this.f200674b.O.getValue()).f176077c.get();
                }
            }
        });
        this.O = w.y0(new ltf.b(this, inputData, 9));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ly4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitConfirmScreen f200674b;

            {
                this.f200674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitConfirmScreen.Q;
                        DirectDebitConfirmScreen directDebitConfirmScreen = this.f200674b;
                        return dli.f.a(directDebitConfirmScreen, (o) directDebitConfirmScreen.P.getValue(), u.c((CellDetailsDelegate) directDebitConfirmScreen.M.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitConfirmScreen.Q;
                        return (o) ((f3) this.f200674b.O.getValue()).f176077c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(uiState.f200692a.f200689a, null);
        m mVar = uiState.f200692a;
        navBarWithToolbar.setToolbarTitle(mVar.f200689a);
        navBarWithToolbar.setSecondDescriptionText(mVar.f200690b);
        navBarWithToolbar.setNavigationButtonImage(mVar.f200691c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174558c.setTextClause(uiState.f200693b);
        d3().f174557b.setText(uiState.f200694c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f3) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ly4.o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(rd0.e.b(((CellDetailsDelegate) this.M.getValue()).e), rd0.e.b(d3().f174558c.f58608l), new d(rd0.e.b(d3().e.f59410q), 5), new d(rd0.e.b(d3().f174557b.o), 6)), yx4.b.Companion, 18), null, new jl6.b(2, (ly4.o) this.P.getValue(), ly4.o.class, "onItemClilck", "onItemClilck(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 24), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
