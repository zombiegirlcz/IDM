package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f13748c = new a0();

    private a0() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `hotels_filter` (`type` TEXT NOT NULL, `options` TEXT NOT NULL, PRIMARY KEY(`type`))", "CREATE TABLE IF NOT EXISTS `hotels_price_range` (`id` TEXT NOT NULL, `minRange` TEXT NOT NULL, `maxRange` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
