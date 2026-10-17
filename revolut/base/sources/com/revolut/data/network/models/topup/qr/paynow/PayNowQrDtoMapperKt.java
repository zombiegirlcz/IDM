package com.revolut.data.network.models.topup.qr.paynow;

import i71.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/topup/qr/paynow/PayNowTopUpQrDto;", "Li71/a;", "toDomain", "(Lcom/revolut/data/network/models/topup/qr/paynow/PayNowTopUpQrDto;)Li71/a;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PayNowQrDtoMapperKt {
    @NotNull
    public static final a toDomain(@NotNull PayNowTopUpQrDto payNowTopUpQrDto) {
        Intrinsics.checkNotNullParameter(payNowTopUpQrDto, "<this>");
        return new a(payNowTopUpQrDto.getEncodedValue(), payNowTopUpQrDto.getReference(), payNowTopUpQrDto.getVpa(), payNowTopUpQrDto.getCompanyName());
    }
}
