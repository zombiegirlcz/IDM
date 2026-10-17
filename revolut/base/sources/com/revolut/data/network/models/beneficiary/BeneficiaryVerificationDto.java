package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryVerificationDto;", "", "id", "", "scheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getScheme", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryVerificationDto {

    @b("id")
    private final String id;

    @b("scheme")
    private final String scheme;

    /* JADX WARN: Multi-variable type inference failed */
    public BeneficiaryVerificationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeneficiaryVerificationDto copy$default(BeneficiaryVerificationDto beneficiaryVerificationDto, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryVerificationDto.id;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryVerificationDto.scheme;
        }
        return beneficiaryVerificationDto.copy(str, str2);
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
    public final BeneficiaryVerificationDto copy(String id10, String scheme) {
        return new BeneficiaryVerificationDto(id10, scheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryVerificationDto)) {
            return false;
        }
        BeneficiaryVerificationDto beneficiaryVerificationDto = (BeneficiaryVerificationDto) other;
        return Intrinsics.f(this.id, beneficiaryVerificationDto.id) && Intrinsics.f(this.scheme, beneficiaryVerificationDto.scheme);
    }

    public final String getId() {
        return this.id;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scheme;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public BeneficiaryVerificationDto(String str, String str2) {
        this.id = str;
        this.scheme = str2;
    }

    public /* synthetic */ BeneficiaryVerificationDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
