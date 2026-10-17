package com.revolut.feature.cards_core.impl.data.network.revolutcard;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import y93.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cards_core/impl/data/network/revolutcard/RevolutCardScaService;", "", "Lefm/d0;", "", "Ly93/b;", "getScaCounters", "()Lefm/d0;", "", "cardId", "Lefm/b;", "resetSca", "(Ljava/lang/String;)Lefm/b;", "resetScaAll", "()Lefm/b;", "feature_cards_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutCardScaService {
    @GET("my-card/sca-counters")
    @NotNull
    d0<List<b>> getScaCounters();

    @POST("my-card/{id}/sca-reset")
    @NotNull
    efm.b resetSca(@Path("id") @NotNull String cardId);

    @POST("my-card/sca-reset")
    @NotNull
    efm.b resetScaAll();
}
