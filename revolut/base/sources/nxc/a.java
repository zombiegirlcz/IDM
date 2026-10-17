package nxc;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.move_money.MoveMoneyContract$MoveMoneyResultPayload;
import com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import pj7.e;
import pni.h;
import pni.i;
import pni.l;
import pyd.c;
import qni.d;
import qwf.o;
import rq4.j;
import xi0.b;
import xvf.f;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f220552b;

    public /* synthetic */ a(long j2, int i) {
        this.f220551a = i;
        this.f220552b = j2;
    }

    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f220551a) {
            case 0:
                Long written = (Long) obj2;
                Intrinsics.checkNotNullParameter(written, "written");
                return Float.valueOf(Math.min(written.longValue() / this.f220552b, 1.0f));
            case 1:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, this.f220552b);
            case 2:
                e update2 = (e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return e.a(update2, this.f220552b);
            case 3:
                l lVar = (l) obj2;
                long j2 = this.f220552b;
                return l.a(lVar, j2 == 0 ? h.f237812a : new i(j2), false, null, 61);
            case 4:
                return qa4.e.a((qa4.e) obj2, (int) this.f220552b, 0L, 6);
            case 5:
                d dVar = (d) obj2;
                long j3 = this.f220552b;
                return new d(j3, j3 == 0, dVar.f247954c);
            case 6:
                o updateState = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return o.a(updateState, 0L, null, null, null, null, null, null, Long.valueOf(this.f220552b), 511);
            case 7:
                o updateState2 = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return o.a(updateState2, this.f220552b, null, null, null, null, null, null, null, 1021);
            case 8:
                rk3.e eVar = (rk3.e) obj2;
                boolean z = eVar.d;
                long j5 = this.f220552b;
                boolean z3 = true;
                if (!z && j5 != 0) {
                    z3 = false;
                }
                return rk3.e.a(eVar, null, j5, z3, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
            case 9:
                j update3 = (j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                long j16 = this.f220552b;
                return j.a(update3, null, Long.valueOf(j16), Long.valueOf(j16), false, false, 57);
            case 10:
                return sa2.d.a((sa2.d) obj2, this.f220552b, null, null, 13);
            case 11:
                sba.d update4 = (sba.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                b.Companion.getClass();
                dj0.d currentAmount = new dj0.d(this.f220552b, b.D);
                dj0.d initialAmount = update4.f261518a;
                Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
                Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
                return new sba.d(initialAmount, currentAmount);
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new MoveMoneyContract$MoveMoneyResultPayload(this.f220552b, (ExchangeStakingData) ((od0.i) pair.f186385a).f224257a, ((Boolean) pair.f186386b).booleanValue());
            case 13:
                long j22 = this.f220552b;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM travel_experiences_recent_search_destination WHERE startDate < ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j22);
                    sQLiteStatementPrepare.step();
                    return Unit.f186387a;
                } finally {
                }
            case 14:
                return u4b.e.a((u4b.e) obj2, null, this.f220552b, null, null, false, false, 61);
            case 15:
                return Boolean.valueOf(((uif.a) obj2).a() == this.f220552b);
            case 16:
                return Long.valueOf(this.f220552b);
            case 17:
                return wca.e.a((wca.e) obj2, null, null, this.f220552b, 3);
            case 18:
                wmd.e spent = (wmd.e) obj2;
                Intrinsics.checkNotNullParameter(spent, "spent");
                dj0.d dVar2 = spent.f298640a;
                long j42 = this.f220552b;
                dj0.d dVarK = c.k(dVar2, j42);
                ?? r142 = spent.f298641b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(r142.size()));
                for (Map.Entry entry : r142.entrySet()) {
                    linkedHashMap.put(entry.getKey(), c.k((dj0.d) entry.getValue(), j42));
                }
                return new wmd.e(dVarK, linkedHashMap);
            case 19:
                List moneyRequests = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : moneyRequests) {
                    if (((MoneyRequest) obj3).f60319j.getMillis() > this.f220552b) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 20:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : it8) {
                    if (obj4 instanceof zm3.i) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : arrayList2) {
                    zm3.i iVar = (zm3.i) obj5;
                    if (iVar.f323352c) {
                        DateTime dateTime = iVar.d;
                        if ((dateTime != null ? dateTime.getMillis() : 0L) > this.f220552b) {
                            arrayList3.add(obj5);
                        }
                    }
                }
                return arrayList3;
            case 21:
                List paymentLinks = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentLinks, "paymentLinks");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : paymentLinks) {
                    if (((TransferLinkDetails.Active) obj6).getF().getMillis() > this.f220552b) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            case 22:
                return x82.b.a((x82.b) obj2, null, null, this.f220552b, 3);
            case 23:
                Data data = ((f) obj2).f309249a;
                Intrinsics.checkNotNullParameter(data, "data");
                return new f(data, this.f220552b);
            case 24:
                y7d.l updateState3 = (y7d.l) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return y7d.l.a(updateState3, null, null, null, null, null, null, false, false, null, this.f220552b, 511);
            case 25:
                eel.l it9 = (eel.l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Integer.valueOf(Intrinsics.l(it9.f125238b, this.f220552b));
            default:
                long j46 = this.f220552b;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM wealth_news WHERE publishedDate <= ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j46);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
        }
    }
}
