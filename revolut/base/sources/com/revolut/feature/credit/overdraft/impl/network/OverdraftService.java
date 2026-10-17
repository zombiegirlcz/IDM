package com.revolut.feature.credit.overdraft.impl.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import r95.a;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import rx4.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJ&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/overdraft/impl/network/OverdraftService;", "", "", "", "headers", "Lr95/b;", "getOverdraftFacilities", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "facilityId", "Lr95/a;", "getOverdraftDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrx4/b;", "getOverdraftAgreements", "Companion", "a", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OverdraftService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f70636a;

    /* JADX INFO: renamed from: com.revolut.feature.credit.overdraft.impl.network.OverdraftService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f70636a = new Companion();

        private Companion() {
        }
    }

    @GET("/credit-application/credit-facility-v2/{facilityId}/agreement")
    Object getOverdraftAgreements(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("/credit/overdraft/{facilityId}")
    Object getOverdraftDetails(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/credit/od-facilities")
    Object getOverdraftFacilities(@HeaderMap @NotNull Map<String, String> map, @NotNull Continuation<? super r95.b> continuation);
}
