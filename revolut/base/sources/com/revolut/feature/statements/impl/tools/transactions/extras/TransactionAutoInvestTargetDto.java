package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAutoInvestTargetDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionAutoInvestTargetDto implements Serializable, TransactionExtra {

    @b("id")
    @NotNull
    private final String id;

    public TransactionAutoInvestTargetDto(@NotNull String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
    }

    public static /* synthetic */ TransactionAutoInvestTargetDto copy$default(TransactionAutoInvestTargetDto transactionAutoInvestTargetDto, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionAutoInvestTargetDto.id;
        }
        return transactionAutoInvestTargetDto.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final TransactionAutoInvestTargetDto copy(@NotNull String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new TransactionAutoInvestTargetDto(id10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionAutoInvestTargetDto) && Intrinsics.f(this.id, ((TransactionAutoInvestTargetDto) other).id);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
