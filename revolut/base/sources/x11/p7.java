package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class p7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p7 f301969c = new p7();

    private p7() {
        super(285, 286);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `recurring_payments_temp` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `receiver` TEXT, `speed` TEXT, `updatedDate` INTEGER, `startDate` TEXT, `nextDate` TEXT, `period` TEXT, `frequency` TEXT, `recurring` INTEGER, `estimated` INTEGER, `autoExchangeEnabled` INTEGER, `fee` TEXT, `sourceCurrency` TEXT, `currency` TEXT NOT NULL, `amount` INTEGER, `title` TEXT, `description` TEXT, `transferReason` TEXT, `receiverInfoRecurringBuy` TEXT, `recieverInfoBeneficiary` TEXT, `recieverInfoRecipient` TEXT, `recieverInfoCreditor` TEXT, `receiverInfoVault` TEXT, `receiverInfoMerchant` TEXT, `receiverCreditEntity` TEXT, `receiverPayLaterEntity` TEXT, `receiverLoanEntity` TEXT, `day` INTEGER NOT NULL, `gifUrl` TEXT, `linkedTransactionsIds` TEXT, `wallet_id` TEXT, `initiator_id` TEXT, `initiator_name` TEXT, `name` TEXT, PRIMARY KEY(`id`))", "            INSERT INTO recurring_payments_temp (id, state, type, receiver, speed, updatedDate, startDate, nextDate, period, frequency, recurring, estimated, autoExchangeEnabled, fee, sourceCurrency, currency, amount, title, description, transferReason, receiverInfoRecurringBuy, recieverInfoBeneficiary, recieverInfoRecipient, recieverInfoCreditor, receiverInfoVault, receiverInfoMerchant, receiverCreditEntity, receiverPayLaterEntity, receiverLoanEntity, day, gifUrl, linkedTransactionsIds, wallet_id, initiator_id, initiator_name, name) \n            SELECT id, state, type, receiver, speed, updatedDate, startDate, nextDate, period, frequency, recurring, estimated, autoExchangeEnabled, fee, sourceCurrency, currency, amount, title, description, transferReason, receiverInfoRecurringBuy, recieverInfoBeneficiary, recieverInfoRecipient, recieverInfoCreditor, receiverInfoVault, receiverInfoMerchant, receiverCreditEntity, receiverPayLaterEntity, receiverLoanEntity, day, gifUrl, linkedTransactionsIds, wallet_id, initiator_id, initiator_name, name \n            FROM recurring_payments ", "DROP TABLE recurring_payments");
        supportSQLiteDatabase.execSQL("ALTER TABLE recurring_payments_temp RENAME TO recurring_payments");
    }
}
