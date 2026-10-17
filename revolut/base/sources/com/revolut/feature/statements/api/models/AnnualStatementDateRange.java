package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/statements/api/models/AnnualStatementDateRange;", "", "fromYear", "", "toYear", "<init>", "(II)V", "getFromYear", "()I", "getToYear", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnnualStatementDateRange {
    private final int fromYear;
    private final int toYear;

    public AnnualStatementDateRange(int i, int i2) {
        this.fromYear = i;
        this.toYear = i2;
    }

    public static /* synthetic */ AnnualStatementDateRange copy$default(AnnualStatementDateRange annualStatementDateRange, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = annualStatementDateRange.fromYear;
        }
        if ((i3 & 2) != 0) {
            i2 = annualStatementDateRange.toYear;
        }
        return annualStatementDateRange.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFromYear() {
        return this.fromYear;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getToYear() {
        return this.toYear;
    }

    @NotNull
    public final AnnualStatementDateRange copy(int fromYear, int toYear) {
        return new AnnualStatementDateRange(fromYear, toYear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnualStatementDateRange)) {
            return false;
        }
        AnnualStatementDateRange annualStatementDateRange = (AnnualStatementDateRange) other;
        return this.fromYear == annualStatementDateRange.fromYear && this.toYear == annualStatementDateRange.toYear;
    }

    public final int getFromYear() {
        return this.fromYear;
    }

    public final int getToYear() {
        return this.toYear;
    }

    public int hashCode() {
        return Integer.hashCode(this.toYear) + (Integer.hashCode(this.fromYear) * 31);
    }
}
