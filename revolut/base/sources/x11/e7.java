package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e7 f301832c = new e7();

    private e7() {
        super(276, 277);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `vault_taxes` TEXT DEFAULT NULL");
    }
}
