package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v6 f302037c = new v6();

    private v6() {
        super(269, 270);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `payerName` TEXT DEFAULT NULL");
    }
}
