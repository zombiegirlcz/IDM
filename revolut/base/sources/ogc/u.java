package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f225098c = new u();

    private u() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER table `rewards_details` ADD COLUMN `claim_type` TEXT DEFAULT NULL");
    }
}
