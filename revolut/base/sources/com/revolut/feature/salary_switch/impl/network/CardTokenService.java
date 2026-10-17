package com.revolut.feature.salary_switch.impl.network;

import bqc.e;
import dqc.c;
import dqc.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/network/CardTokenService;", "", "Ldqc/f;", "getUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "Ldqc/c;", "body", "Lbqc/e;", "submitPan", "(Ljava/lang/String;Ldqc/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardTokenService {
    @POST("/card-tokens")
    Object getUrl(@NotNull Continuation<? super f> continuation);

    @PATCH
    Object submitPan(@Url @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super e> continuation);
}
