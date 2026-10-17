package com.revolut.data.network.models.checkout.mapper;

import com.revolut.data.network.models.checkout.PaymentMethodResponseDto;
import cue.a;
import cue.c;
import cue.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto;", "", "walletId", "Lcue/d;", "toDomain", "(Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto;Ljava/lang/String;)Lcue/d;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PaymentMethodResponseDtoMapperKt {
    @NotNull
    public static final d toDomain(@NotNull PaymentMethodResponseDto paymentMethodResponseDto, String str) {
        Intrinsics.checkNotNullParameter(paymentMethodResponseDto, "<this>");
        String paymentId = paymentMethodResponseDto.getPaymentId();
        String externalPaymentId = paymentMethodResponseDto.getExternalPaymentId();
        String paymentUrl = paymentMethodResponseDto.getPaymentUrl();
        PaymentMethodResponseDto.RedirectUrls redirects = paymentMethodResponseDto.getRedirects();
        a aVar = null;
        c cVar = redirects != null ? new c(redirects.getSuccess(), redirects.getError(), redirects.getDecline(), redirects.getHold()) : null;
        Map<String, String> data = paymentMethodResponseDto.getData();
        Map<String, String> keyMap = paymentMethodResponseDto.getKeyMap();
        String expiryYearFormat = paymentMethodResponseDto.getExpiryYearFormat();
        if (Intrinsics.f(expiryYearFormat, "SHORT")) {
            aVar = a.SHORT;
        } else if (Intrinsics.f(expiryYearFormat, "FULL")) {
            aVar = a.FULL;
        }
        return new d(paymentId, str, externalPaymentId, paymentUrl, null, cVar, data, keyMap, aVar);
    }
}
