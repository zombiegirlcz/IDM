package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o2 f202463c = new o2();

    private o2() {
        super(44, 45);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `etf_details` ADD COLUMN `kidUrl` TEXT");
    }
}
