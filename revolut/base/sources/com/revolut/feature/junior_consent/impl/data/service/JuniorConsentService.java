package com.revolut.feature.junior_consent.impl.data.service;

import ad8.d;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_consent/impl/data/service/JuniorConsentService;", "", "", "userId", "code", "Lefm/b;", "approveConsent", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "declineConsent", "Lefm/d0;", "", "Lad8/d;", "getConsents", "()Lefm/d0;", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorConsentService {
    @POST("youth/users/{userId}/consents/{code}/approve")
    @NotNull
    b approveConsent(@Path("userId") @NotNull String userId, @Path("code") @NotNull String code);

    @POST("youth/users/{userId}/consents/{code}/decline")
    @NotNull
    b declineConsent(@Path("userId") @NotNull String userId, @Path("code") @NotNull String code);

    @GET("youth/users/consents")
    @NotNull
    d0<List<d>> getConsents();
}
