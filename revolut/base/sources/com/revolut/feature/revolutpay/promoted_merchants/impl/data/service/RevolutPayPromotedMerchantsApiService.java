package com.revolut.feature.revolutpay.promoted_merchants.impl.data.service;

import fcc.b;
import fcc.d;
import fcc.f;
import fcc.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017JJ\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/data/service/RevolutPayPromotedMerchantsApiService;", "", "", "pointsRewardSupported", "", "category", "query", "", "limit", "offset", "Lfcc/g;", "getPromotedMerchants", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfcc/d;", "getPromotedMerchantsCategories", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfcc/f;", "getPromotedMerchantEligibility", "id", "Lfcc/b;", "getClaimInstructions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayPromotedMerchantsApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f84670a;

    /* JADX INFO: renamed from: com.revolut.feature.revolutpay.promoted_merchants.impl.data.service.RevolutPayPromotedMerchantsApiService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f84670a = new Companion();

        private Companion() {
        }
    }

    @GET("/revpay/promoted-merchants/instructions/{id}")
    Object getClaimInstructions(@Path("id") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("/revpay/promoted-merchants/eligibilities")
    Object getPromotedMerchantEligibility(@Header("Revolut-Pay-Shopping-Offers-Points-Reward-Supported") boolean z, @NotNull Continuation<? super f> continuation);

    @Headers({"Revolut-Pay-Boost-Ineligible-Points-Earning-Supported: true"})
    @GET("/revpay/promoted-merchants")
    Object getPromotedMerchants(@Header("Revolut-Pay-Shopping-Offers-Points-Reward-Supported") boolean z, @Query("category") String str, @Query("query") String str2, @Query("limit") Integer num, @Query("offset") Integer num2, @NotNull Continuation<? super g> continuation);

    @GET("/revpay/promoted-merchants/categories")
    Object getPromotedMerchantsCategories(@Header("Revolut-Pay-Shopping-Offers-Points-Reward-Supported") boolean z, @NotNull Continuation<? super d> continuation);
}
