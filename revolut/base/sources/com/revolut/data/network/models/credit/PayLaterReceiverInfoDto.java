package com.revolut.data.network.models.credit;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006+"}, d2 = {"Lcom/revolut/data/network/models/credit/PayLaterReceiverInfoDto;", "", "instalmentState", "", "fee", "", "planId", "instalmentIndex", "", "instalmentCount", "merchantName", "merchantLogoName", "merchantCategory", "repaymentSource", "<init>", "(Ljava/lang/String;DLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInstalmentState", "()Ljava/lang/String;", "getFee", "()D", "getPlanId", "getInstalmentIndex", "()I", "getInstalmentCount", "getMerchantName", "getMerchantLogoName", "getMerchantCategory", "getRepaymentSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterReceiverInfoDto {

    @b("fee")
    private final double fee;

    @b("instalmentCount")
    private final int instalmentCount;

    @b("instalmentIndex")
    private final int instalmentIndex;

    @b("instalmentState")
    @NotNull
    private final String instalmentState;

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

    public PayLaterReceiverInfoDto(@NotNull String instalmentState, double d, @NotNull String planId, int i, int i2, String str, String str2, String str3, String str4) {
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
    }

    public static /* synthetic */ PayLaterReceiverInfoDto copy$default(PayLaterReceiverInfoDto payLaterReceiverInfoDto, String str, double d, String str2, int i, int i2, String str3, String str4, String str5, String str6, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            str = payLaterReceiverInfoDto.instalmentState;
        }
        if ((i3 & 2) != 0) {
            d = payLaterReceiverInfoDto.fee;
        }
        if ((i3 & 4) != 0) {
            str2 = payLaterReceiverInfoDto.planId;
        }
        if ((i3 & 8) != 0) {
            i = payLaterReceiverInfoDto.instalmentIndex;
        }
        if ((i3 & 16) != 0) {
            i2 = payLaterReceiverInfoDto.instalmentCount;
        }
        if ((i3 & 32) != 0) {
            str3 = payLaterReceiverInfoDto.merchantName;
        }
        if ((i3 & 64) != 0) {
            str4 = payLaterReceiverInfoDto.merchantLogoName;
        }
        if ((i3 & 128) != 0) {
            str5 = payLaterReceiverInfoDto.merchantCategory;
        }
        if ((i3 & 256) != 0) {
            str6 = payLaterReceiverInfoDto.repaymentSource;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        int i5 = i2;
        String str10 = str2;
        return payLaterReceiverInfoDto.copy(str, d, str10, i, i5, str3, str9, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstalmentState() {
        return this.instalmentState;
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
    public final PayLaterReceiverInfoDto copy(@NotNull String instalmentState, double fee2, @NotNull String planId, int instalmentIndex, int instalmentCount, String merchantName, String merchantLogoName, String merchantCategory, String repaymentSource) {
        Intrinsics.checkNotNullParameter(instalmentState, "instalmentState");
        Intrinsics.checkNotNullParameter(planId, "planId");
        return new PayLaterReceiverInfoDto(instalmentState, fee2, planId, instalmentIndex, instalmentCount, merchantName, merchantLogoName, merchantCategory, repaymentSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayLaterReceiverInfoDto)) {
            return false;
        }
        PayLaterReceiverInfoDto payLaterReceiverInfoDto = (PayLaterReceiverInfoDto) other;
        return Intrinsics.f(this.instalmentState, payLaterReceiverInfoDto.instalmentState) && Double.compare(this.fee, payLaterReceiverInfoDto.fee) == 0 && Intrinsics.f(this.planId, payLaterReceiverInfoDto.planId) && this.instalmentIndex == payLaterReceiverInfoDto.instalmentIndex && this.instalmentCount == payLaterReceiverInfoDto.instalmentCount && Intrinsics.f(this.merchantName, payLaterReceiverInfoDto.merchantName) && Intrinsics.f(this.merchantLogoName, payLaterReceiverInfoDto.merchantLogoName) && Intrinsics.f(this.merchantCategory, payLaterReceiverInfoDto.merchantCategory) && Intrinsics.f(this.repaymentSource, payLaterReceiverInfoDto.repaymentSource);
    }

    public final double getFee() {
        return this.fee;
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
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
