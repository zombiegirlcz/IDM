package tuf;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.transport.impl.data.database.TransportDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransportDatabase_Impl f274606a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransportDatabase_Impl transportDatabase_Impl) {
        super(5, "5f69f8f21c2ea9fa763241cfbedea972", "86dc63c62215efc844e56c39336b3800");
        this.f274606a = transportDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `purchased_transit_tickets` (`id` TEXT NOT NULL, `ticketOfferId` TEXT NOT NULL, `ticketNumber` TEXT, `state` TEXT NOT NULL, `title` TEXT NOT NULL, `zones` TEXT NOT NULL, `tags` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `locationName` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `pocketId` TEXT, `generalInputs` TEXT NOT NULL, `passengerInputs` TEXT NOT NULL, `transactionId` TEXT, `isDiscounted` INTEGER, `activationParams` TEXT NOT NULL, `activationTimeoutDate` INTEGER, `activationAvailableDate` INTEGER, `activatedAt` INTEGER, `controlNumber` TEXT, `canBeUsedForExtension` INTEGER, `ticketType_key` TEXT NOT NULL, `ticketType_name` TEXT NOT NULL, `ticketType_category` TEXT NOT NULL, `ticketType_displayOrder` INTEGER NOT NULL, `description_default` TEXT NOT NULL, `description_short` TEXT, `description_extra` TEXT, `provider_name` TEXT NOT NULL, `provider_logo_type` TEXT NOT NULL, `provider_logo_value` TEXT NOT NULL, `price_amount` INTEGER, `price_currency` TEXT, `qrCode_type` TEXT, `qrCode_value` TEXT, `validity_from` INTEGER, `validity_to` INTEGER, `activationProviderParams_maxAttempts` INTEGER, `activationProviderParams_activationTimeout` INTEGER, `activationProviderParams_activationBlockDuration` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5f69f8f21c2ea9fa763241cfbedea972')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `purchased_transit_tickets`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TransportDatabase_Impl.f92506j;
        this.f274606a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(40);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("ticketOfferId", new TableInfo.Column("ticketOfferId", "TEXT", true, 0, null, 1));
        map.put("ticketNumber", new TableInfo.Column("ticketNumber", "TEXT", false, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("zones", new TableInfo.Column("zones", "TEXT", true, 0, null, 1));
        map.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("locationName", new TableInfo.Column("locationName", "TEXT", true, 0, null, 1));
        map.put("countryCode", new TableInfo.Column("countryCode", "TEXT", true, 0, null, 1));
        map.put("pocketId", new TableInfo.Column("pocketId", "TEXT", false, 0, null, 1));
        map.put("generalInputs", new TableInfo.Column("generalInputs", "TEXT", true, 0, null, 1));
        map.put("passengerInputs", new TableInfo.Column("passengerInputs", "TEXT", true, 0, null, 1));
        map.put("transactionId", new TableInfo.Column("transactionId", "TEXT", false, 0, null, 1));
        map.put("isDiscounted", new TableInfo.Column("isDiscounted", "INTEGER", false, 0, null, 1));
        map.put("activationParams", new TableInfo.Column("activationParams", "TEXT", true, 0, null, 1));
        map.put("activationTimeoutDate", new TableInfo.Column("activationTimeoutDate", "INTEGER", false, 0, null, 1));
        map.put("activationAvailableDate", new TableInfo.Column("activationAvailableDate", "INTEGER", false, 0, null, 1));
        map.put("activatedAt", new TableInfo.Column("activatedAt", "INTEGER", false, 0, null, 1));
        map.put("controlNumber", new TableInfo.Column("controlNumber", "TEXT", false, 0, null, 1));
        map.put("canBeUsedForExtension", new TableInfo.Column("canBeUsedForExtension", "INTEGER", false, 0, null, 1));
        map.put("ticketType_key", new TableInfo.Column("ticketType_key", "TEXT", true, 0, null, 1));
        map.put("ticketType_name", new TableInfo.Column("ticketType_name", "TEXT", true, 0, null, 1));
        map.put("ticketType_category", new TableInfo.Column("ticketType_category", "TEXT", true, 0, null, 1));
        map.put("ticketType_displayOrder", new TableInfo.Column("ticketType_displayOrder", "INTEGER", true, 0, null, 1));
        map.put("description_default", new TableInfo.Column("description_default", "TEXT", true, 0, null, 1));
        map.put("description_short", new TableInfo.Column("description_short", "TEXT", false, 0, null, 1));
        map.put("description_extra", new TableInfo.Column("description_extra", "TEXT", false, 0, null, 1));
        map.put("provider_name", new TableInfo.Column("provider_name", "TEXT", true, 0, null, 1));
        map.put("provider_logo_type", new TableInfo.Column("provider_logo_type", "TEXT", true, 0, null, 1));
        map.put("provider_logo_value", new TableInfo.Column("provider_logo_value", "TEXT", true, 0, null, 1));
        map.put("price_amount", new TableInfo.Column("price_amount", "INTEGER", false, 0, null, 1));
        map.put("price_currency", new TableInfo.Column("price_currency", "TEXT", false, 0, null, 1));
        map.put("qrCode_type", new TableInfo.Column("qrCode_type", "TEXT", false, 0, null, 1));
        map.put("qrCode_value", new TableInfo.Column("qrCode_value", "TEXT", false, 0, null, 1));
        map.put("validity_from", new TableInfo.Column("validity_from", "INTEGER", false, 0, null, 1));
        map.put("validity_to", new TableInfo.Column("validity_to", "INTEGER", false, 0, null, 1));
        map.put("activationProviderParams_maxAttempts", new TableInfo.Column("activationProviderParams_maxAttempts", "INTEGER", false, 0, null, 1));
        map.put("activationProviderParams_activationTimeout", new TableInfo.Column("activationProviderParams_activationTimeout", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("purchased_transit_tickets", map, o.s(map, "activationProviderParams_activationBlockDuration", new TableInfo.Column("activationProviderParams_activationBlockDuration", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "purchased_transit_tickets");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("purchased_transit_tickets(com.revolut.feature.transport.impl.data.database.transit.PurchasedTransitTicketEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
