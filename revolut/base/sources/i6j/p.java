package i6j;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.PixAuthorisationConfirmScreen;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import wp5.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159034a;

    public /* synthetic */ p(int i) {
        this.f159034a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jc8.b bVar;
        switch (this.f159034a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return k.f159027a;
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new s7("LOADING_VALUE_LIST_ID", 0, 0, 0, 0, false, null, 126);
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new s7("LOADING_AVERAGE_PRICE_LIST_ID", 0, 0, 0, 0, false, null, 126);
            case 3:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(new pb0(a0.d.n("LOADING_LIST_ITEM", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 4:
                od0.i.Companion.getClass();
                return od0.h.a((JuniorBankingProfile) obj2);
            case 5:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (String) it10.f224257a;
            case 6:
                i7f.b it11 = (i7f.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11;
            case 7:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it13 = intRangeO.iterator();
                while (it13.f289625c) {
                    arrayList.add(t61.a.o("TICKET_RULES_LOADING_ROW_", it13.nextInt(), pb0.Companion, false, 4));
                }
                return yp0.b.h(arrayList, new gu("TICKET_RULES_LOADING_SUBHEADER", 0, 0, 30), null, 0, 126);
            case 8:
                i83.f update = (i83.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i83.f.a(update, i83.j.CANNOT_ACTIVATE, null, 6);
            case 9:
                i83.f update2 = (i83.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i83.f.a(update2, i83.j.CAN_ACTIVATE, null, 6);
            case 10:
                return d0.P0((List) obj2, new i83.l());
            case 11:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRangeU, 10));
                vim.f it14 = intRangeU.iterator();
                while (it14.f289625c) {
                    arrayList2.add(new pb0(a0.d.n("LOADING_LIST_ID", it14.nextInt())));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 12:
                yhm.r rVar = (yhm.r) obj2;
                LoanDetails loanDetails = (LoanDetails) rVar.f314201a;
                LoanRepaymentTerms loanRepaymentTerms = (LoanRepaymentTerms) rVar.f314202b;
                LoanRepaymentAccountModelExtension.RepaymentAccountState repaymentAccountState = (LoanRepaymentAccountModelExtension.RepaymentAccountState) rVar.f314203c;
                Intrinsics.h(loanRepaymentTerms);
                return new i85.m(loanDetails, loanRepaymentTerms, repaymentAccountState);
            case 13:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return f0.f322471a;
            case 14:
                Data it16 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Pair(j8b.b.PAST_EVENTS, it16);
            case 15:
                String it17 = (String) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(a0.H(it17, "EodRatesStorage", false));
            case 16:
                List<w5l.a> requests = (List) obj2;
                Intrinsics.checkNotNullParameter(requests, "requests");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (w5l.a aVar : requests) {
                    String str = aVar.f295351b;
                    if (str == null) {
                        str = "";
                    }
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    List list = (List) objO;
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    String str2 = aVar.f295350a;
                    e93.b bVar2 = aVar.d;
                    b93.b bVar3 = new b93.b(aVar.f295352c);
                    w5l.b bVar4 = aVar.f;
                    if (bVar4 != null) {
                        String str3 = bVar4.f295355a;
                        String str4 = bVar4.f295356b;
                        if (str4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        bVar = new jc8.b(str4, str3);
                    } else {
                        bVar = null;
                    }
                    boolean z = aVar.f295353g;
                    String str5 = aVar.f295354h;
                    list.add(new jc8.a(str2, bVar2, bVar3, bVar, z, str5 == null ? "" : str5));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!kotlin.text.d0.W((CharSequence) entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap2;
            case 17:
                SelectableDelegate.Model it18 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = PixAuthorisationConfirmScreen.Q;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f53304a, "AGREEMENT_LIST_ID"));
            case 18:
                i9a.d update3 = (i9a.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return new i9a.d(!update3.f159615a);
            case 19:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return i9d.a.c();
            case 20:
                dj0.d it20 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f115083b;
            case 21:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                if (data.getContent() != null || error == null) {
                    return data;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return new Data(f0.f322471a, null, false, 6, null);
            case 22:
                qei.f availability = (qei.f) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                Intrinsics.checkNotNullParameter(availability, "<this>");
                ArrayList arrayList3 = availability.f245167b;
                if (!arrayList3.isEmpty()) {
                    if (!availability.f245166a) {
                        return new qei.a(arrayList3);
                    }
                    cgi.n nVar = (cgi.n) d0.b0(arrayList3);
                    cgi.m mVar = (cgi.m) d0.d0(nVar.e);
                    cgi.l lVar = mVar != null ? (cgi.l) d0.d0(mVar.f24004g) : null;
                    BedOption bedOption = lVar != null ? (BedOption) d0.d0(lVar.f23999b) : null;
                    if (mVar != null && lVar != null && bedOption != null) {
                        cgi.f fVar = new cgi.f(new cgi.g(nVar, mVar, lVar), bedOption);
                        return lVar.f24000c instanceof TravelHotelsBookingAmendmentCost.Unchanged ? new qei.d(fVar) : new qei.c(fVar);
                    }
                }
                return qei.b.f245163a;
            case 23:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                List list2 = it21;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                Iterator it22 = list2.iterator();
                while (it22.hasNext()) {
                    arrayList4.add(h9g.e.b(((HotelsProperty) it22.next()).f97981a));
                }
                return d0.i1(arrayList4);
            case 24:
                yoj.a aVar2 = (yoj.a) obj2;
                return y.s(aVar2, "it", aVar2);
            case 25:
                yoj.a aVar3 = (yoj.a) obj2;
                return y.s(aVar3, "it", aVar3);
            case 26:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.STAYS) : b39.b.f12015a;
            case 27:
                List rooms = (List) obj2;
                Intrinsics.checkNotNullParameter(rooms, "rooms");
                cgi.j jVar = new cgi.j();
                Iterator it23 = rooms.iterator();
                while (it23.hasNext()) {
                    jVar.c((HotelsPropertyRoom) it23.next());
                }
                return jVar.e();
            case 28:
                dgi.c params = (dgi.c) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return params.f114671a;
            default:
                dgi.c params2 = (dgi.c) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return params2.f114672b;
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f159034a = i;
    }
}
