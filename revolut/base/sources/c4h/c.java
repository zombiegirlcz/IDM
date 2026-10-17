package c4h;

import c2f.m;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21301a;

    public c(k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f21301a = tradingAccountsInteractor;
    }

    public final jhi.b a() {
        TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return mo3.a.g(q.q(k.f(this.f21301a, d.y0(elements), 6)), null, new m(5), 1);
    }
}
