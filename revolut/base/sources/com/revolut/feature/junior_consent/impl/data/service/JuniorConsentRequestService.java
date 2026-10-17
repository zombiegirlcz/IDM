package com.revolut.feature.junior_consent.impl.data.service;

import ad8.c;
import efm.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_consent/impl/data/service/JuniorConsentRequestService;", "", "", "Lad8/c;", "getConsentRequests", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consentRequestId", "Lefm/b;", "approveConsentRequest", "(Ljava/lang/String;)Lefm/b;", "rejectConsentRequest", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorConsentRequestService {
    @POST("youth/users/consents/change-requests/{consentRequestId}/approve")
    @NotNull
    b approveConsentRequest(@Path("consentRequestId") @NotNull String consentRequestId);

    @GET("youth/users/consents/change-requests")
    Object getConsentRequests(@NotNull Continuation<? super List<c>> continuation);

    @POST("youth/users/consents/change-requests/{consentRequestId}/reject")
    @NotNull
    b rejectConsentRequest(@Path("consentRequestId") @NotNull String consentRequestId);
}
