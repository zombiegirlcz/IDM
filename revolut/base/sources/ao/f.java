package ao;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7843a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7844b;

    public /* synthetic */ f(int i) {
        this.f7844b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7843a) {
            case 0:
                int i = this.f7844b;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT * \n            FROM events \n            ORDER BY timestamp ASC\n            LIMIT ?\n            ");
                try {
                    sQLiteStatementPrepare.bindLong(1, i);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "raw");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "host");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new j(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                int i2 = this.f7844b;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("\n        SELECT \n            (SELECT COUNT(*) FROM events) - ? AS count,\n            (SELECT MIN(timestamp) FROM\n                (SELECT timestamp FROM events \n                ORDER BY timestamp ASC LIMIT (SELECT COUNT(*) FROM events) - ?)\n            ) AS min_timestamp,\n            (SELECT MAX(timestamp) FROM\n                (SELECT timestamp FROM events \n                ORDER BY timestamp ASC LIMIT (SELECT COUNT(*) FROM events) - ?)\n            ) AS max_timestamp\n        FROM events;\n        ");
                long j2 = i2;
                try {
                    sQLiteStatementPrepare2.bindLong(1, j2);
                    sQLiteStatementPrepare2.bindLong(2, j2);
                    sQLiteStatementPrepare2.bindLong(3, j2);
                    e eVar = null;
                    if (sQLiteStatementPrepare2.step()) {
                        int i3 = (int) sQLiteStatementPrepare2.getLong(0);
                        Long lValueOf = sQLiteStatementPrepare2.isNull(1) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(1));
                        Instant instantOfEpochMilli = lValueOf != null ? Instant.ofEpochMilli(lValueOf.longValue()) : null;
                        Long lValueOf2 = sQLiteStatementPrepare2.isNull(2) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(2));
                        eVar = new e(i3, instantOfEpochMilli, lValueOf2 != null ? Instant.ofEpochMilli(lValueOf2.longValue()) : null);
                    }
                    return eVar;
                } finally {
                }
        }
    }

    public /* synthetic */ f(h hVar, int i) {
        this.f7844b = i;
    }
}
