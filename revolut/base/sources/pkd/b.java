package pkd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f237001c = new b();

    private b() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `slot_actions` (`id` TEXT NOT NULL, `screen_id` TEXT NOT NULL, `campaign_id` TEXT NOT NULL, `slot_type` TEXT NOT NULL, `action_type` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `params_hermes_id` TEXT, PRIMARY KEY(`id`))");
    }
}
