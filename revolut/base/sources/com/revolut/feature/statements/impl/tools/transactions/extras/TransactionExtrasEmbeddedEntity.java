package com.revolut.feature.statements.impl.tools.transactions.extras;

import androidx.annotation.NonNull;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.externalcards.ExternalCardDto;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lg.b;
import t61.a;

/* JADX INFO: loaded from: classes7.dex */
public final class TransactionExtrasEmbeddedEntity implements Serializable, TransactionExtra {

    @b("account")
    public TransactionAccountDto account;

    @NonNull
    @b("attrs")
    public Map<String, String> attrs;

    @b("autoInvest")
    public TransactionAutoInvestDto autoInvest;

    @b("beneficiary")
    public BeneficiaryDto beneficiary;

    @b("cashbackBox")
    public TransactionCashbackBoxEmbeddedEntity cashbackBox;

    @b("counterpart")
    public TransactionCounterpartDto counterpart;

    @b("creditRepayment")
    public TransactionCreditRepaymentDto creditRepayment;

    @b("externalCard")
    public ExternalCardDto externalCard;

    @b("fraudState")
    public FraudState fraudState;

    /* JADX INFO: renamed from: gif, reason: collision with root package name */
    @b("gif")
    public String f88276gif;

    @b("insurance")
    public TransactionInsuranceDto insurance;

    @b("investment")
    public InvestmentModel investment;

    @b("loan")
    public TransactionLoanDto loan;

    @b("loungePassIds")
    public List<String> loungePassIds;

    @b("merchant")
    public TransactionMerchantDto merchant;

    @b("recallable")
    public Boolean recallable;

    @b("recipient")
    public TransactionRecipientDto recipient;

    @b("sender")
    public TransactionSenderDto sender;

    @b("standingOrder")
    public TransactionStandingOrderDto standingOrder;

    @b("stopOrder")
    public StopOrderDto stopOrder;

    public TransactionExtrasEmbeddedEntity() {
        this.attrs = new HashMap();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && TransactionExtrasEmbeddedEntity.class == obj2.getClass()) {
            TransactionExtrasEmbeddedEntity transactionExtrasEmbeddedEntity = (TransactionExtrasEmbeddedEntity) obj2;
            if (Objects.equals(this.account, transactionExtrasEmbeddedEntity.account) && Objects.equals(this.recipient, transactionExtrasEmbeddedEntity.recipient) && Objects.equals(this.sender, transactionExtrasEmbeddedEntity.sender) && Objects.equals(this.counterpart, transactionExtrasEmbeddedEntity.counterpart) && Objects.equals(this.merchant, transactionExtrasEmbeddedEntity.merchant) && Objects.equals(this.standingOrder, transactionExtrasEmbeddedEntity.standingOrder) && Objects.equals(this.loan, transactionExtrasEmbeddedEntity.loan) && Objects.equals(this.beneficiary, transactionExtrasEmbeddedEntity.beneficiary) && Objects.equals(this.externalCard, transactionExtrasEmbeddedEntity.externalCard) && Objects.equals(this.insurance, transactionExtrasEmbeddedEntity.insurance) && Objects.equals(this.investment, transactionExtrasEmbeddedEntity.investment) && Objects.equals(this.autoInvest, transactionExtrasEmbeddedEntity.autoInvest) && Objects.equals(this.creditRepayment, transactionExtrasEmbeddedEntity.creditRepayment) && Objects.equals(this.f88276gif, transactionExtrasEmbeddedEntity.f88276gif) && Objects.equals(this.cashbackBox, transactionExtrasEmbeddedEntity.cashbackBox) && Objects.equals(this.recallable, transactionExtrasEmbeddedEntity.recallable) && Objects.equals(this.fraudState, transactionExtrasEmbeddedEntity.fraudState) && Objects.equals(this.stopOrder, transactionExtrasEmbeddedEntity.stopOrder) && Objects.equals(this.attrs, transactionExtrasEmbeddedEntity.attrs) && Objects.equals(this.loungePassIds, transactionExtrasEmbeddedEntity.loungePassIds)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.account, this.recipient, this.sender, this.counterpart, this.merchant, this.standingOrder, this.loan, this.beneficiary, this.externalCard, this.insurance, this.investment, this.autoInvest, this.creditRepayment, this.f88276gif, this.cashbackBox, this.recallable, this.fraudState, this.stopOrder, this.attrs, this.loungePassIds);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("TransactionExtrasEmbeddedEntity{accountId=");
        TransactionAccountDto transactionAccountDto = this.account;
        sb6.append(transactionAccountDto != null ? transactionAccountDto.getId() : null);
        sb6.append(", recipientId=");
        TransactionRecipientDto transactionRecipientDto = this.recipient;
        sb6.append(transactionRecipientDto != null ? transactionRecipientDto.getId() : null);
        sb6.append(", recipientAccountId=");
        TransactionRecipientDto transactionRecipientDto2 = this.recipient;
        sb6.append((transactionRecipientDto2 == null || transactionRecipientDto2.getAccount() == null) ? null : this.recipient.getAccount().getId());
        sb6.append(", senderId=");
        TransactionSenderDto transactionSenderDto = this.sender;
        sb6.append(transactionSenderDto != null ? transactionSenderDto.getId() : null);
        sb6.append(", senderAccountId=");
        TransactionSenderDto transactionSenderDto2 = this.sender;
        sb6.append((transactionSenderDto2 == null || transactionSenderDto2.getAccount() == null) ? null : this.sender.getAccount().getId());
        sb6.append(", counterpartAmount=");
        TransactionCounterpartDto transactionCounterpartDto = this.counterpart;
        sb6.append(transactionCounterpartDto != null ? Long.valueOf(transactionCounterpartDto.getAmount()) : null);
        sb6.append(", counterpartCurrency=");
        TransactionCounterpartDto transactionCounterpartDto2 = this.counterpart;
        sb6.append(transactionCounterpartDto2 != null ? transactionCounterpartDto2.getCurrency() : null);
        sb6.append(", counterpartAccountId=");
        TransactionCounterpartDto transactionCounterpartDto3 = this.counterpart;
        sb6.append((transactionCounterpartDto3 == null || transactionCounterpartDto3.getAccount() == null) ? null : this.counterpart.getAccount().getId());
        sb6.append(", merchantId=");
        TransactionMerchantDto transactionMerchantDto = this.merchant;
        sb6.append(transactionMerchantDto != null ? transactionMerchantDto.getId() : null);
        sb6.append(", standingOrderId=");
        TransactionStandingOrderDto transactionStandingOrderDto = this.standingOrder;
        sb6.append(transactionStandingOrderDto != null ? transactionStandingOrderDto.getId() : null);
        sb6.append(", loanId=");
        TransactionLoanDto transactionLoanDto = this.loan;
        sb6.append(transactionLoanDto != null ? transactionLoanDto.getId() : null);
        sb6.append(", beneficiaryId=");
        BeneficiaryDto beneficiaryDto = this.beneficiary;
        sb6.append(beneficiaryDto != null ? beneficiaryDto.getId() : null);
        sb6.append(", externalCardPresent=");
        sb6.append(this.externalCard != null);
        sb6.append(", insurancePolicyId=");
        TransactionInsuranceDto transactionInsuranceDto = this.insurance;
        sb6.append(transactionInsuranceDto != null ? transactionInsuranceDto.getPolicyId() : null);
        sb6.append(", insuranceType=");
        TransactionInsuranceDto transactionInsuranceDto2 = this.insurance;
        sb6.append(transactionInsuranceDto2 != null ? transactionInsuranceDto2.getInsuranceTypeString() : null);
        sb6.append(", investmentHoldingId=");
        InvestmentModel investmentModel = this.investment;
        sb6.append(investmentModel != null ? investmentModel.getHoldingId() : null);
        sb6.append(", autoInvestStrategy=");
        TransactionAutoInvestDto transactionAutoInvestDto = this.autoInvest;
        sb6.append(transactionAutoInvestDto != null ? transactionAutoInvestDto.getStrategy() : null);
        sb6.append(", autoInvestTargetId=");
        TransactionAutoInvestDto transactionAutoInvestDto2 = this.autoInvest;
        sb6.append((transactionAutoInvestDto2 == null || transactionAutoInvestDto2.getTarget() == null) ? null : this.autoInvest.getTarget().getId());
        sb6.append(", creditRepaymentTransactionId=");
        TransactionCreditRepaymentDto transactionCreditRepaymentDto = this.creditRepayment;
        sb6.append(transactionCreditRepaymentDto != null ? transactionCreditRepaymentDto.getTransactionId() : null);
        sb6.append(", cashbackBoxId=");
        TransactionCashbackBoxEmbeddedEntity transactionCashbackBoxEmbeddedEntity = this.cashbackBox;
        sb6.append(transactionCashbackBoxEmbeddedEntity != null ? transactionCashbackBoxEmbeddedEntity.getCashbackBoxId() : null);
        sb6.append(", gif=");
        sb6.append(this.f88276gif);
        sb6.append(", recallable=");
        sb6.append(this.recallable);
        sb6.append(", fraudState=");
        sb6.append(this.fraudState);
        sb6.append(", stopOrderId=");
        StopOrderDto stopOrderDto = this.stopOrder;
        sb6.append(stopOrderDto != null ? stopOrderDto.getId() : null);
        sb6.append(", attrs=");
        sb6.append(this.attrs);
        sb6.append(", loungePassIds=");
        return a.q("}", this.loungePassIds, sb6);
    }

    public TransactionExtrasEmbeddedEntity(TransactionAccountDto transactionAccountDto, TransactionRecipientDto transactionRecipientDto, TransactionSenderDto transactionSenderDto, TransactionCounterpartDto transactionCounterpartDto, TransactionMerchantDto transactionMerchantDto, TransactionStandingOrderDto transactionStandingOrderDto, TransactionLoanDto transactionLoanDto, BeneficiaryDto beneficiaryDto, ExternalCardDto externalCardDto, TransactionInsuranceDto transactionInsuranceDto, InvestmentModel investmentModel, TransactionAutoInvestDto transactionAutoInvestDto, TransactionCreditRepaymentDto transactionCreditRepaymentDto, String str, TransactionCashbackBoxEmbeddedEntity transactionCashbackBoxEmbeddedEntity, Map<String, String> map, Boolean bool, FraudState fraudState, StopOrderDto stopOrderDto, List<String> list) {
        this.account = transactionAccountDto;
        this.recipient = transactionRecipientDto;
        this.sender = transactionSenderDto;
        this.counterpart = transactionCounterpartDto;
        this.merchant = transactionMerchantDto;
        this.standingOrder = transactionStandingOrderDto;
        this.loan = transactionLoanDto;
        this.beneficiary = beneficiaryDto;
        this.externalCard = externalCardDto;
        this.insurance = transactionInsuranceDto;
        this.investment = investmentModel;
        this.autoInvest = transactionAutoInvestDto;
        this.creditRepayment = transactionCreditRepaymentDto;
        this.cashbackBox = transactionCashbackBoxEmbeddedEntity;
        this.f88276gif = str;
        this.recallable = bool;
        this.fraudState = fraudState;
        this.stopOrder = stopOrderDto;
        if (map == null) {
            this.attrs = new HashMap();
        } else {
            this.attrs = map;
        }
        this.loungePassIds = list;
    }
}
