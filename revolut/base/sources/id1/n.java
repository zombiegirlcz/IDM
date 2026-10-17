package id1;

import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;
import com.youTransactor.uCube.rpc.Constants;
import i9g.e0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f160402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd1.a f160403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CatalogueDataProviderImpl f160404c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f160405g;

    public n(ne0.j memoryCache, hd1.a mapper, CatalogueDataProviderImpl catalogueDataProvider) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(catalogueDataProvider, "catalogueDataProvider");
        this.f160402a = memoryCache;
        this.f160403b = mapper;
        this.f160404c = catalogueDataProvider;
        final int i = 0;
        final int i2 = 2;
        this.d = new w4l.f(new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, new a(this, 8), new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 3;
        final int i5 = 4;
        this.e = new w4l.f(new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, new a(this, 9), new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 5;
        final int i21 = 6;
        this.f = new w4l.f(new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, new a(this, 10), new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 7;
        Function2 function2 = new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        };
        a aVar = new a(this, i22);
        final int i32 = 1;
        this.f160405g = new w4l.f(function2, aVar, new Function2(this) { // from class: id1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f160388b;

            {
                this.f160388b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        kotlinx.coroutines.d dVar = p0.f264003c;
                        n nVar = this.f160388b;
                        ufm.i iVar = new ufm.i(w.o0(dVar, new g(nVar, null, 0)), new icc.c(new e0(nVar, 29), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        cd1.f taxRatesSettings = (cd1.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRatesSettings, "taxRatesSettings");
                        this.f160388b.f160402a.f("TAX_RATES_SETTINGS_KEY", taxRatesSettings);
                        return Unit.f186387a;
                    case 2:
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        this.f160388b.f160402a.f("CATEGORIES_KEY", categories);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        kotlinx.coroutines.d dVar2 = p0.f264003c;
                        n nVar2 = this.f160388b;
                        ufm.i iVar2 = new ufm.i(w.o0(dVar2, new g(nVar2, null, 1)), new icc.c(new e0(nVar2, 26), 12), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List products = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(products, "products");
                        this.f160388b.f160402a.f("PRODUCTS_KEY", products);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        kotlinx.coroutines.d dVar3 = p0.f264003c;
                        n nVar3 = this.f160388b;
                        ufm.i iVar3 = new ufm.i(w.o0(dVar3, new g(nVar3, null, 3)), new icc.c(new e0(nVar3, 27), 15), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f160388b.f160402a.f("TAX_RATES_KEY", taxRates);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        kotlinx.coroutines.d dVar4 = p0.f264003c;
                        n nVar4 = this.f160388b;
                        ufm.i iVar4 = new ufm.i(w.o0(dVar4, new g(nVar4, null, 2)), new icc.c(new e0(nVar4, 28), 16), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof id1.i
            if (r0 == 0) goto L13
            r0 = r13
            id1.i r0 = (id1.i) r0
            int r1 = r0.f160393w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160393w = r1
            goto L18
        L13:
            id1.i r0 = new id1.i
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160393w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            r5 = r10
            goto L4a
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r13)
            id1.h r4 = new id1.h
            r9 = 1
            r8 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.f160393w = r3
            java.lang.Object r13 = skm.e0.J(r11, r4, r0)
            if (r13 != r1) goto L4a
            return r1
        L4a:
            zc1.h r13 = (zc1.h) r13
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r11 = hd1.a.d(r13)
            ne0.j r12 = r5.f160402a
            java.lang.String r13 = "TAX_RATES_KEY"
            java.lang.Object r12 = r12.get(r13)
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L5e
            zhm.f0 r12 = zhm.f0.f322471a
        L5e:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.ArrayList r12 = zhm.d0.f1(r12)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r12.add(r0, r11)
            w4l.f r11 = r5.f
            r11.k(r13, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: id1.n.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof id1.k
            if (r0 == 0) goto L13
            r0 = r7
            id1.k r0 = (id1.k) r0
            int r1 = r0.f160397x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160397x = r1
            goto L18
        L13:
            id1.k r0 = new id1.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160397x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            id1.j r7 = new id1.j
            r2 = 2
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r6
            r0.f160397x = r3
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            ne0.j r7 = r5.f160402a
            java.lang.String r0 = "TAX_RATES_KEY"
            java.lang.Object r7 = r7.get(r0)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L58
            zhm.f0 r7 = zhm.f0.f322471a
        L58:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r7.next()
            r3 = r2
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r3 = (com.revolut.feature.acquiring.lite_pos.api.model.TaxRate) r3
            java.lang.String r3 = r3.f60694a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 != 0) goto L65
            r1.add(r2)
            goto L65
        L7e:
            w4l.f r6 = r5.f
            r6.k(r0, r1)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: id1.n.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof id1.m
            if (r0 == 0) goto L13
            r0 = r15
            id1.m r0 = (id1.m) r0
            int r1 = r0.f160401w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160401w = r1
            goto L18
        L13:
            id1.m r0 = new id1.m
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160401w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r15)
            r5 = r11
            goto L4b
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r15)
            id1.l r4 = new id1.l
            r9 = 0
            r10 = 1
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            r0.f160401w = r3
            java.lang.Object r15 = skm.e0.J(r12, r4, r0)
            if (r15 != r1) goto L4b
            return r1
        L4b:
            zc1.h r15 = (zc1.h) r15
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r12 = hd1.a.d(r15)
            ne0.j r13 = r5.f160402a
            java.lang.String r14 = "TAX_RATES_KEY"
            java.lang.Object r13 = r13.get(r14)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L5f
            zhm.f0 r13 = zhm.f0.f322471a
        L5f:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.ArrayList r13 = zhm.d0.f1(r13)
            java.lang.String r15 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r15)
            java.util.ListIterator r15 = r13.listIterator()
        L70:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r15.next()
            r1 = r0
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r1 = (com.revolut.feature.acquiring.lite_pos.api.model.TaxRate) r1
            java.lang.String r1 = r1.f60694a
            java.lang.String r2 = r12.f60694a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L88
            r0 = r12
        L88:
            r15.set(r0)
            goto L70
        L8c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            w4l.f r12 = r5.f
            r12.k(r14, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: id1.n.c(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
