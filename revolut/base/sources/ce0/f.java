package ce0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SupportSQLiteDatabase {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SupportSQLiteDatabase f23335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23336b;

    public f(SupportSQLiteDatabase delegate, String dbName) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        this.f23335a = delegate;
        this.f23336b = dbName;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.f23335a.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.f23335a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() {
        this.f23335a.beginTransactionReadOnly();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f23335a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String sql2) {
        Intrinsics.checkNotNullParameter(sql2, "sql");
        return this.f23335a.compileStatement(sql2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int delete(String table, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.f23335a.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.f23335a.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String sql2, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql2, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f23335a.execSQL(sql2, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List getAttachedDbs() {
        return this.f23335a.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.f23335a.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.f23335a.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long insert(String table, int i, ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f23335a.insert(table, i, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.f23335a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.f23335a.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f23335a.query(query, cancellationSignal);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.f23335a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        this.f23335a.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int update(String table, int i, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f23335a.update(table, i, values, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String sql2) {
        Intrinsics.checkNotNullParameter(sql2, "sql");
        try {
            this.f23335a.execSQL(sql2);
            Unit unit = Unit.f186387a;
        } catch (SQLiteException e) {
            if (sql2 == null || !d0.J(sql2, "room_table_modification_log", false)) {
                throw e;
            }
            SQLiteException sQLiteException = new SQLiteException(p.a.p("Room invalidation tracker error. ", this.f23336b, " db might be leaking after close"));
            sQLiteException.initCause(e);
            throw sQLiteException;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f23335a.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String query2 = query.getQuery();
        try {
            return this.f23335a.query(query);
        } catch (SQLiteException e) {
            if (query2 != null && d0.J(query2, "room_table_modification_log", false)) {
                SQLiteException sQLiteException = new SQLiteException(p.a.p("Room invalidation tracker error. ", this.f23336b, " db might be leaking after close"));
                sQLiteException.initCause(e);
                throw sQLiteException;
            }
            throw e;
        }
    }
}
