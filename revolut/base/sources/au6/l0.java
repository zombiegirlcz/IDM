package au6;

import com.revolut.feature.freelancer.common.models.FreelancerCashbackInfo;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCashbackService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCashbackService f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9564c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f9565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f9566h;

    public l0(FreelancerCashbackService api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9562a = api2;
        this.f9563b = memoryCache;
        this.f9564c = storage;
        final int i = 0;
        new x4l.c(new i0(this, null, 3), new Function1(this) { // from class: au6.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9527b;

            {
                this.f9527b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (FreelancerCashbackInfo) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY");
                    case 1:
                        xi0.b it9 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (rr6.j) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (FreelancerCashbackRates) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_RATES");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (rr6.h) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER");
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (rr6.a) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG");
                }
            }
        }, new Function2(this) { // from class: au6.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9532b;

            {
                this.f9532b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        FreelancerCashbackInfo cashbackInfo = (FreelancerCashbackInfo) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY", cashbackInfo);
                        break;
                    case 1:
                        rr6.j cashbackInfo2 = (rr6.j) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo2, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO", cashbackInfo2);
                        break;
                    case 2:
                        FreelancerCashbackRates rates = (FreelancerCashbackRates) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_RATES", rates);
                        break;
                    case 3:
                        rr6.h cashbackBoosterTier = (rr6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterTier, "cashbackBoosterTier");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER", cashbackBoosterTier);
                        break;
                    default:
                        rr6.a cashbackBoosterConfig = (rr6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterConfig, "cashbackBoosterConfig");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG", cashbackBoosterConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, null, 4), new a09.p(this, (Continuation) null, 17));
        final int i2 = 1;
        this.d = new x4l.c(new a72.k(this, null, 8), new Function1(this) { // from class: au6.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9527b;

            {
                this.f9527b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (FreelancerCashbackInfo) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY");
                    case 1:
                        xi0.b it9 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (rr6.j) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (FreelancerCashbackRates) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_RATES");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (rr6.h) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER");
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (rr6.a) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG");
                }
            }
        }, new Function2(this) { // from class: au6.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9532b;

            {
                this.f9532b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        FreelancerCashbackInfo cashbackInfo = (FreelancerCashbackInfo) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY", cashbackInfo);
                        break;
                    case 1:
                        rr6.j cashbackInfo2 = (rr6.j) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo2, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO", cashbackInfo2);
                        break;
                    case 2:
                        FreelancerCashbackRates rates = (FreelancerCashbackRates) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_RATES", rates);
                        break;
                    case 3:
                        rr6.h cashbackBoosterTier = (rr6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterTier, "cashbackBoosterTier");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER", cashbackBoosterTier);
                        break;
                    default:
                        rr6.a cashbackBoosterConfig = (rr6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterConfig, "cashbackBoosterConfig");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG", cashbackBoosterConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, null, 3), new a09.p(this, (Continuation) null, 16));
        final int i3 = 2;
        this.e = new x4l.c(new i0(this, null, 4), new Function1(this) { // from class: au6.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9527b;

            {
                this.f9527b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (FreelancerCashbackInfo) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY");
                    case 1:
                        xi0.b it9 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (rr6.j) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (FreelancerCashbackRates) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_RATES");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (rr6.h) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER");
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (rr6.a) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG");
                }
            }
        }, new Function2(this) { // from class: au6.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9532b;

            {
                this.f9532b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        FreelancerCashbackInfo cashbackInfo = (FreelancerCashbackInfo) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY", cashbackInfo);
                        break;
                    case 1:
                        rr6.j cashbackInfo2 = (rr6.j) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo2, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO", cashbackInfo2);
                        break;
                    case 2:
                        FreelancerCashbackRates rates = (FreelancerCashbackRates) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_RATES", rates);
                        break;
                    case 3:
                        rr6.h cashbackBoosterTier = (rr6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterTier, "cashbackBoosterTier");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER", cashbackBoosterTier);
                        break;
                    default:
                        rr6.a cashbackBoosterConfig = (rr6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterConfig, "cashbackBoosterConfig");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG", cashbackBoosterConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, null, 5), new a09.p(this, (Continuation) null, 18));
        this.f = new x4l.c(new i0(this, null, 2), new a26.p(this, 5), new k0(this, 0), new j0(this, null, 2), new a09.p(this, (Continuation) null, 15));
        final int i5 = 3;
        this.f9565g = new x4l.c(new i0(this, null, 1), new Function1(this) { // from class: au6.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9527b;

            {
                this.f9527b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (FreelancerCashbackInfo) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY");
                    case 1:
                        xi0.b it9 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (rr6.j) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (FreelancerCashbackRates) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_RATES");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (rr6.h) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER");
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (rr6.a) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG");
                }
            }
        }, new Function2(this) { // from class: au6.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9532b;

            {
                this.f9532b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        FreelancerCashbackInfo cashbackInfo = (FreelancerCashbackInfo) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY", cashbackInfo);
                        break;
                    case 1:
                        rr6.j cashbackInfo2 = (rr6.j) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo2, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO", cashbackInfo2);
                        break;
                    case 2:
                        FreelancerCashbackRates rates = (FreelancerCashbackRates) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_RATES", rates);
                        break;
                    case 3:
                        rr6.h cashbackBoosterTier = (rr6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterTier, "cashbackBoosterTier");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER", cashbackBoosterTier);
                        break;
                    default:
                        rr6.a cashbackBoosterConfig = (rr6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterConfig, "cashbackBoosterConfig");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG", cashbackBoosterConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, null, 1), new a09.p(this, (Continuation) null, 14));
        final int i6 = 4;
        this.f9566h = new x4l.c(new i0(this, null, 0), new Function1(this) { // from class: au6.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9527b;

            {
                this.f9527b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (FreelancerCashbackInfo) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY");
                    case 1:
                        xi0.b it9 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (rr6.j) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_INFO");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (FreelancerCashbackRates) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_RATES");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (rr6.h) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER");
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (rr6.a) this.f9527b.f9563b.get("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG");
                }
            }
        }, new Function2(this) { // from class: au6.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f9532b;

            {
                this.f9532b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        FreelancerCashbackInfo cashbackInfo = (FreelancerCashbackInfo) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO_LEGACY", cashbackInfo);
                        break;
                    case 1:
                        rr6.j cashbackInfo2 = (rr6.j) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackInfo2, "cashbackInfo");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_INFO", cashbackInfo2);
                        break;
                    case 2:
                        FreelancerCashbackRates rates = (FreelancerCashbackRates) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_RATES", rates);
                        break;
                    case 3:
                        rr6.h cashbackBoosterTier = (rr6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterTier, "cashbackBoosterTier");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_TIER", cashbackBoosterTier);
                        break;
                    default:
                        rr6.a cashbackBoosterConfig = (rr6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoosterConfig, "cashbackBoosterConfig");
                        this.f9532b.f9563b.f("MEMORY_CACHE_KEY_CASHBACK_BOOSTER_CONFIG", cashbackBoosterConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, null, 0), new a09.p(this, (Continuation) null, 13));
    }
}
