package com.revolut.shared.feature.wealth.domain.impl.data.network;

import gdl.c;
import gdl.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/BuyBlockService;", "", "Lgdl/c;", "getBuyBlock", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgdl/h;", "request", "setBuyBlock", "(Lgdl/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BuyBlockService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f105088a;

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth.domain.impl.data.network.BuyBlockService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f105088a = new Companion();

        private Companion() {
        }
    }

    @GET("/trading/user/current/settings/investment-buy-block")
    Object getBuyBlock(@NotNull Continuation<? super c> continuation);

    @PUT("/trading/user/current/settings/investment-buy-block")
    Object setBuyBlock(@Body @NotNull h hVar, @NotNull Continuation<? super c> continuation);
}
