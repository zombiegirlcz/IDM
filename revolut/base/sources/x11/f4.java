package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f4 f301844c = new f4();

    private f4() {
        super(211, Constants.TAG_PCI_PED_CHECKSUM);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_fx_rare_currency_fee` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_fx_rare_currency_percent` REAL DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_fx_weekend_fee` INTEGER DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_fx_weekend_percent` REAL DEFAULT NULL");
    }
}
