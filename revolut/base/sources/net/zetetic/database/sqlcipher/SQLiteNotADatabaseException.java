package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes14.dex */
public class SQLiteNotADatabaseException extends SQLiteException {
    public SQLiteNotADatabaseException() {
    }

    public SQLiteNotADatabaseException(String str) {
        super(str);
    }

    public SQLiteNotADatabaseException(String str, Throwable th10) {
        super(str, th10);
    }
}
