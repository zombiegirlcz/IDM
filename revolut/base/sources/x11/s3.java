package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class s3 extends Migration {
    public s3() {
        super(200, 201);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `pocket_origin_type` TEXT DEFAULT NULL", "               UPDATE 'transactions'\n               SET 'pocket_origin_type' = CASE WHEN \n                   pocket_type = \"EXTERNAL\" THEN \"EXTERNAL\"\n                   ELSE NULL\n               END", "               UPDATE 'transactions'\n               SET 'pocket_type' = CASE WHEN \n                   pocket_type = \"EXTERNAL\" THEN \"UNKNOWN\"\n                   ELSE pocket_type\n               END");
    }
}
