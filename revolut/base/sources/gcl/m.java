package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f142541c = new m();

    private m() {
        super(21, 22);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `mutual_fund_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `exchange` TEXT NOT NULL,\n    `documents` TEXT,\n    PRIMARY KEY(`ref`)\n)");
    }
}
