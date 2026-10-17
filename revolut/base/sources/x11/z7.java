package x11;

import android.database.DatabaseUtils;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z7 f302083c = new z7();

    private z7() {
        super(293, 294);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `excluded_transactions` ADD COLUMN `excludedAmount` TEXT DEFAULT NULL");
        db8.execSQL("ALTER TABLE `excluded_transactions` ADD COLUMN `excludedType` TEXT DEFAULT " + DatabaseUtils.sqlEscapeString("FULLY_EXCLUDED"));
    }
}
