package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f301816c = new d0();

    private d0() {
        super(ISO781611.SMT_TAG, 126);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `card_mandate_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `card_mandate_confirmed` INTEGER DEFAULT NULL");
    }
}
