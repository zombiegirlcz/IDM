package com.revolut.data.network.models.topup;

import j71.b;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mo3.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/topup/McyBookTransferResultDto;", "Lj71/b;", "toDomain", "(Lcom/revolut/data/network/models/topup/McyBookTransferResultDto;)Lj71/b;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BookTransferResultDtoMappingKt {
    @NotNull
    public static final b toDomain(@NotNull McyBookTransferResultDto mcyBookTransferResultDto) {
        Intrinsics.checkNotNullParameter(mcyBookTransferResultDto, "<this>");
        String transactionId = mcyBookTransferResultDto.getTransactionId();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(mcyBookTransferResultDto.getExpiryTimeMillis());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new b(transactionId, instantOfEpochMilli, a.o(mcyBookTransferResultDto.getExchangedAmountWithCharges()));
    }
}
