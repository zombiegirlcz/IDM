package com.revolut.data.network.models.recurringpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import o9l.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/ActivateCardMandateRequest;", "", "Lo9l/w;", "transaction", "", "walletId", "<init>", "(Lo9l/w;Ljava/lang/String;)V", "component1", "()Lo9l/w;", "component2", "()Ljava/lang/String;", "copy", "(Lo9l/w;Ljava/lang/String;)Lcom/revolut/data/network/models/recurringpayment/ActivateCardMandateRequest;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Lo9l/w;", "getTransaction", "Ljava/lang/String;", "getWalletId", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivateCardMandateRequest {

    @b("transaction")
    @NotNull
    private final w transaction;

    @b("walletId")
    private final String walletId;

    public ActivateCardMandateRequest(@NotNull w transaction, String str) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.transaction = transaction;
        this.walletId = str;
    }

    public static /* synthetic */ ActivateCardMandateRequest copy$default(ActivateCardMandateRequest activateCardMandateRequest, w wVar, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            wVar = activateCardMandateRequest.transaction;
        }
        if ((i & 2) != 0) {
            str = activateCardMandateRequest.walletId;
        }
        return activateCardMandateRequest.copy(wVar, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final w getTransaction() {
        return this.transaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    @NotNull
    public final ActivateCardMandateRequest copy(@NotNull w transaction, String walletId) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new ActivateCardMandateRequest(transaction, walletId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateCardMandateRequest)) {
            return false;
        }
        ActivateCardMandateRequest activateCardMandateRequest = (ActivateCardMandateRequest) other;
        return Intrinsics.f(this.transaction, activateCardMandateRequest.transaction) && Intrinsics.f(this.walletId, activateCardMandateRequest.walletId);
    }

    @NotNull
    public final w getTransaction() {
        return this.transaction;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iHashCode = this.transaction.hashCode() * 31;
        String str = this.walletId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
