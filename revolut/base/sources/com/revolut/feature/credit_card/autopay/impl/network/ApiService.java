package com.revolut.feature.credit_card.autopay.impl.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ub5.a;
import ub5.b;
import ub5.c;
import ub5.e;
import ub5.f;
import ub5.k;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0007J#\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u0007¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/impl/network/ApiService;", "", "", "facilityId", "Lefm/d0;", "Lub5/b;", "getAutoPay", "(Ljava/lang/String;)Lefm/d0;", "Lub5/c;", "request", "Lefm/b;", "postAutoPay", "(Ljava/lang/String;Lub5/c;)Lefm/b;", "putAutoPay", "Lub5/f;", "getDirectDebit", "Lub5/k;", "mandate", "setDirectDebitMandate", "(Ljava/lang/String;Lub5/k;)Lefm/b;", "accountId", "selectDirectDebitMandate", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "Lub5/a;", "achPullAccount", "getAutoPayAuthDetails", "(Ljava/lang/String;Lub5/a;)Lefm/d0;", "Lub5/e;", "getCreditAgreementsList", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public interface ApiService {
    @GET("/credit/{facilityId}/auto-payment/v2")
    @NotNull
    d0<b> getAutoPay(@Path("facilityId") @NotNull String facilityId);

    @POST("/credit-application/credit-facility-v2/{facilityId}/ach-authorization")
    @NotNull
    d0<Object> getAutoPayAuthDetails(@Path("facilityId") @NotNull String facilityId, @Body @NotNull a achPullAccount);

    @GET("/credit-application/credit-facility-v2/{facilityId}/agreement")
    @NotNull
    d0<e> getCreditAgreementsList(@Path("facilityId") @NotNull String facilityId);

    @GET("/credit/{facilityId}/auto-payment/direct-debit")
    @NotNull
    d0<f> getDirectDebit(@Path("facilityId") @NotNull String facilityId);

    @POST("/credit/{facilityId}/auto-payment/v2")
    @NotNull
    efm.b postAutoPay(@Path("facilityId") @NotNull String facilityId, @Body @NotNull c request);

    @PUT("/credit/{facilityId}/auto-payment/v2")
    @NotNull
    efm.b putAutoPay(@Path("facilityId") @NotNull String facilityId, @Body @NotNull c request);

    @POST("/credit/{facilityId}/mandate/{accountId}/select")
    @NotNull
    efm.b selectDirectDebitMandate(@Path("facilityId") @NotNull String facilityId, @Path("accountId") @NotNull String accountId);

    @POST("/credit/{facilityId}/mandate")
    @NotNull
    efm.b setDirectDebitMandate(@Path("facilityId") @NotNull String facilityId, @Body @NotNull k mandate);
}
