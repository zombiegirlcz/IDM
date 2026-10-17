package com.revolut.feature.statements.api.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomStatementPeriods;", "", "taxPeriod", "Lcom/revolut/feature/statements/api/models/TaxPeriod;", "accounts", "", "Lcom/revolut/feature/statements/api/models/CustomStatementAccountPeriods;", "<init>", "(Lcom/revolut/feature/statements/api/models/TaxPeriod;Ljava/util/List;)V", "getTaxPeriod", "()Lcom/revolut/feature/statements/api/models/TaxPeriod;", "getAccounts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomStatementPeriods {

    @NotNull
    private final List<CustomStatementAccountPeriods> accounts;

    @NotNull
    private final TaxPeriod taxPeriod;

    public CustomStatementPeriods(@NotNull TaxPeriod taxPeriod, @NotNull List<CustomStatementAccountPeriods> accounts) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.taxPeriod = taxPeriod;
        this.accounts = accounts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomStatementPeriods copy$default(CustomStatementPeriods customStatementPeriods, TaxPeriod taxPeriod, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            taxPeriod = customStatementPeriods.taxPeriod;
        }
        if ((i & 2) != 0) {
            list = customStatementPeriods.accounts;
        }
        return customStatementPeriods.copy(taxPeriod, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TaxPeriod getTaxPeriod() {
        return this.taxPeriod;
    }

    @NotNull
    public final List<CustomStatementAccountPeriods> component2() {
        return this.accounts;
    }

    @NotNull
    public final CustomStatementPeriods copy(@NotNull TaxPeriod taxPeriod, @NotNull List<CustomStatementAccountPeriods> accounts) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        return new CustomStatementPeriods(taxPeriod, accounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomStatementPeriods)) {
            return false;
        }
        CustomStatementPeriods customStatementPeriods = (CustomStatementPeriods) other;
        return Intrinsics.f(this.taxPeriod, customStatementPeriods.taxPeriod) && Intrinsics.f(this.accounts, customStatementPeriods.accounts);
    }

    @NotNull
    public final List<CustomStatementAccountPeriods> getAccounts() {
        return this.accounts;
    }

    @NotNull
    public final TaxPeriod getTaxPeriod() {
        return this.taxPeriod;
    }

    public int hashCode() {
        return this.accounts.hashCode() + (this.taxPeriod.hashCode() * 31);
    }
}
