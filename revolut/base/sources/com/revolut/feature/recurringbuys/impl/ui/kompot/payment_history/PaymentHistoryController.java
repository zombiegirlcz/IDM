package com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$InputData;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import rva.e;
import rva.f;
import te0.w;
import tki.c;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurringbuys/impl/ui/kompot/payment_history/PaymentHistoryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lrva/c;", "feature_recurring_buys_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentHistoryController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PaymentHistoryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PaymentHistoryContract$InputData K;
    public final Object L;
    public final Object M;
    public final RowDelegate N;
    public final int O;
    public final h P;
    public final Object Q;

    public PaymentHistoryController(PaymentHistoryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: rva.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentHistoryController f257739b;

            {
                this.f257739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentHistoryController paymentHistoryController = this.f257739b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentHistoryController.R;
                        return (b) ((mva.c) paymentHistoryController.M.getValue()).f209204c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentHistoryController.R;
                        phm.a aVar = (phm.a) ue0.e.j(paymentHistoryController.m2()).a().get(mva.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mva.d.class, " is not found"));
                        }
                        mva.d dVar = ((mva.d) aVar2.b()).f209207c;
                        PaymentHistoryContract$InputData paymentHistoryContract$InputData = paymentHistoryController.K;
                        paymentHistoryContract$InputData.getClass();
                        return new mva.c(dVar, paymentHistoryContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentHistoryController.R;
                        PaymentHistoryController paymentHistoryController2 = this.f257739b;
                        return tki.g.a(paymentHistoryController2, (b) paymentHistoryController2.L.getValue(), v.k(new SwipeToActionDelegate(paymentHistoryController2.N, false), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: rva.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentHistoryController f257739b;

            {
                this.f257739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentHistoryController paymentHistoryController = this.f257739b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentHistoryController.R;
                        return (b) ((mva.c) paymentHistoryController.M.getValue()).f209204c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentHistoryController.R;
                        phm.a aVar = (phm.a) ue0.e.j(paymentHistoryController.m2()).a().get(mva.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mva.d.class, " is not found"));
                        }
                        mva.d dVar = ((mva.d) aVar2.b()).f209207c;
                        PaymentHistoryContract$InputData paymentHistoryContract$InputData = paymentHistoryController.K;
                        paymentHistoryContract$InputData.getClass();
                        return new mva.c(dVar, paymentHistoryContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentHistoryController.R;
                        PaymentHistoryController paymentHistoryController2 = this.f257739b;
                        return tki.g.a(paymentHistoryController2, (b) paymentHistoryController2.L.getValue(), v.k(new SwipeToActionDelegate(paymentHistoryController2.N, false), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new RowDelegate(null, null, 7);
        this.O = R$layout.screen_recycler_navbar;
        this.P = s.t(this, e.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: rva.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentHistoryController f257739b;

            {
                this.f257739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentHistoryController paymentHistoryController = this.f257739b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentHistoryController.R;
                        return (b) ((mva.c) paymentHistoryController.M.getValue()).f209204c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentHistoryController.R;
                        phm.a aVar = (phm.a) ue0.e.j(paymentHistoryController.m2()).a().get(mva.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mva.d.class, " is not found"));
                        }
                        mva.d dVar = ((mva.d) aVar2.b()).f209207c;
                        PaymentHistoryContract$InputData paymentHistoryContract$InputData = paymentHistoryController.K;
                        paymentHistoryContract$InputData.getClass();
                        return new mva.c(dVar, paymentHistoryContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentHistoryController.R;
                        PaymentHistoryController paymentHistoryController2 = this.f257739b;
                        return tki.g.a(paymentHistoryController2, (b) paymentHistoryController2.L.getValue(), v.k(new SwipeToActionDelegate(paymentHistoryController2.N, false), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        rva.c uiState = (rva.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        CompositeClause compositeClause = uiState.f257737b;
        navBarWithToolbar.setTitle(compositeClause, null);
        navBarWithToolbar.setToolbarTitle(compositeClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mva.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (rva.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new f(this, null), 3);
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new rlh.c(this, null, 20), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
