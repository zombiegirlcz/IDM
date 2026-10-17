package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f202419c = new h0();

    private h0() {
        super(130, ISO781611.CREATION_DATE_AND_TIME_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `etf_stats` ADD COLUMN `riskRating` TEXT");
    }
}
