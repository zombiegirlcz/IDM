package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesCheckoutService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements n {

    @NotNull
    public static final r Companion = new r();
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f156255g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungePassesCheckoutService f156256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156258c;
    public final x4l.c d;
    public final x4l.c e;

    static {
        pkm.e eVar = pkm.e.SECONDS;
        f = kotlin.time.c.g(1, eVar);
        f156255g = kotlin.time.c.g(5, eVar);
    }

    public v(AirportLoungePassesCheckoutService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156256a = service;
        this.f156257b = storage;
        this.f156258c = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new e6d.f(this, continuation, 20), new Function1(this) { // from class: hwi.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f156240b;

            {
                this.f156240b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (svi.o0) this.f156240b.f156258c.get("KEY_PASSES_QUOTES");
                    default:
                        q it9 = (q) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (svi.i0) this.f156240b.f156258c.get("KEY_PASSES_PRICING");
                }
            }
        }, new Function2(this) { // from class: hwi.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f156244b;

            {
                this.f156244b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        svi.o0 quotes = (svi.o0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(quotes, "quotes");
                        this.f156244b.f156258c.f("KEY_PASSES_QUOTES", quotes);
                        break;
                    default:
                        svi.i0 domain = (svi.i0) obj3;
                        Intrinsics.checkNotNullParameter((q) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f156244b.f156258c.f("KEY_PASSES_PRICING", domain);
                        break;
                }
                return Unit.f186387a;
            }
        }, new u(this, continuation, i), new b(this, continuation, 2));
        final int i2 = 1;
        this.e = new x4l.c(new ghl.l(this, continuation, 11), new Function1(this) { // from class: hwi.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f156240b;

            {
                this.f156240b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (svi.o0) this.f156240b.f156258c.get("KEY_PASSES_QUOTES");
                    default:
                        q it9 = (q) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (svi.i0) this.f156240b.f156258c.get("KEY_PASSES_PRICING");
                }
            }
        }, new Function2(this) { // from class: hwi.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f156244b;

            {
                this.f156244b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        svi.o0 quotes = (svi.o0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(quotes, "quotes");
                        this.f156244b.f156258c.f("KEY_PASSES_QUOTES", quotes);
                        break;
                    default:
                        svi.i0 domain = (svi.i0) obj3;
                        Intrinsics.checkNotNullParameter((q) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f156244b.f156258c.f("KEY_PASSES_PRICING", domain);
                        break;
                }
                return Unit.f186387a;
            }
        }, new u(this, continuation, i2), new b(this, continuation, 3));
    }

    public static final kotlin.time.b a(v vVar, Response response, String str) {
        Long lN;
        vVar.getClass();
        String strA = response.headers().a(str);
        if (strA == null || (lN = kotlin.text.z.n(strA)) == null) {
            return null;
        }
        return new kotlin.time.b(kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS));
    }
}
