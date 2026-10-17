package dge;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.tab.accounts.impl.data.AccountsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccountsDatabase_Impl f114651a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountsDatabase_Impl accountsDatabase_Impl) {
        super(3, "7e2e7233f31e86205d368b32f2d20ab4", "04cf917b7dec68c251c874067131fa60");
        this.f114651a = accountsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `account_notification_info` (`accountId` TEXT NOT NULL, `productId` TEXT NOT NULL, `lastSeenTimestamp` INTEGER NOT NULL, `lastActionTimestamp` INTEGER NOT NULL, `lastTransactionTimestamp` INTEGER NOT NULL, `unreadCounter` INTEGER NOT NULL, PRIMARY KEY(`accountId`, `productId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7e2e7233f31e86205d368b32f2d20ab4')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `account_notification_info`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = AccountsDatabase_Impl.f89582j;
        this.f114651a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(6);
        map.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 1, null, 1));
        map.put("productId", new TableInfo.Column("productId", "TEXT", true, 2, null, 1));
        map.put("lastSeenTimestamp", new TableInfo.Column("lastSeenTimestamp", "INTEGER", true, 0, null, 1));
        map.put("lastActionTimestamp", new TableInfo.Column("lastActionTimestamp", "INTEGER", true, 0, null, 1));
        map.put("lastTransactionTimestamp", new TableInfo.Column("lastTransactionTimestamp", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("account_notification_info", map, o.s(map, "unreadCounter", new TableInfo.Column("unreadCounter", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "account_notification_info");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("account_notification_info(com.revolut.feature.tab.accounts.impl.data.model.AccountNotificationInfoEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
