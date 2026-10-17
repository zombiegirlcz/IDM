package com.revolut.data.network.models.beneficiary;

import com.revolut.data.network.models.address.AddressModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "Ljava/io/Serializable;", "legalName", "", "dob", "reason", "companyDo", "address", "Lcom/revolut/data/network/models/address/AddressModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/address/AddressModel;)V", "getLegalName", "()Ljava/lang/String;", "getDob", "getReason", "getCompanyDo", "getAddress", "()Lcom/revolut/data/network/models/address/AddressModel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryExtraFieldsDto implements Serializable {

    @b("address")
    private final AddressModel address;

    @b("companyDo")
    private final String companyDo;

    @b("dob")
    private final String dob;

    @b("legalName")
    private final String legalName;

    @b("reason")
    private final String reason;

    public BeneficiaryExtraFieldsDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BeneficiaryExtraFieldsDto copy$default(BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto, String str, String str2, String str3, String str4, AddressModel addressModel, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryExtraFieldsDto.legalName;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryExtraFieldsDto.dob;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryExtraFieldsDto.reason;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryExtraFieldsDto.companyDo;
        }
        if ((i & 16) != 0) {
            addressModel = beneficiaryExtraFieldsDto.address;
        }
        AddressModel addressModel2 = addressModel;
        String str5 = str3;
        return beneficiaryExtraFieldsDto.copy(str, str2, str5, str4, addressModel2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyDo() {
        return this.companyDo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AddressModel getAddress() {
        return this.address;
    }

    @NotNull
    public final BeneficiaryExtraFieldsDto copy(String legalName, String dob2, String reason, String companyDo, AddressModel address) {
        return new BeneficiaryExtraFieldsDto(legalName, dob2, reason, companyDo, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryExtraFieldsDto)) {
            return false;
        }
        BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto = (BeneficiaryExtraFieldsDto) other;
        return Intrinsics.f(this.legalName, beneficiaryExtraFieldsDto.legalName) && Intrinsics.f(this.dob, beneficiaryExtraFieldsDto.dob) && Intrinsics.f(this.reason, beneficiaryExtraFieldsDto.reason) && Intrinsics.f(this.companyDo, beneficiaryExtraFieldsDto.companyDo) && Intrinsics.f(this.address, beneficiaryExtraFieldsDto.address);
    }

    public final AddressModel getAddress() {
        return this.address;
    }

    public final String getCompanyDo() {
        return this.companyDo;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.legalName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dob;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reason;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.companyDo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddressModel addressModel = this.address;
        return iHashCode4 + (addressModel != null ? addressModel.hashCode() : 0);
    }

    public BeneficiaryExtraFieldsDto(String str, String str2, String str3, String str4, AddressModel addressModel) {
        this.legalName = str;
        this.dob = str2;
        this.reason = str3;
        this.companyDo = str4;
        this.address = addressModel;
    }

    public /* synthetic */ BeneficiaryExtraFieldsDto(String str, String str2, String str3, String str4, AddressModel addressModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : addressModel);
    }
}
