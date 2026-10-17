package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f114842c = new c();

    private c() {
        super(12, 13);
    }

    public static void a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `" + str + "` ADD COLUMN `interest_payment_observationDate` TEXT DEFAULT null");
        StringBuilder sbV = y.v(y.v(y.v(y.v(y.v(y.v(y.v(y.v(y.v(y.v(y.v(new StringBuilder("ALTER TABLE `"), str, "` ADD COLUMN `early_redemption_symbol` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `early_redemption_ref` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `early_redemption_paymentDate` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `early_redemption_observationDate` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `early_redemption_amountPerNominal` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `early_redemption_isConfirmed` INTEGER DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `maturity_redemption_symbol` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `maturity_redemption_ref` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `maturity_redemption_paymentDate` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `maturity_redemption_observationDate` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `maturity_redemption_amountPerNominal` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `");
        sbV.append(str);
        sbV.append("` ADD COLUMN `maturity_redemption_isConfirmed` INTEGER DEFAULT null");
        supportSQLiteDatabase.execSQL(sbV.toString());
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        a(db8, "calendar_events");
        a(db8, "upcoming_events");
    }
}
