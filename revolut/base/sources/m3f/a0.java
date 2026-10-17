package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f202377c = new a0();

    private a0() {
        super(124, ISO781611.SMT_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `fund_details` (\n    `ref` TEXT NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `exchange` TEXT NOT NULL,\n    `fundHouse` TEXT NOT NULL,\n    `fundHouseManager` TEXT,\n    `performance` TEXT,\n    `documents` TEXT,\n    `keyDetails` TEXT,\n    `exposure` TEXT,\n    `concentration` TEXT,\n    PRIMARY KEY(`ref`)\n)");
    }
}
