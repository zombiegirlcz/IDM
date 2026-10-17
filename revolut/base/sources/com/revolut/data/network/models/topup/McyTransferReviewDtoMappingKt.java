package com.revolut.data.network.models.topup;

import a4l.b;
import dj0.d;
import do3.q;
import j71.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mo3.a;
import org.jetbrains.annotations.NotNull;
import tof.l1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/data/network/models/topup/McyTransferReviewDto;", "Lj71/c;", "toDomain", "(Lcom/revolut/data/network/models/topup/McyTransferReviewDto;)Lj71/c;", "Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "Ltof/l1;", "(Lcom/revolut/data/network/models/topup/McyExchangeRateDto;)Ltof/l1;", "toDto", "(Ltof/l1;)Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class McyTransferReviewDtoMappingKt {
    @NotNull
    public static final c toDomain(@NotNull McyTransferReviewDto mcyTransferReviewDto) {
        Intrinsics.checkNotNullParameter(mcyTransferReviewDto, "<this>");
        d dVarO = a.o(mcyTransferReviewDto.getTargetAmount());
        d dVarO2 = a.o(mcyTransferReviewDto.getSourceAmount());
        l1 domain = toDomain(mcyTransferReviewDto.getRate());
        d dVarO3 = a.o(mcyTransferReviewDto.getFee());
        b taxes = mcyTransferReviewDto.getTaxes();
        return new c(dVarO, dVarO2, domain, dVarO3, taxes != null ? q.E(taxes) : null, a.o(mcyTransferReviewDto.getTotalSourceAmount()));
    }

    @NotNull
    public static final McyExchangeRateDto toDto(@NotNull l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        return new McyExchangeRateDto(String.valueOf(l1Var.f272904a), String.valueOf(l1Var.f272905b), cp5.d.d(new Pair(l1Var.f272906c, l1Var.d)), l1Var.e);
    }

    @NotNull
    public static final l1 toDomain(@NotNull McyExchangeRateDto mcyExchangeRateDto) {
        Intrinsics.checkNotNullParameter(mcyExchangeRateDto, "<this>");
        Pair pairH = cp5.d.H(mcyExchangeRateDto.getPair());
        return new l1(Double.parseDouble(mcyExchangeRateDto.getAsk()), Double.parseDouble(mcyExchangeRateDto.getBid()), (xi0.b) pairH.f186385a, (xi0.b) pairH.f186386b, mcyExchangeRateDto.getTimestamp());
    }
}
