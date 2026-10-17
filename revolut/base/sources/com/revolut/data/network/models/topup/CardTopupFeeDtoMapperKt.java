package com.revolut.data.network.models.topup;

import dj0.d;
import e71.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import wi0.b;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/network/models/topup/CardTopupFeeDto;", "Le71/b;", "toDomain", "(Lcom/revolut/data/network/models/topup/CardTopupFeeDto;)Le71/b;", "Ldj0/d;", "parseFee", "(Lcom/revolut/data/network/models/topup/CardTopupFeeDto;)Ldj0/d;", "Le71/a;", "parseCrossProfileFee", "(Lcom/revolut/data/network/models/topup/CardTopupFeeDto;)Le71/a;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CardTopupFeeDtoMapperKt {
    public static final a parseCrossProfileFee(@NotNull CardTopupFeeDto cardTopupFeeDto) {
        Intrinsics.checkNotNullParameter(cardTopupFeeDto, "<this>");
        CrossProfileFeeDto crossProfileFeeDto = cardTopupFeeDto.getCrossProfileFeeDto();
        if (crossProfileFeeDto == null) {
            return null;
        }
        String title = crossProfileFeeDto.getTitle();
        String description = crossProfileFeeDto.getDescription();
        wi0.a aVar = b.Companion;
        String targetCountry = crossProfileFeeDto.getTargetCountry();
        aVar.getClass();
        return new a(title, description, wi0.a.a(targetCountry));
    }

    public static final d parseFee(@NotNull CardTopupFeeDto cardTopupFeeDto) {
        Intrinsics.checkNotNullParameter(cardTopupFeeDto, "<this>");
        if (cardTopupFeeDto.getFee() != null) {
            return mo3.a.o(cardTopupFeeDto.getFee());
        }
        if (cardTopupFeeDto.getAmount() == null || cardTopupFeeDto.getCurrency() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Fee couldn't be parsed from response (possible backend issue)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        long jLongValue = cardTopupFeeDto.getAmount().longValue();
        xi0.a aVar = xi0.b.Companion;
        String currency = cardTopupFeeDto.getCurrency();
        aVar.getClass();
        return new d(jLongValue, xi0.a.a(currency));
    }

    @NotNull
    public static final e71.b toDomain(@NotNull CardTopupFeeDto cardTopupFeeDto) {
        Intrinsics.checkNotNullParameter(cardTopupFeeDto, "<this>");
        return new e71.b(parseFee(cardTopupFeeDto), cardTopupFeeDto.getFeeMessage(), parseCrossProfileFee(cardTopupFeeDto));
    }
}
