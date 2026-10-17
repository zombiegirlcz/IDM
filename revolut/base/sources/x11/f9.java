package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes20.dex */
public final class f9 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f9 f301849c = new f9();

    private f9() {
        super(338, 339);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `recurring_payments`", "CREATE TABLE IF NOT EXISTS `recurring_payments` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `receiver` TEXT, `speed` TEXT, `updatedDate` INTEGER, `startDate` TEXT, `nextDate` TEXT, `endDate` TEXT, `period` TEXT, `frequency` TEXT, `recurring` INTEGER, `estimated` INTEGER, `autoExchangeEnabled` INTEGER, `fee` TEXT, `sourceCurrency` TEXT, `currency` TEXT NOT NULL, `amount` INTEGER, `title` TEXT, `description` TEXT, `transferReason` TEXT, `receiverInfoRecurringBuy` TEXT, `recieverInfoBeneficiary` TEXT, `recieverInfoRecipient` TEXT, `recieverInfoCreditor` TEXT, `receiverInfoVault` TEXT, `receiverInfoMerchant` TEXT, `receiverCreditEntity` TEXT, `receiverPayLaterEntity` TEXT, `receiverLoanEntity` TEXT, `receiverAccountInfo` TEXT, `senderAccountInfo` TEXT, `billMoneyBoxId` TEXT, `side` TEXT, `day` INTEGER NOT NULL, `gifUrl` TEXT, `linkedTransactionsIds` TEXT, `planInfo` TEXT, `wallet_id` TEXT, `initiator_id` TEXT, `initiator_name` TEXT, `name` TEXT, `pending_refund_sender_info` TEXT, `referenceFields` TEXT, PRIMARY KEY(`id`))");
    }
}
