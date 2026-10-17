package com.revolut.feature.junior_onboarding.impl.service;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import uh8.h;
import uh8.i;
import uh8.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/service/JuniorDetailsValidationService;", "", "Luh8/h;", "request", "Lefm/d0;", "Luh8/j;", "checkMatching", "(Luh8/h;)Lefm/d0;", "Luh8/i;", "validate", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorDetailsValidationService {
    @POST("/youth/match")
    @NotNull
    d0<j> checkMatching(@Body @NotNull h request);

    @POST("/youth/create/validate")
    @NotNull
    d0<i> validate(@Body @NotNull h request);
}
