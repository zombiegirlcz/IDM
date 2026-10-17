package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f142542c = new n();

    private n() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `note_details` ADD COLUMN `loss_probability` TEXT DEFAULT null", "ALTER TABLE `note_details` ADD COLUMN `reference_asset` TEXT DEFAULT null");
    }
}
