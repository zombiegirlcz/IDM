package com.revolut.data.network.models.recurringpayment.mapper;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.network.models.beneficiary.BeneficiaryEmbeddedDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.data.network.models.bill_accounts.BillAccountReceiverInfoDto;
import com.revolut.data.network.models.bill_accounts.BillAccountReceiverInfoDtoKt;
import com.revolut.data.network.models.credit.CreditReceiverInfoDto;
import com.revolut.data.network.models.credit.LoanReceiverInfoDto;
import com.revolut.data.network.models.credit.PayLaterReceiverInfoDto;
import com.revolut.data.network.models.credit.mapper.CreditReceiverInfoDtoMapperKt;
import com.revolut.data.network.models.credit.mapper.LoanPaymentReceiverInfoDtoMapperKt;
import com.revolut.data.network.models.credit.mapper.PayLaterReceiverInfoDtoMapperKt;
import com.revolut.data.network.models.creditor.CreditorDto;
import com.revolut.data.network.models.creditor.mapper.CreditorDtoMapperKt;
import com.revolut.data.network.models.recipient.RecipientDto;
import com.revolut.data.network.models.recipient.mapper.RecipientDtoMapperKt;
import com.revolut.data.network.models.recurringbuys.RecurringBuyReceiverInfoDto;
import com.revolut.data.network.models.recurringbuys.mapper.RecurringBuyReceinverInfoMapperKt;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentMerchantDto;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentMethodMandateDto;
import com.revolut.data.network.models.transfer.mapper.TransferReasonEmbeddedDtoMapperKt;
import com.revolut.data.network.models.vaults.VaultReceiverInfoDto;
import com.revolut.data.network.models.vaults.VaultReceiverInfoMapperKt;
import com.revolut.data.network.models.wallet.AccountInfoDto;
import com.revolut.data.network.models.wallet.mapper.PersonalAccountInfoMapperKt;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import fva.m;
import ibd.e;
import ibd.f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import o9l.b0;
import o9l.h;
import o9l.j;
import o9l.k;
import o9l.p;
import o9l.q;
import o9l.r;
import o9l.s;
import o9l.t;
import o9l.u;
import o9l.v;
import o9l.w;
import o9l.x;
import o9l.z;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import qua.g;
import qua.i;
import qua.l;
import qua.n;
import rd0.d;
import rua.a;
import rua.b;
import rua.c;
import tof.i3;
import tof.k3;
import tof.l2;
import tof.l3;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000b\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u0013J)\u0010\u000b\u001a\u0004\u0018\u00010\u0018*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u000b\u001a\u00020\u0018*\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u000b\u0010 J\u0013\u0010\u000b\u001a\u00020\u001b*\u00020!H\u0002¢\u0006\u0004\b\u000b\u0010\"J\u0013\u0010\u000b\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b\u000b\u0010%J\u0013\u0010\u000b\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b\u000b\u0010(J\u0013\u0010)\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b/\u00100J#\u00103\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020+2\b\u00105\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010,\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010,\u001a\u00020+2\b\u0010=\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b?\u0010@J#\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010,\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bC\u0010DJ#\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010,\u001a\u00020+2\b\u0010E\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bG\u0010HJ#\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010,\u001a\u00020+2\b\u0010I\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bK\u0010LJ#\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010,\u001a\u00020+2\b\u0010M\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bO\u0010PJ#\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010,\u001a\u00020+2\b\u0010Q\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bS\u0010TJ#\u0010V\u001a\u0004\u0018\u00010\u000e2\u0006\u0010,\u001a\u00020+2\b\u0010U\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bV\u0010WJ#\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010,\u001a\u00020+2\b\u0010X\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bZ\u0010[J7\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010,\u001a\u00020+2\b\u0010U\u001a\u0004\u0018\u00010\u000e2\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010I\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b_\u0010`J#\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010,\u001a\u00020+2\b\u0010a\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bc\u0010dJ#\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010,\u001a\u00020+2\b\u0010e\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bg\u0010hJ\u001b\u0010k\u001a\u0004\u0018\u00010j2\b\u0010i\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bk\u0010lJ\u0013\u0010\u000b\u001a\u00020n*\u00020mH\u0002¢\u0006\u0004\b\u000b\u0010oJ\u0019\u0010r\u001a\u00020q2\b\u0010\u0005\u001a\u0004\u0018\u00010pH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bu\u0010vJ\u001f\u0010x\u001a\u00020t2\u0006\u0010w\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bx\u0010yJ\u0013\u0010\u000b\u001a\u00020{*\u00020zH\u0002¢\u0006\u0004\b\u000b\u0010|J0\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010}\u001a\u0004\u0018\u00010R2\b\u0010~\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0016\u0010\u000b\u001a\u00030\u0083\u0001*\u00030\u0082\u0001H\u0002¢\u0006\u0005\b\u000b\u0010\u0084\u0001J\u0015\u0010\u000b\u001a\u00020b*\u00030\u0085\u0001H\u0002¢\u0006\u0005\b\u000b\u0010\u0086\u0001J\u0015\u0010\u000b\u001a\u00020f*\u00030\u0087\u0001H\u0002¢\u0006\u0005\b\u000b\u0010\u0088\u0001J\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00030\u0087\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/mapper/RecurringPaymentDtoMapper;", "", "<init>", "()V", "Lo9l/r;", "dto", "Lcom/revolut/feature/core/model/domain/wallet/WalletId;", "walletId", "Lqua/p;", "toDomain-E67O_EE", "(Lo9l/r;Ljava/lang/String;)Lqua/p;", "toDomain", "", "Lo9l/w;", "", "toDomainTransactionIds", "(Ljava/util/Set;)Ljava/util/Set;", "Lo9l/h;", "Lqua/s;", "(Lo9l/h;)Lqua/s;", "Lo9l/n;", "scheduledDate", "", "hasEditableAmount", "Lqua/n;", "(Lo9l/n;Ljava/lang/String;Ljava/lang/Boolean;)Lqua/n;", "Lo9l/m;", "Lqua/l;", "toRecurringBillBeneficiaryFromBillApi", "(Lo9l/m;)Lqua/l;", "Lo9l/c;", "dueDate", "(Lo9l/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lqua/n;", "Lo9l/b;", "(Lo9l/b;)Lqua/l;", "Lo9l/e;", "Lqua/f;", "(Lo9l/e;)Lqua/f;", "Lo9l/d;", "Lqua/e;", "(Lo9l/d;)Lqua/e;", "toDomainTransactionId", "(Lo9l/w;)Ljava/lang/String;", "Libd/h;", "type", "beneficiaryRawResponse", "Lf5j/a;", "toDomainBeneficiary", "(Libd/h;Ljava/lang/String;)Lf5j/a;", "recipientRawResponse", "Lvua/a;", "toDomainRecipient", "(Libd/h;Ljava/lang/String;)Lvua/a;", "creditorRawResponse", "Luua/a;", "toDomainCreditor", "(Libd/h;Ljava/lang/String;)Luua/a;", "vaultRawResponse", "Lfva/m;", "toDomainVault", "(Libd/h;Ljava/lang/String;)Lfva/m;", "recurringBuyRawResponse", "Lwua/a;", "toDomainRecurringBuy", "(Libd/h;Ljava/lang/String;)Lwua/a;", "billAccountRawResponse", "Lsua/a;", "toDomainBillAccount", "(Libd/h;Ljava/lang/String;)Lsua/a;", "merchantRawResponse", "Lqua/g;", "toDomainMerchant", "(Libd/h;Ljava/lang/String;)Lqua/g;", "creditRawResponse", "Ltua/b;", "toDomainCredit", "(Libd/h;Ljava/lang/String;)Ltua/b;", "loanPaymentRaw", "Ltua/c;", "toDomainLoanPayment", "(Libd/h;Ljava/lang/String;)Ltua/c;", "accountInfoRaw", "Libd/a;", "toDomainAccountInfo", "(Libd/h;Ljava/lang/String;)Libd/a;", "logoUrl", "toDomainCobrandsLogo", "(Libd/h;Ljava/lang/String;)Ljava/lang/String;", "senderInfoRaw", "Lqua/i;", "toDomainPendingRefundSenderInfo", "(Libd/h;Ljava/lang/String;)Lqua/i;", "", "feeAmount", "Ltua/d;", "toDomainPayLater", "(Libd/h;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Ltua/d;", "counterpartyRawResponse", "Lqua/h;", "toDomainPaymentCounterparty", "(Libd/h;Ljava/lang/String;)Lqua/h;", "response", "Lrua/d;", "toDomainUpi", "(Libd/h;Ljava/lang/String;)Lrua/d;", "paymentMethodRawResponse", "Lfva/h;", "toDomainPaymentMethodDetails", "(Ljava/lang/String;)Lfva/h;", "Lo9l/u;", "Lfva/j;", "(Lo9l/u;)Lfva/j;", "Lo9l/p;", "", "mapDay", "(Lo9l/p;)I", "", "verifyRecurringPaymentFields", "(Lo9l/r;)V", "fieldName", "logFieldIsNull", "(Ljava/lang/String;Lo9l/r;)V", "Lyhf/h0;", "Lqua/a0;", "(Lyhf/h0;)Lqua/a0;", "senderAccountInfo", "receiverAccountInfo", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "toDomainWalletAutomation", "(Lo9l/r;Libd/a;Libd/a;)Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "Lo9l/z;", "Lcom/revolut/feature/bank_transfer/models/UltimateDebtor;", "(Lo9l/z;)Lcom/revolut/feature/bank_transfer/models/UltimateDebtor;", "Lo9l/j;", "(Lo9l/j;)Lqua/h;", "Lo9l/b0;", "(Lo9l/b0;)Lrua/d;", "Lrua/c;", "getName", "(Lo9l/b0;)Lrua/c;", "RECURRING_BILL_API_BENEFICIARY_TYPE_PF", "Ljava/lang/String;", "RECURRING_BILL_API_BENEFICIARY_TYPE_PJ", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentDtoMapper {

    @NotNull
    private static final String RECURRING_BILL_API_BENEFICIARY_TYPE_PJ = "PJ";

    @NotNull
    private static final String RECURRING_BILL_API_BENEFICIARY_TYPE_PF = "PF";

    @NotNull
    public static final RecurringPaymentDtoMapper INSTANCE = new RecurringPaymentDtoMapper();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[s.a.values().length];
            try {
                iArr[s.a.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.a.COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RecurringPaymentDtoMapper() {
    }

    private final c getName(b0 b0Var) {
        String fullName = b0Var.getFullName();
        if (fullName == null || fullName.length() == 0) {
            String firstName = b0Var.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            return new a(firstName, b0Var.getLastName());
        }
        String fullName2 = b0Var.getFullName();
        if (fullName2 != null) {
            return new b(fullName2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void logFieldIsNull(String fieldName, r dto) {
        String id10 = dto.getId();
        String type = dto.getType();
        v state = dto.getState();
        String currency = dto.getCurrency();
        StringBuilder sbM = v0.a.m("RecurringPaymentDtoMapper error. Expected non null but was null field: ", fieldName, ". dto.id = ", id10, " dto.type = ");
        sbM.append(type);
        sbM.append(" dto.state = ");
        sbM.append(state);
        sbM.append(" dto.currency = ");
        IllegalStateException illegalStateException = new IllegalStateException(v0.a.i(sbM, currency, " "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    private final int mapDay(p dto) {
        if ((dto != null ? dto.getWeekDay() : null) != null) {
            Integer weekDay = dto.getWeekDay();
            if (weekDay != null) {
                return weekDay.intValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if ((dto != null ? dto.getMonthDay() : null) == null) {
            return 1;
        }
        Integer monthDay = dto.getMonthDay();
        if (monthDay != null) {
            return monthDay.intValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final qua.s toDomain(h hVar) {
        qua.r rVar;
        String id10 = hVar.getId();
        String type = hVar.getType();
        qua.r[] rVarArrValues = qua.r.values();
        int length = rVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                rVar = null;
                break;
            }
            rVar = rVarArrValues[i];
            if (a0.z(rVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (rVar == null) {
            rVar = qua.r.UNKNOWN;
        }
        return new qua.s(id10, rVar);
    }

    private final ibd.a toDomainAccountInfo(ibd.h type, String accountInfoRaw) {
        if (type != ibd.h.WALLET || accountInfoRaw == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<AccountInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainAccountInfo$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(accountInfoRaw, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return PersonalAccountInfoMapperKt.toDomain((AccountInfoDto) objD);
    }

    private final f5j.a toDomainBeneficiary(ibd.h type, String beneficiaryRawResponse) {
        if (type != ibd.h.EXTERNAL || beneficiaryRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<BeneficiaryEmbeddedDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainBeneficiary$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(beneficiaryRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return BeneficiaryResponseMapperKt.toDomain((BeneficiaryEmbeddedDto) objD);
    }

    private final sua.a toDomainBillAccount(ibd.h type, String billAccountRawResponse) {
        if (type != ibd.h.BILL_MONEY_BOX || billAccountRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<BillAccountReceiverInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainBillAccount$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(billAccountRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return BillAccountReceiverInfoDtoKt.toDomain((BillAccountReceiverInfoDto) objD);
    }

    private final String toDomainCobrandsLogo(ibd.h type, String logoUrl) {
        if (type != ibd.h.COBRANDS || logoUrl == null) {
            return null;
        }
        return logoUrl;
    }

    private final tua.b toDomainCredit(ibd.h type, String creditRawResponse) {
        if (type != ibd.h.CREDIT_CARD_PAYMENT || creditRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<CreditReceiverInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainCredit$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(creditRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return CreditReceiverInfoDtoMapperKt.toDomain((CreditReceiverInfoDto) objD);
    }

    private final uua.a toDomainCreditor(ibd.h type, String creditorRawResponse) {
        if (type != ibd.h.EXTERNAL_MANDATE || creditorRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<CreditorDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainCreditor$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(creditorRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return CreditorDtoMapperKt.toDomain((CreditorDto) objD);
    }

    private final tua.c toDomainLoanPayment(ibd.h type, String loanPaymentRaw) {
        if ((type != ibd.h.LOAN_PAYMENT && type != ibd.h.MORTGAGE_PAYMENT) || loanPaymentRaw == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<LoanReceiverInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainLoanPayment$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(loanPaymentRaw, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return LoanPaymentReceiverInfoDtoMapperKt.toDomain((LoanReceiverInfoDto) objD);
    }

    private final g toDomainMerchant(ibd.h type, String merchantRawResponse) {
        if (!zhm.v.k(ibd.h.MANUAL_CARD_MANDATE, ibd.h.CARD_MANDATE, ibd.h.PREDEFINED_CARD_MANDATE).contains(type) || merchantRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<RecurringPaymentMerchantDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainMerchant$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(merchantRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return MerchantInfoMapperKt.toDomain((RecurringPaymentMerchantDto) objD);
    }

    private final tua.d toDomainPayLater(ibd.h type, String logoUrl, Long feeAmount, String creditRawResponse) {
        if (type != ibd.h.PAY_LATER_PAYMENT || creditRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<PayLaterReceiverInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainPayLater$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(creditRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        PayLaterReceiverInfoDto payLaterReceiverInfoDto = (PayLaterReceiverInfoDto) objD;
        if (feeAmount != null) {
            return PayLaterReceiverInfoDtoMapperKt.toDomain(payLaterReceiverInfoDto, logoUrl, feeAmount.longValue());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final qua.h toDomainPaymentCounterparty(ibd.h type, String counterpartyRawResponse) {
        if (!type.c() || counterpartyRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<j>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainPaymentCounterparty$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(counterpartyRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return toDomain((j) objD);
    }

    private final fva.h toDomainPaymentMethodDetails(String paymentMethodRawResponse) {
        if (paymentMethodRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<RecurringPaymentMethodMandateDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainPaymentMethodDetails$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(paymentMethodRawResponse, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return RecurringPaymentMethodDetailsDtoMapperKt.toDomain((RecurringPaymentMethodMandateDto) objD).f138400a;
    }

    private final i toDomainPendingRefundSenderInfo(ibd.h type, String senderInfoRaw) {
        k3 k3VarA;
        l2 l2VarC;
        if (type != ibd.h.REFUND || senderInfoRaw == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<k>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainPendingRefundSenderInfo$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(senderInfoRaw, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        k kVar = (k) objD;
        String logo = kVar.getLogo();
        String title = kVar.getTitle();
        Long initiatedDate = kVar.getInitiatedDate();
        LocalDateTime localDateTime = initiatedDate != null ? new LocalDateTime(initiatedDate.longValue()) : null;
        String category = kVar.getCategory();
        if (category == null || (l2VarC = l3.c(category)) == null) {
            i3.Companion.getClass();
            k3VarA = i3.a.a();
        } else {
            k3VarA = new k3(l2VarC);
        }
        return new i(logo, title, localDateTime, k3VarA);
    }

    private final vua.a toDomainRecipient(ibd.h type, String recipientRawResponse) {
        if ((type != ibd.h.INTERNAL && type != ibd.h.YOUTH_ALLOWANCE) || recipientRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<RecipientDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainRecipient$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(recipientRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return RecipientDtoMapperKt.toDomain((RecipientDto) objD);
    }

    private final wua.a toDomainRecurringBuy(ibd.h type, String recurringBuyRawResponse) {
        if (type != ibd.h.CRYPTO || recurringBuyRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<RecurringBuyReceiverInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainRecurringBuy$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(recurringBuyRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return RecurringBuyReceinverInfoMapperKt.toDomain((RecurringBuyReceiverInfoDto) objD);
    }

    private final String toDomainTransactionId(w wVar) {
        return wVar.getGroupId();
    }

    private final rua.d toDomainUpi(ibd.h type, String response) {
        if (type != ibd.h.UPI || response == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<b0>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainUpi$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(response, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return toDomain((b0) objD);
    }

    private final m toDomainVault(ibd.h type, String vaultRawResponse) {
        if ((type != ibd.h.VAULT && type != ibd.h.SAVINGS_POCKET) || vaultRawResponse == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type2 = new TypeToken<VaultReceiverInfoDto>() { // from class: com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapper$toDomainVault$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD = oVarA.d(vaultRawResponse, type2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return VaultReceiverInfoMapperKt.toDomain((VaultReceiverInfoDto) objD);
    }

    private final WalletAutomation toDomainWalletAutomation(r dto, ibd.a senderAccountInfo, ibd.a receiverAccountInfo) {
        WalletAutomation.Limit limit;
        o9l.a automationLimit = dto.getAutomationLimit();
        if (automationLimit != null) {
            ibd.j walletAutomationPeriod = WalletAutomationPeriodMapperKt.toWalletAutomationPeriod(automationLimit.getPeriod());
            limit = walletAutomationPeriod != null ? new WalletAutomation.Limit(mo3.a.o(automationLimit.getMax()), walletAutomationPeriod) : null;
        } else {
            limit = null;
        }
        String str = senderAccountInfo != null ? senderAccountInfo.f160145a : null;
        String str2 = receiverAccountInfo != null ? receiverAccountInfo.f160145a : null;
        if (str != null && str2 != null) {
            if (dto.getLowBalance() != null) {
                o9l.i lowBalance = dto.getLowBalance();
                if (lowBalance == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dj0.d dVarO = mo3.a.o(lowBalance.getTopupAmount());
                o9l.i lowBalance2 = dto.getLowBalance();
                if (lowBalance2 != null) {
                    return new WalletAutomation.DropsBelow(dVarO, mo3.a.o(lowBalance2.getThreshold()), str2, str, limit);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            if (dto.getExcessBalance() != null) {
                o9l.g excessBalance = dto.getExcessBalance();
                if (excessBalance != null) {
                    return new WalletAutomation.Exceeds(mo3.a.o(excessBalance.getThreshold()), str, str2, limit);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return null;
    }

    private final l toRecurringBillBeneficiaryFromBillApi(o9l.m mVar) {
        qua.k kVar;
        qua.k kVar2;
        String name = mVar.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String type = mVar.getType();
        if (Intrinsics.f(type, "PF")) {
            kVar2 = qua.k.PERSONAL;
        } else if (Intrinsics.f(type, "PJ")) {
            kVar2 = qua.k.BUSINESS;
        } else {
            String type2 = mVar.getType();
            if (type2 == null) {
                kVar = null;
                return new l(str, kVar, mVar.getTaxId(), mVar.getBankName(), mVar.getBankNumber(), mVar.getBankCode());
            }
            qua.k[] kVarArrValues = qua.k.values();
            int length = kVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    kVar2 = null;
                    break;
                }
                qua.k kVar3 = kVarArrValues[i];
                if (a0.z(kVar3.name(), type2, true)) {
                    kVar2 = kVar3;
                    break;
                }
                i++;
            }
        }
        kVar = kVar2;
        return new l(str, kVar, mVar.getTaxId(), mVar.getBankName(), mVar.getBankNumber(), mVar.getBankCode());
    }

    private final void verifyRecurringPaymentFields(r dto) {
        if (dto.getId() == null) {
            logFieldIsNull("dto.id", dto);
        }
        if (dto.getType() == null) {
            logFieldIsNull("dto.type", dto);
        }
        if (dto.getState() == null) {
            logFieldIsNull("dto.state", dto);
        }
        if (dto.getCurrency() == null) {
            logFieldIsNull("dto.currency", dto);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @NotNull
    /* JADX INFO: renamed from: toDomain-E67O_EE, reason: not valid java name */
    public final qua.p m3755toDomainE67O_EE(@NotNull r dto, String walletId) {
        RecurringPaymentEndCriteria.Date date;
        ?? arrayList;
        kq2.g gVar;
        e eVar;
        fva.g gVar2;
        fva.l lVar;
        qua.j jVar;
        n nVar;
        ArrayList arrayList2;
        Iterator it8;
        fva.a aVar;
        String scope;
        qua.j jVar2;
        fva.l lVar2;
        fva.g gVar3;
        kq2.g gVar4;
        Intrinsics.checkNotNullParameter(dto, "dto");
        verifyRecurringPaymentFields(dto);
        ibd.g gVar5 = ibd.h.Companion;
        String type = dto.getType();
        gVar5.getClass();
        ibd.h hVarA = ibd.g.a(type);
        ibd.a domainAccountInfo = toDomainAccountInfo(hVarA, dto.getSenderInfo());
        ibd.a domainAccountInfo2 = toDomainAccountInfo(hVarA, dto.getReceiverInfo());
        String id10 = dto.getId();
        String period = dto.getPeriod();
        Period period2 = period != null ? Period.parse(period) : null;
        String startDate = dto.getStartDate();
        LocalDate localDate = startDate != null ? new LocalDate(startDate) : null;
        String nextDate = dto.getNextDate();
        LocalDate localDate2 = nextDate != null ? new LocalDate(nextDate) : null;
        Boolean recurring = dto.getRecurring();
        Boolean estimated = dto.getEstimated();
        DateTime dateTime = dto.getUpdatedDate() != null ? new DateTime(dto.getUpdatedDate()) : null;
        s endCriteria = dto.getEndCriteria();
        if (endCriteria != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[endCriteria.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                date = null;
            } else {
                java.time.LocalDate localDate3 = java.time.LocalDate.parse(endCriteria.getEndDate());
                Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                date = new RecurringPaymentEndCriteria.Date(localDate3);
            }
        } else {
            date = null;
        }
        e eVar2 = new e(id10, period2, hVarA, dateTime, localDate, localDate2, recurring, estimated, date, null, null, 1536);
        String endDate = dto.getEndDate();
        LocalDate localDate4 = endDate != null ? new LocalDate(endDate) : null;
        f domain = RecurringPaymentDtoMapperKt.toDomain(dto.getState());
        String receiver = dto.getReceiver();
        x speed = dto.getSpeed();
        kq2.m domain2 = speed != null ? RecurringPaymentDtoMapperKt.toDomain(speed) : null;
        Boolean autoExchangeEnabled = dto.getAutoExchangeEnabled();
        jo3.a fee2 = dto.getFee();
        dj0.d dVarO = fee2 != null ? mo3.a.o(fee2) : null;
        String sourceCurrency = dto.getSourceCurrency();
        String currency = dto.getCurrency();
        Long amount = dto.getAmount();
        String title = dto.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String name = dto.getName();
        String description = dto.getDescription();
        ibl.d transferReason = dto.getTransferReason();
        krf.c domain3 = transferReason != null ? TransferReasonEmbeddedDtoMapperKt.toDomain(transferReason) : null;
        RecurringPaymentDtoMapper recurringPaymentDtoMapper = INSTANCE;
        wua.a domainRecurringBuy = recurringPaymentDtoMapper.toDomainRecurringBuy(hVarA, dto.getReceiverInfo());
        f5j.a domainBeneficiary = recurringPaymentDtoMapper.toDomainBeneficiary(hVarA, dto.getReceiverInfo());
        vua.a domainRecipient = recurringPaymentDtoMapper.toDomainRecipient(hVarA, dto.getReceiverInfo());
        uua.a domainCreditor = recurringPaymentDtoMapper.toDomainCreditor(hVarA, dto.getReceiverInfo());
        m domainVault = recurringPaymentDtoMapper.toDomainVault(hVarA, dto.getReceiverInfo());
        sua.a domainBillAccount = recurringPaymentDtoMapper.toDomainBillAccount(hVarA, dto.getReceiverInfo());
        g domainMerchant = recurringPaymentDtoMapper.toDomainMerchant(hVarA, dto.getReceiverInfo());
        tua.b domainCredit = recurringPaymentDtoMapper.toDomainCredit(hVarA, dto.getReceiverInfo());
        tua.c domainLoanPayment = recurringPaymentDtoMapper.toDomainLoanPayment(hVarA, dto.getReceiverInfo());
        tua.d domainPayLater = recurringPaymentDtoMapper.toDomainPayLater(hVarA, dto.getLogoUrl(), dto.getFeeAmount(), dto.getReceiverInfo());
        qua.h domainPaymentCounterparty = recurringPaymentDtoMapper.toDomainPaymentCounterparty(hVarA, dto.getReceiverInfo());
        String domainCobrandsLogo = recurringPaymentDtoMapper.toDomainCobrandsLogo(hVarA, dto.getLogoUrl());
        fva.h domainPaymentMethodDetails = recurringPaymentDtoMapper.toDomainPaymentMethodDetails(dto.getReceiverInfo());
        rua.d domainUpi = recurringPaymentDtoMapper.toDomainUpi(hVarA, dto.getReceiverInfo());
        String side = dto.getSide();
        int iMapDay = recurringPaymentDtoMapper.mapDay(dto.getAttributes());
        String gif2 = dto.getGif();
        q billMoneyBox = dto.getBillMoneyBox();
        sua.b domain4 = billMoneyBox != null ? RecurringPaymentDtoMapperKt.toDomain(billMoneyBox) : null;
        t frequency = dto.getFrequency();
        fva.e domain5 = frequency != null ? RecurringPaymentDtoMapperKt.toDomain(frequency) : null;
        Set<w> linkedTransactions = dto.getLinkedTransactions();
        Set<String> domainTransactionIds = linkedTransactions != null ? recurringPaymentDtoMapper.toDomainTransactionIds(linkedTransactions) : null;
        u planInfo = dto.getPlanInfo();
        fva.j domain6 = planInfo != null ? recurringPaymentDtoMapper.toDomain(planInfo) : null;
        o9l.o initiatedByExtra = dto.getInitiatedByExtra();
        qua.o oVar = initiatedByExtra != null ? new qua.o(initiatedByExtra.getId(), initiatedByExtra.getName()) : null;
        String chargeBearer = dto.getChargeBearer();
        kq2.c cVar = chargeBearer != null ? (kq2.c) u1.v(chargeBearer, RecurringPaymentDtoMapperKt.getChargeBearerTypeMapping()) : null;
        i domainPendingRefundSenderInfo = recurringPaymentDtoMapper.toDomainPendingRefundSenderInfo(hVarA, dto.getSenderInfo());
        List referenceFields = dto.getReferenceFields();
        if (referenceFields != null) {
            List list = referenceFields;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(INSTANCE.toDomain((yhf.h0) it9.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        ?? r522 = arrayList;
        z ultimateDebtor = dto.getUltimateDebtor();
        UltimateDebtor domain7 = ultimateDebtor != null ? INSTANCE.toDomain(ultimateDebtor) : null;
        String initiationMethod = dto.getInitiationMethod();
        if (initiationMethod != null) {
            kq2.g[] gVarArrValues = kq2.g.values();
            int length = gVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    gVar4 = null;
                    break;
                }
                gVar4 = gVarArrValues[i2];
                if (a0.z(gVar4.name(), initiationMethod, true)) {
                    break;
                }
                i2++;
            }
            gVar = gVar4;
        } else {
            gVar = null;
        }
        String paymentMethod = dto.getPaymentMethod();
        if (paymentMethod != null) {
            fva.g[] gVarArrValues2 = fva.g.values();
            int length2 = gVarArrValues2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    eVar = eVar2;
                    gVar3 = null;
                    break;
                }
                gVar3 = gVarArrValues2[i3];
                eVar = eVar2;
                if (a0.z(gVar3.name(), paymentMethod, true)) {
                    break;
                }
                i3++;
                eVar2 = eVar;
            }
            gVar2 = gVar3;
        } else {
            eVar = eVar2;
            gVar2 = null;
        }
        String paymentScheme = dto.getPaymentScheme();
        if (paymentScheme != null) {
            fva.l[] lVarArrValues = fva.l.values();
            int length3 = lVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    lVar2 = null;
                    break;
                }
                lVar2 = lVarArrValues[i5];
                if (a0.z(lVar2.name(), paymentScheme, true)) {
                    break;
                }
                i5++;
            }
            lVar = lVar2;
        } else {
            lVar = null;
        }
        o9l.l pocketInfo = dto.getPocketInfo();
        String id11 = pocketInfo != null ? pocketInfo.getId() : null;
        o9l.l pocketInfo2 = dto.getPocketInfo();
        if (pocketInfo2 == null || (scope = pocketInfo2.getScope()) == null) {
            jVar = null;
        } else {
            qua.j[] jVarArrValues = qua.j.values();
            int length4 = jVarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length4) {
                    jVar2 = null;
                    break;
                }
                jVar2 = jVarArrValues[i6];
                if (a0.z(jVar2.name(), scope, true)) {
                    break;
                }
                i6++;
            }
            jVar = jVar2;
        }
        o9l.c billDetails = dto.getBillDetails();
        if (billDetails == null || (domain = INSTANCE.toDomain(billDetails, dto.getScheduledDate(), dto.getDueDate(), dto.getHasEditableAmount())) == null) {
            o9l.n bill = dto.getBill();
            if (bill != null) {
                n domain8 = INSTANCE.toDomain(bill, dto.getScheduledDate(), dto.getHasEditableAmount());
                nVar = domain8;
            } else {
                nVar = null;
            }
        } else {
            nVar = domain8;
        }
        List availableActions = dto.getAvailableActions();
        if (availableActions != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it10 = availableActions.iterator();
            while (it10.hasNext()) {
                String str2 = (String) it10.next();
                fva.a[] aVarArrValues = fva.a.values();
                int length5 = aVarArrValues.length;
                int i21 = 0;
                while (true) {
                    if (i21 >= length5) {
                        it8 = it10;
                        aVar = null;
                        break;
                    }
                    fva.a aVar2 = aVarArrValues[i21];
                    it8 = it10;
                    if (a0.z(aVar2.name(), str2, true)) {
                        aVar = aVar2;
                        break;
                    }
                    i21++;
                    it10 = it8;
                }
                if (aVar != null) {
                    arrayList3.add(aVar);
                }
                it10 = it8;
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        h fundsSource = dto.getFundsSource();
        qua.s domain9 = fundsSource != null ? INSTANCE.toDomain(fundsSource) : null;
        WalletAutomation domainWalletAutomation = INSTANCE.toDomainWalletAutomation(dto, domainAccountInfo, domainAccountInfo2);
        Boolean requestFrequencyConfirmation = dto.getRequestFrequencyConfirmation();
        String deactivatedDate = dto.getDeactivatedDate();
        LocalDate localDate5 = deactivatedDate != null ? new LocalDate(deactivatedDate) : null;
        String blockExpiryDate = dto.getBlockExpiryDate();
        return new qua.p(eVar, domain, receiver, domain2, localDate4, autoExchangeEnabled, dVarO, sourceCurrency, currency, amount, str, name, description, null, domain3, side, domainRecurringBuy, domainBeneficiary, domainRecipient, domainCreditor, domainVault, domainBillAccount, domainMerchant, domainCredit, domainPayLater, domainCobrandsLogo, domainAccountInfo2, domainLoanPayment, domainPaymentCounterparty, domainUpi, domainPaymentMethodDetails, domainAccountInfo, domainTransactionIds, iMapDay, gif2, domain4, domain5, walletId, oVar, cVar, domain6, null, domainPendingRefundSenderInfo, r522, domain7, gVar, gVar2, lVar, id11, jVar, nVar, arrayList2, domain9, domainWalletAutomation, requestFrequencyConfirmation, localDate5, blockExpiryDate != null ? new LocalDate(blockExpiryDate) : null, 8192, 512);
    }

    @NotNull
    public final Set<String> toDomainTransactionIds(@NotNull Set<w> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set<w> set2 = set;
        ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
        Iterator<T> it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(INSTANCE.toDomainTransactionId((w) it8.next()));
        }
        return d0.i1(arrayList);
    }

    private final n toDomain(o9l.n nVar, String str, Boolean bool) {
        String dueDate = nVar.getDueDate();
        LocalDate localDate = dueDate != null ? new LocalDate(dueDate) : null;
        o9l.m beneficiary = nVar.getBeneficiary();
        l recurringBillBeneficiaryFromBillApi = beneficiary != null ? toRecurringBillBeneficiaryFromBillApi(beneficiary) : null;
        if (nVar.getPaymentAgreementId() == null && nVar.getBillNumber() == null && localDate == null && recurringBillBeneficiaryFromBillApi == null) {
            return null;
        }
        return new n(null, null, nVar.getBillNumber(), localDate, bool, str != null ? new LocalDate(str) : null, recurringBillBeneficiaryFromBillApi, false, null, null, null, nVar.getPaymentAgreementId(), 1538);
    }

    private final n toDomain(o9l.c cVar, String str, String str2, Boolean bool) {
        qua.m mVar;
        qua.m mVar2;
        String type = cVar.getType();
        if (type != null) {
            qua.m[] mVarArrValues = qua.m.values();
            int length = mVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mVar2 = null;
                    break;
                }
                mVar2 = mVarArrValues[i];
                if (a0.z(mVar2.name(), type, true)) {
                    break;
                }
                i++;
            }
            mVar = mVar2;
        } else {
            mVar = null;
        }
        String standingOrderId = cVar.getStandingOrderId();
        String billNumber = cVar.getBillNumber();
        LocalDate localDate = str != null ? new LocalDate(str) : null;
        LocalDate localDate2 = str2 != null ? new LocalDate(str2) : null;
        o9l.b beneficiary = cVar.getBeneficiary();
        l domain = beneficiary != null ? toDomain(beneficiary) : null;
        boolean zF = Intrinsics.f(cVar.getCanBePaidNow(), Boolean.TRUE);
        String nextAvailableDateForPayment = cVar.getNextAvailableDateForPayment();
        LocalDate localDate3 = nextAvailableDateForPayment != null ? new LocalDate(nextAvailableDateForPayment) : null;
        o9l.e thresholds = cVar.getThresholds();
        qua.f domain2 = thresholds != null ? toDomain(thresholds) : null;
        o9l.d fees = cVar.getFees();
        return new n(mVar, standingOrderId, billNumber, localDate2, bool, localDate, domain, zF, localDate3, domain2, fees != null ? toDomain(fees) : null, null, 2048);
    }

    private final l toDomain(o9l.b bVar) {
        String name = bVar.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String type = bVar.getType();
        qua.k kVar = null;
        if (type != null) {
            qua.k[] kVarArrValues = qua.k.values();
            int length = kVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                qua.k kVar2 = kVarArrValues[i];
                if (a0.z(kVar2.name(), type, true)) {
                    kVar = kVar2;
                    break;
                }
                i++;
            }
        }
        return new l(str, kVar, bVar.getTaxId(), bVar.getBankName(), bVar.getBankISPB(), bVar.getBankCode());
    }

    private final qua.f toDomain(o9l.e eVar) {
        jo3.a minAmount = eVar.getMinAmount();
        dj0.d dVarO = minAmount != null ? mo3.a.o(minAmount) : null;
        jo3.a maxAmount = eVar.getMaxAmount();
        return new qua.f(dVarO, maxAmount != null ? mo3.a.o(maxAmount) : null);
    }

    private final qua.e toDomain(o9l.d dVar) {
        jo3.a interest = dVar.getInterest();
        dj0.d dVarO = interest != null ? mo3.a.o(interest) : null;
        jo3.a fine = dVar.getFine();
        dj0.d dVarO2 = fine != null ? mo3.a.o(fine) : null;
        jo3.a discount = dVar.getDiscount();
        dj0.d dVarO3 = discount != null ? mo3.a.o(discount) : null;
        jo3.a totalFees = dVar.getTotalFees();
        return new qua.e(dVarO, dVarO2, dVarO3, totalFees != null ? mo3.a.o(totalFees) : null);
    }

    private final fva.j toDomain(u uVar) {
        boolean isTrial = uVar.getIsTrial();
        List billingCycles = uVar.getBillingCycles();
        if (billingCycles == null) {
            billingCycles = f0.f322471a;
        }
        return new fva.j(isTrial, billingCycles, uVar.getPlanName(), uVar.getPlanTier());
    }

    private final qua.a0 toDomain(yhf.h0 h0Var) {
        return new qua.a0(h0Var.getLabel(), h0Var.getValue(), h0Var.getOptionType(), h0Var.getFieldType());
    }

    private final UltimateDebtor toDomain(z zVar) {
        return new UltimateDebtor(zVar.getName(), oo3.a.a(zVar.getAddress()));
    }

    private final qua.h toDomain(j jVar) {
        return new qua.h(jVar.getId(), jVar.getName());
    }

    private final rua.d toDomain(b0 b0Var) {
        c name = getName(b0Var);
        Map account = b0Var.getAccount();
        if (account == null) {
            account = r0.g();
        }
        return new rua.d(name, account);
    }
}
