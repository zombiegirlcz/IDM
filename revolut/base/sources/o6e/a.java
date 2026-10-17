package o6e;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.subaccount.impl.network.SubaccountLinkService;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import o29.l;
import re0.c;
import re0.d;
import w6e.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountLinkService f222569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f222570b;

    public a(SubaccountLinkService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f222569a = service;
        d dVar = new d(memoryCache, storage);
        o69.b bVar = new o69.b(2);
        o4a.a aVar = new o4a.a(6);
        o4a.a aVar2 = new o4a.a(7);
        l lVar = new l(this, null, 4);
        Type type = new TypeToken<f>() { // from class: com.revolut.feature.subaccount.impl.data.SubaccountLinkRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f222570b = new c(dVar, bVar, type, aVar, aVar2, lVar);
    }
}
