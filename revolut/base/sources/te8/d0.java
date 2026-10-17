package te8;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f270061a;

    public d0(wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f270061a = walletInteractor;
    }

    public final efm.r a(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Set setB = y0.b(io3.l.CURRENT);
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        atg.v vVar = (atg.v) this.f270061a.f299736b;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r map = vVar.n("PARAM_ALL_WALLETS", loadingStrategy).map(new a08.r(5, new atg.t(walletId, walletId, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = m70.a.g(map, null, new tc6.b(17), 1).switchMap(new tcg.q(17, new t8e.c(this, setB, 15)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
