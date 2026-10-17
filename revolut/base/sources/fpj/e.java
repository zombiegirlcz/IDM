package fpj;

import com.revolut.retail.feature.features.impl.network.FeaturesService;
import efm.d0;
import efm.r;
import fjd.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import ufm.i;
import w4l.f;
import w4l.k;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeaturesService f137110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f137111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f137112c;
    public final s d;
    public final f e;

    public e(FeaturesService featureService, j memoryCache, ue0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f137110a = featureService;
        this.f137111b = memoryCache;
        this.f137112c = storage;
        this.d = ((ze0.c) forceReloadStrategyFactory).b(180000L);
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: fpj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137105b;

            {
                this.f137105b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        yoj.f features = (yoj.f) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f137105b.f137112c.G(gpj.a.b(features), ib.b.Features, kii.e.o(hpj.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Map<String, String> mapX = params.a() ? a0.d.x("Cache-Control", "no-cache") : r0.g();
                        e eVar = this.f137105b;
                        d0<List<epj.a>> features2 = eVar.f137110a.getFeatures(mapX);
                        fjj.b bVar = new fjj.b(new fo9.a(6), 18);
                        features2.getClass();
                        ufm.f fVar = new ufm.f(new i(features2, bVar, 1), new fjj.b(new w(eVar, 24), 19), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    default:
                        yoj.f features3 = (yoj.f) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(features3, "features");
                        this.f137105b.f137111b.f(ib.b.Features, features3);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: fpj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137107b;

            {
                this.f137107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d dVar = (d) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
                        return (yoj.f) this.f137107b.f137111b.get(ib.b.Features);
                    default:
                        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
                        List list = (List) p.a.j(hpj.a.class, KTypeProjection.INSTANCE, List.class, this.f137107b.f137112c, ib.b.Features);
                        if (list == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            yoj.a aVarA = gpj.a.a((hpj.a) it8.next());
                            if (aVarA != null) {
                                arrayList.add(aVarA);
                            }
                        }
                        return new yoj.f(arrayList);
                }
            }
        };
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: fpj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137105b;

            {
                this.f137105b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        yoj.f features = (yoj.f) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f137105b.f137112c.G(gpj.a.b(features), ib.b.Features, kii.e.o(hpj.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Map<String, String> mapX = params.a() ? a0.d.x("Cache-Control", "no-cache") : r0.g();
                        e eVar = this.f137105b;
                        d0<List<epj.a>> features2 = eVar.f137110a.getFeatures(mapX);
                        fjj.b bVar = new fjj.b(new fo9.a(6), 18);
                        features2.getClass();
                        ufm.f fVar = new ufm.f(new i(features2, bVar, 1), new fjj.b(new w(eVar, 24), 19), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    default:
                        yoj.f features3 = (yoj.f) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(features3, "features");
                        this.f137105b.f137111b.f(ib.b.Features, features3);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: fpj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137107b;

            {
                this.f137107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d dVar = (d) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
                        return (yoj.f) this.f137107b.f137111b.get(ib.b.Features);
                    default:
                        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
                        List list = (List) p.a.j(hpj.a.class, KTypeProjection.INSTANCE, List.class, this.f137107b.f137112c, ib.b.Features);
                        if (list == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            yoj.a aVarA = gpj.a.a((hpj.a) it8.next());
                            if (aVarA != null) {
                                arrayList.add(aVarA);
                            }
                        }
                        return new yoj.f(arrayList);
                }
            }
        };
        final int i6 = 0;
        this.e = new f(function2, function1, function22, function12, new Function2(this) { // from class: fpj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137105b;

            {
                this.f137105b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        yoj.f features = (yoj.f) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f137105b.f137112c.G(gpj.a.b(features), ib.b.Features, kii.e.o(hpj.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Map<String, String> mapX = params.a() ? a0.d.x("Cache-Control", "no-cache") : r0.g();
                        e eVar = this.f137105b;
                        d0<List<epj.a>> features2 = eVar.f137110a.getFeatures(mapX);
                        fjj.b bVar = new fjj.b(new fo9.a(6), 18);
                        features2.getClass();
                        ufm.f fVar = new ufm.f(new i(features2, bVar, 1), new fjj.b(new w(eVar, 24), 19), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    default:
                        yoj.f features3 = (yoj.f) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(features3, "features");
                        this.f137105b.f137111b.f(ib.b.Features, features3);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final r a(yoj.c name, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(this.e.e(new d(name), loadingStrategy), new w(name, 23));
    }

    public final r b(boolean z) {
        return this.e.f(new d(null), this.d.a(Unit.f186387a, z));
    }
}
