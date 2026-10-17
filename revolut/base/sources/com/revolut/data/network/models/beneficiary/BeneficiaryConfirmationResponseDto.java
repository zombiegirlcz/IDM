package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationResponseDto;", "", "status", "", "confirmation", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;", "<init>", "(Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;)V", "getStatus", "()Ljava/lang/String;", "getConfirmation", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryConfirmationResponseDto {

    @b("confirmation")
    private final BeneficiaryConfirmationDto confirmation;

    @b("status")
    @NotNull
    private final String status;

    public BeneficiaryConfirmationResponseDto(@NotNull String status, BeneficiaryConfirmationDto beneficiaryConfirmationDto) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.confirmation = beneficiaryConfirmationDto;
    }

    public final BeneficiaryConfirmationDto getConfirmation() {
        return this.confirmation;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
