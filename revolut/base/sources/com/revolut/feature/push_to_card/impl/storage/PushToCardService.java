package com.revolut.feature.push_to_card.impl.storage;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import lqa.f;
import mqa.e;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/storage/PushToCardService;", "", "Lefm/d0;", "", "Llqa/f;", "getCardOwners", "()Lefm/d0;", "", "id", "getCardOwner", "(Ljava/lang/String;)Lefm/d0;", "Lmqa/e;", "body", "createCardOwner", "(Lmqa/e;)Lefm/d0;", "cardOwnerId", "Lmqa/f;", "updateCardOwner", "(Ljava/lang/String;Lmqa/f;)Lefm/d0;", "Lefm/b;", "deleteCardOwner", "(Ljava/lang/String;)Lefm/b;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PushToCardService {
    @POST("/card-transfers/card-owners")
    @NotNull
    d0<f> createCardOwner(@Body @NotNull e body);

    @DELETE("/card-transfers/card-owners/{id}")
    @NotNull
    b deleteCardOwner(@Path("id") @NotNull String cardOwnerId);

    @GET("/card-transfers/card-owners/{id}")
    @NotNull
    d0<f> getCardOwner(@Path("id") @NotNull String id10);

    @GET("/card-transfers/card-owners")
    @NotNull
    d0<List<f>> getCardOwners();

    @PATCH("/card-transfers/card-owners/{id}")
    @NotNull
    d0<f> updateCardOwner(@Path("id") @NotNull String cardOwnerId, @Body @NotNull mqa.f body);
}
