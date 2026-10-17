package com.revolut.data.network.models.credit.mapper;

import com.revolut.data.network.models.credit.LoanReceiverInfoDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tua.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/credit/LoanReceiverInfoDto;", "Ltua/c;", "toDomain", "(Lcom/revolut/data/network/models/credit/LoanReceiverInfoDto;)Ltua/c;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LoanPaymentReceiverInfoDtoMapperKt {
    @NotNull
    public static final c toDomain(@NotNull LoanReceiverInfoDto loanReceiverInfoDto) {
        Intrinsics.checkNotNullParameter(loanReceiverInfoDto, "<this>");
        return new c(loanReceiverInfoDto.getLoanId(), loanReceiverInfoDto.getRepaymentId(), loanReceiverInfoDto.getLoanName());
    }
}
