package ej9;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import dj9.g0;
import dp4.a1;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterApiService f126808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.a f126809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re0.c f126810c;
    public final re0.c d;

    public f0(PayLaterApiService api2, ne0.d memoryCache, ue0.c storage, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f126808a = api2;
        this.f126809b = idempotencyKeyHolder;
        re0.d dVar = new re0.d(memoryCache, storage);
        ej6.x xVar = new ej6.x(15);
        t tVar = new t(6);
        t tVar2 = new t(7);
        Continuation continuation = null;
        a1 a1Var = new a1(this, continuation, 17);
        Type type = new TypeToken<dj9.f0>() { // from class: com.revolut.feature.pay_later.impl.repositories.RightToCancelRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f126810c = new re0.c(dVar, xVar, type, tVar, tVar2, a1Var);
        re0.d dVar2 = new re0.d(memoryCache, storage);
        ej6.x xVar2 = new ej6.x(16);
        t tVar3 = new t(8);
        t tVar4 = new t(9);
        a1 a1Var2 = new a1(this, continuation, 18);
        Type type2 = new TypeToken<g0>() { // from class: com.revolut.feature.pay_later.impl.repositories.RightToCancelRepositoryImpl$special$$inlined$invoke$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        this.d = new re0.c(dVar2, xVar2, type2, tVar3, tVar4, a1Var2);
    }
}
