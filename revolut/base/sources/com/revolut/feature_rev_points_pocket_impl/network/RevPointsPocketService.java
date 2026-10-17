package com.revolut.feature_rev_points_pocket_impl.network;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import odi.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0004J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0004¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/network/RevPointsPocketService;", "", "Lodi/b;", "getPointsPocket", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lodi/a;", "request", "Lcom/revolut/feature_rev_points_pocket_api/model/RevPointsPocketInfo;", "createRevPointsPocket", "(Lodi/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwj0/b;", "idempotencyTag", "", "deleteRevPointsPocket", "(Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/revolut/feature_rev_points_pocket_api/model/RevPointsPocketThreshold;", "getPointsPocketThresholds", "Lcom/revolut/feature_rev_points_pocket_api/model/RevPointsPocketBenefit;", "getPointsPocketBenefits", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsPocketService {
    @POST("/points-pocket")
    Object createRevPointsPocket(@Body @NotNull a aVar, @NotNull Continuation<? super RevPointsPocketInfo> continuation);

    @DELETE("/points-pocket")
    Object deleteRevPointsPocket(@Tag b bVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/points-pocket")
    Object getPointsPocket(@NotNull Continuation<? super odi.b> continuation);

    @GET("/points-pocket/benefits")
    Object getPointsPocketBenefits(@NotNull Continuation<? super List<RevPointsPocketBenefit>> continuation);

    @GET("/points-pocket/reward-thresholds")
    Object getPointsPocketThresholds(@NotNull Continuation<? super List<RevPointsPocketThreshold>> continuation);
}
