package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class yd extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yd f302074c = new yd();

    private yd() {
        super(85, 86);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER table `recurring_payments` ADD COLUMN `transferReason` TEXT", "ALTER TABLE `transactions` ADD COLUMN `recipient_username` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `recipient_country` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `sender_username` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `sender_country` TEXT DEFAULT NULL");
    }
}
