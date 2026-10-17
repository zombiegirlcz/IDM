package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f225080c = new c();

    private c() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER table `rewards_details` ADD COLUMN `is_web_view_supported` INTEGER NOT NULL DEFAULT 1");
    }
}
