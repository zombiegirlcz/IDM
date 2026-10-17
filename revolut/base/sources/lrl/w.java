package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f199572c = new w();

    private w() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `invest_orders` ADD COLUMN `margin_order` TEXT DEFAULT NULL");
    }
}
