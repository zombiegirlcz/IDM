package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f301778c = new a0();

    private a0() {
        super(122, 123);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DELETE FROM vaults", "DROP TABLE product_savings", "CREATE TABLE IF NOT EXISTS `product_savings` (\n                `id` TEXT NOT NULL, \n                `depositInfo` TEXT NOT NULL, \n                `protectionInfo` TEXT, \n                `documents` TEXT NOT NULL, \n                `onboarding` TEXT NOT NULL, \n                PRIMARY KEY(`id`))\n        ");
    }
}
