package com.revolut.feature.lifestyle.core.impl.network;

import efm.d0;
import f19.g;
import g19.c;
import g29.f;
import h29.k;
import i29.b;
import j29.l;
import j29.o;
import k29.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 '2\u00020\u0001:\u0001(J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\fJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\fJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0018J$\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u001eJ2\u0010%\u001a\u00020$2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b%\u0010&¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/lifestyle/core/impl/network/LifestyleHomeService;", "", "", "enabledFeatures", "varyHeader", "location", "Lefm/d0;", "Lg19/c;", "getHomeFeed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lh29/k;", "getHomeProducts", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lf19/g;", "getHomeHeader", "getHomeSuggestedForYou", "placementId", "Lg29/f;", "body", "Li19/c;", "refreshHomeContent", "(Ljava/lang/String;Ljava/lang/String;Lg29/f;)Lefm/d0;", "Li29/b;", "getOnboardingInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj29/d0;", "getSavingsSummary", "type", "Lj29/o;", "getSavingsDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "product", "Lj29/l;", "getSavingsBottomSheet", "startDate", "endDate", "Lk29/v;", "getWrapped", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LifestyleHomeService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f78062a;

    /* JADX INFO: renamed from: com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f78062a = new Companion();

        private Companion() {
        }
    }

    @GET("lifestyle/home/feed")
    @NotNull
    d0<c> getHomeFeed(@Header("X-Enabled-Features") @NotNull String enabledFeatures, @Header("Vary") @NotNull String varyHeader, @Header("X-Client-Geo-Location") String location);

    @GET("lifestyle/home/header")
    @NotNull
    d0<g> getHomeHeader(@Header("X-Enabled-Features") @NotNull String enabledFeatures, @Header("Vary") @NotNull String varyHeader);

    @GET("lifestyle/home/products")
    @NotNull
    d0<k> getHomeProducts(@Header("X-Enabled-Features") @NotNull String enabledFeatures, @Header("Vary") @NotNull String varyHeader);

    @GET("lifestyle/home/suggested-for-you")
    @NotNull
    d0<g> getHomeSuggestedForYou(@Header("X-Enabled-Features") @NotNull String enabledFeatures, @Header("Vary") @NotNull String varyHeader);

    @GET("lifestyle/onboarding")
    Object getOnboardingInfo(@Header("X-Enabled-Features") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("loyalty/savings/bottom-sheet/{product}")
    Object getSavingsBottomSheet(@Header("X-Enabled-Features") @NotNull String str, @Path("product") @NotNull String str2, @NotNull Continuation<? super l> continuation);

    @GET("loyalty/savings/{type}")
    Object getSavingsDetails(@Header("X-Enabled-Features") @NotNull String str, @Path("type") @NotNull String str2, @NotNull Continuation<? super o> continuation);

    @GET("loyalty/savings")
    Object getSavingsSummary(@Header("X-Enabled-Features") @NotNull String str, @NotNull Continuation<? super j29.d0> continuation);

    @GET("lifestyle/wrapped")
    Object getWrapped(@Header("X-Enabled-Features") @NotNull String str, @Query("startDate") String str2, @Query("endDate") String str3, @NotNull Continuation<? super v> continuation);

    @POST("lifestyle/home/placements/{placementId}/refresh-content")
    @NotNull
    d0<i19.c> refreshHomeContent(@Header("X-Enabled-Features") @NotNull String enabledFeatures, @Path("placementId") @NotNull String placementId, @Body @NotNull f body);
}
