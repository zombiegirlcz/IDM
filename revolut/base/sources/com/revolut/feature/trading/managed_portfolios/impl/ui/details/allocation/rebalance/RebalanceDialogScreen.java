package com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance;

import android.os.Parcelable;
import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n6f.g;
import n6f.h;
import n6f.k;
import no.m;
import pki.b;
import w5f.y;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/rebalance/RebalanceDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Ln6f/g;", "Lcli/w;", "Ln6f/h;", "Lno/m;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RebalanceDialogScreen extends BaseBottomSheetController<g> implements w, m {
    public static final /* synthetic */ int S = 0;
    public final RebalanceDialogScreenContract$InputData N;
    public final AnalyticsProduct.Retail O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public RebalanceDialogScreen(RebalanceDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: n6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RebalanceDialogScreen f212776b;

            {
                this.f212776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RebalanceDialogScreen rebalanceDialogScreen = this.f212776b;
                switch (i2) {
                    case 0:
                        int i3 = RebalanceDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(rebalanceDialogScreen.m2()).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        RebalanceDialogScreenContract$InputData rebalanceDialogScreenContract$InputData = rebalanceDialogScreen.N;
                        rebalanceDialogScreenContract$InputData.getClass();
                        return new y(mVar, rebalanceDialogScreenContract$InputData);
                    case 1:
                        int i5 = RebalanceDialogScreen.S;
                        return (k) ((y) rebalanceDialogScreen.P.getValue()).f295252b.get();
                    default:
                        int i6 = RebalanceDialogScreen.S;
                        return n14.e.a(rebalanceDialogScreen, (k) rebalanceDialogScreen.Q.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: n6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RebalanceDialogScreen f212776b;

            {
                this.f212776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RebalanceDialogScreen rebalanceDialogScreen = this.f212776b;
                switch (i22) {
                    case 0:
                        int i3 = RebalanceDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(rebalanceDialogScreen.m2()).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        RebalanceDialogScreenContract$InputData rebalanceDialogScreenContract$InputData = rebalanceDialogScreen.N;
                        rebalanceDialogScreenContract$InputData.getClass();
                        return new y(mVar, rebalanceDialogScreenContract$InputData);
                    case 1:
                        int i5 = RebalanceDialogScreen.S;
                        return (k) ((y) rebalanceDialogScreen.P.getValue()).f295252b.get();
                    default:
                        int i6 = RebalanceDialogScreen.S;
                        return n14.e.a(rebalanceDialogScreen, (k) rebalanceDialogScreen.Q.getValue());
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: n6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RebalanceDialogScreen f212776b;

            {
                this.f212776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RebalanceDialogScreen rebalanceDialogScreen = this.f212776b;
                switch (i22) {
                    case 0:
                        int i32 = RebalanceDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(rebalanceDialogScreen.m2()).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        RebalanceDialogScreenContract$InputData rebalanceDialogScreenContract$InputData = rebalanceDialogScreen.N;
                        rebalanceDialogScreenContract$InputData.getClass();
                        return new y(mVar, rebalanceDialogScreenContract$InputData);
                    case 1:
                        int i5 = RebalanceDialogScreen.S;
                        return (k) ((y) rebalanceDialogScreen.P.getValue()).f295252b.get();
                    default:
                        int i6 = RebalanceDialogScreen.S;
                        return n14.e.a(rebalanceDialogScreen, (k) rebalanceDialogScreen.Q.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        h uiState = (h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f212782a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(e3(), f3()), new mx5.g(this, null, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.R.getValue();
    }
}
