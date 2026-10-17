package com.revolut.feature.card.tokenization.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Url;
import zu2.a;
import zu2.b;
import zu2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card/tokenization/impl/data/network/CardTokenizationService;", "", "Lefm/d0;", "Lzu2/c;", "getUrl", "()Lefm/d0;", "", "url", "Lzu2/a;", "body", "Lzu2/b;", "submitPan", "(Ljava/lang/String;Lzu2/a;)Lefm/d0;", "feature_card_tokenization_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardTokenizationService {
    @POST("/card-tokens")
    @NotNull
    d0<c> getUrl();

    @PATCH
    @NotNull
    d0<b> submitPan(@Url @NotNull String url2, @Body @NotNull a body);
}
