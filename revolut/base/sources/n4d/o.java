package n4d;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f212382b;

    public /* synthetic */ o(q qVar, int i) {
        this.f212381a = i;
        this.f212382b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f212381a) {
            case 0:
                this.f212382b.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM plain_watchlist_items WHERE sync_state in ('ADD', 'REMOVE')");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type_key");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCode");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toCode");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "added_time");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sync_state");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new o4d.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), k4d.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4))), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                this.f212382b.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection.prepare("SELECT MAX(added_time) FROM plain_watchlist_items");
                try {
                    DateTime dateTimeA = null;
                    Long lValueOf = null;
                    if (sQLiteStatementPrepare2.step()) {
                        if (!sQLiteStatementPrepare2.isNull(0)) {
                            lValueOf = Long.valueOf(sQLiteStatementPrepare2.getLong(0));
                        }
                        dateTimeA = k4d.a.a(lValueOf);
                        break;
                    }
                    return dateTimeA;
                } finally {
                }
        }
    }
}
