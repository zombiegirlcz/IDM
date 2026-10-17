package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b7 f301799c = new b7();

    private b7() {
        super(273, 274);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `accrued_loyalty_points` INTEGER DEFAULT NULL");
    }
}
