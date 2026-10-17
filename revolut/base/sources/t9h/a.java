package t9h;

import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection;
import e9h.d;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import rul.e;
import su9.c;
import t5e.m;
import y7k.g0;
import ybl.l;
import zel.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ryc.a f269034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f269035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f269036c;
    public final gte.a d;

    public a(ryc.a popularAssetsInteractor, l tradingConfigInteractor, d performanceAssetsTransformer, e metaCollectionInstrumentsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(popularAssetsInteractor, "popularAssetsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(metaCollectionInstrumentsInteractor, "metaCollectionInstrumentsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f269034a = popularAssetsInteractor;
        this.f269035b = performanceAssetsTransformer;
        this.f269036c = metaCollectionInstrumentsInteractor;
        this.d = featureToggleInteractor;
    }

    public final r a(s0h.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        f fVar = config.f258958a;
        if (!((jte.d) this.d).c(ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c)) {
            return this.f269034a.h(new a0h.b(a0h.a.STOCKS, w0.q(fVar)), true);
        }
        wgl.a params = new wgl.a(fVar);
        Intrinsics.checkNotNullParameter(params, "params");
        e eVar = this.f269036c;
        return pd.b.r(nim.a.w(rd0.e.c(boh.f.e(((c) eVar.f257629a).h(params), new g0(eVar, (Object) null, 28)), g.f186406a), new t9b.a(4)), new m(this, 20));
    }
}
