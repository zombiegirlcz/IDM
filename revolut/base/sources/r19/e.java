package r19;

import com.revolut.feature.lifestyle.content_gateway.impl.network.LifestyleContentGatewayService;
import f19.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import r0e.i;
import rfm.f0;
import rfm.m;
import w4l.f;
import wim.z;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleContentGatewayService f250932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f250933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f250934c;
    public final w39.b d;
    public final f e;

    public e(LifestyleContentGatewayService service, ne0.d memoryCache, ue0.c storage, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f250932a = service;
        this.f250933b = memoryCache;
        this.f250934c = storage;
        this.d = locationInteractor;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: r19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f250927b;

            {
                this.f250927b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        e eVar = this.f250927b;
                        m mVar = new m(((z39.b) eVar.d).f319221b.c(), new qza.a(12, new i(12)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new i(13)), new qza.a(11, new r10.b(eVar, params, 14)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        break;
                    case 1:
                        d params2 = (d) obj2;
                        g placement = (g) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(placement, "placement");
                        this.f250927b.f250933b.f(e.a(params2), placement);
                        break;
                    default:
                        d params3 = (d) obj2;
                        g placement2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(placement2, "placement");
                        this.f250927b.f250934c.G(placement2, e.b(params3), z.d(o0.b(g.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: r19.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f250929b;

            {
                this.f250929b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d params = (d) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (g) this.f250929b.f250933b.get(e.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (g) j6.a.k(g.class, this.f250929b.f250934c, e.b(params));
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: r19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f250927b;

            {
                this.f250927b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        e eVar = this.f250927b;
                        m mVar = new m(((z39.b) eVar.d).f319221b.c(), new qza.a(12, new i(12)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new i(13)), new qza.a(11, new r10.b(eVar, params, 14)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        break;
                    case 1:
                        d params2 = (d) obj2;
                        g placement = (g) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(placement, "placement");
                        this.f250927b.f250933b.f(e.a(params2), placement);
                        break;
                    default:
                        d params3 = (d) obj2;
                        g placement2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(placement2, "placement");
                        this.f250927b.f250934c.G(placement2, e.b(params3), z.d(o0.b(g.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: r19.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f250929b;

            {
                this.f250929b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d params = (d) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (g) this.f250929b.f250933b.get(e.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (g) j6.a.k(g.class, this.f250929b.f250934c, e.b(params));
                }
            }
        };
        final int i3 = 2;
        this.e = new f(function2, function1, function22, function12, new Function2(this) { // from class: r19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f250927b;

            {
                this.f250927b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        e eVar = this.f250927b;
                        m mVar = new m(((z39.b) eVar.d).f319221b.c(), new qza.a(12, new i(12)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new i(13)), new qza.a(11, new r10.b(eVar, params, 14)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        break;
                    case 1:
                        d params2 = (d) obj2;
                        g placement = (g) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(placement, "placement");
                        this.f250927b.f250933b.f(e.a(params2), placement);
                        break;
                    default:
                        d params3 = (d) obj2;
                        g placement2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(placement2, "placement");
                        this.f250927b.f250934c.G(placement2, e.b(params3), z.d(o0.b(g.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(d dVar) {
        return v1.c.t(dVar.f250931b.hashCode(), "PLACEMENT_MEMORY_KEY_", dVar.f250930a.name(), "_");
    }

    public static String b(d dVar) {
        return v1.c.t(dVar.f250931b.hashCode(), "PLACEMENT_STORAGE_KEY_", dVar.f250930a.name(), "_");
    }
}
