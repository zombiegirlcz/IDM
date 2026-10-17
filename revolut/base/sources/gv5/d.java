package gv5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final List f = v.k(io3.k.ACTIVE, io3.k.INACTIVE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu5.f f147060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv5.c f147061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f147062c;
    public final ppk.f d;
    public final gte.a e;

    public d(mu5.f cryptoInvestmentsInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, wsg.n walletInteractor, ppk.f ratesInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f147060a = cryptoInvestmentsInteractor;
        this.f147061b = cryptoCommodityBaseCurrencyInteractor;
        this.f147062c = walletInteractor;
        this.d = ratesInteractor;
        this.e = featureToggleInteractor;
    }
}
