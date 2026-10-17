package sxb;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ofg.i;
import sx2.h;
import vxb.a0;
import vxb.c0;
import vxb.y;
import vxb.z;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f266410a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final txb.b f266412c = new txb.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f266411b = new i(this, 28);

    public e(RevPointsDatabase revPointsDatabase) {
        this.f266410a = revPointsDatabase;
    }

    @Override // sxb.b
    public final Long a() {
        return (Long) DBUtil.performBlocking(this.f266410a, true, false, new sx2.g(9));
    }

    @Override // sxb.b
    public final Long b() {
        return (Long) DBUtil.performBlocking(this.f266410a, true, false, new sx2.g(8));
    }

    @Override // sxb.b
    public final y c(String str) {
        return (y) DBUtil.performBlocking(this.f266410a, true, false, new h(this, str, 4));
    }

    @Override // sxb.b
    public final d0 d() {
        return RxRoom.createSingle(this.f266410a, true, false, new sx2.g(7));
    }

    @Override // sxb.b
    public final void e(y yVar) {
        DBUtil.performBlocking(this.f266410a, false, true, new h(this, yVar, 3));
    }

    @Override // sxb.b
    public final void f(ArrayList arrayList) {
        DBUtil.performBlocking(this.f266410a, false, true, new h(this, arrayList, 2));
    }

    @Override // sxb.b
    public final r g() {
        sx2.g gVar = new sx2.g(10);
        return RxRoom.createObservable(this.f266410a, false, new String[]{"rev_points_transaction"}, gVar);
    }

    @Override // sxb.b
    public final r h(long j2, int i, boolean z, List list, boolean z3, List list2, String str, String str2, String str3, String str4) {
        StringBuilder sbS = p.a.s("SELECT * FROM rev_points_transaction WHERE (? IS NULL OR originResource = ?) AND (? IS NULL OR product = ?) AND (? IS NULL OR state = ?) AND (? IS NULL OR type = ?) AND (? = 0 OR originId IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(")) AND (");
        sbS.append("?");
        sbS.append(" = 0 OR pointsTransactionId IN (");
        int size2 = list2.size();
        StringUtil.appendPlaceholders(sbS, size2);
        sbS.append(")) AND createdDate > ");
        sbS.append("?");
        sbS.append(" ORDER BY createdDate DESC LIMIT ");
        sbS.append("?");
        c cVar = new c(this, sbS.toString(), str, str2, str3, str4, z, list, size, z3, list2, size2, j2, i, 1);
        return RxRoom.createObservable(this.f266410a, false, new String[]{"rev_points_transaction"}, cVar);
    }

    @Override // sxb.b
    public final r i(final int i, final boolean z, final List list, final boolean z3, final List list2, final String str, final String str2, final String str3, final String str4) {
        StringBuilder sbS = p.a.s("SELECT * FROM rev_points_transaction WHERE (? IS NULL OR originResource = ?) AND (? IS NULL OR product = ?) AND (? IS NULL OR state = ?) AND (? IS NULL OR type = ?) AND (? = 0 OR originId IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(")) AND (");
        sbS.append("?");
        sbS.append(" = 0 OR pointsTransactionId IN (");
        final int size2 = list2.size();
        StringUtil.appendPlaceholders(sbS, size2);
        sbS.append(")) ORDER BY createdDate DESC LIMIT ");
        sbS.append("?");
        final String string = sbS.toString();
        Function1 function1 = new Function1(this) { // from class: sxb.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2;
                int i3;
                String text;
                boolean z4 = z;
                List<String> list3 = list;
                int i5 = size;
                boolean z6 = z3;
                List<String> list4 = list2;
                int i6 = size2;
                int i21 = i;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(string);
                String str5 = str;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str5);
                    }
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str5);
                    }
                    String str6 = str2;
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str6);
                    }
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, str6);
                    }
                    String str7 = str3;
                    if (str7 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str7);
                    }
                    if (str7 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, str7);
                    }
                    String str8 = str4;
                    if (str8 == null) {
                        sQLiteStatementPrepare.bindNull(7);
                    } else {
                        sQLiteStatementPrepare.bindText(7, str8);
                    }
                    if (str8 == null) {
                        sQLiteStatementPrepare.bindNull(8);
                    } else {
                        sQLiteStatementPrepare.bindText(8, str8);
                    }
                    sQLiteStatementPrepare.bindLong(9, z4 ? 1L : 0L);
                    int i22 = 10;
                    for (String str9 : list3) {
                        if (str9 == null) {
                            sQLiteStatementPrepare.bindNull(i22);
                        } else {
                            sQLiteStatementPrepare.bindText(i22, str9);
                        }
                        i22++;
                    }
                    sQLiteStatementPrepare.bindLong(i5 + 10, z6 ? 1L : 0L);
                    int i32 = i5 + 11;
                    int i33 = i32;
                    for (String str10 : list4) {
                        if (str10 == null) {
                            sQLiteStatementPrepare.bindNull(i33);
                        } else {
                            sQLiteStatementPrepare.bindText(i33, str10);
                        }
                        i33++;
                    }
                    sQLiteStatementPrepare.bindLong(i32 + i6, i21);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pointsTransactionId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "points");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coreTransactionId");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "iconsUrl");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangeDetails");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "originId");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "originResource");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receivedExchangeDetails");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "earningDetails");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = null;
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow3);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        c0 c0VarA = txb.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        a0 a0VarA = txb.b.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                        z zVarA = txb.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                            int i43 = columnIndexOrThrow;
                            i2 = columnIndexOrThrow15;
                            i3 = i43;
                            text = null;
                        } else {
                            int i59 = columnIndexOrThrow;
                            i2 = columnIndexOrThrow15;
                            i3 = i59;
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        }
                        a0 a0VarA2 = txb.b.a(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                        int i66 = i2;
                        int i74 = columnIndexOrThrow16;
                        if (!sQLiteStatementPrepare.isNull(i74)) {
                            text2 = sQLiteStatementPrepare.getText(i74);
                        }
                        columnIndexOrThrow16 = i74;
                        arrayList.add(new y(text3, text4, d, j2, text5, text6, text7, text8, text9, c0VarA, a0VarA, zVarA, text10, text, a0VarA2, txb.b.a(text2)));
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow15 = i66;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        };
        return RxRoom.createObservable(this.f266410a, false, new String[]{"rev_points_transaction"}, function1);
    }

    @Override // sxb.b
    public final r j(long j2, int i, boolean z, List list, boolean z3, List list2, String str, String str2, String str3, String str4) {
        StringBuilder sbS = p.a.s("SELECT * FROM rev_points_transaction WHERE (? IS NULL OR originResource = ?) AND (? IS NULL OR product = ?) AND (? IS NULL OR state = ?) AND (? IS NULL OR type = ?) AND (? = 0 OR originId IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(")) AND (");
        sbS.append("?");
        sbS.append(" = 0 OR pointsTransactionId IN (");
        int size2 = list2.size();
        StringUtil.appendPlaceholders(sbS, size2);
        sbS.append(")) AND createdDate < ");
        sbS.append("?");
        sbS.append(" ORDER BY createdDate DESC LIMIT ");
        sbS.append("?");
        c cVar = new c(this, sbS.toString(), str, str2, str3, str4, z, list, size, z3, list2, size2, j2, i, 0);
        return RxRoom.createObservable(this.f266410a, false, new String[]{"rev_points_transaction"}, cVar);
    }
}
