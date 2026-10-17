package com.revolut.feature.statements.api.models;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/statements/api/models/ProductItemStatementPeriod;", "", "itemId", "", "from", "Ljava/time/LocalDate;", "to", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getItemId", "()Ljava/lang/String;", "getFrom", "()Ljava/time/LocalDate;", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductItemStatementPeriod {
    private final LocalDate from;

    @NotNull
    private final String itemId;
    private final LocalDate to;

    public ProductItemStatementPeriod(@NotNull String itemId, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.itemId = itemId;
        this.from = localDate;
        this.to = localDate2;
    }

    public static /* synthetic */ ProductItemStatementPeriod copy$default(ProductItemStatementPeriod productItemStatementPeriod, String str, LocalDate localDate, LocalDate localDate2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = productItemStatementPeriod.itemId;
        }
        if ((i & 2) != 0) {
            localDate = productItemStatementPeriod.from;
        }
        if ((i & 4) != 0) {
            localDate2 = productItemStatementPeriod.to;
        }
        return productItemStatementPeriod.copy(str, localDate, localDate2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocalDate getTo() {
        return this.to;
    }

    @NotNull
    public final ProductItemStatementPeriod copy(@NotNull String itemId, LocalDate from, LocalDate to6) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return new ProductItemStatementPeriod(itemId, from, to6);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductItemStatementPeriod)) {
            return false;
        }
        ProductItemStatementPeriod productItemStatementPeriod = (ProductItemStatementPeriod) other;
        return Intrinsics.f(this.itemId, productItemStatementPeriod.itemId) && Intrinsics.f(this.from, productItemStatementPeriod.from) && Intrinsics.f(this.to, productItemStatementPeriod.to);
    }

    public final LocalDate getFrom() {
        return this.from;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final LocalDate getTo() {
        return this.to;
    }

    public int hashCode() {
        int iHashCode = this.itemId.hashCode() * 31;
        LocalDate localDate = this.from;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.to;
        return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
