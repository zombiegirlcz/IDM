package com.revolut.data.network.models.recurringpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/CardMandateUpdateLabelRequest;", "", "walletId", "", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWalletId", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardMandateUpdateLabelRequest {

    @b("label")
    @NotNull
    private final String label;

    @b("walletId")
    private final String walletId;

    public CardMandateUpdateLabelRequest(String str, @NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.walletId = str;
        this.label = label;
    }

    public static /* synthetic */ CardMandateUpdateLabelRequest copy$default(CardMandateUpdateLabelRequest cardMandateUpdateLabelRequest, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cardMandateUpdateLabelRequest.walletId;
        }
        if ((i & 2) != 0) {
            str2 = cardMandateUpdateLabelRequest.label;
        }
        return cardMandateUpdateLabelRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final CardMandateUpdateLabelRequest copy(String walletId, @NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new CardMandateUpdateLabelRequest(walletId, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardMandateUpdateLabelRequest)) {
            return false;
        }
        CardMandateUpdateLabelRequest cardMandateUpdateLabelRequest = (CardMandateUpdateLabelRequest) other;
        return Intrinsics.f(this.walletId, cardMandateUpdateLabelRequest.walletId) && Intrinsics.f(this.label, cardMandateUpdateLabelRequest.label);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        String str = this.walletId;
        return this.label.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
