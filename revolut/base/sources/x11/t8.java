package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t8 f302017c = new t8();

    private t8() {
        super(314, 315);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `institutions` ADD COLUMN `tags` TEXT NOT NULL DEFAULT ''");
    }
}
