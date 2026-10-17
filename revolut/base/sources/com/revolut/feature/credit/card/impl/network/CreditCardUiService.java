package com.revolut.feature.credit.card.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import xn4.a;
import xn4.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/network/CreditCardUiService;", "", "", "facilityId", "Lxn4/b;", "getInfoSectionsContent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sectionId", "Lxn4/a;", "getInfoSectionDetailsContent", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardUiService {
    @GET("/credit/{facilityId}/info/{sectionId}")
    Object getInfoSectionDetailsContent(@Path("facilityId") @NotNull String str, @Path("sectionId") @NotNull String str2, @NotNull Continuation<? super a> continuation);

    @GET("/credit/{facilityId}/info")
    Object getInfoSectionsContent(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super b> continuation);
}
