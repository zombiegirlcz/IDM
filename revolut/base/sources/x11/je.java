package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class je extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final je f301898c = new je();

    private je() {
        super(94, 95);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `updatedAt` INTEGER NOT NULL DEFAULT 0");
    }
}
