package com.revolut.data.network.models.beneficiary;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;", "", "fields", "", "Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;", "type", "", "requirements", "Lcom/revolut/data/network/models/beneficiary/RequirementsDto;", "localisedTypeValue", "localisedShortenedTypeValue", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/RequirementsDto;Ljava/lang/String;Ljava/lang/String;)V", "getFields", "()Ljava/util/List;", "getType", "()Ljava/lang/String;", "getRequirements", "()Lcom/revolut/data/network/models/beneficiary/RequirementsDto;", "getLocalisedTypeValue", "getLocalisedShortenedTypeValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryDetailsDto {

    @b("fields")
    @NotNull
    private final List<BankFieldDefinitionDto> fields;

    @b("localisedShortenedTypeValue")
    private final String localisedShortenedTypeValue;

    @b("localisedTypeValue")
    private final String localisedTypeValue;

    @b("requirements")
    @NotNull
    private final RequirementsDto requirements;

    @b("type")
    private final String type;

    public BeneficiaryDetailsDto(@NotNull List<BankFieldDefinitionDto> fields, String str, @NotNull RequirementsDto requirements, String str2, String str3) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.fields = fields;
        this.type = str;
        this.requirements = requirements;
        this.localisedTypeValue = str2;
        this.localisedShortenedTypeValue = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryDetailsDto copy$default(BeneficiaryDetailsDto beneficiaryDetailsDto, List list, String str, RequirementsDto requirementsDto, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = beneficiaryDetailsDto.fields;
        }
        if ((i & 2) != 0) {
            str = beneficiaryDetailsDto.type;
        }
        if ((i & 4) != 0) {
            requirementsDto = beneficiaryDetailsDto.requirements;
        }
        if ((i & 8) != 0) {
            str2 = beneficiaryDetailsDto.localisedTypeValue;
        }
        if ((i & 16) != 0) {
            str3 = beneficiaryDetailsDto.localisedShortenedTypeValue;
        }
        String str4 = str3;
        RequirementsDto requirementsDto2 = requirementsDto;
        return beneficiaryDetailsDto.copy(list, str, requirementsDto2, str2, str4);
    }

    @NotNull
    public final List<BankFieldDefinitionDto> component1() {
        return this.fields;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RequirementsDto getRequirements() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocalisedTypeValue() {
        return this.localisedTypeValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocalisedShortenedTypeValue() {
        return this.localisedShortenedTypeValue;
    }

    @NotNull
    public final BeneficiaryDetailsDto copy(@NotNull List<BankFieldDefinitionDto> fields, String type, @NotNull RequirementsDto requirements, String localisedTypeValue, String localisedShortenedTypeValue) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        return new BeneficiaryDetailsDto(fields, type, requirements, localisedTypeValue, localisedShortenedTypeValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryDetailsDto)) {
            return false;
        }
        BeneficiaryDetailsDto beneficiaryDetailsDto = (BeneficiaryDetailsDto) other;
        return Intrinsics.f(this.fields, beneficiaryDetailsDto.fields) && Intrinsics.f(this.type, beneficiaryDetailsDto.type) && Intrinsics.f(this.requirements, beneficiaryDetailsDto.requirements) && Intrinsics.f(this.localisedTypeValue, beneficiaryDetailsDto.localisedTypeValue) && Intrinsics.f(this.localisedShortenedTypeValue, beneficiaryDetailsDto.localisedShortenedTypeValue);
    }

    @NotNull
    public final List<BankFieldDefinitionDto> getFields() {
        return this.fields;
    }

    public final String getLocalisedShortenedTypeValue() {
        return this.localisedShortenedTypeValue;
    }

    public final String getLocalisedTypeValue() {
        return this.localisedTypeValue;
    }

    @NotNull
    public final RequirementsDto getRequirements() {
        return this.requirements;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.fields.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (this.requirements.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.localisedTypeValue;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.localisedShortenedTypeValue;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
