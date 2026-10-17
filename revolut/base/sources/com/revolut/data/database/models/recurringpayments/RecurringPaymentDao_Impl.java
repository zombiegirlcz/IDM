package com.revolut.data.database.models.recurringpayments;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import b21.a;
import c86.c;
import com.revolut.data.database.models.apm.UpiReceiverEmbeddedEntity;
import com.revolut.data.database.models.apm.typeconverter.RecurringPaymentUpiReceiverInfoEntityTypeConverter;
import com.revolut.data.database.models.banktransfer.BankTransferTypeEmbeddedEntity;
import com.revolut.data.database.models.banktransfer.typeconverter.BankTransferTypeConverter;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.typeconverter.BeneficiaryTypeConverter;
import com.revolut.data.database.models.credit.CreditReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.LoanReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.PayLaterReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.typeconverter.CreditReceiverTypeConverter;
import com.revolut.data.database.models.credit.typeconverter.LoanReceiverTypeConverter;
import com.revolut.data.database.models.credit.typeconverter.PayLaterReceiverTypeConverter;
import com.revolut.data.database.models.creditor.CreditorEmbeddedEntity;
import com.revolut.data.database.models.creditor.typeconverter.CreditorTypeConverter;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaEmbeddedEntity;
import com.revolut.data.database.models.endcriteria.typeconverter.RecurringPaymentEndCriteriaConverter;
import com.revolut.data.database.models.paymentcounterparty.PaymentCounterpartyReceiverInfoEntity;
import com.revolut.data.database.models.paymentcounterparty.typeconverter.RecurringCounterpartyReceiverInfoConverter;
import com.revolut.data.database.models.premium.RecurringPaymentPlanInfoTypeConverter;
import com.revolut.data.database.models.premium.RecurringPlanInfoEmbeddedEntity;
import com.revolut.data.database.models.recipient.RecipientEmbeddedEntity;
import com.revolut.data.database.models.recipient.typeconverter.RecipientTypeConverter;
import com.revolut.data.database.models.recurringbuys.RecurringBuyReceiverInfoEmbeddedEntity;
import com.revolut.data.database.models.recurringbuys.typeconverter.RecurringBuyReceiverInfoTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.MerchantTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.PendingRefundSenderInfoTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentBillDetailsEmbeddedEntityTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentFrequencyConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentFundsSourceEmbeddedEntityTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentMethodConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentMethodDetailsTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentSchemeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.TransferReferenceTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.WalletAutomationEmbeddedEntityTypeConverter;
import com.revolut.data.database.models.transfer.TransferReasonEmbeddedEntity;
import com.revolut.data.database.models.transfer.typeconverter.TransferReasonTypeConverter;
import com.revolut.data.database.models.vaults.VaultReceiverInfoEmbeddedEntity;
import com.revolut.data.database.models.vaults.typeconverter.VaultReceiverInfoTypeConverter;
import com.revolut.data.database.models.wallet.account.WalletAccountDetailsEntity;
import com.revolut.data.database.models.wallet.account.WalletAccountDetailsTypeConverter;
import com.revolut.data.utils.gson.GsonHolder;
import efm.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import jo3.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecurringPaymentDao_Impl extends RecurringPaymentDao {
    private final RoomDatabase __db;
    private RecurringPaymentBillDetailsEmbeddedEntityTypeConverter __recurringPaymentBillDetailsEmbeddedEntityTypeConverter;
    private RecurringPaymentEndCriteriaConverter __recurringPaymentEndCriteriaConverter;
    private RecurringPaymentFundsSourceEmbeddedEntityTypeConverter __recurringPaymentFundsSourceEmbeddedEntityTypeConverter;
    private RecurringPaymentMethodConverter __recurringPaymentMethodConverter;
    private RecurringPaymentSchemeConverter __recurringPaymentSchemeConverter;
    private WalletAutomationEmbeddedEntityTypeConverter __walletAutomationEmbeddedEntityTypeConverter;
    private final RecurringPaymentTypeConverter __recurringPaymentTypeConverter = new RecurringPaymentTypeConverter();
    private final BankTransferTypeConverter __bankTransferTypeConverter = new BankTransferTypeConverter();
    private final RecurringPaymentFrequencyConverter __recurringPaymentFrequencyConverter = new RecurringPaymentFrequencyConverter();
    private final a __commonTypeConverters = new a();
    private final TransferReasonTypeConverter __transferReasonTypeConverter = new TransferReasonTypeConverter();
    private final RecurringBuyReceiverInfoTypeConverter __recurringBuyReceiverInfoTypeConverter = new RecurringBuyReceiverInfoTypeConverter();
    private final BeneficiaryTypeConverter __beneficiaryTypeConverter = new BeneficiaryTypeConverter();
    private final RecipientTypeConverter __recipientTypeConverter = new RecipientTypeConverter();
    private final CreditorTypeConverter __creditorTypeConverter = new CreditorTypeConverter();
    private final VaultReceiverInfoTypeConverter __vaultReceiverInfoTypeConverter = new VaultReceiverInfoTypeConverter();
    private final MerchantTypeConverter __merchantTypeConverter = new MerchantTypeConverter();
    private final CreditReceiverTypeConverter __creditReceiverTypeConverter = new CreditReceiverTypeConverter();
    private final PayLaterReceiverTypeConverter __payLaterReceiverTypeConverter = new PayLaterReceiverTypeConverter();
    private final LoanReceiverTypeConverter __loanReceiverTypeConverter = new LoanReceiverTypeConverter();
    private final WalletAccountDetailsTypeConverter __walletAccountDetailsTypeConverter = new WalletAccountDetailsTypeConverter();
    private final RecurringCounterpartyReceiverInfoConverter __recurringCounterpartyReceiverInfoConverter = new RecurringCounterpartyReceiverInfoConverter();
    private final RecurringPaymentMethodDetailsTypeConverter __recurringPaymentMethodDetailsTypeConverter = new RecurringPaymentMethodDetailsTypeConverter();
    private final RecurringPaymentUpiReceiverInfoEntityTypeConverter __recurringPaymentUpiReceiverInfoEntityTypeConverter = new RecurringPaymentUpiReceiverInfoEntityTypeConverter();
    private final RecurringPaymentPlanInfoTypeConverter __recurringPaymentPlanInfoTypeConverter = new RecurringPaymentPlanInfoTypeConverter();
    private final PendingRefundSenderInfoTypeConverter __pendingRefundSenderInfoTypeConverter = new PendingRefundSenderInfoTypeConverter();
    private final TransferReferenceTypeConverter __transferReferenceTypeConverter = new TransferReferenceTypeConverter();
    private final EntityInsertAdapter<RecurringPaymentEntity> __insertAdapterOfRecurringPaymentEntity = new EntityInsertAdapter<RecurringPaymentEntity>() { // from class: com.revolut.data.database.models.recurringpayments.RecurringPaymentDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `recurring_payments` (`id`,`state`,`type`,`receiver`,`speed`,`updatedDate`,`startDate`,`nextDate`,`endDate`,`period`,`frequency`,`recurring`,`estimated`,`autoExchangeEnabled`,`fee`,`sourceCurrency`,`currency`,`amount`,`title`,`description`,`transferReason`,`receiverInfoRecurringBuy`,`recieverInfoBeneficiary`,`recieverInfoRecipient`,`recieverInfoCreditor`,`receiverInfoVault`,`receiverInfoMerchant`,`receiverCreditEntity`,`receiverPayLaterEntity`,`receiverLoanEntity`,`receiverAccountInfo`,`cobrandsLogo`,`receiverPaymentCounterpartyInfo`,`receiverPaymentMethodDetails`,`receiverUpiInfo`,`senderAccountInfo`,`billMoneyBoxId`,`side`,`day`,`gifUrl`,`linkedTransactionsIds`,`planInfo`,`wallet_id`,`initiator_id`,`initiator_name`,`name`,`pending_refund_sender_info`,`referenceFields`,`sourcePocketId`,`sourcePocketScope`,`payment_scheme`,`payment_method`,`end_criteria`,`availableActions`,`fundsSource`,`bill_details`,`walletAutomation`,`initiationMethod`,`request_frequency_confirmation`,`deactivatedDate`,`blockExpiryDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull RecurringPaymentEntity recurringPaymentEntity) {
            String strK;
            if (recurringPaymentEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, recurringPaymentEntity.getId());
            }
            String strStateToJson = RecurringPaymentDao_Impl.this.__recurringPaymentTypeConverter.stateToJson(recurringPaymentEntity.getState());
            if (strStateToJson == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, strStateToJson);
            }
            String strTypeToJson = RecurringPaymentDao_Impl.this.__recurringPaymentTypeConverter.typeToJson(recurringPaymentEntity.getType());
            if (strTypeToJson == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, strTypeToJson);
            }
            if (recurringPaymentEntity.getReceiver() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, recurringPaymentEntity.getReceiver());
            }
            String strTypeToJson2 = RecurringPaymentDao_Impl.this.__bankTransferTypeConverter.typeToJson(recurringPaymentEntity.getSpeed());
            if (strTypeToJson2 == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, strTypeToJson2);
            }
            if (recurringPaymentEntity.getUpdatedDate() == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindLong(6, recurringPaymentEntity.getUpdatedDate().longValue());
            }
            if (recurringPaymentEntity.getStartDate() == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, recurringPaymentEntity.getStartDate());
            }
            if (recurringPaymentEntity.getNextDate() == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindText(8, recurringPaymentEntity.getNextDate());
            }
            if (recurringPaymentEntity.getEndDate() == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindText(9, recurringPaymentEntity.getEndDate());
            }
            if (recurringPaymentEntity.getPeriod() == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, recurringPaymentEntity.getPeriod());
            }
            String strEntityToJson = RecurringPaymentDao_Impl.this.__recurringPaymentFrequencyConverter.entityToJson(recurringPaymentEntity.getFrequency());
            if (strEntityToJson == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, strEntityToJson);
            }
            if ((recurringPaymentEntity.getRecurring() == null ? null : Integer.valueOf(recurringPaymentEntity.getRecurring().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(12);
            } else {
                sQLiteStatement.bindLong(12, r0.intValue());
            }
            if ((recurringPaymentEntity.getEstimated() == null ? null : Integer.valueOf(recurringPaymentEntity.getEstimated().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(13);
            } else {
                sQLiteStatement.bindLong(13, r0.intValue());
            }
            if ((recurringPaymentEntity.getAutoExchangeEnabled() == null ? null : Integer.valueOf(recurringPaymentEntity.getAutoExchangeEnabled().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(14);
            } else {
                sQLiteStatement.bindLong(14, r0.intValue());
            }
            a aVar = RecurringPaymentDao_Impl.this.__commonTypeConverters;
            b fee2 = recurringPaymentEntity.getFee();
            aVar.getClass();
            String strO = a.o(fee2);
            if (strO == null) {
                sQLiteStatement.bindNull(15);
            } else {
                sQLiteStatement.bindText(15, strO);
            }
            if (recurringPaymentEntity.getSourceCurrency() == null) {
                sQLiteStatement.bindNull(16);
            } else {
                sQLiteStatement.bindText(16, recurringPaymentEntity.getSourceCurrency());
            }
            if (recurringPaymentEntity.getCurrency() == null) {
                sQLiteStatement.bindNull(17);
            } else {
                sQLiteStatement.bindText(17, recurringPaymentEntity.getCurrency());
            }
            if (recurringPaymentEntity.getAmount() == null) {
                sQLiteStatement.bindNull(18);
            } else {
                sQLiteStatement.bindLong(18, recurringPaymentEntity.getAmount().longValue());
            }
            if (recurringPaymentEntity.getTitle() == null) {
                sQLiteStatement.bindNull(19);
            } else {
                sQLiteStatement.bindText(19, recurringPaymentEntity.getTitle());
            }
            if (recurringPaymentEntity.getDescription() == null) {
                sQLiteStatement.bindNull(20);
            } else {
                sQLiteStatement.bindText(20, recurringPaymentEntity.getDescription());
            }
            String json = RecurringPaymentDao_Impl.this.__transferReasonTypeConverter.toJson(recurringPaymentEntity.getTransferReason());
            if (json == null) {
                sQLiteStatement.bindNull(21);
            } else {
                sQLiteStatement.bindText(21, json);
            }
            String json2 = RecurringPaymentDao_Impl.this.__recurringBuyReceiverInfoTypeConverter.toJson(recurringPaymentEntity.getReceiverInfoRecurringBuy());
            if (json2 == null) {
                sQLiteStatement.bindNull(22);
            } else {
                sQLiteStatement.bindText(22, json2);
            }
            String strFromBeneficiaryToJson = RecurringPaymentDao_Impl.this.__beneficiaryTypeConverter.fromBeneficiaryToJson(recurringPaymentEntity.getRecieverInfoBeneficiary());
            if (strFromBeneficiaryToJson == null) {
                sQLiteStatement.bindNull(23);
            } else {
                sQLiteStatement.bindText(23, strFromBeneficiaryToJson);
            }
            String strFromRecipientToJson = RecurringPaymentDao_Impl.this.__recipientTypeConverter.fromRecipientToJson(recurringPaymentEntity.getRecieverInfoRecipient());
            if (strFromRecipientToJson == null) {
                sQLiteStatement.bindNull(24);
            } else {
                sQLiteStatement.bindText(24, strFromRecipientToJson);
            }
            String strFromCreditorToJson = RecurringPaymentDao_Impl.this.__creditorTypeConverter.fromCreditorToJson(recurringPaymentEntity.getRecieverInfoCreditor());
            if (strFromCreditorToJson == null) {
                sQLiteStatement.bindNull(25);
            } else {
                sQLiteStatement.bindText(25, strFromCreditorToJson);
            }
            String json3 = RecurringPaymentDao_Impl.this.__vaultReceiverInfoTypeConverter.toJson(recurringPaymentEntity.getReceiverInfoVault());
            if (json3 == null) {
                sQLiteStatement.bindNull(26);
            } else {
                sQLiteStatement.bindText(26, json3);
            }
            String strFromMerchantToJson = RecurringPaymentDao_Impl.this.__merchantTypeConverter.fromMerchantToJson(recurringPaymentEntity.getReceiverInfoMerchant());
            if (strFromMerchantToJson == null) {
                sQLiteStatement.bindNull(27);
            } else {
                sQLiteStatement.bindText(27, strFromMerchantToJson);
            }
            String strFromCreditReceiverToJson = RecurringPaymentDao_Impl.this.__creditReceiverTypeConverter.fromCreditReceiverToJson(recurringPaymentEntity.getReceiverCreditEntity());
            if (strFromCreditReceiverToJson == null) {
                sQLiteStatement.bindNull(28);
            } else {
                sQLiteStatement.bindText(28, strFromCreditReceiverToJson);
            }
            String strFromPayLaterReceiverToJson = RecurringPaymentDao_Impl.this.__payLaterReceiverTypeConverter.fromPayLaterReceiverToJson(recurringPaymentEntity.getReceiverPayLaterEntity());
            if (strFromPayLaterReceiverToJson == null) {
                sQLiteStatement.bindNull(29);
            } else {
                sQLiteStatement.bindText(29, strFromPayLaterReceiverToJson);
            }
            String strFromLoanReceiverToJson = RecurringPaymentDao_Impl.this.__loanReceiverTypeConverter.fromLoanReceiverToJson(recurringPaymentEntity.getReceiverLoanEntity());
            if (strFromLoanReceiverToJson == null) {
                sQLiteStatement.bindNull(30);
            } else {
                sQLiteStatement.bindText(30, strFromLoanReceiverToJson);
            }
            String strFromWalletAccountDetailsToJson = RecurringPaymentDao_Impl.this.__walletAccountDetailsTypeConverter.fromWalletAccountDetailsToJson(recurringPaymentEntity.getReceiverAccountInfo());
            if (strFromWalletAccountDetailsToJson == null) {
                sQLiteStatement.bindNull(31);
            } else {
                sQLiteStatement.bindText(31, strFromWalletAccountDetailsToJson);
            }
            if (recurringPaymentEntity.getCobrandsLogo() == null) {
                sQLiteStatement.bindNull(32);
            } else {
                sQLiteStatement.bindText(32, recurringPaymentEntity.getCobrandsLogo());
            }
            String strEntityToJson2 = RecurringPaymentDao_Impl.this.__recurringCounterpartyReceiverInfoConverter.entityToJson(recurringPaymentEntity.getReceiverPaymentCounterpartyInfo());
            if (strEntityToJson2 == null) {
                sQLiteStatement.bindNull(33);
            } else {
                sQLiteStatement.bindText(33, strEntityToJson2);
            }
            String strFromMethodDetailsToJson = RecurringPaymentDao_Impl.this.__recurringPaymentMethodDetailsTypeConverter.fromMethodDetailsToJson(recurringPaymentEntity.getReceiverPaymentMethodDetails());
            if (strFromMethodDetailsToJson == null) {
                sQLiteStatement.bindNull(34);
            } else {
                sQLiteStatement.bindText(34, strFromMethodDetailsToJson);
            }
            String strEntityToJson3 = RecurringPaymentDao_Impl.this.__recurringPaymentUpiReceiverInfoEntityTypeConverter.entityToJson(recurringPaymentEntity.getReceiverUpiInfo());
            if (strEntityToJson3 == null) {
                sQLiteStatement.bindNull(35);
            } else {
                sQLiteStatement.bindText(35, strEntityToJson3);
            }
            String strFromWalletAccountDetailsToJson2 = RecurringPaymentDao_Impl.this.__walletAccountDetailsTypeConverter.fromWalletAccountDetailsToJson(recurringPaymentEntity.getSenderAccountInfo());
            if (strFromWalletAccountDetailsToJson2 == null) {
                sQLiteStatement.bindNull(36);
            } else {
                sQLiteStatement.bindText(36, strFromWalletAccountDetailsToJson2);
            }
            if (recurringPaymentEntity.getBillMoneyBoxId() == null) {
                sQLiteStatement.bindNull(37);
            } else {
                sQLiteStatement.bindText(37, recurringPaymentEntity.getBillMoneyBoxId());
            }
            if (recurringPaymentEntity.getSide() == null) {
                sQLiteStatement.bindNull(38);
            } else {
                sQLiteStatement.bindText(38, recurringPaymentEntity.getSide());
            }
            sQLiteStatement.bindLong(39, recurringPaymentEntity.getDay());
            if (recurringPaymentEntity.getGifUrl() == null) {
                sQLiteStatement.bindNull(40);
            } else {
                sQLiteStatement.bindText(40, recurringPaymentEntity.getGifUrl());
            }
            a aVar2 = RecurringPaymentDao_Impl.this.__commonTypeConverters;
            Set<String> linkedTransactionsIds = recurringPaymentEntity.getLinkedTransactionsIds();
            aVar2.getClass();
            if (linkedTransactionsIds != null) {
                strK = GsonHolder.a().k(linkedTransactionsIds);
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else {
                strK = null;
            }
            if (strK == null) {
                sQLiteStatement.bindNull(41);
            } else {
                sQLiteStatement.bindText(41, strK);
            }
            String strFromPlanInfoToJson = RecurringPaymentDao_Impl.this.__recurringPaymentPlanInfoTypeConverter.fromPlanInfoToJson(recurringPaymentEntity.getPlanInfo());
            if (strFromPlanInfoToJson == null) {
                sQLiteStatement.bindNull(42);
            } else {
                sQLiteStatement.bindText(42, strFromPlanInfoToJson);
            }
            if (recurringPaymentEntity.getWalletId() == null) {
                sQLiteStatement.bindNull(43);
            } else {
                sQLiteStatement.bindText(43, recurringPaymentEntity.getWalletId());
            }
            if (recurringPaymentEntity.getInitiatorId() == null) {
                sQLiteStatement.bindNull(44);
            } else {
                sQLiteStatement.bindText(44, recurringPaymentEntity.getInitiatorId());
            }
            if (recurringPaymentEntity.getInitiatorName() == null) {
                sQLiteStatement.bindNull(45);
            } else {
                sQLiteStatement.bindText(45, recurringPaymentEntity.getInitiatorName());
            }
            if (recurringPaymentEntity.getName() == null) {
                sQLiteStatement.bindNull(46);
            } else {
                sQLiteStatement.bindText(46, recurringPaymentEntity.getName());
            }
            String strFromPendingRefundSenderInfoToJson = RecurringPaymentDao_Impl.this.__pendingRefundSenderInfoTypeConverter.fromPendingRefundSenderInfoToJson(recurringPaymentEntity.getPendingRefundSenderInfo());
            if (strFromPendingRefundSenderInfoToJson == null) {
                sQLiteStatement.bindNull(47);
            } else {
                sQLiteStatement.bindText(47, strFromPendingRefundSenderInfoToJson);
            }
            String strFromTransferReferencesToJson = RecurringPaymentDao_Impl.this.__transferReferenceTypeConverter.fromTransferReferencesToJson(recurringPaymentEntity.getReferenceFields());
            if (strFromTransferReferencesToJson == null) {
                sQLiteStatement.bindNull(48);
            } else {
                sQLiteStatement.bindText(48, strFromTransferReferencesToJson);
            }
            if (recurringPaymentEntity.getSourcePocketId() == null) {
                sQLiteStatement.bindNull(49);
            } else {
                sQLiteStatement.bindText(49, recurringPaymentEntity.getSourcePocketId());
            }
            if (recurringPaymentEntity.getSourcePocketScope() == null) {
                sQLiteStatement.bindNull(50);
            } else {
                sQLiteStatement.bindText(50, recurringPaymentEntity.getSourcePocketScope());
            }
            String strEntityToJson4 = RecurringPaymentDao_Impl.this.__recurringPaymentSchemeConverter().entityToJson(recurringPaymentEntity.getPaymentScheme());
            if (strEntityToJson4 == null) {
                sQLiteStatement.bindNull(51);
            } else {
                sQLiteStatement.bindText(51, strEntityToJson4);
            }
            String strEntityToJson5 = RecurringPaymentDao_Impl.this.__recurringPaymentMethodConverter().entityToJson(recurringPaymentEntity.getPaymentMethod());
            if (strEntityToJson5 == null) {
                sQLiteStatement.bindNull(52);
            } else {
                sQLiteStatement.bindText(52, strEntityToJson5);
            }
            String strEntityToJson6 = RecurringPaymentDao_Impl.this.__recurringPaymentEndCriteriaConverter().entityToJson(recurringPaymentEntity.getEndCriteria());
            if (strEntityToJson6 == null) {
                sQLiteStatement.bindNull(53);
            } else {
                sQLiteStatement.bindText(53, strEntityToJson6);
            }
            a aVar3 = RecurringPaymentDao_Impl.this.__commonTypeConverters;
            List<String> availableActions = recurringPaymentEntity.getAvailableActions();
            aVar3.getClass();
            String strM = a.m(availableActions);
            if (strM == null) {
                sQLiteStatement.bindNull(54);
            } else {
                sQLiteStatement.bindText(54, strM);
            }
            String strEntityToJson7 = RecurringPaymentDao_Impl.this.__recurringPaymentFundsSourceEmbeddedEntityTypeConverter().entityToJson(recurringPaymentEntity.getFundsSource());
            if (strEntityToJson7 == null) {
                sQLiteStatement.bindNull(55);
            } else {
                sQLiteStatement.bindText(55, strEntityToJson7);
            }
            String strEntityToJson8 = RecurringPaymentDao_Impl.this.__recurringPaymentBillDetailsEmbeddedEntityTypeConverter().entityToJson(recurringPaymentEntity.getBillDetails());
            if (strEntityToJson8 == null) {
                sQLiteStatement.bindNull(56);
            } else {
                sQLiteStatement.bindText(56, strEntityToJson8);
            }
            String strEntityToJson9 = RecurringPaymentDao_Impl.this.__walletAutomationEmbeddedEntityTypeConverter().entityToJson(recurringPaymentEntity.getWalletAutomation());
            if (strEntityToJson9 == null) {
                sQLiteStatement.bindNull(57);
            } else {
                sQLiteStatement.bindText(57, strEntityToJson9);
            }
            if (recurringPaymentEntity.getInitiationMethod() == null) {
                sQLiteStatement.bindNull(58);
            } else {
                sQLiteStatement.bindText(58, recurringPaymentEntity.getInitiationMethod());
            }
            if ((recurringPaymentEntity.getRequestFrequencyConfirmation() != null ? Integer.valueOf(recurringPaymentEntity.getRequestFrequencyConfirmation().booleanValue() ? 1 : 0) : null) == null) {
                sQLiteStatement.bindNull(59);
            } else {
                sQLiteStatement.bindLong(59, r1.intValue());
            }
            if (recurringPaymentEntity.getDeactivatedDate() == null) {
                sQLiteStatement.bindNull(60);
            } else {
                sQLiteStatement.bindText(60, recurringPaymentEntity.getDeactivatedDate());
            }
            if (recurringPaymentEntity.getBlockExpiryDate() == null) {
                sQLiteStatement.bindNull(61);
            } else {
                sQLiteStatement.bindText(61, recurringPaymentEntity.getBlockExpiryDate());
            }
        }
    };

    public RecurringPaymentDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RecurringPaymentBillDetailsEmbeddedEntityTypeConverter __recurringPaymentBillDetailsEmbeddedEntityTypeConverter() {
        try {
            if (this.__recurringPaymentBillDetailsEmbeddedEntityTypeConverter == null) {
                this.__recurringPaymentBillDetailsEmbeddedEntityTypeConverter = (RecurringPaymentBillDetailsEmbeddedEntityTypeConverter) this.__db.getTypeConverter(RecurringPaymentBillDetailsEmbeddedEntityTypeConverter.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.__recurringPaymentBillDetailsEmbeddedEntityTypeConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RecurringPaymentEndCriteriaConverter __recurringPaymentEndCriteriaConverter() {
        try {
            if (this.__recurringPaymentEndCriteriaConverter == null) {
                this.__recurringPaymentEndCriteriaConverter = (RecurringPaymentEndCriteriaConverter) this.__db.getTypeConverter(RecurringPaymentEndCriteriaConverter.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.__recurringPaymentEndCriteriaConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RecurringPaymentFundsSourceEmbeddedEntityTypeConverter __recurringPaymentFundsSourceEmbeddedEntityTypeConverter() {
        try {
            if (this.__recurringPaymentFundsSourceEmbeddedEntityTypeConverter == null) {
                this.__recurringPaymentFundsSourceEmbeddedEntityTypeConverter = (RecurringPaymentFundsSourceEmbeddedEntityTypeConverter) this.__db.getTypeConverter(RecurringPaymentFundsSourceEmbeddedEntityTypeConverter.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.__recurringPaymentFundsSourceEmbeddedEntityTypeConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RecurringPaymentMethodConverter __recurringPaymentMethodConverter() {
        try {
            if (this.__recurringPaymentMethodConverter == null) {
                this.__recurringPaymentMethodConverter = (RecurringPaymentMethodConverter) this.__db.getTypeConverter(RecurringPaymentMethodConverter.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.__recurringPaymentMethodConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RecurringPaymentSchemeConverter __recurringPaymentSchemeConverter() {
        try {
            if (this.__recurringPaymentSchemeConverter == null) {
                this.__recurringPaymentSchemeConverter = (RecurringPaymentSchemeConverter) this.__db.getTypeConverter(RecurringPaymentSchemeConverter.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.__recurringPaymentSchemeConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized WalletAutomationEmbeddedEntityTypeConverter __walletAutomationEmbeddedEntityTypeConverter() {
        try {
            if (this.__walletAutomationEmbeddedEntityTypeConverter == null) {
                this.__walletAutomationEmbeddedEntityTypeConverter = (WalletAutomationEmbeddedEntityTypeConverter) this.__db.getTypeConverter(WalletAutomationEmbeddedEntityTypeConverter.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.__walletAutomationEmbeddedEntityTypeConverter;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Arrays.asList(RecurringPaymentSchemeConverter.class, RecurringPaymentMethodConverter.class, RecurringPaymentEndCriteriaConverter.class, RecurringPaymentFundsSourceEmbeddedEntityTypeConverter.class, RecurringPaymentBillDetailsEmbeddedEntityTypeConverter.class, WalletAutomationEmbeddedEntityTypeConverter.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteById$3(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM recurring_payments WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
            sQLiteStatementPrepare.close();
            return numValueOf;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAllSync$1(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        Integer numValueOf;
        Boolean boolValueOf;
        int i3;
        Integer numValueOf2;
        Boolean boolValueOf2;
        int i5;
        Boolean bool;
        Integer numValueOf3;
        Boolean boolValueOf3;
        String text2;
        int i6;
        String text3;
        String text4;
        int i21;
        String text5;
        String text6;
        String text7;
        Integer numValueOf4;
        Boolean boolValueOf4;
        RecurringPaymentDao_Impl recurringPaymentDao_Impl = this;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM recurring_payments ORDER BY updatedDate DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiver");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speed");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDate");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextDate");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endDate");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "frequency");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurring");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimated");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoExchangeEnabled");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fee");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourceCurrency");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transferReason");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverInfoRecurringBuy");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recieverInfoBeneficiary");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recieverInfoRecipient");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recieverInfoCreditor");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverInfoVault");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverInfoMerchant");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverCreditEntity");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverPayLaterEntity");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverLoanEntity");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverAccountInfo");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cobrandsLogo");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverPaymentCounterpartyInfo");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverPaymentMethodDetails");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverUpiInfo");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "senderAccountInfo");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "billMoneyBoxId");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "side");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "day");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gifUrl");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "linkedTransactionsIds");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "planInfo");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiator_id");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiator_name");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pending_refund_sender_info");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "referenceFields");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourcePocketId");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourcePocketScope");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "payment_scheme");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "payment_method");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end_criteria");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "availableActions");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fundsSource");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bill_details");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletAutomation");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiationMethod");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "request_frequency_confirmation");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deactivatedDate");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockExpiryDate");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                int i22 = columnIndexOrThrow2;
                RecurringPaymentStateEmbeddedEntity recurringPaymentStateEmbeddedEntityJsonToState = recurringPaymentDao_Impl.__recurringPaymentTypeConverter.jsonToState(text);
                RecurringPaymentTypeEmbeddedEntity recurringPaymentTypeEmbeddedEntityJsonToType = recurringPaymentDao_Impl.__recurringPaymentTypeConverter.jsonToType(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                BankTransferTypeEmbeddedEntity bankTransferTypeEmbeddedEntityJsonToType = recurringPaymentDao_Impl.__bankTransferTypeConverter.jsonToType(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                RecurringPaymentFrequencyEmbeddedEntity recurringPaymentFrequencyEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentFrequencyConverter.jsonToEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                }
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i3 = columnIndexOrThrow4;
                    numValueOf2 = null;
                } else {
                    i3 = columnIndexOrThrow4;
                    numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                }
                if (numValueOf2 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                int i32 = columnIndexOrThrow14;
                if (sQLiteStatementPrepare.isNull(i32)) {
                    i5 = i3;
                    bool = boolValueOf2;
                    numValueOf3 = null;
                } else {
                    i5 = i3;
                    bool = boolValueOf2;
                    numValueOf3 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i32));
                }
                if (numValueOf3 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                }
                int i33 = columnIndexOrThrow15;
                String text14 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                int i43 = i2;
                recurringPaymentDao_Impl.__commonTypeConverters.getClass();
                b bVarG = a.g(text14);
                int i59 = columnIndexOrThrow16;
                String text15 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                columnIndexOrThrow16 = i59;
                int i66 = columnIndexOrThrow17;
                String text16 = sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                columnIndexOrThrow17 = i66;
                int i74 = columnIndexOrThrow18;
                Long lValueOf2 = sQLiteStatementPrepare.isNull(i74) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i74));
                columnIndexOrThrow18 = i74;
                int i92 = columnIndexOrThrow19;
                String text17 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                columnIndexOrThrow19 = i92;
                int i96 = columnIndexOrThrow20;
                String text18 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                columnIndexOrThrow20 = i96;
                int i99 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i99)) {
                    columnIndexOrThrow21 = i99;
                    text2 = null;
                } else {
                    columnIndexOrThrow21 = i99;
                    text2 = sQLiteStatementPrepare.getText(i99);
                }
                Boolean bool2 = boolValueOf3;
                TransferReasonEmbeddedEntity transferReasonEmbeddedEntityFromJson = recurringPaymentDao_Impl.__transferReasonTypeConverter.fromJson(text2);
                int i100 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i100;
                RecurringBuyReceiverInfoEmbeddedEntity recurringBuyReceiverInfoEmbeddedEntityFromJson = recurringPaymentDao_Impl.__recurringBuyReceiverInfoTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100));
                int i101 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i101;
                BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntityFromJsonToBeneficiary = recurringPaymentDao_Impl.__beneficiaryTypeConverter.fromJsonToBeneficiary(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                int i102 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i102;
                RecipientEmbeddedEntity recipientEmbeddedEntityFromJsonToRecipient = recurringPaymentDao_Impl.__recipientTypeConverter.fromJsonToRecipient(sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102));
                int i103 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i103;
                CreditorEmbeddedEntity creditorEmbeddedEntityFromJsonToCreditor = recurringPaymentDao_Impl.__creditorTypeConverter.fromJsonToCreditor(sQLiteStatementPrepare.isNull(i103) ? null : sQLiteStatementPrepare.getText(i103));
                int i104 = columnIndexOrThrow26;
                columnIndexOrThrow26 = i104;
                VaultReceiverInfoEmbeddedEntity vaultReceiverInfoEmbeddedEntityFromJson = recurringPaymentDao_Impl.__vaultReceiverInfoTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104));
                int i105 = columnIndexOrThrow27;
                columnIndexOrThrow27 = i105;
                MerchantEmbeddedEntity merchantEmbeddedEntityFromJsonToMerchant = recurringPaymentDao_Impl.__merchantTypeConverter.fromJsonToMerchant(sQLiteStatementPrepare.isNull(i105) ? null : sQLiteStatementPrepare.getText(i105));
                int i106 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i106;
                CreditReceiverEmbeddedEntity creditReceiverEmbeddedEntityFromJsonToCreditReceiver = recurringPaymentDao_Impl.__creditReceiverTypeConverter.fromJsonToCreditReceiver(sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106));
                int i107 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i107;
                PayLaterReceiverEmbeddedEntity payLaterReceiverEmbeddedEntityFromJsonToPayLaterReceiver = recurringPaymentDao_Impl.__payLaterReceiverTypeConverter.fromJsonToPayLaterReceiver(sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107));
                int i108 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i108;
                LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntityFromJsonToLoanReceiver = recurringPaymentDao_Impl.__loanReceiverTypeConverter.fromJsonToLoanReceiver(sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108));
                int i109 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i109;
                WalletAccountDetailsEntity walletAccountDetailsEntityFromJsonToWalletAccountDetails = recurringPaymentDao_Impl.__walletAccountDetailsTypeConverter.fromJsonToWalletAccountDetails(sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109));
                int i110 = columnIndexOrThrow32;
                String text19 = sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110);
                int i111 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i111)) {
                    i6 = i110;
                    text3 = null;
                } else {
                    i6 = i110;
                    text3 = sQLiteStatementPrepare.getText(i111);
                }
                PaymentCounterpartyReceiverInfoEntity paymentCounterpartyReceiverInfoEntityJsonToEntity = recurringPaymentDao_Impl.__recurringCounterpartyReceiverInfoConverter.jsonToEntity(text3);
                int i112 = columnIndexOrThrow34;
                columnIndexOrThrow34 = i112;
                RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntityFromJsonToMethodDetails = recurringPaymentDao_Impl.__recurringPaymentMethodDetailsTypeConverter.fromJsonToMethodDetails(sQLiteStatementPrepare.isNull(i112) ? null : sQLiteStatementPrepare.getText(i112));
                int i113 = columnIndexOrThrow35;
                columnIndexOrThrow35 = i113;
                UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentUpiReceiverInfoEntityTypeConverter.jsonToEntity(sQLiteStatementPrepare.isNull(i113) ? null : sQLiteStatementPrepare.getText(i113));
                int i114 = columnIndexOrThrow36;
                columnIndexOrThrow36 = i114;
                WalletAccountDetailsEntity walletAccountDetailsEntityFromJsonToWalletAccountDetails2 = recurringPaymentDao_Impl.__walletAccountDetailsTypeConverter.fromJsonToWalletAccountDetails(sQLiteStatementPrepare.isNull(i114) ? null : sQLiteStatementPrepare.getText(i114));
                int i115 = columnIndexOrThrow37;
                String text20 = sQLiteStatementPrepare.isNull(i115) ? null : sQLiteStatementPrepare.getText(i115);
                int i116 = columnIndexOrThrow38;
                if (sQLiteStatementPrepare.isNull(i116)) {
                    text4 = null;
                    columnIndexOrThrow37 = i115;
                    i21 = i33;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i116);
                    i21 = i33;
                    columnIndexOrThrow37 = i115;
                }
                int i117 = columnIndexOrThrow39;
                int i118 = (int) sQLiteStatementPrepare.getLong(i117);
                int i119 = columnIndexOrThrow40;
                String text21 = sQLiteStatementPrepare.isNull(i119) ? null : sQLiteStatementPrepare.getText(i119);
                int i120 = columnIndexOrThrow41;
                String text22 = sQLiteStatementPrepare.isNull(i120) ? null : sQLiteStatementPrepare.getText(i120);
                recurringPaymentDao_Impl.__commonTypeConverters.getClass();
                Set setL = a.l(text22);
                int i121 = columnIndexOrThrow42;
                if (sQLiteStatementPrepare.isNull(i121)) {
                    columnIndexOrThrow42 = i121;
                    text5 = null;
                } else {
                    columnIndexOrThrow42 = i121;
                    text5 = sQLiteStatementPrepare.getText(i121);
                }
                RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntityFromJsonToPlanInfo = recurringPaymentDao_Impl.__recurringPaymentPlanInfoTypeConverter.fromJsonToPlanInfo(text5);
                int i122 = columnIndexOrThrow43;
                String text23 = sQLiteStatementPrepare.isNull(i122) ? null : sQLiteStatementPrepare.getText(i122);
                int i123 = columnIndexOrThrow44;
                String text24 = sQLiteStatementPrepare.isNull(i123) ? null : sQLiteStatementPrepare.getText(i123);
                columnIndexOrThrow43 = i122;
                int i124 = columnIndexOrThrow45;
                String text25 = sQLiteStatementPrepare.isNull(i124) ? null : sQLiteStatementPrepare.getText(i124);
                columnIndexOrThrow45 = i124;
                int i125 = columnIndexOrThrow46;
                String text26 = sQLiteStatementPrepare.isNull(i125) ? null : sQLiteStatementPrepare.getText(i125);
                columnIndexOrThrow46 = i125;
                int i126 = columnIndexOrThrow47;
                if (sQLiteStatementPrepare.isNull(i126)) {
                    columnIndexOrThrow47 = i126;
                    text6 = null;
                } else {
                    columnIndexOrThrow47 = i126;
                    text6 = sQLiteStatementPrepare.getText(i126);
                }
                columnIndexOrThrow44 = i123;
                PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntityFromJsonToPendingRefundSenderInfo = recurringPaymentDao_Impl.__pendingRefundSenderInfoTypeConverter.fromJsonToPendingRefundSenderInfo(text6);
                int i127 = columnIndexOrThrow48;
                columnIndexOrThrow48 = i127;
                TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntityFromJsonToTransferReferences = recurringPaymentDao_Impl.__transferReferenceTypeConverter.fromJsonToTransferReferences(sQLiteStatementPrepare.isNull(i127) ? null : sQLiteStatementPrepare.getText(i127));
                int i128 = columnIndexOrThrow49;
                String text27 = sQLiteStatementPrepare.isNull(i128) ? null : sQLiteStatementPrepare.getText(i128);
                int i129 = columnIndexOrThrow50;
                String text28 = sQLiteStatementPrepare.isNull(i129) ? null : sQLiteStatementPrepare.getText(i129);
                columnIndexOrThrow49 = i128;
                int i130 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i130)) {
                    columnIndexOrThrow51 = i130;
                    text7 = null;
                } else {
                    columnIndexOrThrow51 = i130;
                    text7 = sQLiteStatementPrepare.getText(i130);
                }
                columnIndexOrThrow50 = i129;
                RecurringPaymentSchemeEmbeddedEntity recurringPaymentSchemeEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentSchemeConverter().jsonToEntity(text7);
                int i131 = columnIndexOrThrow52;
                columnIndexOrThrow52 = i131;
                RecurringPaymentMethodEmbeddedEntity recurringPaymentMethodEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentMethodConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i131) ? null : sQLiteStatementPrepare.getText(i131));
                int i132 = columnIndexOrThrow53;
                columnIndexOrThrow53 = i132;
                RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentEndCriteriaConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i132) ? null : sQLiteStatementPrepare.getText(i132));
                int i133 = columnIndexOrThrow54;
                String text29 = sQLiteStatementPrepare.isNull(i133) ? null : sQLiteStatementPrepare.getText(i133);
                columnIndexOrThrow54 = i133;
                recurringPaymentDao_Impl.__commonTypeConverters.getClass();
                List listK = a.k(text29);
                int i134 = columnIndexOrThrow55;
                columnIndexOrThrow55 = i134;
                RecurringPaymentFundsSourceEmbeddedEntity recurringPaymentFundsSourceEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentFundsSourceEmbeddedEntityTypeConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i134) ? null : sQLiteStatementPrepare.getText(i134));
                int i135 = columnIndexOrThrow56;
                columnIndexOrThrow56 = i135;
                RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentBillDetailsEmbeddedEntityTypeConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i135) ? null : sQLiteStatementPrepare.getText(i135));
                int i136 = columnIndexOrThrow57;
                columnIndexOrThrow57 = i136;
                WalletAutomationEmbeddedEntity walletAutomationEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__walletAutomationEmbeddedEntityTypeConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i136) ? null : sQLiteStatementPrepare.getText(i136));
                int i137 = columnIndexOrThrow58;
                String text30 = sQLiteStatementPrepare.isNull(i137) ? null : sQLiteStatementPrepare.getText(i137);
                int i138 = columnIndexOrThrow59;
                if (sQLiteStatementPrepare.isNull(i138)) {
                    columnIndexOrThrow58 = i137;
                    numValueOf4 = null;
                } else {
                    columnIndexOrThrow58 = i137;
                    numValueOf4 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i138));
                }
                if (numValueOf4 == null) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(numValueOf4.intValue() != 0);
                }
                int i139 = columnIndexOrThrow60;
                int i140 = columnIndexOrThrow61;
                columnIndexOrThrow60 = i139;
                arrayList.add(new RecurringPaymentEntity(text8, recurringPaymentStateEmbeddedEntityJsonToState, recurringPaymentTypeEmbeddedEntityJsonToType, text9, bankTransferTypeEmbeddedEntityJsonToType, lValueOf, text10, text11, text12, text13, recurringPaymentFrequencyEmbeddedEntityJsonToEntity, boolValueOf, bool, bool2, bVarG, text15, text16, lValueOf2, text17, text18, transferReasonEmbeddedEntityFromJson, recurringBuyReceiverInfoEmbeddedEntityFromJson, beneficiaryEmbeddedEntityFromJsonToBeneficiary, recipientEmbeddedEntityFromJsonToRecipient, creditorEmbeddedEntityFromJsonToCreditor, vaultReceiverInfoEmbeddedEntityFromJson, merchantEmbeddedEntityFromJsonToMerchant, creditReceiverEmbeddedEntityFromJsonToCreditReceiver, payLaterReceiverEmbeddedEntityFromJsonToPayLaterReceiver, loanReceiverEmbeddedEntityFromJsonToLoanReceiver, walletAccountDetailsEntityFromJsonToWalletAccountDetails, text19, paymentCounterpartyReceiverInfoEntityJsonToEntity, recurringPaymentMethodDetailsEmbeddedEntityFromJsonToMethodDetails, upiReceiverEmbeddedEntityJsonToEntity, walletAccountDetailsEntityFromJsonToWalletAccountDetails2, text20, text4, i118, text21, setL, recurringPlanInfoEmbeddedEntityFromJsonToPlanInfo, text23, text24, text25, text26, pendingRefundSenderInfoEmbeddedEntityFromJsonToPendingRefundSenderInfo, transferReferencesEmbeddedEntityFromJsonToTransferReferences, text27, text28, recurringPaymentSchemeEmbeddedEntityJsonToEntity, recurringPaymentMethodEmbeddedEntityJsonToEntity, recurringPaymentEndCriteriaEmbeddedEntityJsonToEntity, listK, recurringPaymentFundsSourceEmbeddedEntityJsonToEntity, recurringPaymentBillDetailsEntityJsonToEntity, walletAutomationEmbeddedEntityJsonToEntity, text30, boolValueOf4, sQLiteStatementPrepare.isNull(i139) ? null : sQLiteStatementPrepare.getText(i139), sQLiteStatementPrepare.isNull(i140) ? null : sQLiteStatementPrepare.getText(i140)));
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow14 = i32;
                int i141 = i6;
                columnIndexOrThrow33 = i111;
                columnIndexOrThrow32 = i141;
                columnIndexOrThrow61 = i140;
                columnIndexOrThrow59 = i138;
                columnIndexOrThrow15 = i21;
                columnIndexOrThrow38 = i116;
                columnIndexOrThrow39 = i117;
                columnIndexOrThrow2 = i22;
                columnIndexOrThrow = i;
                columnIndexOrThrow41 = i120;
                recurringPaymentDao_Impl = this;
                columnIndexOrThrow40 = i119;
                columnIndexOrThrow3 = i43;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getByReceiver$2(String str, SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        Integer numValueOf;
        Boolean boolValueOf;
        int i3;
        Integer numValueOf2;
        Boolean boolValueOf2;
        int i5;
        Integer numValueOf3;
        Boolean boolValueOf3;
        String text2;
        int i6;
        String text3;
        String text4;
        int i21;
        String text5;
        String text6;
        String text7;
        Integer numValueOf4;
        Boolean boolValueOf4;
        RecurringPaymentDao_Impl recurringPaymentDao_Impl = this;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM recurring_payments WHERE receiver = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiver");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speed");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDate");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextDate");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endDate");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "frequency");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurring");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimated");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoExchangeEnabled");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fee");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourceCurrency");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transferReason");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverInfoRecurringBuy");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recieverInfoBeneficiary");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recieverInfoRecipient");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recieverInfoCreditor");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverInfoVault");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverInfoMerchant");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverCreditEntity");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverPayLaterEntity");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverLoanEntity");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverAccountInfo");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cobrandsLogo");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverPaymentCounterpartyInfo");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverPaymentMethodDetails");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverUpiInfo");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "senderAccountInfo");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "billMoneyBoxId");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "side");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "day");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gifUrl");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "linkedTransactionsIds");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "planInfo");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiator_id");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiator_name");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pending_refund_sender_info");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "referenceFields");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourcePocketId");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourcePocketScope");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "payment_scheme");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "payment_method");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end_criteria");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "availableActions");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fundsSource");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bill_details");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletAutomation");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiationMethod");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "request_frequency_confirmation");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deactivatedDate");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blockExpiryDate");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                int i22 = columnIndexOrThrow2;
                RecurringPaymentStateEmbeddedEntity recurringPaymentStateEmbeddedEntityJsonToState = recurringPaymentDao_Impl.__recurringPaymentTypeConverter.jsonToState(text);
                RecurringPaymentTypeEmbeddedEntity recurringPaymentTypeEmbeddedEntityJsonToType = recurringPaymentDao_Impl.__recurringPaymentTypeConverter.jsonToType(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                BankTransferTypeEmbeddedEntity bankTransferTypeEmbeddedEntityJsonToType = recurringPaymentDao_Impl.__bankTransferTypeConverter.jsonToType(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                RecurringPaymentFrequencyEmbeddedEntity recurringPaymentFrequencyEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentFrequencyConverter.jsonToEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                }
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i3 = columnIndexOrThrow4;
                    numValueOf2 = null;
                } else {
                    i3 = columnIndexOrThrow4;
                    numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                }
                if (numValueOf2 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                int i32 = columnIndexOrThrow14;
                if (sQLiteStatementPrepare.isNull(i32)) {
                    i5 = columnIndexOrThrow5;
                    numValueOf3 = null;
                } else {
                    i5 = columnIndexOrThrow5;
                    numValueOf3 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i32));
                }
                if (numValueOf3 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                }
                int i33 = columnIndexOrThrow15;
                String text14 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                int i43 = i2;
                recurringPaymentDao_Impl.__commonTypeConverters.getClass();
                b bVarG = a.g(text14);
                int i59 = columnIndexOrThrow16;
                String text15 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                int i66 = columnIndexOrThrow17;
                String text16 = sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                columnIndexOrThrow16 = i59;
                int i74 = columnIndexOrThrow18;
                Long lValueOf2 = sQLiteStatementPrepare.isNull(i74) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i74));
                columnIndexOrThrow18 = i74;
                int i92 = columnIndexOrThrow19;
                String text17 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                columnIndexOrThrow19 = i92;
                int i96 = columnIndexOrThrow20;
                String text18 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                columnIndexOrThrow20 = i96;
                int i99 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i99)) {
                    columnIndexOrThrow21 = i99;
                    text2 = null;
                } else {
                    columnIndexOrThrow21 = i99;
                    text2 = sQLiteStatementPrepare.getText(i99);
                }
                int i100 = i3;
                TransferReasonEmbeddedEntity transferReasonEmbeddedEntityFromJson = recurringPaymentDao_Impl.__transferReasonTypeConverter.fromJson(text2);
                int i101 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i101;
                RecurringBuyReceiverInfoEmbeddedEntity recurringBuyReceiverInfoEmbeddedEntityFromJson = recurringPaymentDao_Impl.__recurringBuyReceiverInfoTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                int i102 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i102;
                BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntityFromJsonToBeneficiary = recurringPaymentDao_Impl.__beneficiaryTypeConverter.fromJsonToBeneficiary(sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102));
                int i103 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i103;
                RecipientEmbeddedEntity recipientEmbeddedEntityFromJsonToRecipient = recurringPaymentDao_Impl.__recipientTypeConverter.fromJsonToRecipient(sQLiteStatementPrepare.isNull(i103) ? null : sQLiteStatementPrepare.getText(i103));
                int i104 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i104;
                CreditorEmbeddedEntity creditorEmbeddedEntityFromJsonToCreditor = recurringPaymentDao_Impl.__creditorTypeConverter.fromJsonToCreditor(sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104));
                int i105 = columnIndexOrThrow26;
                columnIndexOrThrow26 = i105;
                VaultReceiverInfoEmbeddedEntity vaultReceiverInfoEmbeddedEntityFromJson = recurringPaymentDao_Impl.__vaultReceiverInfoTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i105) ? null : sQLiteStatementPrepare.getText(i105));
                int i106 = columnIndexOrThrow27;
                columnIndexOrThrow27 = i106;
                MerchantEmbeddedEntity merchantEmbeddedEntityFromJsonToMerchant = recurringPaymentDao_Impl.__merchantTypeConverter.fromJsonToMerchant(sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106));
                int i107 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i107;
                CreditReceiverEmbeddedEntity creditReceiverEmbeddedEntityFromJsonToCreditReceiver = recurringPaymentDao_Impl.__creditReceiverTypeConverter.fromJsonToCreditReceiver(sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107));
                int i108 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i108;
                PayLaterReceiverEmbeddedEntity payLaterReceiverEmbeddedEntityFromJsonToPayLaterReceiver = recurringPaymentDao_Impl.__payLaterReceiverTypeConverter.fromJsonToPayLaterReceiver(sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108));
                int i109 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i109;
                LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntityFromJsonToLoanReceiver = recurringPaymentDao_Impl.__loanReceiverTypeConverter.fromJsonToLoanReceiver(sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109));
                int i110 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i110;
                WalletAccountDetailsEntity walletAccountDetailsEntityFromJsonToWalletAccountDetails = recurringPaymentDao_Impl.__walletAccountDetailsTypeConverter.fromJsonToWalletAccountDetails(sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110));
                int i111 = columnIndexOrThrow32;
                String text19 = sQLiteStatementPrepare.isNull(i111) ? null : sQLiteStatementPrepare.getText(i111);
                int i112 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i112)) {
                    i6 = i111;
                    text3 = null;
                } else {
                    i6 = i111;
                    text3 = sQLiteStatementPrepare.getText(i112);
                }
                PaymentCounterpartyReceiverInfoEntity paymentCounterpartyReceiverInfoEntityJsonToEntity = recurringPaymentDao_Impl.__recurringCounterpartyReceiverInfoConverter.jsonToEntity(text3);
                int i113 = columnIndexOrThrow34;
                columnIndexOrThrow34 = i113;
                RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntityFromJsonToMethodDetails = recurringPaymentDao_Impl.__recurringPaymentMethodDetailsTypeConverter.fromJsonToMethodDetails(sQLiteStatementPrepare.isNull(i113) ? null : sQLiteStatementPrepare.getText(i113));
                int i114 = columnIndexOrThrow35;
                columnIndexOrThrow35 = i114;
                UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentUpiReceiverInfoEntityTypeConverter.jsonToEntity(sQLiteStatementPrepare.isNull(i114) ? null : sQLiteStatementPrepare.getText(i114));
                int i115 = columnIndexOrThrow36;
                columnIndexOrThrow36 = i115;
                WalletAccountDetailsEntity walletAccountDetailsEntityFromJsonToWalletAccountDetails2 = recurringPaymentDao_Impl.__walletAccountDetailsTypeConverter.fromJsonToWalletAccountDetails(sQLiteStatementPrepare.isNull(i115) ? null : sQLiteStatementPrepare.getText(i115));
                int i116 = columnIndexOrThrow37;
                String text20 = sQLiteStatementPrepare.isNull(i116) ? null : sQLiteStatementPrepare.getText(i116);
                int i117 = columnIndexOrThrow38;
                if (sQLiteStatementPrepare.isNull(i117)) {
                    text4 = null;
                    columnIndexOrThrow37 = i116;
                    i21 = i32;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i117);
                    i21 = i32;
                    columnIndexOrThrow37 = i116;
                }
                int i118 = columnIndexOrThrow39;
                int i119 = (int) sQLiteStatementPrepare.getLong(i118);
                int i120 = columnIndexOrThrow40;
                String text21 = sQLiteStatementPrepare.isNull(i120) ? null : sQLiteStatementPrepare.getText(i120);
                int i121 = columnIndexOrThrow41;
                String text22 = sQLiteStatementPrepare.isNull(i121) ? null : sQLiteStatementPrepare.getText(i121);
                recurringPaymentDao_Impl.__commonTypeConverters.getClass();
                Set setL = a.l(text22);
                int i122 = columnIndexOrThrow42;
                if (sQLiteStatementPrepare.isNull(i122)) {
                    columnIndexOrThrow42 = i122;
                    text5 = null;
                } else {
                    columnIndexOrThrow42 = i122;
                    text5 = sQLiteStatementPrepare.getText(i122);
                }
                RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntityFromJsonToPlanInfo = recurringPaymentDao_Impl.__recurringPaymentPlanInfoTypeConverter.fromJsonToPlanInfo(text5);
                int i123 = columnIndexOrThrow43;
                String text23 = sQLiteStatementPrepare.isNull(i123) ? null : sQLiteStatementPrepare.getText(i123);
                int i124 = columnIndexOrThrow44;
                String text24 = sQLiteStatementPrepare.isNull(i124) ? null : sQLiteStatementPrepare.getText(i124);
                columnIndexOrThrow43 = i123;
                int i125 = columnIndexOrThrow45;
                String text25 = sQLiteStatementPrepare.isNull(i125) ? null : sQLiteStatementPrepare.getText(i125);
                columnIndexOrThrow45 = i125;
                int i126 = columnIndexOrThrow46;
                String text26 = sQLiteStatementPrepare.isNull(i126) ? null : sQLiteStatementPrepare.getText(i126);
                columnIndexOrThrow46 = i126;
                int i127 = columnIndexOrThrow47;
                if (sQLiteStatementPrepare.isNull(i127)) {
                    columnIndexOrThrow47 = i127;
                    text6 = null;
                } else {
                    columnIndexOrThrow47 = i127;
                    text6 = sQLiteStatementPrepare.getText(i127);
                }
                columnIndexOrThrow44 = i124;
                PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntityFromJsonToPendingRefundSenderInfo = recurringPaymentDao_Impl.__pendingRefundSenderInfoTypeConverter.fromJsonToPendingRefundSenderInfo(text6);
                int i128 = columnIndexOrThrow48;
                columnIndexOrThrow48 = i128;
                TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntityFromJsonToTransferReferences = recurringPaymentDao_Impl.__transferReferenceTypeConverter.fromJsonToTransferReferences(sQLiteStatementPrepare.isNull(i128) ? null : sQLiteStatementPrepare.getText(i128));
                int i129 = columnIndexOrThrow49;
                String text27 = sQLiteStatementPrepare.isNull(i129) ? null : sQLiteStatementPrepare.getText(i129);
                int i130 = columnIndexOrThrow50;
                String text28 = sQLiteStatementPrepare.isNull(i130) ? null : sQLiteStatementPrepare.getText(i130);
                columnIndexOrThrow49 = i129;
                int i131 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i131)) {
                    columnIndexOrThrow51 = i131;
                    text7 = null;
                } else {
                    columnIndexOrThrow51 = i131;
                    text7 = sQLiteStatementPrepare.getText(i131);
                }
                columnIndexOrThrow50 = i130;
                RecurringPaymentSchemeEmbeddedEntity recurringPaymentSchemeEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentSchemeConverter().jsonToEntity(text7);
                int i132 = columnIndexOrThrow52;
                columnIndexOrThrow52 = i132;
                RecurringPaymentMethodEmbeddedEntity recurringPaymentMethodEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentMethodConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i132) ? null : sQLiteStatementPrepare.getText(i132));
                int i133 = columnIndexOrThrow53;
                columnIndexOrThrow53 = i133;
                RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentEndCriteriaConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i133) ? null : sQLiteStatementPrepare.getText(i133));
                int i134 = columnIndexOrThrow54;
                String text29 = sQLiteStatementPrepare.isNull(i134) ? null : sQLiteStatementPrepare.getText(i134);
                columnIndexOrThrow54 = i134;
                recurringPaymentDao_Impl.__commonTypeConverters.getClass();
                List listK = a.k(text29);
                int i135 = columnIndexOrThrow55;
                columnIndexOrThrow55 = i135;
                RecurringPaymentFundsSourceEmbeddedEntity recurringPaymentFundsSourceEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentFundsSourceEmbeddedEntityTypeConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i135) ? null : sQLiteStatementPrepare.getText(i135));
                int i136 = columnIndexOrThrow56;
                columnIndexOrThrow56 = i136;
                RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntityJsonToEntity = recurringPaymentDao_Impl.__recurringPaymentBillDetailsEmbeddedEntityTypeConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i136) ? null : sQLiteStatementPrepare.getText(i136));
                int i137 = columnIndexOrThrow57;
                columnIndexOrThrow57 = i137;
                WalletAutomationEmbeddedEntity walletAutomationEmbeddedEntityJsonToEntity = recurringPaymentDao_Impl.__walletAutomationEmbeddedEntityTypeConverter().jsonToEntity(sQLiteStatementPrepare.isNull(i137) ? null : sQLiteStatementPrepare.getText(i137));
                int i138 = columnIndexOrThrow58;
                String text30 = sQLiteStatementPrepare.isNull(i138) ? null : sQLiteStatementPrepare.getText(i138);
                int i139 = columnIndexOrThrow59;
                if (sQLiteStatementPrepare.isNull(i139)) {
                    columnIndexOrThrow58 = i138;
                    numValueOf4 = null;
                } else {
                    columnIndexOrThrow58 = i138;
                    numValueOf4 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i139));
                }
                if (numValueOf4 == null) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(numValueOf4.intValue() != 0);
                }
                int i140 = columnIndexOrThrow60;
                int i141 = columnIndexOrThrow61;
                columnIndexOrThrow60 = i140;
                arrayList.add(new RecurringPaymentEntity(text8, recurringPaymentStateEmbeddedEntityJsonToState, recurringPaymentTypeEmbeddedEntityJsonToType, text9, bankTransferTypeEmbeddedEntityJsonToType, lValueOf, text10, text11, text12, text13, recurringPaymentFrequencyEmbeddedEntityJsonToEntity, boolValueOf, boolValueOf2, boolValueOf3, bVarG, text15, text16, lValueOf2, text17, text18, transferReasonEmbeddedEntityFromJson, recurringBuyReceiverInfoEmbeddedEntityFromJson, beneficiaryEmbeddedEntityFromJsonToBeneficiary, recipientEmbeddedEntityFromJsonToRecipient, creditorEmbeddedEntityFromJsonToCreditor, vaultReceiverInfoEmbeddedEntityFromJson, merchantEmbeddedEntityFromJsonToMerchant, creditReceiverEmbeddedEntityFromJsonToCreditReceiver, payLaterReceiverEmbeddedEntityFromJsonToPayLaterReceiver, loanReceiverEmbeddedEntityFromJsonToLoanReceiver, walletAccountDetailsEntityFromJsonToWalletAccountDetails, text19, paymentCounterpartyReceiverInfoEntityJsonToEntity, recurringPaymentMethodDetailsEmbeddedEntityFromJsonToMethodDetails, upiReceiverEmbeddedEntityJsonToEntity, walletAccountDetailsEntityFromJsonToWalletAccountDetails2, text20, text4, i119, text21, setL, recurringPlanInfoEmbeddedEntityFromJsonToPlanInfo, text23, text24, text25, text26, pendingRefundSenderInfoEmbeddedEntityFromJsonToPendingRefundSenderInfo, transferReferencesEmbeddedEntityFromJsonToTransferReferences, text27, text28, recurringPaymentSchemeEmbeddedEntityJsonToEntity, recurringPaymentMethodEmbeddedEntityJsonToEntity, recurringPaymentEndCriteriaEmbeddedEntityJsonToEntity, listK, recurringPaymentFundsSourceEmbeddedEntityJsonToEntity, recurringPaymentBillDetailsEntityJsonToEntity, walletAutomationEmbeddedEntityJsonToEntity, text30, boolValueOf4, sQLiteStatementPrepare.isNull(i140) ? null : sQLiteStatementPrepare.getText(i140), sQLiteStatementPrepare.isNull(i141) ? null : sQLiteStatementPrepare.getText(i141)));
                columnIndexOrThrow5 = i5;
                columnIndexOrThrow14 = i21;
                columnIndexOrThrow38 = i117;
                columnIndexOrThrow39 = i118;
                columnIndexOrThrow40 = i120;
                columnIndexOrThrow3 = i43;
                columnIndexOrThrow15 = i33;
                columnIndexOrThrow4 = i100;
                columnIndexOrThrow17 = i66;
                int i142 = i6;
                columnIndexOrThrow33 = i112;
                columnIndexOrThrow32 = i142;
                columnIndexOrThrow61 = i141;
                columnIndexOrThrow59 = i139;
                columnIndexOrThrow2 = i22;
                columnIndexOrThrow = i;
                columnIndexOrThrow41 = i121;
                recurringPaymentDao_Impl = this;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertOrUpdateAll$0(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfRecurringPaymentEntity.insert(sQLiteConnection, list);
        return null;
    }

    @Override // com.revolut.data.database.models.recurringpayments.RecurringPaymentDao
    public int deleteById(String str) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new c(str, 11))).intValue();
    }

    @Override // com.revolut.data.database.models.recurringpayments.RecurringPaymentDao
    public List<RecurringPaymentEntity> getAllSync() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ce9.a(this, 27));
    }

    @Override // com.revolut.data.database.models.recurringpayments.RecurringPaymentDao
    public d0<List<RecurringPaymentEntity>> getByReceiver(String str) {
        return RxRoom.createSingle(this.__db, true, false, new cma.b(this, str, 6));
    }

    @Override // com.revolut.data.database.models.recurringpayments.RecurringPaymentDao
    public void insertOrUpdateAll(List<RecurringPaymentEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new cma.b(this, list, 7));
    }
}
