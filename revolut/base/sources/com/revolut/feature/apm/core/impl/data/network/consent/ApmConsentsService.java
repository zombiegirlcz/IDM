package com.revolut.feature.apm.core.impl.data.network.consent;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import yy1.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\t¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/consent/ApmConsentsService;", "", "", "Lyy1/a;", "getConsents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getConsentDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "postApproveConsent", "postRejectConsent", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmConsentsService {
    @GET("/apm/consents/{id}")
    Object getConsentDetails(@Path("id") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/apm/consents/pending")
    Object getConsents(@NotNull Continuation<? super List<a>> continuation);

    @POST("/apm/consents/{id}/approve")
    Object postApproveConsent(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/apm/consents/{id}/reject")
    Object postRejectConsent(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
