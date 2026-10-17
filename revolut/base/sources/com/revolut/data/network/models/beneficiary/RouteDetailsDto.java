package com.revolut.data.network.models.beneficiary;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/RouteDetailsDto;", "", "beneficiaryDetailsDto", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;", "default", "", "paymentType", "", "estimatedArrival", "intermediaryFeesApply", "creditorFeesApply", "upperAmountLimit", "", "<init>", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getBeneficiaryDetailsDto", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;", "getDefault", "()Z", "getPaymentType", "()Ljava/lang/String;", "getEstimatedArrival", "getIntermediaryFeesApply", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreditorFeesApply", "getUpperAmountLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/revolut/data/network/models/beneficiary/RouteDetailsDto;", "equals", "other", "hashCode", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RouteDetailsDto {

    @b("beneficiaryDetails")
    @NotNull
    private final BeneficiaryDetailsDto beneficiaryDetailsDto;

    @b("creditorFees")
    private final Boolean creditorFeesApply;

    @b("default")
    private final boolean default;

    @b("estimatedArrivalTime")
    private final String estimatedArrival;

    @b("intermediaryFees")
    private final Boolean intermediaryFeesApply;

    @b("paymentType")
    private final String paymentType;

    @b("upperAmountLimit")
    private final Integer upperAmountLimit;

    public RouteDetailsDto(@NotNull BeneficiaryDetailsDto beneficiaryDetailsDto, boolean z, String str, String str2, Boolean bool, Boolean bool2, Integer num) {
        Intrinsics.checkNotNullParameter(beneficiaryDetailsDto, "beneficiaryDetailsDto");
        this.beneficiaryDetailsDto = beneficiaryDetailsDto;
        this.default = z;
        this.paymentType = str;
        this.estimatedArrival = str2;
        this.intermediaryFeesApply = bool;
        this.creditorFeesApply = bool2;
        this.upperAmountLimit = num;
    }

    public static /* synthetic */ RouteDetailsDto copy$default(RouteDetailsDto routeDetailsDto, BeneficiaryDetailsDto beneficiaryDetailsDto, boolean z, String str, String str2, Boolean bool, Boolean bool2, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            beneficiaryDetailsDto = routeDetailsDto.beneficiaryDetailsDto;
        }
        if ((i & 2) != 0) {
            z = routeDetailsDto.default;
        }
        if ((i & 4) != 0) {
            str = routeDetailsDto.paymentType;
        }
        if ((i & 8) != 0) {
            str2 = routeDetailsDto.estimatedArrival;
        }
        if ((i & 16) != 0) {
            bool = routeDetailsDto.intermediaryFeesApply;
        }
        if ((i & 32) != 0) {
            bool2 = routeDetailsDto.creditorFeesApply;
        }
        if ((i & 64) != 0) {
            num = routeDetailsDto.upperAmountLimit;
        }
        Boolean bool3 = bool2;
        Integer num2 = num;
        Boolean bool4 = bool;
        String str3 = str;
        return routeDetailsDto.copy(beneficiaryDetailsDto, z, str3, str2, bool4, bool3, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BeneficiaryDetailsDto getBeneficiaryDetailsDto() {
        return this.beneficiaryDetailsDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEstimatedArrival() {
        return this.estimatedArrival;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIntermediaryFeesApply() {
        return this.intermediaryFeesApply;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getCreditorFeesApply() {
        return this.creditorFeesApply;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getUpperAmountLimit() {
        return this.upperAmountLimit;
    }

    @NotNull
    public final RouteDetailsDto copy(@NotNull BeneficiaryDetailsDto beneficiaryDetailsDto, boolean z, String paymentType, String estimatedArrival, Boolean intermediaryFeesApply, Boolean creditorFeesApply, Integer upperAmountLimit) {
        Intrinsics.checkNotNullParameter(beneficiaryDetailsDto, "beneficiaryDetailsDto");
        return new RouteDetailsDto(beneficiaryDetailsDto, z, paymentType, estimatedArrival, intermediaryFeesApply, creditorFeesApply, upperAmountLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteDetailsDto)) {
            return false;
        }
        RouteDetailsDto routeDetailsDto = (RouteDetailsDto) other;
        return Intrinsics.f(this.beneficiaryDetailsDto, routeDetailsDto.beneficiaryDetailsDto) && this.default == routeDetailsDto.default && Intrinsics.f(this.paymentType, routeDetailsDto.paymentType) && Intrinsics.f(this.estimatedArrival, routeDetailsDto.estimatedArrival) && Intrinsics.f(this.intermediaryFeesApply, routeDetailsDto.intermediaryFeesApply) && Intrinsics.f(this.creditorFeesApply, routeDetailsDto.creditorFeesApply) && Intrinsics.f(this.upperAmountLimit, routeDetailsDto.upperAmountLimit);
    }

    @NotNull
    public final BeneficiaryDetailsDto getBeneficiaryDetailsDto() {
        return this.beneficiaryDetailsDto;
    }

    public final Boolean getCreditorFeesApply() {
        return this.creditorFeesApply;
    }

    public final boolean getDefault() {
        return this.default;
    }

    public final String getEstimatedArrival() {
        return this.estimatedArrival;
    }

    public final Boolean getIntermediaryFeesApply() {
        return this.intermediaryFeesApply;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final Integer getUpperAmountLimit() {
        return this.upperAmountLimit;
    }

    public int hashCode() {
        int iC = a.c(this.beneficiaryDetailsDto.hashCode() * 31, 31, this.default);
        String str = this.paymentType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.estimatedArrival;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.intermediaryFeesApply;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.creditorFeesApply;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.upperAmountLimit;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }
}
