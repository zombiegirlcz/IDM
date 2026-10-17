package net.zetetic.database.sqlcipher;

import java.util.HashMap;
import net.zetetic.database.AbstractWindowedCursor;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes14.dex */
public class SQLiteCursor extends AbstractWindowedCursor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f214716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SQLiteQuery f214717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SQLiteCursorDriver f214718n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f214719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f214720q;

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this) {
            this.f214717m.g();
            this.f214718n.getClass();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final void deactivate() {
        d();
        this.f214718n.getClass();
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void f(int i) {
        int i2;
        CursorWindow cursorWindow = this.k;
        if (cursorWindow == null || i < (i2 = cursorWindow.f214669c) || i >= cursorWindow.l() + i2) {
            h(i);
        }
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void finalize() {
        try {
            if (this.k != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final int getColumnIndex(String str) {
        if (this.f214720q == null) {
            String[] strArr = this.f214716l;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.f214720q = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.a("SQLiteCursor", "requesting column name with table name -- ".concat(str), new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = (Integer) this.f214720q.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.f214716l;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        if (this.o == -1) {
            h(0);
        }
        return this.o;
    }

    public final void h(int i) {
        SQLiteQuery sQLiteQuery = this.f214717m;
        String path = sQLiteQuery.f214748b.getPath();
        CursorWindow cursorWindow = this.k;
        if (cursorWindow == null) {
            CursorWindow cursorWindow2 = new CursorWindow(path, 16384);
            CursorWindow cursorWindow3 = this.k;
            if (cursorWindow2 != cursorWindow3) {
                if (cursorWindow3 != null) {
                    cursorWindow3.g();
                    this.k = null;
                }
                this.k = cursorWindow2;
            }
            this.o = -1;
        } else {
            cursorWindow.h();
        }
        try {
            if (this.o != -1) {
                sQLiteQuery.k(this.k, Math.max(i - (this.f214719p / 3), 0), i, false);
                return;
            }
            this.o = sQLiteQuery.k(this.k, Math.max(i, 0), i, true);
            this.f214719p = this.k.l();
            if (Logger.b().a("SQLiteCursor", 3)) {
                Logger.b().b(3, "SQLiteCursor", "received count(*) from native_fill_window: " + this.o, null);
            }
        } catch (RuntimeException e) {
            CursorWindow cursorWindow4 = this.k;
            if (cursorWindow4 != null) {
                if (cursorWindow4 != null) {
                    cursorWindow4.g();
                    this.k = null;
                }
                this.k = null;
            }
            this.o = -1;
            throw e;
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final boolean requery() {
        if (this.f214662b) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f214717m.f214748b.isOpen()) {
                    return false;
                }
                CursorWindow cursorWindow = this.k;
                if (cursorWindow != null) {
                    cursorWindow.h();
                }
                this.f214661a = -1;
                this.o = -1;
                this.f214718n.getClass();
                try {
                    super.requery();
                    return true;
                } catch (IllegalStateException e) {
                    Logger.b().b(5, "SQLiteCursor", "requery() failed " + e.getMessage(), e);
                    return false;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.o = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.f214718n = sQLiteCursorDriver;
        this.f214720q = null;
        this.f214717m = sQLiteQuery;
        this.f214716l = sQLiteQuery.e;
    }
}
