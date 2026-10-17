package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mfj.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Query;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJT\u0010\u000e\u001a\u00020\u00072\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimDataPlanServiceMock;", "Lcom/revolut/retail/feature/esim/impl/network/EsimDataPlanService;", "<init>", "()V", "", "changesFrom", "receiverUsername", "Lmfj/b;", "getDataPlans", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "mobilePlanIds", "simProfileIds", "upgradesFrom", "getMobilePlans", "([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimDataPlanServiceMock implements EsimDataPlanService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EsimDataPlanServiceMock f100568a = new EsimDataPlanServiceMock();

    private EsimDataPlanServiceMock() {
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimDataPlanService
    public Object getDataPlans(@Query("changesFrom") String str, @Query("receiverUsername") String str2, @NotNull Continuation<? super b> continuation) {
        return new b(f0.f322471a);
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimDataPlanService
    public Object getMobilePlans(@NotNull @Query("id") String[] strArr, @NotNull @Query("sim-profile-id") String[] strArr2, @Query("upgradesFrom") String str, @Query("changesFrom") String str2, @Query("receiverUsername") String str3, @NotNull Continuation<? super b> continuation) {
        return new b(f0.f322471a);
    }
}
