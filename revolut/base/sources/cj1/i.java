package cj1;

import akl.o;
import com.revolut.feature.address.impl.data.network.AddressFieldSuggestionService;
import com.revolut.feature.address.impl.data.network.MunicipalitiesService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f24590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MunicipalitiesService f24591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AddressFieldSuggestionService f24592c;
    public final x4l.c d;
    public final x4l.c e;

    public i(ne0.j memoryCache, MunicipalitiesService municipalitiesService, AddressFieldSuggestionService addressFieldSuggestionService) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(municipalitiesService, "municipalitiesService");
        Intrinsics.checkNotNullParameter(addressFieldSuggestionService, "addressFieldSuggestionService");
        this.f24590a = memoryCache;
        this.f24591b = municipalitiesService;
        this.f24592c = addressFieldSuggestionService;
        Continuation continuation = null;
        h hVar = new h(this, continuation, 1);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: cj1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f24583b;

            {
                this.f24583b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g params = (g) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f24583b.f24590a.get(i.a("MUNICIPALITIES", params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f24583b.f24590a.get(i.a("CITY_SUGGESTIONS", params));
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: cj1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f24585b;

            {
                this.f24585b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                g params = (g) obj2;
                List municipalities = (List) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(municipalities, "municipalities");
                        this.f24585b.f24590a.f(i.a("MUNICIPALITIES", params), municipalities);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(municipalities, "cities");
                        this.f24585b.f24590a.f(i.a("CITY_SUGGESTIONS", params), municipalities);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i2 = 22;
        int i3 = 2;
        int i5 = 3;
        this.d = new x4l.c(hVar, function1, function2, new o(i3, i2, continuation), new a19.e(i5, i2, continuation));
        h hVar2 = new h(this, continuation, 0);
        final int i6 = 1;
        Function1 function12 = new Function1(this) { // from class: cj1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f24583b;

            {
                this.f24583b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g params = (g) obj2;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f24583b.f24590a.get(i.a("MUNICIPALITIES", params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f24583b.f24590a.get(i.a("CITY_SUGGESTIONS", params));
                }
            }
        };
        Function2 function22 = new Function2(this) { // from class: cj1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f24585b;

            {
                this.f24585b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                g params = (g) obj2;
                List municipalities = (List) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(municipalities, "municipalities");
                        this.f24585b.f24590a.f(i.a("MUNICIPALITIES", params), municipalities);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(municipalities, "cities");
                        this.f24585b.f24590a.f(i.a("CITY_SUGGESTIONS", params), municipalities);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i21 = 21;
        this.e = new x4l.c(hVar2, function12, function22, new o(i3, i21, continuation), new a19.e(i5, i21, continuation));
    }

    public static String a(String str, g gVar) {
        StringBuilder sbT = p.a.t(str, "-SuggestionQueryParams(country=", gVar.f24586a, ", query=", gVar.f24587b);
        sbT.append(")");
        return sbT.toString();
    }
}
