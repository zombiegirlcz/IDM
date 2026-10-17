package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.j9;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9 f267069c;

    public n0() {
        super(347, 348);
        this.f267069c = new j9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_recurring_payments` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `receiver` TEXT, `speed` TEXT, `updatedDate` INTEGER, `startDate` TEXT, `nextDate` TEXT, `endDate` TEXT, `period` TEXT, `frequency` TEXT, `recurring` INTEGER, `estimated` INTEGER, `autoExchangeEnabled` INTEGER, `fee` TEXT, `sourceCurrency` TEXT, `currency` TEXT NOT NULL, `amount` INTEGER, `title` TEXT, `description` TEXT, `transferReason` TEXT, `receiverInfoRecurringBuy` TEXT, `recieverInfoBeneficiary` TEXT, `recieverInfoRecipient` TEXT, `recieverInfoCreditor` TEXT, `receiverInfoVault` TEXT, `receiverInfoMerchant` TEXT, `receiverCreditEntity` TEXT, `receiverPayLaterEntity` TEXT, `receiverLoanEntity` TEXT, `receiverAccountInfo` TEXT, `senderAccountInfo` TEXT, `billMoneyBoxId` TEXT, `side` TEXT, `day` INTEGER NOT NULL, `gifUrl` TEXT, `linkedTransactionsIds` TEXT, `planInfo` TEXT, `wallet_id` TEXT, `initiator_id` TEXT, `initiator_name` TEXT, `name` TEXT, `pending_refund_sender_info` TEXT, `referenceFields` TEXT, `sourcePocketId` TEXT, `payment_scheme` TEXT, `payment_method` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_recurring_payments` (`id`,`state`,`type`,`receiver`,`speed`,`updatedDate`,`startDate`,`nextDate`,`endDate`,`period`,`frequency`,`recurring`,`estimated`,`autoExchangeEnabled`,`fee`,`sourceCurrency`,`currency`,`amount`,`title`,`description`,`transferReason`,`receiverInfoRecurringBuy`,`recieverInfoBeneficiary`,`recieverInfoRecipient`,`recieverInfoCreditor`,`receiverInfoVault`,`receiverInfoMerchant`,`receiverCreditEntity`,`receiverPayLaterEntity`,`receiverLoanEntity`,`receiverAccountInfo`,`senderAccountInfo`,`billMoneyBoxId`,`side`,`day`,`gifUrl`,`linkedTransactionsIds`,`planInfo`,`wallet_id`,`initiator_id`,`initiator_name`,`name`,`pending_refund_sender_info`,`referenceFields`,`sourcePocketId`,`payment_scheme`,`payment_method`) SELECT `id`,`state`,`type`,`receiver`,`speed`,`updatedDate`,`startDate`,`nextDate`,`endDate`,`period`,`frequency`,`recurring`,`estimated`,`autoExchangeEnabled`,`fee`,`sourceCurrency`,`currency`,`amount`,`title`,`description`,`transferReason`,`receiverInfoRecurringBuy`,`recieverInfoBeneficiary`,`recieverInfoRecipient`,`recieverInfoCreditor`,`receiverInfoVault`,`receiverInfoMerchant`,`receiverCreditEntity`,`receiverPayLaterEntity`,`receiverLoanEntity`,`receiverAccountInfo`,`senderAccountInfo`,`billMoneyBoxId`,`side`,`day`,`gifUrl`,`linkedTransactionsIds`,`planInfo`,`wallet_id`,`initiator_id`,`initiator_name`,`name`,`pending_refund_sender_info`,`referenceFields`,`sourcePocketId`,`implementation`,`payment_method` FROM `recurring_payments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `recurring_payments`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_recurring_payments` RENAME TO `recurring_payments`");
        this.f267069c.onPostMigrate(sQLiteConnection);
    }
}
