package com.revolut.feature.junior.account_activation.impl.data.network;

import efm.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import u58.d;
import u58.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/data/network/JuniorAccountActivationService;", "", "Lu58/d;", "request", "Lefm/b;", "claimAccountActivation", "(Lu58/d;)Lefm/b;", "Lu58/e;", "declineAccountActivation", "(Lu58/e;)Lefm/b;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAccountActivationService {
    @POST("/youth/signup-request/claim")
    @NotNull
    b claimAccountActivation(@Body @NotNull d request);

    @POST("/youth/signup-request/decline")
    @NotNull
    b declineAccountActivation(@Body @NotNull e request);
}
