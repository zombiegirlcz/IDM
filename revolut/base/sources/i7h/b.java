package i7h;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f159300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159301c;

    public /* synthetic */ b(c cVar, String str, int i) {
        this.f159299a = i;
        this.f159300b = cVar;
        this.f159301c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        String text;
        switch (this.f159299a) {
            case 0:
                j7h.a aVar = this.f159300b.f159304c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM recurring_orders WHERE portfolioId == ?");
                String str = this.f159301c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolioId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourcePocketId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDate");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderAmount_amount");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderAmount_currency");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        LocalDate localDateA = j7h.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        LocalDate localDateA2 = j7h.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            i = columnIndexOrThrow;
                            text = null;
                        } else {
                            i = columnIndexOrThrow;
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        }
                        arrayList.add(new d(text2, text3, text4, text5, text6, localDateA, localDateA2, instantOfEpochMilli, new jo3.b(j2, text)));
                        columnIndexOrThrow = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            default:
                j7h.a aVar2 = this.f159300b.f159304c;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM recurring_orders WHERE orderId == ?");
                String str2 = this.f159301c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str2);
                    }
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "orderId");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "portfolioId");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "sourcePocketId");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "period");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "startDate");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "nextDate");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "updatedDate");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "orderAmount_amount");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "orderAmount_currency");
                    d dVar = null;
                    String text7 = null;
                    if (sQLiteStatementPrepare2.step()) {
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11);
                        String text9 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12);
                        String text10 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow13);
                        String text11 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14);
                        String text12 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow15);
                        LocalDate localDateA3 = j7h.a.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16));
                        LocalDate localDateA4 = j7h.a.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17));
                        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(sQLiteStatementPrepare2.getLong(columnIndexOrThrow18));
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
                        long j3 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow19);
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow20)) {
                            text7 = sQLiteStatementPrepare2.getText(columnIndexOrThrow20);
                        }
                        dVar = new d(text8, text9, text10, text11, text12, localDateA3, localDateA4, instantOfEpochMilli2, new jo3.b(j3, text7));
                    }
                    sQLiteStatementPrepare2.close();
                    return dVar;
                } finally {
                }
        }
    }
}
