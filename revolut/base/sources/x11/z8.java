package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class z8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z8 f302084c = new z8();

    private z8() {
        super(320, 321);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `money_requests`", "CREATE TABLE IF NOT EXISTS `money_requests` (`id` TEXT NOT NULL, `state` TEXT, `channel` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `update_date` INTEGER NOT NULL, `comment` TEXT, `gif_url` TEXT, `expiry_date` INTEGER, `receive_url` TEXT, `split_bill_id` TEXT, `payer_id` TEXT, `payer_type` TEXT, `payer_code` TEXT, `payer_username` TEXT, `payer_legal_name` TEXT, `payer_first_name` TEXT, `payer_last_name` TEXT, `payer_country` TEXT, `payer_phone` TEXT, `payer_email` TEXT, `payer_name` TEXT, `payer_app_mode` TEXT, `payer_pda_recipient_country` TEXT, `payer_contact_name` TEXT, `payer_alias` TEXT, `creator_id` TEXT, `creator_type` TEXT NOT NULL, `creator_code` TEXT, `creator_username` TEXT, `creator_legal_name` TEXT, `creator_first_name` TEXT, `creator_last_name` TEXT, `creator_country` TEXT, `creator_phone` TEXT, `creator_email` TEXT, `creator_name` TEXT, `creator_app_mode` TEXT, `creator_pda_recipient_country` TEXT, `creator_contact_name` TEXT, `creator_alias` TEXT, `requester_id` TEXT, `requester_type` TEXT, `requester_code` TEXT, `requester_username` TEXT, `requester_legal_name` TEXT, `requester_first_name` TEXT, `requester_last_name` TEXT, `requester_country` TEXT, `requester_phone` TEXT, `requester_email` TEXT, `requester_name` TEXT, `requester_app_mode` TEXT, `requester_pda_recipient_country` TEXT, `requester_contact_name` TEXT, `requester_alias` TEXT, PRIMARY KEY(`id`))");
    }
}
