package com.revolut.feature.external_accounts.impl.repository.network;

import com.revolut.data.network.models.openbanking.AuthorizationRequestDto;
import efm.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import uh6.b;
import uh6.l;
import vh6.e;
import vh6.g;
import vh6.j;
import yh6.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001f2\u00020\u0001:\u0001 J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\bH§@¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/LinkExternalInstitutionsService;", "", "Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;", "authorizationDto", "Lefm/d0;", "Luh6/b;", "getAuthorizationUrl", "(Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;)Lefm/d0;", "", "institutionId", "branchId", "Lvh6/e;", "fetchAccountLinkingPreview", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvh6/j;", "fetchLinkedAccountsConsent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consentId", "Lvh6/g;", "fetchLinkedAccountConsentDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyh6/d0;", "body", "Lwj0/b;", "idempotencyTag", "Lyh6/e0;", "relink", "(Lyh6/d0;Lwj0/b;)Lefm/d0;", "Luh6/l;", "revokeInstitution", "(Ljava/lang/String;)Lefm/d0;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LinkExternalInstitutionsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f72488a;

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f72488a = new Companion();

        private Companion() {
        }
    }

    @GET("/external-institutions/account-linking/preview")
    Object fetchAccountLinkingPreview(@NotNull @Query("institutionId") String str, @Query("branchId") String str2, @NotNull Continuation<? super e> continuation);

    @GET("/external-institutions/consents/{consentId}")
    Object fetchLinkedAccountConsentDetails(@Path("consentId") @NotNull String str, @NotNull Continuation<? super g> continuation);

    @GET("/external-institutions/consents")
    Object fetchLinkedAccountsConsent(@NotNull Continuation<? super j> continuation);

    @POST("/external-institutions/application")
    @NotNull
    d0<b> getAuthorizationUrl(@Body @NotNull AuthorizationRequestDto authorizationDto);

    @POST("/external-institutions/relink")
    @NotNull
    d0<e0> relink(@Body @NotNull yh6.d0 body, @Tag wj0.b idempotencyTag);

    @DELETE("/external-institutions/{id}")
    @NotNull
    d0<l> revokeInstitution(@Path("id") @NotNull String institutionId);
}
