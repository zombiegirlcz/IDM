package sxa;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.referrals.promo.impl.invitation.data.db.model.ReferralsInvitationDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferralsInvitationDatabase_Impl f266389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReferralsInvitationDatabase_Impl referralsInvitationDatabase_Impl) {
        super(1, "6ace181f6fc034d11f9488bc11c4d22a", "930f11f5b865ba41dfb6cd884d408029");
        this.f266389a = referralsInvitationDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `referrals_invitation` (`id` TEXT NOT NULL, `emptyChat_title` TEXT NOT NULL, `emptyChat_description` TEXT NOT NULL, `emptyChat_darkImage` TEXT NOT NULL, `emptyChat_lightImage` TEXT NOT NULL, `emptyChat_acceptButton` TEXT NOT NULL, `chat_description` TEXT NOT NULL, `chat_darkImage` TEXT NOT NULL, `chat_lightImage` TEXT NOT NULL, `chat_acceptButton` TEXT NOT NULL, `chat_declineButton` TEXT NOT NULL, `beneficiaryProfile_title` TEXT NOT NULL, `beneficiaryProfile_description` TEXT NOT NULL, `transactionDetails_title` TEXT NOT NULL, `transactionDetails_description` TEXT NOT NULL, `transactionFee_title` TEXT NOT NULL, `transactionFee_description` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6ace181f6fc034d11f9488bc11c4d22a')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `referrals_invitation`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = ReferralsInvitationDatabase_Impl.f81816j;
        this.f266389a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(17);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("emptyChat_title", new TableInfo.Column("emptyChat_title", "TEXT", true, 0, null, 1));
        map.put("emptyChat_description", new TableInfo.Column("emptyChat_description", "TEXT", true, 0, null, 1));
        map.put("emptyChat_darkImage", new TableInfo.Column("emptyChat_darkImage", "TEXT", true, 0, null, 1));
        map.put("emptyChat_lightImage", new TableInfo.Column("emptyChat_lightImage", "TEXT", true, 0, null, 1));
        map.put("emptyChat_acceptButton", new TableInfo.Column("emptyChat_acceptButton", "TEXT", true, 0, null, 1));
        map.put("chat_description", new TableInfo.Column("chat_description", "TEXT", true, 0, null, 1));
        map.put("chat_darkImage", new TableInfo.Column("chat_darkImage", "TEXT", true, 0, null, 1));
        map.put("chat_lightImage", new TableInfo.Column("chat_lightImage", "TEXT", true, 0, null, 1));
        map.put("chat_acceptButton", new TableInfo.Column("chat_acceptButton", "TEXT", true, 0, null, 1));
        map.put("chat_declineButton", new TableInfo.Column("chat_declineButton", "TEXT", true, 0, null, 1));
        map.put("beneficiaryProfile_title", new TableInfo.Column("beneficiaryProfile_title", "TEXT", true, 0, null, 1));
        map.put("beneficiaryProfile_description", new TableInfo.Column("beneficiaryProfile_description", "TEXT", true, 0, null, 1));
        map.put("transactionDetails_title", new TableInfo.Column("transactionDetails_title", "TEXT", true, 0, null, 1));
        map.put("transactionDetails_description", new TableInfo.Column("transactionDetails_description", "TEXT", true, 0, null, 1));
        map.put("transactionFee_title", new TableInfo.Column("transactionFee_title", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("referrals_invitation", map, o.s(map, "transactionFee_description", new TableInfo.Column("transactionFee_description", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "referrals_invitation");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("referrals_invitation(com.revolut.feature.referrals.promo.impl.invitation.data.db.model.ReferralsInvitationEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
