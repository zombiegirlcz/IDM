package com.revolut.feature.external_accounts.impl.repository.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import uh6.e;
import uh6.f;
import uh6.j;
import uh6.k;
import wj0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00122\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/MandateService;", "", "Luh6/e;", "body", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Luh6/f;", "createMandate", "(Luh6/e;Lwj0/b;)Lefm/d0;", "", "Luh6/j;", "getMandates", "()Lefm/d0;", "", "id", "getMandate", "(Ljava/lang/String;)Lefm/d0;", "Luh6/k;", "Lefm/b;", "topUpWithMandate", "(Luh6/k;Lwj0/b;)Lefm/b;", "revokeMandate", "(Ljava/lang/String;)Lefm/b;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MandateService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f72489a;

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.repository.network.MandateService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f72489a = new Companion();

        private Companion() {
        }
    }

    @POST("/external-institutions/mandates")
    @NotNull
    d0<f> createMandate(@Body @NotNull e body, @Tag @NotNull b idempotencyTag);

    @GET("/external-institutions/mandates/{id}")
    @NotNull
    d0<j> getMandate(@Path("id") @NotNull String id10);

    @GET("/external-institutions/mandates")
    @NotNull
    d0<List<j>> getMandates();

    @DELETE("/external-institutions/mandates/{id}")
    @NotNull
    efm.b revokeMandate(@Path("id") @NotNull String id10);

    @POST("/topup/direct-debit/mandate")
    @NotNull
    efm.b topUpWithMandate(@Body @NotNull k body, @Tag @NotNull b idempotencyTag);
}
