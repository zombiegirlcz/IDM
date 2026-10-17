package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xb extends Migration {
    public xb() {
        super(60, 61);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `revolut_card_sca_counters` (`cardId` TEXT NOT NULL, `contactlessCounter` TEXT NOT NULL, PRIMARY KEY(`cardId`))");
    }
}
