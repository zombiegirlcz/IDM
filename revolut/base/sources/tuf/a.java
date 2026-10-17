package tuf;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends Migration {
    public a() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `activationTimeoutDate` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `activationAvailableDate` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `activationProviderParams_maxAttempts` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `activationProviderParams_activationTimeout` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `purchased_transit_tickets` ADD COLUMN `activationProviderParams_activationBlockDuration` INTEGER DEFAULT NULL");
    }
}
