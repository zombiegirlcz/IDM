package v0g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f284846c = new d();

    private d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DELETE FROM `travel_experiences_booking`", "ALTER TABLE `travel_experiences_booking` ADD COLUMN `createdDate` TEXT NOT NULL");
    }
}
