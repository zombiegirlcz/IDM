package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class r6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r6 f301993c = new r6();

    private r6() {
        super(265, 266);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `collection_trading_order_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `collection_trading_avatar` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `collection_trading_collection_name` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `collection_trading_collection_key` TEXT DEFAULT NULL");
    }
}
