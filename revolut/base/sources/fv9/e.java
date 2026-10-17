package fv9;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SocialPaymentsDatabase_Impl f138387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SocialPaymentsDatabase_Impl socialPaymentsDatabase_Impl) {
        super(7, "68ba2a0546e4ecf470ff231692f37677", "921464bedc03c3a332fc8faf009c57d5");
        this.f138387a = socialPaymentsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_social_reactions` (`id` TEXT NOT NULL, `senderId` TEXT NOT NULL, `recipientId` TEXT NOT NULL, `media` TEXT, `type` TEXT, `isGroupChat` INTEGER NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `status` TEXT NOT NULL, `state` TEXT NOT NULL, `metadata` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_message_reactions` (`parentMessageId` TEXT NOT NULL, `relatedEntityId` TEXT NOT NULL, `relatedEntityType` TEXT NOT NULL, `chatId` TEXT NOT NULL, `isGroup` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`relatedEntityId`, `relatedEntityType`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_social_sent_message` (`localId` TEXT NOT NULL, `messageId` TEXT NOT NULL, PRIMARY KEY(`localId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '68ba2a0546e4ecf470ff231692f37677')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_social_reactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_message_reactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_social_sent_message`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = SocialPaymentsDatabase_Impl.k;
        this.f138387a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(11);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("senderId", new TableInfo.Column("senderId", "TEXT", true, 0, null, 1));
        map.put("recipientId", new TableInfo.Column("recipientId", "TEXT", true, 0, null, 1));
        map.put("media", new TableInfo.Column("media", "TEXT", false, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
        map.put("isGroupChat", new TableInfo.Column("isGroupChat", "INTEGER", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("payments_social_reactions", map, o.s(map, "metadata", new TableInfo.Column("metadata", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "payments_social_reactions");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_social_reactions(com.revolut.feature.payments.messaging.data.impl.data.database.model.ChatMessageEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(6);
        map2.put("parentMessageId", new TableInfo.Column("parentMessageId", "TEXT", true, 0, null, 1));
        map2.put("relatedEntityId", new TableInfo.Column("relatedEntityId", "TEXT", true, 1, null, 1));
        map2.put("relatedEntityType", new TableInfo.Column("relatedEntityType", "TEXT", true, 2, null, 1));
        map2.put("chatId", new TableInfo.Column("chatId", "TEXT", true, 0, null, 1));
        map2.put("isGroup", new TableInfo.Column("isGroup", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("payments_message_reactions", map2, o.s(map2, "reactions", new TableInfo.Column("reactions", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "payments_message_reactions");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_message_reactions(com.revolut.feature.payments.messaging.data.impl.data.database.model.ChatReactionsEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(2);
        map3.put("localId", new TableInfo.Column("localId", "TEXT", true, 1, null, 1));
        TableInfo tableInfo5 = new TableInfo("payments_social_sent_message", map3, o.s(map3, "messageId", new TableInfo.Column("messageId", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "payments_social_sent_message");
        return !tableInfo5.equals(tableInfo6) ? new RoomOpenDelegate.ValidationResult(false, o.o("payments_social_sent_message(com.revolut.feature.payments.messaging.data.impl.data.database.model.SentMessageInfoEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
