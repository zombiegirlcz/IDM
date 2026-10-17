package x11;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class y2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f302064c;
    public final yk0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SQLiteDatabase f302065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Context context, yk0.a databaseSessionProvider) {
        super(186, 187);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        this.f302064c = context;
        this.f = databaseSessionProvider;
    }

    public static void a(SupportSQLiteDatabase supportSQLiteDatabase, Function1 function1) {
        supportSQLiteDatabase.beginTransaction();
        try {
            function1.invoke(supportSQLiteDatabase);
            supportSQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable th10) {
            try {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    public static List b(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Object objInvoke;
        wsg.j jVar = new wsg.j(str, 10);
        supportSQLiteDatabase.beginTransaction();
        try {
            objInvoke = jVar.invoke(supportSQLiteDatabase);
            supportSQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable th10) {
            try {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                supportSQLiteDatabase.endTransaction();
                objInvoke = null;
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
        List list = (List) objInvoke;
        return list == null ? zhm.f0.f322471a : list;
    }

    public static void c(SupportSQLiteDatabase supportSQLiteDatabase, boolean z) {
        if (z) {
            return;
        }
        try {
            supportSQLiteDatabase.close();
        } catch (Throwable th10) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        }
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase originalDb) {
        SQLiteDatabase sQLiteDatabase;
        Intrinsics.checkNotNullParameter(originalDb, "originalDb");
        List listB = b(originalDb, "SELECT * from \"portfolios\"");
        List listB2 = b(originalDb, "SELECT * from \"holdings\"");
        a(originalDb, new v77.a(zhm.v.k("DROP TABLE IF EXISTS \"portfolios\"", "DROP TABLE IF EXISTS \"holdings\""), 25));
        if (!(this.f302065g != null)) {
            try {
                this.f302065g = SQLiteDatabase.s(this.f302064c.getDatabasePath("trading_database").getAbsolutePath(), this.f.getToken());
            } catch (Throwable th10) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                sQLiteDatabase = null;
            }
        }
        sQLiteDatabase = this.f302065g;
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            a(sQLiteDatabase, new eh1.d(listB2, 12, listB));
        } finally {
            try {
            } finally {
            }
        }
    }
}
