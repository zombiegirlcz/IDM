package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q6 f301978c = new q6();

    private q6() {
        super(264, 265);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `vault_fee_total_amount` TEXT DEFAULT NULL");
    }
}
