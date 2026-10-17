package com.revolut.feature.statements.api.models;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/statements/api/models/ProductStatementPeriod;", "", "type", "", "from", "Ljava/time/LocalDate;", "to", "itemPeriods", "", "Lcom/revolut/feature/statements/api/models/ProductItemStatementPeriod;", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getFrom", "()Ljava/time/LocalDate;", "getTo", "getItemPeriods", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductStatementPeriod {
    private final LocalDate from;
    private final List<ProductItemStatementPeriod> itemPeriods;
    private final LocalDate to;

    @NotNull
    private final String type;

    public ProductStatementPeriod(@NotNull String type, LocalDate localDate, LocalDate localDate2, List<ProductItemStatementPeriod> list) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.from = localDate;
        this.to = localDate2;
        this.itemPeriods = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductStatementPeriod copy$default(ProductStatementPeriod productStatementPeriod, String str, LocalDate localDate, LocalDate localDate2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = productStatementPeriod.type;
        }
        if ((i & 2) != 0) {
            localDate = productStatementPeriod.from;
        }
        if ((i & 4) != 0) {
            localDate2 = productStatementPeriod.to;
        }
        if ((i & 8) != 0) {
            list = productStatementPeriod.itemPeriods;
        }
        return productStatementPeriod.copy(str, localDate, localDate2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocalDate getTo() {
        return this.to;
    }

    public final List<ProductItemStatementPeriod> component4() {
        return this.itemPeriods;
    }

    @NotNull
    public final ProductStatementPeriod copy(@NotNull String type, LocalDate from, LocalDate to6, List<ProductItemStatementPeriod> itemPeriods) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ProductStatementPeriod(type, from, to6, itemPeriods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductStatementPeriod)) {
            return false;
        }
        ProductStatementPeriod productStatementPeriod = (ProductStatementPeriod) other;
        return Intrinsics.f(this.type, productStatementPeriod.type) && Intrinsics.f(this.from, productStatementPeriod.from) && Intrinsics.f(this.to, productStatementPeriod.to) && Intrinsics.f(this.itemPeriods, productStatementPeriod.itemPeriods);
    }

    public final LocalDate getFrom() {
        return this.from;
    }

    public final List<ProductItemStatementPeriod> getItemPeriods() {
        return this.itemPeriods;
    }

    public final LocalDate getTo() {
        return this.to;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        LocalDate localDate = this.from;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.to;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List<ProductItemStatementPeriod> list = this.itemPeriods;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
