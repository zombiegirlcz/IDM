package com.revolut.feature.junior.isa.impl.services;

import aa8.c;
import aa8.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/services/JuniorIsaService;", "", "", "juniorRegId", "Laa8/c;", "getTaxResidencies", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Laa8/f;", "request", "", "updateTaxResidencies", "(Ljava/lang/String;Laa8/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorIsaService {
    @GET("youth/users/{juniorRegId}/tax-residencies")
    Object getTaxResidencies(@Path("juniorRegId") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @PUT("youth/users/{juniorRegId}/tax-residencies")
    Object updateTaxResidencies(@Path("juniorRegId") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);
}
