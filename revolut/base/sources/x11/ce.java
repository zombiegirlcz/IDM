package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ce extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ce f301814c = new ce();

    private ce() {
        super(89, 90);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `pricing_plan` ADD COLUMN `featureGroups` TEXT NOT NULL DEFAULT '[]'");
    }
}
