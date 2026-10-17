package xxk;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.trading_onboarding.impl.data.database.TradingOnboardingDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingDatabase_Impl f309553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TradingOnboardingDatabase_Impl tradingOnboardingDatabase_Impl) {
        super(3, "c7b241db67c973519a9c7840499628c1", "4e1e01786e1cce9468ced520181bd429");
        this.f309553a = tradingOnboardingDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `trading_onboarding_kyc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `nationalities` TEXT, `usTaxPayer` INTEGER, `rtlBrexitOptIn` INTEGER, `documents` TEXT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c7b241db67c973519a9c7840499628c1')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `trading_onboarding_kyc`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TradingOnboardingDatabase_Impl.f104142j;
        this.f309553a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(5);
        map.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
        map.put("nationalities", new TableInfo.Column("nationalities", "TEXT", false, 0, null, 1));
        map.put("usTaxPayer", new TableInfo.Column("usTaxPayer", "INTEGER", false, 0, null, 1));
        map.put("rtlBrexitOptIn", new TableInfo.Column("rtlBrexitOptIn", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("trading_onboarding_kyc", map, o.s(map, "documents", new TableInfo.Column("documents", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "trading_onboarding_kyc");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("trading_onboarding_kyc(com.revolut.retail.feature.trading_onboarding.impl.data.database.models.TradingOnboardingKycEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
