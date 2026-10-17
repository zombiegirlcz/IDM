package com.revolut.data.network.models.beneficiary;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryGroupDto;", "Ljava/io/Serializable;", "name", "", "beneficiaries", "", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getBeneficiaries", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryGroupDto implements Serializable {

    @b("beneficiaries")
    @NotNull
    private final List<BeneficiaryDto> beneficiaries;

    @b("name")
    @NotNull
    private final String name;

    public BeneficiaryGroupDto(@NotNull String name, @NotNull List<BeneficiaryDto> beneficiaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.name = name;
        this.beneficiaries = beneficiaries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryGroupDto copy$default(BeneficiaryGroupDto beneficiaryGroupDto, String str, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryGroupDto.name;
        }
        if ((i & 2) != 0) {
            list = beneficiaryGroupDto.beneficiaries;
        }
        return beneficiaryGroupDto.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<BeneficiaryDto> component2() {
        return this.beneficiaries;
    }

    @NotNull
    public final BeneficiaryGroupDto copy(@NotNull String name, @NotNull List<BeneficiaryDto> beneficiaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        return new BeneficiaryGroupDto(name, beneficiaries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryGroupDto)) {
            return false;
        }
        BeneficiaryGroupDto beneficiaryGroupDto = (BeneficiaryGroupDto) other;
        return Intrinsics.f(this.name, beneficiaryGroupDto.name) && Intrinsics.f(this.beneficiaries, beneficiaryGroupDto.beneficiaries);
    }

    @NotNull
    public final List<BeneficiaryDto> getBeneficiaries() {
        return this.beneficiaries;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.beneficiaries.hashCode() + (this.name.hashCode() * 31);
    }
}
