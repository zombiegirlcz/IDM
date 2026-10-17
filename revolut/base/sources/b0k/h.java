package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f11686c = new h();

    private h() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DELETE FROM `scoped_symbols`", "ALTER TABLE `scoped_symbols` ADD COLUMN `baseCurrency` TEXT NOT NULL DEFAULT ''", "ALTER TABLE `scoped_symbols` ADD COLUMN `name` TEXT");
    }
}
