package lrk;

import com.revolut.retail.feature.stockdetails.impl.data.network.StockInsightsService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mel.i0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StockInsightsService f199542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f199543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f199544c;
    public final ue0.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f199545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f199546h;

    public o(StockInsightsService insightsService, ne0.j memoryCache, x4l.c analystRatingsDod, ue0.c storage) {
        Intrinsics.checkNotNullParameter(insightsService, "insightsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(analystRatingsDod, "analystRatingsDod");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f199542a = insightsService;
        this.f199543b = memoryCache;
        this.f199544c = analystRatingsDod;
        this.d = storage;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new m(this, continuation, 1), new Function1(this) { // from class: lrk.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199536b;

            {
                this.f199536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it8 = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.p) this.f199536b.f199543b.get(o.b(it8));
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.m) this.f199536b.f199543b.get(o.a(it8));
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i0) this.f199536b.f199543b.get(o.d(it8));
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f199536b.f199543b.get(o.c(it8));
                }
            }
        }, new Function2(this) { // from class: lrk.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199538b;

            {
                this.f199538b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String ref2 = (String) obj2;
                switch (i) {
                    case 0:
                        mel.p insights = (mel.p) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(insights, "insights");
                        this.f199538b.f199543b.f(o.b(ref2), insights);
                        break;
                    case 1:
                        mel.m sentiment = (mel.m) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
                        this.f199538b.f199543b.f(o.a(ref2), sentiment);
                        break;
                    case 2:
                        i0 technicalInsights = (i0) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
                        this.f199538b.f199543b.f(o.d(ref2), technicalInsights);
                        break;
                    default:
                        List recommendationHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(recommendationHistory, "recommendationHistory");
                        this.f199538b.f199543b.f(o.c(ref2), recommendationHistory);
                        break;
                }
                return Unit.f186387a;
            }
        }, new n(this, continuation, 1), new lp6.g(this, continuation, 2));
        final int i2 = 1;
        this.f = new x4l.c(new m(this, continuation, 0), new Function1(this) { // from class: lrk.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199536b;

            {
                this.f199536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it8 = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.p) this.f199536b.f199543b.get(o.b(it8));
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.m) this.f199536b.f199543b.get(o.a(it8));
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i0) this.f199536b.f199543b.get(o.d(it8));
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f199536b.f199543b.get(o.c(it8));
                }
            }
        }, new Function2(this) { // from class: lrk.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199538b;

            {
                this.f199538b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String ref2 = (String) obj2;
                switch (i2) {
                    case 0:
                        mel.p insights = (mel.p) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(insights, "insights");
                        this.f199538b.f199543b.f(o.b(ref2), insights);
                        break;
                    case 1:
                        mel.m sentiment = (mel.m) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
                        this.f199538b.f199543b.f(o.a(ref2), sentiment);
                        break;
                    case 2:
                        i0 technicalInsights = (i0) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
                        this.f199538b.f199543b.f(o.d(ref2), technicalInsights);
                        break;
                    default:
                        List recommendationHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(recommendationHistory, "recommendationHistory");
                        this.f199538b.f199543b.f(o.c(ref2), recommendationHistory);
                        break;
                }
                return Unit.f186387a;
            }
        }, new n(this, continuation, 0), new lp6.g(this, continuation, 1));
        final int i3 = 2;
        this.f199545g = new x4l.c(new m(this, continuation, 3), new Function1(this) { // from class: lrk.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199536b;

            {
                this.f199536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it8 = (String) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.p) this.f199536b.f199543b.get(o.b(it8));
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.m) this.f199536b.f199543b.get(o.a(it8));
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i0) this.f199536b.f199543b.get(o.d(it8));
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f199536b.f199543b.get(o.c(it8));
                }
            }
        }, new Function2(this) { // from class: lrk.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199538b;

            {
                this.f199538b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String ref2 = (String) obj2;
                switch (i3) {
                    case 0:
                        mel.p insights = (mel.p) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(insights, "insights");
                        this.f199538b.f199543b.f(o.b(ref2), insights);
                        break;
                    case 1:
                        mel.m sentiment = (mel.m) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
                        this.f199538b.f199543b.f(o.a(ref2), sentiment);
                        break;
                    case 2:
                        i0 technicalInsights = (i0) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
                        this.f199538b.f199543b.f(o.d(ref2), technicalInsights);
                        break;
                    default:
                        List recommendationHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(recommendationHistory, "recommendationHistory");
                        this.f199538b.f199543b.f(o.c(ref2), recommendationHistory);
                        break;
                }
                return Unit.f186387a;
            }
        }, new n(this, continuation, 3), new lp6.g(this, continuation, 4));
        final int i5 = 3;
        this.f199546h = new x4l.c(new m(this, continuation, 2), new Function1(this) { // from class: lrk.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199536b;

            {
                this.f199536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it8 = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.p) this.f199536b.f199543b.get(o.b(it8));
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mel.m) this.f199536b.f199543b.get(o.a(it8));
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i0) this.f199536b.f199543b.get(o.d(it8));
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f199536b.f199543b.get(o.c(it8));
                }
            }
        }, new Function2(this) { // from class: lrk.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f199538b;

            {
                this.f199538b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String ref2 = (String) obj2;
                switch (i5) {
                    case 0:
                        mel.p insights = (mel.p) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(insights, "insights");
                        this.f199538b.f199543b.f(o.b(ref2), insights);
                        break;
                    case 1:
                        mel.m sentiment = (mel.m) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
                        this.f199538b.f199543b.f(o.a(ref2), sentiment);
                        break;
                    case 2:
                        i0 technicalInsights = (i0) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
                        this.f199538b.f199543b.f(o.d(ref2), technicalInsights);
                        break;
                    default:
                        List recommendationHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(recommendationHistory, "recommendationHistory");
                        this.f199538b.f199543b.f(o.c(ref2), recommendationHistory);
                        break;
                }
                return Unit.f186387a;
            }
        }, new n(this, continuation, 2), new lp6.g(this, continuation, 3));
    }

    public static String a(String str) {
        return j6.a.q("Index-Market-Sentiment-", str);
    }

    public static String b(String str) {
        return j6.a.q("Instrument-Suggestions-", str);
    }

    public static String c(String str) {
        return j6.a.q("Recommendation-History-", str);
    }

    public static String d(String str) {
        return j6.a.q("Technical-Insights-", str);
    }
}
