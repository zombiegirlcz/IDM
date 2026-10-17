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
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f250822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f250823c;

    public /* synthetic */ h(q qVar, UUID uuid, int i) {
        this.f250821a = i;
        this.f250822b = qVar;
        this.f250823c = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f250821a) {
            case 0:
                UUID uuid = this.f250823c;
                this.f250822b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT MAX(chatIdGroup) FROM messages WHERE chatId = ?");
                try {
                    String strC = s10.a.c(uuid);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strC);
                    }
                    Integer numValueOf = null;
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return numValueOf;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                UUID uuid2 = this.f250823c;
                this.f250822b.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT MAX(feedIdGroup) FROM messages WHERE feedId = ?");
                try {
                    String strC2 = s10.a.c(uuid2);
                    if (strC2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strC2);
                    }
                    Integer numValueOf2 = null;
                    if (sQLiteStatementPrepare2.step() && !sQLiteStatementPrepare2.isNull(0)) {
                        numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare2.getLong(0));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return numValueOf2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 2:
                UUID uuid3 = this.f250823c;
                Object obj3 = this.f250822b.d;
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM messages\n        WHERE feedId = ?\n        ORDER BY ticketCreatedAt DESC, createdAt DESC\n        LIMIT ?\n        ");
                try {
                    String strC3 = s10.a.c(uuid3);
                    if (strC3 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, strC3);
                    }
                    sQLiteStatementPrepare3.bindLong(2, 100);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "createdAt");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "chatId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "data");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "feedType");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "ticketCreatedAt");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "feedId");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "serverId");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "chatIdGroup");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "feedIdGroup");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "feedTypeGroup");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        String text = null;
                        UUID uuidH = s10.a.h(sQLiteStatementPrepare3.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow));
                        Instant instantE = s10.a.e(sQLiteStatementPrepare3.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow2));
                        UUID uuidH2 = s10.a.h(sQLiteStatementPrepare3.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow3));
                        String text2 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow4);
                        c0 c0VarD = s10.a.d(sQLiteStatementPrepare3.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow5));
                        Instant instantE2 = s10.a.e(sQLiteStatementPrepare3.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow6));
                        UUID uuidH3 = s10.a.h(sQLiteStatementPrepare3.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow7));
                        if (!sQLiteStatementPrepare3.isNull(columnIndexOrThrow8)) {
                            text = sQLiteStatementPrepare3.getText(columnIndexOrThrow8);
                        }
                        int i = columnIndexOrThrow2;
                        int i2 = columnIndexOrThrow3;
                        arrayList.add(new u10.h(uuidH, instantE, uuidH2, text2, c0VarD, instantE2, uuidH3, s10.a.h(text), (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow11)));
                        columnIndexOrThrow2 = i;
                        columnIndexOrThrow3 = i2;
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList;
                } finally {
                }
            default:
                UUID uuid4 = this.f250823c;
                Object obj4 = this.f250822b.d;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM messages WHERE chatId = ? ORDER BY createdAt DESC LIMIT ?");
                try {
                    String strC4 = s10.a.c(uuid4);
                    if (strC4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strC4);
                    }
                    sQLiteStatementPrepare.bindLong(2, 100);
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
                        int i3 = columnIndexOrThrow13;
                        int i5 = columnIndexOrThrow14;
                        arrayList2.add(new u10.h(uuidH4, instantE3, uuidH5, text4, c0VarD2, instantE4, uuidH6, s10.a.h(text3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22)));
                        columnIndexOrThrow13 = i3;
                        columnIndexOrThrow14 = i5;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
