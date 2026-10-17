package androidx.room.util;

import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"androidx/room/util/SQLiteStatementUtil__StatementUtilKt", "androidx/room/util/SQLiteStatementUtil__StatementUtil_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public abstract class SQLiteStatementUtil {
    public static final int columnIndexOf(@NotNull SQLiteStatement sQLiteStatement, @NotNull String str) {
        return SQLiteStatementUtil__StatementUtil_androidKt.columnIndexOf(sQLiteStatement, str);
    }

    public static final int columnIndexOfCommon(@NotNull SQLiteStatement sQLiteStatement, @NotNull String str) {
        return SQLiteStatementUtil__StatementUtilKt.columnIndexOfCommon(sQLiteStatement, str);
    }

    public static final int getColumnIndex(@NotNull SQLiteStatement sQLiteStatement, @NotNull String str) {
        return SQLiteStatementUtil__StatementUtilKt.getColumnIndex(sQLiteStatement, str);
    }

    public static final int getColumnIndexOrThrow(@NotNull SQLiteStatement sQLiteStatement, @NotNull String str) {
        return SQLiteStatementUtil__StatementUtilKt.getColumnIndexOrThrow(sQLiteStatement, str);
    }
}
