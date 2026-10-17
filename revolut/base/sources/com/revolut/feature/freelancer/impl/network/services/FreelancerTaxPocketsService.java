package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;
import xt6.a;
import xt6.c;
import xt6.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015J$\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerTaxPocketsService;", "", "Lwj0/b;", "idempotencyTag", "Lxt6/b;", "body", "Lxt6/c;", "createTaxPocket", "(Lwj0/b;Lxt6/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lxt6/d;", "Lretrofit2/Response;", "", "updateTaxPocket", "(Ljava/lang/String;Lxt6/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lxt6/a;", "getTaxPockets", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerTaxPocketsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f73667a;

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.impl.network.services.FreelancerTaxPocketsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f73667a = new Companion();

        private Companion() {
        }
    }

    @POST("/acquiring/merchant/tax-pockets")
    Object createTaxPocket(@Tag @NotNull b bVar, @Body @NotNull xt6.b bVar2, @NotNull Continuation<? super c> continuation);

    @GET("/acquiring/merchant/tax-pockets")
    Object getTaxPockets(@NotNull Continuation<? super List<a>> continuation);

    @PATCH("/acquiring/merchant/tax-pockets/{id}")
    Object updateTaxPocket(@Path("id") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
