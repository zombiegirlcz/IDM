package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class m7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m7 f301929c = new m7();

    private m7() {
        super(282, 283);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `recipient_type` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `recipient_businessName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `sender_type` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `sender_businessName` TEXT DEFAULT NULL");
    }
}
