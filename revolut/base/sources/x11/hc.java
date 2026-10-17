package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hc extends Migration {
    public hc() {
        super(65, 66);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `instruments_watchlist` (`instrumentId` TEXT NOT NULL, PRIMARY KEY(`instrumentId`), FOREIGN KEY(`instrumentId`) REFERENCES `instruments`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
