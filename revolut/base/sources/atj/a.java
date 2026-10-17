package atj;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9084c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS 'income_sorters'", "DROP TABLE IF EXISTS 'income_sorter_executions'");
    }
}
