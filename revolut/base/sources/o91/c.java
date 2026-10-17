package o91;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f223055c = new c();

    private c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `pae_payment_address_table` (\n    `id` TEXT NOT NULL,\n    `postcode` TEXT NOT NULL,\n    `street` TEXT NOT NULL,\n    `city` TEXT NOT NULL,\n    `country` TEXT NOT NULL,\n    PRIMARY KEY(`id`),\n    FOREIGN KEY(`id`) REFERENCES `pae_direct_debits_table`(`id`) ON DELETE CASCADE\n)");
    }
}
