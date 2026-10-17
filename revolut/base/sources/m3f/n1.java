package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f202456c = new n1();

    private n1() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `index_details`(`index` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `shortDescription` TEXT NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`index`))");
    }
}
