package cy9;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecipientSettingsDatabase_Impl f110069a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RecipientSettingsDatabase_Impl recipientSettingsDatabase_Impl) {
        super(2, "639544fd5961fce0be52ac448a94367f", "973728a1a11c196d6492f1f54ebad3e6");
        this.f110069a = recipientSettingsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recipient_settings` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `settings` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '639544fd5961fce0be52ac448a94367f')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `recipient_settings`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = RecipientSettingsDatabase_Impl.f79671j;
        this.f110069a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(3);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("recipient_settings", map, o.s(map, "settings", new TableInfo.Column("settings", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "recipient_settings");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("recipient_settings(com.revolut.feature.payments.recipients.settings.impl.data.db.model.RecipientPaymentsSettingsEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
