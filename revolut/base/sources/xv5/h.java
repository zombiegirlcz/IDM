package xv5;

import e7l.g;
import efm.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import w38.w;
import xng.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements tv5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv5.d f309213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f309214b;

    public h(yv5.d currencyDiscoveryRepository, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(currencyDiscoveryRepository, "currencyDiscoveryRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f309213a = currencyDiscoveryRepository;
        this.f309214b = configurationInteractor;
    }

    public final r a(tv5.a currencyMode) {
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        return nim.a.w(((ik3.c) this.f309214b).l(g.b.f123407a, w4l.h.f294642c), new l(currencyMode, 25));
    }

    public final r b() {
        ue0.c cVar = this.f309213a.f317122a;
        Type type = yv5.f.f317125a;
        Intrinsics.checkNotNullExpressionValue(type, "<get-RECENTLY_VIEWED_CURRENCY_TYPE>(...)");
        r map = rd0.e.c(cVar.C0("RECENTLY_VIEWED_CURRENCY", type), kotlin.coroutines.g.f186406a).map(new yua.h(new ysk.a(26), 3)).map(new yua.h(new ysk.a(27), 4)).map(new yua.h(new ysk.a(28), 5)).map(new w(7, yv5.b.f317121a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF0 = te0.w.f0(map);
        r map2 = m70.a.g(((ik3.c) this.f309214b).l(g.b.f123407a, w4l.h.f294642c), null, null, 3).map(new xt1.a(17, new xub.e(8)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r map3 = te0.w.l(rVarF0, map2).map(new xt1.a(18, new xub.e(9)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        return map3;
    }

    public final pfm.r c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currency, "currency");
        pfm.a aVar = new pfm.a(new pfm.h(new xza.a(this.f309213a, currency, 11), 2), mfm.f.f205044g, 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        return te0.w.g0(aVar);
    }
}
