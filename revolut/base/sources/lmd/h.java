package lmd;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import qua.p;
import qua.u;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f196967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f196968c;

    public /* synthetic */ h(DateTime dateTime, DateTime dateTime2, j jVar) {
        this.f196966a = 0;
        this.f196967b = dateTime;
        this.f196968c = dateTime2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ibd.h hVar;
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f196966a) {
            case 0:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                DateTime dateTime = this.f196967b;
                DateTime dateTime2 = this.f196968c;
                if (dateTime.compareTo((ReadableInstant) dateTime2) >= 0) {
                    return f0.f322471a;
                }
                ArrayList<p> arrayList = new ArrayList();
                for (Object obj3 : recurringPayments) {
                    p pVar = (p) obj3;
                    DateTime dateTimeNow = DateTime.now();
                    Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
                    if (u.i(pVar, dateTimeNow) && (hVar = pVar.f249314a.f160152c) != ibd.h.SAVINGS_POCKET && hVar != ibd.h.VAULT && hVar != ibd.h.UNKNOWN && hVar != ibd.h.WALLET && pVar.f249323j != null) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (p pVar2 : arrayList) {
                    List listD = u.d(pVar2, new Interval(dateTime.getMillis(), dateTime2.getMillis()));
                    yld.h hVar2 = !listD.isEmpty() ? new yld.h(pVar2, listD) : null;
                    if (hVar2 != null) {
                        arrayList2.add(hVar2);
                    }
                }
                return arrayList2;
            case 1:
                DateTime dateTime3 = this.f196967b;
                DateTime dateTime4 = this.f196968c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM inbox_item WHERE createdDate >= ? AND createdDate < ?");
                try {
                    Long lB = b21.a.b(dateTime3);
                    if (lB == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindLong(1, lB.longValue());
                    }
                    Long lB2 = b21.a.b(dateTime4);
                    if (lB2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindLong(2, lB2.longValue());
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            default:
                DateTime dateTime5 = this.f196967b;
                DateTime dateTime6 = this.f196968c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM inbox_item WHERE createdDate >= ? AND createdDate <= ?");
                try {
                    Long lB3 = b21.a.b(dateTime5);
                    if (lB3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindLong(1, lB3.longValue());
                    }
                    Long lB4 = b21.a.b(dateTime6);
                    if (lB4 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindLong(2, lB4.longValue());
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
        }
    }

    public /* synthetic */ h(u69.h hVar, DateTime dateTime, DateTime dateTime2, int i) {
        this.f196966a = i;
        this.f196967b = dateTime;
        this.f196968c = dateTime2;
    }
}
