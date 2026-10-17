package nr8;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.junior_transfer_request.impl.db.JuniorTransferRequestDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JuniorTransferRequestDatabase_Impl f218596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JuniorTransferRequestDatabase_Impl juniorTransferRequestDatabase_Impl) {
        super(3, "d0fb25de4196860381203806344fa5e9", "e6958dc8029e3e8004bc9322c1c900ab");
        this.f218596a = juniorTransferRequestDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `junior_transfer_request` (`id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `transactionWalletId` TEXT NOT NULL, `transactionPocketId` TEXT NOT NULL, `state` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `comment` TEXT, `gifUrl` TEXT, `sender` TEXT NOT NULL, `recipient` TEXT NOT NULL, `reason_code` TEXT, `reason_limit_amount` INTEGER, `reason_limit_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd0fb25de4196860381203806344fa5e9')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `junior_transfer_request`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = JuniorTransferRequestDatabase_Impl.f77458j;
        this.f218596a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("transactionId", new TableInfo.Column("transactionId", "TEXT", true, 0, null, 1));
        map.put("transactionWalletId", new TableInfo.Column("transactionWalletId", "TEXT", true, 0, null, 1));
        map.put("transactionPocketId", new TableInfo.Column("transactionPocketId", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, 1));
        map.put("gifUrl", new TableInfo.Column("gifUrl", "TEXT", false, 0, null, 1));
        map.put("sender", new TableInfo.Column("sender", "TEXT", true, 0, null, 1));
        map.put("recipient", new TableInfo.Column("recipient", "TEXT", true, 0, null, 1));
        map.put("reason_code", new TableInfo.Column("reason_code", "TEXT", false, 0, null, 1));
        map.put("reason_limit_amount", new TableInfo.Column("reason_limit_amount", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("junior_transfer_request", map, o.s(map, "reason_limit_currency", new TableInfo.Column("reason_limit_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "junior_transfer_request");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("junior_transfer_request(com.revolut.feature.junior_transfer_request.impl.model.entity.JuniorTransferRequestEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
