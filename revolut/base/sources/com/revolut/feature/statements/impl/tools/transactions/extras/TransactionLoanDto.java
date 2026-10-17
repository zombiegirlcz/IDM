package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionLoanDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "id", "", "apr", "", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "getId", "()Ljava/lang/String;", "getApr", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionLoanDto;", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionLoanDto implements Serializable, TransactionExtra {

    @b("apr")
    private final Double apr;

    @b("id")
    @NotNull
    private final String id;

    public TransactionLoanDto(@NotNull String id10, Double d) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.apr = d;
    }

    public static /* synthetic */ TransactionLoanDto copy$default(TransactionLoanDto transactionLoanDto, String str, Double d, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionLoanDto.id;
        }
        if ((i & 2) != 0) {
            d = transactionLoanDto.apr;
        }
        return transactionLoanDto.copy(str, d);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    @NotNull
    public final TransactionLoanDto copy(@NotNull String id10, Double apr) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new TransactionLoanDto(id10, apr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionLoanDto)) {
            return false;
        }
        TransactionLoanDto transactionLoanDto = (TransactionLoanDto) other;
        return Intrinsics.f(this.id, transactionLoanDto.id) && Intrinsics.f(this.apr, transactionLoanDto.apr);
    }

    public final Double getApr() {
        return this.apr;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Double d = this.apr;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
