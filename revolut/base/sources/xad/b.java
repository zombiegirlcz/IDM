package xad;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OrderInitiationPageDatabase_Impl f303872a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OrderInitiationPageDatabase_Impl orderInitiationPageDatabase_Impl) {
        super(3, "5968c0b3db39b768fedef208c2b71eee", "8a14b776fcd470cbf872f5e62128f83c");
        this.f303872a = orderInitiationPageDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `order_initiation_pages` (`id` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `state` TEXT NOT NULL, `product` TEXT NOT NULL, `title` TEXT NOT NULL, `amount` INTEGER, `currency` TEXT, `defaultCurrency` TEXT, `paymentLink` TEXT NOT NULL, `limit` INTEGER, `completedOrders` INTEGER, `customFieldDefinitions` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5968c0b3db39b768fedef208c2b71eee')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `order_initiation_pages`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = OrderInitiationPageDatabase_Impl.k;
        this.f303872a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(12);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("product", new TableInfo.Column("product", "TEXT", true, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("amount", new TableInfo.Column("amount", "INTEGER", false, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", false, 0, null, 1));
        map.put("defaultCurrency", new TableInfo.Column("defaultCurrency", "TEXT", false, 0, null, 1));
        map.put("paymentLink", new TableInfo.Column("paymentLink", "TEXT", true, 0, null, 1));
        map.put("limit", new TableInfo.Column("limit", "INTEGER", false, 0, null, 1));
        map.put("completedOrders", new TableInfo.Column("completedOrders", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("order_initiation_pages", map, o.s(map, "customFieldDefinitions", new TableInfo.Column("customFieldDefinitions", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "order_initiation_pages");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("order_initiation_pages(com.revolut.feature.shared.order_initiation.impl.data.database.model.OrderInitiationPageEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
