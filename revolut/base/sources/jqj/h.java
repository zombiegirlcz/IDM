package jqj;

import com.revolut.retail.feature.impl.analytics_cycle.network.AnalyticsSpendingCycleService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements od0.e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f177736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f177737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingCycleService f177738c;
    public final kzi.a d;
    public final x4l.c e;
    public final x4l.c f;

    public h(ue0.c storage, ne0.d memoryCache, AnalyticsSpendingCycleService service, kzi.a analyticsPeriodIntervalMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(analyticsPeriodIntervalMapper, "analyticsPeriodIntervalMapper");
        this.f177736a = storage;
        this.f177737b = memoryCache;
        this.f177738c = service;
        this.d = analyticsPeriodIntervalMapper;
        final int i = 0;
        Continuation continuation = null;
        this.e = new x4l.c(new d(this, continuation, i), new Function1(this) { // from class: jqj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f177730b;

            {
                this.f177730b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (lzi.h) this.f177730b.f177737b.get("KEY_CYCLE");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (lzi.j) this.f177730b.f177737b.get("KEY_PERIOD");
                }
            }
        }, new Function2(this) { // from class: jqj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f177732b;

            {
                this.f177732b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        lzi.h value = (lzi.h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f177732b.f177737b.f("KEY_CYCLE", value);
                        break;
                    default:
                        lzi.j value2 = (lzi.j) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f177732b.f177737b.f("KEY_PERIOD", value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, i), new hwi.b(this, continuation, 15));
        final int i2 = 1;
        this.f = new x4l.c(new d(this, continuation, i2), new Function1(this) { // from class: jqj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f177730b;

            {
                this.f177730b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (lzi.h) this.f177730b.f177737b.get("KEY_CYCLE");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (lzi.j) this.f177730b.f177737b.get("KEY_PERIOD");
                }
            }
        }, new Function2(this) { // from class: jqj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f177732b;

            {
                this.f177732b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        lzi.h value = (lzi.h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f177732b.f177737b.f("KEY_CYCLE", value);
                        break;
                    default:
                        lzi.j value2 = (lzi.j) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f177732b.f177737b.f("KEY_PERIOD", value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, i2), new eci.a(3, 25, continuation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r8.e.d(r9, false, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lzi.h r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jqj.h.a(lzi.h, gim.c):java.lang.Object");
    }

    public final void b(lzi.j analyticsSpendingPeriod) {
        Intrinsics.checkNotNullParameter(analyticsSpendingPeriod, "analyticsSpendingPeriod");
        if (analyticsSpendingPeriod.f200980a != lzi.i.CUSTOM) {
            this.f177737b.f("KEY_FIXED_PERIOD", analyticsSpendingPeriod);
        }
        Unit unit = Unit.f186387a;
        x4l.c cVar = this.f;
        cVar.g(unit, analyticsSpendingPeriod);
        x4l.c.a(cVar, new jpl.e(7));
    }

    @Override // od0.e
    public final void clear() {
        this.f177736a.clear();
        this.f177737b.clear();
    }
}
