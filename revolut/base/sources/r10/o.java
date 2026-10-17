package r10;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f250843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Instant f250844c;
    public final /* synthetic */ Instant d;

    public /* synthetic */ o(q qVar, UUID uuid, Instant instant, Instant instant2, int i) {
        this.f250842a = i;
        this.f250843b = uuid;
        this.f250844c = instant;
        this.d = instant2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f250842a) {
            case 0:
                UUID uuid = this.f250843b;
                Instant instant = this.f250844c;
                Instant instant2 = this.d;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM (\n            SELECT * FROM messages\n            WHERE chatId = ? AND createdAt >= ? AND createdAt <= ?\n        )\n        UNION ALL\n        SELECT * FROM (\n            SELECT * FROM messages\n            WHERE chatId = ? AND createdAt < ?\n            ORDER BY ticketCreatedAt DESC, createdAt DESC\n            LIMIT ?\n        )\n        ORDER BY ticketCreatedAt ASC, createdAt ASC\n    ");
                try {
                    String strC = s10.a.c(uuid);
                    if (strC == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strC);
                    }
                    String strB = s10.a.b(instant);
                    if (strB == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, strB);
                    }
                    String strB2 = s10.a.b(instant2);
                    if (strB2 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, strB2);
                    }
                    String strC2 = s10.a.c(uuid);
                    if (strC2 == null) {
                        sQLiteStatementPrepare2.bindNull(4);
                    } else {
                        sQLiteStatementPrepare2.bindText(4, strC2);
                    }
                    String strB3 = s10.a.b(instant);
                    if (strB3 == null) {
                        sQLiteStatementPrepare2.bindNull(5);
                    } else {
                        sQLiteStatementPrepare2.bindText(5, strB3);
                    }
                    sQLiteStatementPrepare2.bindLong(6, 30);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "createdAt");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "chatId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "data");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "feedType");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "ticketCreatedAt");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "feedId");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "serverId");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "chatIdGroup");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "feedIdGroup");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "feedTypeGroup");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text = null;
                        UUID uuidH = s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow));
                        Instant instantE = s10.a.e(sQLiteStatementPrepare2.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow2));
                        UUID uuidH2 = s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow3));
                        String text2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4);
                        c0 c0VarD = s10.a.d(sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow5));
                        Instant instantE2 = s10.a.e(sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow6));
                        UUID uuidH3 = s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7));
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow8)) {
                            text = sQLiteStatementPrepare2.getText(columnIndexOrThrow8);
                        }
                        int i = columnIndexOrThrow;
                        arrayList.add(new u10.h(uuidH, instantE, uuidH2, text2, c0VarD, instantE2, uuidH3, s10.a.h(text), (int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow11)));
                        columnIndexOrThrow = i;
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 1:
                UUID uuid2 = this.f250843b;
                Instant instant3 = this.f250844c;
                Instant instant4 = this.d;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM messages\n        WHERE feedId = ?\n        AND ticketCreatedAt >= ?\n        AND createdAt > ?\n        ORDER BY ticketCreatedAt DESC, createdAt DESC\n        LIMIT ?\n        ");
                try {
                    String strC3 = s10.a.c(uuid2);
                    if (strC3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strC3);
                    }
                    String strB4 = s10.a.b(instant3);
                    if (strB4 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strB4);
                    }
                    String strB5 = s10.a.b(instant4);
                    if (strB5 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB5);
                    }
                    sQLiteStatementPrepare.bindLong(4, 100);
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketCreatedAt");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedId");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "serverId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatIdGroup");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedIdGroup");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedTypeGroup");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text3 = null;
                        UUID uuidH4 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        Instant instantE3 = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                        UUID uuidH5 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                        c0 c0VarD2 = s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                        Instant instantE4 = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                        UUID uuidH6 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                            text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                        }
                        int i2 = columnIndexOrThrow13;
                        int i3 = columnIndexOrThrow14;
                        arrayList2.add(new u10.h(uuidH4, instantE3, uuidH5, text4, c0VarD2, instantE4, uuidH6, s10.a.h(text3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22)));
                        columnIndexOrThrow13 = i2;
                        columnIndexOrThrow14 = i3;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
            default:
                UUID uuid3 = this.f250843b;
                Instant instant5 = this.f250844c;
                Instant instant6 = this.d;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM messages\n        WHERE feedId = ?\n        AND ticketCreatedAt <= ?\n        AND createdAt < ?\n        ORDER BY ticketCreatedAt DESC, createdAt DESC\n        LIMIT ?\n    ");
                try {
                    String strC4 = s10.a.c(uuid3);
                    if (strC4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strC4);
                    }
                    String strB6 = s10.a.b(instant5);
                    if (strB6 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strB6);
                    }
                    String strB7 = s10.a.b(instant6);
                    if (strB7 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB7);
                    }
                    sQLiteStatementPrepare.bindLong(4, 100);
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketCreatedAt");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedId");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "serverId");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatIdGroup");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedIdGroup");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedTypeGroup");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text5 = null;
                        UUID uuidH7 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23));
                        Instant instantE5 = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                        UUID uuidH8 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                        c0 c0VarD3 = s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27));
                        Instant instantE6 = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28));
                        UUID uuidH9 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow30)) {
                            text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                        }
                        int i5 = columnIndexOrThrow24;
                        int i6 = columnIndexOrThrow25;
                        arrayList3.add(new u10.h(uuidH7, instantE5, uuidH8, text6, c0VarD3, instantE6, uuidH9, s10.a.h(text5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                        columnIndexOrThrow24 = i5;
                        columnIndexOrThrow25 = i6;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList3;
                } finally {
                }
        }
    }
}
