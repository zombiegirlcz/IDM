package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q4 f202477c = new q4();

    private q4() {
        super(93, 94);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `instrument_tickers` ADD COLUMN `halted` INTEGER NOT NULL DEFAULT 0");
    }
}
