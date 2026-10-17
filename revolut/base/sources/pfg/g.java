package pfg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f235584c = new g();

    private g() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `travel_miles_topup` (`id` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `travel_miles_transactions` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `idType` TEXT, `source` TEXT, `topUpId` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`topUpId`) REFERENCES `travel_miles_topup`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
