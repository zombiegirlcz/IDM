package rdd;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.shared.vaults.domain.impl.data.database.VaultsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VaultsDatabase_Impl f253411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VaultsDatabase_Impl vaultsDatabase_Impl) {
        super(27, "d621c29a03b7f2c6a8925ab622be01d1", "86ddd5aada14edfa5d57e1150fca726d");
        this.f253411a = vaultsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `vaults` (`id` TEXT NOT NULL, `savingsAccountId` TEXT, `state` TEXT NOT NULL, `stateReason` TEXT, `type` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `goal` INTEGER NOT NULL, `banner` TEXT, `underlyingId` TEXT NOT NULL, `pocketInfo` TEXT, `depositInfo` TEXT, `members` TEXT, `estimate` INTEGER, `deadline` INTEGER, `recurringPayments` TEXT, `accountType` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER, `workflowId` TEXT, `pendingActivationReason` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `vaults_account_type_states` (`accountType` TEXT NOT NULL, PRIMARY KEY(`accountType`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd621c29a03b7f2c6a8925ab622be01d1')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `vaults`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `vaults_account_type_states`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = VaultsDatabase_Impl.f86690j;
        this.f253411a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(20);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("savingsAccountId", new TableInfo.Column("savingsAccountId", "TEXT", false, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("stateReason", new TableInfo.Column("stateReason", "TEXT", false, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, 1));
        map.put("goal", new TableInfo.Column("goal", "INTEGER", true, 0, null, 1));
        map.put("banner", new TableInfo.Column("banner", "TEXT", false, 0, null, 1));
        map.put("underlyingId", new TableInfo.Column("underlyingId", "TEXT", true, 0, null, 1));
        map.put("pocketInfo", new TableInfo.Column("pocketInfo", "TEXT", false, 0, null, 1));
        map.put("depositInfo", new TableInfo.Column("depositInfo", "TEXT", false, 0, null, 1));
        map.put("members", new TableInfo.Column("members", "TEXT", false, 0, null, 1));
        map.put("estimate", new TableInfo.Column("estimate", "INTEGER", false, 0, null, 1));
        map.put("deadline", new TableInfo.Column("deadline", "INTEGER", false, 0, null, 1));
        map.put("recurringPayments", new TableInfo.Column("recurringPayments", "TEXT", false, 0, null, 1));
        map.put("accountType", new TableInfo.Column("accountType", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", false, 0, null, 1));
        map.put("workflowId", new TableInfo.Column("workflowId", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("vaults", map, o.s(map, "pendingActivationReason", new TableInfo.Column("pendingActivationReason", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "vaults");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("vaults(com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(1);
        TableInfo tableInfo3 = new TableInfo("vaults_account_type_states", map2, o.s(map2, "accountType", new TableInfo.Column("accountType", "TEXT", true, 1, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "vaults_account_type_states");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("vaults_account_type_states(com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultsAccountTypeStateEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
