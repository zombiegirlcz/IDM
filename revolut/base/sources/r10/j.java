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
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f250828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f250829c;

    public /* synthetic */ j(q qVar, c0 c0Var, int i) {
        this.f250827a = i;
        this.f250828b = qVar;
        this.f250829c = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f250827a) {
            case 0:
                c0 c0Var = this.f250829c;
                Object obj3 = this.f250828b.d;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM messages WHERE feedType = ? ORDER BY ticketCreatedAt DESC, createdAt DESC LIMIT ?");
                try {
                    String strA = s10.a.a(c0Var);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    sQLiteStatementPrepare.bindLong(2, 100);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketCreatedAt");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedId");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "serverId");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatIdGroup");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedIdGroup");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedTypeGroup");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        UUID uuidH = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                        Instant instantE = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        UUID uuidH2 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        c0 c0VarD = s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        Instant instantE2 = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        UUID uuidH3 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        }
                        int i = columnIndexOrThrow;
                        arrayList.add(new u10.h(uuidH, instantE, uuidH2, text2, c0VarD, instantE2, uuidH3, s10.a.h(text), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
                        columnIndexOrThrow = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                c0 c0Var2 = this.f250829c;
                this.f250828b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT MAX(feedTypeGroup) FROM messages WHERE feedType = ?");
                try {
                    String strA2 = s10.a.a(c0Var2);
                    if (strA2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA2);
                    }
                    Integer numValueOf = null;
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    sQLiteStatementPrepare.close();
                }
        }
    }
}
