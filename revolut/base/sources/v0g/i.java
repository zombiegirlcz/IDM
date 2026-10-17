package v0g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f284851c = new i();

    private i() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `travel_experiences_recent_search_destination` ADD COLUMN `destinationType` TEXT");
    }
}
