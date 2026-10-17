package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryPdaDto;", "", "designatedAccountAllowed", "", "isCurrentDesignatedAccount", "<init>", "(ZZ)V", "getDesignatedAccountAllowed", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryPdaDto {

    @b("designatedAccountAllowed")
    private final boolean designatedAccountAllowed;

    @b("designatedAccount")
    private final boolean isCurrentDesignatedAccount;

    public BeneficiaryPdaDto(boolean z, boolean z3) {
        this.designatedAccountAllowed = z;
        this.isCurrentDesignatedAccount = z3;
    }

    public static /* synthetic */ BeneficiaryPdaDto copy$default(BeneficiaryPdaDto beneficiaryPdaDto, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = beneficiaryPdaDto.designatedAccountAllowed;
        }
        if ((i & 2) != 0) {
            z3 = beneficiaryPdaDto.isCurrentDesignatedAccount;
        }
        return beneficiaryPdaDto.copy(z, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDesignatedAccountAllowed() {
        return this.designatedAccountAllowed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCurrentDesignatedAccount() {
        return this.isCurrentDesignatedAccount;
    }

    @NotNull
    public final BeneficiaryPdaDto copy(boolean designatedAccountAllowed, boolean isCurrentDesignatedAccount) {
        return new BeneficiaryPdaDto(designatedAccountAllowed, isCurrentDesignatedAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryPdaDto)) {
            return false;
        }
        BeneficiaryPdaDto beneficiaryPdaDto = (BeneficiaryPdaDto) other;
        return this.designatedAccountAllowed == beneficiaryPdaDto.designatedAccountAllowed && this.isCurrentDesignatedAccount == beneficiaryPdaDto.isCurrentDesignatedAccount;
    }

    public final boolean getDesignatedAccountAllowed() {
        return this.designatedAccountAllowed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCurrentDesignatedAccount) + (Boolean.hashCode(this.designatedAccountAllowed) * 31);
    }

    public final boolean isCurrentDesignatedAccount() {
        return this.isCurrentDesignatedAccount;
    }
}
