package v0g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f284848c = new f();

    private f() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `travel_experiences_recently_viewed_dropoff` (`experienceId` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `parameters` TEXT NOT NULL, PRIMARY KEY(`experienceId`))");
    }
}
