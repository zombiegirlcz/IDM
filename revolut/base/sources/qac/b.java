package qac;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayFlightBookingApiService;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import q97.l1;
import q97.q2;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayFlightBookingApiService f244017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f244018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re0.c f244019c;

    public b(RevolutPayFlightBookingApiService flightBookingApiService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(flightBookingApiService, "flightBookingApiService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f244017a = flightBookingApiService;
        this.f244018b = memoryCache;
        re0.d dVar = new re0.d(memoryCache, storage);
        l1 l1Var = new l1(24);
        q2 q2Var = new q2(14);
        q2 q2Var2 = new q2(15);
        pti.d dVar2 = new pti.d(this, null, 3);
        Type type = new TypeToken<oac.a>() { // from class: com.revolut.feature.revolutpay.order_tracking.impl.data.repository.FlightBookingRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f244019c = new re0.c(dVar, l1Var, type, q2Var, q2Var2, dVar2);
    }
}
