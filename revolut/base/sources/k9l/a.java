package k9l;

import com.revolut.data.model.Data;
import e7l.g;
import efm.r;
import g48.h;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m9l.f;
import npk.o;
import pd.b;
import ue0.e;
import w4l.j;
import zi0.c;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f182358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f182359b;

    public a(f ratesRepository, o configurationProvider) {
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f182358a = ratesRepository;
        this.f182359b = configurationProvider;
    }

    public final r a(Collection currencyPairs, boolean z) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        return b.r(c(currencyPairs), new gae.a(this, z, 23));
    }

    public final r b(List currencyPairs, n9l.b period) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(period, "period");
        return b.r(c(currencyPairs), new h((Object) this, (Object) period, false, 22));
    }

    public final r c(Collection collection) {
        if (collection.isEmpty()) {
            r rVarJust = r.just(c.P(collection, false, null, 3));
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        fk3.a aVar = this.f182359b.f218277a;
        r rVarDistinctUntilChanged = e.E(nim.a.w(e.E(((ik3.c) aVar).l(g.b.f123407a, j.f294644c), new Data(null, null, false, 7, null)), new nnf.h(24)), new Data(null, null, false, 7, null)).map(new k64.a(12, new b2.a(collection, 4))).distinctUntilChanged();
        Intrinsics.h(rVarDistinctUntilChanged);
        return rVarDistinctUntilChanged;
    }
}
