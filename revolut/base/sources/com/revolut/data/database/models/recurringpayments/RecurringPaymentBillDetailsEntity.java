package com.revolut.data.database.models.recurringpayments;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003JØ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001a¨\u0006H"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "", "transferType", "", "standingOrderId", "billNumber", "scheduledDate", "dueDate", "hasEditableAmount", "", "beneficiaryName", "beneficiaryType", "beneficiaryTaxId", "beneficiaryBankName", "beneficiaryBankNumber", "beneficiaryBankCode", "canBePaidNow", "nextAvailableDateForPayment", "thresholds", "Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;", "fees", "Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;", "paymentAgreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;Ljava/lang/String;)V", "getTransferType", "()Ljava/lang/String;", "getStandingOrderId", "getBillNumber", "getScheduledDate", "getDueDate", "getHasEditableAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBeneficiaryName", "getBeneficiaryType", "getBeneficiaryTaxId", "getBeneficiaryBankName", "getBeneficiaryBankNumber", "getBeneficiaryBankCode", "getCanBePaidNow", "()Z", "getNextAvailableDateForPayment", "getThresholds", "()Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;", "getFees", "()Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;", "getPaymentAgreementId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentBillDetailsEntity {

    @b("beneficiaryBankCode")
    private final String beneficiaryBankCode;

    @b("beneficiaryBankName")
    private final String beneficiaryBankName;

    @b("beneficiaryBankNumber")
    private final String beneficiaryBankNumber;

    @b("beneficiaryName")
    private final String beneficiaryName;

    @b("beneficiaryTaxId")
    private final String beneficiaryTaxId;

    @b("beneficiaryType")
    private final String beneficiaryType;

    @b("billNumber")
    private final String billNumber;

    @b("canBePaidNow")
    private final boolean canBePaidNow;

    @b("dueDate")
    private final String dueDate;

    @b("fees")
    private final BillFeesEmbeddedEntity fees;

    @b("hasEditableAmount")
    private final Boolean hasEditableAmount;

    @b("nextAvailableDateForPayment")
    private final String nextAvailableDateForPayment;

    @b("paymentAgreementId")
    private final String paymentAgreementId;

    @b("scheduledDate")
    private final String scheduledDate;

    @b("standingOrderId")
    private final String standingOrderId;

    @b("thresholds")
    private final BillThresholdsEmbeddedEntity thresholds;

    @b("transferType")
    private final String transferType;

    public RecurringPaymentBillDetailsEntity(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity, BillFeesEmbeddedEntity billFeesEmbeddedEntity, String str13) {
        this.transferType = str;
        this.standingOrderId = str2;
        this.billNumber = str3;
        this.scheduledDate = str4;
        this.dueDate = str5;
        this.hasEditableAmount = bool;
        this.beneficiaryName = str6;
        this.beneficiaryType = str7;
        this.beneficiaryTaxId = str8;
        this.beneficiaryBankName = str9;
        this.beneficiaryBankNumber = str10;
        this.beneficiaryBankCode = str11;
        this.canBePaidNow = z;
        this.nextAvailableDateForPayment = str12;
        this.thresholds = billThresholdsEmbeddedEntity;
        this.fees = billFeesEmbeddedEntity;
        this.paymentAgreementId = str13;
    }

    public static /* synthetic */ RecurringPaymentBillDetailsEntity copy$default(RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntity, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity, BillFeesEmbeddedEntity billFeesEmbeddedEntity, String str13, int i, Object obj2) {
        String str14;
        BillFeesEmbeddedEntity billFeesEmbeddedEntity2;
        String str15;
        RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntity2;
        BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity2;
        String str16;
        String str17;
        String str18;
        String str19;
        Boolean bool2;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        boolean z3;
        String str26;
        String str27 = (i & 1) != 0 ? recurringPaymentBillDetailsEntity.transferType : str;
        String str28 = (i & 2) != 0 ? recurringPaymentBillDetailsEntity.standingOrderId : str2;
        String str29 = (i & 4) != 0 ? recurringPaymentBillDetailsEntity.billNumber : str3;
        String str30 = (i & 8) != 0 ? recurringPaymentBillDetailsEntity.scheduledDate : str4;
        String str31 = (i & 16) != 0 ? recurringPaymentBillDetailsEntity.dueDate : str5;
        Boolean bool3 = (i & 32) != 0 ? recurringPaymentBillDetailsEntity.hasEditableAmount : bool;
        String str32 = (i & 64) != 0 ? recurringPaymentBillDetailsEntity.beneficiaryName : str6;
        String str33 = (i & 128) != 0 ? recurringPaymentBillDetailsEntity.beneficiaryType : str7;
        String str34 = (i & 256) != 0 ? recurringPaymentBillDetailsEntity.beneficiaryTaxId : str8;
        String str35 = (i & 512) != 0 ? recurringPaymentBillDetailsEntity.beneficiaryBankName : str9;
        String str36 = (i & 1024) != 0 ? recurringPaymentBillDetailsEntity.beneficiaryBankNumber : str10;
        String str37 = (i & 2048) != 0 ? recurringPaymentBillDetailsEntity.beneficiaryBankCode : str11;
        boolean z4 = (i & 4096) != 0 ? recurringPaymentBillDetailsEntity.canBePaidNow : z;
        String str38 = (i & 8192) != 0 ? recurringPaymentBillDetailsEntity.nextAvailableDateForPayment : str12;
        String str39 = str27;
        BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity3 = (i & 16384) != 0 ? recurringPaymentBillDetailsEntity.thresholds : billThresholdsEmbeddedEntity;
        BillFeesEmbeddedEntity billFeesEmbeddedEntity3 = (i & 32768) != 0 ? recurringPaymentBillDetailsEntity.fees : billFeesEmbeddedEntity;
        if ((i & 65536) != 0) {
            billFeesEmbeddedEntity2 = billFeesEmbeddedEntity3;
            str14 = recurringPaymentBillDetailsEntity.paymentAgreementId;
            billThresholdsEmbeddedEntity2 = billThresholdsEmbeddedEntity3;
            str16 = str28;
            str17 = str29;
            str18 = str30;
            str19 = str31;
            bool2 = bool3;
            str20 = str32;
            str21 = str33;
            str22 = str34;
            str23 = str35;
            str24 = str36;
            str25 = str37;
            z3 = z4;
            str26 = str38;
            str15 = str39;
            recurringPaymentBillDetailsEntity2 = recurringPaymentBillDetailsEntity;
        } else {
            str14 = str13;
            billFeesEmbeddedEntity2 = billFeesEmbeddedEntity3;
            str15 = str39;
            recurringPaymentBillDetailsEntity2 = recurringPaymentBillDetailsEntity;
            billThresholdsEmbeddedEntity2 = billThresholdsEmbeddedEntity3;
            str16 = str28;
            str17 = str29;
            str18 = str30;
            str19 = str31;
            bool2 = bool3;
            str20 = str32;
            str21 = str33;
            str22 = str34;
            str23 = str35;
            str24 = str36;
            str25 = str37;
            z3 = z4;
            str26 = str38;
        }
        return recurringPaymentBillDetailsEntity2.copy(str15, str16, str17, str18, str19, bool2, str20, str21, str22, str23, str24, str25, z3, str26, billThresholdsEmbeddedEntity2, billFeesEmbeddedEntity2, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBeneficiaryBankName() {
        return this.beneficiaryBankName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBeneficiaryBankNumber() {
        return this.beneficiaryBankNumber;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBeneficiaryBankCode() {
        return this.beneficiaryBankCode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getCanBePaidNow() {
        return this.canBePaidNow;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNextAvailableDateForPayment() {
        return this.nextAvailableDateForPayment;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BillThresholdsEmbeddedEntity getThresholds() {
        return this.thresholds;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BillFeesEmbeddedEntity getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPaymentAgreementId() {
        return this.paymentAgreementId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStandingOrderId() {
        return this.standingOrderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillNumber() {
        return this.billNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScheduledDate() {
        return this.scheduledDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getHasEditableAmount() {
        return this.hasEditableAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBeneficiaryType() {
        return this.beneficiaryType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBeneficiaryTaxId() {
        return this.beneficiaryTaxId;
    }

    @NotNull
    public final RecurringPaymentBillDetailsEntity copy(String transferType, String standingOrderId, String billNumber, String scheduledDate, String dueDate, Boolean hasEditableAmount, String beneficiaryName, String beneficiaryType, String beneficiaryTaxId, String beneficiaryBankName, String beneficiaryBankNumber, String beneficiaryBankCode, boolean canBePaidNow, String nextAvailableDateForPayment, BillThresholdsEmbeddedEntity thresholds, BillFeesEmbeddedEntity fees, String paymentAgreementId) {
        return new RecurringPaymentBillDetailsEntity(transferType, standingOrderId, billNumber, scheduledDate, dueDate, hasEditableAmount, beneficiaryName, beneficiaryType, beneficiaryTaxId, beneficiaryBankName, beneficiaryBankNumber, beneficiaryBankCode, canBePaidNow, nextAvailableDateForPayment, thresholds, fees, paymentAgreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentBillDetailsEntity)) {
            return false;
        }
        RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntity = (RecurringPaymentBillDetailsEntity) other;
        return Intrinsics.f(this.transferType, recurringPaymentBillDetailsEntity.transferType) && Intrinsics.f(this.standingOrderId, recurringPaymentBillDetailsEntity.standingOrderId) && Intrinsics.f(this.billNumber, recurringPaymentBillDetailsEntity.billNumber) && Intrinsics.f(this.scheduledDate, recurringPaymentBillDetailsEntity.scheduledDate) && Intrinsics.f(this.dueDate, recurringPaymentBillDetailsEntity.dueDate) && Intrinsics.f(this.hasEditableAmount, recurringPaymentBillDetailsEntity.hasEditableAmount) && Intrinsics.f(this.beneficiaryName, recurringPaymentBillDetailsEntity.beneficiaryName) && Intrinsics.f(this.beneficiaryType, recurringPaymentBillDetailsEntity.beneficiaryType) && Intrinsics.f(this.beneficiaryTaxId, recurringPaymentBillDetailsEntity.beneficiaryTaxId) && Intrinsics.f(this.beneficiaryBankName, recurringPaymentBillDetailsEntity.beneficiaryBankName) && Intrinsics.f(this.beneficiaryBankNumber, recurringPaymentBillDetailsEntity.beneficiaryBankNumber) && Intrinsics.f(this.beneficiaryBankCode, recurringPaymentBillDetailsEntity.beneficiaryBankCode) && this.canBePaidNow == recurringPaymentBillDetailsEntity.canBePaidNow && Intrinsics.f(this.nextAvailableDateForPayment, recurringPaymentBillDetailsEntity.nextAvailableDateForPayment) && Intrinsics.f(this.thresholds, recurringPaymentBillDetailsEntity.thresholds) && Intrinsics.f(this.fees, recurringPaymentBillDetailsEntity.fees) && Intrinsics.f(this.paymentAgreementId, recurringPaymentBillDetailsEntity.paymentAgreementId);
    }

    public final String getBeneficiaryBankCode() {
        return this.beneficiaryBankCode;
    }

    public final String getBeneficiaryBankName() {
        return this.beneficiaryBankName;
    }

    public final String getBeneficiaryBankNumber() {
        return this.beneficiaryBankNumber;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final String getBeneficiaryTaxId() {
        return this.beneficiaryTaxId;
    }

    public final String getBeneficiaryType() {
        return this.beneficiaryType;
    }

    public final String getBillNumber() {
        return this.billNumber;
    }

    public final boolean getCanBePaidNow() {
        return this.canBePaidNow;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final BillFeesEmbeddedEntity getFees() {
        return this.fees;
    }

    public final Boolean getHasEditableAmount() {
        return this.hasEditableAmount;
    }

    public final String getNextAvailableDateForPayment() {
        return this.nextAvailableDateForPayment;
    }

    public final String getPaymentAgreementId() {
        return this.paymentAgreementId;
    }

    public final String getScheduledDate() {
        return this.scheduledDate;
    }

    public final String getStandingOrderId() {
        return this.standingOrderId;
    }

    public final BillThresholdsEmbeddedEntity getThresholds() {
        return this.thresholds;
    }

    public final String getTransferType() {
        return this.transferType;
    }

    public int hashCode() {
        String str = this.transferType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.standingOrderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scheduledDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dueDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.hasEditableAmount;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.beneficiaryName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.beneficiaryType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.beneficiaryTaxId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.beneficiaryBankName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.beneficiaryBankNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.beneficiaryBankCode;
        int iC = a.c((iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.canBePaidNow);
        String str12 = this.nextAvailableDateForPayment;
        int iHashCode12 = (iC + (str12 == null ? 0 : str12.hashCode())) * 31;
        BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity = this.thresholds;
        int iHashCode13 = (iHashCode12 + (billThresholdsEmbeddedEntity == null ? 0 : billThresholdsEmbeddedEntity.hashCode())) * 31;
        BillFeesEmbeddedEntity billFeesEmbeddedEntity = this.fees;
        int iHashCode14 = (iHashCode13 + (billFeesEmbeddedEntity == null ? 0 : billFeesEmbeddedEntity.hashCode())) * 31;
        String str13 = this.paymentAgreementId;
        return iHashCode14 + (str13 != null ? str13.hashCode() : 0);
    }

    public /* synthetic */ RecurringPaymentBillDetailsEntity(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity, BillFeesEmbeddedEntity billFeesEmbeddedEntity, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, str5, bool, str6, str7, str8, str9, str10, str11, z, str12, (i & 16384) != 0 ? null : billThresholdsEmbeddedEntity, (32768 & i) != 0 ? null : billFeesEmbeddedEntity, (i & 65536) != 0 ? null : str13);
    }
}
