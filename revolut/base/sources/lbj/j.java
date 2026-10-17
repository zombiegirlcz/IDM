package lbj;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.crypto_deposits.impl.database.CryptoDepositsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CryptoDepositsDatabase_Impl f193700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CryptoDepositsDatabase_Impl cryptoDepositsDatabase_Impl) {
        super(10, "35928a7d87c897ea2b839719def68926", "51216e9cdd2f16c9bdae8a4ca732bbaa");
        this.f193700a = cryptoDepositsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `crypto_action_required_deposits` (`groupId` TEXT NOT NULL, `state` TEXT, `returnDetails` TEXT, `returnReasons` TEXT, `blockchainDetails` TEXT, `requiredFields` TEXT, `counterparty_id` TEXT, `counterparty_address` TEXT, `counterparty_state` TEXT, `counterparty_hostingType` TEXT, `counterparty_hostingVerification` TEXT, `counterparty_hostingPlatform` TEXT, `counterparty_ownershipState` TEXT, `counterparty_ownershipMethod` TEXT, `counterparty_ownershipPayload` TEXT, `counterparty_updatedDate` INTEGER, `counterparty_details_type` TEXT, `counterparty_details_name` TEXT, `counterparty_details_surname` TEXT, `counterparty_details_business_registration_number` TEXT, `counterparty_details_address_country` TEXT, `counterparty_details_address_city` TEXT, `counterparty_details_address_line1` TEXT, `counterparty_details_address_line2` TEXT, PRIMARY KEY(`groupId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '35928a7d87c897ea2b839719def68926')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `crypto_action_required_deposits`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = CryptoDepositsDatabase_Impl.f100051j;
        this.f193700a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(24);
        map.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 1, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, 1));
        map.put("returnDetails", new TableInfo.Column("returnDetails", "TEXT", false, 0, null, 1));
        map.put("returnReasons", new TableInfo.Column("returnReasons", "TEXT", false, 0, null, 1));
        map.put("blockchainDetails", new TableInfo.Column("blockchainDetails", "TEXT", false, 0, null, 1));
        map.put("requiredFields", new TableInfo.Column("requiredFields", "TEXT", false, 0, null, 1));
        map.put("counterparty_id", new TableInfo.Column("counterparty_id", "TEXT", false, 0, null, 1));
        map.put("counterparty_address", new TableInfo.Column("counterparty_address", "TEXT", false, 0, null, 1));
        map.put("counterparty_state", new TableInfo.Column("counterparty_state", "TEXT", false, 0, null, 1));
        map.put("counterparty_hostingType", new TableInfo.Column("counterparty_hostingType", "TEXT", false, 0, null, 1));
        map.put("counterparty_hostingVerification", new TableInfo.Column("counterparty_hostingVerification", "TEXT", false, 0, null, 1));
        map.put("counterparty_hostingPlatform", new TableInfo.Column("counterparty_hostingPlatform", "TEXT", false, 0, null, 1));
        map.put("counterparty_ownershipState", new TableInfo.Column("counterparty_ownershipState", "TEXT", false, 0, null, 1));
        map.put("counterparty_ownershipMethod", new TableInfo.Column("counterparty_ownershipMethod", "TEXT", false, 0, null, 1));
        map.put("counterparty_ownershipPayload", new TableInfo.Column("counterparty_ownershipPayload", "TEXT", false, 0, null, 1));
        map.put("counterparty_updatedDate", new TableInfo.Column("counterparty_updatedDate", "INTEGER", false, 0, null, 1));
        map.put("counterparty_details_type", new TableInfo.Column("counterparty_details_type", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_name", new TableInfo.Column("counterparty_details_name", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_surname", new TableInfo.Column("counterparty_details_surname", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_business_registration_number", new TableInfo.Column("counterparty_details_business_registration_number", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_address_country", new TableInfo.Column("counterparty_details_address_country", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_address_city", new TableInfo.Column("counterparty_details_address_city", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_address_line1", new TableInfo.Column("counterparty_details_address_line1", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("crypto_action_required_deposits", map, o.s(map, "counterparty_details_address_line2", new TableInfo.Column("counterparty_details_address_line2", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "crypto_action_required_deposits");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("crypto_action_required_deposits(com.revolut.retail.feature.crypto_deposits.impl.database.CryptoActionRequiredDepositEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
