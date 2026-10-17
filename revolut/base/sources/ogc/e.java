package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f225082c = new e();

    private e() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER table `rewards_details` ADD COLUMN `only_manual_activation` INTEGER NOT NULL DEFAULT 0", "ALTER table `rewards_short` ADD COLUMN `only_manual_activation` INTEGER NOT NULL DEFAULT 0");
    }
}
