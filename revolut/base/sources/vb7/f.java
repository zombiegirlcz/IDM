package vb7;

import com.revolut.feature.home.nps.data.network.HomeNPSService;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import ufm.i;
import v6l.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeNPSService f287441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f287442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f287443c;
    public final bc7.a d;
    public final lfm.c e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0m.b f287444g;

    public f(HomeNPSService service, j npsCache, ue0.c npsStorage, bc7.a npsPushInterceptor, lfm.c appCompositeDisposable) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(npsCache, "npsCache");
        Intrinsics.checkNotNullParameter(npsStorage, "npsStorage");
        Intrinsics.checkNotNullParameter(npsPushInterceptor, "npsPushInterceptor");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        this.f287441a = service;
        this.f287442b = npsCache;
        this.f287443c = npsStorage;
        this.d = npsPushInterceptor;
        this.e = appCompositeDisposable;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: vb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f287433b;

            {
                this.f287433b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ub7.d> surveys = this.f287433b.f287441a.getSurveys();
                        e0 e0Var = new e0(20, new v80.a(18));
                        surveys.getClass();
                        i iVar = new i(surveys, e0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List surveys2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(surveys2, "surveys");
                        this.f287433b.f287442b.f("surveys_key", surveys2);
                        break;
                    default:
                        List surveys3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(surveys3, "surveys");
                        this.f287433b.f287443c.G(xam.a.z(surveys3), "surveys_key", kii.e.o(ub7.c.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar = new b(this, i);
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: vb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f287433b;

            {
                this.f287433b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ub7.d> surveys = this.f287433b.f287441a.getSurveys();
                        e0 e0Var = new e0(20, new v80.a(18));
                        surveys.getClass();
                        i iVar = new i(surveys, e0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List surveys2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(surveys2, "surveys");
                        this.f287433b.f287442b.f("surveys_key", surveys2);
                        break;
                    default:
                        List surveys3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(surveys3, "surveys");
                        this.f287433b.f287443c.G(xam.a.z(surveys3), "surveys_key", kii.e.o(ub7.c.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar2 = new b(this, i2);
        final int i3 = 2;
        this.f = new w4l.f(function2, bVar, function22, bVar2, new Function2(this) { // from class: vb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f287433b;

            {
                this.f287433b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ub7.d> surveys = this.f287433b.f287441a.getSurveys();
                        e0 e0Var = new e0(20, new v80.a(18));
                        surveys.getClass();
                        i iVar = new i(surveys, e0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List surveys2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(surveys2, "surveys");
                        this.f287433b.f287442b.f("surveys_key", surveys2);
                        break;
                    default:
                        List surveys3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(surveys3, "surveys");
                        this.f287433b.f287443c.G(xam.a.z(surveys3), "surveys_key", kii.e.o(ub7.c.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        this.f287444g = new e0m.b(new ur2.a(this, 29));
    }
}
