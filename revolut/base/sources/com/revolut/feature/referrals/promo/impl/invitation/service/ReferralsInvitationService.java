package com.revolut.feature.referrals.promo.impl.invitation.service;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wxa.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/promo/impl/invitation/service/ReferralsInvitationService;", "", "", "recipientFirstName", "recipientLastName", "recipientCountry", "Lefm/d0;", "Lwxa/d;", "getInvitationPromos", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_retail_referrals_promo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReferralsInvitationService {
    @GET("/invitation/promo")
    @NotNull
    d0<d> getInvitationPromos(@NotNull @Query("recipientFirstName") String recipientFirstName, @NotNull @Query("recipientLastName") String recipientLastName, @NotNull @Query("recipientCountry") String recipientCountry);
}
