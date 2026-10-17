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
public final class q4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f301975c;
    public final yk0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SQLiteDatabase f301976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, yk0.a databaseSessionProvider) {
        super(220, 221);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        this.f301975c = context;
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

    public static void b(SupportSQLiteDatabase supportSQLiteDatabase, boolean z) {
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
        Object objInvoke;
        SQLiteDatabase sQLiteDatabase;
        Intrinsics.checkNotNullParameter(originalDb, "originalDb");
        x1.n nVar = new x1.n(1);
        originalDb.beginTransaction();
        try {
            objInvoke = nVar.invoke(originalDb);
            originalDb.setTransactionSuccessful();
        } catch (Throwable th10) {
            try {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                originalDb.endTransaction();
                objInvoke = null;
            } finally {
                originalDb.endTransaction();
            }
        }
        List list = (List) objInvoke;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        a(originalDb, new v77.a(zhm.u.c("DROP TABLE IF EXISTS \"trading_price_alerts\""), 27));
        if (!(this.f301976g != null)) {
            try {
                this.f301976g = SQLiteDatabase.s(this.f301975c.getDatabasePath("trading_database").getAbsolutePath(), this.f.getToken());
            } catch (Throwable th11) {
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var2);
                sQLiteDatabase = null;
            }
        }
        sQLiteDatabase = this.f301976g;
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            a(sQLiteDatabase, new v77.a(list, 26));
        } finally {
            try {
            } finally {
            }
        }
    }
}
