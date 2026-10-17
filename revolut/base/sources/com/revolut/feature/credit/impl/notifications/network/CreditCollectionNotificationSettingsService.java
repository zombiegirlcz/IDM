package com.revolut.feature.credit.impl.notifications.network;

import b25.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/impl/notifications/network/CreditCollectionNotificationSettingsService;", "", "Lretrofit2/Response;", "Lb25/a;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dto", "", "updateSettings", "(Lb25/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCollectionNotificationSettingsService {
    @GET("/debt-collection/credit-notifications")
    Object getSettings(@NotNull Continuation<? super Response<a>> continuation);

    @PUT("/debt-collection/credit-notifications")
    Object updateSettings(@Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);
}
