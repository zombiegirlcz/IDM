package q0g;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.travel.experiences.impl.network.experience.TravelExperiencesService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kii.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import w4l.f;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesService f241267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f241268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f241269c;
    public final f d;

    public d(TravelExperiencesService travelExperiencesService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(travelExperiencesService, "travelExperiencesService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f241267a = travelExperiencesService;
        this.f241268b = memoryCache;
        this.f241269c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: q0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f241264b;

            {
                this.f241264b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<e0g.a>> providers = this.f241264b.f241267a.getProviders();
                        q09.c cVar = new q09.c(5, new q09.a(12));
                        providers.getClass();
                        i iVar = new i(providers, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List urlProviders = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(urlProviders, "urlProviders");
                        this.f241264b.f241268b.f("KEY_URL_PROVIDERS", urlProviders);
                        break;
                    default:
                        List urlProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(urlProviders2, "urlProviders");
                        ue0.c cVar2 = this.f241264b.f241269c;
                        Intrinsics.checkNotNullParameter(urlProviders2, "<this>");
                        List<ryf.a> list = urlProviders2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ryf.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new f0g.a(aVar.f258367a, aVar.f258368b));
                        }
                        cVar2.G(arrayList, "KEY_URL_PROVIDERS", e.o(f0g.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: q0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f241266b;

            {
                this.f241266b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                d dVar = this.f241266b;
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) dVar.f241268b.get("KEY_URL_PROVIDERS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = dVar.f241269c;
                        Type type = TypeToken.getParameterized(ArrayList.class, ryf.a.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        return (List) cVar.T2("KEY_URL_PROVIDERS", type);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: q0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f241264b;

            {
                this.f241264b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<e0g.a>> providers = this.f241264b.f241267a.getProviders();
                        q09.c cVar = new q09.c(5, new q09.a(12));
                        providers.getClass();
                        i iVar = new i(providers, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List urlProviders = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(urlProviders, "urlProviders");
                        this.f241264b.f241268b.f("KEY_URL_PROVIDERS", urlProviders);
                        break;
                    default:
                        List urlProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(urlProviders2, "urlProviders");
                        ue0.c cVar2 = this.f241264b.f241269c;
                        Intrinsics.checkNotNullParameter(urlProviders2, "<this>");
                        List<ryf.a> list = urlProviders2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ryf.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new f0g.a(aVar.f258367a, aVar.f258368b));
                        }
                        cVar2.G(arrayList, "KEY_URL_PROVIDERS", e.o(f0g.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: q0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f241266b;

            {
                this.f241266b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                d dVar = this.f241266b;
                Unit it8 = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) dVar.f241268b.get("KEY_URL_PROVIDERS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = dVar.f241269c;
                        Type type = TypeToken.getParameterized(ArrayList.class, ryf.a.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        return (List) cVar.T2("KEY_URL_PROVIDERS", type);
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: q0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f241264b;

            {
                this.f241264b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<e0g.a>> providers = this.f241264b.f241267a.getProviders();
                        q09.c cVar = new q09.c(5, new q09.a(12));
                        providers.getClass();
                        i iVar = new i(providers, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List urlProviders = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(urlProviders, "urlProviders");
                        this.f241264b.f241268b.f("KEY_URL_PROVIDERS", urlProviders);
                        break;
                    default:
                        List urlProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(urlProviders2, "urlProviders");
                        ue0.c cVar2 = this.f241264b.f241269c;
                        Intrinsics.checkNotNullParameter(urlProviders2, "<this>");
                        List<ryf.a> list = urlProviders2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ryf.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new f0g.a(aVar.f258367a, aVar.f258368b));
                        }
                        cVar2.G(arrayList, "KEY_URL_PROVIDERS", e.o(f0g.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
