package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "", "type", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "value", "", "<init>", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;Ljava/lang/String;)V", "getType", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryIdentificationDto {

    @b("type")
    private final BeneficiaryIdentificationTypeDto type;

    @b("value")
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public BeneficiaryIdentificationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeneficiaryIdentificationDto copy$default(BeneficiaryIdentificationDto beneficiaryIdentificationDto, BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            beneficiaryIdentificationTypeDto = beneficiaryIdentificationDto.type;
        }
        if ((i & 2) != 0) {
            str = beneficiaryIdentificationDto.value;
        }
        return beneficiaryIdentificationDto.copy(beneficiaryIdentificationTypeDto, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BeneficiaryIdentificationTypeDto getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final BeneficiaryIdentificationDto copy(BeneficiaryIdentificationTypeDto type, String value) {
        return new BeneficiaryIdentificationDto(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryIdentificationDto)) {
            return false;
        }
        BeneficiaryIdentificationDto beneficiaryIdentificationDto = (BeneficiaryIdentificationDto) other;
        return this.type == beneficiaryIdentificationDto.type && Intrinsics.f(this.value, beneficiaryIdentificationDto.value);
    }

    public final BeneficiaryIdentificationTypeDto getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto = this.type;
        int iHashCode = (beneficiaryIdentificationTypeDto == null ? 0 : beneficiaryIdentificationTypeDto.hashCode()) * 31;
        String str = this.value;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public BeneficiaryIdentificationDto(BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto, String str) {
        this.type = beneficiaryIdentificationTypeDto;
        this.value = str;
    }

    public /* synthetic */ BeneficiaryIdentificationDto(BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : beneficiaryIdentificationTypeDto, (i & 2) != 0 ? null : str);
    }
}
