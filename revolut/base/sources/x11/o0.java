package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f301949c = new o0();

    private o0() {
        super(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 135);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `pricing_plan` ADD COLUMN `is_default` INTEGER NOT NULL DEFAULT 0");
    }
}
