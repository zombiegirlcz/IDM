package yx1;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f317537c = new j();

    private j() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `wero_contacts` ", "CREATE TABLE IF NOT EXISTS `wero_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `isRequestEnabled` INTEGER NOT NULL, PRIMARY KEY(`idValue`))");
    }
}
