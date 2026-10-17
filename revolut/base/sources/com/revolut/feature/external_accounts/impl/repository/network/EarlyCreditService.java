package com.revolut.feature.external_accounts.impl.repository.network;

import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import uh6.g;
import uh6.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/EarlyCreditService;", "", "Luh6/g;", "requestDto", "Lefm/d0;", "Luh6/h;", "requestConsentRequired", "(Luh6/g;)Lefm/d0;", "Lwj0/b;", "idempotencyTag", "Lefm/b;", "provideConsent", "(Luh6/g;Lwj0/b;)Lefm/b;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EarlyCreditService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f72487a;

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.repository.network.EarlyCreditService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f72487a = new Companion();

        private Companion() {
        }
    }

    @POST("/topup/direct-debit/early-credit/consent")
    @NotNull
    b provideConsent(@Body @NotNull g requestDto, @Tag @NotNull wj0.b idempotencyTag);

    @POST("/topup/direct-debit/early-credit/requirements/consent")
    @NotNull
    d0<h> requestConsentRequired(@Body @NotNull g requestDto);
}
