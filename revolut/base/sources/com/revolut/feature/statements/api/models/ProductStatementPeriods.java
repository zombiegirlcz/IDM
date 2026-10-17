package com.revolut.feature.statements.api.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/revolut/feature/statements/api/models/ProductStatementPeriods;", "", "taxPeriod", "Lcom/revolut/feature/statements/api/models/TaxPeriod;", "productPeriods", "", "Lcom/revolut/feature/statements/api/models/ProductStatementPeriod;", "<init>", "(Lcom/revolut/feature/statements/api/models/TaxPeriod;Ljava/util/List;)V", "getTaxPeriod", "()Lcom/revolut/feature/statements/api/models/TaxPeriod;", "getProductPeriods", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductStatementPeriods {

    @NotNull
    private final List<ProductStatementPeriod> productPeriods;

    @NotNull
    private final TaxPeriod taxPeriod;

    public ProductStatementPeriods(@NotNull TaxPeriod taxPeriod, @NotNull List<ProductStatementPeriod> productPeriods) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        Intrinsics.checkNotNullParameter(productPeriods, "productPeriods");
        this.taxPeriod = taxPeriod;
        this.productPeriods = productPeriods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductStatementPeriods copy$default(ProductStatementPeriods productStatementPeriods, TaxPeriod taxPeriod, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            taxPeriod = productStatementPeriods.taxPeriod;
        }
        if ((i & 2) != 0) {
            list = productStatementPeriods.productPeriods;
        }
        return productStatementPeriods.copy(taxPeriod, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TaxPeriod getTaxPeriod() {
        return this.taxPeriod;
    }

    @NotNull
    public final List<ProductStatementPeriod> component2() {
        return this.productPeriods;
    }

    @NotNull
    public final ProductStatementPeriods copy(@NotNull TaxPeriod taxPeriod, @NotNull List<ProductStatementPeriod> productPeriods) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        Intrinsics.checkNotNullParameter(productPeriods, "productPeriods");
        return new ProductStatementPeriods(taxPeriod, productPeriods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductStatementPeriods)) {
            return false;
        }
        ProductStatementPeriods productStatementPeriods = (ProductStatementPeriods) other;
        return Intrinsics.f(this.taxPeriod, productStatementPeriods.taxPeriod) && Intrinsics.f(this.productPeriods, productStatementPeriods.productPeriods);
    }

    @NotNull
    public final List<ProductStatementPeriod> getProductPeriods() {
        return this.productPeriods;
    }

    @NotNull
    public final TaxPeriod getTaxPeriod() {
        return this.taxPeriod;
    }

    public int hashCode() {
        return this.productPeriods.hashCode() + (this.taxPeriod.hashCode() * 31);
    }
}
