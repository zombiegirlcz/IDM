package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f199569c = new t();

    private t() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `invest_orders` (`id` TEXT NOT NULL, `compound_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `completed_at` INTEGER, `side` TEXT NOT NULL, `state` TEXT NOT NULL, `order_type` TEXT NOT NULL, `currency_pair_first` TEXT NOT NULL, `currency_pair_second` TEXT NOT NULL, `symbol` TEXT, `stock_order` TEXT, `commodity_order` TEXT, PRIMARY KEY(`id`))");
    }
}
