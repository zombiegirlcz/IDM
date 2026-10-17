package com.revolut.data.network.models.topup;

import ip0.v7;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/revolut/data/network/models/topup/McyTransferReviewDto;", "", "Ljo3/a;", "targetAmount", "sourceAmount", "Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "rate", "fee", "La4l/b;", "taxes", "totalSourceAmount", "<init>", "(Ljo3/a;Ljo3/a;Lcom/revolut/data/network/models/topup/McyExchangeRateDto;Ljo3/a;La4l/b;Ljo3/a;)V", "component1", "()Ljo3/a;", "component2", "component3", "()Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "component4", "component5", "()La4l/b;", "component6", "copy", "(Ljo3/a;Ljo3/a;Lcom/revolut/data/network/models/topup/McyExchangeRateDto;Ljo3/a;La4l/b;Ljo3/a;)Lcom/revolut/data/network/models/topup/McyTransferReviewDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "getTargetAmount", "getSourceAmount", "Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "getRate", "getFee", "La4l/b;", "getTaxes", "getTotalSourceAmount", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McyTransferReviewDto {

    @b("fee")
    @NotNull
    private final a fee;

    @b("rate")
    @NotNull
    private final McyExchangeRateDto rate;

    @b("exchangedAmount")
    @NotNull
    private final a sourceAmount;

    @b("topupAmount")
    @NotNull
    private final a targetAmount;

    @b("taxes")
    private final a4l.b taxes;

    @b("exchangedAmountWithCharges")
    @NotNull
    private final a totalSourceAmount;

    public McyTransferReviewDto(@NotNull a targetAmount, @NotNull a sourceAmount, @NotNull McyExchangeRateDto rate, @NotNull a fee2, a4l.b bVar, @NotNull a totalSourceAmount) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(totalSourceAmount, "totalSourceAmount");
        this.targetAmount = targetAmount;
        this.sourceAmount = sourceAmount;
        this.rate = rate;
        this.fee = fee2;
        this.taxes = bVar;
        this.totalSourceAmount = totalSourceAmount;
    }

    public static /* synthetic */ McyTransferReviewDto copy$default(McyTransferReviewDto mcyTransferReviewDto, a aVar, a aVar2, McyExchangeRateDto mcyExchangeRateDto, a aVar3, a4l.b bVar, a aVar4, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = mcyTransferReviewDto.targetAmount;
        }
        if ((i & 2) != 0) {
            aVar2 = mcyTransferReviewDto.sourceAmount;
        }
        if ((i & 4) != 0) {
            mcyExchangeRateDto = mcyTransferReviewDto.rate;
        }
        if ((i & 8) != 0) {
            aVar3 = mcyTransferReviewDto.fee;
        }
        if ((i & 16) != 0) {
            bVar = mcyTransferReviewDto.taxes;
        }
        if ((i & 32) != 0) {
            aVar4 = mcyTransferReviewDto.totalSourceAmount;
        }
        a4l.b bVar2 = bVar;
        a aVar5 = aVar4;
        return mcyTransferReviewDto.copy(aVar, aVar2, mcyExchangeRateDto, aVar3, bVar2, aVar5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getTargetAmount() {
        return this.targetAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final a getSourceAmount() {
        return this.sourceAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final McyExchangeRateDto getRate() {
        return this.rate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final a4l.b getTaxes() {
        return this.taxes;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final a getTotalSourceAmount() {
        return this.totalSourceAmount;
    }

    @NotNull
    public final McyTransferReviewDto copy(@NotNull a targetAmount, @NotNull a sourceAmount, @NotNull McyExchangeRateDto rate, @NotNull a fee2, a4l.b taxes, @NotNull a totalSourceAmount) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(totalSourceAmount, "totalSourceAmount");
        return new McyTransferReviewDto(targetAmount, sourceAmount, rate, fee2, taxes, totalSourceAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McyTransferReviewDto)) {
            return false;
        }
        McyTransferReviewDto mcyTransferReviewDto = (McyTransferReviewDto) other;
        return Intrinsics.f(this.targetAmount, mcyTransferReviewDto.targetAmount) && Intrinsics.f(this.sourceAmount, mcyTransferReviewDto.sourceAmount) && Intrinsics.f(this.rate, mcyTransferReviewDto.rate) && Intrinsics.f(this.fee, mcyTransferReviewDto.fee) && Intrinsics.f(this.taxes, mcyTransferReviewDto.taxes) && Intrinsics.f(this.totalSourceAmount, mcyTransferReviewDto.totalSourceAmount);
    }

    @NotNull
    public final a getFee() {
        return this.fee;
    }

    @NotNull
    public final McyExchangeRateDto getRate() {
        return this.rate;
    }

    @NotNull
    public final a getSourceAmount() {
        return this.sourceAmount;
    }

    @NotNull
    public final a getTargetAmount() {
        return this.targetAmount;
    }

    public final a4l.b getTaxes() {
        return this.taxes;
    }

    @NotNull
    public final a getTotalSourceAmount() {
        return this.totalSourceAmount;
    }

    public int hashCode() {
        int iJ = v7.j(this.fee, (this.rate.hashCode() + v7.j(this.sourceAmount, this.targetAmount.hashCode() * 31, 31)) * 31, 31);
        a4l.b bVar = this.taxes;
        return this.totalSourceAmount.hashCode() + ((iJ + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
