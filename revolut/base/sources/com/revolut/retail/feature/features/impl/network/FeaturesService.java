package com.revolut.retail.feature.features.impl.network;

import efm.b;
import efm.d0;
import epj.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0003H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/features/impl/network/FeaturesService;", "", "", "", "headers", "Lefm/d0;", "", "Lepj/a;", "getFeatures", "(Ljava/util/Map;)Lefm/d0;", "name", "Lefm/b;", "unlock", "(Ljava/lang/String;)Lefm/b;", "feature_retail_features_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FeaturesService {
    @GET("user/current/features")
    @NotNull
    d0<List<a>> getFeatures(@HeaderMap @NotNull Map<String, String> headers);

    @POST("user/current/features/{name}/unlock")
    @NotNull
    b unlock(@Path("name") @NotNull String name);
}
