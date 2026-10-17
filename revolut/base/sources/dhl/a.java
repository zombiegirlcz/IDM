package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f114840c = new a();

    private a() {
        super(10, 11);
    }

    public static void a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `" + str + "` ADD COLUMN `bond_coupon_symbol` TEXT DEFAULT null");
        StringBuilder sbV = y.v(y.v(new StringBuilder("ALTER TABLE `"), str, "` ADD COLUMN `bond_coupon_ref` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `bond_coupon_paymentDate` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `");
        sbV.append(str);
        sbV.append("` ADD COLUMN `bond_coupon_couponAmount` TEXT DEFAULT null");
        supportSQLiteDatabase.execSQL(sbV.toString());
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        a(db8, "calendar_events");
        a(db8, "upcoming_events");
    }
}
