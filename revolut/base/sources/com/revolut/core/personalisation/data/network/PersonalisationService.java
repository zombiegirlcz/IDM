package com.revolut.core.personalisation.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pk0.a;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import zj0.b;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/personalisation/data/network/PersonalisationService;", "", "", "modifiedSince", "Lpk0/a;", "getAll", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "", "putValues", "(Lpk0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PersonalisationService {
    @GET("user-preferences")
    Object getAll(@Header("If-Modified-Since") Long l2, @NotNull Continuation<? super a> continuation);

    @PATCH("user-preferences")
    @b
    Object putValues(@Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);
}
