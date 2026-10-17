package com.revolut.data.network.models.topup;

import a0.d;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/revolut/data/network/models/topup/McyBookTransferResultDto;", "", "", "transactionId", "", "expiryTimeMillis", "Ljo3/a;", "exchangedAmountWithCharges", "<init>", "(Ljava/lang/String;JLjo3/a;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljo3/a;", "copy", "(Ljava/lang/String;JLjo3/a;)Lcom/revolut/data/network/models/topup/McyBookTransferResultDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getTransactionId", "J", "getExpiryTimeMillis", "Ljo3/a;", "getExchangedAmountWithCharges", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McyBookTransferResultDto {

    @b("exchangedAmountWithCharges")
    @NotNull
    private final a exchangedAmountWithCharges;

    @b("fundsTransferExpireTime")
    private final long expiryTimeMillis;

    @b("transactionId")
    @NotNull
    private final String transactionId;

    public McyBookTransferResultDto(@NotNull String transactionId, long j2, @NotNull a exchangedAmountWithCharges) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(exchangedAmountWithCharges, "exchangedAmountWithCharges");
        this.transactionId = transactionId;
        this.expiryTimeMillis = j2;
        this.exchangedAmountWithCharges = exchangedAmountWithCharges;
    }

    public static /* synthetic */ McyBookTransferResultDto copy$default(McyBookTransferResultDto mcyBookTransferResultDto, String str, long j2, a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mcyBookTransferResultDto.transactionId;
        }
        if ((i & 2) != 0) {
            j2 = mcyBookTransferResultDto.expiryTimeMillis;
        }
        if ((i & 4) != 0) {
            aVar = mcyBookTransferResultDto.exchangedAmountWithCharges;
        }
        return mcyBookTransferResultDto.copy(str, j2, aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpiryTimeMillis() {
        return this.expiryTimeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final a getExchangedAmountWithCharges() {
        return this.exchangedAmountWithCharges;
    }

    @NotNull
    public final McyBookTransferResultDto copy(@NotNull String transactionId, long expiryTimeMillis, @NotNull a exchangedAmountWithCharges) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(exchangedAmountWithCharges, "exchangedAmountWithCharges");
        return new McyBookTransferResultDto(transactionId, expiryTimeMillis, exchangedAmountWithCharges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McyBookTransferResultDto)) {
            return false;
        }
        McyBookTransferResultDto mcyBookTransferResultDto = (McyBookTransferResultDto) other;
        return Intrinsics.f(this.transactionId, mcyBookTransferResultDto.transactionId) && this.expiryTimeMillis == mcyBookTransferResultDto.expiryTimeMillis && Intrinsics.f(this.exchangedAmountWithCharges, mcyBookTransferResultDto.exchangedAmountWithCharges);
    }

    @NotNull
    public final a getExchangedAmountWithCharges() {
        return this.exchangedAmountWithCharges;
    }

    public final long getExpiryTimeMillis() {
        return this.expiryTimeMillis;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return this.exchangedAmountWithCharges.hashCode() + d.c(this.transactionId.hashCode() * 31, 31, this.expiryTimeMillis);
    }
}
