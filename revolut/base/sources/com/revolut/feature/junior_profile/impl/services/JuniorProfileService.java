package com.revolut.feature.junior_profile.impl.services;

import com.revolut.feature.junior_profile.api.models.a;
import ij8.c;
import ij8.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/services/JuniorProfileService;", "", "", "parentRegId", "enabledExperiments", "", "Lcom/revolut/feature/junior_profile/api/models/a;", "getYouthUsers", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "juniorRegId", "getYouthUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userId", "Lij8/d;", "changed", "", "updateUserProfile", "(Ljava/lang/String;Lij8/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lij8/c;", "request", "updateJuniorPhone", "(Ljava/lang/String;Lij8/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorProfileService {
    @GET("/youth/user/{registeredIdentityId}")
    Object getYouthUser(@Path("registeredIdentityId") @NotNull String str, @Header("X-Registered-Identity") @NotNull String str2, @Header("X-Enabled-Experiments") String str3, @NotNull Continuation<? super a> continuation);

    @GET("/youth/users")
    Object getYouthUsers(@Header("X-Registered-Identity") @NotNull String str, @Header("X-Enabled-Experiments") String str2, @NotNull Continuation<? super List<? extends a>> continuation);

    @PUT("youth/users/{juniorRegId}/phone")
    Object updateJuniorPhone(@Path("juniorRegId") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/youth/user/{id}")
    Object updateUserProfile(@Path("id") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super Unit> continuation);
}
