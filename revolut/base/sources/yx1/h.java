package yx1;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f317535c = new h();

    private h() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `multibanco_contacts` ", "CREATE TABLE IF NOT EXISTS `multibanco_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `phone` TEXT NOT NULL, `photoUri` TEXT, `state` TEXT NOT NULL, `contactName` TEXT, PRIMARY KEY(`idValue`))");
    }
}
