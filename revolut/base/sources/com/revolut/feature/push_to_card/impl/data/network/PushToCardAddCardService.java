package com.revolut.feature.push_to_card.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import lqa.l0;
import lqa.n;
import lqa.t;
import mqa.c;
import mqa.o;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/data/network/PushToCardAddCardService;", "", "Lmqa/c;", "body", "Lefm/d0;", "Llqa/t;", "getEligibility", "(Lmqa/c;)Lefm/d0;", "Llqa/l0;", "getUrl", "()Lefm/d0;", "", "url", "Lmqa/o;", "Llqa/n;", "submitPan", "(Ljava/lang/String;Lmqa/o;)Lefm/d0;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PushToCardAddCardService {
    @POST("/card-transfers/eligibility")
    @NotNull
    d0<t> getEligibility(@Body @NotNull c body);

    @POST("/card-transfers/tokens")
    @NotNull
    d0<l0> getUrl();

    @PATCH
    @NotNull
    d0<n> submitPan(@Url @NotNull String url2, @Body @NotNull o body);
}
