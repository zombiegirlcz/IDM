package gc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d, hc.b, c {
    public static final wb.c f = new wb.c("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f142291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f142292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a f142293c;
    public final a d;
    public final phm.a e;

    public j(ic.a aVar, ic.a aVar2, a aVar3, l lVar, phm.a aVar4) {
        this.f142291a = lVar;
        this.f142292b = aVar;
        this.f142293c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, zb.j jVar) {
        StringBuilder sb6 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f320780a, String.valueOf(jc.a.a(jVar.f320782c))));
        byte[] bArr = jVar.f320781b;
        if (bArr != null) {
            sb6.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb6.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb6.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String k(Iterable iterable) {
        StringBuilder sb6 = new StringBuilder("(");
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            sb6.append(((b) it8.next()).f142279a);
            if (it8.hasNext()) {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    public static Object l(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f142291a.close();
    }

    public final SQLiteDatabase d() {
        l lVar = this.f142291a;
        Objects.requireNonNull(lVar);
        ic.a aVar = this.f142293c;
        long jB = aVar.b();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.b() >= ((long) this.d.f142278c) + jB) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object g(h hVar) {
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            Object objApply = hVar.apply(sQLiteDatabaseD);
            sQLiteDatabaseD.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, zb.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lF = f(sQLiteDatabase, jVar);
        if (lF == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lF.toString()}, null, null, null, String.valueOf(i)), new bg.a(this, 2, arrayList, jVar));
        return arrayList;
    }

    public final void i(final long j2, final cc.d dVar, final String str) {
        g(new h() { // from class: gc.g
            @Override // gc.h, kfm.o, androidx.arch.core.util.Function
            public final Object apply(Object obj2) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                cc.d dVar2 = dVar;
                String string = Integer.toString(dVar2.getNumber());
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j3 = j2;
                    if (z) {
                        sQLiteDatabase.execSQL(p.a.n(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(dVar2.getNumber())});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(dVar2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j3));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th10) {
                    cursorRawQuery.close();
                    throw th10;
                }
            }
        });
    }

    public final Object j(hc.a aVar) {
        SQLiteDatabase sQLiteDatabaseD = d();
        ic.a aVar2 = this.f142293c;
        long jB = aVar2.b();
        while (true) {
            try {
                sQLiteDatabaseD.beginTransaction();
                try {
                    Object objExecute = aVar.execute();
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseD.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar2.b() >= ((long) this.d.f142278c) + jB) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
