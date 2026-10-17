package com.revolut.feature.card_reader.tips.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import uz5.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_reader/tips/impl/data/network/CardReaderTipsService;", "", "Luz5/a;", "body", "Lretrofit2/Response;", "", "updateTipsSettings", "(Luz5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTipsSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_revpro_card_reader_tips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardReaderTipsService {
    @GET("acquiring/merchant/tip-settings")
    Object getTipsSettings(@NotNull Continuation<? super a> continuation);

    @PUT("acquiring/merchant/tip-settings")
    Object updateTipsSettings(@Body @NotNull a aVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
