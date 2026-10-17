package ka6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f182434c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "ALTER table `charity` ADD COLUMN `featured` INTEGER NOT NULL DEFAULT 0", "ALTER table `charity` ADD COLUMN `rank` INTEGER NOT NULL DEFAULT 1000");
    }
}
