package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class le extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le f301921c = new le();

    private le() {
        super(96, 97);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `insurance` ADD COLUMN `docsAcknowledged` INTEGER NOT NULL DEFAULT 1");
    }
}
