package com.revolut.feature.insurance_home.impl.data.network;

import com.revolut.feature.insurance_home.impl.data.model.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/network/InsuranceHomeService;", "", "Lcom/revolut/feature/insurance_home/impl/data/model/f;", "getHomeTiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InsuranceHomeService {
    @GET("insurance/home")
    Object getHomeTiles(@NotNull Continuation<? super f> continuation);
}
