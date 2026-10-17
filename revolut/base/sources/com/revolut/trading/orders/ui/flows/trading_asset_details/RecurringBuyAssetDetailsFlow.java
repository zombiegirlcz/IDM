package com.revolut.trading.orders.ui.flows.trading_asset_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import btl.b;
import btl.d;
import btl.e;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.trading.orders.R$id;
import com.revolut.trading.orders.R$layout;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlow;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlowContract$InputData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wki.c;
import x2h.b;
import xsl.k;
import xsl.p;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/flows/trading_asset_details/RecurringBuyAssetDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lwki/a;", "Lbtl/e;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringBuyAssetDetailsFlow extends ViewController<q> implements wki.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(RecurringBuyAssetDetailsFlow.class, "binding", "getBinding()Lcom/revolut/trading/orders/databinding/FlowRecurringBuyAssetDetailsBinding;", 0))};
    public final RecurringBuyAssetDetailsFlowContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public RecurringBuyAssetDetailsFlow(RecurringBuyAssetDetailsFlowContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = s.t(this, b.f);
        this.M = R$layout.flow_recurring_buy_asset_details;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: btl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringBuyAssetDetailsFlow f18649b;

            {
                this.f18649b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecurringBuyAssetDetailsFlow recurringBuyAssetDetailsFlow = this.f18649b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringBuyAssetDetailsFlow.Q;
                        return md6.s.a(recurringBuyAssetDetailsFlow, (d) recurringBuyAssetDetailsFlow.O.getValue(), R$id.screen_transparent_container, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringBuyAssetDetailsFlow.Q;
                        return (d) ((k) ((ctl.a) recurringBuyAssetDetailsFlow.P.getValue())).e.get();
                    default:
                        KProperty[] kPropertyArr3 = RecurringBuyAssetDetailsFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(recurringBuyAssetDetailsFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        RecurringBuyAssetDetailsFlowContract$InputData recurringBuyAssetDetailsFlowContract$InputData = recurringBuyAssetDetailsFlow.K;
                        recurringBuyAssetDetailsFlowContract$InputData.getClass();
                        return new k(pVar, recurringBuyAssetDetailsFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: btl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringBuyAssetDetailsFlow f18649b;

            {
                this.f18649b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecurringBuyAssetDetailsFlow recurringBuyAssetDetailsFlow = this.f18649b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringBuyAssetDetailsFlow.Q;
                        return md6.s.a(recurringBuyAssetDetailsFlow, (d) recurringBuyAssetDetailsFlow.O.getValue(), R$id.screen_transparent_container, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringBuyAssetDetailsFlow.Q;
                        return (d) ((k) ((ctl.a) recurringBuyAssetDetailsFlow.P.getValue())).e.get();
                    default:
                        KProperty[] kPropertyArr3 = RecurringBuyAssetDetailsFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(recurringBuyAssetDetailsFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        RecurringBuyAssetDetailsFlowContract$InputData recurringBuyAssetDetailsFlowContract$InputData = recurringBuyAssetDetailsFlow.K;
                        recurringBuyAssetDetailsFlowContract$InputData.getClass();
                        return new k(pVar, recurringBuyAssetDetailsFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: btl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringBuyAssetDetailsFlow f18649b;

            {
                this.f18649b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RecurringBuyAssetDetailsFlow recurringBuyAssetDetailsFlow = this.f18649b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringBuyAssetDetailsFlow.Q;
                        return md6.s.a(recurringBuyAssetDetailsFlow, (d) recurringBuyAssetDetailsFlow.O.getValue(), R$id.screen_transparent_container, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringBuyAssetDetailsFlow.Q;
                        return (d) ((k) ((ctl.a) recurringBuyAssetDetailsFlow.P.getValue())).e.get();
                    default:
                        KProperty[] kPropertyArr3 = RecurringBuyAssetDetailsFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(recurringBuyAssetDetailsFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        RecurringBuyAssetDetailsFlowContract$InputData recurringBuyAssetDetailsFlowContract$InputData = recurringBuyAssetDetailsFlow.K;
                        recurringBuyAssetDetailsFlowContract$InputData.getClass();
                        return new k(pVar, recurringBuyAssetDetailsFlowContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        x2h.b bVar = uiState.f18651a;
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinHorizontalButton twinHorizontalButton = ((srl.a) value).f265247b;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "actionsPanel");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(twinHorizontalButton, "twinHorizontalButton");
        if (bVar instanceof x2h.a) {
            boolean z = ((x2h.a) bVar).f302570a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_action_continue, null, null, 14);
            if (!z) {
                textLocalisedClause = null;
            }
            twinHorizontalButton.setPrimaryButtonText(textLocalisedClause);
            twinHorizontalButton.setPrimaryButtonEnabled(z);
            twinHorizontalButton.setPrimaryButtonVisible(z);
            twinHorizontalButton.setSecondaryButtonText(null);
            twinHorizontalButton.setSecondaryButtonEnabled(false);
            twinHorizontalButton.setSecondaryButtonVisible(false);
            twinHorizontalButton.setVisibility(z ? 0 : 8);
            return;
        }
        if (bVar instanceof b.a) {
            twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.wealth_action_get_started, null, null, 14));
            twinHorizontalButton.setPrimaryButtonEnabled(true);
            twinHorizontalButton.setPrimaryButtonVisible(true);
            twinHorizontalButton.setSecondaryButtonText(null);
            twinHorizontalButton.setSecondaryButtonEnabled(false);
            twinHorizontalButton.setSecondaryButtonVisible(false);
            twinHorizontalButton.setVisibility(0);
            return;
        }
        if (!bVar.equals(b.C1676b.f302573a)) {
            throw new NoWhenBranchMatchedException();
        }
        twinHorizontalButton.setPrimaryButtonText(null);
        twinHorizontalButton.setPrimaryButtonEnabled(false);
        twinHorizontalButton.setPrimaryButtonVisible(false);
        twinHorizontalButton.setSecondaryButtonText(null);
        twinHorizontalButton.setSecondaryButtonEnabled(false);
        twinHorizontalButton.setSecondaryButtonVisible(false);
        twinHorizontalButton.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ctl.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ctl.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((srl.a) value).f265247b.c()), new brc.h(this, null, 7), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (c) this.N.getValue();
    }
}
