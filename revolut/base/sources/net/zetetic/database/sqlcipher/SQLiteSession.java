package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import net.zetetic.database.CursorWindow;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteConnectionPool f214751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteConnection f214752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f214753c;
    public Transaction d;
    public Transaction e;

    public static final class Transaction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Transaction f214754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f214755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f214756c;
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new IllegalArgumentException("connectionPool must not be null");
        }
        this.f214751a = sQLiteConnectionPool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r21, int r22, android.os.CancellationSignal r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteSession.a(java.lang.String, int, android.os.CancellationSignal):void");
    }

    public final void b(int i, int i2, CancellationSignal cancellationSignal) {
        Transaction transaction = this.e;
        if (transaction != null && transaction.f214755b) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.e == null) {
            a(null, i2, cancellationSignal);
        }
        try {
            if (this.e == null) {
                if (i == 1) {
                    this.f214752b.h("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i != 2) {
                    this.f214752b.h("BEGIN;", null, cancellationSignal);
                } else {
                    this.f214752b.h("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            Transaction transaction2 = this.d;
            if (transaction2 != null) {
                this.d = transaction2.f214754a;
                transaction2.f214754a = null;
                transaction2.f214755b = false;
                transaction2.f214756c = false;
            } else {
                transaction2 = new Transaction();
            }
            transaction2.f214754a = this.e;
            this.e = transaction2;
        } catch (Throwable th10) {
            if (this.e == null) {
                k();
            }
            throw th10;
        }
    }

    public final void c(CancellationSignal cancellationSignal) {
        if (this.e == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.e;
        boolean z = transaction.f214755b && !transaction.f214756c;
        Transaction transaction2 = transaction.f214754a;
        this.e = transaction2;
        transaction.f214754a = this.d;
        this.d = transaction;
        if (transaction2 != null) {
            if (z) {
                return;
            }
            transaction2.f214756c = true;
            return;
        }
        try {
            if (z) {
                this.f214752b.h("COMMIT;", null, cancellationSignal);
            } else {
                this.f214752b.h("ROLLBACK;", null, cancellationSignal);
            }
            k();
        } catch (Throwable th10) {
            k();
            throw th10;
        }
    }

    public final void d(int i, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return;
        }
        a(str, i, null);
        try {
            this.f214752b.h(str, objArr, null);
        } finally {
            k();
        }
    }

    public final int e(int i, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return 0;
        }
        a(str, i, null);
        try {
            return this.f214752b.i(str, objArr);
        } finally {
            k();
        }
    }

    public final int f(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (j(str, i3, cancellationSignal)) {
            cursorWindow.h();
            return 0;
        }
        a(str, i3, cancellationSignal);
        try {
            return this.f214752b.j(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
        } finally {
            k();
        }
    }

    public final long g(int i, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return 0L;
        }
        a(str, i, null);
        try {
            return this.f214752b.k(str, objArr);
        } finally {
            k();
        }
    }

    public final long h(int i, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return 0L;
        }
        a(str, i, null);
        try {
            return this.f214752b.l(str, objArr);
        } finally {
            k();
        }
    }

    public final void i(int i, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        a(str, i, null);
        try {
            this.f214752b.n(str, objArr);
        } finally {
            k();
        }
    }

    public final boolean j(String str, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            b(2, i, cancellationSignal);
            return true;
        }
        if (sqlStatementType != 5) {
            if (sqlStatementType != 6) {
                return false;
            }
            c(cancellationSignal);
            return true;
        }
        Transaction transaction = this.e;
        if (transaction == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        if (transaction.f214755b) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
        transaction.f214755b = true;
        c(cancellationSignal);
        return true;
    }

    public final void k() {
        int i = this.f214753c - 1;
        this.f214753c = i;
        if (i == 0) {
            try {
                this.f214751a.o(this.f214752b);
            } finally {
                this.f214752b = null;
            }
        }
    }
}
