package com.revolut.data.network.models.beneficiary;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListDto;", "", "dataSource", "", "Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListSourceDto;", "dataMapping", "", "", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getDataSource", "()Ljava/util/List;", "getDataMapping", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiarySearchListDto {

    @b("dataMapping")
    private final Map<String, String> dataMapping;

    @b("dataSource")
    @NotNull
    private final List<BeneficiarySearchListSourceDto> dataSource;

    public BeneficiarySearchListDto(@NotNull List<BeneficiarySearchListSourceDto> dataSource, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.dataMapping = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiarySearchListDto copy$default(BeneficiarySearchListDto beneficiarySearchListDto, List list, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = beneficiarySearchListDto.dataSource;
        }
        if ((i & 2) != 0) {
            map = beneficiarySearchListDto.dataMapping;
        }
        return beneficiarySearchListDto.copy(list, map);
    }

    @NotNull
    public final List<BeneficiarySearchListSourceDto> component1() {
        return this.dataSource;
    }

    public final Map<String, String> component2() {
        return this.dataMapping;
    }

    @NotNull
    public final BeneficiarySearchListDto copy(@NotNull List<BeneficiarySearchListSourceDto> dataSource, Map<String, String> dataMapping) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return new BeneficiarySearchListDto(dataSource, dataMapping);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiarySearchListDto)) {
            return false;
        }
        BeneficiarySearchListDto beneficiarySearchListDto = (BeneficiarySearchListDto) other;
        return Intrinsics.f(this.dataSource, beneficiarySearchListDto.dataSource) && Intrinsics.f(this.dataMapping, beneficiarySearchListDto.dataMapping);
    }

    public final Map<String, String> getDataMapping() {
        return this.dataMapping;
    }

    @NotNull
    public final List<BeneficiarySearchListSourceDto> getDataSource() {
        return this.dataSource;
    }

    public int hashCode() {
        int iHashCode = this.dataSource.hashCode() * 31;
        Map<String, String> map = this.dataMapping;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
