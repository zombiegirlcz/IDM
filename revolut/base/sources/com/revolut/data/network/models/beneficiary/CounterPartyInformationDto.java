package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/CounterPartyInformationDto;", "", "institutionName", "", "logoUrl", "payeeMaskedName", "payeeNameConfirmationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInstitutionName", "()Ljava/lang/String;", "getLogoUrl", "getPayeeMaskedName", "getPayeeNameConfirmationId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CounterPartyInformationDto {

    @b("institutionName")
    private final String institutionName;

    @b("logo")
    private final String logoUrl;

    @b("payeeMaskedName")
    private final String payeeMaskedName;

    @b("payeeNameConfirmationId")
    private final String payeeNameConfirmationId;

    public CounterPartyInformationDto(String str, String str2, String str3, String str4) {
        this.institutionName = str;
        this.logoUrl = str2;
        this.payeeMaskedName = str3;
        this.payeeNameConfirmationId = str4;
    }

    public static /* synthetic */ CounterPartyInformationDto copy$default(CounterPartyInformationDto counterPartyInformationDto, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = counterPartyInformationDto.institutionName;
        }
        if ((i & 2) != 0) {
            str2 = counterPartyInformationDto.logoUrl;
        }
        if ((i & 4) != 0) {
            str3 = counterPartyInformationDto.payeeMaskedName;
        }
        if ((i & 8) != 0) {
            str4 = counterPartyInformationDto.payeeNameConfirmationId;
        }
        return counterPartyInformationDto.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayeeMaskedName() {
        return this.payeeMaskedName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayeeNameConfirmationId() {
        return this.payeeNameConfirmationId;
    }

    @NotNull
    public final CounterPartyInformationDto copy(String institutionName, String logoUrl, String payeeMaskedName, String payeeNameConfirmationId) {
        return new CounterPartyInformationDto(institutionName, logoUrl, payeeMaskedName, payeeNameConfirmationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterPartyInformationDto)) {
            return false;
        }
        CounterPartyInformationDto counterPartyInformationDto = (CounterPartyInformationDto) other;
        return Intrinsics.f(this.institutionName, counterPartyInformationDto.institutionName) && Intrinsics.f(this.logoUrl, counterPartyInformationDto.logoUrl) && Intrinsics.f(this.payeeMaskedName, counterPartyInformationDto.payeeMaskedName) && Intrinsics.f(this.payeeNameConfirmationId, counterPartyInformationDto.payeeNameConfirmationId);
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getPayeeMaskedName() {
        return this.payeeMaskedName;
    }

    public final String getPayeeNameConfirmationId() {
        return this.payeeNameConfirmationId;
    }

    public int hashCode() {
        String str = this.institutionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payeeMaskedName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payeeNameConfirmationId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
