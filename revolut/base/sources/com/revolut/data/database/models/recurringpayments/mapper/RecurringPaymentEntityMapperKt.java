package com.revolut.data.database.models.recurringpayments.mapper;

import com.revolut.data.database.models.apm.UpiReceiverEmbeddedEntity;
import com.revolut.data.database.models.apm.mapper.RecurringPaymentUpiReceiverInfoEntityMapperKt;
import com.revolut.data.database.models.banktransfer.BankTransferTypeEmbeddedEntity;
import com.revolut.data.database.models.banktransfer.mapper.BankTransferEmbeddedEntityMapperKt;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import com.revolut.data.database.models.credit.CreditReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.LoanReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.PayLaterReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.mapper.CreditReceiverEmbeddedEntityMapperKt;
import com.revolut.data.database.models.credit.mapper.LoanReceiverEmbeddedEntityMapperKt;
import com.revolut.data.database.models.credit.mapper.PayLaterReceiverEmbeddedEntityMapperKt;
import com.revolut.data.database.models.creditor.CreditorEmbeddedEntity;
import com.revolut.data.database.models.creditor.mapper.CreditorEmbeddedEntityMapperKt;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaEmbeddedEntity;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaTypeEmbeddedEntity;
import com.revolut.data.database.models.paymentcounterparty.PaymentCounterpartyReceiverInfoEntity;
import com.revolut.data.database.models.paymentcounterparty.mapper.RecurringPaymentCounterpartyReceiverInfoEntityMapperKt;
import com.revolut.data.database.models.premium.RecurringPlanInfoEmbeddedEntity;
import com.revolut.data.database.models.premium.RecurringPlanInfoEmbeddedEntityMapperKt;
import com.revolut.data.database.models.recipient.RecipientEmbeddedEntity;
import com.revolut.data.database.models.recipient.mapper.RecipientEmbeddedEntityMapperKt;
import com.revolut.data.database.models.recurringbuys.RecurringBuyReceiverInfoEmbeddedEntity;
import com.revolut.data.database.models.recurringbuys.mapper.RecurringBuyReceiverEntityMapperKt;
import com.revolut.data.database.models.recurringpayments.BillFeesEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.BillThresholdsEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.MerchantEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.PendingRefundSenderInfoEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentBillDetailsEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentCreditorEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDebtorEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentFrequencyEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentFundsSourceEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentIdentificationEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentMethodDetailsEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentMethodEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentSchemeEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentStateEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentTypeEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.TransferReferencesEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.WalletAutomationEmbeddedEntity;
import com.revolut.data.database.models.transfer.TransferReasonEmbeddedEntity;
import com.revolut.data.database.models.transfer.mapper.TransferReasonEmbeddedEntityMapperKt;
import com.revolut.data.database.models.vaults.VaultReceiverInfoEmbeddedEntity;
import com.revolut.data.database.models.vaults.mapper.VaultReceiverEntityMapperKt;
import com.revolut.data.database.models.wallet.account.WalletAccountDetailsEntity;
import com.revolut.data.database.models.wallet.account.WalletAccountDetailsEntityMapperKt;
import com.revolut.data.network.models.recurringpayment.mapper.WalletAutomationPeriodMapperKt;
import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import dj0.d;
import fva.a;
import fva.e;
import fva.g;
import fva.l;
import ibd.f;
import ibd.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jo3.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kq2.m;
import krf.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.format.ISODateTimeFormat;
import qua.a0;
import qua.i;
import qua.j;
import qua.k;
import qua.n;
import qua.o;
import qua.p;
import qua.r;
import qua.s;
import tof.i3;
import tof.k3;
import tof.l2;
import tof.l3;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\n\u001a\u0013\u0010\u0002\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\u0002\u0010\r\u001a\u0013\u0010\u0002\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0002\u0010\u0010\u001a\u0013\u0010\u0002\u001a\u00020\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\u0002\u0010\u0013\u001a\u0013\u0010\u0002\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0002\u0010\u0016\u001a\u0013\u0010\u0002\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u0002\u0010\u0019\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u0002\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\u001f\u001a\u00020\u0017*\u00020\u0018H\u0000¢\u0006\u0004\b\u001f\u0010!\u001a\u0013\u0010\u001f\u001a\u00020\u0014*\u00020\u0015H\u0000¢\u0006\u0004\b\u001f\u0010\"\u001a\u0013\u0010\u001f\u001a\u00020\u000b*\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010#\u001a\u0013\u0010\u001f\u001a\u00020\u0011*\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010$\u001a\u0013\u0010\u001f\u001a\u00020\u000e*\u00020\u000fH\u0000¢\u0006\u0004\b\u001f\u0010%\u001a\u0013\u0010\u001f\u001a\u00020\u001a*\u00020&H\u0000¢\u0006\u0004\b\u001f\u0010'\u001a\u0013\u0010\u001f\u001a\u00020)*\u00020(H\u0000¢\u0006\u0004\b\u001f\u0010*\u001a\u0013\u0010\u0002\u001a\u00020(*\u00020)H\u0000¢\u0006\u0004\b\u0002\u0010+\u001a\u0013\u0010\u001f\u001a\u00020-*\u00020,H\u0000¢\u0006\u0004\b\u001f\u0010.\u001a\u0013\u0010\u0002\u001a\u00020,*\u00020-H\u0000¢\u0006\u0004\b\u0002\u0010/\u001a\u0013\u0010\u001f\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b\u001f\u00102\u001a\u0013\u0010\u0002\u001a\u000200*\u000201H\u0000¢\u0006\u0004\b\u0002\u00103\u001a\u0013\u0010\u001f\u001a\u000205*\u000204H\u0000¢\u0006\u0004\b\u001f\u00106\u001a\u0013\u0010\u0002\u001a\u000204*\u000205H\u0000¢\u0006\u0004\b\u0002\u00107\u001a\u0013\u0010\u001f\u001a\u000209*\u000208H\u0000¢\u0006\u0004\b\u001f\u0010:\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002080<*\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b\u0002\u0010=\u001a\u0013\u0010\u0002\u001a\u00020?*\u00020>H\u0000¢\u0006\u0004\b\u0002\u0010@\u001a\u0013\u0010\u001f\u001a\u00020>*\u00020?H\u0000¢\u0006\u0004\b\u001f\u0010A\u001a\u0013\u0010\u0002\u001a\u00020C*\u00020BH\u0000¢\u0006\u0004\b\u0002\u0010D\u001a\u0013\u0010\u001f\u001a\u00020B*\u00020CH\u0000¢\u0006\u0004\b\u001f\u0010E\u001a\u0013\u0010\u0002\u001a\u00020G*\u00020FH\u0000¢\u0006\u0004\b\u0002\u0010H\u001a\u0013\u0010\u001f\u001a\u00020F*\u00020GH\u0000¢\u0006\u0004\b\u001f\u0010I\u001a\u0013\u0010\u0002\u001a\u00020K*\u00020JH\u0000¢\u0006\u0004\b\u0002\u0010L\u001a\u0013\u0010\u001f\u001a\u00020J*\u00020KH\u0000¢\u0006\u0004\b\u001f\u0010M\u001a\u0013\u0010\u0002\u001a\u00020O*\u00020NH\u0000¢\u0006\u0004\b\u0002\u0010P\u001a\u0013\u0010\u001f\u001a\u00020N*\u00020OH\u0000¢\u0006\u0004\b\u001f\u0010Q¨\u0006R"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentEntity;", "Lqua/p;", "toDomain", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentEntity;)Lqua/p;", "", "Lorg/joda/time/LocalDate;", "parseLocalDate", "(Ljava/lang/String;)Lorg/joda/time/LocalDate;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "Libd/f;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;)Libd/f;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "Lfva/g;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;)Lfva/g;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;", "Lqua/s;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;)Lqua/s;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "Lfva/l;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;)Lfva/l;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "Libd/h;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;)Libd/h;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;", "Lfva/e;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;)Lfva/e;", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria$Date;", "(Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;)Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria$Date;", "toEntity", "(Lqua/p;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentEntity;", "toEmbeddedEntity", "(Libd/f;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "(Lfva/e;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;", "(Libd/h;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "(Lfva/g;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "(Lfva/l;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "(Lqua/s;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;", "Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria;", "(Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria;)Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "Lqua/i;", "Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "(Lqua/i;)Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "(Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;)Lqua/i;", "Lqua/n;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "(Lqua/n;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;)Lqua/n;", "Lqua/f;", "Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;", "(Lqua/f;)Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;", "(Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;)Lqua/f;", "Lqua/e;", "Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;", "(Lqua/e;)Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;", "(Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;)Lqua/e;", "Lqua/a0;", "Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity$TransferReferenceEntity;", "(Lqua/a0;)Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity$TransferReferenceEntity;", "Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;", "", "(Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;)Ljava/util/List;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;", "Lfva/h;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;)Lfva/h;", "(Lfva/h;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;", "Lfva/c;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;)Lfva/c;", "(Lfva/c;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;", "Lfva/d;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;)Lfva/d;", "(Lfva/d;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;", "Lfva/f;", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;)Lfva/f;", "(Lfva/f;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "(Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;)Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "(Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;)Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentEntityMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[RecurringPaymentStateEmbeddedEntity.values().length];
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.DISCONFIRMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RecurringPaymentStateEmbeddedEntity.RAISED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecurringPaymentMethodEmbeddedEntity.values().length];
            try {
                iArr2[RecurringPaymentMethodEmbeddedEntity.BOLETO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RecurringPaymentMethodEmbeddedEntity.BPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[RecurringPaymentMethodEmbeddedEntity.PIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RecurringPaymentSchemeEmbeddedEntity.values().length];
            try {
                iArr3[RecurringPaymentSchemeEmbeddedEntity.PIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[RecurringPaymentSchemeEmbeddedEntity.DE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[RecurringPaymentSchemeEmbeddedEntity.BPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[RecurringPaymentSchemeEmbeddedEntity.NPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[RecurringPaymentSchemeEmbeddedEntity.BOLETO.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[RecurringPaymentSchemeEmbeddedEntity.NZ_BECS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RecurringPaymentTypeEmbeddedEntity.values().length];
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.SAVINGS_POCKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.VAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.BILL_MONEY_BOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.EXTERNAL_MANDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.CARD_MANDATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.MANUAL_CARD_MANDATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.COBRANDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.EXTERNAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.YOUTH_ALLOWANCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.CRYPTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.PAY_LATER_PAYMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.PAID_PLAN.ordinal()] = 13;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.WALLET.ordinal()] = 14;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.BPAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.NZ_BILLS.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.UAE_BILLS.ordinal()] = 17;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.PIX_MANDATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.UPI_MANDATE.ordinal()] = 19;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.UPI.ordinal()] = 20;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.GIRO_HU_DIRECT_DEBIT.ordinal()] = 21;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.MASAV_IL_DIRECT_DEBIT.ordinal()] = 22;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.BOLETO.ordinal()] = 23;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[RecurringPaymentTypeEmbeddedEntity.MOBILE_PLAN_SUBSCRIPTION.ordinal()] = 24;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[RecurringPaymentFrequencyEmbeddedEntity.values().length];
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.ADHOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.BI_WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.HALF_YEARLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.YEARLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.DAILY.ordinal()] = 8;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.TWICE_WEEKLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.TEN_DAYS.ordinal()] = 10;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.BI_MONTHLY.ordinal()] = 11;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.TRIMESTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr5[RecurringPaymentFrequencyEmbeddedEntity.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[RecurringPaymentEndCriteriaTypeEmbeddedEntity.values().length];
            try {
                iArr6[RecurringPaymentEndCriteriaTypeEmbeddedEntity.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr6[RecurringPaymentEndCriteriaTypeEmbeddedEntity.COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[f.values().length];
            try {
                iArr7[f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr7[f.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr7[f.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr7[f.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr7[f.CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr7[f.DISCONFIRMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr7[f.RAISED.ordinal()] = 7;
            } catch (NoSuchFieldError unused62) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[e.values().length];
            try {
                iArr8[e.ADHOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr8[e.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr8[e.BI_WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr8[e.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr8[e.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr8[e.HALF_YEARLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr8[e.YEARLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr8[e.DAILY.ordinal()] = 8;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr8[e.TWICE_WEEKLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr8[e.TEN_DAYS.ordinal()] = 10;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr8[e.BI_MONTHLY.ordinal()] = 11;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr8[e.TRIMESTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr8[e.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused75) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[h.values().length];
            try {
                iArr9[h.SAVINGS_POCKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr9[h.VAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr9[h.BILL_MONEY_BOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr9[h.INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr9[h.EXTERNAL_MANDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr9[h.CARD_MANDATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr9[h.MANUAL_CARD_MANDATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr9[h.EXTERNAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr9[h.YOUTH_ALLOWANCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr9[h.CRYPTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr9[h.PAY_LATER_PAYMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr9[h.ACQUIRING_ONE_OFF.ordinal()] = 12;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr9[h.ACQUIRING_SUBSCRIPTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr9[h.PAID_PLAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr9[h.COBRANDS.ordinal()] = 15;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr9[h.WALLET.ordinal()] = 16;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr9[h.BPAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr9[h.NZ_BILLS.ordinal()] = 18;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr9[h.UAE_BILLS.ordinal()] = 19;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr9[h.UPI.ordinal()] = 20;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr9[h.UPI_MANDATE.ordinal()] = 21;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr9[h.MOBILE_PLAN_SUBSCRIPTION.ordinal()] = 22;
            } catch (NoSuchFieldError unused97) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[g.values().length];
            try {
                iArr10[g.BOLETO.ordinal()] = 1;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr10[g.BPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr10[g.PIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused100) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[l.values().length];
            try {
                iArr11[l.PIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr11[l.DE.ordinal()] = 2;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr11[l.BPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr11[l.NPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr11[l.BOLETO.ordinal()] = 5;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr11[l.NZ_BECS.ordinal()] = 6;
            } catch (NoSuchFieldError unused106) {
            }
            $EnumSwitchMapping$10 = iArr11;
        }
    }

    private static final LocalDate parseLocalDate(String str) {
        LocalDate localDate = LocalDate.parse(str, ISODateTimeFormat.dateOptionalTimeParser());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }

    @NotNull
    public static final p toDomain(@NotNull RecurringPaymentEntity recurringPaymentEntity) {
        String str;
        o oVar;
        kq2.g gVar;
        j jVar;
        ArrayList arrayList;
        a aVar;
        j jVar2;
        kq2.g gVar2;
        Intrinsics.checkNotNullParameter(recurringPaymentEntity, "<this>");
        String id10 = recurringPaymentEntity.getId();
        String period = recurringPaymentEntity.getPeriod();
        Period period2 = period != null ? Period.parse(period) : null;
        h domain = toDomain(recurringPaymentEntity.getType());
        String startDate = recurringPaymentEntity.getStartDate();
        LocalDate localDate = startDate != null ? parseLocalDate(startDate) : null;
        String nextDate = recurringPaymentEntity.getNextDate();
        LocalDate localDate2 = nextDate != null ? parseLocalDate(nextDate) : null;
        Boolean recurring = recurringPaymentEntity.getRecurring();
        Boolean estimated = recurringPaymentEntity.getEstimated();
        DateTime dateTime = new DateTime(recurringPaymentEntity.getUpdatedDate());
        RecurringPaymentEndCriteriaEmbeddedEntity endCriteria = recurringPaymentEntity.getEndCriteria();
        ibd.e eVar = new ibd.e(id10, period2, domain, dateTime, localDate, localDate2, recurring, estimated, endCriteria != null ? toDomain(endCriteria) : null, null, null, 1536);
        String endDate = recurringPaymentEntity.getEndDate();
        LocalDate localDate3 = endDate != null ? parseLocalDate(endDate) : null;
        f domain2 = toDomain(recurringPaymentEntity.getState());
        String receiver = recurringPaymentEntity.getReceiver();
        BankTransferTypeEmbeddedEntity speed = recurringPaymentEntity.getSpeed();
        m domain3 = speed != null ? BankTransferEmbeddedEntityMapperKt.toDomain(speed) : null;
        b fee2 = recurringPaymentEntity.getFee();
        d dVarV = fee2 != null ? hx7.a.v(fee2) : null;
        String sourceCurrency = recurringPaymentEntity.getSourceCurrency();
        String currency = recurringPaymentEntity.getCurrency();
        Long amount = recurringPaymentEntity.getAmount();
        String title = recurringPaymentEntity.getTitle();
        String name = recurringPaymentEntity.getName();
        String description = recurringPaymentEntity.getDescription();
        String cobrandsLogo = recurringPaymentEntity.getCobrandsLogo();
        TransferReasonEmbeddedEntity transferReason = recurringPaymentEntity.getTransferReason();
        c domain4 = transferReason != null ? TransferReasonEmbeddedEntityMapperKt.toDomain(transferReason) : null;
        RecurringBuyReceiverInfoEmbeddedEntity receiverInfoRecurringBuy = recurringPaymentEntity.getReceiverInfoRecurringBuy();
        wua.a domain5 = receiverInfoRecurringBuy != null ? RecurringBuyReceiverEntityMapperKt.toDomain(receiverInfoRecurringBuy) : null;
        BeneficiaryEmbeddedEntity recieverInfoBeneficiary = recurringPaymentEntity.getRecieverInfoBeneficiary();
        f5j.a domain6 = recieverInfoBeneficiary != null ? BeneficiaryEntityMapperKt.toDomain(recieverInfoBeneficiary) : null;
        RecipientEmbeddedEntity recieverInfoRecipient = recurringPaymentEntity.getRecieverInfoRecipient();
        vua.a domain7 = recieverInfoRecipient != null ? RecipientEmbeddedEntityMapperKt.toDomain(recieverInfoRecipient) : null;
        CreditorEmbeddedEntity recieverInfoCreditor = recurringPaymentEntity.getRecieverInfoCreditor();
        uua.a domain8 = recieverInfoCreditor != null ? CreditorEmbeddedEntityMapperKt.toDomain(recieverInfoCreditor) : null;
        VaultReceiverInfoEmbeddedEntity receiverInfoVault = recurringPaymentEntity.getReceiverInfoVault();
        fva.m domain9 = receiverInfoVault != null ? VaultReceiverEntityMapperKt.toDomain(receiverInfoVault) : null;
        MerchantEmbeddedEntity receiverInfoMerchant = recurringPaymentEntity.getReceiverInfoMerchant();
        qua.g domain10 = receiverInfoMerchant != null ? MerchantReceiverEntityMapperKt.toDomain(receiverInfoMerchant) : null;
        PayLaterReceiverEmbeddedEntity receiverPayLaterEntity = recurringPaymentEntity.getReceiverPayLaterEntity();
        tua.d domain11 = receiverPayLaterEntity != null ? PayLaterReceiverEmbeddedEntityMapperKt.toDomain(receiverPayLaterEntity) : null;
        LoanReceiverEmbeddedEntity receiverLoanEntity = recurringPaymentEntity.getReceiverLoanEntity();
        tua.c domain12 = receiverLoanEntity != null ? LoanReceiverEmbeddedEntityMapperKt.toDomain(receiverLoanEntity) : null;
        WalletAccountDetailsEntity receiverAccountInfo = recurringPaymentEntity.getReceiverAccountInfo();
        ibd.a domain13 = receiverAccountInfo != null ? WalletAccountDetailsEntityMapperKt.toDomain(receiverAccountInfo) : null;
        PaymentCounterpartyReceiverInfoEntity receiverPaymentCounterpartyInfo = recurringPaymentEntity.getReceiverPaymentCounterpartyInfo();
        qua.h domain14 = receiverPaymentCounterpartyInfo != null ? RecurringPaymentCounterpartyReceiverInfoEntityMapperKt.toDomain(receiverPaymentCounterpartyInfo) : null;
        RecurringPaymentMethodDetailsEmbeddedEntity receiverPaymentMethodDetails = recurringPaymentEntity.getReceiverPaymentMethodDetails();
        fva.h domain15 = receiverPaymentMethodDetails != null ? toDomain(receiverPaymentMethodDetails) : null;
        UpiReceiverEmbeddedEntity receiverUpiInfo = recurringPaymentEntity.getReceiverUpiInfo();
        rua.d domain16 = receiverUpiInfo != null ? RecurringPaymentUpiReceiverInfoEntityMapperKt.toDomain(receiverUpiInfo) : null;
        WalletAccountDetailsEntity senderAccountInfo = recurringPaymentEntity.getSenderAccountInfo();
        ibd.a domain17 = senderAccountInfo != null ? WalletAccountDetailsEntityMapperKt.toDomain(senderAccountInfo) : null;
        String billMoneyBoxId = recurringPaymentEntity.getBillMoneyBoxId();
        sua.b bVar = billMoneyBoxId != null ? new sua.b(billMoneyBoxId) : null;
        String side = recurringPaymentEntity.getSide();
        RecurringPaymentFrequencyEmbeddedEntity frequency = recurringPaymentEntity.getFrequency();
        e domain18 = frequency != null ? toDomain(frequency) : null;
        int day = recurringPaymentEntity.getDay();
        String gifUrl = recurringPaymentEntity.getGifUrl();
        Boolean autoExchangeEnabled = recurringPaymentEntity.getAutoExchangeEnabled();
        Set<String> linkedTransactionsIds = recurringPaymentEntity.getLinkedTransactionsIds();
        if (linkedTransactionsIds == null) {
            linkedTransactionsIds = h0.f322473a;
        }
        Set<String> set = linkedTransactionsIds;
        RecurringPlanInfoEmbeddedEntity planInfo = recurringPaymentEntity.getPlanInfo();
        fva.j domain19 = planInfo != null ? RecurringPlanInfoEmbeddedEntityMapperKt.toDomain(planInfo) : null;
        String id11 = recurringPaymentEntity.getWalletId();
        if (id11 != null) {
            Intrinsics.checkNotNullParameter(id11, "id");
            str = id11;
        } else {
            str = null;
        }
        String initiatorId = recurringPaymentEntity.getInitiatorId();
        if (initiatorId != null) {
            String initiatorName = recurringPaymentEntity.getInitiatorName();
            if (initiatorName == null) {
                initiatorName = "";
            }
            oVar = new o(initiatorId, initiatorName);
        } else {
            oVar = null;
        }
        PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfo = recurringPaymentEntity.getPendingRefundSenderInfo();
        i domain20 = pendingRefundSenderInfo != null ? toDomain(pendingRefundSenderInfo) : null;
        List<a0> domain21 = toDomain(recurringPaymentEntity.getReferenceFields());
        String initiationMethod = recurringPaymentEntity.getInitiationMethod();
        if (initiationMethod != null) {
            kq2.g[] gVarArrValues = kq2.g.values();
            int length = gVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gVar2 = null;
                    break;
                }
                gVar2 = gVarArrValues[i];
                if (kotlin.text.a0.z(gVar2.name(), initiationMethod, true)) {
                    break;
                }
                i++;
            }
            gVar = gVar2;
        } else {
            gVar = null;
        }
        String sourcePocketId = recurringPaymentEntity.getSourcePocketId();
        String sourcePocketScope = recurringPaymentEntity.getSourcePocketScope();
        if (sourcePocketScope != null) {
            j[] jVarArrValues = j.values();
            int length2 = jVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    jVar2 = null;
                    break;
                }
                jVar2 = jVarArrValues[i2];
                if (kotlin.text.a0.z(jVar2.name(), sourcePocketScope, true)) {
                    break;
                }
                i2++;
            }
            jVar = jVar2;
        } else {
            jVar = null;
        }
        RecurringPaymentMethodEmbeddedEntity paymentMethod = recurringPaymentEntity.getPaymentMethod();
        g domain22 = paymentMethod != null ? toDomain(paymentMethod) : null;
        RecurringPaymentSchemeEmbeddedEntity paymentScheme = recurringPaymentEntity.getPaymentScheme();
        l domain23 = paymentScheme != null ? toDomain(paymentScheme) : null;
        List<String> availableActions = recurringPaymentEntity.getAvailableActions();
        if (availableActions != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : availableActions) {
                a[] aVarArrValues = a.values();
                int length3 = aVarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i3];
                    if (kotlin.text.a0.z(aVar.name(), str2, true)) {
                        break;
                    }
                    i3++;
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        RecurringPaymentFundsSourceEmbeddedEntity fundsSource = recurringPaymentEntity.getFundsSource();
        s domain24 = fundsSource != null ? toDomain(fundsSource) : null;
        RecurringPaymentBillDetailsEntity billDetails = recurringPaymentEntity.getBillDetails();
        n domain25 = billDetails != null ? toDomain(billDetails) : null;
        WalletAutomationEmbeddedEntity walletAutomation = recurringPaymentEntity.getWalletAutomation();
        WalletAutomation domain26 = walletAutomation != null ? toDomain(walletAutomation) : null;
        Boolean requestFrequencyConfirmation = recurringPaymentEntity.getRequestFrequencyConfirmation();
        String deactivatedDate = recurringPaymentEntity.getDeactivatedDate();
        LocalDate localDate4 = deactivatedDate != null ? parseLocalDate(deactivatedDate) : null;
        String blockExpiryDate = recurringPaymentEntity.getBlockExpiryDate();
        return new p(eVar, domain2, receiver, domain3, localDate3, autoExchangeEnabled, dVarV, sourceCurrency, currency, amount, title, name, description, null, domain4, side, domain5, domain6, domain7, domain8, domain9, null, domain10, null, domain11, cobrandsLogo, domain13, domain12, domain14, domain16, domain15, domain17, set, day, gifUrl, bVar, domain18, str, oVar, null, domain19, null, domain20, domain21, null, gVar, domain22, domain23, sourcePocketId, jVar, domain25, arrayList, domain24, domain26, requestFrequencyConfirmation, localDate4, blockExpiryDate != null ? parseLocalDate(blockExpiryDate) : null, 10493952, 4736);
    }

    @NotNull
    public static final PendingRefundSenderInfoEmbeddedEntity toEmbeddedEntity(@NotNull i iVar) {
        DateTime dateTime;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f249299a;
        String str2 = iVar.f249300b;
        LocalDateTime localDateTime = iVar.f249301c;
        return new PendingRefundSenderInfoEmbeddedEntity(str, (localDateTime == null || (dateTime = localDateTime.toDateTime()) == null) ? null : Long.valueOf(dateTime.getMillis()), str2, iVar.d.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final RecurringPaymentEntity toEntity(@NotNull p pVar) {
        Long l2;
        BankTransferTypeEmbeddedEntity embeddedEntity;
        RecurringPaymentSchemeEmbeddedEntity recurringPaymentSchemeEmbeddedEntity;
        String str;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        String str2 = pVar.f249314a.f160150a;
        RecurringPaymentStateEmbeddedEntity embeddedEntity2 = toEmbeddedEntity(pVar.f249316b);
        ibd.e eVar = pVar.f249314a;
        RecurringPaymentTypeEmbeddedEntity embeddedEntity3 = toEmbeddedEntity(eVar.f160152c);
        m mVar = pVar.d;
        if (mVar != null) {
            embeddedEntity = BankTransferEmbeddedEntityMapperKt.toEmbeddedEntity(mVar);
            l2 = null;
        } else {
            l2 = null;
            embeddedEntity = null;
        }
        String str3 = pVar.f249318c;
        DateTime dateTime = eVar.d;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : l2;
        LocalDate localDate = eVar.e;
        String string = localDate != null ? localDate.toString() : l2;
        LocalDate localDate2 = eVar.f;
        String string2 = localDate2 != null ? localDate2.toString() : l2;
        LocalDate localDate3 = pVar.e;
        String string3 = localDate3 != null ? localDate3.toString() : l2;
        Period period = eVar.f160151b;
        String string4 = period != null ? period.toString() : l2;
        e eVar2 = pVar.K;
        RecurringPaymentFrequencyEmbeddedEntity embeddedEntity4 = eVar2 != null ? toEmbeddedEntity(eVar2) : l2;
        Boolean bool = eVar.f160153g;
        Boolean bool2 = eVar.f160154h;
        Boolean bool3 = pVar.f;
        d dVar = pVar.f249321g;
        b bVarA = dVar != null ? hx7.a.A(dVar) : null;
        String str4 = pVar.f249322h;
        String str5 = pVar.i;
        Long l3 = pVar.f249323j;
        String str6 = pVar.k;
        String str7 = pVar.f249324l;
        sua.b bVar = pVar.J;
        String str8 = bVar != null ? bVar.f265696a : null;
        String str9 = pVar.f249325m;
        c cVar = pVar.o;
        TransferReasonEmbeddedEntity embeddedEntity5 = cVar != null ? TransferReasonEmbeddedEntityMapperKt.toEmbeddedEntity(cVar) : null;
        wua.a aVar = pVar.f249328q;
        RecurringBuyReceiverInfoEmbeddedEntity embeddedEntity6 = aVar != null ? RecurringBuyReceiverEntityMapperKt.toEmbeddedEntity(aVar) : null;
        f5j.a aVar2 = pVar.f249329r;
        BeneficiaryEmbeddedEntity embeddedEntity7 = aVar2 != null ? BeneficiaryEntityMapperKt.toEmbeddedEntity(aVar2) : null;
        vua.a aVar3 = pVar.f249330s;
        RecipientEmbeddedEntity embeddedEntity8 = aVar3 != null ? RecipientEmbeddedEntityMapperKt.toEmbeddedEntity(aVar3) : null;
        uua.a aVar4 = pVar.f249331t;
        CreditorEmbeddedEntity embeddedEntity9 = aVar4 != null ? CreditorEmbeddedEntityMapperKt.toEmbeddedEntity(aVar4) : null;
        fva.m mVar2 = pVar.u;
        VaultReceiverInfoEmbeddedEntity embeddedEntity10 = mVar2 != null ? VaultReceiverEntityMapperKt.toEmbeddedEntity(mVar2) : null;
        String str10 = pVar.z;
        qua.g gVar = pVar.f249332w;
        MerchantEmbeddedEntity embeddedEntity11 = gVar != null ? MerchantReceiverEntityMapperKt.toEmbeddedEntity(gVar) : null;
        tua.b bVar2 = pVar.f249333x;
        CreditReceiverEmbeddedEntity embeddedEntity12 = bVar2 != null ? CreditReceiverEmbeddedEntityMapperKt.toEmbeddedEntity(bVar2) : null;
        tua.d dVar2 = pVar.f249334y;
        PayLaterReceiverEmbeddedEntity embeddedEntity13 = dVar2 != null ? PayLaterReceiverEmbeddedEntityMapperKt.toEmbeddedEntity(dVar2) : null;
        tua.c cVar2 = pVar.B;
        LoanReceiverEmbeddedEntity embeddedEntity14 = cVar2 != null ? LoanReceiverEmbeddedEntityMapperKt.toEmbeddedEntity(cVar2) : null;
        ibd.a aVar5 = pVar.A;
        WalletAccountDetailsEntity embeddedEntity15 = aVar5 != null ? WalletAccountDetailsEntityMapperKt.toEmbeddedEntity(aVar5) : null;
        ibd.a aVar6 = pVar.F;
        WalletAccountDetailsEntity embeddedEntity16 = aVar6 != null ? WalletAccountDetailsEntityMapperKt.toEmbeddedEntity(aVar6) : null;
        qua.h hVar = pVar.C;
        PaymentCounterpartyReceiverInfoEntity embeddedEntity17 = hVar != null ? RecurringPaymentCounterpartyReceiverInfoEntityMapperKt.toEmbeddedEntity(hVar) : null;
        fva.h hVar2 = pVar.E;
        RecurringPaymentMethodDetailsEmbeddedEntity embeddedEntity18 = hVar2 != null ? toEmbeddedEntity(hVar2) : null;
        rua.d dVar3 = pVar.D;
        UpiReceiverEmbeddedEntity embeddedEntity19 = dVar3 != null ? RecurringPaymentUpiReceiverInfoEntityMapperKt.toEmbeddedEntity(dVar3) : null;
        String str11 = pVar.f249327p;
        int i = pVar.H;
        String str12 = pVar.I;
        Set set = pVar.G;
        fva.j jVar = pVar.O;
        RecurringPlanInfoEmbeddedEntity embeddedEntity20 = jVar != null ? RecurringPlanInfoEmbeddedEntityMapperKt.toEmbeddedEntity(jVar) : null;
        String str13 = pVar.L;
        String str14 = str13 == null ? null : str13;
        o oVar = pVar.M;
        String str15 = oVar != null ? oVar.f249312a : null;
        String str16 = oVar != null ? oVar.f249313b : null;
        i iVar = pVar.Q;
        PendingRefundSenderInfoEmbeddedEntity embeddedEntity21 = iVar != null ? toEmbeddedEntity(iVar) : null;
        List list = pVar.R;
        String str17 = str15;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList2.add(toEmbeddedEntity((a0) it8.next()));
        }
        TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntity = new TransferReferencesEmbeddedEntity(arrayList2);
        String str18 = pVar.W;
        j jVar2 = pVar.X;
        String strName = jVar2 != null ? jVar2.name() : null;
        g gVar2 = pVar.U;
        RecurringPaymentMethodEmbeddedEntity embeddedEntity22 = gVar2 != null ? toEmbeddedEntity(gVar2) : null;
        l lVar = pVar.V;
        RecurringPaymentSchemeEmbeddedEntity embeddedEntity23 = lVar != null ? toEmbeddedEntity(lVar) : null;
        RecurringPaymentEndCriteria recurringPaymentEndCriteria = eVar.i;
        RecurringPaymentEndCriteriaEmbeddedEntity embeddedEntity24 = recurringPaymentEndCriteria != null ? toEmbeddedEntity(recurringPaymentEndCriteria) : null;
        List list2 = pVar.Z;
        if (list2 != null) {
            List list3 = list2;
            recurringPaymentSchemeEmbeddedEntity = embeddedEntity23;
            str = str18;
            arrayList = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList.add(((a) it9.next()).name());
            }
        } else {
            recurringPaymentSchemeEmbeddedEntity = embeddedEntity23;
            str = str18;
            arrayList = null;
        }
        s sVar = pVar.f249315a0;
        RecurringPaymentFundsSourceEmbeddedEntity embeddedEntity25 = sVar != null ? toEmbeddedEntity(sVar) : null;
        n nVar = pVar.Y;
        RecurringPaymentBillDetailsEntity embeddedEntity26 = nVar != null ? toEmbeddedEntity(nVar) : null;
        RecurringPaymentFundsSourceEmbeddedEntity recurringPaymentFundsSourceEmbeddedEntity = embeddedEntity25;
        WalletAutomation walletAutomation = pVar.f249317b0;
        WalletAutomationEmbeddedEntity embeddedEntity27 = walletAutomation != null ? toEmbeddedEntity(walletAutomation) : null;
        kq2.g gVar3 = pVar.T;
        String strName2 = gVar3 != null ? gVar3.name() : null;
        Boolean bool4 = pVar.c0;
        LocalDate localDate4 = pVar.f249319d0;
        String string5 = localDate4 != null ? localDate4.toString() : null;
        LocalDate localDate5 = pVar.f249320e0;
        return new RecurringPaymentEntity(str2, embeddedEntity2, embeddedEntity3, str3, embeddedEntity, lValueOf, string, string2, string3, string4, embeddedEntity4, bool, bool2, bool3, bVarA, str4, str5, l3, str6, str9, embeddedEntity5, embeddedEntity6, embeddedEntity7, embeddedEntity8, embeddedEntity9, embeddedEntity10, embeddedEntity11, embeddedEntity12, embeddedEntity13, embeddedEntity14, embeddedEntity15, str10, embeddedEntity17, embeddedEntity18, embeddedEntity19, embeddedEntity16, str8, str11, i, str12, set, embeddedEntity20, str14, str17, str16, str7, embeddedEntity21, transferReferencesEmbeddedEntity, str, strName, recurringPaymentSchemeEmbeddedEntity, embeddedEntity22, embeddedEntity24, arrayList, recurringPaymentFundsSourceEmbeddedEntity, embeddedEntity26, embeddedEntity27, strName2, bool4, string5, localDate5 != null ? localDate5.toString() : null);
    }

    @NotNull
    public static final RecurringPaymentStateEmbeddedEntity toEmbeddedEntity(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$6[fVar.ordinal()]) {
            case 1:
                return RecurringPaymentStateEmbeddedEntity.ACTIVE;
            case 2:
                return RecurringPaymentStateEmbeddedEntity.INACTIVE;
            case 3:
                return RecurringPaymentStateEmbeddedEntity.BLOCKED;
            case 4:
                return RecurringPaymentStateEmbeddedEntity.PENDING;
            case 5:
                return RecurringPaymentStateEmbeddedEntity.CONFIRMED;
            case 6:
                return RecurringPaymentStateEmbeddedEntity.DISCONFIRMED;
            case 7:
                return RecurringPaymentStateEmbeddedEntity.RAISED;
            default:
                return RecurringPaymentStateEmbeddedEntity.UNKNOWN;
        }
    }

    @NotNull
    public static final RecurringPaymentFrequencyEmbeddedEntity toEmbeddedEntity(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$7[eVar.ordinal()]) {
            case 1:
                return RecurringPaymentFrequencyEmbeddedEntity.ADHOC;
            case 2:
                return RecurringPaymentFrequencyEmbeddedEntity.WEEKLY;
            case 3:
                return RecurringPaymentFrequencyEmbeddedEntity.BI_WEEKLY;
            case 4:
                return RecurringPaymentFrequencyEmbeddedEntity.MONTHLY;
            case 5:
                return RecurringPaymentFrequencyEmbeddedEntity.QUARTERLY;
            case 6:
                return RecurringPaymentFrequencyEmbeddedEntity.HALF_YEARLY;
            case 7:
                return RecurringPaymentFrequencyEmbeddedEntity.YEARLY;
            case 8:
                return RecurringPaymentFrequencyEmbeddedEntity.DAILY;
            case 9:
                return RecurringPaymentFrequencyEmbeddedEntity.TWICE_WEEKLY;
            case 10:
                return RecurringPaymentFrequencyEmbeddedEntity.TEN_DAYS;
            case 11:
                return RecurringPaymentFrequencyEmbeddedEntity.BI_MONTHLY;
            case 12:
                return RecurringPaymentFrequencyEmbeddedEntity.TRIMESTER;
            case 13:
                return RecurringPaymentFrequencyEmbeddedEntity.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final RecurringPaymentTypeEmbeddedEntity toEmbeddedEntity(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$8[hVar.ordinal()]) {
            case 1:
                return RecurringPaymentTypeEmbeddedEntity.SAVINGS_POCKET;
            case 2:
                return RecurringPaymentTypeEmbeddedEntity.VAULT;
            case 3:
                return RecurringPaymentTypeEmbeddedEntity.BILL_MONEY_BOX;
            case 4:
                return RecurringPaymentTypeEmbeddedEntity.INTERNAL;
            case 5:
                return RecurringPaymentTypeEmbeddedEntity.EXTERNAL_MANDATE;
            case 6:
                return RecurringPaymentTypeEmbeddedEntity.CARD_MANDATE;
            case 7:
                return RecurringPaymentTypeEmbeddedEntity.MANUAL_CARD_MANDATE;
            case 8:
                return RecurringPaymentTypeEmbeddedEntity.EXTERNAL;
            case 9:
                return RecurringPaymentTypeEmbeddedEntity.YOUTH_ALLOWANCE;
            case 10:
                return RecurringPaymentTypeEmbeddedEntity.CRYPTO;
            case 11:
                return RecurringPaymentTypeEmbeddedEntity.PAY_LATER_PAYMENT;
            case 12:
                return RecurringPaymentTypeEmbeddedEntity.ACQUIRING_ONE_OFF;
            case 13:
                return RecurringPaymentTypeEmbeddedEntity.ACQUIRING_SUBSCRIPTION;
            case 14:
                return RecurringPaymentTypeEmbeddedEntity.PAID_PLAN;
            case 15:
                return RecurringPaymentTypeEmbeddedEntity.COBRANDS;
            case 16:
                return RecurringPaymentTypeEmbeddedEntity.WALLET;
            case 17:
                return RecurringPaymentTypeEmbeddedEntity.BPAY;
            case 18:
                return RecurringPaymentTypeEmbeddedEntity.NZ_BILLS;
            case 19:
                return RecurringPaymentTypeEmbeddedEntity.UAE_BILLS;
            case 20:
                return RecurringPaymentTypeEmbeddedEntity.UPI;
            case 21:
                return RecurringPaymentTypeEmbeddedEntity.UPI_MANDATE;
            case 22:
                return RecurringPaymentTypeEmbeddedEntity.MOBILE_PLAN_SUBSCRIPTION;
            default:
                return RecurringPaymentTypeEmbeddedEntity.UNKNOWN;
        }
    }

    @NotNull
    public static final RecurringPaymentMethodEmbeddedEntity toEmbeddedEntity(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$9[gVar.ordinal()];
        if (i == 1) {
            return RecurringPaymentMethodEmbeddedEntity.BOLETO;
        }
        if (i == 2) {
            return RecurringPaymentMethodEmbeddedEntity.BPAY;
        }
        if (i == 3) {
            return RecurringPaymentMethodEmbeddedEntity.PIX;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final RecurringPaymentSchemeEmbeddedEntity toEmbeddedEntity(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$10[lVar.ordinal()]) {
            case 1:
                return RecurringPaymentSchemeEmbeddedEntity.PIX;
            case 2:
                return RecurringPaymentSchemeEmbeddedEntity.DE;
            case 3:
                return RecurringPaymentSchemeEmbeddedEntity.BPAY;
            case 4:
                return RecurringPaymentSchemeEmbeddedEntity.NPP;
            case 5:
                return RecurringPaymentSchemeEmbeddedEntity.BOLETO;
            case 6:
                return RecurringPaymentSchemeEmbeddedEntity.NZ_BECS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final RecurringPaymentFundsSourceEmbeddedEntity toEmbeddedEntity(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return new RecurringPaymentFundsSourceEmbeddedEntity(sVar.f249335a, sVar.f249336b.name());
    }

    @NotNull
    public static final RecurringPaymentEndCriteriaEmbeddedEntity toEmbeddedEntity(@NotNull RecurringPaymentEndCriteria recurringPaymentEndCriteria) {
        Intrinsics.checkNotNullParameter(recurringPaymentEndCriteria, "<this>");
        if (recurringPaymentEndCriteria instanceof RecurringPaymentEndCriteria.Date) {
            return new RecurringPaymentEndCriteriaEmbeddedEntity(RecurringPaymentEndCriteriaTypeEmbeddedEntity.DATE, ((RecurringPaymentEndCriteria.Date) recurringPaymentEndCriteria).f86442a.toString(), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final f toDomain(@NotNull RecurringPaymentStateEmbeddedEntity recurringPaymentStateEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentStateEmbeddedEntity, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[recurringPaymentStateEmbeddedEntity.ordinal()]) {
            case 1:
                return f.ACTIVE;
            case 2:
                return f.BLOCKED;
            case 3:
                return f.INACTIVE;
            case 4:
                return f.PENDING;
            case 5:
                return f.CONFIRMED;
            case 6:
                return f.DISCONFIRMED;
            case 7:
                return f.RAISED;
            default:
                return f.UNKNOWN;
        }
    }

    @NotNull
    public static final RecurringPaymentBillDetailsEntity toEmbeddedEntity(@NotNull n nVar) {
        String string;
        String str;
        k kVar;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        qua.m mVar = nVar.f249305a;
        qua.l lVar = nVar.f249308g;
        if (mVar != null) {
            string = mVar.toString();
            str = null;
        } else {
            string = null;
            str = null;
        }
        String str2 = nVar.f249306b;
        String str3 = str;
        String str4 = nVar.f249307c;
        LocalDate localDate = nVar.f;
        String string2 = localDate != null ? localDate.toString() : str3;
        LocalDate localDate2 = nVar.d;
        String string3 = localDate2 != null ? localDate2.toString() : str3;
        Boolean bool = nVar.e;
        String str5 = lVar != null ? lVar.f249302a : str3;
        String string4 = (lVar == null || (kVar = lVar.f249303b) == null) ? str3 : kVar.toString();
        String str6 = lVar != null ? lVar.f249304c : str3;
        String str7 = lVar != null ? lVar.d : str3;
        String str8 = lVar != null ? lVar.e : str3;
        String str9 = lVar != null ? lVar.f : str3;
        boolean z = nVar.f249309h;
        LocalDate localDate3 = nVar.i;
        String string5 = localDate3 != null ? localDate3.toString() : null;
        String str10 = string;
        qua.f fVar = nVar.f249310j;
        BillThresholdsEmbeddedEntity embeddedEntity = fVar != null ? toEmbeddedEntity(fVar) : null;
        qua.e eVar = nVar.k;
        return new RecurringPaymentBillDetailsEntity(str10, str2, str4, string2, string3, bool, str5, string4, str6, str7, str8, str9, z, string5, embeddedEntity, eVar != null ? toEmbeddedEntity(eVar) : null, nVar.f249311l);
    }

    @NotNull
    public static final g toDomain(@NotNull RecurringPaymentMethodEmbeddedEntity recurringPaymentMethodEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentMethodEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[recurringPaymentMethodEmbeddedEntity.ordinal()];
        if (i == 1) {
            return g.BOLETO;
        }
        if (i == 2) {
            return g.BPAY;
        }
        if (i == 3) {
            return g.PIX;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final s toDomain(@NotNull RecurringPaymentFundsSourceEmbeddedEntity recurringPaymentFundsSourceEmbeddedEntity) {
        r rVar;
        Intrinsics.checkNotNullParameter(recurringPaymentFundsSourceEmbeddedEntity, "<this>");
        String id10 = recurringPaymentFundsSourceEmbeddedEntity.getId();
        String type = recurringPaymentFundsSourceEmbeddedEntity.getType();
        r[] rVarArrValues = r.values();
        int length = rVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                rVar = null;
                break;
            }
            rVar = rVarArrValues[i];
            if (kotlin.text.a0.z(rVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (rVar == null) {
            rVar = r.UNKNOWN;
        }
        return new s(id10, rVar);
    }

    @NotNull
    public static final l toDomain(@NotNull RecurringPaymentSchemeEmbeddedEntity recurringPaymentSchemeEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentSchemeEmbeddedEntity, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[recurringPaymentSchemeEmbeddedEntity.ordinal()]) {
            case 1:
                return l.PIX;
            case 2:
                return l.DE;
            case 3:
                return l.BPAY;
            case 4:
                return l.NPP;
            case 5:
                return l.BOLETO;
            case 6:
                return l.NZ_BECS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final BillThresholdsEmbeddedEntity toEmbeddedEntity(@NotNull qua.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        d dVar = fVar.f249290a;
        b bVarA = dVar != null ? hx7.a.A(dVar) : null;
        d dVar2 = fVar.f249291b;
        return new BillThresholdsEmbeddedEntity(bVarA, dVar2 != null ? hx7.a.A(dVar2) : null);
    }

    @NotNull
    public static final h toDomain(@NotNull RecurringPaymentTypeEmbeddedEntity recurringPaymentTypeEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentTypeEmbeddedEntity, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$3[recurringPaymentTypeEmbeddedEntity.ordinal()]) {
            case 1:
                return h.SAVINGS_POCKET;
            case 2:
                return h.VAULT;
            case 3:
                return h.BILL_MONEY_BOX;
            case 4:
                return h.INTERNAL;
            case 5:
                return h.EXTERNAL_MANDATE;
            case 6:
                return h.CARD_MANDATE;
            case 7:
                return h.MANUAL_CARD_MANDATE;
            case 8:
                return h.COBRANDS;
            case 9:
                return h.EXTERNAL;
            case 10:
                return h.YOUTH_ALLOWANCE;
            case 11:
                return h.CRYPTO;
            case 12:
                return h.PAY_LATER_PAYMENT;
            case 13:
                return h.PAID_PLAN;
            case 14:
                return h.WALLET;
            case 15:
                return h.BPAY;
            case 16:
                return h.NZ_BILLS;
            case 17:
                return h.UAE_BILLS;
            case 18:
                return h.PIX_MANDATE;
            case 19:
                return h.UPI_MANDATE;
            case 20:
                return h.UPI;
            case 21:
                return h.GIRO_HU_DIRECT_DEBIT;
            case 22:
                return h.MASAV_IL_DIRECT_DEBIT;
            case 23:
                return h.BOLETO;
            case 24:
                return h.MOBILE_PLAN_SUBSCRIPTION;
            default:
                return h.UNKNOWN;
        }
    }

    @NotNull
    public static final BillFeesEmbeddedEntity toEmbeddedEntity(@NotNull qua.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        d dVar = eVar.f249287a;
        b bVarA = dVar != null ? hx7.a.A(dVar) : null;
        d dVar2 = eVar.f249288b;
        b bVarA2 = dVar2 != null ? hx7.a.A(dVar2) : null;
        d dVar3 = eVar.f249289c;
        b bVarA3 = dVar3 != null ? hx7.a.A(dVar3) : null;
        d dVar4 = eVar.d;
        return new BillFeesEmbeddedEntity(bVarA, bVarA2, bVarA3, dVar4 != null ? hx7.a.A(dVar4) : null);
    }

    @NotNull
    public static final TransferReferencesEmbeddedEntity.TransferReferenceEntity toEmbeddedEntity(@NotNull a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return new TransferReferencesEmbeddedEntity.TransferReferenceEntity(a0Var.f249282a, a0Var.f249283b, a0Var.f249284c, a0Var.d);
    }

    @NotNull
    public static final RecurringPaymentMethodDetailsEmbeddedEntity toEmbeddedEntity(@NotNull fva.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        fva.c cVar = hVar.f138397a;
        RecurringPaymentCreditorEmbeddedEntity embeddedEntity = cVar != null ? toEmbeddedEntity(cVar) : null;
        fva.d dVar = hVar.f138398b;
        return new RecurringPaymentMethodDetailsEmbeddedEntity(embeddedEntity, dVar != null ? toEmbeddedEntity(dVar) : null, hVar.f138399c, hVar.d, hVar.e);
    }

    @NotNull
    public static final e toDomain(@NotNull RecurringPaymentFrequencyEmbeddedEntity recurringPaymentFrequencyEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentFrequencyEmbeddedEntity, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$4[recurringPaymentFrequencyEmbeddedEntity.ordinal()]) {
            case 1:
                return e.ADHOC;
            case 2:
                return e.WEEKLY;
            case 3:
                return e.BI_WEEKLY;
            case 4:
                return e.MONTHLY;
            case 5:
                return e.QUARTERLY;
            case 6:
                return e.HALF_YEARLY;
            case 7:
                return e.YEARLY;
            case 8:
                return e.DAILY;
            case 9:
                return e.TWICE_WEEKLY;
            case 10:
                return e.TEN_DAYS;
            case 11:
                return e.BI_MONTHLY;
            case 12:
                return e.TRIMESTER;
            case 13:
                return e.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final RecurringPaymentCreditorEmbeddedEntity toEmbeddedEntity(@NotNull fva.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f138390a;
        fva.f fVar = cVar.f138391b;
        return new RecurringPaymentCreditorEmbeddedEntity(str, fVar != null ? toEmbeddedEntity(fVar) : null, cVar.f138392c, cVar.d);
    }

    @NotNull
    public static final RecurringPaymentDebtorEmbeddedEntity toEmbeddedEntity(@NotNull fva.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String str = dVar.f138393a;
        fva.f fVar = dVar.f138394b;
        return new RecurringPaymentDebtorEmbeddedEntity(str, fVar != null ? toEmbeddedEntity(fVar) : null);
    }

    public static final RecurringPaymentEndCriteria.Date toDomain(@NotNull RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentEndCriteriaEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$5[recurringPaymentEndCriteriaEmbeddedEntity.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        java.time.LocalDate localDate = java.time.LocalDate.parse(recurringPaymentEndCriteriaEmbeddedEntity.getDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return new RecurringPaymentEndCriteria.Date(localDate);
    }

    @NotNull
    public static final RecurringPaymentIdentificationEmbeddedEntity toEmbeddedEntity(@NotNull fva.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new RecurringPaymentIdentificationEmbeddedEntity(String.valueOf(fVar.f138395a), fVar.f138396b);
    }

    @NotNull
    public static final i toDomain(@NotNull PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntity) {
        k3 k3VarA;
        l2 l2VarC;
        Intrinsics.checkNotNullParameter(pendingRefundSenderInfoEmbeddedEntity, "<this>");
        String logoUrl = pendingRefundSenderInfoEmbeddedEntity.getLogoUrl();
        String title = pendingRefundSenderInfoEmbeddedEntity.getTitle();
        Long initiatedDate = pendingRefundSenderInfoEmbeddedEntity.getInitiatedDate();
        LocalDateTime localDateTime = initiatedDate != null ? new LocalDateTime(initiatedDate.longValue()) : null;
        String category = pendingRefundSenderInfoEmbeddedEntity.getCategory();
        if (category == null || (l2VarC = l3.c(category)) == null) {
            i3.Companion.getClass();
            k3VarA = i3.a.a();
        } else {
            k3VarA = new k3(l2VarC);
        }
        return new i(logoUrl, title, localDateTime, k3VarA);
    }

    @NotNull
    public static final WalletAutomationEmbeddedEntity toEmbeddedEntity(@NotNull WalletAutomation walletAutomation) {
        ibd.j jVar;
        d dVar;
        ibd.j jVar2;
        d dVar2;
        Intrinsics.checkNotNullParameter(walletAutomation, "<this>");
        String strB = null;
        if (walletAutomation instanceof WalletAutomation.DropsBelow) {
            WalletAutomation.DropsBelow dropsBelow = (WalletAutomation.DropsBelow) walletAutomation;
            WalletAutomation.Limit limit = dropsBelow.e;
            b bVarA = hx7.a.A(dropsBelow.f86444b);
            b bVarA2 = hx7.a.A(dropsBelow.f86443a);
            String str = dropsBelow.f86445c;
            String str2 = dropsBelow.d;
            b bVarA3 = (limit == null || (dVar2 = limit.f86449a) == null) ? null : hx7.a.A(dVar2);
            if (limit != null && (jVar2 = limit.f86450b) != null) {
                strB = jVar2.b();
            }
            return new WalletAutomationEmbeddedEntity.DropsBelow(bVarA, bVarA2, str, str2, bVarA3, strB);
        }
        if (walletAutomation instanceof WalletAutomation.Exceeds) {
            WalletAutomation.Exceeds exceeds = (WalletAutomation.Exceeds) walletAutomation;
            WalletAutomation.Limit limit2 = exceeds.d;
            b bVarA4 = hx7.a.A(exceeds.f86446a);
            String str3 = exceeds.f86447b;
            String str4 = exceeds.f86448c;
            b bVarA5 = (limit2 == null || (dVar = limit2.f86449a) == null) ? null : hx7.a.A(dVar);
            if (limit2 != null && (jVar = limit2.f86450b) != null) {
                strB = jVar.b();
            }
            return new WalletAutomationEmbeddedEntity.Exceeds(bVarA4, str3, str4, bVarA5, strB);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final n toDomain(@NotNull RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntity) {
        qua.m mVar;
        k kVar;
        k kVar2;
        qua.m mVar2;
        Intrinsics.checkNotNullParameter(recurringPaymentBillDetailsEntity, "<this>");
        String transferType = recurringPaymentBillDetailsEntity.getTransferType();
        if (transferType != null) {
            qua.m[] mVarArrValues = qua.m.values();
            int length = mVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mVar2 = null;
                    break;
                }
                mVar2 = mVarArrValues[i];
                if (kotlin.text.a0.z(mVar2.name(), transferType, true)) {
                    break;
                }
                i++;
            }
            mVar = mVar2;
        } else {
            mVar = null;
        }
        String standingOrderId = recurringPaymentBillDetailsEntity.getStandingOrderId();
        String billNumber = recurringPaymentBillDetailsEntity.getBillNumber();
        String scheduledDate = recurringPaymentBillDetailsEntity.getScheduledDate();
        LocalDate localDate = scheduledDate != null ? parseLocalDate(scheduledDate) : null;
        String dueDate = recurringPaymentBillDetailsEntity.getDueDate();
        LocalDate localDate2 = dueDate != null ? parseLocalDate(dueDate) : null;
        Boolean hasEditableAmount = recurringPaymentBillDetailsEntity.getHasEditableAmount();
        String beneficiaryName = recurringPaymentBillDetailsEntity.getBeneficiaryName();
        if (beneficiaryName == null) {
            beneficiaryName = "";
        }
        String str = beneficiaryName;
        String beneficiaryType = recurringPaymentBillDetailsEntity.getBeneficiaryType();
        if (beneficiaryType != null) {
            k[] kVarArrValues = k.values();
            int length2 = kVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    kVar2 = null;
                    break;
                }
                kVar2 = kVarArrValues[i2];
                if (kotlin.text.a0.z(kVar2.name(), beneficiaryType, true)) {
                    break;
                }
                i2++;
            }
            kVar = kVar2;
        } else {
            kVar = null;
        }
        qua.l lVar = new qua.l(str, kVar, recurringPaymentBillDetailsEntity.getBeneficiaryTaxId(), recurringPaymentBillDetailsEntity.getBeneficiaryBankName(), recurringPaymentBillDetailsEntity.getBeneficiaryBankNumber(), recurringPaymentBillDetailsEntity.getBeneficiaryBankCode());
        boolean z = recurringPaymentBillDetailsEntity.getCanBePaidNow();
        String nextAvailableDateForPayment = recurringPaymentBillDetailsEntity.getNextAvailableDateForPayment();
        LocalDate localDate3 = nextAvailableDateForPayment != null ? parseLocalDate(nextAvailableDateForPayment) : null;
        BillThresholdsEmbeddedEntity thresholds = recurringPaymentBillDetailsEntity.getThresholds();
        qua.f domain = thresholds != null ? toDomain(thresholds) : null;
        BillFeesEmbeddedEntity fees = recurringPaymentBillDetailsEntity.getFees();
        return new n(mVar, standingOrderId, billNumber, localDate2, hasEditableAmount, localDate, lVar, z, localDate3, domain, fees != null ? toDomain(fees) : null, recurringPaymentBillDetailsEntity.getPaymentAgreementId());
    }

    @NotNull
    public static final qua.f toDomain(@NotNull BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(billThresholdsEmbeddedEntity, "<this>");
        b minAmount = billThresholdsEmbeddedEntity.getMinAmount();
        d dVarV = minAmount != null ? hx7.a.v(minAmount) : null;
        b maxAmount = billThresholdsEmbeddedEntity.getMaxAmount();
        return new qua.f(dVarV, maxAmount != null ? hx7.a.v(maxAmount) : null);
    }

    @NotNull
    public static final qua.e toDomain(@NotNull BillFeesEmbeddedEntity billFeesEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(billFeesEmbeddedEntity, "<this>");
        b interest = billFeesEmbeddedEntity.getInterest();
        d dVarV = interest != null ? hx7.a.v(interest) : null;
        b fine = billFeesEmbeddedEntity.getFine();
        d dVarV2 = fine != null ? hx7.a.v(fine) : null;
        b discount = billFeesEmbeddedEntity.getDiscount();
        d dVarV3 = discount != null ? hx7.a.v(discount) : null;
        b totalFees = billFeesEmbeddedEntity.getTotalFees();
        return new qua.e(dVarV, dVarV2, dVarV3, totalFees != null ? hx7.a.v(totalFees) : null);
    }

    @NotNull
    public static final List<a0> toDomain(TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntity) {
        ArrayList arrayList;
        List<TransferReferencesEmbeddedEntity.TransferReferenceEntity> references;
        if (transferReferencesEmbeddedEntity == null || (references = transferReferencesEmbeddedEntity.getReferences()) == null) {
            arrayList = null;
        } else {
            List<TransferReferencesEmbeddedEntity.TransferReferenceEntity> list = references;
            arrayList = new ArrayList(w.t(list, 10));
            for (TransferReferencesEmbeddedEntity.TransferReferenceEntity transferReferenceEntity : list) {
                arrayList.add(new a0(transferReferenceEntity.getLabel(), transferReferenceEntity.getValue(), transferReferenceEntity.getOptionType(), transferReferenceEntity.getFieldType()));
            }
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    @NotNull
    public static final fva.h toDomain(@NotNull RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentMethodDetailsEmbeddedEntity, "<this>");
        RecurringPaymentCreditorEmbeddedEntity creditor = recurringPaymentMethodDetailsEmbeddedEntity.getCreditor();
        fva.c domain = creditor != null ? toDomain(creditor) : null;
        RecurringPaymentDebtorEmbeddedEntity debtor = recurringPaymentMethodDetailsEmbeddedEntity.getDebtor();
        return new fva.h(domain, debtor != null ? toDomain(debtor) : null, recurringPaymentMethodDetailsEmbeddedEntity.getDocumentDescription(), recurringPaymentMethodDetailsEmbeddedEntity.getDocumentNumber(), recurringPaymentMethodDetailsEmbeddedEntity.getAdditionalInformation());
    }

    @NotNull
    public static final fva.c toDomain(@NotNull RecurringPaymentCreditorEmbeddedEntity recurringPaymentCreditorEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentCreditorEmbeddedEntity, "<this>");
        String name = recurringPaymentCreditorEmbeddedEntity.getName();
        RecurringPaymentIdentificationEmbeddedEntity identification = recurringPaymentCreditorEmbeddedEntity.getIdentification();
        return new fva.c(name, identification != null ? toDomain(identification) : null, recurringPaymentCreditorEmbeddedEntity.getInstitutionName(), recurringPaymentCreditorEmbeddedEntity.getServiceProviderLogo());
    }

    @NotNull
    public static final fva.d toDomain(@NotNull RecurringPaymentDebtorEmbeddedEntity recurringPaymentDebtorEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentDebtorEmbeddedEntity, "<this>");
        String name = recurringPaymentDebtorEmbeddedEntity.getName();
        RecurringPaymentIdentificationEmbeddedEntity identification = recurringPaymentDebtorEmbeddedEntity.getIdentification();
        return new fva.d(name, identification != null ? toDomain(identification) : null);
    }

    @NotNull
    public static final fva.f toDomain(@NotNull RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentIdentificationEmbeddedEntity, "<this>");
        String type = recurringPaymentIdentificationEmbeddedEntity.getType();
        BeneficiaryIdentificationType beneficiaryIdentificationType = null;
        if (type != null) {
            BeneficiaryIdentificationType[] beneficiaryIdentificationTypeArrValues = BeneficiaryIdentificationType.values();
            int length = beneficiaryIdentificationTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                BeneficiaryIdentificationType beneficiaryIdentificationType2 = beneficiaryIdentificationTypeArrValues[i];
                if (kotlin.text.a0.z(beneficiaryIdentificationType2.name(), type, true)) {
                    beneficiaryIdentificationType = beneficiaryIdentificationType2;
                    break;
                }
                i++;
            }
        }
        return new fva.f(beneficiaryIdentificationType, recurringPaymentIdentificationEmbeddedEntity.getValue());
    }

    @NotNull
    public static final WalletAutomation toDomain(@NotNull WalletAutomationEmbeddedEntity walletAutomationEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(walletAutomationEmbeddedEntity, "<this>");
        WalletAutomation.Limit limit = null;
        if (walletAutomationEmbeddedEntity instanceof WalletAutomationEmbeddedEntity.DropsBelow) {
            WalletAutomationEmbeddedEntity.DropsBelow dropsBelow = (WalletAutomationEmbeddedEntity.DropsBelow) walletAutomationEmbeddedEntity;
            String limitPeriod = dropsBelow.getLimitPeriod();
            ibd.j walletAutomationPeriod = limitPeriod != null ? WalletAutomationPeriodMapperKt.toWalletAutomationPeriod(limitPeriod) : null;
            if (dropsBelow.getLimitMax() != null && walletAutomationPeriod != null) {
                limit = new WalletAutomation.Limit(hx7.a.v(dropsBelow.getLimitMax()), walletAutomationPeriod);
            }
            return new WalletAutomation.DropsBelow(hx7.a.v(dropsBelow.getTopupAmount()), hx7.a.v(dropsBelow.getThreshold()), dropsBelow.getMonitoredPocket(), dropsBelow.getTopupFrom(), limit);
        }
        if (walletAutomationEmbeddedEntity instanceof WalletAutomationEmbeddedEntity.Exceeds) {
            WalletAutomationEmbeddedEntity.Exceeds exceeds = (WalletAutomationEmbeddedEntity.Exceeds) walletAutomationEmbeddedEntity;
            String limitPeriod2 = exceeds.getLimitPeriod();
            ibd.j walletAutomationPeriod2 = limitPeriod2 != null ? WalletAutomationPeriodMapperKt.toWalletAutomationPeriod(limitPeriod2) : null;
            if (exceeds.getLimitMax() != null && walletAutomationPeriod2 != null) {
                limit = new WalletAutomation.Limit(hx7.a.v(exceeds.getLimitMax()), walletAutomationPeriod2);
            }
            return new WalletAutomation.Exceeds(hx7.a.v(exceeds.getThreshold()), exceeds.getMonitoredPocket(), exceeds.getReceiver(), limit);
        }
        throw new NoWhenBranchMatchedException();
    }
}
