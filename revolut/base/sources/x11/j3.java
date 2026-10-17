package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j3 f301892c = new j3();

    private j3() {
        super(195, 196);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `topup_match` (`source_group_id` TEXT NOT NULL, `destination_group_id` TEXT NOT NULL, PRIMARY KEY(`source_group_id`))");
    }
}
