package com.revolut.data.network.models.recurringpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/ActivateManualCardMandateRequest;", "", "transactionId", "", "walletId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getWalletId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivateManualCardMandateRequest {

    @b("transactionId")
    @NotNull
    private final String transactionId;

    @b("walletId")
    private final String walletId;

    public ActivateManualCardMandateRequest(@NotNull String transactionId, String str) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.transactionId = transactionId;
        this.walletId = str;
    }

    public static /* synthetic */ ActivateManualCardMandateRequest copy$default(ActivateManualCardMandateRequest activateManualCardMandateRequest, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = activateManualCardMandateRequest.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = activateManualCardMandateRequest.walletId;
        }
        return activateManualCardMandateRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    @NotNull
    public final ActivateManualCardMandateRequest copy(@NotNull String transactionId, String walletId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new ActivateManualCardMandateRequest(transactionId, walletId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateManualCardMandateRequest)) {
            return false;
        }
        ActivateManualCardMandateRequest activateManualCardMandateRequest = (ActivateManualCardMandateRequest) other;
        return Intrinsics.f(this.transactionId, activateManualCardMandateRequest.transactionId) && Intrinsics.f(this.walletId, activateManualCardMandateRequest.walletId);
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iHashCode = this.transactionId.hashCode() * 31;
        String str = this.walletId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
