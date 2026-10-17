package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAutoInvestDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "strategy", "", "target", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAutoInvestTargetDto;", "parentTransactionId", "<init>", "(Ljava/lang/String;Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAutoInvestTargetDto;Ljava/lang/String;)V", "getStrategy", "()Ljava/lang/String;", "getTarget", "()Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAutoInvestTargetDto;", "getParentTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionAutoInvestDto implements Serializable, TransactionExtra {

    @b("parentTransactionId")
    private final String parentTransactionId;

    @b("strategy")
    @NotNull
    private final String strategy;

    @b("target")
    @NotNull
    private final TransactionAutoInvestTargetDto target;

    public TransactionAutoInvestDto(@NotNull String strategy, @NotNull TransactionAutoInvestTargetDto target, String str) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(target, "target");
        this.strategy = strategy;
        this.target = target;
        this.parentTransactionId = str;
    }

    public static /* synthetic */ TransactionAutoInvestDto copy$default(TransactionAutoInvestDto transactionAutoInvestDto, String str, TransactionAutoInvestTargetDto transactionAutoInvestTargetDto, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionAutoInvestDto.strategy;
        }
        if ((i & 2) != 0) {
            transactionAutoInvestTargetDto = transactionAutoInvestDto.target;
        }
        if ((i & 4) != 0) {
            str2 = transactionAutoInvestDto.parentTransactionId;
        }
        return transactionAutoInvestDto.copy(str, transactionAutoInvestTargetDto, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStrategy() {
        return this.strategy;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TransactionAutoInvestTargetDto getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentTransactionId() {
        return this.parentTransactionId;
    }

    @NotNull
    public final TransactionAutoInvestDto copy(@NotNull String strategy, @NotNull TransactionAutoInvestTargetDto target, String parentTransactionId) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(target, "target");
        return new TransactionAutoInvestDto(strategy, target, parentTransactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionAutoInvestDto)) {
            return false;
        }
        TransactionAutoInvestDto transactionAutoInvestDto = (TransactionAutoInvestDto) other;
        return Intrinsics.f(this.strategy, transactionAutoInvestDto.strategy) && Intrinsics.f(this.target, transactionAutoInvestDto.target) && Intrinsics.f(this.parentTransactionId, transactionAutoInvestDto.parentTransactionId);
    }

    public final String getParentTransactionId() {
        return this.parentTransactionId;
    }

    @NotNull
    public final String getStrategy() {
        return this.strategy;
    }

    @NotNull
    public final TransactionAutoInvestTargetDto getTarget() {
        return this.target;
    }

    public int hashCode() {
        int iHashCode = (this.target.hashCode() + (this.strategy.hashCode() * 31)) * 31;
        String str = this.parentTransactionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ TransactionAutoInvestDto(String str, TransactionAutoInvestTargetDto transactionAutoInvestTargetDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, transactionAutoInvestTargetDto, (i & 4) != 0 ? null : str2);
    }
}
