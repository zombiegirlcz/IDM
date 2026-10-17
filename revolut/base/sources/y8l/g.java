package y8l;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.shared.feature.payments.money_request.domain.impl.data.database.MoneyRequestDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MoneyRequestDatabase_Impl f311675a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MoneyRequestDatabase_Impl moneyRequestDatabase_Impl) {
        super(5, "c9b699508fa21f9cf8e0b40f0e693ba3", "d5285ed9b218a00e88fa117e5842b809");
        this.f311675a = moneyRequestDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `money_requests` (`id` TEXT NOT NULL, `state` TEXT, `channel` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `update_date` INTEGER NOT NULL, `comment` TEXT, `gif_url` TEXT, `expiry_date` INTEGER, `receive_url` TEXT, `split_bill_id` TEXT, `registered_identity_id` TEXT, `payer_id` TEXT, `payer_type` TEXT, `payer_code` TEXT, `payer_username` TEXT, `payer_legal_name` TEXT, `payer_first_name` TEXT, `payer_last_name` TEXT, `payer_country` TEXT, `payer_phone` TEXT, `payer_email` TEXT, `payer_name` TEXT, `payer_app_mode` TEXT, `payer_pda_recipient_country` TEXT, `payer_contact_name` TEXT, `payer_alias` TEXT, `payer_customer_type` TEXT, `creator_id` TEXT, `creator_type` TEXT NOT NULL, `creator_code` TEXT, `creator_username` TEXT, `creator_legal_name` TEXT, `creator_first_name` TEXT, `creator_last_name` TEXT, `creator_country` TEXT, `creator_phone` TEXT, `creator_email` TEXT, `creator_name` TEXT, `creator_app_mode` TEXT, `creator_pda_recipient_country` TEXT, `creator_contact_name` TEXT, `creator_alias` TEXT, `creator_customer_type` TEXT, `requester_id` TEXT, `requester_type` TEXT, `requester_code` TEXT, `requester_username` TEXT, `requester_legal_name` TEXT, `requester_first_name` TEXT, `requester_last_name` TEXT, `requester_country` TEXT, `requester_phone` TEXT, `requester_email` TEXT, `requester_name` TEXT, `requester_app_mode` TEXT, `requester_pda_recipient_country` TEXT, `requester_contact_name` TEXT, `requester_alias` TEXT, `requester_customer_type` TEXT, `settings_editableAmount` INTEGER, `settings_editableReference` INTEGER, `attributes_invoice_url` TEXT, `attributes_invoice_number` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c9b699508fa21f9cf8e0b40f0e693ba3')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `money_requests`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = MoneyRequestDatabase_Impl.f104881j;
        this.f311675a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(64);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, 1));
        map.put("channel", new TableInfo.Column("channel", "TEXT", true, 0, null, 1));
        map.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("update_date", new TableInfo.Column("update_date", "INTEGER", true, 0, null, 1));
        map.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, 1));
        map.put("gif_url", new TableInfo.Column("gif_url", "TEXT", false, 0, null, 1));
        map.put("expiry_date", new TableInfo.Column("expiry_date", "INTEGER", false, 0, null, 1));
        map.put("receive_url", new TableInfo.Column("receive_url", "TEXT", false, 0, null, 1));
        map.put("split_bill_id", new TableInfo.Column("split_bill_id", "TEXT", false, 0, null, 1));
        map.put("registered_identity_id", new TableInfo.Column("registered_identity_id", "TEXT", false, 0, null, 1));
        map.put("payer_id", new TableInfo.Column("payer_id", "TEXT", false, 0, null, 1));
        map.put("payer_type", new TableInfo.Column("payer_type", "TEXT", false, 0, null, 1));
        map.put("payer_code", new TableInfo.Column("payer_code", "TEXT", false, 0, null, 1));
        map.put("payer_username", new TableInfo.Column("payer_username", "TEXT", false, 0, null, 1));
        map.put("payer_legal_name", new TableInfo.Column("payer_legal_name", "TEXT", false, 0, null, 1));
        map.put("payer_first_name", new TableInfo.Column("payer_first_name", "TEXT", false, 0, null, 1));
        map.put("payer_last_name", new TableInfo.Column("payer_last_name", "TEXT", false, 0, null, 1));
        map.put("payer_country", new TableInfo.Column("payer_country", "TEXT", false, 0, null, 1));
        map.put("payer_phone", new TableInfo.Column("payer_phone", "TEXT", false, 0, null, 1));
        map.put("payer_email", new TableInfo.Column("payer_email", "TEXT", false, 0, null, 1));
        map.put("payer_name", new TableInfo.Column("payer_name", "TEXT", false, 0, null, 1));
        map.put("payer_app_mode", new TableInfo.Column("payer_app_mode", "TEXT", false, 0, null, 1));
        map.put("payer_pda_recipient_country", new TableInfo.Column("payer_pda_recipient_country", "TEXT", false, 0, null, 1));
        map.put("payer_contact_name", new TableInfo.Column("payer_contact_name", "TEXT", false, 0, null, 1));
        map.put("payer_alias", new TableInfo.Column("payer_alias", "TEXT", false, 0, null, 1));
        map.put("payer_customer_type", new TableInfo.Column("payer_customer_type", "TEXT", false, 0, null, 1));
        map.put("creator_id", new TableInfo.Column("creator_id", "TEXT", false, 0, null, 1));
        map.put("creator_type", new TableInfo.Column("creator_type", "TEXT", true, 0, null, 1));
        map.put("creator_code", new TableInfo.Column("creator_code", "TEXT", false, 0, null, 1));
        map.put("creator_username", new TableInfo.Column("creator_username", "TEXT", false, 0, null, 1));
        map.put("creator_legal_name", new TableInfo.Column("creator_legal_name", "TEXT", false, 0, null, 1));
        map.put("creator_first_name", new TableInfo.Column("creator_first_name", "TEXT", false, 0, null, 1));
        map.put("creator_last_name", new TableInfo.Column("creator_last_name", "TEXT", false, 0, null, 1));
        map.put("creator_country", new TableInfo.Column("creator_country", "TEXT", false, 0, null, 1));
        map.put("creator_phone", new TableInfo.Column("creator_phone", "TEXT", false, 0, null, 1));
        map.put("creator_email", new TableInfo.Column("creator_email", "TEXT", false, 0, null, 1));
        map.put("creator_name", new TableInfo.Column("creator_name", "TEXT", false, 0, null, 1));
        map.put("creator_app_mode", new TableInfo.Column("creator_app_mode", "TEXT", false, 0, null, 1));
        map.put("creator_pda_recipient_country", new TableInfo.Column("creator_pda_recipient_country", "TEXT", false, 0, null, 1));
        map.put("creator_contact_name", new TableInfo.Column("creator_contact_name", "TEXT", false, 0, null, 1));
        map.put("creator_alias", new TableInfo.Column("creator_alias", "TEXT", false, 0, null, 1));
        map.put("creator_customer_type", new TableInfo.Column("creator_customer_type", "TEXT", false, 0, null, 1));
        map.put("requester_id", new TableInfo.Column("requester_id", "TEXT", false, 0, null, 1));
        map.put("requester_type", new TableInfo.Column("requester_type", "TEXT", false, 0, null, 1));
        map.put("requester_code", new TableInfo.Column("requester_code", "TEXT", false, 0, null, 1));
        map.put("requester_username", new TableInfo.Column("requester_username", "TEXT", false, 0, null, 1));
        map.put("requester_legal_name", new TableInfo.Column("requester_legal_name", "TEXT", false, 0, null, 1));
        map.put("requester_first_name", new TableInfo.Column("requester_first_name", "TEXT", false, 0, null, 1));
        map.put("requester_last_name", new TableInfo.Column("requester_last_name", "TEXT", false, 0, null, 1));
        map.put("requester_country", new TableInfo.Column("requester_country", "TEXT", false, 0, null, 1));
        map.put("requester_phone", new TableInfo.Column("requester_phone", "TEXT", false, 0, null, 1));
        map.put("requester_email", new TableInfo.Column("requester_email", "TEXT", false, 0, null, 1));
        map.put("requester_name", new TableInfo.Column("requester_name", "TEXT", false, 0, null, 1));
        map.put("requester_app_mode", new TableInfo.Column("requester_app_mode", "TEXT", false, 0, null, 1));
        map.put("requester_pda_recipient_country", new TableInfo.Column("requester_pda_recipient_country", "TEXT", false, 0, null, 1));
        map.put("requester_contact_name", new TableInfo.Column("requester_contact_name", "TEXT", false, 0, null, 1));
        map.put("requester_alias", new TableInfo.Column("requester_alias", "TEXT", false, 0, null, 1));
        map.put("requester_customer_type", new TableInfo.Column("requester_customer_type", "TEXT", false, 0, null, 1));
        map.put("settings_editableAmount", new TableInfo.Column("settings_editableAmount", "INTEGER", false, 0, null, 1));
        map.put("settings_editableReference", new TableInfo.Column("settings_editableReference", "INTEGER", false, 0, null, 1));
        map.put("attributes_invoice_url", new TableInfo.Column("attributes_invoice_url", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("money_requests", map, prk.o.s(map, "attributes_invoice_number", new TableInfo.Column("attributes_invoice_number", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "money_requests");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("money_requests(com.revolut.shared.feature.payments.money_request.domain.impl.data.database.MoneyRequestEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
