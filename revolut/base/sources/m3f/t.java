package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f202490c = new t();

    private t() {
        super(LDSFile.EF_DG4_TAG, LDSFile.EF_SOD_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP table IF EXISTS `last_onboarded_portfolio_status`");
    }
}
