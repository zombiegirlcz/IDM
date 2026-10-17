package b72;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.apm.multibanco.impl.data.database.MultibancoDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultibancoDatabase_Impl f12867a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MultibancoDatabase_Impl multibancoDatabase_Impl) {
        super(3, "620d8d4219247c85ce6477bee3c6110e", "ab3e2de175311887d12a9d181a3c756e");
        this.f12867a = multibancoDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `apm_multibanco_withdrawal_code` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `code` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `revolutCardId` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `expirationDate` INTEGER NOT NULL, `transactionId` TEXT, `amount_amount` INTEGER NOT NULL, `amount_currency` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '620d8d4219247c85ce6477bee3c6110e')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `apm_multibanco_withdrawal_code`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = MultibancoDatabase_Impl.f62560j;
        this.f12867a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(11);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, 1));
        map.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, 1));
        map.put("revolutCardId", new TableInfo.Column("revolutCardId", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map.put("expirationDate", new TableInfo.Column("expirationDate", "INTEGER", true, 0, null, 1));
        map.put("transactionId", new TableInfo.Column("transactionId", "TEXT", false, 0, null, 1));
        map.put("amount_amount", new TableInfo.Column("amount_amount", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("apm_multibanco_withdrawal_code", map, o.s(map, "amount_currency", new TableInfo.Column("amount_currency", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "apm_multibanco_withdrawal_code");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("apm_multibanco_withdrawal_code(com.revolut.feature.apm.multibanco.impl.data.database.withdrawal.MultibancoWithdrawalCodeEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
