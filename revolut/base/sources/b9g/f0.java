package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f13758c = new f0();

    private f0() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("ALTER table `hotels_location` ADD COLUMN `description` TEXT NOT NULL DEFAULT ''");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
