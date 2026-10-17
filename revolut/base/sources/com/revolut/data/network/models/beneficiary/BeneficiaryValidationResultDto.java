package com.revolut.data.network.models.beneficiary;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\t\u0010\u0013¨\u0006 "}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryValidationResultDto;", "", "status", "", "accountFields", "", "Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;", "confirmation", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;", "isRevolutBeneficiary", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;Ljava/lang/Boolean;)V", "getStatus", "()Ljava/lang/String;", "getAccountFields", "()Ljava/util/List;", "getConfirmation", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;Ljava/lang/Boolean;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryValidationResultDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryValidationResultDto {

    @b("accountFields")
    private final List<BankFieldDefinitionDto> accountFields;

    @b("confirmation")
    private final BeneficiaryConfirmationDto confirmation;

    @b("revolutBeneficiary")
    private final Boolean isRevolutBeneficiary;

    @b("status")
    @NotNull
    private final String status;

    public BeneficiaryValidationResultDto(@NotNull String status, List<BankFieldDefinitionDto> list, BeneficiaryConfirmationDto beneficiaryConfirmationDto, Boolean bool) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.accountFields = list;
        this.confirmation = beneficiaryConfirmationDto;
        this.isRevolutBeneficiary = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryValidationResultDto copy$default(BeneficiaryValidationResultDto beneficiaryValidationResultDto, String str, List list, BeneficiaryConfirmationDto beneficiaryConfirmationDto, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryValidationResultDto.status;
        }
        if ((i & 2) != 0) {
            list = beneficiaryValidationResultDto.accountFields;
        }
        if ((i & 4) != 0) {
            beneficiaryConfirmationDto = beneficiaryValidationResultDto.confirmation;
        }
        if ((i & 8) != 0) {
            bool = beneficiaryValidationResultDto.isRevolutBeneficiary;
        }
        return beneficiaryValidationResultDto.copy(str, list, beneficiaryConfirmationDto, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<BankFieldDefinitionDto> component2() {
        return this.accountFields;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BeneficiaryConfirmationDto getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsRevolutBeneficiary() {
        return this.isRevolutBeneficiary;
    }

    @NotNull
    public final BeneficiaryValidationResultDto copy(@NotNull String status, List<BankFieldDefinitionDto> accountFields, BeneficiaryConfirmationDto confirmation, Boolean isRevolutBeneficiary) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new BeneficiaryValidationResultDto(status, accountFields, confirmation, isRevolutBeneficiary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryValidationResultDto)) {
            return false;
        }
        BeneficiaryValidationResultDto beneficiaryValidationResultDto = (BeneficiaryValidationResultDto) other;
        return Intrinsics.f(this.status, beneficiaryValidationResultDto.status) && Intrinsics.f(this.accountFields, beneficiaryValidationResultDto.accountFields) && Intrinsics.f(this.confirmation, beneficiaryValidationResultDto.confirmation) && Intrinsics.f(this.isRevolutBeneficiary, beneficiaryValidationResultDto.isRevolutBeneficiary);
    }

    public final List<BankFieldDefinitionDto> getAccountFields() {
        return this.accountFields;
    }

    public final BeneficiaryConfirmationDto getConfirmation() {
        return this.confirmation;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        List<BankFieldDefinitionDto> list = this.accountFields;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BeneficiaryConfirmationDto beneficiaryConfirmationDto = this.confirmation;
        int iHashCode3 = (iHashCode2 + (beneficiaryConfirmationDto == null ? 0 : beneficiaryConfirmationDto.hashCode())) * 31;
        Boolean bool = this.isRevolutBeneficiary;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isRevolutBeneficiary() {
        return this.isRevolutBeneficiary;
    }
}
