package gcc;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.revolutpay.promoted_merchants.impl.data.service.RevolutPayPromotedMerchantsApiService;
import e31.i;
import gaf.l;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayPromotedMerchantsApiService f142401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f142402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd0.d f142403c;
    public final re0.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re0.c f142404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f142405h;

    public g(RevolutPayPromotedMerchantsApiService service, j memoryCache, fd0.d merchantsMemoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(merchantsMemoryCache, "merchantsMemoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f142401a = service;
        this.f142402b = memoryCache;
        this.f142403c = merchantsMemoryCache;
        re0.d dVar = new re0.d(memoryCache, storage);
        l lVar = new l(15);
        g5k.f fVar = new g5k.f(29);
        c cVar = new c(0);
        Continuation continuation = null;
        f fVar2 = new f(this, continuation, 1);
        Type type = new TypeToken<fcc.f>() { // from class: com.revolut.feature.revolutpay.promoted_merchants.impl.data.repository.PromotedMerchantsRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.d = new re0.c(dVar, lVar, type, fVar, cVar, fVar2);
        final int i = 1;
        int i2 = 2;
        int i3 = 3;
        this.e = new x4l.c(new f(this, continuation, 0), new Function1(this) { // from class: gcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142394b;

            {
                this.f142394b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v7.r("PROMOTED_MERCHANTS_CLAIM_INSTRUCTIONS_KEY_", id10, this.f142394b.f142402b);
                    case 1:
                        ((Boolean) obj2).booleanValue();
                        return (List) this.f142394b.f142402b.get("PROMOTED_MERCHANTS_CATEGORIES_KEY");
                    default:
                        ucc.g params = (ucc.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f142394b.f142403c.c(params);
                }
            }
        }, new b(this, i), new i(i2, 22, continuation), new eci.a(i3, 15, continuation));
        final int i5 = 2;
        this.f = new x4l.c(new frk.a(this, continuation, 23), new Function1(this) { // from class: gcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142394b;

            {
                this.f142394b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v7.r("PROMOTED_MERCHANTS_CLAIM_INSTRUCTIONS_KEY_", id10, this.f142394b.f142402b);
                    case 1:
                        ((Boolean) obj2).booleanValue();
                        return (List) this.f142394b.f142402b.get("PROMOTED_MERCHANTS_CATEGORIES_KEY");
                    default:
                        ucc.g params = (ucc.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f142394b.f142403c.c(params);
                }
            }
        }, new b(this, 2), new i(i2, 23, continuation), new eci.a(i3, 16, continuation));
        re0.d dVar2 = new re0.d(memoryCache, storage);
        l lVar2 = new l(14);
        g5k.f fVar3 = new g5k.f(27);
        g5k.f fVar4 = new g5k.f(28);
        frk.a aVar = new frk.a(this, continuation, 24);
        Type type2 = new TypeToken<List<? extends fcc.e>>() { // from class: com.revolut.feature.revolutpay.promoted_merchants.impl.data.repository.PromotedMerchantsRepositoryImpl$special$$inlined$invoke$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        this.f142404g = new re0.c(dVar2, lVar2, type2, fVar3, fVar4, aVar);
        final int i6 = 0;
        this.f142405h = new x4l.c(new frk.a(this, continuation, 22), new Function1(this) { // from class: gcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142394b;

            {
                this.f142394b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v7.r("PROMOTED_MERCHANTS_CLAIM_INSTRUCTIONS_KEY_", id10, this.f142394b.f142402b);
                    case 1:
                        ((Boolean) obj2).booleanValue();
                        return (List) this.f142394b.f142402b.get("PROMOTED_MERCHANTS_CATEGORIES_KEY");
                    default:
                        ucc.g params = (ucc.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f142394b.f142403c.c(params);
                }
            }
        }, new b(this, i6), new i(i2, 21, continuation), new eci.a(i3, 14, continuation));
    }
}
