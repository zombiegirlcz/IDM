package xr3;

import ch.qos.logback.core.spi.ComponentTracker;
import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import ft3.g1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf0.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.p f308223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditOnboardingService f308224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f308225c;
    public final ve0.c d;
    public final sf0.h e;
    public final qe0.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f308226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f308227h;
    public final x4l.c i;

    public k(mp.p creditApplicationDtoMapper, CreditOnboardingService api2, ne0.d memoryCache, ve0.c storage, sf0.h serverErrorParser, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f308223a = creditApplicationDtoMapper;
        this.f308224b = api2;
        this.f308225c = memoryCache;
        this.d = storage;
        this.e = serverErrorParser;
        this.f = ((ze0.c) forceReloadStrategyFactory).a(storage, ComponentTracker.DEFAULT_TIMEOUT);
        Continuation continuation = null;
        final int i = 0;
        int i2 = 7;
        this.f308226g = new x4l.c(new akl.v(this, continuation, 5), new Function1(this) { // from class: xr3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f308213b;

            {
                this.f308213b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (cs3.b) this.f308213b.f308225c.get("credit-configuration");
                    case 1:
                        i productClassification = (i) obj2;
                        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                        return (it3.i) this.f308213b.f308225c.get(k.a(productClassification));
                    default:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f308213b.f308225c.get(hx7.e.o(params));
                }
            }
        }, new Function2(this) { // from class: xr3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f308218b;

            {
                this.f308218b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        cs3.b configuration = (cs3.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        this.f308218b.f308225c.f("credit-configuration", configuration);
                        break;
                    case 1:
                        i productClassification = (i) obj2;
                        it3.i eligibility = (it3.i) obj3;
                        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        this.f308218b.f308225c.f(k.a(productClassification), eligibility);
                        break;
                    default:
                        c params = (c) obj2;
                        List applications = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(applications, "applications");
                        this.f308218b.f308225c.f(hx7.e.o(params), applications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.w(this, continuation, 11), new akl.x(this, continuation, i2));
        ald.n nVar = new ald.n(this, continuation, i2);
        final int i3 = 1;
        this.f308227h = new x4l.c(nVar, new Function1(this) { // from class: xr3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f308213b;

            {
                this.f308213b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (cs3.b) this.f308213b.f308225c.get("credit-configuration");
                    case 1:
                        i productClassification = (i) obj2;
                        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                        return (it3.i) this.f308213b.f308225c.get(k.a(productClassification));
                    default:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f308213b.f308225c.get(hx7.e.o(params));
                }
            }
        }, new Function2(this) { // from class: xr3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f308218b;

            {
                this.f308218b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        cs3.b configuration = (cs3.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        this.f308218b.f308225c.f("credit-configuration", configuration);
                        break;
                    case 1:
                        i productClassification = (i) obj2;
                        it3.i eligibility = (it3.i) obj3;
                        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        this.f308218b.f308225c.f(k.a(productClassification), eligibility);
                        break;
                    default:
                        c params = (c) obj2;
                        List applications = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(applications, "applications");
                        this.f308218b.f308225c.f(hx7.e.o(params), applications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ald.p(this, continuation, 14), new ald.q(this, continuation, 6));
        final int i5 = 2;
        this.i = new x4l.c(new wqj.g(this, continuation, 9), new Function1(this) { // from class: xr3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f308213b;

            {
                this.f308213b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (cs3.b) this.f308213b.f308225c.get("credit-configuration");
                    case 1:
                        i productClassification = (i) obj2;
                        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                        return (it3.i) this.f308213b.f308225c.get(k.a(productClassification));
                    default:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f308213b.f308225c.get(hx7.e.o(params));
                }
            }
        }, new Function2(this) { // from class: xr3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f308218b;

            {
                this.f308218b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        cs3.b configuration = (cs3.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        this.f308218b.f308225c.f("credit-configuration", configuration);
                        break;
                    case 1:
                        i productClassification = (i) obj2;
                        it3.i eligibility = (it3.i) obj3;
                        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        this.f308218b.f308225c.f(k.a(productClassification), eligibility);
                        break;
                    default:
                        c params = (c) obj2;
                        List applications = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(applications, "applications");
                        this.f308218b.f308225c.f(hx7.e.o(params), applications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new r0(5), new uyd.e0(21));
    }

    public static String a(i iVar) {
        String strI = g1.i(iVar.b().E2());
        gt3.f fVarA4 = iVar.b().A4();
        Object[] elements = {"PRODUCT_ELIGIBILITY_KEY", strI, fVarA4 != null ? hb9.b.G(fVarA4) : null, iVar.b().d()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }
}
