package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f301818c = new d2();

    private d2() {
        super(169, 170);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `institutions` ", "DELETE FROM `institution_branch` ", "CREATE TABLE IF NOT EXISTS `institutions` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `logoType` TEXT NOT NULL, `status` TEXT NOT NULL, `paymentInitiation` INTEGER NOT NULL, `requirements` TEXT NOT NULL, `system` TEXT NOT NULL, `recurrenceSupported` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
