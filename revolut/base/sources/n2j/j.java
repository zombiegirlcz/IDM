package n2j;

import kotlin.jvm.internal.Intrinsics;
import n0c.v;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f211576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wzg.a f211577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f211578c;
    public final l d;

    public j(ybl.k tradingAccountsInteractor, wzg.a cashHoldingsInteractor, ang.f userInteractor, l tradingBalancesMapper) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingBalancesMapper, "tradingBalancesMapper");
        this.f211576a = tradingAccountsInteractor;
        this.f211577b = cashHoldingsInteractor;
        this.f211578c = userInteractor;
        this.d = tradingBalancesMapper;
    }

    public static final Object a(j jVar, kel.b bVar, g gVar) {
        return q.x(mo3.a.g(wzg.a.b(jVar.f211577b, bVar.f183150c, bVar.f183148a.f183146b), null, new v(16), 1), gVar);
    }
}
