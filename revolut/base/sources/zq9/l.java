package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f324428c = new l();

    private l() {
        super(20, 21);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE payments_groups_bills ADD COLUMN `lineItems` TEXT DEFAULT NULL");
            database.execSQL("ALTER TABLE payments_groups_bills ADD COLUMN `receiptImageUri` TEXT DEFAULT NULL");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
