package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f174394c = new f();

    private f() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `plans` ADD COLUMN `feeType` TEXT NOT NULL DEFAULT 'DEFAULT'");
    }
}
