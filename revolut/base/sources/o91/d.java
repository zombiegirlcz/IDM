package o91;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f223056c = new d();

    private d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `pae_payment_overridden_names_table` (\n    `id` TEXT NOT NULL,\n    `overriddenName` TEXT NOT NULL,\n    PRIMARY KEY(`id`),\n    FOREIGN KEY(`id`) REFERENCES `pae_direct_debits_table`(`id`) ON DELETE CASCADE\n)");
    }
}
