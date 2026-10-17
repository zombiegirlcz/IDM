package sxb;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RevPointsDatabase_Impl f266393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevPointsDatabase_Impl revPointsDatabase_Impl) {
        super(14, "37940ae7464f51296d3f6b985ae32c21", "0096145817fe3cc759f24dd68b4f31ed");
        this.f266393a = revPointsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rev_points_transaction` (`pointsTransactionId` TEXT NOT NULL, `type` TEXT NOT NULL, `points` REAL NOT NULL, `createdDate` INTEGER NOT NULL, `coreTransactionId` TEXT, `product` TEXT, `state` TEXT NOT NULL, `description` TEXT NOT NULL, `name` TEXT, `iconsUrl` TEXT, `exchangeDetails` TEXT, `exchangedAmount` TEXT, `originId` TEXT, `originResource` TEXT, `receivedExchangeDetails` TEXT, `earningDetails` TEXT, PRIMARY KEY(`pointsTransactionId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rev_points_transaction_metadata` (`metadataKey` TEXT NOT NULL, `metadataValue` INTEGER NOT NULL, PRIMARY KEY(`metadataKey`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '37940ae7464f51296d3f6b985ae32c21')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rev_points_transaction`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rev_points_transaction_metadata`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = RevPointsDatabase_Impl.k;
        this.f266393a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(16);
        map.put("pointsTransactionId", new TableInfo.Column("pointsTransactionId", "TEXT", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("points", new TableInfo.Column("points", "REAL", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("coreTransactionId", new TableInfo.Column("coreTransactionId", "TEXT", false, 0, null, 1));
        map.put("product", new TableInfo.Column("product", "TEXT", false, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
        map.put("iconsUrl", new TableInfo.Column("iconsUrl", "TEXT", false, 0, null, 1));
        map.put("exchangeDetails", new TableInfo.Column("exchangeDetails", "TEXT", false, 0, null, 1));
        map.put("exchangedAmount", new TableInfo.Column("exchangedAmount", "TEXT", false, 0, null, 1));
        map.put("originId", new TableInfo.Column("originId", "TEXT", false, 0, null, 1));
        map.put("originResource", new TableInfo.Column("originResource", "TEXT", false, 0, null, 1));
        map.put("receivedExchangeDetails", new TableInfo.Column("receivedExchangeDetails", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("rev_points_transaction", map, o.s(map, "earningDetails", new TableInfo.Column("earningDetails", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "rev_points_transaction");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("rev_points_transaction(com.revolut.feature.rev_points.impl.data.storage.model.RevPointsTransactionEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(2);
        map2.put("metadataKey", new TableInfo.Column("metadataKey", "TEXT", true, 1, null, 1));
        TableInfo tableInfo3 = new TableInfo("rev_points_transaction_metadata", map2, o.s(map2, "metadataValue", new TableInfo.Column("metadataValue", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "rev_points_transaction_metadata");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("rev_points_transaction_metadata(com.revolut.feature.rev_points.impl.data.storage.model.RevPointsTransactionMetadataEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
