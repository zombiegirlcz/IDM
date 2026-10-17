package com.revolut.feature.contacts.impl.data.network;

import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import ql3.a;
import ql3.c;
import ql3.d;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zj0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts/impl/data/network/UserService;", "", "", "phones", "Lefm/d0;", "", "Lql3/a;", "userExists", "(Ljava/lang/String;)Lefm/d0;", "Lql3/c;", "userCodesListDto", "", "Lql3/d;", "getRemoteContactsData", "(Lql3/c;)Lefm/d0;", "username", "getUsers", "code", "getUserByCode", "getUserByUsername", "", "notifyFriends", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserService {
    @b
    @POST("/user/contacts/search")
    @NotNull
    d0<List<d>> getRemoteContactsData(@Body @NotNull c userCodesListDto);

    @GET("/users/code/{code}")
    @NotNull
    d0<d> getUserByCode(@Path("code") @NotNull String code);

    @GET("/users/{username}")
    @NotNull
    d0<d> getUserByUsername(@Path("username") @NotNull String username);

    @GET("/users")
    @NotNull
    d0<List<d>> getUsers(@NotNull @Query("username") String username);

    @POST("user/contacts/notify")
    Object notifyFriends(@NotNull Continuation<? super Unit> continuation);

    @GET("user/exist")
    @NotNull
    d0<Map<String, a>> userExists(@NotNull @Query("phones") String phones);
}
