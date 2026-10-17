package com.revolut.feature.credit.card.impl.network;

import fo4.a;
import fo4.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/network/CreditCardMsiService;", "", "", "limit", "", "Lfo4/c;", "getCreditCardMsiWidgetOffers", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfo4/a;", "getCreditCardMsiOffers", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardMsiService {
    @GET("/advertising/msi-shops")
    Object getCreditCardMsiOffers(@Query("limit") int i, @NotNull Continuation<? super List<a>> continuation);

    @GET("/advertising/msi-shops-widget")
    Object getCreditCardMsiWidgetOffers(@Query("limit") int i, @NotNull Continuation<? super List<c>> continuation);
}
