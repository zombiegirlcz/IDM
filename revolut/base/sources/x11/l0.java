package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f301912c = new l0();

    private l0() {
        super(ISO781611.CREATION_DATE_AND_TIME_TAG, 132);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `charities` ADD COLUMN `availability_area` TEXT NOT NULL DEFAULT ''", "ALTER TABLE `charities` ADD COLUMN `donors_count` INTEGER NOT NULL DEFAULT 0");
    }
}
