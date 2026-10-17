package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f202438c = new k1();

    private k1() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `collections` ADD COLUMN `additionalInfoLink` TEXT");
    }
}
