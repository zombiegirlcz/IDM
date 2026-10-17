package d3i;

import g1i.o0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements a97.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f111180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f61.a f111181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f111182c;
    public final a5h.g d;
    public final l4i.a e;
    public final w80.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0i.f f111183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f111184h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1 f111185j;
    public final gte.a k;

    public n(o7.b orderQuoteInteractor, f61.a plotInteractor, ppk.f ratesInteractor, a5h.g inputProcessor, l4i.a amountConverter, w80.b amountFormatter, x0i.f exchangeCurrenciesInteractor, z mapper, o0 draftMutator, t1 currencyRateNaviProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(plotInteractor, "plotInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(inputProcessor, "inputProcessor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f111180a = orderQuoteInteractor;
        this.f111181b = plotInteractor;
        this.f111182c = ratesInteractor;
        this.d = inputProcessor;
        this.e = amountConverter;
        this.f = amountFormatter;
        this.f111183g = exchangeCurrenciesInteractor;
        this.f111184h = mapper;
        this.i = draftMutator;
        this.f111185j = currencyRateNaviProvider;
        this.k = featureToggleInteractor;
    }

    @Override // a97.g
    public final Object d(gim.c cVar) {
        return this.d.y0(cVar);
    }

    @Override // a97.g
    public final a97.h e() {
        return new a97.h(a97.d.class);
    }

    @Override // a97.g
    public final a97.k f() {
        return new m(this);
    }
}
