package gd0;

import com.revolut.core.chaosmanagement.data.network.ChaosManagementService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ehe.n;
import g9j.v;
import gaf.l;
import ip0.v7;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ufm.i;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaosManagementService f143027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f143028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f143029c;
    public final w4l.f d;

    public f(ChaosManagementService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f143027a = service;
        this.f143028b = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: gd0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f143023b;

            {
                this.f143023b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<List<kd0.c>> bannerNews;
                switch (i) {
                    case 0:
                        ChaosManagementService chaosManagementService = this.f143023b.f143027a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        nd0.d it8 = (nd0.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        int i2 = e.f143026a[it8.f214277a.ordinal()];
                        if (i2 == 1) {
                            bannerNews = chaosManagementService.getBannerNews(it8.f214278b.a());
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bannerNews = chaosManagementService.getBannerLocal();
                        }
                        v vVar = new v(new g4k.e(it8, 28), 14);
                        bannerNews.getClass();
                        i iVar = new i(bannerNews, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        nd0.d params = (nd0.d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("CACHE_KEY_NEWS", params.f214277a.name(), this.f143023b.f143028b, data);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        kd0.a it9 = (kd0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<kd0.b>> incidents = this.f143023b.f143027a.getIncidents(it9.a());
                        v vVar2 = new v(new l(22), 13);
                        incidents.getClass();
                        i iVar2 = new i(incidents, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((kd0.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f143023b.f143028b.f("CACHE_KEY_INCIDENTS", data2);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: gd0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f143025b;

            {
                this.f143025b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        nd0.d params = (nd0.d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v7.r("CACHE_KEY_NEWS", params.f214277a.name(), this.f143025b.f143028b);
                    default:
                        kd0.a it8 = (kd0.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f143025b.f143028b.get("CACHE_KEY_INCIDENTS");
                }
            }
        };
        final int i2 = 1;
        this.f143029c = new w4l.f(function2, function1, new Function2(this) { // from class: gd0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f143023b;

            {
                this.f143023b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<List<kd0.c>> bannerNews;
                switch (i2) {
                    case 0:
                        ChaosManagementService chaosManagementService = this.f143023b.f143027a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        nd0.d it8 = (nd0.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        int i22 = e.f143026a[it8.f214277a.ordinal()];
                        if (i22 == 1) {
                            bannerNews = chaosManagementService.getBannerNews(it8.f214278b.a());
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bannerNews = chaosManagementService.getBannerLocal();
                        }
                        v vVar = new v(new g4k.e(it8, 28), 14);
                        bannerNews.getClass();
                        i iVar = new i(bannerNews, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        nd0.d params = (nd0.d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("CACHE_KEY_NEWS", params.f214277a.name(), this.f143023b.f143028b, data);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        kd0.a it9 = (kd0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<kd0.b>> incidents = this.f143023b.f143027a.getIncidents(it9.a());
                        v vVar2 = new v(new l(22), 13);
                        incidents.getClass();
                        i iVar2 = new i(incidents, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((kd0.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f143023b.f143028b.f("CACHE_KEY_INCIDENTS", data2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: gd0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f143023b;

            {
                this.f143023b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<List<kd0.c>> bannerNews;
                switch (i3) {
                    case 0:
                        ChaosManagementService chaosManagementService = this.f143023b.f143027a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        nd0.d it8 = (nd0.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        int i22 = e.f143026a[it8.f214277a.ordinal()];
                        if (i22 == 1) {
                            bannerNews = chaosManagementService.getBannerNews(it8.f214278b.a());
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bannerNews = chaosManagementService.getBannerLocal();
                        }
                        v vVar = new v(new g4k.e(it8, 28), 14);
                        bannerNews.getClass();
                        i iVar = new i(bannerNews, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        nd0.d params = (nd0.d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("CACHE_KEY_NEWS", params.f214277a.name(), this.f143023b.f143028b, data);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        kd0.a it9 = (kd0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<kd0.b>> incidents = this.f143023b.f143027a.getIncidents(it9.a());
                        v vVar2 = new v(new l(22), 13);
                        incidents.getClass();
                        i iVar2 = new i(incidents, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((kd0.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f143023b.f143028b.f("CACHE_KEY_INCIDENTS", data2);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: gd0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f143025b;

            {
                this.f143025b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        nd0.d params = (nd0.d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v7.r("CACHE_KEY_NEWS", params.f214277a.name(), this.f143025b.f143028b);
                    default:
                        kd0.a it8 = (kd0.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f143025b.f143028b.get("CACHE_KEY_INCIDENTS");
                }
            }
        };
        final int i6 = 3;
        this.d = new w4l.f(function22, function12, new Function2(this) { // from class: gd0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f143023b;

            {
                this.f143023b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<List<kd0.c>> bannerNews;
                switch (i6) {
                    case 0:
                        ChaosManagementService chaosManagementService = this.f143023b.f143027a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        nd0.d it8 = (nd0.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        int i22 = e.f143026a[it8.f214277a.ordinal()];
                        if (i22 == 1) {
                            bannerNews = chaosManagementService.getBannerNews(it8.f214278b.a());
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bannerNews = chaosManagementService.getBannerLocal();
                        }
                        v vVar = new v(new g4k.e(it8, 28), 14);
                        bannerNews.getClass();
                        i iVar = new i(bannerNews, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        nd0.d params = (nd0.d) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("CACHE_KEY_NEWS", params.f214277a.name(), this.f143023b.f143028b, data);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        kd0.a it9 = (kd0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<kd0.b>> incidents = this.f143023b.f143027a.getIncidents(it9.a());
                        v vVar2 = new v(new l(22), 13);
                        incidents.getClass();
                        i iVar2 = new i(incidents, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((kd0.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f143023b.f143028b.f("CACHE_KEY_INCIDENTS", data2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
