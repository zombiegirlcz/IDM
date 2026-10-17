package o91;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f223053c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `pae_direct_debits_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `missingAddress` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        database.execSQL("CREATE TABLE IF NOT EXISTS `pae_scheduled_payments_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `frequency` TEXT NOT NULL, PRIMARY KEY(`id`))");
        database.execSQL("CREATE TABLE IF NOT EXISTS `pae_incoming_payments_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
