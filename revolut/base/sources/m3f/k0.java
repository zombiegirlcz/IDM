package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f202437c = new k0();

    private k0() {
        super(133, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DELETE FROM `instrument_details`\n WHERE `type` IN ('ETC', 'ETN')");
    }
}
