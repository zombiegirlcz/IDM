package r10;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.chat.data.db.ChatDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatDatabase_Impl f250820a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ChatDatabase_Impl chatDatabase_Impl) {
        super(60, "e993c533ae26ea3353ef650bc6638ff9", "5d1ac3d1e5bcdb1afa2ed4dfb7899c92");
        this.f250820a = chatDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `chats` (`id` TEXT NOT NULL, `unreadCount` INTEGER NOT NULL, `firstUnreadMessageId` TEXT, `lastMessage` TEXT, `title` TEXT, `ticketState` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `dismissedAt` TEXT, `dismissedCallTileAt` TEXT, `isDismissed` INTEGER, `agent` TEXT NOT NULL, `isReadOnly` INTEGER NOT NULL, `isCloseable` INTEGER NOT NULL, `isBot` INTEGER NOT NULL, `isAnonymous` INTEGER NOT NULL, `ticketType` TEXT, `feedType` TEXT NOT NULL, `feedId` TEXT, `rating_value` TEXT, `rating_title` TEXT, `rating_asset` TEXT, `rating_icon` TEXT, `category_title` TEXT, `category_tag` TEXT, `lastCall_callId` TEXT, `lastCall_referenceSID` TEXT, `lastCall_direction` TEXT, `lastCall_agentId` TEXT, `lastCall_createdAt` TEXT, `lastCall_startedAt` TEXT, `lastCall_completedAt` TEXT, `lastCall_state` TEXT, `lastCall_callType` TEXT, `lastCall_callCompletionReason` TEXT, `lastCall_duration` TEXT, `lastCallRequest_callRequestId` TEXT, `lastCallRequest_state` TEXT, `lastCallRequest_createdAt` TEXT, `lastCallRequest_scheduledAt` TEXT, `lastCallRequest_scheduledAgentId` TEXT, `lastCallRequest_updatedAt` TEXT, `lastCallRequest_category` TEXT, `lastCallRequest_language` TEXT, `lastCallRequest_callType` TEXT, `lastCallRequest_canceledBy` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `agents` (`id` TEXT NOT NULL, `name` TEXT, `shortName` TEXT, `title` TEXT, `email` TEXT, `bio` TEXT, `avatarUrl` TEXT, `rating` REAL, `chats` INTEGER, `firstMessage` TEXT, `totalResolution` TEXT, `firstResponse` TEXT, `wowReviews` INTEGER, `totalReviews` INTEGER, `tenure` TEXT, `compliments` TEXT, `isBot` INTEGER NOT NULL, `presenceStateValue` TEXT, `presenceStateAvailableAt` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `messages` (`id` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `chatId` TEXT NOT NULL, `data` TEXT NOT NULL, `feedType` TEXT, `ticketCreatedAt` TEXT NOT NULL, `feedId` TEXT, `serverId` TEXT, `chatIdGroup` INTEGER NOT NULL DEFAULT 0, `feedIdGroup` INTEGER NOT NULL DEFAULT 0, `feedTypeGroup` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_serverId` ON `messages` (`serverId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_chatId_ticketCreatedAt_createdAt_id` ON `messages` (`chatId`, `ticketCreatedAt`, `createdAt`, `id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_feedId_ticketCreatedAt_createdAt_id` ON `messages` (`feedId`, `ticketCreatedAt`, `createdAt`, `id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_feedType_ticketCreatedAt_createdAt_id` ON `messages` (`feedType`, `ticketCreatedAt`, `createdAt`, `id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_chatId_chatIdGroup` ON `messages` (`chatId`, `chatIdGroup`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_feedId_feedIdGroup` ON `messages` (`feedId`, `feedIdGroup`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_messages_feedType_feedTypeGroup` ON `messages` (`feedType`, `feedTypeGroup`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `uploads` (`id` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `chatId` TEXT NOT NULL, `data` TEXT NOT NULL, `feedType` TEXT, `ticketCreatedAt` TEXT NOT NULL, `feedId` TEXT, `serverId` TEXT, `uploadType` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_uploads_serverId` ON `uploads` (`serverId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `feeds` (`id` TEXT NOT NULL, `feedType` TEXT NOT NULL, `ticketId` TEXT, `isActive` INTEGER NOT NULL, `allowOpeningTicket` INTEGER NOT NULL, `allowArchiving` INTEGER NOT NULL, `archived` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pending_uploads` (`uploadCorrelationId` TEXT NOT NULL, `ticketId` TEXT NOT NULL, `messageId` TEXT NOT NULL, `messageCorrelationId` TEXT NOT NULL, `filePath` TEXT NOT NULL, `contentType` TEXT, `status` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`uploadCorrelationId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `chat_drafts` (`id` TEXT NOT NULL, `routingMode` TEXT NOT NULL, `routingKeyValue` TEXT NOT NULL, `text` TEXT, `inputMessageVersion` INTEGER NOT NULL, `replyToMessageServerId` TEXT, `replyToSelectedText` TEXT, `pendingAttachments` TEXT, `voiceRecording` TEXT, `createdAt` TEXT NOT NULL, `expiresAt` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_drafts_routingMode_routingKeyValue` ON `chat_drafts` (`routingMode`, `routingKeyValue`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `chat_history_load_state` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chatId` TEXT, `feedType` TEXT, `feedId` TEXT, `historyFullyLoaded` INTEGER NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_history_load_state_chatId` ON `chat_history_load_state` (`chatId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_history_load_state_feedType` ON `chat_history_load_state` (`feedType`)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_history_load_state_feedId` ON `chat_history_load_state` (`feedId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `message_search` (`messageId` TEXT NOT NULL, `chatId` TEXT NOT NULL, `feedId` TEXT, `feedType` TEXT, `ticketCreatedAt` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `searchText` TEXT, PRIMARY KEY(`messageId`), FOREIGN KEY(`messageId`) REFERENCES `messages`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_message_search_chatId_ticketCreatedAt_createdAt` ON `message_search` (`chatId`, `ticketCreatedAt`, `createdAt`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_message_search_feedId_ticketCreatedAt_createdAt` ON `message_search` (`feedId`, `ticketCreatedAt`, `createdAt`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_message_search_feedType_ticketCreatedAt_createdAt` ON `message_search` (`feedType`, `ticketCreatedAt`, `createdAt`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `message_search_meta` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e993c533ae26ea3353ef650bc6638ff9')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `chats`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `agents`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `messages`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `uploads`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `feeds`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pending_uploads`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `chat_drafts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `chat_history_load_state`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `message_search`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `message_search_meta`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = ChatDatabase_Impl.f50986r;
        this.f250820a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(46);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("unreadCount", new TableInfo.Column("unreadCount", "INTEGER", true, 0, null, 1));
        map.put("firstUnreadMessageId", new TableInfo.Column("firstUnreadMessageId", "TEXT", false, 0, null, 1));
        map.put("lastMessage", new TableInfo.Column("lastMessage", "TEXT", false, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
        map.put("ticketState", new TableInfo.Column("ticketState", "TEXT", true, 0, null, 1));
        map.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, 1));
        map.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", true, 0, null, 1));
        map.put("dismissedAt", new TableInfo.Column("dismissedAt", "TEXT", false, 0, null, 1));
        map.put("dismissedCallTileAt", new TableInfo.Column("dismissedCallTileAt", "TEXT", false, 0, null, 1));
        map.put("isDismissed", new TableInfo.Column("isDismissed", "INTEGER", false, 0, null, 1));
        map.put("agent", new TableInfo.Column("agent", "TEXT", true, 0, null, 1));
        map.put("isReadOnly", new TableInfo.Column("isReadOnly", "INTEGER", true, 0, null, 1));
        map.put("isCloseable", new TableInfo.Column("isCloseable", "INTEGER", true, 0, null, 1));
        map.put("isBot", new TableInfo.Column("isBot", "INTEGER", true, 0, null, 1));
        map.put("isAnonymous", new TableInfo.Column("isAnonymous", "INTEGER", true, 0, null, 1));
        map.put("ticketType", new TableInfo.Column("ticketType", "TEXT", false, 0, null, 1));
        map.put("feedType", new TableInfo.Column("feedType", "TEXT", true, 0, null, 1));
        map.put("feedId", new TableInfo.Column("feedId", "TEXT", false, 0, null, 1));
        map.put("rating_value", new TableInfo.Column("rating_value", "TEXT", false, 0, null, 1));
        map.put("rating_title", new TableInfo.Column("rating_title", "TEXT", false, 0, null, 1));
        map.put("rating_asset", new TableInfo.Column("rating_asset", "TEXT", false, 0, null, 1));
        map.put("rating_icon", new TableInfo.Column("rating_icon", "TEXT", false, 0, null, 1));
        map.put("category_title", new TableInfo.Column("category_title", "TEXT", false, 0, null, 1));
        map.put("category_tag", new TableInfo.Column("category_tag", "TEXT", false, 0, null, 1));
        map.put("lastCall_callId", new TableInfo.Column("lastCall_callId", "TEXT", false, 0, null, 1));
        map.put("lastCall_referenceSID", new TableInfo.Column("lastCall_referenceSID", "TEXT", false, 0, null, 1));
        map.put("lastCall_direction", new TableInfo.Column("lastCall_direction", "TEXT", false, 0, null, 1));
        map.put("lastCall_agentId", new TableInfo.Column("lastCall_agentId", "TEXT", false, 0, null, 1));
        map.put("lastCall_createdAt", new TableInfo.Column("lastCall_createdAt", "TEXT", false, 0, null, 1));
        map.put("lastCall_startedAt", new TableInfo.Column("lastCall_startedAt", "TEXT", false, 0, null, 1));
        map.put("lastCall_completedAt", new TableInfo.Column("lastCall_completedAt", "TEXT", false, 0, null, 1));
        map.put("lastCall_state", new TableInfo.Column("lastCall_state", "TEXT", false, 0, null, 1));
        map.put("lastCall_callType", new TableInfo.Column("lastCall_callType", "TEXT", false, 0, null, 1));
        map.put("lastCall_callCompletionReason", new TableInfo.Column("lastCall_callCompletionReason", "TEXT", false, 0, null, 1));
        map.put("lastCall_duration", new TableInfo.Column("lastCall_duration", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_callRequestId", new TableInfo.Column("lastCallRequest_callRequestId", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_state", new TableInfo.Column("lastCallRequest_state", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_createdAt", new TableInfo.Column("lastCallRequest_createdAt", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_scheduledAt", new TableInfo.Column("lastCallRequest_scheduledAt", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_scheduledAgentId", new TableInfo.Column("lastCallRequest_scheduledAgentId", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_updatedAt", new TableInfo.Column("lastCallRequest_updatedAt", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_category", new TableInfo.Column("lastCallRequest_category", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_language", new TableInfo.Column("lastCallRequest_language", "TEXT", false, 0, null, 1));
        map.put("lastCallRequest_callType", new TableInfo.Column("lastCallRequest_callType", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("chats", map, prk.o.s(map, "lastCallRequest_canceledBy", new TableInfo.Column("lastCallRequest_canceledBy", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "chats");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("chats(com.revolut.chat.data.db.model.ChatEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(19);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
        map2.put("shortName", new TableInfo.Column("shortName", "TEXT", false, 0, null, 1));
        map2.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
        map2.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, 1));
        map2.put("bio", new TableInfo.Column("bio", "TEXT", false, 0, null, 1));
        map2.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0, null, 1));
        map2.put("rating", new TableInfo.Column("rating", "REAL", false, 0, null, 1));
        map2.put("chats", new TableInfo.Column("chats", "INTEGER", false, 0, null, 1));
        map2.put("firstMessage", new TableInfo.Column("firstMessage", "TEXT", false, 0, null, 1));
        map2.put("totalResolution", new TableInfo.Column("totalResolution", "TEXT", false, 0, null, 1));
        map2.put("firstResponse", new TableInfo.Column("firstResponse", "TEXT", false, 0, null, 1));
        map2.put("wowReviews", new TableInfo.Column("wowReviews", "INTEGER", false, 0, null, 1));
        map2.put("totalReviews", new TableInfo.Column("totalReviews", "INTEGER", false, 0, null, 1));
        map2.put("tenure", new TableInfo.Column("tenure", "TEXT", false, 0, null, 1));
        map2.put("compliments", new TableInfo.Column("compliments", "TEXT", false, 0, null, 1));
        map2.put("isBot", new TableInfo.Column("isBot", "INTEGER", true, 0, null, 1));
        map2.put("presenceStateValue", new TableInfo.Column("presenceStateValue", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("agents", map2, prk.o.s(map2, "presenceStateAvailableAt", new TableInfo.Column("presenceStateAvailableAt", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "agents");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("agents(com.revolut.chat.data.db.model.AgentInfoEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(11);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, 1));
        map3.put("chatId", new TableInfo.Column("chatId", "TEXT", true, 0, null, 1));
        map3.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
        map3.put("feedType", new TableInfo.Column("feedType", "TEXT", false, 0, null, 1));
        map3.put("ticketCreatedAt", new TableInfo.Column("ticketCreatedAt", "TEXT", true, 0, null, 1));
        map3.put("feedId", new TableInfo.Column("feedId", "TEXT", false, 0, null, 1));
        map3.put("serverId", new TableInfo.Column("serverId", "TEXT", false, 0, null, 1));
        map3.put("chatIdGroup", new TableInfo.Column("chatIdGroup", "INTEGER", true, 0, "0", 1));
        map3.put("feedIdGroup", new TableInfo.Column("feedIdGroup", "INTEGER", true, 0, "0", 1));
        HashSet hashSetS = prk.o.s(map3, "feedTypeGroup", new TableInfo.Column("feedTypeGroup", "INTEGER", true, 0, "0", 1), 0);
        HashSet hashSet = new HashSet(7);
        hashSet.add(new TableInfo.Index("index_messages_serverId", false, Arrays.asList("serverId"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_messages_chatId_ticketCreatedAt_createdAt_id", false, Arrays.asList("chatId", "ticketCreatedAt", "createdAt", "id"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_messages_feedId_ticketCreatedAt_createdAt_id", false, Arrays.asList("feedId", "ticketCreatedAt", "createdAt", "id"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_messages_feedType_ticketCreatedAt_createdAt_id", false, Arrays.asList("feedType", "ticketCreatedAt", "createdAt", "id"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_messages_chatId_chatIdGroup", false, Arrays.asList("chatId", "chatIdGroup"), Arrays.asList("ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_messages_feedId_feedIdGroup", false, Arrays.asList("feedId", "feedIdGroup"), Arrays.asList("ASC", "ASC")));
        hashSet.add(new TableInfo.Index("index_messages_feedType_feedTypeGroup", false, Arrays.asList("feedType", "feedTypeGroup"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo5 = new TableInfo("messages", map3, hashSetS, hashSet);
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "messages");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("messages(com.revolut.chat.data.db.model.ChatMessageEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(9);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, 1));
        map4.put("chatId", new TableInfo.Column("chatId", "TEXT", true, 0, null, 1));
        map4.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
        map4.put("feedType", new TableInfo.Column("feedType", "TEXT", false, 0, null, 1));
        map4.put("ticketCreatedAt", new TableInfo.Column("ticketCreatedAt", "TEXT", true, 0, null, 1));
        map4.put("feedId", new TableInfo.Column("feedId", "TEXT", false, 0, null, 1));
        map4.put("serverId", new TableInfo.Column("serverId", "TEXT", false, 0, null, 1));
        HashSet hashSetS2 = prk.o.s(map4, "uploadType", new TableInfo.Column("uploadType", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new TableInfo.Index("index_uploads_serverId", false, Arrays.asList("serverId"), Arrays.asList("ASC")));
        TableInfo tableInfo7 = new TableInfo("uploads", map4, hashSetS2, hashSet2);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "uploads");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("uploads(com.revolut.chat.data.db.model.ChatUploadEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(7);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("feedType", new TableInfo.Column("feedType", "TEXT", true, 0, null, 1));
        map5.put("ticketId", new TableInfo.Column("ticketId", "TEXT", false, 0, null, 1));
        map5.put("isActive", new TableInfo.Column("isActive", "INTEGER", true, 0, null, 1));
        map5.put("allowOpeningTicket", new TableInfo.Column("allowOpeningTicket", "INTEGER", true, 0, null, 1));
        map5.put("allowArchiving", new TableInfo.Column("allowArchiving", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("feeds", map5, prk.o.s(map5, "archived", new TableInfo.Column("archived", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "feeds");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("feeds(com.revolut.chat.data.db.model.FeedEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(8);
        map6.put("uploadCorrelationId", new TableInfo.Column("uploadCorrelationId", "TEXT", true, 1, null, 1));
        map6.put("ticketId", new TableInfo.Column("ticketId", "TEXT", true, 0, null, 1));
        map6.put("messageId", new TableInfo.Column("messageId", "TEXT", true, 0, null, 1));
        map6.put("messageCorrelationId", new TableInfo.Column("messageCorrelationId", "TEXT", true, 0, null, 1));
        map6.put("filePath", new TableInfo.Column("filePath", "TEXT", true, 0, null, 1));
        map6.put("contentType", new TableInfo.Column("contentType", "TEXT", false, 0, null, 1));
        map6.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("pending_uploads", map6, prk.o.s(map6, "createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "pending_uploads");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pending_uploads(com.revolut.chat.data.db.model.PendingUploadEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(11);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map7.put("routingMode", new TableInfo.Column("routingMode", "TEXT", true, 0, null, 1));
        map7.put("routingKeyValue", new TableInfo.Column("routingKeyValue", "TEXT", true, 0, null, 1));
        map7.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, 1));
        map7.put("inputMessageVersion", new TableInfo.Column("inputMessageVersion", "INTEGER", true, 0, null, 1));
        map7.put("replyToMessageServerId", new TableInfo.Column("replyToMessageServerId", "TEXT", false, 0, null, 1));
        map7.put("replyToSelectedText", new TableInfo.Column("replyToSelectedText", "TEXT", false, 0, null, 1));
        map7.put("pendingAttachments", new TableInfo.Column("pendingAttachments", "TEXT", false, 0, null, 1));
        map7.put("voiceRecording", new TableInfo.Column("voiceRecording", "TEXT", false, 0, null, 1));
        map7.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, 1));
        HashSet hashSetS3 = prk.o.s(map7, "expiresAt", new TableInfo.Column("expiresAt", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new TableInfo.Index("index_chat_drafts_routingMode_routingKeyValue", true, Arrays.asList("routingMode", "routingKeyValue"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo13 = new TableInfo("chat_drafts", map7, hashSetS3, hashSet3);
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "chat_drafts");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("chat_drafts(com.revolut.chat.data.db.model.ChatDraftEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(5);
        map8.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        map8.put("chatId", new TableInfo.Column("chatId", "TEXT", false, 0, null, 1));
        map8.put("feedType", new TableInfo.Column("feedType", "TEXT", false, 0, null, 1));
        map8.put("feedId", new TableInfo.Column("feedId", "TEXT", false, 0, null, 1));
        HashSet hashSetS4 = prk.o.s(map8, "historyFullyLoaded", new TableInfo.Column("historyFullyLoaded", "INTEGER", true, 0, null, 1), 0);
        HashSet hashSet4 = new HashSet(3);
        hashSet4.add(new TableInfo.Index("index_chat_history_load_state_chatId", true, Arrays.asList("chatId"), Arrays.asList("ASC")));
        hashSet4.add(new TableInfo.Index("index_chat_history_load_state_feedType", true, Arrays.asList("feedType"), Arrays.asList("ASC")));
        hashSet4.add(new TableInfo.Index("index_chat_history_load_state_feedId", true, Arrays.asList("feedId"), Arrays.asList("ASC")));
        TableInfo tableInfo15 = new TableInfo("chat_history_load_state", map8, hashSetS4, hashSet4);
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "chat_history_load_state");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("chat_history_load_state(com.revolut.chat.data.db.model.ChatHistoryLoadStateEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(7);
        map9.put("messageId", new TableInfo.Column("messageId", "TEXT", true, 1, null, 1));
        map9.put("chatId", new TableInfo.Column("chatId", "TEXT", true, 0, null, 1));
        map9.put("feedId", new TableInfo.Column("feedId", "TEXT", false, 0, null, 1));
        map9.put("feedType", new TableInfo.Column("feedType", "TEXT", false, 0, null, 1));
        map9.put("ticketCreatedAt", new TableInfo.Column("ticketCreatedAt", "TEXT", true, 0, null, 1));
        map9.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, 1));
        HashSet hashSetS5 = prk.o.s(map9, "searchText", new TableInfo.Column("searchText", "TEXT", false, 0, null, 1), 1);
        HashSet hashSetL = r6.b.l(hashSetS5, new TableInfo.ForeignKey("messages", "CASCADE", "NO ACTION", Arrays.asList("messageId"), Arrays.asList("id")), 3);
        hashSetL.add(new TableInfo.Index("index_message_search_chatId_ticketCreatedAt_createdAt", false, Arrays.asList("chatId", "ticketCreatedAt", "createdAt"), Arrays.asList("ASC", "ASC", "ASC")));
        hashSetL.add(new TableInfo.Index("index_message_search_feedId_ticketCreatedAt_createdAt", false, Arrays.asList("feedId", "ticketCreatedAt", "createdAt"), Arrays.asList("ASC", "ASC", "ASC")));
        hashSetL.add(new TableInfo.Index("index_message_search_feedType_ticketCreatedAt_createdAt", false, Arrays.asList("feedType", "ticketCreatedAt", "createdAt"), Arrays.asList("ASC", "ASC", "ASC")));
        TableInfo tableInfo17 = new TableInfo("message_search", map9, hashSetS5, hashSetL);
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "message_search");
        if (!tableInfo17.equals(tableInfo18)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("message_search(com.revolut.chat.data.db.model.MessageSearchEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18));
        }
        HashMap map10 = new HashMap(2);
        map10.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        TableInfo tableInfo19 = new TableInfo("message_search_meta", map10, prk.o.s(map10, "value", new TableInfo.Column("value", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "message_search_meta");
        return !tableInfo19.equals(tableInfo20) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("message_search_meta(com.revolut.chat.data.db.model.MessageSearchMetaEntity).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfo20)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
