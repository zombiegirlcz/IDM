package qo5;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.crypto.withdraw.impl.database.CryptoWithdrawDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CryptoWithdrawDatabase_Impl f248050a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CryptoWithdrawDatabase_Impl cryptoWithdrawDatabase_Impl) {
        super(13, "e60ba1838b9fa1bb5f1b36a52c6c4211", "f4098914b0f6be7a5767175f8db7ba7d");
        this.f248050a = cryptoWithdrawDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `crypto_addresses` (`id` TEXT NOT NULL, `description` TEXT, `currency` TEXT NOT NULL, `address` TEXT NOT NULL, `destinationTag` TEXT, `hasTransactions` INTEGER NOT NULL, `status` TEXT NOT NULL, `blockchain` TEXT, `flags` TEXT NOT NULL DEFAULT '[]', `isHidden` INTEGER NOT NULL, `recipientDetails` TEXT, `isRevolutAddress` INTEGER NOT NULL, `limits` TEXT, `createdDate` INTEGER NOT NULL, `counterparty` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `crypto_wallets` (`id` TEXT NOT NULL, `address` TEXT NOT NULL, `addressType` TEXT NOT NULL, `recipientDetails` TEXT, `linkedBeneficiaries` TEXT NOT NULL, `isHidden` INTEGER NOT NULL, `status` TEXT NOT NULL, `limits` TEXT, `label` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e60ba1838b9fa1bb5f1b36a52c6c4211')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `crypto_addresses`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `crypto_wallets`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = CryptoWithdrawDatabase_Impl.f71150j;
        this.f248050a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(15);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, 1));
        map.put("destinationTag", new TableInfo.Column("destinationTag", "TEXT", false, 0, null, 1));
        map.put("hasTransactions", new TableInfo.Column("hasTransactions", "INTEGER", true, 0, null, 1));
        map.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map.put("blockchain", new TableInfo.Column("blockchain", "TEXT", false, 0, null, 1));
        map.put("flags", new TableInfo.Column("flags", "TEXT", true, 0, "'[]'", 1));
        map.put("isHidden", new TableInfo.Column("isHidden", "INTEGER", true, 0, null, 1));
        map.put("recipientDetails", new TableInfo.Column("recipientDetails", "TEXT", false, 0, null, 1));
        map.put("isRevolutAddress", new TableInfo.Column("isRevolutAddress", "INTEGER", true, 0, null, 1));
        map.put("limits", new TableInfo.Column("limits", "TEXT", false, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("crypto_addresses", map, prk.o.s(map, "counterparty", new TableInfo.Column("counterparty", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "crypto_addresses");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("crypto_addresses(com.revolut.feature.crypto.withdraw.impl.database.CryptoAddressEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(9);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, 1));
        map2.put("addressType", new TableInfo.Column("addressType", "TEXT", true, 0, null, 1));
        map2.put("recipientDetails", new TableInfo.Column("recipientDetails", "TEXT", false, 0, null, 1));
        map2.put("linkedBeneficiaries", new TableInfo.Column("linkedBeneficiaries", "TEXT", true, 0, null, 1));
        map2.put("isHidden", new TableInfo.Column("isHidden", "INTEGER", true, 0, null, 1));
        map2.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map2.put("limits", new TableInfo.Column("limits", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("crypto_wallets", map2, prk.o.s(map2, "label", new TableInfo.Column("label", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "crypto_wallets");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("crypto_wallets(com.revolut.feature.crypto.withdraw.impl.database.CryptoWalletEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
