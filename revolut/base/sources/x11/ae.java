package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ae f301790c = new ae();

    private ae() {
        super(87, 88);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER table `trading_news` ADD COLUMN `faviconImageLink` TEXT", "ALTER table `trading_news` ADD COLUMN `providerImageLink` TEXT");
    }
}
