package com.revolut.feature.junior.account_activation.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import u58.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000 \t2\u00020\u0001:\u0001\nJ%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/data/network/JuniorActivationClaimService;", "", "Lu58/d;", "request", "Lefm/d0;", "Lretrofit2/Response;", "", "claimAccountActivation", "(Lu58/d;)Lefm/d0;", "Companion", "a", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorActivationClaimService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f76632a;

    /* JADX INFO: renamed from: com.revolut.feature.junior.account_activation.impl.data.network.JuniorActivationClaimService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f76632a = new Companion();

        private Companion() {
        }
    }

    @Headers({"X-PENDING-CLAIM: true"})
    @POST("/youth/signup-request/claim")
    @NotNull
    d0<Response<Unit>> claimAccountActivation(@Body @NotNull d request);
}
