package com.revolut.data.network.models.beneficiary;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryFieldsDto;", "", "fields", "", "Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;", "paymentType", "", "addressOptional", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "getFields", "()Ljava/util/List;", "getPaymentType", "()Ljava/lang/String;", "getAddressOptional", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryFieldsDto {

    @b("addressOptional")
    private final boolean addressOptional;

    @b("fields")
    @NotNull
    private final List<BankFieldDefinitionDto> fields;

    @b("paymentType")
    private final String paymentType;

    public BeneficiaryFieldsDto(@NotNull List<BankFieldDefinitionDto> fields, String str, boolean z) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.fields = fields;
        this.paymentType = str;
        this.addressOptional = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryFieldsDto copy$default(BeneficiaryFieldsDto beneficiaryFieldsDto, List list, String str, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = beneficiaryFieldsDto.fields;
        }
        if ((i & 2) != 0) {
            str = beneficiaryFieldsDto.paymentType;
        }
        if ((i & 4) != 0) {
            z = beneficiaryFieldsDto.addressOptional;
        }
        return beneficiaryFieldsDto.copy(list, str, z);
    }

    @NotNull
    public final List<BankFieldDefinitionDto> component1() {
        return this.fields;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAddressOptional() {
        return this.addressOptional;
    }

    @NotNull
    public final BeneficiaryFieldsDto copy(@NotNull List<BankFieldDefinitionDto> fields, String paymentType, boolean addressOptional) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new BeneficiaryFieldsDto(fields, paymentType, addressOptional);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryFieldsDto)) {
            return false;
        }
        BeneficiaryFieldsDto beneficiaryFieldsDto = (BeneficiaryFieldsDto) other;
        return Intrinsics.f(this.fields, beneficiaryFieldsDto.fields) && Intrinsics.f(this.paymentType, beneficiaryFieldsDto.paymentType) && this.addressOptional == beneficiaryFieldsDto.addressOptional;
    }

    public final boolean getAddressOptional() {
        return this.addressOptional;
    }

    @NotNull
    public final List<BankFieldDefinitionDto> getFields() {
        return this.fields;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public int hashCode() {
        int iHashCode = this.fields.hashCode() * 31;
        String str = this.paymentType;
        return Boolean.hashCode(this.addressOptional) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
