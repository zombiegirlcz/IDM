package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.CancellationSignal;
import android.util.EventLog;
import androidx.sqlite.db.SupportSQLiteProgram;
import j6.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f214747h = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f214748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214749c;
    public final boolean d;
    public final String[] e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f214750g;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.f214748b = sQLiteDatabase;
        String strTrim = str.trim();
        this.f214749c = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.d = false;
            this.e = f214747h;
            this.f = 0;
        } else {
            boolean z = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            SQLiteSession sQLiteSessionO = sQLiteDatabase.o();
            int iN = SQLiteDatabase.n(z);
            sQLiteSessionO.getClass();
            if (strTrim == null) {
                throw new IllegalArgumentException("sql must not be null.");
            }
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            sQLiteSessionO.a(strTrim, iN, cancellationSignal);
            try {
                sQLiteSessionO.f214752b.r(strTrim, sQLiteStatementInfo);
                sQLiteSessionO.k();
                this.d = sQLiteStatementInfo.f214759c;
                this.e = sQLiteStatementInfo.f214758b;
                this.f = sQLiteStatementInfo.f214757a;
            } catch (Throwable th10) {
                sQLiteSessionO.k();
                throw th10;
            }
        }
        if (objArr != null && objArr.length > this.f) {
            StringBuilder sb6 = new StringBuilder("Too many bind arguments.  ");
            sb6.append(objArr.length);
            sb6.append(" arguments were provided but the statement needs ");
            throw new IllegalArgumentException(a.v(sb6, " arguments.", this.f));
        }
        int i = this.f;
        if (i == 0) {
            this.f214750g = null;
            return;
        }
        Object[] objArr2 = new Object[i];
        this.f214750g = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(a.l(i, "the bind value at index ", " is null"));
        }
        h(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindDouble(int i, double d) {
        h(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindLong(int i, long j2) {
        h(i, Long.valueOf(j2));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindNull(int i) {
        h(i, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException(a.l(i, "the bind value at index ", " is null"));
        }
        h(i, str);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void f() {
        Object[] objArr = this.f214750g;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final void h(int i, Object obj2) {
        int i2 = this.f;
        if (i < 1 || i > i2) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.m("Cannot bind argument at index ", i, i2, " because the index is out of range.  The statement has ", " parameters."));
        }
        this.f214750g[i - 1] = obj2;
    }

    public final int i() {
        this.f214748b.getClass();
        return SQLiteDatabase.n(this.d);
    }

    public final void j(SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException) {
        String str;
        SQLiteDatabase sQLiteDatabase = this.f214748b;
        synchronized (sQLiteDatabase.e) {
            str = sQLiteDatabase.f214725g.f214730b;
        }
        EventLog.writeEvent(75004, str);
        sQLiteDatabase.d.a(sQLiteDatabase);
    }
}
