package com.revolut.feature.onboarding.impl.promo.services;

import efm.k;
import hc9.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/impl/promo/services/PromptsService;", "", "Lefm/k;", "Lhc9/c;", "getPromptsLocked", "()Lefm/k;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PromptsService {
    @GET("/support/prompts/locked")
    @NotNull
    k<c> getPromptsLocked();
}
