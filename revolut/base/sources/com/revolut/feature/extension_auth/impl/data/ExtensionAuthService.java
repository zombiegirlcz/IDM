package com.revolut.feature.extension_auth.impl.data;

import be6.a;
import be6.k;
import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/extension_auth/impl/data/ExtensionAuthService;", "", "", "channel", "Lefm/d0;", "Lbe6/k;", "getVerificationCode", "(Ljava/lang/String;)Lefm/d0;", "tokenId", "Lbe6/a;", "dto", "Lefm/b;", "confirmVerification", "(Ljava/lang/String;Lbe6/a;)Lefm/b;", "rejectVerification", "(Ljava/lang/String;)Lefm/b;", "sendInvitationLinkToEmail", "()Lefm/b;", "feature_extension_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExtensionAuthService {
    @POST("verification-codes/{tokenId}/confirm")
    @NotNull
    b confirmVerification(@Path("tokenId") @NotNull String tokenId, @Body @NotNull a dto);

    @zj0.a
    @GET("verification-codes/active")
    @NotNull
    d0<k> getVerificationCode(@NotNull @Query("channel") String channel);

    @POST("verification-codes/{tokenId}/reject")
    @NotNull
    b rejectVerification(@Path("tokenId") @NotNull String tokenId);

    @POST("send-shopper-link")
    @NotNull
    b sendInvitationLinkToEmail();
}
