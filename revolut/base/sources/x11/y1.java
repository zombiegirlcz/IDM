package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f302063c = new y1();

    private y1() {
        super(Constants.TAG_GPI_VERSION, Constants.TAG_EMVL3_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `institutions` ", "DELETE FROM `institution_branch` ", "CREATE TABLE IF NOT EXISTS `institutions` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `logoType` TEXT NOT NULL, `status` TEXT NOT NULL, `paymentInitiation` INTEGER NOT NULL, `system` TEXT NOT NULL, `recurrenceSupported` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
