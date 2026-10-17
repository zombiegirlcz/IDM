package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f142529c = new a();

    private a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `note_details` (\n    `ref` TEXT NOT NULL, \n    `symbol` TEXT NOT NULL, \n    `stock_exchange_code` TEXT NOT NULL, \n    `description` TEXT, \n    `lifecycle` TEXT NOT NULL, \n    `coupon` TEXT, \n    `call` TEXT, \n    `capital_protection` TEXT, \n    `final_payout` TEXT, \n    `key_drivers` TEXT NOT NULL, \n    `underlying_assets` TEXT NOT NULL, \n    `issuer` TEXT NOT NULL, \n    PRIMARY KEY(`ref`)\n)");
    }
}
