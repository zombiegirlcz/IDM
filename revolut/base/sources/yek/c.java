package yek;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f313032c = new c();

    private c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE pricing_plan", "CREATE TABLE IF NOT EXISTS pricing_plan (`id` TEXT NOT NULL, `code` TEXT NOT NULL, `currencyCode` TEXT NOT NULL, `min_period` TEXT, `billing` TEXT NOT NULL, `features` TEXT NOT NULL, `featureGroups` TEXT NOT NULL, `card_designs` TEXT NOT NULL, `products` TEXT NOT NULL, `state` TEXT, `queuePosition` INTEGER, `priority` INTEGER NOT NULL, `cardTier` INTEGER NOT NULL, `cashback` TEXT, `is_default` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
