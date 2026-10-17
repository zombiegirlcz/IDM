package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class he extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final he f301875c = new he();

    private he() {
        super(92, 93);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER table `instruments` ADD COLUMN `allSymbols` TEXT NOT NULL DEFAULT ''", "\n                UPDATE instruments SET allSymbols='[\"' || symbol || '\"]'\n            ");
    }
}
