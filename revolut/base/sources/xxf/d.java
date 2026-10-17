package xxf;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f309514c = new d();

    private d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `travel_document` (\n    `product` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `uri` TEXT NOT NULL,\n    PRIMARY KEY(`product`, `type`)\n)");
    }
}
