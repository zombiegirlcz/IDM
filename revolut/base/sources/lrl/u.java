package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f199570c = new u();

    private u() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `invest_orders` ADD COLUMN `instrument_type` TEXT NOT NULL DEFAULT 'UNSPECIFIED'");
    }
}
