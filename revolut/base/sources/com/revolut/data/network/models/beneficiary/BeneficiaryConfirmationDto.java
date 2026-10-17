package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;", "", "id", "", "scheme", "resultCode", "firstName", "lastName", "companyName", "legalName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getScheme", "getResultCode", "getFirstName", "getLastName", "getCompanyName", "getLegalName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryConfirmationDto {

    @b("companyName")
    private final String companyName;

    @b("firstName")
    private final String firstName;

    @b("id")
    private final String id;

    @b("lastName")
    private final String lastName;

    @b("legalName")
    private final String legalName;

    @b("resultCode")
    @NotNull
    private final String resultCode;

    @b("scheme")
    private final String scheme;

    public BeneficiaryConfirmationDto(String str, String str2, @NotNull String resultCode, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.id = str;
        this.scheme = str2;
        this.resultCode = resultCode;
        this.firstName = str3;
        this.lastName = str4;
        this.companyName = str5;
        this.legalName = str6;
    }

    public static /* synthetic */ BeneficiaryConfirmationDto copy$default(BeneficiaryConfirmationDto beneficiaryConfirmationDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryConfirmationDto.id;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryConfirmationDto.scheme;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryConfirmationDto.resultCode;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryConfirmationDto.firstName;
        }
        if ((i & 16) != 0) {
            str5 = beneficiaryConfirmationDto.lastName;
        }
        if ((i & 32) != 0) {
            str6 = beneficiaryConfirmationDto.companyName;
        }
        if ((i & 64) != 0) {
            str7 = beneficiaryConfirmationDto.legalName;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return beneficiaryConfirmationDto.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    @NotNull
    public final BeneficiaryConfirmationDto copy(String id10, String scheme, @NotNull String resultCode, String firstName, String lastName, String companyName, String legalName) {
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        return new BeneficiaryConfirmationDto(id10, scheme, resultCode, firstName, lastName, companyName, legalName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryConfirmationDto)) {
            return false;
        }
        BeneficiaryConfirmationDto beneficiaryConfirmationDto = (BeneficiaryConfirmationDto) other;
        return Intrinsics.f(this.id, beneficiaryConfirmationDto.id) && Intrinsics.f(this.scheme, beneficiaryConfirmationDto.scheme) && Intrinsics.f(this.resultCode, beneficiaryConfirmationDto.resultCode) && Intrinsics.f(this.firstName, beneficiaryConfirmationDto.firstName) && Intrinsics.f(this.lastName, beneficiaryConfirmationDto.lastName) && Intrinsics.f(this.companyName, beneficiaryConfirmationDto.companyName) && Intrinsics.f(this.legalName, beneficiaryConfirmationDto.legalName);
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    @NotNull
    public final String getResultCode() {
        return this.resultCode;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scheme;
        int iC = a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.resultCode);
        String str3 = this.firstName;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.companyName;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.legalName;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }
}
