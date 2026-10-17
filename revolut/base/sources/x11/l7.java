package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7 f301919c = new l7();

    private l7() {
        super(281, 282);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `warrant_reason` TEXT DEFAULT NULL");
    }
}
