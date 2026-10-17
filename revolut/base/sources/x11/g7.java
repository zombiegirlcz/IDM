package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g7 f301858c = new g7();

    private g7() {
        super(278, 279);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `accrued_loyalty_points_amount` REAL DEFAULT NULL");
    }
}
