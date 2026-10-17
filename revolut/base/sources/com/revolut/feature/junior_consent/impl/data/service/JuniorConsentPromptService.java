package com.revolut.feature.junior_consent.impl.data.service;

import cd8.f;
import efm.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_consent/impl/data/service/JuniorConsentPromptService;", "", "", "consentId", "Lad8/b;", "body", "Lefm/b;", "trackConsentPromptState", "(Ljava/lang/String;Lad8/b;)Lefm/b;", "", "Lcd8/f;", "getConsentsTrack", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorConsentPromptService {
    @GET("/youth/users/consents/track")
    Object getConsentsTrack(@NotNull Continuation<? super List<f>> continuation);

    @PUT("youth/users/consents/{consentId}/track")
    @NotNull
    b trackConsentPromptState(@Path("consentId") @NotNull String consentId, @Body @NotNull ad8.b body);
}
