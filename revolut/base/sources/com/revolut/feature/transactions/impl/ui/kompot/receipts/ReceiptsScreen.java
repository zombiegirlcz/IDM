package com.revolut.feature.transactions.impl.ui.kompot.receipts;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreen;
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
import mlf.c;
import te0.w;
import vc.s;
import xki.e;
import ymf.b;
import ymf.f;
import ymf.g;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/kompot/receipts/ReceiptsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lymf/g;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReceiptsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ReceiptsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final CellDetailsReceiptDelegate O;
    public final Object P;

    public ReceiptsScreen(ReceiptsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new yff.b(this, inputData, 10));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ymf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReceiptsScreen f314974b;

            {
                this.f314974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReceiptsScreen.Q;
                        return (f) ((mlf.c) this.f314974b.M.getValue()).f206723c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReceiptsScreen.Q;
                        ReceiptsScreen receiptsScreen = this.f314974b;
                        return dli.f.a(receiptsScreen, (f) receiptsScreen.N.getValue(), u.c(receiptsScreen.O), 0, null, null, null, 60);
                }
            }
        });
        this.O = new CellDetailsReceiptDelegate();
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ymf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReceiptsScreen f314974b;

            {
                this.f314974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReceiptsScreen.Q;
                        return (f) ((mlf.c) this.f314974b.M.getValue()).f206723c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReceiptsScreen.Q;
                        ReceiptsScreen receiptsScreen = this.f314974b;
                        return dli.f.a(receiptsScreen, (f) receiptsScreen.N.getValue(), u.c(receiptsScreen.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_receipts, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new yl6.b(this, null, 3), 3);
        CellDetailsReceiptDelegate cellDetailsReceiptDelegate = this.O;
        ViewController.P2(this, rd0.e.b(cellDetailsReceiptDelegate.d), new ymf.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsReceiptDelegate.f51888c), new ymf.c(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
