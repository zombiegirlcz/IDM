package com.revolut.feature.apm.multibanco.impl.data.network;

import e72.a;
import e72.b;
import e72.c;
import e72.d;
import e72.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/data/network/MultibancoCardService;", "", "getCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le72/d;", "body", "Lwj0/b;", "idempotencyTag", "Le72/g;", "postCard", "(Le72/d;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le72/b;", "Le72/c;", "enrollmentSearch", "(Le72/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le72/a;", "", "enrollmentConfirmation", "(Le72/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoCardService {
    @POST("/mbway/user/external-onboarding")
    Object enrollmentConfirmation(@Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/my-card/mbway/enrollment-search")
    Object enrollmentSearch(@Body @NotNull b bVar, @NotNull Continuation<? super c> continuation);

    @GET("/my-card/issue/virtual-local-scheme")
    Object getCard(@NotNull Continuation<Object> continuation);

    @POST("/my-card/issue/virtual-local-scheme")
    Object postCard(@Body @NotNull d dVar, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super g> continuation);
}
