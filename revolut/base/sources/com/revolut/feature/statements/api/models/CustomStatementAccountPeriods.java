package com.revolut.feature.statements.api.models;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomStatementAccountPeriods;", "", "productType", "", "startDate", "Ljava/time/LocalDate;", "endDate", "elements", "", "Lcom/revolut/feature/statements/api/models/CustomStatementElementPeriod;", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)V", "getProductType", "()Ljava/lang/String;", "getStartDate", "()Ljava/time/LocalDate;", "getEndDate", "getElements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomStatementAccountPeriods {

    @NotNull
    private final List<CustomStatementElementPeriod> elements;
    private final LocalDate endDate;

    @NotNull
    private final String productType;

    @NotNull
    private final LocalDate startDate;

    public CustomStatementAccountPeriods(@NotNull String productType, @NotNull LocalDate startDate, LocalDate localDate, @NotNull List<CustomStatementElementPeriod> elements) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.productType = productType;
        this.startDate = startDate;
        this.endDate = localDate;
        this.elements = elements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomStatementAccountPeriods copy$default(CustomStatementAccountPeriods customStatementAccountPeriods, String str, LocalDate localDate, LocalDate localDate2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = customStatementAccountPeriods.productType;
        }
        if ((i & 2) != 0) {
            localDate = customStatementAccountPeriods.startDate;
        }
        if ((i & 4) != 0) {
            localDate2 = customStatementAccountPeriods.endDate;
        }
        if ((i & 8) != 0) {
            list = customStatementAccountPeriods.elements;
        }
        return customStatementAccountPeriods.copy(str, localDate, localDate2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final List<CustomStatementElementPeriod> component4() {
        return this.elements;
    }

    @NotNull
    public final CustomStatementAccountPeriods copy(@NotNull String productType, @NotNull LocalDate startDate, LocalDate endDate, @NotNull List<CustomStatementElementPeriod> elements) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CustomStatementAccountPeriods(productType, startDate, endDate, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomStatementAccountPeriods)) {
            return false;
        }
        CustomStatementAccountPeriods customStatementAccountPeriods = (CustomStatementAccountPeriods) other;
        return Intrinsics.f(this.productType, customStatementAccountPeriods.productType) && Intrinsics.f(this.startDate, customStatementAccountPeriods.startDate) && Intrinsics.f(this.endDate, customStatementAccountPeriods.endDate) && Intrinsics.f(this.elements, customStatementAccountPeriods.elements);
    }

    @NotNull
    public final List<CustomStatementElementPeriod> getElements() {
        return this.elements;
    }

    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int iA = y.a(this.productType.hashCode() * 31, 31, this.startDate);
        LocalDate localDate = this.endDate;
        return this.elements.hashCode() + ((iA + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
