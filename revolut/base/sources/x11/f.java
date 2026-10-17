package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f301840c = new f();

    private f() {
        super(105, 106);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `created_date` INTEGER DEFAULT NULL");
    }
}
