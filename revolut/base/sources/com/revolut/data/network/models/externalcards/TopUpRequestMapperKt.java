package com.revolut.data.network.models.externalcards;

import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.topup.TopUpContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt61/k;", "Lcom/revolut/data/network/models/externalcards/TopUpRequestDto;", "toDto", "(Lt61/k;)Lcom/revolut/data/network/models/externalcards/TopUpRequestDto;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TopUpRequestMapperKt {
    @NotNull
    public static final TopUpRequestDto toDto(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String str = kVar.f268169a;
        long j2 = kVar.f268170b;
        String str2 = kVar.f268171c;
        String strName = kVar.d.name();
        TopUpContext topUpContext = kVar.e;
        return new TopUpRequestDto(str, j2, str2, strName, TopUpContextMapperKt.toWalletId(topUpContext), TopUpContextMapperKt.toDto(topUpContext));
    }
}
