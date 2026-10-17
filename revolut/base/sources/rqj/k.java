package rqj;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.impl.budget.database.BudgetHistoryDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BudgetHistoryDatabase_Impl f256569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BudgetHistoryDatabase_Impl budgetHistoryDatabase_Impl) {
        super(1, "31458179da9dfad9ec11d690e83b7f57", "171fc7ba2c3f1d0f1d042087cfff8685");
        this.f256569a = budgetHistoryDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `budget_history_snapshot` (`walletId` TEXT NOT NULL, `effectiveFrom` INTEGER NOT NULL, `effectiveTo` INTEGER, `currency` TEXT NOT NULL, `overallAmount` INTEGER NOT NULL, `categories` TEXT NOT NULL, `cycle_type` TEXT NOT NULL, `cycle_weekDay` TEXT, `cycle_startDay` INTEGER, `cycle_behaviour` TEXT, PRIMARY KEY(`walletId`, `effectiveFrom`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '31458179da9dfad9ec11d690e83b7f57')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `budget_history_snapshot`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = BudgetHistoryDatabase_Impl.f101498j;
        this.f256569a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(10);
        map.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
        map.put("effectiveFrom", new TableInfo.Column("effectiveFrom", "INTEGER", true, 2, null, 1));
        map.put("effectiveTo", new TableInfo.Column("effectiveTo", "INTEGER", false, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("overallAmount", new TableInfo.Column("overallAmount", "INTEGER", true, 0, null, 1));
        map.put("categories", new TableInfo.Column("categories", "TEXT", true, 0, null, 1));
        map.put("cycle_type", new TableInfo.Column("cycle_type", "TEXT", true, 0, null, 1));
        map.put("cycle_weekDay", new TableInfo.Column("cycle_weekDay", "TEXT", false, 0, null, 1));
        map.put("cycle_startDay", new TableInfo.Column("cycle_startDay", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("budget_history_snapshot", map, o.s(map, "cycle_behaviour", new TableInfo.Column("cycle_behaviour", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "budget_history_snapshot");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("budget_history_snapshot(com.revolut.retail.feature.impl.budget.database.entity.BudgetHistorySnapshotEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
