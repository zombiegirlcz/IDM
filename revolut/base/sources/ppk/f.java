package ppk;

import com.revolut.data.model.Data;
import e7l.g;
import efm.r;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import po9.w;
import vpk.v;
import w4l.j;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements cpk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9l.a f238626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f238627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f238628c;

    public f(k9l.a sharedRatesInteractor, v ratesRepository, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(sharedRatesInteractor, "sharedRatesInteractor");
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f238626a = sharedRatesInteractor;
        this.f238627b = ratesRepository;
        this.f238628c = configurationInteractor;
    }

    public final r b(Collection currencyPairs, boolean z) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        return this.f238626a.a(currencyPairs, z);
    }

    public final r c(List currencyPairs, n9l.b period) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(period, "period");
        return pd.b.r(f(currencyPairs), new d(this, period, 0));
    }

    public final r d(List currencyPairs, n9l.b period) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f238626a.b(currencyPairs, period);
    }

    public final r e(List currencyPairs, n9l.b period) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(period, "period");
        return pd.b.r(f(currencyPairs), new d(this, period, 1));
    }

    public final r f(Collection collection) {
        if (collection.isEmpty()) {
            r rVarJust = r.just(zi0.c.P(collection, false, null, 3));
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        r rVarDistinctUntilChanged = ue0.e.E(((ik3.c) this.f238628c).l(g.b.f123407a, j.f294644c), new Data(null, null, false, 7, null)).map(new w(9, new b2.a(collection, 6))).distinctUntilChanged();
        Intrinsics.h(rVarDistinctUntilChanged);
        return rVarDistinctUntilChanged;
    }
}
