package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreen;
import ja3.b;
import jcj.c;
import jcj.d;
import jcj.f;
import jcj.k;
import jcj.l;
import jcj.m;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qbj.x;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/summary/ReturnCryptoDepositSummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljcj/k;", "Ldli/a;", "Ljcj/m;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReturnCryptoDepositSummaryScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ReturnCryptoDepositSummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ReturnCryptoDepositSummaryScreen(ReturnCryptoDepositSummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, c.f);
        this.L = w.y0(new b(4));
        this.M = w.y0(new b(5));
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = w.y0(new j68.a(this, inputData, 14));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: jcj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositSummaryScreen f172824b;

            {
                this.f172824b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReturnCryptoDepositSummaryScreen.R;
                        return (l) ((x) this.f172824b.O.getValue()).f244370c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReturnCryptoDepositSummaryScreen.R;
                        ReturnCryptoDepositSummaryScreen returnCryptoDepositSummaryScreen = this.f172824b;
                        return dli.f.a(returnCryptoDepositSummaryScreen, returnCryptoDepositSummaryScreen.d(), v.k((CellDetailsDelegate) returnCryptoDepositSummaryScreen.L.getValue(), (CellDetailsActionDelegate) returnCryptoDepositSummaryScreen.M.getValue(), new CellDetailsLoadingDelegate()), returnCryptoDepositSummaryScreen.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: jcj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositSummaryScreen f172824b;

            {
                this.f172824b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReturnCryptoDepositSummaryScreen.R;
                        return (l) ((x) this.f172824b.O.getValue()).f244370c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReturnCryptoDepositSummaryScreen.R;
                        ReturnCryptoDepositSummaryScreen returnCryptoDepositSummaryScreen = this.f172824b;
                        return dli.f.a(returnCryptoDepositSummaryScreen, returnCryptoDepositSummaryScreen.d(), v.k((CellDetailsDelegate) returnCryptoDepositSummaryScreen.L.getValue(), (CellDetailsActionDelegate) returnCryptoDepositSummaryScreen.M.getValue(), new CellDetailsLoadingDelegate()), returnCryptoDepositSummaryScreen.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setText(uiState.f172832b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_receive_deposit_review_return_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.L.getValue()).f), new jcj.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.M.getValue()).d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
