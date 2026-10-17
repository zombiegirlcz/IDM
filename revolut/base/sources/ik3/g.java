package ik3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.configuration.impl.network.ConfigurationService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import efm.r;
import ijj.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lk3.h;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements fk3.b {

    @NotNull
    public static final f Companion = new f();
    public static final Type k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigurationService f161885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f161886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f161887c;
    public final j d;
    public final j e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f7l.a f161888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f161889h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f161890j;

    static {
        Type type = new TypeToken<lk3.f>() { // from class: com.revolut.feature.configuration.impl.ConfigurationRepositoryImpl$Companion$ADDRESS_CONFIG_ENTITY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        k = type;
    }

    public g(ConfigurationService service, ue0.c storage, j countriesListMemoryCache, j currenciesByCountryMemoryCache, j allAvailableCryptoCurrenciesMemoryCache, j memoryCache, f7l.a sharedConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(countriesListMemoryCache, "countriesListMemoryCache");
        Intrinsics.checkNotNullParameter(currenciesByCountryMemoryCache, "currenciesByCountryMemoryCache");
        Intrinsics.checkNotNullParameter(allAvailableCryptoCurrenciesMemoryCache, "allAvailableCryptoCurrenciesMemoryCache");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(sharedConfigurationInteractor, "sharedConfigurationInteractor");
        this.f161885a = service;
        this.f161886b = storage;
        this.f161887c = countriesListMemoryCache;
        this.d = currenciesByCountryMemoryCache;
        this.e = allAvailableCryptoCurrenciesMemoryCache;
        this.f = memoryCache;
        this.f161888g = sharedConfigurationInteractor;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        };
        final int i2 = 2;
        Function1 function1 = new Function1(this) { // from class: ik3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161884b;

            {
                this.f161884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (gk3.e) this.f161884b.f.get("KEY_ADDRESS_CONFIG");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        lk3.f fVar = (lk3.f) this.f161884b.f161886b.T2("KEY_ADDRESS_CONFIG", g.k);
                        if (fVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        List addressForms = fVar.getAddressForms();
                        ArrayList arrayList = new ArrayList(w.t(addressForms, 10));
                        Iterator it10 = addressForms.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(cp5.d.P((lk3.d) it10.next()));
                        }
                        return new gk3.e(arrayList, cp5.d.P(fVar.getDefaultAddressForm()));
                    case 2:
                        String it11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (gk3.g) this.f161884b.f161887c.get("COUNTRIES_LIST_KEY");
                    case 3:
                        String countryCode = (String) obj2;
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return (Set) this.f161884b.d.get(countryCode);
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (Set) this.f161884b.e.get("ALL_AVAILABLE_CRYPTO_CONFIG_KEY");
                }
            }
        };
        final int i3 = 3;
        this.f161889h = new w4l.f(function2, function1, new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i5 = 4;
        Function2 function22 = new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        };
        final int i6 = 3;
        Function1 function12 = new Function1(this) { // from class: ik3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161884b;

            {
                this.f161884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (gk3.e) this.f161884b.f.get("KEY_ADDRESS_CONFIG");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        lk3.f fVar = (lk3.f) this.f161884b.f161886b.T2("KEY_ADDRESS_CONFIG", g.k);
                        if (fVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        List addressForms = fVar.getAddressForms();
                        ArrayList arrayList = new ArrayList(w.t(addressForms, 10));
                        Iterator it10 = addressForms.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(cp5.d.P((lk3.d) it10.next()));
                        }
                        return new gk3.e(arrayList, cp5.d.P(fVar.getDefaultAddressForm()));
                    case 2:
                        String it11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (gk3.g) this.f161884b.f161887c.get("COUNTRIES_LIST_KEY");
                    case 3:
                        String countryCode = (String) obj2;
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return (Set) this.f161884b.d.get(countryCode);
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (Set) this.f161884b.e.get("ALL_AVAILABLE_CRYPTO_CONFIG_KEY");
                }
            }
        };
        final int i21 = 5;
        this.i = new w4l.f(function22, function12, new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 6;
        Function2 function23 = new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        };
        final int i32 = 4;
        Function1 function13 = new Function1(this) { // from class: ik3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161884b;

            {
                this.f161884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (gk3.e) this.f161884b.f.get("KEY_ADDRESS_CONFIG");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        lk3.f fVar = (lk3.f) this.f161884b.f161886b.T2("KEY_ADDRESS_CONFIG", g.k);
                        if (fVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        List addressForms = fVar.getAddressForms();
                        ArrayList arrayList = new ArrayList(w.t(addressForms, 10));
                        Iterator it10 = addressForms.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(cp5.d.P((lk3.d) it10.next()));
                        }
                        return new gk3.e(arrayList, cp5.d.P(fVar.getDefaultAddressForm()));
                    case 2:
                        String it11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (gk3.g) this.f161884b.f161887c.get("COUNTRIES_LIST_KEY");
                    case 3:
                        String countryCode = (String) obj2;
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return (Set) this.f161884b.d.get(countryCode);
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (Set) this.f161884b.e.get("ALL_AVAILABLE_CRYPTO_CONFIG_KEY");
                }
            }
        };
        final int i33 = 7;
        new w4l.f(function23, function13, new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i43 = 8;
        final int i59 = 0;
        final int i66 = 1;
        final int i74 = 1;
        final int i92 = 2;
        this.f161890j = new w4l.f(new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, new Function1(this) { // from class: ik3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161884b;

            {
                this.f161884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i59) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (gk3.e) this.f161884b.f.get("KEY_ADDRESS_CONFIG");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        lk3.f fVar = (lk3.f) this.f161884b.f161886b.T2("KEY_ADDRESS_CONFIG", g.k);
                        if (fVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        List addressForms = fVar.getAddressForms();
                        ArrayList arrayList = new ArrayList(w.t(addressForms, 10));
                        Iterator it10 = addressForms.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(cp5.d.P((lk3.d) it10.next()));
                        }
                        return new gk3.e(arrayList, cp5.d.P(fVar.getDefaultAddressForm()));
                    case 2:
                        String it11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (gk3.g) this.f161884b.f161887c.get("COUNTRIES_LIST_KEY");
                    case 3:
                        String countryCode = (String) obj2;
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return (Set) this.f161884b.d.get(countryCode);
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (Set) this.f161884b.e.get("ALL_AVAILABLE_CRYPTO_CONFIG_KEY");
                }
            }
        }, new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, new Function1(this) { // from class: ik3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161884b;

            {
                this.f161884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i74) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (gk3.e) this.f161884b.f.get("KEY_ADDRESS_CONFIG");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        lk3.f fVar = (lk3.f) this.f161884b.f161886b.T2("KEY_ADDRESS_CONFIG", g.k);
                        if (fVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        List addressForms = fVar.getAddressForms();
                        ArrayList arrayList = new ArrayList(w.t(addressForms, 10));
                        Iterator it10 = addressForms.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(cp5.d.P((lk3.d) it10.next()));
                        }
                        return new gk3.e(arrayList, cp5.d.P(fVar.getDefaultAddressForm()));
                    case 2:
                        String it11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (gk3.g) this.f161884b.f161887c.get("COUNTRIES_LIST_KEY");
                    case 3:
                        String countryCode = (String) obj2;
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return (Set) this.f161884b.d.get(countryCode);
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (Set) this.f161884b.e.get("ALL_AVAILABLE_CRYPTO_CONFIG_KEY");
                }
            }
        }, new Function2(this) { // from class: ik3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f161882b;

            {
                this.f161882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String it8 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> listOfAvailableCountries = this.f161882b.f161885a.getListOfAvailableCountries();
                        ihd.c cVar = new ihd.c(12, new p(15));
                        listOfAvailableCountries.getClass();
                        i iVar = new i(listOfAvailableCountries, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        gk3.e addressConfig = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig, "addressConfig");
                        this.f161882b.f.f("KEY_ADDRESS_CONFIG", addressConfig);
                        return Unit.f186387a;
                    case 2:
                        gk3.e addressConfig2 = (gk3.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(addressConfig2, "addressConfig");
                        ue0.c cVar2 = this.f161882b.f161886b;
                        Intrinsics.checkNotNullParameter(addressConfig2, "<this>");
                        ArrayList arrayList = addressConfig2.f144321a;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(cp5.d.Y((gk3.d) it9.next()));
                        }
                        cVar2.G(new lk3.f(arrayList2, cp5.d.Y(addressConfig2.f144322b)), "KEY_ADDRESS_CONFIG", z.d(o0.b(lk3.f.class)));
                        return Unit.f186387a;
                    case 3:
                        gk3.g countries = (gk3.g) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        this.f161882b.f161887c.f("COUNTRIES_LIST_KEY", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String countryCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        return te0.w.i0(this.f161882b.f161885a.getAvailableCurrenciesByCountry(countryCode));
                    case 5:
                        String countryCode2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f161882b.d.f(countryCode2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<lk3.g> allAvailableCryptoCurrencies = this.f161882b.f161885a.getAllAvailableCryptoCurrencies();
                        ihd.c cVar3 = new ihd.c(11, new p(13));
                        allAvailableCryptoCurrencies.getClass();
                        i iVar2 = new i(allAvailableCryptoCurrencies, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.i0(iVar2);
                    case 7:
                        Set currencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f161882b.e.f("ALL_AVAILABLE_CRYPTO_CONFIG_KEY", currencies);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<lk3.e> addressLocalisationsConfig = this.f161882b.f161885a.getAddressLocalisationsConfig();
                        ihd.c cVar4 = new ihd.c(13, new p(16));
                        addressLocalisationsConfig.getClass();
                        i iVar3 = new i(addressLocalisationsConfig, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final r a(e7l.g configType, boolean z) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        return this.f161888g.e(configType, z);
    }

    @Override // od0.e
    public final void clear() {
        this.f.clear();
    }
}
