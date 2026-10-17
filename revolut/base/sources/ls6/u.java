package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f199645c = new u();

    private u() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `invoice_tax_rates` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `percentage` REAL NOT NULL,PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
