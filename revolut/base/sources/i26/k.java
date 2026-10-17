package i26;

import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.impl.data.api.DeFiAssetDetailsApiService;
import do3.q;
import g2e.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetDetailsApiService f157869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f157870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f157871c;
    public final CoroutineScope d;
    public final x4l.c e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f157872g;

    public k(DeFiAssetDetailsApiService service, ne0.j memoryCache, ue0.c storage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f157869a = service;
        this.f157870b = memoryCache;
        this.f157871c = storage;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        final int i = 0;
        x4l.c cVar = new x4l.c(new ghl.l(this, continuation, 15), new Function1(this) { // from class: i26.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f157859b;

            {
                this.f157859b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        f params = (f) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (DeFiAssetDetails) this.f157859b.f157870b.get(params.f157864c);
                    default:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (DeFiAssetDetails) this.f157859b.f157870b.get(params2.f157867c);
                }
            }
        }, new Function2(this) { // from class: i26.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f157861b;

            {
                this.f157861b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f params = (f) obj2;
                        DeFiAssetDetails entity = (DeFiAssetDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        this.f157861b.f157870b.f(params.f157864c, entity);
                        break;
                    default:
                        h params2 = (h) obj2;
                        DeFiAssetDetails entity2 = (DeFiAssetDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        this.f157861b.f157870b.f(params2.f157867c, entity2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 1), new m0(this, continuation, 26));
        this.e = cVar;
        this.f = q.f(cVar, appCoroutineScope);
        final int i2 = 1;
        this.f157872g = new x4l.c(new ghl.l(this, continuation, 14), new Function1(this) { // from class: i26.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f157859b;

            {
                this.f157859b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        f params = (f) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (DeFiAssetDetails) this.f157859b.f157870b.get(params.f157864c);
                    default:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (DeFiAssetDetails) this.f157859b.f157870b.get(params2.f157867c);
                }
            }
        }, new Function2(this) { // from class: i26.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f157861b;

            {
                this.f157861b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f params = (f) obj2;
                        DeFiAssetDetails entity = (DeFiAssetDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        this.f157861b.f157870b.f(params.f157864c, entity);
                        break;
                    default:
                        h params2 = (h) obj2;
                        DeFiAssetDetails entity2 = (DeFiAssetDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        this.f157861b.f157870b.f(params2.f157867c, entity2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 0), new m0(this, continuation, 25));
    }

    public final vkm.d a(String assetId, String fiatCurrency, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.e.b(new f(assetId, fiatCurrency), loadingStrategy);
    }
}
