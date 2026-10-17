package o36;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.defi.exchange.impl.data.network.CeFiToDeFiAssetsService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n36.i;
import ne0.j;
import nzj.n;
import o29.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CeFiToDeFiAssetsService f221701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.c f221702b;

    public b(CeFiToDeFiAssetsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f221701a = service;
        re0.d dVar = new re0.d(memoryCache, storage);
        n nVar = new n(1, Companion, a.class, "cacheKey", "cacheKey$feature_defi_exchange_impl_release(Lcom/revolut/core/model/currency/Currency;)Ljava/lang/String;", 0, 6);
        nz7.g gVar = new nz7.g(19);
        nz7.g gVar2 = new nz7.g(20);
        l lVar = new l(this, null, 2);
        Type type = new TypeToken<List<? extends i>>() { // from class: com.revolut.feature.defi.exchange.impl.data.repository.CeFiToDeFiAssetsRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f221702b = new re0.c(dVar, nVar, type, gVar, gVar2, lVar);
    }
}
