package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f202418c = new h();

    private h() {
        super(107, LDSFile.EF_DG12_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `instrument_details` ADD COLUMN `stateReason` TEXT DEFAULT NULL", "ALTER TABLE `etf_details` ADD COLUMN `stateReason` TEXT DEFAULT NULL", "ALTER TABLE `cfd_details` ADD COLUMN `stateReason` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `bond_details` ADD COLUMN `state_reason` TEXT DEFAULT NULL", "ALTER TABLE `instrument_details` ADD COLUMN `delistDate` INT DEFAULT NULL", "ALTER TABLE `etf_details` ADD COLUMN `delistDate` INT DEFAULT NULL", "ALTER TABLE `cfd_details` ADD COLUMN `delistDate` INT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `bond_details` ADD COLUMN `delist_date` INT DEFAULT NULL");
    }
}
