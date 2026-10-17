package l4d;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f192102c = new c();

    private c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `alert_items` (\n    `id` TEXT NOT NULL, \n    `from_id` TEXT NOT NULL, \n    `from_name` TEXT NOT NULL, \n    `from_type_key` TEXT NOT NULL, \n    `to` TEXT NOT NULL, \n    `target_rate` TEXT NOT NULL, \n    `created_at` INTEGER NOT NULL, \n    `completed_at` INTEGER, \n    PRIMARY KEY(`id`)\n)");
    }
}
