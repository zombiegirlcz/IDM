package androidx.sqlite;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "", "sql", "", "execSQL", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "throwSQLiteException", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SQLite {
    public static final void execSQL(@NotNull SQLiteConnection sQLiteConnection, @NotNull String sql2) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "<this>");
        Intrinsics.checkNotNullParameter(sql2, "sql");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sql2);
        try {
            sQLiteStatementPrepare.step();
            d.l(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    @NotNull
    public static final Void throwSQLiteException(int i, String str) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Error code: " + i);
        if (str != null) {
            sb6.append(", message: ".concat(str));
        }
        throw new SQLException(sb6.toString());
    }
}
