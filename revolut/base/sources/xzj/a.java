package xzj;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketNewsDatabase_Impl f310038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MarketNewsDatabase_Impl marketNewsDatabase_Impl) {
        super(13, "34bb4763d6ee41339d9e825d5350f313", "7c49f572bf71a52098f8cdf9beffd5c4");
        this.f310038a = marketNewsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `scoped_symbols` (`scope` TEXT NOT NULL, `symbolType` TEXT NOT NULL, `symbol` TEXT NOT NULL, `ref` TEXT NOT NULL, `baseCurrency` TEXT NOT NULL, `name` TEXT, PRIMARY KEY(`scope`, `ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wealth_news` (`id` TEXT NOT NULL, `assetType` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `htmlBody` TEXT, `publishedDate` INTEGER NOT NULL, `source` TEXT NOT NULL, `lengthInMins` INTEGER, `isTopStory` INTEGER NOT NULL, `relatedSymbols` TEXT NOT NULL, `relatedCurrencies` TEXT NOT NULL, `keywords` TEXT, `assetsFilters` TEXT, PRIMARY KEY(`id`, `isTopStory`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '34bb4763d6ee41339d9e825d5350f313')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `scoped_symbols`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `wealth_news`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = MarketNewsDatabase_Impl.k;
        this.f310038a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("scope", new TableInfo.Column("scope", "TEXT", true, 1, null, 1));
        map.put("symbolType", new TableInfo.Column("symbolType", "TEXT", true, 0, null, 1));
        map.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map.put("ref", new TableInfo.Column("ref", "TEXT", true, 2, null, 1));
        map.put("baseCurrency", new TableInfo.Column("baseCurrency", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("scoped_symbols", map, o.s(map, "name", new TableInfo.Column("name", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "scoped_symbols");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("scoped_symbols(com.revolut.retail.feature.marketnews.impl.data.database.dao.ScopedSymbolEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(13);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 0, null, 1));
        map2.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map2.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1));
        map2.put("htmlBody", new TableInfo.Column("htmlBody", "TEXT", false, 0, null, 1));
        map2.put("publishedDate", new TableInfo.Column("publishedDate", "INTEGER", true, 0, null, 1));
        map2.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
        map2.put("lengthInMins", new TableInfo.Column("lengthInMins", "INTEGER", false, 0, null, 1));
        map2.put("isTopStory", new TableInfo.Column("isTopStory", "INTEGER", true, 2, null, 1));
        map2.put("relatedSymbols", new TableInfo.Column("relatedSymbols", "TEXT", true, 0, null, 1));
        map2.put("relatedCurrencies", new TableInfo.Column("relatedCurrencies", "TEXT", true, 0, null, 1));
        map2.put("keywords", new TableInfo.Column("keywords", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("wealth_news", map2, o.s(map2, "assetsFilters", new TableInfo.Column("assetsFilters", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "wealth_news");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("wealth_news(com.revolut.retail.feature.marketnews.impl.data.database.dao.WealthNewsArticleEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
