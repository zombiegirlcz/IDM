package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCounterpartDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "amount", "", "currency", "", "account", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAccountDto;", "<init>", "(JLjava/lang/String;Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAccountDto;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "getAccount", "()Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAccountDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCounterpartDto implements Serializable, TransactionExtra {

    @b("account")
    private final TransactionAccountDto account;

    @b("amount")
    private final long amount;

    @b("currency")
    private final String currency;

    public TransactionCounterpartDto(long j2, String str, TransactionAccountDto transactionAccountDto) {
        this.amount = j2;
        this.currency = str;
        this.account = transactionAccountDto;
    }

    public static /* synthetic */ TransactionCounterpartDto copy$default(TransactionCounterpartDto transactionCounterpartDto, long j2, String str, TransactionAccountDto transactionAccountDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = transactionCounterpartDto.amount;
        }
        if ((i & 2) != 0) {
            str = transactionCounterpartDto.currency;
        }
        if ((i & 4) != 0) {
            transactionAccountDto = transactionCounterpartDto.account;
        }
        return transactionCounterpartDto.copy(j2, str, transactionAccountDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TransactionAccountDto getAccount() {
        return this.account;
    }

    @NotNull
    public final TransactionCounterpartDto copy(long amount, String currency, TransactionAccountDto account) {
        return new TransactionCounterpartDto(amount, currency, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionCounterpartDto)) {
            return false;
        }
        TransactionCounterpartDto transactionCounterpartDto = (TransactionCounterpartDto) other;
        return this.amount == transactionCounterpartDto.amount && Intrinsics.f(this.currency, transactionCounterpartDto.currency) && Intrinsics.f(this.account, transactionCounterpartDto.account);
    }

    public final TransactionAccountDto getAccount() {
        return this.account;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.amount) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TransactionAccountDto transactionAccountDto = this.account;
        return iHashCode2 + (transactionAccountDto != null ? transactionAccountDto.hashCode() : 0);
    }

    public /* synthetic */ TransactionCounterpartDto(long j2, String str, TransactionAccountDto transactionAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : transactionAccountDto);
    }
}
