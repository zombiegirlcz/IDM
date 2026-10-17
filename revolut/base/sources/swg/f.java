package swg;

import com.revolut.feature.wealth.analytics.insights.network.PortfolioInsightsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pwg.n;
import pwg.p;
import sek.q;
import ss4.a0;
import ss4.z;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioInsightsService f266218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twg.c f266219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f266220c;
    public final a d;
    public final x4l.c e;
    public final x4l.c f;

    public f(PortfolioInsightsService service, twg.c dao, ne0.d memoryCache, a dataMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dataMapper, "dataMapper");
        this.f266218a = service;
        this.f266219b = dao;
        this.f266220c = memoryCache;
        this.d = dataMapper;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new pti.d(this, continuation, 24), new Function1(this) { // from class: swg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f266213b;

            {
                this.f266213b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        p params = (p) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (pwg.a) v1.c.s("MEMORY_KEY_PORTFOLIO_INSIGHTS_", params.f240476a, this.f266213b.f266220c);
                    default:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (pwg.d) this.f266213b.f266220c.get("MEMORY_KEY_INDICATOR_" + params2.f240475b + "_" + params2.f240474a);
                }
            }
        }, new Function2(this) { // from class: swg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f266215b;

            {
                this.f266215b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        p params = (p) obj2;
                        pwg.a portfolioInsights = (pwg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(portfolioInsights, "portfolioInsights");
                        this.f266215b.f266220c.f("MEMORY_KEY_PORTFOLIO_INSIGHTS_" + params.f240476a, portfolioInsights);
                        break;
                    default:
                        n params2 = (n) obj2;
                        pwg.d portfolioInsightsAssetIndicator = (pwg.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(portfolioInsightsAssetIndicator, "portfolioInsightsAssetIndicator");
                        this.f266215b.f266220c.f(a0.d.s("MEMORY_KEY_INDICATOR_", params2.f240475b, "_", params2.f240474a), portfolioInsightsAssetIndicator);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, 1), new s9b.n(this, continuation, 15));
        final int i2 = 1;
        this.f = new x4l.c(new s9b.n(this, continuation, 13), new Function1(this) { // from class: swg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f266213b;

            {
                this.f266213b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        p params = (p) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (pwg.a) v1.c.s("MEMORY_KEY_PORTFOLIO_INSIGHTS_", params.f240476a, this.f266213b.f266220c);
                    default:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (pwg.d) this.f266213b.f266220c.get("MEMORY_KEY_INDICATOR_" + params2.f240475b + "_" + params2.f240474a);
                }
            }
        }, new Function2(this) { // from class: swg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f266215b;

            {
                this.f266215b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        p params = (p) obj2;
                        pwg.a portfolioInsights = (pwg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(portfolioInsights, "portfolioInsights");
                        this.f266215b.f266220c.f("MEMORY_KEY_PORTFOLIO_INSIGHTS_" + params.f240476a, portfolioInsights);
                        break;
                    default:
                        n params2 = (n) obj2;
                        pwg.d portfolioInsightsAssetIndicator = (pwg.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(portfolioInsightsAssetIndicator, "portfolioInsightsAssetIndicator");
                        this.f266215b.f266220c.f(a0.d.s("MEMORY_KEY_INDICATOR_", params2.f240475b, "_", params2.f240474a), portfolioInsightsAssetIndicator);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, 0), new s9b.n(this, continuation, 14));
        new x4l.c(new e(this, null, 0), new z(this, 17), new a0(this, 10), new q(this, continuation, 25), new e(this, null, 1));
    }
}
