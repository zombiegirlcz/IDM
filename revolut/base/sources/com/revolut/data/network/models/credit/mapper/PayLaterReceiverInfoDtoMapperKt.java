package com.revolut.data.network.models.credit.mapper;

import com.revolut.data.network.models.credit.PayLaterReceiverInfoDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tua.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/data/network/models/credit/PayLaterReceiverInfoDto;", "", "logoUrl", "", "feeAmount", "Ltua/d;", "toDomain", "(Lcom/revolut/data/network/models/credit/PayLaterReceiverInfoDto;Ljava/lang/String;J)Ltua/d;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PayLaterReceiverInfoDtoMapperKt {
    @NotNull
    public static final d toDomain(@NotNull PayLaterReceiverInfoDto payLaterReceiverInfoDto, String str, long j2) {
        Intrinsics.checkNotNullParameter(payLaterReceiverInfoDto, "<this>");
        return new d(payLaterReceiverInfoDto.getInstalmentState(), payLaterReceiverInfoDto.getFee(), payLaterReceiverInfoDto.getPlanId(), payLaterReceiverInfoDto.getInstalmentIndex(), payLaterReceiverInfoDto.getInstalmentCount(), payLaterReceiverInfoDto.getMerchantName(), payLaterReceiverInfoDto.getMerchantLogoName(), payLaterReceiverInfoDto.getMerchantCategory(), payLaterReceiverInfoDto.getRepaymentSource(), str, j2);
    }
}
