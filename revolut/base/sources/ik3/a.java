package ik3;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$State;
import com.youTransactor.uCube.rpc.Constants;
import hvb.r;
import j27.f;
import j3i.k;
import j7b.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;
import qua.p;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f161877b;

    public /* synthetic */ a(c cVar, String str) {
        this.f161876a = 0;
        this.f161877b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        fvb.d dVar;
        fvb.e eVar;
        Object next3;
        switch (this.f161876a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                xi0.b.Companion.getClass();
                return Long.valueOf(cp5.d.k(xi0.a.a(this.f161877b)) * ((long) 10));
            case 1:
                ilj.d update = (ilj.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                String searchQuery = this.f161877b;
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                return new ilj.d(searchQuery);
            case 2:
                iqf.a update2 = (iqf.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return iqf.a.a(update2, null, null, this.f161877b, 7);
            case 3:
                SignUpFlowContract$State update3 = (SignUpFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return SignUpFlowContract$State.a(update3, this.f161877b, null, 2);
            case 4:
                return SignUpFlowContract$State.a((SignUpFlowContract$State) obj2, null, new RevolutSsoApi$SignUpOutputData$Authenticated$Method.Email(this.f161877b), 1);
            case 5:
                return SignUpFlowContract$State.a((SignUpFlowContract$State) obj2, null, new RevolutSsoApi$SignUpOutputData$Authenticated$Method.Email(this.f161877b), 1);
            case 6:
                CreditCardDirectDebitV3FlowContract$State creditCardDirectDebitV3FlowContract$State = (CreditCardDirectDebitV3FlowContract$State) obj2;
                String facilityId = creditCardDirectDebitV3FlowContract$State.f69264a;
                CreditCardAutopayType.DirectDebit directDebitType = creditCardDirectDebitV3FlowContract$State.f69265b;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(directDebitType, "directDebitType");
                return new CreditCardDirectDebitV3FlowContract$State(facilityId, directDebitType, this.f161877b);
            case 7:
                is2.f updateState = (is2.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return is2.f.a(updateState, this.f161877b, null, null, null, false, 30);
            case 8:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                Iterator it8 = recurringPayments.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        Set set = ((p) next).G;
                        if (set != null ? set.contains(this.f161877b) : false) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (p) next;
            case 9:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM invoices WHERE id = ?");
                String str = this.f161877b;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 10:
                List deviceList = (List) obj2;
                Intrinsics.checkNotNullParameter(deviceList, "deviceList");
                Iterator it9 = deviceList.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((UserDevice) next2).f71914a, this.f161877b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                UserDevice userDevice = (UserDevice) next2;
                return userDevice != null ? new itc.a(userDevice) : itc.b.f168362a;
            case 11:
                r it10 = (r) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                String productId = this.f161877b;
                Intrinsics.checkNotNullParameter(productId, "productId");
                String str2 = it10.f155812a;
                fvb.e[] eVarArrValues = fvb.e.values();
                int length = eVarArrValues.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    dVar = null;
                    if (i2 < length) {
                        eVar = eVarArrValues[i2];
                        if (!a0.z(eVar.name(), str2, true)) {
                            i2++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar == null) {
                    eVar = fvb.e.UNKNOWN;
                }
                fvb.e eVar2 = eVar;
                String str3 = it10.f155813b;
                if (str3 != null) {
                    fvb.d[] dVarArrValues = fvb.d.values();
                    int length2 = dVarArrValues.length;
                    while (true) {
                        if (i < length2) {
                            fvb.d dVar2 = dVarArrValues[i];
                            if (a0.z(dVar2.name(), str3, true)) {
                                dVar = dVar2;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new fvb.f(productId, eVar2, dVar, it10.f155814c, it10.d);
            case 12:
                List tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                Iterator it11 = tickets.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next3 = it11.next();
                        if (Intrinsics.f(((PurchasedTransitTicket) next3).getF92682a(), this.f161877b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                return (PurchasedTransitTicket) next3;
            case 13:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update4 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                a.C0490a c0490a = update4.f73837a;
                boolean z = c0490a.f73842b;
                c0490a.getClass();
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update4, new a.C0490a(this.f161877b, z), null, null, null, null, null, 126);
            case 14:
                j07.d updateState2 = (j07.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                updateState2.getClass();
                return new j07.d(this.f161877b);
            case 15:
                j0i.a update5 = (j0i.a) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return j0i.a.a(update5, d0.F0(this.f161877b).toString(), null, null, null, null, null, null, null, null, null, 1022);
            case 16:
                j27.f update6 = (j27.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                if (!(update6 instanceof f.a)) {
                    if (Intrinsics.f(update6, f.b.f170714a)) {
                        return update6;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                f.a aVar = (f.a) update6;
                Data data = aVar.f170711a;
                List list = aVar.f170712b;
                String searchQuery2 = this.f161877b;
                Intrinsics.checkNotNullParameter(searchQuery2, "searchQuery");
                return new f.a(data, searchQuery2, list);
            case 17:
                FreelancerOrder order = (FreelancerOrder) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                String str4 = order.f73291c;
                String str5 = this.f161877b;
                return Boolean.valueOf(jli.g.d(str4, str5) || jli.g.d(order.v.toString(), str5) || jli.g.d(String.valueOf(order.f73294j.f115082a), str5));
            case 18:
                nr6.b order2 = (nr6.b) obj2;
                Intrinsics.checkNotNullParameter(order2, "order");
                String str6 = order2.f218541h;
                String str7 = this.f161877b;
                return Boolean.valueOf(jli.g.d(str6, str7) || jli.g.d(order2.f218538b.toString(), str7) || jli.g.d(String.valueOf(order2.f218549s.f115082a), str7));
            case 19:
                k update7 = (k) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return k.a(update7, null, null, this.f161877b, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 20:
                k update8 = (k) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                if (Intrinsics.f(this.f161877b, "TAKE_PROFIT_SWITCH_LIST_ID")) {
                    ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit = update8.f171198b;
                    return k.a(update8, null, chartLimitPickerControllerContract$Limit != null ? ChartLimitPickerControllerContract$Limit.a(chartLimitPickerControllerContract$Limit, !chartLimitPickerControllerContract$Limit.f96988a, BitmapDescriptorFactory.HUE_RED, 14) : null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                }
                ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit2 = update8.f171197a;
                return k.a(update8, chartLimitPickerControllerContract$Limit2 != null ? ChartLimitPickerControllerContract$Limit.a(chartLimitPickerControllerContract$Limit2, !chartLimitPickerControllerContract$Limit2.f96988a, BitmapDescriptorFactory.HUE_RED, 14) : null, null, null, null, null, 254);
            case 21:
                return new j53.k(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), this.f161877b, null);
            case 22:
                j6a.g update9 = (j6a.g) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return j6a.g.a(update9, null, this.f161877b, null, null, false, ISO781611.SMT_TAG);
            case 23:
                j6b.c update10 = (j6b.c) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return j6b.c.a(update10, this.f161877b, 21);
            case 24:
                j6f.a update11 = (j6f.a) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return j6f.a.a(update11, null, m6f.r.valueOf(this.f161877b), null, false, 13);
            case 25:
                List requests = (List) obj2;
                Intrinsics.checkNotNullParameter(requests, "requests");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : requests) {
                    if (!Intrinsics.f(((MoneyRequest) obj3).getF60314a(), this.f161877b)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 26:
                i update12 = (i) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return i.a(update12, null, gc0.c.A(update12.f171894b, this.f161877b), 5);
            case 27:
                j96.a update13 = (j96.a) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return j96.a.a(update13, this.f161877b, null, null, 6);
            case 28:
                return j96.a.a((j96.a) obj2, null, null, this.f161877b, 3);
            default:
                jb0.d update14 = (jb0.d) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return jb0.d.a(update14, null, this.f161877b, null, 5);
        }
    }

    public /* synthetic */ a(String str, int i) {
        this.f161876a = i;
        this.f161877b = str;
    }
}
