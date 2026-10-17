package d9j;

import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f112399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x8h.g f112400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ow5.b f112401n;

    public j(d mapper, x8h.g collectionsInteractor, ow5.b cryptoIsraelExpansionChecker) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(cryptoIsraelExpansionChecker, "cryptoIsraelExpansionChecker");
        this.f112399l = mapper;
        this.f112400m = collectionsInteractor;
        this.f112401n = cryptoIsraelExpansionChecker;
    }

    @Override // d9j.e
    public final v1 Z2(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new v1(new cuc.c(this, currency, (Continuation) null, 22));
    }

    @Override // d9j.e
    public final void b3(xzg.d collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        A2(new BridgeDestination(new FeatureCommand(new CryptoInvestFeatureConfig.CollectionDetails(collection.f309976a))));
    }
}
