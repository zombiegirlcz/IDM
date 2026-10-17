package com.revolut.retail.feature.impl.custom_assets.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import usj.a0;
import usj.b0;
import usj.c;
import usj.e0;
import usj.f;
import usj.i;
import usj.r;
import usj.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001f2\u00020\u0001:\u0001 J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0007J$\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0007J$\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/custom_assets/network/CustomAssetsApiService;", "", "", "ifModifiedSince", "Lretrofit2/Response;", "Lusj/r;", "getFieldDefinitions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lusj/u;", "getCustomAssets", "idempotencyKey", "Lusj/f;", "request", "Lusj/i;", "createCustomAsset", "(Ljava/lang/String;Lusj/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customAssetId", "Lusj/a0;", "Lusj/b0;", "updateCustomAsset", "(Ljava/lang/String;Lusj/a0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteCustomAsset", "Lusj/c;", "adjustCurrentValue", "(Ljava/lang/String;Lusj/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCurrentValue", "Lusj/e0;", "updateHistoricValue", "(Ljava/lang/String;Lusj/e0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CustomAssetsApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f101565a;

    /* JADX INFO: renamed from: com.revolut.retail.feature.impl.custom_assets.network.CustomAssetsApiService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f101565a = new Companion();

        private Companion() {
        }
    }

    @POST("/analytics/total-wealth/custom-assets/{customAssetId}/current-value")
    Object adjustCurrentValue(@Path("customAssetId") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/analytics/total-wealth/custom-assets")
    Object createCustomAsset(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super i> continuation);

    @DELETE("/analytics/total-wealth/custom-assets/{customAssetId}")
    Object deleteCustomAsset(@Path("customAssetId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/analytics/total-wealth/custom-assets")
    Object getCustomAssets(@Header("If-Modified-Since") String str, @NotNull Continuation<? super Response<List<u>>> continuation);

    @GET("/analytics/total-wealth/custom-assets/field-definitions")
    Object getFieldDefinitions(@Header("If-Modified-Since") String str, @NotNull Continuation<? super Response<r>> continuation);

    @DELETE("/analytics/total-wealth/custom-assets/{customAssetId}/current-value")
    Object removeCurrentValue(@Path("customAssetId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @PUT("/analytics/total-wealth/custom-assets/{customAssetId}")
    Object updateCustomAsset(@Path("customAssetId") @NotNull String str, @Body @NotNull a0 a0Var, @NotNull Continuation<? super b0> continuation);

    @PUT("/analytics/total-wealth/custom-assets/{customAssetId}/historic-value")
    Object updateHistoricValue(@Path("customAssetId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull Continuation<? super Unit> continuation);
}
