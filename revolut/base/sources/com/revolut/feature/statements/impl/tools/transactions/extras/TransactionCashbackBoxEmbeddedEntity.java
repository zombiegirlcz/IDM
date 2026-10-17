package com.revolut.feature.statements.impl.tools.transactions.extras;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCashbackBoxEmbeddedEntity;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "cashbackBoxId", "", "<init>", "(Ljava/lang/String;)V", "getCashbackBoxId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCashbackBoxEmbeddedEntity implements TransactionExtra {

    @b("cashbackBoxId")
    @NotNull
    private final String cashbackBoxId;

    public TransactionCashbackBoxEmbeddedEntity(@NotNull String cashbackBoxId) {
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        this.cashbackBoxId = cashbackBoxId;
    }

    public static /* synthetic */ TransactionCashbackBoxEmbeddedEntity copy$default(TransactionCashbackBoxEmbeddedEntity transactionCashbackBoxEmbeddedEntity, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionCashbackBoxEmbeddedEntity.cashbackBoxId;
        }
        return transactionCashbackBoxEmbeddedEntity.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCashbackBoxId() {
        return this.cashbackBoxId;
    }

    @NotNull
    public final TransactionCashbackBoxEmbeddedEntity copy(@NotNull String cashbackBoxId) {
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        return new TransactionCashbackBoxEmbeddedEntity(cashbackBoxId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionCashbackBoxEmbeddedEntity) && Intrinsics.f(this.cashbackBoxId, ((TransactionCashbackBoxEmbeddedEntity) other).cashbackBoxId);
    }

    @NotNull
    public final String getCashbackBoxId() {
        return this.cashbackBoxId;
    }

    public int hashCode() {
        return this.cashbackBoxId.hashCode();
    }
}
