package l4d;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f192100c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `plain_watchlist_items`", "CREATE TABLE IF NOT EXISTS `plain_watchlist_items`(\n`asset_type_key` TEXT NOT NULL, \n`fromCode` TEXT NOT NULL, \n`toCode` TEXT NOT NULL, \n`added_time` INTEGER NOT NULL, \n`sync_state` TEXT NOT NULL, \nPRIMARY KEY(`asset_type_key`, `fromCode`, `toCode`)\n)");
    }
}
