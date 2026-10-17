package aug;

import ael.y;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import w4l.h;
import xtg.e;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ktg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f9825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f9826c;

    public d(e accountClosureRepository, ybl.d portfolioInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(accountClosureRepository, "accountClosureRepository");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f9824a = accountClosureRepository;
        this.f9825b = portfolioInteractor;
        this.f9826c = tradingAccountsInteractor;
    }

    public final r a(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return pd.b.r(rd0.e.c(q.q(((y) this.f9825b).e(portfolioId, h.f294642c)), g.f186406a), new a(this, 0));
    }
}
