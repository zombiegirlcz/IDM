package l4d;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f192104c = new e();

    private e() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `watchlists` (\n    watchlist_id TEXT NOT NULL PRIMARY KEY,\n    name TEXT NOT NULL,\n    is_default INTEGER NOT NULL,\n    display_order INTEGER NOT NULL\n)", "CREATE TABLE `plain_multiple_watchlists_items`(\n    `watchlist_id` TEXT NOT NULL,\n    `asset_type_key` TEXT NOT NULL, \n    `from_code` TEXT NOT NULL, \n    `to_code` TEXT NOT NULL, \n    `added_time` INTEGER NOT NULL, \n    `sync_state` TEXT NOT NULL, \n    PRIMARY KEY(`asset_type_key`, `from_code`, `to_code`, `watchlist_id`)\n)");
    }
}
