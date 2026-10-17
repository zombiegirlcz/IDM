package rdd;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.shared.vaults.domain.impl.data.database.TransactionsExtraDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionsExtraDatabase_Impl f253410a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TransactionsExtraDatabase_Impl transactionsExtraDatabase_Impl) {
        super(2, "61d825fd085c2ef56b3a70b4dbe251a4", "71b84c2979f806eb15766e88d742b625");
        this.f253410a = transactionsExtraDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `moneybox_transactions` (`id` TEXT NOT NULL, `accruesInterestSince` INTEGER, `executedDate` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '61d825fd085c2ef56b3a70b4dbe251a4')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `moneybox_transactions`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TransactionsExtraDatabase_Impl.f86689j;
        this.f253410a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(3);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("accruesInterestSince", new TableInfo.Column("accruesInterestSince", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("moneybox_transactions", map, o.s(map, "executedDate", new TableInfo.Column("executedDate", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "moneybox_transactions");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("moneybox_transactions(com.revolut.feature.shared.vaults.domain.impl.data.database.models.TransactionsExtraEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
