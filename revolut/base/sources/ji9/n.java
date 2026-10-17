package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f174402c = new n();

    private n() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `limits` ADD COLUMN `hasUpfrontPayment` INTEGER NOT NULL DEFAULT '1'");
    }
}
