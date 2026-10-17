package u5d;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.shared.autoinvest.impl.database.AutoInvestDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutoInvestDatabase_Impl f277446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutoInvestDatabase_Impl autoInvestDatabase_Impl) {
        super(4, "b2f0f4656a0c67c334b5a31e811fd442", "1ff2626936095efd78a696fa9e65c7c3");
        this.f277446a = autoInvestDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `auto_invests` (`id` TEXT NOT NULL, `isEnabled` INTEGER NOT NULL, `targetId` TEXT, `targetType` TEXT, `targetName` TEXT, `dailySpendAmount` INTEGER, `dailySpendCcy` TEXT, `percentage` REAL, `multiplier` REAL, `strategy` TEXT, `ownerId` TEXT NOT NULL, `scope` TEXT, `createdDate` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b2f0f4656a0c67c334b5a31e811fd442')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `auto_invests`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = AutoInvestDatabase_Impl.k;
        this.f277446a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(13);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("isEnabled", new TableInfo.Column("isEnabled", "INTEGER", true, 0, null, 1));
        map.put("targetId", new TableInfo.Column("targetId", "TEXT", false, 0, null, 1));
        map.put("targetType", new TableInfo.Column("targetType", "TEXT", false, 0, null, 1));
        map.put("targetName", new TableInfo.Column("targetName", "TEXT", false, 0, null, 1));
        map.put("dailySpendAmount", new TableInfo.Column("dailySpendAmount", "INTEGER", false, 0, null, 1));
        map.put("dailySpendCcy", new TableInfo.Column("dailySpendCcy", "TEXT", false, 0, null, 1));
        map.put("percentage", new TableInfo.Column("percentage", "REAL", false, 0, null, 1));
        map.put("multiplier", new TableInfo.Column("multiplier", "REAL", false, 0, null, 1));
        map.put("strategy", new TableInfo.Column("strategy", "TEXT", false, 0, null, 1));
        map.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, 1));
        map.put("scope", new TableInfo.Column("scope", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("auto_invests", map, o.s(map, "createdDate", new TableInfo.Column("createdDate", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "auto_invests");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("auto_invests(com.revolut.feature.shared.autoinvest.impl.database.entity.AutoInvestEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
