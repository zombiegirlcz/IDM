package com.revolut.data.database.models.credit;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;", "", "instalmentState", "", "fee", "", "planId", "instalmentIndex", "", "instalmentCount", "merchantName", "merchantLogoName", "merchantCategory", "repaymentSource", "logoUrl", "feeAmount", "", "<init>", "(Ljava/lang/String;DLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getInstalmentState", "()Ljava/lang/String;", "getFee", "()D", "getPlanId", "getInstalmentIndex", "()I", "getInstalmentCount", "getMerchantName", "getMerchantLogoName", "getMerchantCategory", "getRepaymentSource", "getLogoUrl", "getFeeAmount", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterReceiverEmbeddedEntity {

    @b("fee")
    private final double fee;

    @b("feeAmount")
    private final long feeAmount;

    @b("instalmentCount")
    private final int instalmentCount;

    @b("instalmentIndex")
    private final int instalmentIndex;

    @b("instalmentState")
    @NotNull
    private final String instalmentState;

    @b("logoUrl")
    private final String logoUrl;

    @b("merchantCategory")
    private final String merchantCategory;

    @b("merchantLogoName")
    private final String merchantLogoName;

    @b("merchantName")
    private final String merchantName;

    @b("planId")
    @NotNull
    private final String planId;

    @b("repaymentSource")
    private final String repaymentSource;

    public PayLaterReceiverEmbeddedEntity(@NotNull String instalmentState, double d, @NotNull String planId, int i, int i2, String str, String str2, String str3, String str4, String str5, long j2) {
        Intrinsics.checkNotNullParameter(instalmentState, "instalmentState");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.instalmentState = instalmentState;
        this.fee = d;
        this.planId = planId;
        this.instalmentIndex = i;
        this.instalmentCount = i2;
        this.merchantName = str;
        this.merchantLogoName = str2;
        this.merchantCategory = str3;
        this.repaymentSource = str4;
        this.logoUrl = str5;
        this.feeAmount = j2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstalmentState() {
        return this.instalmentState;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getFee() {
        return this.fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInstalmentIndex() {
        return this.instalmentIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getInstalmentCount() {
        return this.instalmentCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMerchantLogoName() {
        return this.merchantLogoName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMerchantCategory() {
        return this.merchantCategory;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRepaymentSource() {
        return this.repaymentSource;
    }

    @NotNull
    public final PayLaterReceiverEmbeddedEntity copy(@NotNull String instalmentState, double fee2, @NotNull String planId, int instalmentIndex, int instalmentCount, String merchantName, String merchantLogoName, String merchantCategory, String repaymentSource, String logoUrl, long feeAmount) {
        Intrinsics.checkNotNullParameter(instalmentState, "instalmentState");
        Intrinsics.checkNotNullParameter(planId, "planId");
        return new PayLaterReceiverEmbeddedEntity(instalmentState, fee2, planId, instalmentIndex, instalmentCount, merchantName, merchantLogoName, merchantCategory, repaymentSource, logoUrl, feeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayLaterReceiverEmbeddedEntity)) {
            return false;
        }
        PayLaterReceiverEmbeddedEntity payLaterReceiverEmbeddedEntity = (PayLaterReceiverEmbeddedEntity) other;
        return Intrinsics.f(this.instalmentState, payLaterReceiverEmbeddedEntity.instalmentState) && Double.compare(this.fee, payLaterReceiverEmbeddedEntity.fee) == 0 && Intrinsics.f(this.planId, payLaterReceiverEmbeddedEntity.planId) && this.instalmentIndex == payLaterReceiverEmbeddedEntity.instalmentIndex && this.instalmentCount == payLaterReceiverEmbeddedEntity.instalmentCount && Intrinsics.f(this.merchantName, payLaterReceiverEmbeddedEntity.merchantName) && Intrinsics.f(this.merchantLogoName, payLaterReceiverEmbeddedEntity.merchantLogoName) && Intrinsics.f(this.merchantCategory, payLaterReceiverEmbeddedEntity.merchantCategory) && Intrinsics.f(this.repaymentSource, payLaterReceiverEmbeddedEntity.repaymentSource) && Intrinsics.f(this.logoUrl, payLaterReceiverEmbeddedEntity.logoUrl) && this.feeAmount == payLaterReceiverEmbeddedEntity.feeAmount;
    }

    public final double getFee() {
        return this.fee;
    }

    public final long getFeeAmount() {
        return this.feeAmount;
    }

    public final int getInstalmentCount() {
        return this.instalmentCount;
    }

    public final int getInstalmentIndex() {
        return this.instalmentIndex;
    }

    @NotNull
    public final String getInstalmentState() {
        return this.instalmentState;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMerchantCategory() {
        return this.merchantCategory;
    }

    public final String getMerchantLogoName() {
        return this.merchantLogoName;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final String getPlanId() {
        return this.planId;
    }

    public final String getRepaymentSource() {
        return this.repaymentSource;
    }

    public int hashCode() {
        int iB = a.b(this.instalmentCount, a.b(this.instalmentIndex, p.a.c(m72.b.c(this.instalmentState.hashCode() * 31, this.fee, 31), 31, this.planId), 31), 31);
        String str = this.merchantName;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantLogoName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantCategory;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.repaymentSource;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.logoUrl;
        return Long.hashCode(this.feeAmount) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
