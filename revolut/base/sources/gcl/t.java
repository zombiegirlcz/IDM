package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f142548c = new t();

    private t() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `instrument_drawdown` (\n    `ref` TEXT NOT NULL,\n    `timespan` TEXT NOT NULL,\n    `interval` TEXT NOT NULL,\n    `drawdownMax` TEXT NOT NULL,\n    `referenceDrawdownMax` TEXT,\n    PRIMARY KEY(`ref`, `timespan`)\n)");
    }
}
