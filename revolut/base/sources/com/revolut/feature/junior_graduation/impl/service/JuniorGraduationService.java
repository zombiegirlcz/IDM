package com.revolut.feature.junior_graduation.impl.service;

import efm.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import vg8.d;
import vg8.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_graduation/impl/service/JuniorGraduationService;", "", "Lefm/b;", "confirmGraduation", "()Lefm/b;", "resignGraduation", "Lretrofit2/Response;", "Lvg8/d;", "getMigrationAsset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvg8/e;", "dto", "completeGraduation", "(Lvg8/e;)Lefm/b;", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorGraduationService {
    @POST("youth/graduation/complete")
    @NotNull
    b completeGraduation(@Body @NotNull e dto);

    @POST("youth/graduation/confirm")
    @NotNull
    b confirmGraduation();

    @GET("youth/graduation/assets-migration")
    Object getMigrationAsset(@NotNull Continuation<? super Response<d>> continuation);

    @POST("youth/graduation/resign")
    @NotNull
    b resignGraduation();
}
