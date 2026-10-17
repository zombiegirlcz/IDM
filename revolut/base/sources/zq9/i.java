package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f324425c = new i();

    private i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("ALTER TABLE payments_groups ADD COLUMN `analytics_totalSpentByGroup` INTEGER");
        database.execSQL("ALTER TABLE payments_groups ADD COLUMN `analytics_totalSpentByCurrentMember` INTEGER");
        database.execSQL("ALTER TABLE payments_groups ADD COLUMN `analytics_currency` TEXT");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
