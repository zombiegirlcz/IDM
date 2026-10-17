package ce0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.revolut.core.data.db.migration.MigrationRequiredException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SupportHelper;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SupportHelper f23337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f23339c;
    public final bl0.f d;

    public g(SupportHelper delegate, String dbName, Context context, bl0.f databaseEncryptionMigrator) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigrator, "databaseEncryptionMigrator");
        this.f23337a = delegate;
        this.f23338b = dbName;
        this.f23339c = context;
        this.d = databaseEncryptionMigrator;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23337a.close();
    }

    public final f d() {
        String str = this.f23338b;
        SupportHelper supportHelper = this.f23337a;
        try {
            return new f(supportHelper.getReadableDatabase(), str);
        } catch (SQLiteException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            this.f23339c.deleteDatabase(supportHelper.getName());
            this.d.h(e);
            return new f(supportHelper.getReadableDatabase(), str);
        }
    }

    public final f f() {
        String str = this.f23338b;
        SupportHelper supportHelper = this.f23337a;
        try {
            return new f(supportHelper.getWritableDatabase(), str);
        } catch (SQLiteException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            this.f23339c.deleteDatabase(supportHelper.getName());
            this.d.h(e);
            return new f(supportHelper.getWritableDatabase(), str);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: getDatabaseName */
    public final String getName() {
        return this.f23337a.getName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getReadableDatabase() {
        try {
            return d();
        } catch (MigrationRequiredException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, e, h0Var);
            this.d.f();
            return d();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        try {
            return f();
        } catch (MigrationRequiredException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, e, h0Var);
            this.d.f();
            return f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f23337a.setWriteAheadLoggingEnabled(z);
    }
}
