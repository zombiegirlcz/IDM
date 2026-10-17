package e8h;

import com.revolut.feature.wealth.impl.data.network.trader_profile.TraderProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {

    @NotNull
    private static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TraderProfileService f123713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f123714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8h.a f123715c;
    public final ue0.c d;
    public final w4l.f e;

    public n0(TraderProfileService service, ne0.j memoryCache, d8h.a domainMapper, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(domainMapper, "domainMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f123713a = service;
        this.f123714b = memoryCache;
        this.f123715c = domainMapper;
        this.d = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: e8h.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f123709b;

            {
                this.f123709b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    case 1:
                        d8h.b traderProfile = (d8h.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(traderProfile, "traderProfile");
                        this.f123709b.f123714b.f("CACHE_TRADER_PROFILE", traderProfile);
                        break;
                    default:
                        d8h.b traderProfile2 = (d8h.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(traderProfile2, "traderProfile");
                        this.f123709b.d.G(traderProfile2, "CACHE_TRADER_PROFILE", wim.z.d(kotlin.jvm.internal.o0.b(d8h.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        k0 k0Var = new k0(this, 1);
        Function2 function22 = new Function2(this) { // from class: e8h.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f123709b;

            {
                this.f123709b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    case 1:
                        d8h.b traderProfile = (d8h.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(traderProfile, "traderProfile");
                        this.f123709b.f123714b.f("CACHE_TRADER_PROFILE", traderProfile);
                        break;
                    default:
                        d8h.b traderProfile2 = (d8h.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(traderProfile2, "traderProfile");
                        this.f123709b.d.G(traderProfile2, "CACHE_TRADER_PROFILE", wim.z.d(kotlin.jvm.internal.o0.b(d8h.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, k0Var, function22, new k0(this, 2), new Function2(this) { // from class: e8h.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f123709b;

            {
                this.f123709b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    case 1:
                        d8h.b traderProfile = (d8h.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(traderProfile, "traderProfile");
                        this.f123709b.f123714b.f("CACHE_TRADER_PROFILE", traderProfile);
                        break;
                    default:
                        d8h.b traderProfile2 = (d8h.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(traderProfile2, "traderProfile");
                        this.f123709b.d.G(traderProfile2, "CACHE_TRADER_PROFILE", wim.z.d(kotlin.jvm.internal.o0.b(d8h.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
