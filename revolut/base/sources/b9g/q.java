package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f13770c = new q();

    private q() {
        super(25, 26);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `hotels_promotions` ADD COLUMN `requirements_checkInFrom` TEXT", "ALTER TABLE `hotels_promotions` ADD COLUMN `requirements_checkOutTo` TEXT");
    }
}
