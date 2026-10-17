package qra;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PushToCardDatabase_Impl f248677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PushToCardDatabase_Impl pushToCardDatabase_Impl) {
        super(4, "33901eb0890a57c03fbf0eb42ff83947", "e707d5fa537a4dd4b4b5e0e98a556f37");
        this.f248677a = pushToCardDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `card_owners` (`id` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `label` TEXT, `email` TEXT, `type` TEXT NOT NULL, `card` TEXT NOT NULL, `twoFaRequired` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `card_owners_stats` (`id` TEXT NOT NULL, `transactionsNumber` INTEGER NOT NULL, `latestTransactionTimestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '33901eb0890a57c03fbf0eb42ff83947')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `card_owners`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `card_owners_stats`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PushToCardDatabase_Impl.k;
        this.f248677a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 0, null, 1));
        map.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, 1));
        map.put("label", new TableInfo.Column("label", "TEXT", false, 0, null, 1));
        map.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("card", new TableInfo.Column("card", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("card_owners", map, o.s(map, "twoFaRequired", new TableInfo.Column("twoFaRequired", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "card_owners");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("card_owners(com.revolut.feature.push_to_card.impl.storage.database.entity.CardOwnerEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(3);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("transactionsNumber", new TableInfo.Column("transactionsNumber", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("card_owners_stats", map2, o.s(map2, "latestTransactionTimestamp", new TableInfo.Column("latestTransactionTimestamp", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "card_owners_stats");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("card_owners_stats(com.revolut.feature.push_to_card.impl.storage.database.entity.CardOwnerStatsEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
