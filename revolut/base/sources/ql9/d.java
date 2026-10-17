package ql9;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.pay_with_smile.impl.data.network.BiometricPaymentsSettingsService;
import elm.f;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import qd8.e;
import qjj.g;
import ql6.s;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricPaymentsSettingsService f247559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f247560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re0.c f247561c;

    public d(BiometricPaymentsSettingsService service, fn2.c productCatalogueLoader, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f247559a = service;
        this.f247560b = productCatalogueLoader;
        re0.d dVar = new re0.d(memoryCache, storage);
        s sVar = new s(1);
        g gVar = new g(7);
        g gVar2 = new g(8);
        pti.s sVar2 = new pti.s(this, null, 5);
        Type type = new TypeToken<pl9.g>() { // from class: com.revolut.feature.pay_with_smile.impl.data.repository.BiometricPaymentsSettingsRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f247561c = new re0.c(dVar, sVar, type, gVar, gVar2, sVar2);
    }

    public final Object a(String str, nl9.a aVar, sxe.g gVar) throws Throwable {
        e eVar = new e(this, str, aVar, (Continuation) null, 7);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, eVar, gVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
