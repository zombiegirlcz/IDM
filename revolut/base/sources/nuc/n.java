package nuc;

import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlowContract$FlowState;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import nv6.q;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219294a;

    public /* synthetic */ n(int i) {
        this.f219294a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f219294a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, null, null, null, 15);
            case 1:
                h update2 = (h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return h.a(update2, null, null, null, j.f219287a, 15);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new nv4.f((List) pair.f186385a, (wi0.b) pair.f186386b);
            case 3:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : it8) {
                    if (v.k(vl4.c.PAST, vl4.c.CLOSED).contains(((vl4.i) obj3).f)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 4:
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    arrayList2.add(new SplitAccountsItemGroup.LoadingItem(a0.d.n("LOADING_MAIN_ITEM_", it9.nextInt()), true, true));
                }
                return new SplitAccountsItemGroup.LoadingGroup(arrayList2);
            case 5:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new q(null, null);
            case 7:
                RevPointsExclusiveStoreProductFlowContract$FlowState update3 = (RevPointsExclusiveStoreProductFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(true);
            case 8:
                RevPointsExclusiveStoreProductFlowContract$FlowState update4 = (RevPointsExclusiveStoreProductFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(true);
            case 9:
                RevPointsExclusiveStoreProductFlowContract$FlowState update5 = (RevPointsExclusiveStoreProductFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                update5.getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(true);
            case 10:
                RevPointsExclusiveStoreProductFlowContract$FlowState update6 = (RevPointsExclusiveStoreProductFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                update6.getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(false);
            case 11:
                RevPointsExclusiveStoreProductFlowContract$FlowState update7 = (RevPointsExclusiveStoreProductFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                update7.getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(true);
            case 12:
                RevPointsExclusiveStoreProductFlowContract$FlowState update8 = (RevPointsExclusiveStoreProductFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                update8.getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(true);
            case 13:
                ((RevPointsExclusiveStoreProductFlowContract$FlowState) obj2).getClass();
                return new RevPointsExclusiveStoreProductFlowContract$FlowState(false);
            case 14:
                nvk.k update9 = (nvk.k) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return nvk.k.a(update9, null, uqk.e.ANNUALLY, new StockFinancialsStatementPeriodState(null, null), new StockFinancialsStatementPeriodState(null, null), r0.g(), null, null, null, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE);
            case 15:
                nvk.k it10 = (nvk.k) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f219715b;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return i2b.a.o(i2b.a.o(fsk.d.e(0, 3), fsk.d.e(1, 1)), fsk.d.e(2, 3));
            case 17:
                List midExchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(midExchangeRates, "midExchangeRates");
                List list = midExchangeRates;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(ofm.q.f0((qta.c) it11.next()));
                }
                return arrayList3;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 19:
                StreetModeInfo it12 = (StreetModeInfo) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.f85423a);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 21:
                nwf.e updateState = (nwf.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return nwf.e.a(updateState, null, null, Data.copy$default(updateState.f219862c, null, null, true, 3, null), 3);
            case 22:
                return nwf.e.a((nwf.e) obj2, null, null, null, 5);
            case 23:
                Function0 mapper = (Function0) obj2;
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return (List) mapper.invoke();
            case 24:
                Intrinsics.checkNotNullParameter((FeatureConfig) obj2, "it");
                return Unit.f186387a;
            case 25:
                Boolean it13 = (Boolean) obj2;
                AmountEditView.Companion aVar = AmountEditView.INSTANCE;
                Intrinsics.checkNotNullParameter(it13, "it");
                it13.booleanValue();
                return it13;
            case 26:
                AmountEditView.Companion aVar2 = AmountEditView.INSTANCE;
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return Unit.f186387a;
            case 27:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return m72.b.x(it14, od0.i.Companion);
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                m70.a.c(t0.f186434a);
                return "";
            default:
                nxa.l update10 = (nxa.l) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return nxa.l.a(update10, null, new Data(null, null, true, 3, null), false, null, 13);
        }
    }
}
