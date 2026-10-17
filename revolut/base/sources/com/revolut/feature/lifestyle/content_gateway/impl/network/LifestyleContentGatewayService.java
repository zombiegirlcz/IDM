package com.revolut.feature.lifestyle.content_gateway.impl.network;

import efm.d0;
import f19.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\fJ?\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/lifestyle/content_gateway/impl/network/LifestyleContentGatewayService;", "", "", "placementRef", "enabledFeatures", "varyHeader", "location", "Lefm/d0;", "Lf19/g;", "getContentGatewayPlacement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Companion", "a", "feature_lifestyle_content_gateway_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LifestyleContentGatewayService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f78053a;

    /* JADX INFO: renamed from: com.revolut.feature.lifestyle.content_gateway.impl.network.LifestyleContentGatewayService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f78053a = new Companion();

        private Companion() {
        }
    }

    @GET("lifestyle/content-gateway/get-content")
    @NotNull
    d0<g> getContentGatewayPlacement(@NotNull @Query("placementRef") String placementRef, @Header("X-Enabled-Features") @NotNull String enabledFeatures, @Header("Vary") @NotNull String varyHeader, @Header("X-Client-Geo-Location") String location);
}
