package yq;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricVerificationDatabase_Impl f315952a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BiometricVerificationDatabase_Impl biometricVerificationDatabase_Impl) {
        super(3, "43d4f500e2b5652964a37adbb785444c", "197af632cbdffd14068e117fefb12fd9");
        this.f315952a = biometricVerificationDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `biometric_verification_deffered_upload_token` (`token` TEXT NOT NULL, PRIMARY KEY(`token`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `biometric_verification_deffered_upload_metadata` (`file_name` TEXT NOT NULL, `verification_id` TEXT NOT NULL, PRIMARY KEY(`file_name`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '43d4f500e2b5652964a37adbb785444c')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `biometric_verification_deffered_upload_token`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `biometric_verification_deffered_upload_metadata`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = BiometricVerificationDatabase_Impl.k;
        this.f315952a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(1);
        TableInfo tableInfo = new TableInfo("biometric_verification_deffered_upload_token", map, o.s(map, "token", new TableInfo.Column("token", "TEXT", true, 1, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "biometric_verification_deffered_upload_token");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("biometric_verification_deffered_upload_token(com.revolut.biometric_verification.impl.data.db.models.BiometricVerificationDefferedUploadTokenEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(2);
        map2.put("file_name", new TableInfo.Column("file_name", "TEXT", true, 1, null, 1));
        TableInfo tableInfo3 = new TableInfo("biometric_verification_deffered_upload_metadata", map2, o.s(map2, "verification_id", new TableInfo.Column("verification_id", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "biometric_verification_deffered_upload_metadata");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("biometric_verification_deffered_upload_metadata(com.revolut.biometric_verification.impl.data.db.models.BiometricVerificationDefferedUploadMetadata).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
