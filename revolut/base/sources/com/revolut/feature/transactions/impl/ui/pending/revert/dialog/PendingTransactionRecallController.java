package com.revolut.feature.transactions.impl.ui.pending.revert.dialog;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import gnf.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import lea.b;
import lnf.d;
import lnf.f;
import lnf.j;
import vc.s;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/pending/revert/dialog/PendingTransactionRecallController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llnf/j;", "Lcli/w;", "Llnf/f;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingTransactionRecallController extends ViewController<j> implements w {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PendingTransactionRecallController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final LargeActionButtonDelegate P;
    public final z4l.j Q;

    public PendingTransactionRecallController(PendingTransactionRecallControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = te0.w.y0(new b(this, inputData, 15));
        this.L = R$layout.screen_bottom_sheet_list;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: lnf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingTransactionRecallController f197237b;

            {
                this.f197237b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PendingTransactionRecallController pendingTransactionRecallController = this.f197237b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PendingTransactionRecallController.R;
                        return n14.e.a(pendingTransactionRecallController, (e) pendingTransactionRecallController.N.getValue());
                    default:
                        KProperty[] kPropertyArr2 = PendingTransactionRecallController.R;
                        return (e) ((gnf.c) pendingTransactionRecallController.K.getValue()).f144982c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: lnf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingTransactionRecallController f197237b;

            {
                this.f197237b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PendingTransactionRecallController pendingTransactionRecallController = this.f197237b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingTransactionRecallController.R;
                        return n14.e.a(pendingTransactionRecallController, (e) pendingTransactionRecallController.N.getValue());
                    default:
                        KProperty[] kPropertyArr2 = PendingTransactionRecallController.R;
                        return (e) ((gnf.c) pendingTransactionRecallController.K.getValue()).f144982c.get();
                }
            }
        });
        this.O = s.t(this, lnf.b.f);
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.P = largeActionButtonDelegate;
        this.Q = new z4l.j(7, v.k(new RowDelegate(null, null, 7), largeActionButtonDelegate), false);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174519b.setHeaderModel(uiState.f197239a);
        this.Q.c(uiState.f197240b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lnf.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(this.P.d.f121375b), null, new d(this, null), 3);
        a.g2(this, new f0(rd0.e.b(d3().f174519b.F), 26), null, new la8.h(this, null, 25), 3);
        ScreenContentRecyclerView bottomSheetListRecyclerView = d3().f174520c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetListRecyclerView, "bottomSheetListRecyclerView");
        y.h(bottomSheetListRecyclerView, this.Q, new LinearLayoutManager(bottomSheetListRecyclerView.getContext()));
    }

    public final jii.f d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }
}
