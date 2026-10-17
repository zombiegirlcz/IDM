package pu5;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f239824a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f239824a = featureToggleInteractor;
    }

    public final sxh.a a(ExchangeOrder order, String searchQuery, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new sxh.a(com.revolut.feature_crypto_order_details.api.navigation.a.a(order), searchQuery, bVar);
    }
}
