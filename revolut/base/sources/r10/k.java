package r10;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f250831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Instant f250832c;
    public final /* synthetic */ Instant d;
    public final /* synthetic */ UUID e;

    public /* synthetic */ k(q qVar, UUID uuid, Instant instant, Instant instant2, UUID uuid2, int i) {
        this.f250830a = i;
        this.f250831b = uuid;
        this.f250832c = instant;
        this.d = instant2;
        this.e = uuid2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250830a) {
            case 0:
                UUID uuid = this.f250831b;
                Instant instant = this.f250832c;
                Instant instant2 = this.d;
                UUID uuid2 = this.e;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE chatId = ? AND serverId IS NOT NULL\n        AND (ticketCreatedAt, createdAt, id) < (?, ?, ?)\n        ORDER BY ticketCreatedAt DESC, createdAt DESC, id DESC\n        LIMIT 1\n    )");
                try {
                    String strC = s10.a.c(uuid);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strC);
                    }
                    String strB = s10.a.b(instant);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strB);
                    }
                    String strB2 = s10.a.b(instant2);
                    if (strB2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB2);
                    }
                    String strC2 = s10.a.c(uuid2);
                    if (strC2 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, strC2);
                    }
                    u10.q qVar = null;
                    String text = null;
                    if (sQLiteStatementPrepare.step()) {
                        UUID uuidH = s10.a.h(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        Instant instantE = s10.a.e(sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1));
                        UUID uuidH2 = s10.a.h(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2));
                        c0 c0VarD = s10.a.d(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3));
                        Instant instantE2 = s10.a.e(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                        UUID uuidH3 = s10.a.h(sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5));
                        if (!sQLiteStatementPrepare.isNull(6)) {
                            text = sQLiteStatementPrepare.getText(6);
                        }
                        qVar = new u10.q(uuidH, instantE, instantE2, uuidH2, uuidH3, c0VarD, s10.a.h(text), (int) sQLiteStatementPrepare.getLong(7), (int) sQLiteStatementPrepare.getLong(8), (int) sQLiteStatementPrepare.getLong(9));
                    }
                    sQLiteStatementPrepare.close();
                    return qVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                UUID uuid3 = this.f250831b;
                Instant instant3 = this.f250832c;
                Instant instant4 = this.d;
                UUID uuid4 = this.e;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE feedId = ? AND serverId IS NOT NULL\n        AND (ticketCreatedAt, createdAt, id) > (?, ?, ?)\n        ORDER BY ticketCreatedAt ASC, createdAt ASC, id ASC\n        LIMIT 1\n    )");
                try {
                    String strC3 = s10.a.c(uuid3);
                    if (strC3 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strC3);
                    }
                    String strB3 = s10.a.b(instant3);
                    if (strB3 == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, strB3);
                    }
                    String strB4 = s10.a.b(instant4);
                    if (strB4 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, strB4);
                    }
                    String strC4 = s10.a.c(uuid4);
                    if (strC4 == null) {
                        sQLiteStatementPrepare2.bindNull(4);
                    } else {
                        sQLiteStatementPrepare2.bindText(4, strC4);
                    }
                    u10.q qVar2 = null;
                    String text2 = null;
                    if (sQLiteStatementPrepare2.step()) {
                        UUID uuidH4 = s10.a.h(sQLiteStatementPrepare2.isNull(0) ? null : sQLiteStatementPrepare2.getText(0));
                        Instant instantE3 = s10.a.e(sQLiteStatementPrepare2.isNull(1) ? null : sQLiteStatementPrepare2.getText(1));
                        UUID uuidH5 = s10.a.h(sQLiteStatementPrepare2.isNull(2) ? null : sQLiteStatementPrepare2.getText(2));
                        c0 c0VarD2 = s10.a.d(sQLiteStatementPrepare2.isNull(3) ? null : sQLiteStatementPrepare2.getText(3));
                        Instant instantE4 = s10.a.e(sQLiteStatementPrepare2.isNull(4) ? null : sQLiteStatementPrepare2.getText(4));
                        UUID uuidH6 = s10.a.h(sQLiteStatementPrepare2.isNull(5) ? null : sQLiteStatementPrepare2.getText(5));
                        if (!sQLiteStatementPrepare2.isNull(6)) {
                            text2 = sQLiteStatementPrepare2.getText(6);
                        }
                        qVar2 = new u10.q(uuidH4, instantE3, instantE4, uuidH5, uuidH6, c0VarD2, s10.a.h(text2), (int) sQLiteStatementPrepare2.getLong(7), (int) sQLiteStatementPrepare2.getLong(8), (int) sQLiteStatementPrepare2.getLong(9));
                    }
                    sQLiteStatementPrepare2.close();
                    return qVar2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 2:
                UUID uuid5 = this.f250831b;
                Instant instant5 = this.f250832c;
                Instant instant6 = this.d;
                UUID uuid6 = this.e;
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE feedId = ? AND serverId IS NOT NULL\n        AND (ticketCreatedAt, createdAt, id) < (?, ?, ?)\n        ORDER BY ticketCreatedAt DESC, createdAt DESC, id DESC\n        LIMIT 1\n    )");
                try {
                    String strC5 = s10.a.c(uuid5);
                    if (strC5 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, strC5);
                    }
                    String strB5 = s10.a.b(instant5);
                    if (strB5 == null) {
                        sQLiteStatementPrepare3.bindNull(2);
                    } else {
                        sQLiteStatementPrepare3.bindText(2, strB5);
                    }
                    String strB6 = s10.a.b(instant6);
                    if (strB6 == null) {
                        sQLiteStatementPrepare3.bindNull(3);
                    } else {
                        sQLiteStatementPrepare3.bindText(3, strB6);
                    }
                    String strC6 = s10.a.c(uuid6);
                    if (strC6 == null) {
                        sQLiteStatementPrepare3.bindNull(4);
                    } else {
                        sQLiteStatementPrepare3.bindText(4, strC6);
                    }
                    u10.q qVar3 = null;
                    String text3 = null;
                    if (sQLiteStatementPrepare3.step()) {
                        UUID uuidH7 = s10.a.h(sQLiteStatementPrepare3.isNull(0) ? null : sQLiteStatementPrepare3.getText(0));
                        Instant instantE5 = s10.a.e(sQLiteStatementPrepare3.isNull(1) ? null : sQLiteStatementPrepare3.getText(1));
                        UUID uuidH8 = s10.a.h(sQLiteStatementPrepare3.isNull(2) ? null : sQLiteStatementPrepare3.getText(2));
                        c0 c0VarD3 = s10.a.d(sQLiteStatementPrepare3.isNull(3) ? null : sQLiteStatementPrepare3.getText(3));
                        Instant instantE6 = s10.a.e(sQLiteStatementPrepare3.isNull(4) ? null : sQLiteStatementPrepare3.getText(4));
                        UUID uuidH9 = s10.a.h(sQLiteStatementPrepare3.isNull(5) ? null : sQLiteStatementPrepare3.getText(5));
                        if (!sQLiteStatementPrepare3.isNull(6)) {
                            text3 = sQLiteStatementPrepare3.getText(6);
                        }
                        qVar3 = new u10.q(uuidH7, instantE5, instantE6, uuidH8, uuidH9, c0VarD3, s10.a.h(text3), (int) sQLiteStatementPrepare3.getLong(7), (int) sQLiteStatementPrepare3.getLong(8), (int) sQLiteStatementPrepare3.getLong(9));
                    }
                    sQLiteStatementPrepare3.close();
                    return qVar3;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 3:
                UUID uuid7 = this.f250831b;
                Instant instant7 = this.f250832c;
                Instant instant8 = this.d;
                UUID uuid8 = this.e;
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE chatId = ? AND serverId IS NOT NULL\n        AND (ticketCreatedAt, createdAt, id) > (?, ?, ?)\n        ORDER BY ticketCreatedAt ASC, createdAt ASC, id ASC\n        LIMIT 1\n    )");
                try {
                    String strC7 = s10.a.c(uuid7);
                    if (strC7 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, strC7);
                    }
                    String strB7 = s10.a.b(instant7);
                    if (strB7 == null) {
                        sQLiteStatementPrepare4.bindNull(2);
                    } else {
                        sQLiteStatementPrepare4.bindText(2, strB7);
                    }
                    String strB8 = s10.a.b(instant8);
                    if (strB8 == null) {
                        sQLiteStatementPrepare4.bindNull(3);
                    } else {
                        sQLiteStatementPrepare4.bindText(3, strB8);
                    }
                    String strC8 = s10.a.c(uuid8);
                    if (strC8 == null) {
                        sQLiteStatementPrepare4.bindNull(4);
                    } else {
                        sQLiteStatementPrepare4.bindText(4, strC8);
                    }
                    u10.q qVar4 = null;
                    String text4 = null;
                    if (sQLiteStatementPrepare4.step()) {
                        UUID uuidH10 = s10.a.h(sQLiteStatementPrepare4.isNull(0) ? null : sQLiteStatementPrepare4.getText(0));
                        Instant instantE7 = s10.a.e(sQLiteStatementPrepare4.isNull(1) ? null : sQLiteStatementPrepare4.getText(1));
                        UUID uuidH11 = s10.a.h(sQLiteStatementPrepare4.isNull(2) ? null : sQLiteStatementPrepare4.getText(2));
                        c0 c0VarD4 = s10.a.d(sQLiteStatementPrepare4.isNull(3) ? null : sQLiteStatementPrepare4.getText(3));
                        Instant instantE8 = s10.a.e(sQLiteStatementPrepare4.isNull(4) ? null : sQLiteStatementPrepare4.getText(4));
                        UUID uuidH12 = s10.a.h(sQLiteStatementPrepare4.isNull(5) ? null : sQLiteStatementPrepare4.getText(5));
                        if (!sQLiteStatementPrepare4.isNull(6)) {
                            text4 = sQLiteStatementPrepare4.getText(6);
                        }
                        qVar4 = new u10.q(uuidH10, instantE7, instantE8, uuidH11, uuidH12, c0VarD4, s10.a.h(text4), (int) sQLiteStatementPrepare4.getLong(7), (int) sQLiteStatementPrepare4.getLong(8), (int) sQLiteStatementPrepare4.getLong(9));
                    }
                    sQLiteStatementPrepare4.close();
                    return qVar4;
                } finally {
                    sQLiteStatementPrepare4.close();
                }
            case 4:
                UUID uuid9 = this.f250831b;
                Instant instant9 = this.f250832c;
                Instant instant10 = this.d;
                UUID uuid10 = this.e;
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE feedId = ? AND serverId IS NOT NULL AND feedIdGroup != 0\n            AND (ticketCreatedAt, createdAt, id) <= (?, ?, ?)\n        ORDER BY ticketCreatedAt ASC, createdAt ASC, id ASC\n        LIMIT 1\n        )");
                try {
                    String strC9 = s10.a.c(uuid9);
                    if (strC9 == null) {
                        sQLiteStatementPrepare5.bindNull(1);
                    } else {
                        sQLiteStatementPrepare5.bindText(1, strC9);
                    }
                    String strB9 = s10.a.b(instant9);
                    if (strB9 == null) {
                        sQLiteStatementPrepare5.bindNull(2);
                    } else {
                        sQLiteStatementPrepare5.bindText(2, strB9);
                    }
                    String strB10 = s10.a.b(instant10);
                    if (strB10 == null) {
                        sQLiteStatementPrepare5.bindNull(3);
                    } else {
                        sQLiteStatementPrepare5.bindText(3, strB10);
                    }
                    String strC10 = s10.a.c(uuid10);
                    if (strC10 == null) {
                        sQLiteStatementPrepare5.bindNull(4);
                    } else {
                        sQLiteStatementPrepare5.bindText(4, strC10);
                    }
                    u10.q qVar5 = null;
                    String text5 = null;
                    if (sQLiteStatementPrepare5.step()) {
                        UUID uuidH13 = s10.a.h(sQLiteStatementPrepare5.isNull(0) ? null : sQLiteStatementPrepare5.getText(0));
                        Instant instantE9 = s10.a.e(sQLiteStatementPrepare5.isNull(1) ? null : sQLiteStatementPrepare5.getText(1));
                        UUID uuidH14 = s10.a.h(sQLiteStatementPrepare5.isNull(2) ? null : sQLiteStatementPrepare5.getText(2));
                        c0 c0VarD5 = s10.a.d(sQLiteStatementPrepare5.isNull(3) ? null : sQLiteStatementPrepare5.getText(3));
                        Instant instantE10 = s10.a.e(sQLiteStatementPrepare5.isNull(4) ? null : sQLiteStatementPrepare5.getText(4));
                        UUID uuidH15 = s10.a.h(sQLiteStatementPrepare5.isNull(5) ? null : sQLiteStatementPrepare5.getText(5));
                        if (!sQLiteStatementPrepare5.isNull(6)) {
                            text5 = sQLiteStatementPrepare5.getText(6);
                        }
                        qVar5 = new u10.q(uuidH13, instantE9, instantE10, uuidH14, uuidH15, c0VarD5, s10.a.h(text5), (int) sQLiteStatementPrepare5.getLong(7), (int) sQLiteStatementPrepare5.getLong(8), (int) sQLiteStatementPrepare5.getLong(9));
                    }
                    sQLiteStatementPrepare5.close();
                    return qVar5;
                } finally {
                }
            default:
                UUID uuid11 = this.f250831b;
                Instant instant11 = this.f250832c;
                Instant instant12 = this.d;
                UUID uuid12 = this.e;
                SQLiteStatement sQLiteStatementPrepare6 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE chatId = ? AND serverId IS NOT NULL AND chatIdGroup != 0\n            AND (ticketCreatedAt, createdAt, id) <= (?, ?, ?)\n        ORDER BY ticketCreatedAt ASC, createdAt ASC, id ASC\n        LIMIT 1\n        )");
                try {
                    String strC11 = s10.a.c(uuid11);
                    if (strC11 == null) {
                        sQLiteStatementPrepare6.bindNull(1);
                    } else {
                        sQLiteStatementPrepare6.bindText(1, strC11);
                    }
                    String strB11 = s10.a.b(instant11);
                    if (strB11 == null) {
                        sQLiteStatementPrepare6.bindNull(2);
                    } else {
                        sQLiteStatementPrepare6.bindText(2, strB11);
                    }
                    String strB12 = s10.a.b(instant12);
                    if (strB12 == null) {
                        sQLiteStatementPrepare6.bindNull(3);
                    } else {
                        sQLiteStatementPrepare6.bindText(3, strB12);
                    }
                    String strC12 = s10.a.c(uuid12);
                    if (strC12 == null) {
                        sQLiteStatementPrepare6.bindNull(4);
                    } else {
                        sQLiteStatementPrepare6.bindText(4, strC12);
                    }
                    u10.q qVar6 = null;
                    String text6 = null;
                    if (sQLiteStatementPrepare6.step()) {
                        UUID uuidH16 = s10.a.h(sQLiteStatementPrepare6.isNull(0) ? null : sQLiteStatementPrepare6.getText(0));
                        Instant instantE11 = s10.a.e(sQLiteStatementPrepare6.isNull(1) ? null : sQLiteStatementPrepare6.getText(1));
                        UUID uuidH17 = s10.a.h(sQLiteStatementPrepare6.isNull(2) ? null : sQLiteStatementPrepare6.getText(2));
                        c0 c0VarD6 = s10.a.d(sQLiteStatementPrepare6.isNull(3) ? null : sQLiteStatementPrepare6.getText(3));
                        Instant instantE12 = s10.a.e(sQLiteStatementPrepare6.isNull(4) ? null : sQLiteStatementPrepare6.getText(4));
                        UUID uuidH18 = s10.a.h(sQLiteStatementPrepare6.isNull(5) ? null : sQLiteStatementPrepare6.getText(5));
                        if (!sQLiteStatementPrepare6.isNull(6)) {
                            text6 = sQLiteStatementPrepare6.getText(6);
                        }
                        qVar6 = new u10.q(uuidH16, instantE11, instantE12, uuidH17, uuidH18, c0VarD6, s10.a.h(text6), (int) sQLiteStatementPrepare6.getLong(7), (int) sQLiteStatementPrepare6.getLong(8), (int) sQLiteStatementPrepare6.getLong(9));
                    }
                    sQLiteStatementPrepare6.close();
                    return qVar6;
                } finally {
                }
        }
    }
}
