package com.revolut.shared.feature.cards.domain.impl.data.network.config;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import q5l.b;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/cards/domain/impl/data/network/config/CardConfigService;", "", "", "enabledExperiments", "Lefm/d0;", "Lq5l/b;", "getCardsConfig", "(Ljava/lang/String;)Lefm/d0;", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardConfigService {
    @GET("my-card/config")
    @NotNull
    d0<b> getCardsConfig(@Header("X-Enabled-Experiments") String enabledExperiments);
}
