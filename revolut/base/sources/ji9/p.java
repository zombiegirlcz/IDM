package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f174404c = new p();

    private p() {
        super(24, 25);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `repayments` ADD COLUMN `isOverLimit` INTEGER NOT NULL DEFAULT 0");
    }
}
