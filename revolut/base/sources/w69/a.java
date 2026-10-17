package w69;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Migration {
    public a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "ALTER TABLE `inbox_item` ADD COLUMN `messageId` TEXT DEFAULT NULL", "ALTER TABLE `inbox_item` ADD COLUMN `campaignId` TEXT DEFAULT NULL", "ALTER TABLE `inbox_item` ADD COLUMN `pushId` TEXT DEFAULT NULL");
        y.y(supportSQLiteDatabase, "ALTER TABLE `inbox_item` ADD COLUMN `tileId` TEXT DEFAULT NULL");
    }
}
