package com.revolut.feature.apm.core.contacts.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qx1.c;
import qx1.d;
import qx1.f;
import qx1.g;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/contacts/data/network/ApmContactsDiscoveryService;", "", "Lqx1/g;", "body", "", "header", "Lqx1/f;", "postDiscoverContacts", "(Lqx1/g;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jobId", "Lretrofit2/Response;", "Lqx1/d;", "getContactsByJobId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lqx1/c;", "getContactById", "Companion", "a", "feature_apm_core_contacts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmContactsDiscoveryService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f61841a;

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f61841a = new Companion();

        private Companion() {
        }
    }

    @GET("contacts/{id}")
    Object getContactById(@Path("id") @NotNull String str, @Header("X-Contacts-V2") @NotNull String str2, @NotNull Continuation<? super c> continuation);

    @GET("contacts/discovery/{jobId}")
    Object getContactsByJobId(@Path("jobId") @NotNull String str, @Header("X-Contacts-V2") @NotNull String str2, @NotNull Continuation<? super Response<d>> continuation);

    @POST("contacts/discovery")
    Object postDiscoverContacts(@Body @NotNull g gVar, @Header("X-Contacts-V2") @NotNull String str, @NotNull Continuation<? super f> continuation);
}
