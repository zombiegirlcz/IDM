package zq9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f324426c = new j();

    private j() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("ALTER TABLE payments_groups ADD COLUMN `lastFullSettlementDate` INTEGER DEFAULT NULL");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
