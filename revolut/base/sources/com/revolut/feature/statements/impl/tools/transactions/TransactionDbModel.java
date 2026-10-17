package com.revolut.feature.statements.impl.tools.transactions;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import com.revolut.data.common.models.money.MoneySerializable;
import com.revolut.feature.statements.impl.tools.transactions.extras.FraudState;
import com.revolut.feature.statements.impl.tools.transactions.extras.MccType;
import com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionExtrasEmbeddedEntity;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TransactionDbModel implements Serializable, Comparable<TransactionDbModel> {
    public String address;
    private MoneySerializable amount;
    public Boolean automatic;
    public Long balance;
    public Long completedDate;
    public String country;
    public String description;
    public String edt;
    public String entryMode;
    public TransactionExtrasEmbeddedEntity extras = new TransactionExtrasEmbeddedEntity();

    /* JADX INFO: renamed from: fee, reason: collision with root package name */
    public MoneySerializable f88269fee;
    public Long feeFx;
    public String feeFxCcy;
    public Long fxPartyAmount;
    public String groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f88270id;
    public InternalTransactionType internalType;
    public String logo;
    public MccType mccType;
    public String merchantId;
    public String merchantName;
    public TopUpMethod partyType;
    public String pocketCcy;
    public long pocketamount;
    public Double rate;
    public Long rateMarkupAmount;
    public String rateMarkupAmountCurrency;
    public String reason;
    public String rejectComment;
    public String relatedTransactionId;

    /* JADX INFO: renamed from: sid, reason: collision with root package name */
    public String f88271sid;
    public Long startedDate;
    public TransactionState state;
    public Long surcharge;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    public String f88272tag;
    public String transferLinkId;
    private Boolean transparentPricing;
    public TransactionType type;
    public Long updatedDate;
    public String userComment;
    private static final String TRANSFER_LINK_URL = "TRANSFER_LINK_URL";
    static final String HIDDEN = "USER_HIDDEN";

    private static void setTimeToEndofDay(@NonNull Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, RoomDatabase.MAX_BIND_PARAMETER_CNT);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            TransactionDbModel transactionDbModel = (TransactionDbModel) obj2;
            if (this.f88270id != transactionDbModel.f88270id || this.pocketamount != transactionDbModel.pocketamount) {
                return false;
            }
            String str = this.groupId;
            if (str == null ? transactionDbModel.groupId != null : !str.equals(transactionDbModel.groupId)) {
                return false;
            }
            String str2 = this.f88271sid;
            if (str2 == null ? transactionDbModel.f88271sid != null : !str2.equals(transactionDbModel.f88271sid)) {
                return false;
            }
            Long l2 = this.startedDate;
            if (l2 == null ? transactionDbModel.startedDate != null : !l2.equals(transactionDbModel.startedDate)) {
                return false;
            }
            Long l3 = this.updatedDate;
            if (l3 == null ? transactionDbModel.updatedDate != null : !l3.equals(transactionDbModel.updatedDate)) {
                return false;
            }
            Long l4 = this.completedDate;
            if (l4 == null ? transactionDbModel.completedDate != null : !l4.equals(transactionDbModel.completedDate)) {
                return false;
            }
            String str3 = this.pocketCcy;
            if (str3 == null ? transactionDbModel.pocketCcy != null : !str3.equals(transactionDbModel.pocketCcy)) {
                return false;
            }
            String str4 = this.reason;
            if (str4 == null ? transactionDbModel.reason != null : !str4.equals(transactionDbModel.reason)) {
                return false;
            }
            String str5 = this.transferLinkId;
            if (str5 == null ? transactionDbModel.transferLinkId != null : !str5.equals(transactionDbModel.transferLinkId)) {
                return false;
            }
            String str6 = this.logo;
            if (str6 == null ? transactionDbModel.logo != null : !str6.equals(transactionDbModel.logo)) {
                return false;
            }
            String str7 = this.f88272tag;
            if (str7 == null ? transactionDbModel.f88272tag != null : !str7.equals(transactionDbModel.f88272tag)) {
                return false;
            }
            String str8 = this.merchantName;
            if (str8 == null ? transactionDbModel.merchantName != null : !str8.equals(transactionDbModel.merchantName)) {
                return false;
            }
            MoneySerializable moneySerializable = this.amount;
            if (moneySerializable == null ? transactionDbModel.amount != null : !moneySerializable.equals(transactionDbModel.amount)) {
                return false;
            }
            if (this.state != transactionDbModel.state || this.internalType != transactionDbModel.internalType || this.type != transactionDbModel.type || this.partyType != transactionDbModel.partyType) {
                return false;
            }
            Double d = this.rate;
            if (d == null ? transactionDbModel.rate != null : !d.equals(transactionDbModel.rate)) {
                return false;
            }
            MoneySerializable moneySerializable2 = this.f88269fee;
            if (moneySerializable2 == null ? transactionDbModel.f88269fee != null : !moneySerializable2.equals(transactionDbModel.f88269fee)) {
                return false;
            }
            Long l5 = this.surcharge;
            if (l5 == null ? transactionDbModel.surcharge != null : !l5.equals(transactionDbModel.surcharge)) {
                return false;
            }
            String str9 = this.description;
            if (str9 == null ? transactionDbModel.description != null : !str9.equals(transactionDbModel.description)) {
                return false;
            }
            Long l22 = this.feeFx;
            if (l22 == null ? transactionDbModel.feeFx != null : !l22.equals(transactionDbModel.feeFx)) {
                return false;
            }
            String str10 = this.feeFxCcy;
            if (str10 == null ? transactionDbModel.feeFxCcy != null : !str10.equals(transactionDbModel.feeFxCcy)) {
                return false;
            }
            Long l31 = this.fxPartyAmount;
            if (l31 == null ? transactionDbModel.fxPartyAmount != null : !l31.equals(transactionDbModel.fxPartyAmount)) {
                return false;
            }
            String str11 = this.country;
            if (str11 == null ? transactionDbModel.country != null : !str11.equals(transactionDbModel.country)) {
                return false;
            }
            String str12 = this.address;
            if (str12 == null ? transactionDbModel.address != null : !str12.equals(transactionDbModel.address)) {
                return false;
            }
            String str13 = this.merchantId;
            if (str13 == null ? transactionDbModel.merchantId != null : !str13.equals(transactionDbModel.merchantId)) {
                return false;
            }
            if (this.mccType != transactionDbModel.mccType) {
                return false;
            }
            String str14 = this.userComment;
            if (str14 == null ? transactionDbModel.userComment != null : !str14.equals(transactionDbModel.userComment)) {
                return false;
            }
            String str15 = this.entryMode;
            if (str15 == null ? transactionDbModel.entryMode != null : !str15.equals(transactionDbModel.entryMode)) {
                return false;
            }
            Long l37 = this.balance;
            if (l37 == null ? transactionDbModel.balance != null : !l37.equals(transactionDbModel.balance)) {
                return false;
            }
            Boolean bool = this.automatic;
            if (bool == null ? transactionDbModel.automatic != null : !bool.equals(transactionDbModel.automatic)) {
                return false;
            }
            String str16 = this.rejectComment;
            if (str16 == null ? transactionDbModel.rejectComment != null : !str16.equals(transactionDbModel.rejectComment)) {
                return false;
            }
            String str17 = this.relatedTransactionId;
            if (str17 == null ? transactionDbModel.relatedTransactionId != null : !str17.equals(transactionDbModel.relatedTransactionId)) {
                return false;
            }
            String str18 = this.edt;
            if (str18 == null ? transactionDbModel.edt != null : !str18.equals(transactionDbModel.edt)) {
                return false;
            }
            Long l39 = this.rateMarkupAmount;
            if (l39 == null ? transactionDbModel.rateMarkupAmount != null : !l39.equals(transactionDbModel.rateMarkupAmount)) {
                return false;
            }
            String str19 = this.rateMarkupAmountCurrency;
            if (str19 == null ? transactionDbModel.rateMarkupAmountCurrency != null : !str19.equals(transactionDbModel.rateMarkupAmountCurrency)) {
                return false;
            }
            Boolean bool2 = this.transparentPricing;
            if (bool2 == null ? transactionDbModel.transparentPricing != null : !bool2.equals(transactionDbModel.transparentPricing)) {
                return false;
            }
            TransactionExtrasEmbeddedEntity transactionExtrasEmbeddedEntity = this.extras;
            TransactionExtrasEmbeddedEntity transactionExtrasEmbeddedEntity2 = transactionDbModel.extras;
            if (transactionExtrasEmbeddedEntity != null) {
                return transactionExtrasEmbeddedEntity.equals(transactionExtrasEmbeddedEntity2);
            }
            if (transactionExtrasEmbeddedEntity2 == null) {
                return true;
            }
        }
        return false;
    }

    public FraudState fraudState() {
        return this.extras.fraudState;
    }

    public MoneySerializable getAmount() {
        if (this.amount != null) {
            return new MoneySerializable(this.amount.getAmount(), this.amount.getCurrency());
        }
        return null;
    }

    @NonNull
    public MoneySerializable getAmountIncludingLegFee() {
        String currency = this.pocketCcy;
        MoneySerializable moneySerializable = this.amount;
        if (moneySerializable != null) {
            long amount = moneySerializable.getAmount();
            MoneySerializable moneySerializable2 = this.f88269fee;
            amount = amount - (moneySerializable2 != null ? moneySerializable2.getAmount() : 0L);
            currency = this.amount.getCurrency();
        }
        return new MoneySerializable(amount, currency);
    }

    public Boolean getAutomatic() {
        return this.automatic;
    }

    public Long getBalance() {
        return this.balance;
    }

    public Long getCompletedDate() {
        return this.completedDate;
    }

    public String getEdt() {
        return this.edt;
    }

    public String getEntryMode() {
        return this.entryMode;
    }

    @NonNull
    public Map<String, String> getExtraAttributes() {
        return this.extras.attrs;
    }

    @NonNull
    public TransactionExtrasEmbeddedEntity getExtras() {
        return this.extras;
    }

    public Long getFeeFx() {
        return this.feeFx;
    }

    public String getFeeFxCcy() {
        return this.feeFxCcy;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public long getId() {
        return this.f88270id;
    }

    public boolean getIsUserHidden() {
        Map<String, String> extraAttributes = getExtraAttributes();
        return extraAttributes.containsKey("USER_HIDDEN") && extraAttributes.get("USER_HIDDEN").equals(String.valueOf(true));
    }

    public String getLogo() {
        return this.logo;
    }

    public String getPocketCcy() {
        return this.pocketCcy;
    }

    public Double getRate() {
        return this.rate;
    }

    public Long getRateMarkupAmount() {
        return this.rateMarkupAmount;
    }

    public String getRateMarkupAmountCurrency() {
        return this.rateMarkupAmountCurrency;
    }

    public String getReason() {
        return this.reason;
    }

    public String getSid() {
        return this.f88271sid;
    }

    @NonNull
    public Long getStartedDate() {
        return this.startedDate;
    }

    public TransactionState getState() {
        return this.state;
    }

    public Long getSurcharge() {
        return this.surcharge;
    }

    public String getTag() {
        return this.f88272tag;
    }

    public String getTransferLinkUrl() {
        return getExtraAttributes().get("TRANSFER_LINK_URL");
    }

    public Boolean getTransparentPricing() {
        return this.transparentPricing;
    }

    public TransactionType getType() {
        return this.type;
    }

    public Long getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        long j2 = this.f88270id;
        int i = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.groupId;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f88271sid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.startedDate;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.updatedDate;
        int iHashCode4 = (iHashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.completedDate;
        int iHashCode5 = (iHashCode4 + (l4 != null ? l4.hashCode() : 0)) * 31;
        String str3 = this.pocketCcy;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.reason;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.transferLinkId;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        long j3 = this.pocketamount;
        int i2 = (((iHashCode7 + iHashCode8) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        String str6 = this.logo;
        int iHashCode9 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f88272tag;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.merchantName;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        MoneySerializable moneySerializable = this.amount;
        int iHashCode12 = (iHashCode11 + (moneySerializable != null ? moneySerializable.hashCode() : 0)) * 31;
        TransactionState transactionState = this.state;
        int iHashCode13 = (iHashCode12 + (transactionState != null ? transactionState.hashCode() : 0)) * 31;
        InternalTransactionType internalTransactionType = this.internalType;
        int iHashCode14 = (iHashCode13 + (internalTransactionType != null ? internalTransactionType.hashCode() : 0)) * 31;
        TransactionType transactionType = this.type;
        int iHashCode15 = (iHashCode14 + (transactionType != null ? transactionType.hashCode() : 0)) * 31;
        TopUpMethod topUpMethod = this.partyType;
        int iHashCode16 = (iHashCode15 + (topUpMethod != null ? topUpMethod.hashCode() : 0)) * 31;
        Double d = this.rate;
        int iHashCode17 = (iHashCode16 + (d != null ? d.hashCode() : 0)) * 31;
        MoneySerializable moneySerializable2 = this.f88269fee;
        int iHashCode18 = (iHashCode17 + (moneySerializable2 != null ? moneySerializable2.hashCode() : 0)) * 31;
        Long l5 = this.surcharge;
        int iHashCode19 = (iHashCode18 + (l5 != null ? l5.hashCode() : 0)) * 31;
        String str9 = this.description;
        int iHashCode20 = (iHashCode19 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Long l22 = this.feeFx;
        int iHashCode21 = (iHashCode20 + (l22 != null ? l22.hashCode() : 0)) * 31;
        String str10 = this.feeFxCcy;
        int iHashCode22 = (iHashCode21 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Long l31 = this.fxPartyAmount;
        int iHashCode23 = (iHashCode22 + (l31 != null ? l31.hashCode() : 0)) * 31;
        String str11 = this.country;
        int iHashCode24 = (iHashCode23 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.address;
        int iHashCode25 = (iHashCode24 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.merchantId;
        int iHashCode26 = (iHashCode25 + (str13 != null ? str13.hashCode() : 0)) * 31;
        MccType mccType = this.mccType;
        int iHashCode27 = (iHashCode26 + (mccType != null ? mccType.hashCode() : 0)) * 31;
        String str14 = this.userComment;
        int iHashCode28 = (iHashCode27 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.entryMode;
        int iHashCode29 = (iHashCode28 + (str15 != null ? str15.hashCode() : 0)) * 31;
        Long l37 = this.balance;
        int iHashCode30 = (iHashCode29 + (l37 != null ? l37.hashCode() : 0)) * 31;
        Boolean bool = this.automatic;
        int iHashCode31 = (iHashCode30 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str16 = this.rejectComment;
        int iHashCode32 = (iHashCode31 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.relatedTransactionId;
        int iHashCode33 = (iHashCode32 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.edt;
        int iHashCode34 = (iHashCode33 + (str18 != null ? str18.hashCode() : 0)) * 31;
        Long l39 = this.rateMarkupAmount;
        int iHashCode35 = (iHashCode34 + (l39 != null ? l39.hashCode() : 0)) * 31;
        String str19 = this.rateMarkupAmountCurrency;
        int iHashCode36 = (iHashCode35 + (str19 != null ? str19.hashCode() : 0)) * 31;
        TransactionExtrasEmbeddedEntity transactionExtrasEmbeddedEntity = this.extras;
        int iHashCode37 = (iHashCode36 + (transactionExtrasEmbeddedEntity != null ? transactionExtrasEmbeddedEntity.hashCode() : 0)) * 31;
        Boolean bool2 = this.transparentPricing;
        return iHashCode37 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public boolean isAutoExchange() {
        return this.extras.stopOrder != null;
    }

    public boolean isPendingMoneyRequest() {
        return this.type == TransactionType.REQUEST_MONEY && this.state == TransactionState.PENDING;
    }

    public boolean isRecallable() {
        Boolean bool = this.extras.recallable;
        return bool != null && bool.booleanValue();
    }

    public boolean isSuspicious() {
        return FraudState.SUSPICIOUS.equals(fraudState());
    }

    @NonNull
    public TransactionDbModel setAddress(String str) {
        this.address = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setAmount(MoneySerializable moneySerializable) {
        this.pocketamount = moneySerializable != null ? moneySerializable.getAmount() : 0L;
        this.amount = moneySerializable;
        return this;
    }

    @NonNull
    public TransactionDbModel setAutomatic(Boolean bool) {
        this.automatic = bool;
        return this;
    }

    @NonNull
    public TransactionDbModel setBalance(Long l2) {
        this.balance = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setCompletedDate(Long l2) {
        this.completedDate = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setCountry(String str) {
        this.country = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setDescription(String str) {
        this.description = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setEdt(String str) {
        this.edt = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setEntryMode(String str) {
        this.entryMode = str;
        return this;
    }

    public void setExtraAttributes(@NonNull Map<String, String> map) {
        this.extras.attrs = map;
    }

    @NonNull
    public TransactionDbModel setExtras(@NonNull TransactionExtrasEmbeddedEntity transactionExtrasEmbeddedEntity) {
        this.extras = transactionExtrasEmbeddedEntity;
        return this;
    }

    @NonNull
    public TransactionDbModel setFee(MoneySerializable moneySerializable) {
        this.f88269fee = moneySerializable;
        return this;
    }

    @NonNull
    public TransactionDbModel setFeeFx(Long l2) {
        this.feeFx = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setFeeFxCcy(String str) {
        this.feeFxCcy = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setFxPartyAmount(Long l2) {
        this.fxPartyAmount = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setGroupId(String str) {
        this.groupId = str;
        return this;
    }

    public void setHidden(boolean z) {
        getExtraAttributes().put("USER_HIDDEN", String.valueOf(z));
    }

    @NonNull
    public TransactionDbModel setId(long j2) {
        this.f88270id = j2;
        return this;
    }

    @NonNull
    public TransactionDbModel setInternalType(InternalTransactionType internalTransactionType) {
        this.internalType = internalTransactionType;
        return this;
    }

    @NonNull
    public TransactionDbModel setLogo(String str) {
        this.logo = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setMcc(String str) {
        this.mccType = MccType.fromValue(str);
        return this;
    }

    @NonNull
    public TransactionDbModel setMerchantId(String str) {
        this.merchantId = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setMerchantName(String str) {
        this.merchantName = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setPocketCcy(String str) {
        this.pocketCcy = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setRate(Double d) {
        this.rate = d;
        return this;
    }

    public TransactionDbModel setRateMarkupAmount(Long l2) {
        this.rateMarkupAmount = l2;
        return this;
    }

    public TransactionDbModel setRateMarkupAmountCurrency(String str) {
        this.rateMarkupAmountCurrency = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setReason(String str) {
        this.reason = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setRejectComment(String str) {
        this.rejectComment = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setRelatedTransactionId(String str) {
        this.relatedTransactionId = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setSid(String str) {
        this.f88271sid = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setStartedDate(Long l2) {
        this.startedDate = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setState(TransactionState transactionState) {
        this.state = transactionState;
        return this;
    }

    @NonNull
    public TransactionDbModel setSurcharge(Long l2) {
        this.surcharge = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setTag(String str) {
        this.f88272tag = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setTransferLinkExpiration(Long l2) {
        if (l2 != null) {
            TransactionExtraAttrsUtil.setExpiryTimestamp(this, l2);
        }
        return this;
    }

    @NonNull
    public TransactionDbModel setTransferLinkId(String str) {
        this.transferLinkId = str;
        return this;
    }

    @NonNull
    public TransactionDbModel setTransferLinkUrl(String str) {
        if (str != null) {
            getExtraAttributes().put("TRANSFER_LINK_URL", str);
        }
        return this;
    }

    public TransactionDbModel setTransparentPricing(Boolean bool) {
        this.transparentPricing = bool;
        return this;
    }

    @NonNull
    public TransactionDbModel setType(TransactionType transactionType) {
        this.type = transactionType;
        return this;
    }

    @NonNull
    public TransactionDbModel setUpdatedDate(Long l2) {
        this.updatedDate = l2;
        return this;
    }

    @NonNull
    public TransactionDbModel setUserComment(String str) {
        this.userComment = str;
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull TransactionDbModel transactionDbModel) {
        if (isSuspicious() && !transactionDbModel.isSuspicious()) {
            return 1;
        }
        if (!isSuspicious() && transactionDbModel.isSuspicious()) {
            return -1;
        }
        if (isPendingMoneyRequest() && !transactionDbModel.isPendingMoneyRequest()) {
            return 1;
        }
        if (!isPendingMoneyRequest() && transactionDbModel.isPendingMoneyRequest()) {
            return -1;
        }
        Long l2 = this.startedDate;
        if (l2 == null && transactionDbModel.startedDate == null) {
            return 0;
        }
        if (l2 != null && transactionDbModel.startedDate == null) {
            return 1;
        }
        if (l2 != null || transactionDbModel.startedDate == null) {
            return l2.compareTo(transactionDbModel.startedDate);
        }
        return -1;
    }
}
