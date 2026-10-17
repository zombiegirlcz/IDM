package com.revolut.feature.pix.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import l8a.a;
import l8a.z0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/impl/data/network/TrustedBeneficiariesService;", "", "", "Ll8a/z0;", "getTrustedBeneficiaries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/a;", "body", "", "addTrustedBeneficiary", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "deleteTrustedBeneficiary", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrustedBeneficiariesService {
    @PUT("/outbound-limits/trusted-beneficiaries")
    Object addTrustedBeneficiary(@Body @NotNull List<a> list, @NotNull Continuation<? super Unit> continuation);

    @DELETE("/outbound-limits/trusted-beneficiaries/{id}")
    Object deleteTrustedBeneficiary(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/outbound-limits/trusted-beneficiaries")
    Object getTrustedBeneficiaries(@NotNull Continuation<? super List<z0>> continuation);
}
