package com.revolut.feature.retail.savings.impl.challenge.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import ujb.e0;
import ujb.r;
import ujb.u;
import ujb.z0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\nJ$\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/challenge/data/SavingsChallengeService;", "", "", "Lujb/z0;", "getChallengeOnboarding", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lujb/e0;", "getChallenge", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lujb/r;", "getChallengeAccount", "Lujb/u;", "request", "updateChallengeAccount", "(Ljava/lang/String;Lujb/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsChallengeService {
    @GET("/savings/challenges/{id}")
    Object getChallenge(@Path("id") @NotNull String str, @NotNull Continuation<? super e0> continuation);

    @GET("/savings/challenges/accounts/{id}")
    Object getChallengeAccount(@Path("id") @NotNull String str, @NotNull Continuation<? super r> continuation);

    @GET("/savings/challenges/onboarding")
    Object getChallengeOnboarding(@NotNull Continuation<? super List<z0>> continuation);

    @PATCH("/savings/challenges/accounts/{id}")
    Object updateChallengeAccount(@Path("id") @NotNull String str, @Body @NotNull u uVar, @NotNull Continuation<? super r> continuation);
}
