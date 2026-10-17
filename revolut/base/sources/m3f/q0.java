package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f202473c = new q0();

    private q0() {
        super(139, 140);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP table IF EXISTS `portfolio_headers`");
    }
}
