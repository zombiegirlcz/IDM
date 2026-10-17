package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f214736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214738c;
    public final CancellationSignal d;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.f214736a = sQLiteDatabase;
        this.f214737b = str2;
        this.f214738c = str;
        this.d = cancellationSignal;
    }

    public final String toString() {
        return "SQLiteDirectCursorDriver: " + this.f214738c;
    }
}
