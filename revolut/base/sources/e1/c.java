package e1;

import androidx.compose.foundation.BorderKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f121764c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj2, Object obj3, int i, long j2, long j3) {
        this.f121762a = i;
        this.d = obj2;
        this.f121763b = j2;
        this.f121764c = j3;
        this.e = obj3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        rqj.j jVar;
        List list;
        int i;
        int i2;
        Integer numValueOf;
        switch (this.f121762a) {
            case 0:
                return BorderKt.drawRectBorder_NsqcLGU$lambda$0((Brush) this.d, this.f121763b, this.f121764c, (DrawStyle) this.e, (ContentDrawScope) obj2);
            case 1:
                return lqj.c.h((lqj.c) this.d, this.f121763b, this.f121764c, (ArrayList) this.e);
            case 2:
                String str = (String) this.d;
                long j2 = this.f121763b;
                long j3 = this.f121764c;
                ArrayList<String> arrayList = (ArrayList) this.e;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str);
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    sQLiteStatementPrepare.bindLong(2, j3);
                    int i3 = 3;
                    for (String str2 : arrayList) {
                        if (str2 == null) {
                            sQLiteStatementPrepare.bindNull(i3);
                        } else {
                            sQLiteStatementPrepare.bindText(i3, str2);
                        }
                        i3++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new mqj.c(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                rqj.j jVar2 = (rqj.j) this.d;
                String str3 = (String) this.e;
                long j5 = this.f121763b;
                long j16 = this.f121764c;
                jVar2.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM budget_history_snapshot\n        WHERE walletId = ?\n            AND effectiveFrom < ?\n            AND (effectiveTo IS NULL OR effectiveTo > ?)\n        ORDER BY effectiveFrom\n        ");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    sQLiteStatementPrepare.bindLong(2, j5);
                    sQLiteStatementPrepare.bindLong(3, j16);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "effectiveFrom");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "effectiveTo");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "overallAmount");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "categories");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cycle_type");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cycle_weekDay");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cycle_startDay");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cycle_behaviour");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        long j22 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        long j42 = sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        sqj.a aVarF = jVar2.f();
                        if (text3 != null) {
                            jVar = jVar2;
                            list = (List) aVarF.f265096a.b(nlm.a.a(tqj.c.Companion.serializer()), text3);
                        } else {
                            jVar = jVar2;
                            aVarF.getClass();
                            list = null;
                        }
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        List list2 = list;
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                            i = columnIndexOrThrow;
                            i2 = columnIndexOrThrow2;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow;
                            i2 = columnIndexOrThrow2;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                        }
                        int i5 = columnIndexOrThrow3;
                        arrayList3.add(new tqj.d(text, j22, lValueOf, new zpj.a(numValueOf, text4, text5, sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), text2, j42, list2));
                        columnIndexOrThrow3 = i5;
                        columnIndexOrThrow = i;
                        jVar2 = jVar;
                        columnIndexOrThrow2 = i2;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList3;
                } catch (Throwable th10) {
                    throw th10;
                }
        }
    }

    public /* synthetic */ c(rqj.j jVar, String str, long j2, long j3) {
        this.f121762a = 3;
        this.d = jVar;
        this.e = str;
        this.f121763b = j2;
        this.f121764c = j3;
    }
}
