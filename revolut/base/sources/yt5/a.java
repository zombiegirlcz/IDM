package yt5;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.crypto_investments.impl.data.database.CryptoInvestmentsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CryptoInvestmentsDatabase_Impl f316631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CryptoInvestmentsDatabase_Impl cryptoInvestmentsDatabase_Impl) {
        super(2, "16b88f7728730b3b5082fb4c7d11d1c2", "25b0ff15b6d9ab94e89681c4bd24c540");
        this.f316631a = cryptoInvestmentsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `crypto_positions` (`type` TEXT NOT NULL, `currency` TEXT NOT NULL, `baseCurrency` TEXT NOT NULL, `investment` TEXT NOT NULL, `lastTransactionDate` INTEGER NOT NULL, `averagePrice` TEXT NOT NULL, PRIMARY KEY(`type`, `currency`, `baseCurrency`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '16b88f7728730b3b5082fb4c7d11d1c2')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `crypto_positions`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = CryptoInvestmentsDatabase_Impl.f71421j;
        this.f316631a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("type", new TableInfo.Column("type", "TEXT", true, 1, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 2, null, 1));
        map.put("baseCurrency", new TableInfo.Column("baseCurrency", "TEXT", true, 3, null, 1));
        map.put("investment", new TableInfo.Column("investment", "TEXT", true, 0, null, 1));
        map.put("lastTransactionDate", new TableInfo.Column("lastTransactionDate", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("crypto_positions", map, o.s(map, "averagePrice", new TableInfo.Column("averagePrice", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "crypto_positions");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("crypto_positions(com.revolut.feature.crypto_investments.impl.data.database.model.CryptoCommoditiesPositionsEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
