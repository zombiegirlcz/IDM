package sa6;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.cash_topup.impl.ui.barcode.CashTopUpBarcodeScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$Step;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261353a;

    public /* synthetic */ y(int i) {
        this.f261353a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String f62112a;
        switch (this.f261353a) {
            case 0:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.DONATIONS_REV_POINTS) : b39.b.f12015a;
            case 1:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ba6.h0 h0Var = (ba6.h0) it8.g();
                return h0Var == null ? ba6.h0.VISIBLE : h0Var;
            case 2:
                Set it9 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!it9.isEmpty());
            case 3:
                TravelHotelsBookingAmendmentFlowContract$Step step = (TravelHotelsBookingAmendmentFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf(step instanceof TravelHotelsBookingAmendmentFlowContract$Step.DatesPicker);
            case 4:
                sai.f update = (sai.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return sai.f.a(update, null, 0, null, true, 7);
            case 5:
                sai.f update2 = (sai.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return sai.f.a(update2, null, 0, null, false, 7);
            case 6:
                return sai.f.a((sai.f) obj2, null, 0, null, false, 7);
            case 7:
                ty0.a it10 = (ty0.a) obj2;
                KProperty[] kPropertyArr = CashTopUpBarcodeScreen.V;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f275445a, "DISCLAIMER_LINK_CLICK_ID"));
            case 8:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return zi0.c.P(file, false, null, 3);
            case 9:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return Boolean.TRUE;
            case 10:
                fa1.h it11 = (fa1.h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 == fa1.h.DISCONNECTED);
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new sc1.d((List) pair.f186385a, ((Boolean) pair.f186386b).booleanValue());
            case 12:
                List members = (List) obj2;
                Intrinsics.checkNotNullParameter(members, "members");
                jq9.k kVar = (jq9.k) zhm.d0.d0(members);
                if (kVar == null) {
                    return null;
                }
                if (kVar instanceof jq9.p) {
                    f62112a = sc7.f.k(((jq9.p) kVar).f177514b);
                } else if (kVar instanceof jq9.m) {
                    f62112a = ((jq9.m) kVar).f177508b.f132329a;
                } else if (kVar instanceof jq9.n) {
                    f62112a = ((jq9.n) kVar).f177510b.f81495a.f81490a;
                } else if (kVar instanceof jq9.s) {
                    f62112a = ((jq9.s) kVar).f177520b.f79285a;
                } else if (kVar instanceof jq9.r) {
                    f62112a = ((jq9.r) kVar).f177518b.f71059a;
                } else if (kVar instanceof jq9.o) {
                    f62112a = ((jq9.o) kVar).f177512b.f13938a;
                } else if (kVar instanceof jq9.l) {
                    f62112a = ((jq9.l) kVar).f177506b.getF62134a().getF62112a();
                } else {
                    if (!(kVar instanceof jq9.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f62112a = ((jq9.q) kVar).f177516b.f79060a;
                }
                dsh.f fVar = new dsh.f();
                fVar.a("id", f62112a);
                return new dsh.e(fVar);
            case 13:
                List members2 = (List) obj2;
                Intrinsics.checkNotNullParameter(members2, "members");
                return (jq9.k) zhm.d0.d0(members2);
            case 14:
                List recentPayees = (List) obj2;
                Intrinsics.checkNotNullParameter(recentPayees, "recentPayees");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recentPayees) {
                    if (((jq9.k) obj3).d()) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 15:
                FeatureConfig it12 = (FeatureConfig) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new FeatureCommand(it12);
            case 16:
                FeatureConfig it13 = (FeatureConfig) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new FeatureCommand(it13);
            case 17:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 18:
                qua.p it14 = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new mm.g(it14);
            case 19:
                PaymentCounterpartyInfo it15 = (PaymentCounterpartyInfo) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                String strA = it15.a("UPI_ID");
                if (strA == null) {
                    strA = "";
                }
                return new UpiFeatureConfig.Destination.Transfer.InputData.ToAlias(it15, strA, (dj0.d) null, (String) null, (String) null, (String) null, (Map) null, Constants.TAG_FC_SPEED_MODE);
            case 20:
                f5j.a it16 = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary(it16);
            case 21:
                zm3.a contact = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                return contact instanceof zm3.l ? efm.k.g(contact) : efm.k.f(new IllegalStateException("Getting Contact by Username didn't return RevolutContact"));
            case 22:
                ActionsView.Item it17 = (ActionsView.Item) obj2;
                KProperty[] kPropertyArr2 = CashbackTransactionsScreen.f65722e0;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(Intrinsics.f(it17.f58316a, "ID_ACTION_FILTER"));
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new Pair((RevPointsPocketState) pair2.f186385a, (List) pair2.f186386b);
            case 27:
                RevPointsPocketState it18 = (RevPointsPocketState) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                RevPointsPocketInfo revPointsPocketInfoA = com.revolut.feature_rev_points_pocket_api.model.a.a(it18);
                if (revPointsPocketInfoA != null) {
                    return revPointsPocketInfoA.f;
                }
                return null;
            case 28:
                k71.q it19 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zi0.c.P(it19, false, null, 3);
            default:
                Intrinsics.checkNotNullParameter((Data) obj2, "it");
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ y(sc7.f fVar) {
        this.f261353a = 12;
    }
}
