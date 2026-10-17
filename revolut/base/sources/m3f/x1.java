package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class x1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f202516c = new x1();

    private x1() {
        super(29, 30);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `portfolios` ADD COLUMN `onboardedDate` INTEGER");
    }
}
