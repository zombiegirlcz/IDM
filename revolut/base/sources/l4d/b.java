package l4d;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f192101c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `converter_items`(\n    `asset_type_key` TEXT NOT NULL, \n    `asset_code` TEXT NOT NULL, \n    `amount` INTEGER NOT NULL, \n    `weight` INTEGER NOT NULL, \n    PRIMARY KEY(`asset_type_key`, `asset_code`)\n)");
    }
}
