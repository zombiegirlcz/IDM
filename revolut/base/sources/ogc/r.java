package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f225095c = new r();

    private r() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS `merchant` (\n                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n                `merchant_id` TEXT NOT NULL, \n                `merchant_name` TEXT NOT NULL, \n                `reward_id` TEXT NOT NULL)\n            ", "\n            CREATE UNIQUE INDEX IF NOT EXISTS `index_merchant_merchant_id_merchant_name_reward_id` ON `merchant` (`merchant_id`, `merchant_name`, `reward_id`)\n            ");
    }
}
