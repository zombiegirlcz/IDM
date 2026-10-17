package xqj;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BudgetingDatabase_Impl f308183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BudgetingDatabase_Impl budgetingDatabase_Impl) {
        super(5, "cbe28346d3a4ae36d341f9601a136ffd", "7912207f8c47102cd577e62b9f39f7bf");
        this.f308183a = budgetingDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `budget_entity` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `amount` INTEGER NOT NULL, `walletId` TEXT NOT NULL, `currency` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `categoryTag` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `cached_budget` (`categoryTag` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, PRIMARY KEY(`categoryTag`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cbe28346d3a4ae36d341f9601a136ffd')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `budget_entity`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `cached_budget`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = BudgetingDatabase_Impl.k;
        this.f308183a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(8);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("startDate", new TableInfo.Column("startDate", "TEXT", true, 0, null, 1));
        map.put("endDate", new TableInfo.Column("endDate", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("budget_entity", map, o.s(map, "categoryTag", new TableInfo.Column("categoryTag", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "budget_entity");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("budget_entity(com.revolut.retail.feature.impl.budgeting.database.models.BudgetEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(3);
        map2.put("categoryTag", new TableInfo.Column("categoryTag", "TEXT", true, 1, null, 1));
        map2.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("cached_budget", map2, o.s(map2, "currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "cached_budget");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("cached_budget(com.revolut.retail.feature.impl.budgeting.database.models.CachedBudgetEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
