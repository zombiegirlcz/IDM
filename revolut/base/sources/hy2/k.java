package hy2;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage;
import fyk.n;
import fyk.w;
import h93.f0;
import hz6.m;
import hzb.t;
import ip0.nb0;
import ip0.pb0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jz8.c1;
import jz8.u0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDate;
import qua.p;
import qua.u;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156715a;

    public /* synthetic */ k(int i) {
        this.f156715a = i;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Long l2;
        CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring recurring;
        rzj.b bVar;
        boolean z = false;
        ArrayList arrayList = null;
        u0 u0Var = null;
        String text = null;
        c1 c1Var = null;
        switch (this.f156715a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.getLoading() || it8.getContent() != null) {
                    return it8;
                }
                od0.i.Companion.getClass();
                return Data.copy$default(it8, od0.i.f224256b, null, false, 6, null);
            case 1:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List list = cards;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            f0 f0Var = (f0) it9.next();
                            if (f0Var.f150112c && f0Var.d) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(!z);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new hy7.d((Clause) pair.f186385a, (List) pair.f186386b);
            case 3:
                List payments = (List) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
                List<p> listP0 = d0.P0(payments, new fad.i(new fad.i(zonedDateTimeNow, 21), 22));
                ArrayList arrayList2 = new ArrayList();
                for (p pVar : listP0) {
                    Intrinsics.h(zonedDateTimeNow);
                    wua.a aVar = pVar.f249328q;
                    if (aVar == null || (l2 = pVar.f249323j) == null) {
                        recurring = null;
                    } else {
                        long jLongValue = l2.longValue();
                        String str = pVar.f249314a.f160150a;
                        boolean zH = u.h(pVar, zonedDateTimeNow);
                        xi0.a aVar2 = xi0.b.Companion;
                        String str2 = pVar.i;
                        aVar2.getClass();
                        recurring = new CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring(new CryptoOrderDetailsInputData.RecurringInputData(str, zH, jLongValue, xi0.a.a(str2), aVar.f300092a, xi0.a.a(aVar.f300093b)));
                    }
                    if (recurring != null) {
                        arrayList2.add(recurring);
                    }
                }
                return arrayList2;
            case 4:
                fyk.f it10 = (fyk.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return eyk.a.a(it10);
            case 5:
                fyk.h it11 = (fyk.h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj3 = eyk.b.f130872a;
                Intrinsics.checkNotNullParameter(it11, "<this>");
                String firstName = it11.getFirstName();
                String lastName = it11.getLastName();
                String phone = it11.getPhone();
                List birthDate = it11.getBirthDate();
                Intrinsics.checkNotNullParameter(birthDate, "<this>");
                return new pxk.b(firstName, lastName, phone, new LocalDate(((Number) birthDate.get(0)).intValue(), ((Number) birthDate.get(1)).intValue(), ((Number) birthDate.get(2)).intValue()));
            case 6:
                fyk.j it12 = (fyk.j) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj4 = eyk.b.f130872a;
                Intrinsics.checkNotNullParameter(it12, "<this>");
                return (pxk.c) u1.u(it12.getStatus(), eyk.b.f130873b);
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return null;
            case 8:
                w it13 = (w) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Intrinsics.checkNotNullParameter(it13, "<this>");
                List list2 = it13.f139057c;
                if (list2 != null) {
                    List list3 = list2;
                    arrayList = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it14 = list3.iterator();
                    while (it14.hasNext()) {
                        kii.e.B(wi0.b.Companion, (String) it14.next(), arrayList);
                    }
                }
                Boolean bool = it13.d;
                Boolean bool2 = it13.e;
                List list4 = it13.f139055a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it15 = list4.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(tz4.d.y((n) it15.next()));
                }
                return new xel.b(arrayList3, arrayList, bool, bool2);
            case 9:
                List documents = (List) obj2;
                Intrinsics.checkNotNullParameter(documents, "documents");
                List list5 = documents;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it16 = list5.iterator();
                while (it16.hasNext()) {
                    arrayList4.add(tz4.d.y((n) it16.next()));
                }
                return arrayList4;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                hz2.w.Companion.getClass();
                List list6 = hz2.j.f156995b;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                int i = 0;
                for (Object obj5 : list6) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList5.add(nb0.b(pb0.Companion, a0.d.n("loading_", i), false, 0, false, 30));
                    i = i2;
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return new hz2.p(arrayList5, false);
            case 11:
                hz2.k update = (hz2.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return hz2.k.a(update, new Data(null, null, true, 3, null), null, 2);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return m.a();
            case 13:
                Data it17 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.getLoading());
            case 14:
                Data it18 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.getLoading());
            case 15:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM `course_categories`").step();
                    return null;
                } finally {
                }
            case 16:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM glossary_terms").step();
                    return null;
                } finally {
                }
            case 17:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM total_earned_reward LIMIT 1");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total_amount");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total_currency");
                    if (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                            long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                            if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                                text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                            }
                            u0Var = new u0(j2, text);
                        }
                        c1Var = new c1(text2, u0Var);
                    }
                    return c1Var;
                } catch (Throwable th10) {
                    throw th10;
                }
            case 18:
                t update2 = (t) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return t.a(update2, null, null, null, null, null, null, null, null, null, null, null, zi0.c.P(new rub.c(), false, null, 3), null, null, null, null, 126975);
            case 19:
                return ((t) obj2).i;
            case 20:
                return ((t) obj2).f;
            case 21:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                throw e;
            case 22:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new Data(null, it19, false, 5, null);
            case 23:
                return i06.g.a((i06.g) obj2, false, null, false, null, true, 3);
            case 24:
                return i06.g.a((i06.g) obj2, false, null, false, null, false, 15);
            case 25:
                i09.g updateState = (i09.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return i09.g.a(updateState, true, null, 2);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return Boolean.valueOf(!r0.booleanValue());
            case 28:
                nzf.c it20 = (nzf.c) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return yyf.a.a(it20);
            default:
                List<g0k.c> it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                Object obj6 = e0k.a.f121724a;
                Intrinsics.checkNotNullParameter(it21, "<this>");
                ArrayList arrayList6 = new ArrayList();
                for (g0k.c cVar : it21) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    rzj.d dVar = (rzj.d) u1.v(cVar.f139499a, e0k.a.f121724a);
                    if (dVar != null) {
                        String str3 = cVar.f139500b;
                        String str4 = cVar.f139501c;
                        xi0.a aVar3 = xi0.b.Companion;
                        String str5 = cVar.d;
                        aVar3.getClass();
                        bVar = new rzj.b(dVar, str3, str4, xi0.a.a(str5), cVar.e);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList6.add(bVar);
                    }
                }
                return arrayList6;
        }
    }
}
