package yf0;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends Migration {
    public g() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `pigeon_tree_node` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `parentKey` TEXT NOT NULL, `title` TEXT NOT NULL, `hidden` INTEGER NOT NULL, `deeplink` TEXT, `language` TEXT NOT NULL, `icon` TEXT, PRIMARY KEY(`key`, `parentKey`, `language`))", "CREATE INDEX IF NOT EXISTS `index_pigeon_tree_node_key` ON `pigeon_tree_node` (`key`)", "CREATE INDEX IF NOT EXISTS `index_pigeon_tree_node_parentKey` ON `pigeon_tree_node` (`parentKey`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_pigeon_tree_node_language` ON `pigeon_tree_node` (`language`)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `pigeon_node_details` (`key` TEXT NOT NULL, `language` TEXT NOT NULL, `json` TEXT NOT NULL, PRIMARY KEY(`key`, `language`))");
    }
}
