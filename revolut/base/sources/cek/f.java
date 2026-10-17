package cek;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.pod_nominees.impl.data.database.PodNomineesDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PodNomineesDatabase_Impl f23496a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PodNomineesDatabase_Impl podNomineesDatabase_Impl) {
        super(1, "3d87eaced92ba65435a6f9d7922d340b", "b02a8da4daa29d582e330a9765c34e8b");
        this.f23496a = podNomineesDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pod_nominees` (`id` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `displayName` TEXT NOT NULL, `dateOfBirth` TEXT NOT NULL, `email` TEXT, `address` TEXT, `percentage` REAL NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3d87eaced92ba65435a6f9d7922d340b')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pod_nominees`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PodNomineesDatabase_Impl.f102584j;
        this.f23496a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("displayName", new TableInfo.Column("displayName", "TEXT", true, 0, null, 1));
        map.put("dateOfBirth", new TableInfo.Column("dateOfBirth", "TEXT", true, 0, null, 1));
        map.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, 1));
        map.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("pod_nominees", map, o.s(map, "percentage", new TableInfo.Column("percentage", "REAL", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "pod_nominees");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("pod_nominees(com.revolut.retail.feature.pod_nominees.impl.data.database.PodNomineeEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
