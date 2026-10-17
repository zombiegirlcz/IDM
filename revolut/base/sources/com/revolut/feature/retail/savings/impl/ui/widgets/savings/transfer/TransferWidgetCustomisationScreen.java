package com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer;

import akl.e0;
import ald.l;
import android.view.View;
import aqb.c;
import aqb.d;
import aqb.i;
import aqb.j;
import aqb.q;
import aqb.r;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import grl.k9;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import rd0.e;
import rp0.y;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/widgets/savings/transfer/TransferWidgetCustomisationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Laqb/r;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;", "Laqb/i;", "Lno/m;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferWidgetCustomisationScreen extends BaseScreen<r, SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData, i> implements m {
    public final AnalyticsProduct.Retail M;
    public final RowDelegate N;
    public final LargeActionButtonDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferWidgetCustomisationScreen(SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137500l;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.N = new RowDelegate(null, null, 7);
        this.O = new LargeActionButtonDelegate();
        this.P = R$layout.screen_transparent;
        this.Q = w.y0(new agh.b(this, inputData, 22));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: aqb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferWidgetCustomisationScreen f8279b;

            {
                this.f8279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (j) ((anb.r) this.f8279b.Q.getValue()).f6695h.get();
                    default:
                        return (j60.a) ((anb.r) this.f8279b.Q.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: aqb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferWidgetCustomisationScreen f8279b;

            {
                this.f8279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (j) ((anb.r) this.f8279b.Q.getValue()).f6695h.get();
                    default:
                        return (j60.a) ((anb.r) this.f8279b.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        r uiState = (r) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Continuation continuation = null;
        q qVar = oVar instanceof q ? (q) oVar : null;
        if (qVar == null || qVar.f8296a) {
            j jVarT2 = T2();
            y model = uiState.f8297a;
            a aVar = (a) jVarT2;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            aVar.l2(new l(aVar, model, continuation, 4), new yi5.b(26));
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (anb.r) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new aqb.b(2, 4, j.class, T2(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53225r), null, new c(2, 4, j.class, T2(), "onSwitchClick", "onSwitchClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.O.d.f121375b), null, new d(2, 4, j.class, T2(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((j60.a) this.S.getValue()).E()), null, new e0(this, null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.S.getValue()).d(v.k(this.N, this.O, new RowLoadingDelegate(), new FullScreenStateDelegate()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final j T2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.P;
    }
}
