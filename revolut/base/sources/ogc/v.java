package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f225099c = new v();

    private v() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER table `rewards_details` ADD COLUMN `activationis_activated` INTEGER", "ALTER table `rewards_short` ADD COLUMN `activationis_activated` INTEGER");
    }
}
