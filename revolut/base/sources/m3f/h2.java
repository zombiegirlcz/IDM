package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h2 f202421c = new h2();

    private h2() {
        super(38, 39);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `portfolios` ADD COLUMN `offboardedDate` INTEGER");
    }
}
