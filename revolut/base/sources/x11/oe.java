package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oe extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe f301960c = new oe();

    private oe() {
        super(99, 100);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `charities` ADD COLUMN `campaign` TEXT DEFAULT NULL");
    }
}
