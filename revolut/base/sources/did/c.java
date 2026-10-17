package did;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsAdsPersonalizedOffersOptInScreenContract$InputData f114989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f114990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f114991c;

    public c(d dVar, ShopsAdsPersonalizedOffersOptInScreenContract$InputData shopsAdsPersonalizedOffersOptInScreenContract$InputData) {
        this.f114989a = shopsAdsPersonalizedOffersOptInScreenContract$InputData;
        int i = 5;
        this.f114990b = e4m.b.b(new db1.f(dVar, this, 1, i));
        this.f114991c = e4m.b.b(new db1.f(dVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
