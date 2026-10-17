package com.revolut.data.network.models.threedstransactions;

import ip0.v7;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/revolut/data/network/models/threedstransactions/InsufficientFundsDto;", "", "Ljo3/a;", "topupAmount", "currentBalance", "", "pocketId", "<init>", "(Ljo3/a;Ljo3/a;Ljava/lang/String;)V", "component1", "()Ljo3/a;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljo3/a;Ljo3/a;Ljava/lang/String;)Lcom/revolut/data/network/models/threedstransactions/InsufficientFundsDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/a;", "getTopupAmount", "getCurrentBalance", "Ljava/lang/String;", "getPocketId", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsufficientFundsDto {

    @b("currentBalance")
    @NotNull
    private final a currentBalance;

    @b("pocketId")
    @NotNull
    private final String pocketId;

    @b("topupAmount")
    @NotNull
    private final a topupAmount;

    public InsufficientFundsDto(@NotNull a topupAmount, @NotNull a currentBalance, @NotNull String pocketId) {
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        Intrinsics.checkNotNullParameter(currentBalance, "currentBalance");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.topupAmount = topupAmount;
        this.currentBalance = currentBalance;
        this.pocketId = pocketId;
    }

    public static /* synthetic */ InsufficientFundsDto copy$default(InsufficientFundsDto insufficientFundsDto, a aVar, a aVar2, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = insufficientFundsDto.topupAmount;
        }
        if ((i & 2) != 0) {
            aVar2 = insufficientFundsDto.currentBalance;
        }
        if ((i & 4) != 0) {
            str = insufficientFundsDto.pocketId;
        }
        return insufficientFundsDto.copy(aVar, aVar2, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getTopupAmount() {
        return this.topupAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final a getCurrentBalance() {
        return this.currentBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    @NotNull
    public final InsufficientFundsDto copy(@NotNull a topupAmount, @NotNull a currentBalance, @NotNull String pocketId) {
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        Intrinsics.checkNotNullParameter(currentBalance, "currentBalance");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        return new InsufficientFundsDto(topupAmount, currentBalance, pocketId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsufficientFundsDto)) {
            return false;
        }
        InsufficientFundsDto insufficientFundsDto = (InsufficientFundsDto) other;
        return Intrinsics.f(this.topupAmount, insufficientFundsDto.topupAmount) && Intrinsics.f(this.currentBalance, insufficientFundsDto.currentBalance) && Intrinsics.f(this.pocketId, insufficientFundsDto.pocketId);
    }

    @NotNull
    public final a getCurrentBalance() {
        return this.currentBalance;
    }

    @NotNull
    public final String getPocketId() {
        return this.pocketId;
    }

    @NotNull
    public final a getTopupAmount() {
        return this.topupAmount;
    }

    public int hashCode() {
        return this.pocketId.hashCode() + v7.j(this.currentBalance, this.topupAmount.hashCode() * 31, 31);
    }
}
