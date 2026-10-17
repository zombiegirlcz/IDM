package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryMissingExtraFieldsDto;", "", "address", "", "dob", "legalName", "companyDo", "reason", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAddress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDob", "getLegalName", "getCompanyDo", "getReason", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryMissingExtraFieldsDto;", "equals", "other", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryMissingExtraFieldsDto {

    @b("address")
    private final Boolean address;

    @b("companyDo")
    private final Boolean companyDo;

    @b("dob")
    private final Boolean dob;

    @b("legalName")
    private final Boolean legalName;

    @b("reason")
    private final Boolean reason;

    public BeneficiaryMissingExtraFieldsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.address = bool;
        this.dob = bool2;
        this.legalName = bool3;
        this.companyDo = bool4;
        this.reason = bool5;
    }

    public static /* synthetic */ BeneficiaryMissingExtraFieldsDto copy$default(BeneficiaryMissingExtraFieldsDto beneficiaryMissingExtraFieldsDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj2) {
        if ((i & 1) != 0) {
            bool = beneficiaryMissingExtraFieldsDto.address;
        }
        if ((i & 2) != 0) {
            bool2 = beneficiaryMissingExtraFieldsDto.dob;
        }
        if ((i & 4) != 0) {
            bool3 = beneficiaryMissingExtraFieldsDto.legalName;
        }
        if ((i & 8) != 0) {
            bool4 = beneficiaryMissingExtraFieldsDto.companyDo;
        }
        if ((i & 16) != 0) {
            bool5 = beneficiaryMissingExtraFieldsDto.reason;
        }
        Boolean bool6 = bool5;
        Boolean bool7 = bool3;
        return beneficiaryMissingExtraFieldsDto.copy(bool, bool2, bool7, bool4, bool6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getLegalName() {
        return this.legalName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getCompanyDo() {
        return this.companyDo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getReason() {
        return this.reason;
    }

    @NotNull
    public final BeneficiaryMissingExtraFieldsDto copy(Boolean address, Boolean dob2, Boolean legalName, Boolean companyDo, Boolean reason) {
        return new BeneficiaryMissingExtraFieldsDto(address, dob2, legalName, companyDo, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryMissingExtraFieldsDto)) {
            return false;
        }
        BeneficiaryMissingExtraFieldsDto beneficiaryMissingExtraFieldsDto = (BeneficiaryMissingExtraFieldsDto) other;
        return Intrinsics.f(this.address, beneficiaryMissingExtraFieldsDto.address) && Intrinsics.f(this.dob, beneficiaryMissingExtraFieldsDto.dob) && Intrinsics.f(this.legalName, beneficiaryMissingExtraFieldsDto.legalName) && Intrinsics.f(this.companyDo, beneficiaryMissingExtraFieldsDto.companyDo) && Intrinsics.f(this.reason, beneficiaryMissingExtraFieldsDto.reason);
    }

    public final Boolean getAddress() {
        return this.address;
    }

    public final Boolean getCompanyDo() {
        return this.companyDo;
    }

    public final Boolean getDob() {
        return this.dob;
    }

    public final Boolean getLegalName() {
        return this.legalName;
    }

    public final Boolean getReason() {
        return this.reason;
    }

    public int hashCode() {
        Boolean bool = this.address;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.dob;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.legalName;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.companyDo;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.reason;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }
}
