package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c8 f301809c = new c8();

    private c8() {
        super(296, 297);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `transaction_custom_category`", "DROP TABLE IF EXISTS `transaction_predefined_category`", "CREATE TABLE IF NOT EXISTS `transaction_custom_category` (\n    `id` TEXT NOT NULL,\n    `baseDirection` TEXT NOT NULL,\n    `actualDirection` TEXT NOT NULL,\n    `walletId` TEXT NOT NULL,\n    `title` TEXT NOT NULL,\n    `image` TEXT NOT NULL,\n    `color` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `transaction_predefined_category` (\n    `id` TEXT NOT NULL,\n    `baseDirection` TEXT NOT NULL,\n    `actualDirection` TEXT NOT NULL,\n    `walletId` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
    }
}
