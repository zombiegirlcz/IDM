package l05;

import com.revolut.feature.credit.health.impl.data.network.CreditHealthService;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsights;
import h30.l;
import java.time.LocalDate;
import k3c.k;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditHealthService f191181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f191182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f191183c;
    public final x4l.c d;
    public final x4l.c e;

    public g(CreditHealthService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f191181a = service;
        this.f191182b = memoryCache;
        this.f191183c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new k(this, continuation, 9), new Function1(this) { // from class: l05.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191178b;

            {
                this.f191178b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (CreditScoreInsights) this.f191178b.f191182b.get("credit-score-insights-latest");
                    default:
                        LocalDate date = (LocalDate) obj2;
                        Intrinsics.checkNotNullParameter(date, "date");
                        return (CreditScoreInsights) this.f191178b.f191182b.get(g.a(date));
                }
            }
        }, new Function2(this) { // from class: l05.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191180b;

            {
                this.f191180b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        CreditScoreInsights domain = (CreditScoreInsights) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.d dVar = this.f191180b.f191182b;
                        dVar.f("credit-score-insights-latest", domain);
                        dVar.f(g.a(domain.f69988a), domain);
                        break;
                    default:
                        LocalDate date = (LocalDate) obj2;
                        CreditScoreInsights domain2 = (CreditScoreInsights) obj3;
                        Intrinsics.checkNotNullParameter(date, "date");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f191180b.f191182b.f(g.a(date), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ko2.b(this, continuation, 15), new b(this, continuation, 1));
        final int i2 = 1;
        this.e = new x4l.c(new x(this, continuation, 11), new Function1(this) { // from class: l05.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191178b;

            {
                this.f191178b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (CreditScoreInsights) this.f191178b.f191182b.get("credit-score-insights-latest");
                    default:
                        LocalDate date = (LocalDate) obj2;
                        Intrinsics.checkNotNullParameter(date, "date");
                        return (CreditScoreInsights) this.f191178b.f191182b.get(g.a(date));
                }
            }
        }, new Function2(this) { // from class: l05.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191180b;

            {
                this.f191180b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        CreditScoreInsights domain = (CreditScoreInsights) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.d dVar = this.f191180b.f191182b;
                        dVar.f("credit-score-insights-latest", domain);
                        dVar.f(g.a(domain.f69988a), domain);
                        break;
                    default:
                        LocalDate date = (LocalDate) obj2;
                        CreditScoreInsights domain2 = (CreditScoreInsights) obj3;
                        Intrinsics.checkNotNullParameter(date, "date");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f191180b.f191182b.f(g.a(date), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new krc.h(this, continuation, 25), new j40.d(this, continuation, 20));
    }

    public static String a(LocalDate localDate) {
        return l.s("credit-score-insights-date-", localDate);
    }
}
