package com.revolut.feature.apm.multibanco.impl.via_verde.data;

import f92.a;
import f92.c;
import f92.h;
import f92.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J$\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/data/ViaVerdeService;", "", "Lf92/h;", "body", "Lf92/a;", "postActivations", "(Lf92/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postReplacements", "", "id", "Lf92/i;", "updateEnrollment", "(Ljava/lang/String;Lf92/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf92/c;", "getEnrollments", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ViaVerdeService {
    @GET("via-verde/enrollments")
    Object getEnrollments(@NotNull Continuation<? super c> continuation);

    @POST("via-verde/activations")
    Object postActivations(@Body @NotNull h hVar, @NotNull Continuation<? super a> continuation);

    @POST("via-verde/replacements")
    Object postReplacements(@Body @NotNull h hVar, @NotNull Continuation<? super a> continuation);

    @PUT("via-verde/enrollments/{id}")
    Object updateEnrollment(@Path("id") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super a> continuation);
}
