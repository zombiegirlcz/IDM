package com.revolut.feature.statements.api.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/statements/api/models/TaxFilingData;", "", "taxYears", "", "Lcom/revolut/feature/statements/api/models/StatementPeriod;", "taxAuthorityUrl", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTaxYears", "()Ljava/util/List;", "getTaxAuthorityUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxFilingData {

    @NotNull
    private final String taxAuthorityUrl;

    @NotNull
    private final List<StatementPeriod> taxYears;

    public TaxFilingData(@NotNull List<StatementPeriod> taxYears, @NotNull String taxAuthorityUrl) {
        Intrinsics.checkNotNullParameter(taxYears, "taxYears");
        Intrinsics.checkNotNullParameter(taxAuthorityUrl, "taxAuthorityUrl");
        this.taxYears = taxYears;
        this.taxAuthorityUrl = taxAuthorityUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxFilingData copy$default(TaxFilingData taxFilingData, List list, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = taxFilingData.taxYears;
        }
        if ((i & 2) != 0) {
            str = taxFilingData.taxAuthorityUrl;
        }
        return taxFilingData.copy(list, str);
    }

    @NotNull
    public final List<StatementPeriod> component1() {
        return this.taxYears;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaxAuthorityUrl() {
        return this.taxAuthorityUrl;
    }

    @NotNull
    public final TaxFilingData copy(@NotNull List<StatementPeriod> taxYears, @NotNull String taxAuthorityUrl) {
        Intrinsics.checkNotNullParameter(taxYears, "taxYears");
        Intrinsics.checkNotNullParameter(taxAuthorityUrl, "taxAuthorityUrl");
        return new TaxFilingData(taxYears, taxAuthorityUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxFilingData)) {
            return false;
        }
        TaxFilingData taxFilingData = (TaxFilingData) other;
        return Intrinsics.f(this.taxYears, taxFilingData.taxYears) && Intrinsics.f(this.taxAuthorityUrl, taxFilingData.taxAuthorityUrl);
    }

    @NotNull
    public final String getTaxAuthorityUrl() {
        return this.taxAuthorityUrl;
    }

    @NotNull
    public final List<StatementPeriod> getTaxYears() {
        return this.taxYears;
    }

    public int hashCode() {
        return this.taxAuthorityUrl.hashCode() + (this.taxYears.hashCode() * 31);
    }
}
