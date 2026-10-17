package ble;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16616a;

    public /* synthetic */ z(int i) {
        this.f16616a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Data data;
        ArrayList arrayList;
        List list;
        Data data2;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        boolean z = false;
        switch (this.f16616a) {
            case 0:
                WealthAccount it8 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.Q2());
            case 1:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : it9) {
                    if (obj6 instanceof WealthAccount.Securities) {
                        arrayList4.add(obj6);
                    }
                }
                return (WealthAccount.Securities) zhm.d0.b0(arrayList4);
            case 2:
                WealthAccount it10 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.H6());
            case 3:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list2 = (List) it11.getContent();
                if (list2 != null) {
                    List list3 = list2;
                    arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it12 = list3.iterator();
                    while (it12.hasNext()) {
                        arrayList3.add(((WealthAccount) it12.next()).getF95255c());
                    }
                }
                return arrayList3;
            case 4:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                hx7.e.n(exception);
                return Boolean.TRUE;
            case 5:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : it13) {
                    if (obj7 instanceof WealthAccount.Securities) {
                        arrayList5.add(obj7);
                    }
                }
                return (WealthAccount.Securities) zhm.d0.b0(arrayList5);
            case 6:
                PersistedBackground it14 = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f63743a;
            case 7:
                Map it15 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(t1.b(it15, com.revolut.feature.tab.invest.impl.ui.home.f.j0));
            case 8:
                TabInvestControllerContract$State it16 = (TabInvestControllerContract$State) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f89861n;
            case 9:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                SimpleTotalValueChart simpleTotalValueChart = (SimpleTotalValueChart) data3.getContent();
                return new Data(simpleTotalValueChart != null ? new TabInvestControllerContract$HeaderState.Onboarded.LineChart.Content(simpleTotalValueChart) : TabInvestControllerContract$HeaderState.Onboarded.LineChart.Empty.f89841a, data3.getError(), data3.getLoading());
            case 10:
                WealthAccount it17 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17 instanceof WealthAccount.Securities);
            case 11:
                WealthAccount it18 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.available());
            case 12:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : it19) {
                    if (obj8 instanceof WealthAccount.Securities) {
                        arrayList6.add(obj8);
                    }
                }
                return (WealthAccount.Securities) zhm.d0.b0(arrayList6);
            case 13:
                Intrinsics.checkNotNullParameter((WealthAccount) obj2, "it");
                return Boolean.TRUE;
            case 14:
                WealthAccount it20 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20.Q2());
            case 15:
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Unit.f186387a;
            case 16:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TabInvestControllerModel", "Failed to load trading transaction history", throwable, h0Var);
                return Boolean.TRUE;
            case 17:
                return Unit.f186387a;
            case 18:
                alg.a tokenDto = (alg.a) obj2;
                Intrinsics.checkNotNullParameter(tokenDto, "tokenDto");
                return tokenDto.getToken();
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data4 = (Data) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                try {
                    Object content = data4.getContent();
                    if (content != null) {
                        List listV0 = zhm.d0.V0((List) content, (!zBooleanValue || (list = (List) data4.getContent()) == null) ? 3 : list.size());
                        arrayList = new ArrayList(zhm.w.t(listV0, 10));
                        Iterator it21 = listV0.iterator();
                        while (it21.hasNext()) {
                            arrayList.add(new p5d.b(((nel.a0) it21.next()).f214560a.f214596b, "instrument", null));
                        }
                    } else {
                        arrayList = null;
                    }
                    data = new Data(arrayList, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                return zhm.u.c(data);
            case 20:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it22 = accounts.iterator();
                while (true) {
                    if (it22.hasNext()) {
                        Object next = it22.next();
                        if (next instanceof WealthAccount.Securities) {
                            obj5 = next;
                        }
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) obj5;
                if (securities != null && securities.available()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator it23 = accounts2.iterator();
                while (true) {
                    if (it23.hasNext()) {
                        Object next2 = it23.next();
                        if (next2 instanceof WealthAccount.Securities) {
                            obj4 = next2;
                        }
                    }
                }
                WealthAccount.Securities securities2 = (WealthAccount.Securities) obj4;
                if (securities2 != null && securities2.available()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                if (blh.j.a(instrument) && instrument.f214597c == nel.z.BOND) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Boolean.TRUE;
            case 24:
                List accounts3 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts3, "accounts");
                Iterator it24 = accounts3.iterator();
                while (true) {
                    if (it24.hasNext()) {
                        Object next3 = it24.next();
                        if (next3 instanceof WealthAccount.Margin) {
                            obj3 = next3;
                        }
                    }
                }
                WealthAccount.Margin margin = (WealthAccount.Margin) obj3;
                if (margin != null) {
                    Intrinsics.checkNotNullParameter(margin, "<this>");
                    switch (unh.a.f281433a[margin.f95232a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            z = true;
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                nel.n instrument2 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument2, "instrument");
                if (blh.j.a(instrument2) && instrument2.f214597c == nel.z.CFD) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                WealthAccount.Commodities it25 = (WealthAccount.Commodities) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(it25.available());
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 28:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Data data5 = (Data) pair2.f186386b;
                try {
                    Object content2 = data5.getContent();
                    if (content2 != null) {
                        List list4 = (List) content2;
                        arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it26 = list4.iterator();
                        while (it26.hasNext()) {
                            arrayList2.add(new p5d.b(((jih.a) it26.next()).f174489a.f306286a, "commodity", null));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    data2 = new Data(arrayList2, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data5.getLoading());
                }
                return zhm.u.c(data2);
            default:
                nel.n instrument3 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument3, "instrument");
                if (blh.j.a(instrument3) && io3.h.k(instrument3.f214597c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ z(Object obj2, int i) {
        this.f16616a = i;
    }
}
