package xxk;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ayk.b f309552c;

    public a() {
        super(2, 3);
        this.f309552c = new ayk.b();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_trading_onboarding_kyc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `nationalities` TEXT, `usTaxPayer` INTEGER, `rtlBrexitOptIn` INTEGER, `documents` TEXT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_trading_onboarding_kyc` (`id`,`nationalities`,`usTaxPayer`,`rtlBrexitOptIn`,`documents`) SELECT `id`,`nationalities`,`usTaxPayer`,`rtlBrexitOptIn`,`documents` FROM `trading_onboarding_kyc`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `trading_onboarding_kyc`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_trading_onboarding_kyc` RENAME TO `trading_onboarding_kyc`");
        this.f309552c.onPostMigrate(sQLiteConnection);
    }
}
