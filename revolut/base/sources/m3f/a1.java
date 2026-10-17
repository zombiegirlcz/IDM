package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f202378c = new a1();

    private a1() {
        super(148, 149);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `instrument_stats` ADD COLUMN `listStatus` TEXT DEFAULT null");
    }
}
