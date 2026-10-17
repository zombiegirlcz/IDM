package com.revolut.feature.junior.pending_graduation.impl.data.service;

import fb8.f;
import fb8.i;
import fb8.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/pending_graduation/impl/data/service/JuniorGraduationService;", "", "", "Lfb8/i;", "getJuniorGraduations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfb8/f;", "getJuniorDependantsGraduations", "", "graduationId", "Lfb8/u;", "body", "", "updateAssetsMigrationPermissionState", "(Ljava/lang/String;Lfb8/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_pending_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorGraduationService {
    @GET("youth/users/dependants-graduations")
    Object getJuniorDependantsGraduations(@NotNull Continuation<? super List<f>> continuation);

    @GET("youth/users/graduations")
    Object getJuniorGraduations(@NotNull Continuation<? super List<i>> continuation);

    @POST("youth/graduation/{id}/assets-migration-permission")
    Object updateAssetsMigrationPermissionState(@Path("id") @NotNull String str, @Body @NotNull u uVar, @NotNull Continuation<? super Unit> continuation);
}
