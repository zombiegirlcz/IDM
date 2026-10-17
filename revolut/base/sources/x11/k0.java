package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f301899c = new k0();

    private k0() {
        super(130, ISO781611.CREATION_DATE_AND_TIME_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE institutions;", "CREATE TABLE IF NOT EXISTS `institutions` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `logoType` TEXT NOT NULL, `status` TEXT NOT NULL, `paymentInitiation` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_institution_branch_institution_id` ON `institution_branch` (`institution_id`)");
    }
}
