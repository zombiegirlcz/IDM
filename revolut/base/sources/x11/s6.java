package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s6 f302002c = new s6();

    private s6() {
        super(266, 267);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `vault_nav_price` INTEGER DEFAULT NULL");
    }
}
