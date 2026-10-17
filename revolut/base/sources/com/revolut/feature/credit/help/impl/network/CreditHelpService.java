package com.revolut.feature.credit.help.impl.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import n15.a;
import n15.d;
import o15.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0003H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\n¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/help/impl/network/CreditHelpService;", "", "", "", "Ln15/a;", "getCreditHelpCountryConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationId", "Ln15/d;", "getResumeApplicationState", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productType", "Lo15/c;", "getFinancialDifficultyContent", "feature_credit_help_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditHelpService {
    @GET("/loan-management/country-config")
    Object getCreditHelpCountryConfig(@NotNull Continuation<? super Map<String, a>> continuation);

    @GET("/credit-application/{productType}/financial-difficulty")
    Object getFinancialDifficultyContent(@Path("productType") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @GET("/credit-application/{applicationId}/resume-application/resume-screen")
    Object getResumeApplicationState(@Path("applicationId") @NotNull String str, @NotNull Continuation<? super d> continuation);
}
