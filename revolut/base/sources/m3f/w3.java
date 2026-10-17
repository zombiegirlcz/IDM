package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class w3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w3 f202512c = new w3();

    private w3() {
        super(75, 76);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `instruments` ADD COLUMN `requiredProducts` TEXT DEFAULT NULL", "ALTER TABLE `instruments` ADD COLUMN `typeSpecificProperties` TEXT DEFAULT NULL");
    }
}
