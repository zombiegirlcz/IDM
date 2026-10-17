package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f199646c = new v();

    private v() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `sales` ADD COLUMN `original_sale_details` TEXT");
    }
}
