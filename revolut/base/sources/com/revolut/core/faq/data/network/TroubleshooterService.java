package com.revolut.core.faq.data.network;

import cg0.h0;
import cg0.j0;
import cg0.l0;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\t\u0010\bJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\n\u0010\bJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\f\u0010\bJ7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\u0003H'¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/core/faq/data/network/TroubleshooterService;", "", "", "", "headers", "Lefm/d0;", "Lcg0/j0;", "getPastTransactionActions", "(Ljava/util/Map;)Lefm/d0;", "getUpcomingTransactionActions", "getCardsActions", "getReferralsActions", "getReferralsMainActions", "faqKey", "getReferralsInviteActions", "(Ljava/util/Map;Ljava/lang/String;)Lefm/d0;", "getTransfersActions", "Lcg0/h0;", "request", "", "Lcg0/l0;", "troubleshoot", "(Lcg0/h0;)Lefm/d0;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TroubleshooterService {
    @GET("support/cards/actions")
    @NotNull
    d0<j0> getCardsActions(@HeaderMap @NotNull Map<String, String> headers);

    @GET("support/past-transactions/actions")
    @NotNull
    d0<j0> getPastTransactionActions(@HeaderMap @NotNull Map<String, String> headers);

    @GET("support/referrals/actions")
    @NotNull
    d0<j0> getReferralsActions(@HeaderMap @NotNull Map<String, String> headers);

    @GET("/support/referrals/invitee-troubleshooting/actions")
    @NotNull
    d0<j0> getReferralsInviteActions(@HeaderMap @NotNull Map<String, String> headers, @NotNull @Query("inviteStateKey") String faqKey);

    @GET("support/referrals-main/actions")
    @NotNull
    d0<j0> getReferralsMainActions(@HeaderMap @NotNull Map<String, String> headers);

    @GET("support/transfers/actions")
    @NotNull
    d0<j0> getTransfersActions(@HeaderMap @NotNull Map<String, String> headers);

    @GET("support/upcoming-transactions/actions")
    @NotNull
    d0<j0> getUpcomingTransactionActions(@HeaderMap @NotNull Map<String, String> headers);

    @POST("troubleshoot")
    @NotNull
    d0<List<l0>> troubleshoot(@Body @NotNull h0 request);
}
