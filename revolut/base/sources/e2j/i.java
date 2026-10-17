package e2j;

import android.net.Uri;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import com.revolut.feature.freelancer.api.interactors.FreelancerTaxHubAssessmentInteractor$TaxCalendarEventNotFoundException;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$DomainState;
import cr9.u;
import f23.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122127b;

    public /* synthetic */ i(ej5.b bVar, String str) {
        this.f122126a = 11;
        this.f122127b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        SQLiteStatement sQLiteStatementPrepare;
        Object next;
        String strA;
        Uri uri2;
        String host;
        Object next2;
        st9.d dVar;
        Object next3;
        Object next4;
        switch (this.f122126a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, this.f122127b, null, 6);
            case 1:
                Data response = (Data) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List list = (List) response.getContent();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (Intrinsics.f(((yvh.b) obj3).f317178c, this.f122127b)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                return new Data(arrayList, response.getError(), response.getLoading());
            case 2:
                ea1.b.a(this.f122127b + " error = " + ((Throwable) obj2), fa1.k.ERROR);
                return Unit.f186387a;
            case 3:
                ea1.b.a(this.f122127b + " error = " + ((Throwable) obj2), fa1.k.ERROR);
                return Unit.f186387a;
            case 4:
                return eaf.f.a((eaf.f) obj2, this.f122127b, null, 14);
            case 5:
                ebi.d update2 = (ebi.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String str = update2.f124366a;
                String str2 = this.f122127b;
                return Intrinsics.f(str2, str) ? update2 : ebi.d.a(update2, str2, 2);
            case 6:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `reports` WHERE `portfolioId` = ?");
                String str3 = this.f122127b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolioId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromEpochDay");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toEpochDay");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new ncl.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
            case 7:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `us_reports` WHERE `portfolioId` = ?");
                String str4 = this.f122127b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolioId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromEpochDay");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toEpochDay");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new ncl.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList3;
                } finally {
                }
            case 8:
                ee1.d updateState = (ee1.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                String text = this.f122127b;
                Intrinsics.checkNotNullParameter(text, "text");
                return new ee1.d(text);
            case 9:
                ei1.e update3 = (ei1.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data = new Data(f0.f322471a, null, false, 6, null);
                update3.getClass();
                String query = this.f122127b;
                Intrinsics.checkNotNullParameter(query, "query");
                return new ei1.e(data, query);
            case 10:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                Iterator it8 = orders.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(com.revolut.feature.checkout.models.a.c((CheckoutOrder) next), this.f122127b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                CheckoutOrder checkoutOrder = (CheckoutOrder) next;
                if (checkoutOrder != null) {
                    return checkoutOrder;
                }
                CheckoutOrder.INSTANCE.getClass();
                return CheckoutOrder.f65846g;
            case 11:
                String prefix = (String) obj2;
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                String str5 = this.f122127b;
                return (d0.W(str5) || (strA = zi5.b.a(prefix, str5)) == null || (uri2 = Uri.parse(strA)) == null || (host = uri2.getHost()) == null) ? CryptoQrCodeParseResult.NotDetected.f70895a : new CryptoQrCodeParseResult.Success(host, uri2.getQueryParameter("label"));
            case 12:
                ej8.f update4 = (ej8.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ej8.f.a(update4, null, this.f122127b, 1);
            case 13:
                ek7.i updateState2 = (ek7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ek7.i.a(updateState2, null, null, null, this.f122127b, false, false, false, 3839);
            case 14:
                epg.l updateState3 = (epg.l) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return epg.l.a(updateState3, this.f122127b, null, null, null, 14);
            case 15:
                epg.l updateState4 = (epg.l) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return epg.l.a(updateState4, this.f122127b, null, null, null, 14);
            case 16:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                List list3 = (List) pair.f186386b;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list3) {
                    linkedHashMap.put(((oq9.o) obj4).b(), obj4);
                }
                return br9.k.a(list2, this.f122127b, linkedHashMap);
            case 17:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list4 = (List) pair2.f186385a;
                List list5 = (List) pair2.f186386b;
                Intrinsics.h(list4);
                List list6 = list5;
                int iB2 = q0.b(w.t(list6, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj5 : list6) {
                    linkedHashMap2.put(((oq9.o) obj5).b(), obj5);
                }
                return br9.c.a(list4, this.f122127b, linkedHashMap2);
            case 18:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                Iterator it9 = groups.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((PaymentGroup) next2).getF79285a(), this.f122127b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                return (PaymentGroup) next2;
            case 19:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list7 = (List) pair3.f186385a;
                List list8 = (List) pair3.f186386b;
                int iB3 = q0.b(w.t(list8, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap members = new LinkedHashMap(iB3);
                for (Object obj6 : list8) {
                    members.put(((oq9.o) obj6).b(), obj6);
                }
                String str6 = "<this>";
                Intrinsics.checkNotNullParameter(list7, "<this>");
                String groupId = this.f122127b;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(members, "members");
                List<u> list9 = list7;
                ArrayList arrayList4 = new ArrayList(w.t(list9, 10));
                for (u uVar : list9) {
                    Intrinsics.checkNotNullParameter(uVar, str6);
                    Intrinsics.checkNotNullParameter(groupId, "groupId");
                    Intrinsics.checkNotNullParameter(members, "members");
                    ArrayList arrayList5 = arrayList4;
                    String strD = uVar.getId();
                    String strG = uVar.getState();
                    if (Intrinsics.f(strG, "ACTIVE")) {
                        dVar = st9.d.ACTIVE;
                    } else {
                        if (!Intrinsics.f(strG, "PENDING")) {
                            String strG2 = uVar.getState();
                            String strD2 = uVar.getId();
                            String strI = uVar.getType();
                            StringBuilder sbM = v0.a.m("Unknown debt state: state=", strG2, ", debtId=", strD2, ", debtType=");
                            sbM.append(strI);
                            throw new IllegalStateException(sbM.toString());
                        }
                        dVar = st9.d.PENDING;
                    }
                    long jA = uVar.getAmount();
                    xi0.a aVar = xi0.b.Companion;
                    String strB = uVar.getCurrencyCode();
                    aVar.getClass();
                    dj0.d dVar2 = new dj0.d(jA, xi0.a.a(strB));
                    st9.d dVar3 = dVar;
                    String str7 = str6;
                    dj0.d dVar4 = new dj0.d(uVar.getDisplayAmount().getAmount(), xi0.a.a(uVar.getDisplayAmount().getCurrency()));
                    oq9.o nVar = (oq9.o) members.get(uVar.getPayeeId());
                    if (nVar == null) {
                        nVar = new oq9.n(uVar.getPayeeId(), groupId);
                    }
                    oq9.o nVar2 = (oq9.o) members.get(uVar.getPayerId());
                    if (nVar2 == null) {
                        nVar2 = new oq9.n(uVar.getPayerId(), groupId);
                    }
                    arrayList5.add(new st9.e(strD, groupId, dVar3, dVar2, dVar4, nVar, nVar2, uVar.getTransferReasonRequired()));
                    arrayList4 = arrayList5;
                    str6 = str7;
                }
                return arrayList4;
            case 20:
                List groups2 = (List) obj2;
                Intrinsics.checkNotNullParameter(groups2, "groups");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : groups2) {
                    if (jli.g.d(((PaymentGroup) obj7).f79286b, this.f122127b)) {
                        arrayList6.add(obj7);
                    }
                }
                return arrayList6;
            case 21:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                ds6.q qVar = (ds6.q) pair4.f186385a;
                od0.i iVar = (od0.i) pair4.f186386b;
                if (iVar.d()) {
                    return new ds6.m((TaxHubCalendarEvent) iVar.c(), qVar);
                }
                String id10 = this.f122127b;
                Intrinsics.checkNotNullParameter(id10, "id");
                throw new FreelancerTaxHubAssessmentInteractor$TaxCalendarEventNotFoundException(p.a.p("Tax calendar event ", id10, " does not exist."));
            case 22:
                List charities = (List) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                Iterator it10 = charities.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        if (Intrinsics.f(((ba6.l) next3).f13940c, this.f122127b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                return new ewh.k((ba6.l) next3);
            case 23:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : cards) {
                    if (Intrinsics.f(((h93.f0) obj8).f150110a, this.f122127b)) {
                        arrayList7.add(obj8);
                    }
                }
                return arrayList7;
            case 24:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                List list10 = (List) pair5.f186385a;
                e7l.f fVar = (e7l.f) pair5.f186386b;
                Iterator it11 = list10.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next4 = it11.next();
                        if (Intrinsics.f(((h93.o) next4).f150157a, this.f122127b)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                h93.o oVar = (h93.o) next4;
                if (oVar == null) {
                    return new ex2.e(null);
                }
                h93.n nVar3 = oVar.f150158b;
                dj0.d dVar5 = fVar.f123392s0;
                if (dVar5 == null) {
                    dj0.d.Companion.getClass();
                    dVar5 = dj0.d.e;
                }
                return new ex2.e(new ex2.a(nVar3, dVar5));
            case 25:
                ezb.g update5 = (ezb.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ezb.g.a(update5, ezb.i.valueOf(this.f122127b), null, 2);
            case 26:
                r update6 = (r) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return r.a(update6, null, this.f122127b, null, null, null, false, ISO781611.SMT_TAG);
            case 27:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return LineChartLoadingTileWidgetDelegate.Model.Companion.a(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, this.f122127b);
            case 28:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return LineChartLoadingTileWidgetDelegate.Model.Companion.a(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, this.f122127b);
            default:
                AssetSelectionFlowControllerContract$DomainState update7 = (AssetSelectionFlowControllerContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return AssetSelectionFlowControllerContract$DomainState.a(update7, false, null, this.f122127b, 23);
        }
    }

    public /* synthetic */ i(String str, int i) {
        this.f122126a = i;
        this.f122127b = str;
    }
}
