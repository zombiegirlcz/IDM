package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f324429c = new m();

    private m() {
        super(21, 22);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE payments_groups ADD COLUMN `analytics_totalSpentByGroupByCurrency` TEXT DEFAULT NULL");
            database.execSQL("ALTER TABLE payments_groups ADD COLUMN `analytics_totalSpentByCurrentMemberByCurrency` TEXT DEFAULT NULL");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
