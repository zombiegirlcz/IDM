package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ke extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ke f301910c = new ke();

    private ke() {
        super(95, 96);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `contact` ADD COLUMN `username` TEXT");
    }
}
