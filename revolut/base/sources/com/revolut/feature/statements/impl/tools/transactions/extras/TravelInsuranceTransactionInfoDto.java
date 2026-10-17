package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import wi7.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TravelInsuranceTransactionInfoDto;", "Ljava/io/Serializable;", "Lwi7/a;", "options", "", "country", "<init>", "(Lwi7/a;Ljava/lang/String;)V", "component1", "()Lwi7/a;", "component2", "()Ljava/lang/String;", "copy", "(Lwi7/a;Ljava/lang/String;)Lcom/revolut/feature/statements/impl/tools/transactions/extras/TravelInsuranceTransactionInfoDto;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Lwi7/a;", "getOptions", "Ljava/lang/String;", "getCountry", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelInsuranceTransactionInfoDto implements Serializable {

    @b("country")
    private final String country;

    @b("options")
    @NotNull
    private final a options;

    public TravelInsuranceTransactionInfoDto(@NotNull a options, String str) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.country = str;
    }

    public static /* synthetic */ TravelInsuranceTransactionInfoDto copy$default(TravelInsuranceTransactionInfoDto travelInsuranceTransactionInfoDto, a aVar, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = travelInsuranceTransactionInfoDto.options;
        }
        if ((i & 2) != 0) {
            str = travelInsuranceTransactionInfoDto.country;
        }
        return travelInsuranceTransactionInfoDto.copy(aVar, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final TravelInsuranceTransactionInfoDto copy(@NotNull a options, String country) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new TravelInsuranceTransactionInfoDto(options, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelInsuranceTransactionInfoDto)) {
            return false;
        }
        TravelInsuranceTransactionInfoDto travelInsuranceTransactionInfoDto = (TravelInsuranceTransactionInfoDto) other;
        return Intrinsics.f(this.options, travelInsuranceTransactionInfoDto.options) && Intrinsics.f(this.country, travelInsuranceTransactionInfoDto.country);
    }

    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final a getOptions() {
        return this.options;
    }

    public int hashCode() {
        int iHashCode = this.options.hashCode() * 31;
        String str = this.country;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
