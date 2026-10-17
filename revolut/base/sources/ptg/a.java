package ptg;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WealthAccountClosureDatabase_Impl f239673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WealthAccountClosureDatabase_Impl wealthAccountClosureDatabase_Impl) {
        super(1, "cf19d2c9c0dcf548fc8bc2edcbd5e9a9", "3e638e467f7dba271ad9619317c4735d");
        this.f239673a = wealthAccountClosureDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `account_closure_backend_requested` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `portfolio_id` TEXT NOT NULL, `terminationRequested` INTEGER NOT NULL, `title` TEXT, `subtitle` TEXT, `content` TEXT, `legacy` INTEGER NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `account_closure_progress` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `portfolioId` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `source` TEXT NOT NULL, `tradingLegalEntityId` TEXT NOT NULL, `reason` TEXT, `currentStep` TEXT NOT NULL, `pendingSteps` TEXT NOT NULL, `completedSteps` TEXT NOT NULL, `blocked` INTEGER NOT NULL, `estimatedCompletionDate` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_account_closure_progress_portfolioId` ON `account_closure_progress` (`portfolioId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf19d2c9c0dcf548fc8bc2edcbd5e9a9')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `account_closure_backend_requested`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `account_closure_progress`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = WealthAccountClosureDatabase_Impl.k;
        this.f239673a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(7);
        map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        map.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 0, null, 1));
        map.put("terminationRequested", new TableInfo.Column("terminationRequested", "INTEGER", true, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
        map.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, 1));
        map.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("account_closure_backend_requested", map, o.s(map, "legacy", new TableInfo.Column("legacy", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "account_closure_backend_requested");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("account_closure_backend_requested(com.revolut.feature.wealth.account_closure.impl.data.database.model.AccountClosureBackendRequestedEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(13);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 0, null, 1));
        map2.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map2.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map2.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
        map2.put("tradingLegalEntityId", new TableInfo.Column("tradingLegalEntityId", "TEXT", true, 0, null, 1));
        map2.put("reason", new TableInfo.Column("reason", "TEXT", false, 0, null, 1));
        map2.put("currentStep", new TableInfo.Column("currentStep", "TEXT", true, 0, null, 1));
        map2.put("pendingSteps", new TableInfo.Column("pendingSteps", "TEXT", true, 0, null, 1));
        map2.put("completedSteps", new TableInfo.Column("completedSteps", "TEXT", true, 0, null, 1));
        map2.put("blocked", new TableInfo.Column("blocked", "INTEGER", true, 0, null, 1));
        HashSet hashSetS = o.s(map2, "estimatedCompletionDate", new TableInfo.Column("estimatedCompletionDate", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_account_closure_progress_portfolioId", true, Arrays.asList("portfolioId"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("account_closure_progress", map2, hashSetS, hashSet);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "account_closure_progress");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("account_closure_progress(com.revolut.feature.wealth.account_closure.impl.data.database.model.AccountClosureProgressEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
