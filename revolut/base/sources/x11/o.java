package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f301948c = new o();

    private o() {
        super(112, 113);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instruments` ADD COLUMN `sortOrder` INTEGER NOT NULL DEFAULT -1");
    }
}
