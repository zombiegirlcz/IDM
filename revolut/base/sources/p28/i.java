package p28;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f232185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f232186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f232187c;
    public final Map d;

    public i(dsh.g holderBuilder, fsh.c providerTransformer, ImmutableMap investProviders, ImmutableMap favouritesProviders, ImmutableMap wealthProviders, ImmutableMap instrumentsTrendCollectionsProviders, e28.e investToFavouritesAdapter, e28.g investToWealthWidgetAdapter, e28.f investToInstrumentsTrendCollectionsWidgetContextAdapter) {
        Intrinsics.checkNotNullParameter(holderBuilder, "holderBuilder");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Intrinsics.checkNotNullParameter(investProviders, "investProviders");
        Intrinsics.checkNotNullParameter(favouritesProviders, "favouritesProviders");
        Intrinsics.checkNotNullParameter(wealthProviders, "wealthProviders");
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsProviders, "instrumentsTrendCollectionsProviders");
        Intrinsics.checkNotNullParameter(investToFavouritesAdapter, "investToFavouritesAdapter");
        Intrinsics.checkNotNullParameter(investToWealthWidgetAdapter, "investToWealthWidgetAdapter");
        Intrinsics.checkNotNullParameter(investToInstrumentsTrendCollectionsWidgetContextAdapter, "investToInstrumentsTrendCollectionsWidgetContextAdapter");
        this.f232185a = investProviders;
        this.f232186b = favouritesProviders;
        this.f232187c = wealthProviders;
        this.d = instrumentsTrendCollectionsProviders;
    }

    public i(dsh.g holderBuilder, fsh.c providerTransformer, ImmutableMap cryptoProviders, ImmutableMap favouritesProviders, ks5.d cryptoToFavouritesAdapter, ImmutableMap wealthProviders, ks5.f cryptoToWealthContextAdapter, ImmutableMap mostTradedProviders, ks5.e investToMostTradedAdapter) {
        Intrinsics.checkNotNullParameter(holderBuilder, "holderBuilder");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Intrinsics.checkNotNullParameter(cryptoProviders, "cryptoProviders");
        Intrinsics.checkNotNullParameter(favouritesProviders, "favouritesProviders");
        Intrinsics.checkNotNullParameter(cryptoToFavouritesAdapter, "cryptoToFavouritesAdapter");
        Intrinsics.checkNotNullParameter(wealthProviders, "wealthProviders");
        Intrinsics.checkNotNullParameter(cryptoToWealthContextAdapter, "cryptoToWealthContextAdapter");
        Intrinsics.checkNotNullParameter(mostTradedProviders, "mostTradedProviders");
        Intrinsics.checkNotNullParameter(investToMostTradedAdapter, "investToMostTradedAdapter");
        this.f232185a = cryptoProviders;
        this.f232186b = favouritesProviders;
        this.f232187c = wealthProviders;
        this.d = mostTradedProviders;
    }
}
