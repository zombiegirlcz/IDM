package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f202443c = new l0();

    private l0() {
        super(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 135);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `fund_stats` (\n                    `ref` TEXT NOT NULL,\n                    `annualReturn` TEXT,\n                    `risk` INTEGER,\n                    PRIMARY KEY(`ref`)\n                )\n            ");
    }
}
