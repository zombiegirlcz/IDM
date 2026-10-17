package mgc;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RewardsDatabase_Impl f205254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RewardsDatabase_Impl rewardsDatabase_Impl) {
        super(25, "ab0b046b6113f55650b3ac09b9106cb5", "2630242586d866afeb372497a87c481a");
        this.f205254a = rewardsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rewards_short` (`id` TEXT NOT NULL, `perk_id` TEXT NOT NULL, `type` TEXT NOT NULL, `start` INTEGER, `end` INTEGER, `merchant` TEXT NOT NULL, `description` TEXT NOT NULL, `category` TEXT NOT NULL, `claimType` TEXT, `activation_state` TEXT, `recommended` INTEGER NOT NULL, `homeFeed` INTEGER NOT NULL, `partner` INTEGER NOT NULL DEFAULT 0, `only_manual_activation` INTEGER NOT NULL DEFAULT 0, `social_proof_likes` INTEGER, PRIMARY KEY(`id`, `recommended`, `homeFeed`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rewards_details` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `primaryCategoryId` TEXT NOT NULL, `description` TEXT NOT NULL, `loyalty_description` TEXT, `details` TEXT NOT NULL, `merchant` TEXT NOT NULL, `start` INTEGER, `end` INTEGER, `steps` TEXT NOT NULL, `loyalty_steps` TEXT, `claim_type` TEXT, `activation_state` TEXT, `total_outlets_number` INTEGER, `extra_cashback` INTEGER NOT NULL DEFAULT 0, `only_manual_activation` INTEGER NOT NULL DEFAULT 0, `requires_external_registration` INTEGER NOT NULL DEFAULT 0, `can_redeem_via_email` INTEGER NOT NULL DEFAULT 0, `activation_button_text` TEXT, `social_proof_likes` INTEGER, `feedbackrating` INTEGER, `feedbackcomment` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rewards_collections` (`id` TEXT NOT NULL, `order` INTEGER NOT NULL, `imageUrl` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rewards_categories` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `perks` TEXT NOT NULL, `order` INTEGER NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_rewards_categories_type` ON `rewards_categories` (`type`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ab0b046b6113f55650b3ac09b9106cb5')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rewards_short`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rewards_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rewards_collections`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rewards_categories`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = RewardsDatabase_Impl.f84903l;
        this.f205254a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(15);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("perk_id", new TableInfo.Column("perk_id", "TEXT", true, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("start", new TableInfo.Column("start", "INTEGER", false, 0, null, 1));
        map.put("end", new TableInfo.Column("end", "INTEGER", false, 0, null, 1));
        map.put("merchant", new TableInfo.Column("merchant", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, 1));
        map.put("claimType", new TableInfo.Column("claimType", "TEXT", false, 0, null, 1));
        map.put("activation_state", new TableInfo.Column("activation_state", "TEXT", false, 0, null, 1));
        map.put("recommended", new TableInfo.Column("recommended", "INTEGER", true, 2, null, 1));
        map.put("homeFeed", new TableInfo.Column("homeFeed", "INTEGER", true, 3, null, 1));
        map.put("partner", new TableInfo.Column("partner", "INTEGER", true, 0, "0", 1));
        map.put("only_manual_activation", new TableInfo.Column("only_manual_activation", "INTEGER", true, 0, "0", 1));
        TableInfo tableInfo = new TableInfo("rewards_short", map, o.s(map, "social_proof_likes", new TableInfo.Column("social_proof_likes", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "rewards_short");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("rewards_short(com.revolut.feature.rewards.impl.data.database.models.rewards.models.RewardShortEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(22);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("primaryCategoryId", new TableInfo.Column("primaryCategoryId", "TEXT", true, 0, null, 1));
        map2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map2.put("loyalty_description", new TableInfo.Column("loyalty_description", "TEXT", false, 0, null, 1));
        map2.put("details", new TableInfo.Column("details", "TEXT", true, 0, null, 1));
        map2.put("merchant", new TableInfo.Column("merchant", "TEXT", true, 0, null, 1));
        map2.put("start", new TableInfo.Column("start", "INTEGER", false, 0, null, 1));
        map2.put("end", new TableInfo.Column("end", "INTEGER", false, 0, null, 1));
        map2.put("steps", new TableInfo.Column("steps", "TEXT", true, 0, null, 1));
        map2.put("loyalty_steps", new TableInfo.Column("loyalty_steps", "TEXT", false, 0, null, 1));
        map2.put("claim_type", new TableInfo.Column("claim_type", "TEXT", false, 0, null, 1));
        map2.put("activation_state", new TableInfo.Column("activation_state", "TEXT", false, 0, null, 1));
        map2.put("total_outlets_number", new TableInfo.Column("total_outlets_number", "INTEGER", false, 0, null, 1));
        map2.put("extra_cashback", new TableInfo.Column("extra_cashback", "INTEGER", true, 0, "0", 1));
        map2.put("only_manual_activation", new TableInfo.Column("only_manual_activation", "INTEGER", true, 0, "0", 1));
        map2.put("requires_external_registration", new TableInfo.Column("requires_external_registration", "INTEGER", true, 0, "0", 1));
        map2.put("can_redeem_via_email", new TableInfo.Column("can_redeem_via_email", "INTEGER", true, 0, "0", 1));
        map2.put("activation_button_text", new TableInfo.Column("activation_button_text", "TEXT", false, 0, null, 1));
        map2.put("social_proof_likes", new TableInfo.Column("social_proof_likes", "INTEGER", false, 0, null, 1));
        map2.put("feedbackrating", new TableInfo.Column("feedbackrating", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("rewards_details", map2, o.s(map2, "feedbackcomment", new TableInfo.Column("feedbackcomment", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "rewards_details");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("rewards_details(com.revolut.feature.rewards.impl.data.database.models.rewards.models.RewardEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(3);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("rewards_collections", map3, o.s(map3, "imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "rewards_collections");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("rewards_collections(com.revolut.feature.rewards.impl.data.database.models.rewards.models.CollectionEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(5);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map4.put("perks", new TableInfo.Column("perks", "TEXT", true, 0, null, 1));
        map4.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, 1));
        HashSet hashSetS = o.s(map4, "type", new TableInfo.Column("type", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_rewards_categories_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
        TableInfo tableInfo7 = new TableInfo("rewards_categories", map4, hashSetS, hashSet);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "rewards_categories");
        return !tableInfo7.equals(tableInfo8) ? new RoomOpenDelegate.ValidationResult(false, o.o("rewards_categories(com.revolut.feature.rewards.impl.data.database.models.rewards.models.RewardCategoryEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
