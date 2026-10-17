package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f279184c = new d();

    private d() {
        super(13, 14);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `vaults` ADD COLUMN `recurringPayments` TEXT DEFAULT NULL");
    }
}
