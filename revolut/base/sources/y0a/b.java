package y0a;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.payments.splitbill.impl.data.database.SplitBillDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitBillDatabase_Impl f310170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplitBillDatabase_Impl splitBillDatabase_Impl) {
        super(1, "96561678f81cb4f08599efcff3a9404e", "5b975304cc22f694c98cc1b1bc0ca79d");
        this.f310170a = splitBillDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `split_bill` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `currency` TEXT NOT NULL, `comment` TEXT, `dateTime` INTEGER NOT NULL, `items` TEXT NOT NULL, `money_requests` TEXT NOT NULL, `owner_referralCode` TEXT NOT NULL, `owner_firstName` TEXT NOT NULL, `owner_lastName` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96561678f81cb4f08599efcff3a9404e')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `split_bill`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = SplitBillDatabase_Impl.f;
        this.f310170a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, 1));
        map.put("dateTime", new TableInfo.Column("dateTime", "INTEGER", true, 0, null, 1));
        map.put("items", new TableInfo.Column("items", "TEXT", true, 0, null, 1));
        map.put("money_requests", new TableInfo.Column("money_requests", "TEXT", true, 0, null, 1));
        map.put("owner_referralCode", new TableInfo.Column("owner_referralCode", "TEXT", true, 0, null, 1));
        map.put("owner_firstName", new TableInfo.Column("owner_firstName", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("split_bill", map, o.s(map, "owner_lastName", new TableInfo.Column("owner_lastName", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "split_bill");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("split_bill(com.revolut.feature.payments.splitbill.impl.data.database.entity.SplitBillEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
