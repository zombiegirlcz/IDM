package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f225086c = new i();

    private i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER table `rewards_details` DROP COLUMN `is_web_view_supported`", "ALTER table `rewards_details` ADD COLUMN `loyalty_steps` TEXT");
    }
}
