package zaf;

import bjl.y;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.TransferOutFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.TransferOutDisclaimerScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlowContract$Step;
import com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.ScreenerProductPickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.ui.delegates.invest.widget.InvestOrdersWidgetContract$InvestOrdersContent;
import eaf.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kqh.h;
import kqh.i;
import kqh.j;
import kqh.k;
import xoh.m;
import xoh.n;
import yki.l;
import z8g.q;
import zbj.t0;
import zhm.f0;
import zkh.p;
import zzd.k0;
import zzd.t;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f320683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f320684c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f320682a = i;
        this.f320683b = obj2;
        this.f320684c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController transferOutReviewScreen;
        List listI;
        switch (this.f320682a) {
            case 0:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a aVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a) this.f320683b;
                c cVar = (c) this.f320684c;
                l FlowCoordinator = (l) obj2;
                TransferOutFlowContract$Step step = (TransferOutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, TransferOutFlowContract$Step.Disclaimer.f91632a)) {
                    TradingAccount tradingAccount = cVar.f320681a;
                    TransferOutDisclaimerScreen transferOutDisclaimerScreen = new TransferOutDisclaimerScreen();
                    q block = new q(aVar, tradingAccount, 15);
                    Intrinsics.checkNotNullParameter(block, "block");
                    transferOutDisclaimerScreen.H = block;
                    return transferOutDisclaimerScreen;
                }
                if (step instanceof TransferOutFlowContract$Step.BrokerSelection) {
                    TransferOutFlowContract$Step.BrokerSelection brokerSelection = (TransferOutFlowContract$Step.BrokerSelection) step;
                    transferOutReviewScreen = new BrokerSelectionScreen(new g(brokerSelection.f91631a, u8f.d.OUT));
                    q block2 = new q(aVar, brokerSelection, 13);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    transferOutReviewScreen.H = block2;
                } else if (step instanceof TransferOutFlowContract$Step.AccountInformation) {
                    TransferOutFlowContract$Step.AccountInformation accountInformation = (TransferOutFlowContract$Step.AccountInformation) step;
                    transferOutReviewScreen = new AccountInformationScreen(accountInformation.f91628a, accountInformation.f91629b, u8f.d.OUT);
                    q block3 = new q(aVar, accountInformation, 16);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    transferOutReviewScreen.H = block3;
                } else if (step instanceof TransferOutFlowContract$Step.AssetSelection) {
                    TransferOutFlowContract$Step.AssetSelection assetSelection = (TransferOutFlowContract$Step.AssetSelection) step;
                    String string = assetSelection.f91630a.getF105262a().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    transferOutReviewScreen = new TransferOutAssetSelectionScreen(string);
                    q block4 = new q(aVar, assetSelection, 14);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    transferOutReviewScreen.H = block4;
                } else {
                    if (!(step instanceof TransferOutFlowContract$Step.Review)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TransferOutFlowContract$Step.Review review = (TransferOutFlowContract$Step.Review) step;
                    transferOutReviewScreen = new TransferOutReviewScreen(new TransferOutReviewScreenContract$InputData(review.f91633a, review.f91634b, review.f91635c, review.d));
                    za9.c block5 = new za9.c(aVar, 2);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    transferOutReviewScreen.H = block5;
                }
                return transferOutReviewScreen;
            case 1:
                t0 t0Var = (t0) this.f320683b;
                zbj.q qVar = (zbj.q) this.f320684c;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return t0Var.f320940a.e(qVar.f320926b, false);
            case 2:
                p pVar = (p) this.f320683b;
                String str = (String) this.f320684c;
                Data ordersData = (Data) obj2;
                Boolean expanded = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(ordersData, "ordersData");
                Intrinsics.checkNotNullParameter(expanded, "expanded");
                try {
                    Object content = ordersData.getContent();
                    if (content != null) {
                        List list = ((InvestOrdersWidgetContract$InvestOrdersContent) content).f106809a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (pVar.f323026c.a(str, (InvestOrderExtended) obj4)) {
                                arrayList.add(obj4);
                            }
                        }
                        listI = pVar.d.i(arrayList, expanded.booleanValue());
                    } else {
                        listI = null;
                    }
                    return new Data(listI, ordersData.getError(), ordersData.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, ordersData.getLoading());
                }
            case 3:
                ScreenerFiltersFlowContract$Input screenerFiltersFlowContract$Input = (ScreenerFiltersFlowContract$Input) this.f320683b;
                final com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a aVar2 = (com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a) this.f320684c;
                l FlowCoordinator2 = (l) obj2;
                ScreenerFiltersFlowContract$Step step2 = (ScreenerFiltersFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, ScreenerFiltersFlowContract$Step.ProductPicker.f96176a)) {
                    ScreenerProductPickerScreen screenerProductPickerScreen = new ScreenerProductPickerScreen(new h(screenerFiltersFlowContract$Input.f96174b ? kqh.g.NEW_COLLECTION : kqh.g.DEFAULT));
                    final int i = 0;
                    Function1 block6 = new Function1() { // from class: zoh.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i) {
                                case 0:
                                    k output = (k) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof j;
                                    com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a aVar3 = aVar2;
                                    if (z) {
                                        oki.h.t2(aVar3, aVar3.o, new ScreenerFiltersFlowContract$Step.AllFilters(((j) output).f188414a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output, i.f188413a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3.C2(c.f324056a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a aVar4 = aVar2;
                                    yki.a aVar5 = aVar4.o;
                                    n output2 = (n) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, xoh.l.f307840a)) {
                                        if (aVar5.c()) {
                                            aVar5.e(false);
                                        } else {
                                            aVar4.C2(c.f324056a);
                                        }
                                    } else {
                                        if (!(output2 instanceof m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m mVar = (m) output2;
                                        aVar4.C2(new d(mVar.f307841a, mVar.f307842b));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    screenerProductPickerScreen.H = block6;
                    return screenerProductPickerScreen;
                }
                if (!(step2 instanceof ScreenerFiltersFlowContract$Step.AllFilters)) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenerAllFiltersFlow screenerAllFiltersFlow = new ScreenerAllFiltersFlow(new ScreenerAllFiltersFlowContract$InputData(((ScreenerFiltersFlowContract$Step.AllFilters) step2).f96175a, f0.f322471a, xoh.k.NO_TABS));
                final int i2 = 1;
                Function1 block7 = new Function1() { // from class: zoh.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i2) {
                            case 0:
                                k output = (k) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z = output instanceof j;
                                com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a aVar3 = aVar2;
                                if (z) {
                                    oki.h.t2(aVar3, aVar3.o, new ScreenerFiltersFlowContract$Step.AllFilters(((j) output).f188414a), true, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(output, i.f188413a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.C2(c.f324056a);
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a aVar4 = aVar2;
                                yki.a aVar5 = aVar4.o;
                                n output2 = (n) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (Intrinsics.f(output2, xoh.l.f307840a)) {
                                    if (aVar5.c()) {
                                        aVar5.e(false);
                                    } else {
                                        aVar4.C2(c.f324056a);
                                    }
                                } else {
                                    if (!(output2 instanceof m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    m mVar = (m) output2;
                                    aVar4.C2(new d(mVar.f307841a, mVar.f307842b));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block7, "block");
                screenerAllFiltersFlow.H = block7;
                return screenerAllFiltersFlow;
            case 4:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f320683b;
                com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a aVar3 = (com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a) this.f320684c;
                oki.g onResult = (oki.g) obj2;
                y result = (y) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                ref$BooleanRef.f186407a = true;
                onResult.pop();
                int i3 = zol.c.f324083a[aVar3.o.d.ordinal()];
                if (i3 == 1) {
                    oki.h.D2(aVar3.u);
                    aVar3.J2(result);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.J2(result);
                    aVar3.C2(result);
                }
                return Unit.f186387a;
            default:
                k0 k0Var = (k0) this.f320683b;
                w0 w0Var = (w0) this.f320684c;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new t(k0Var.d.b((Throwable) obj2, "documents-hub:error_item_id", w0Var), k0Var.b(), new AnalyticsContext(w0Var));
        }
    }
}
