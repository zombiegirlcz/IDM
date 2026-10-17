package com.revolut.feature.retail.global_accounts.impl.data.service;

import k9b.c;
import k9b.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/global_accounts/impl/data/service/CountryProfilesManagementService;", "", "Lk9b/f;", "body", "", "setDefaultProfile", "(Lk9b/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lk9b/c;", "createCountryProfile", "(Lk9b/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_global_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CountryProfilesManagementService {
    @POST("country-profile")
    Object createCountryProfile(@Body @NotNull c cVar, @NotNull Continuation<? super f> continuation);

    @POST("default-profile")
    Object setDefaultProfile(@Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);
}
