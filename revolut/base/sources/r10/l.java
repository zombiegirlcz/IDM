package r10;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f250834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Instant f250835c;
    public final /* synthetic */ Instant d;
    public final /* synthetic */ UUID e;

    public /* synthetic */ l(int i, UUID uuid, Instant instant, Instant instant2, q qVar, c0 c0Var) {
        this.f250833a = i;
        this.f250834b = c0Var;
        this.f250835c = instant;
        this.d = instant2;
        this.e = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250833a) {
            case 0:
                c0 c0Var = this.f250834b;
                Instant instant = this.f250835c;
                Instant instant2 = this.d;
                UUID uuid = this.e;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE feedType = ? AND serverId IS NOT NULL\n        AND (ticketCreatedAt, createdAt, id) < (?, ?, ?)\n        ORDER BY ticketCreatedAt DESC, createdAt DESC, id DESC\n        LIMIT 1\n    )");
                try {
                    String strA = s10.a.a(c0Var);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
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
                    String strC = s10.a.c(uuid);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, strC);
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
                c0 c0Var2 = this.f250834b;
                Instant instant3 = this.f250835c;
                Instant instant4 = this.d;
                UUID uuid2 = this.e;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE feedType = ? AND serverId IS NOT NULL\n        AND (ticketCreatedAt, createdAt, id) > (?, ?, ?)\n        ORDER BY ticketCreatedAt ASC, createdAt ASC, id ASC\n        LIMIT 1\n    )");
                try {
                    String strA2 = s10.a.a(c0Var2);
                    if (strA2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strA2);
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
                    String strC2 = s10.a.c(uuid2);
                    if (strC2 == null) {
                        sQLiteStatementPrepare2.bindNull(4);
                    } else {
                        sQLiteStatementPrepare2.bindText(4, strC2);
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
                }
            default:
                c0 c0Var3 = this.f250834b;
                Instant instant5 = this.f250835c;
                Instant instant6 = this.d;
                UUID uuid3 = this.e;
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (\n        SELECT * FROM messages\n        WHERE feedType = ? AND serverId IS NOT NULL AND feedTypeGroup != 0\n            AND (ticketCreatedAt, createdAt, id) <= (?, ?, ?)\n        ORDER BY ticketCreatedAt ASC, createdAt ASC, id ASC\n        LIMIT 1\n        )");
                try {
                    String strA3 = s10.a.a(c0Var3);
                    if (strA3 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, strA3);
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
                    String strC3 = s10.a.c(uuid3);
                    if (strC3 == null) {
                        sQLiteStatementPrepare3.bindNull(4);
                    } else {
                        sQLiteStatementPrepare3.bindText(4, strC3);
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
                }
        }
    }
}
