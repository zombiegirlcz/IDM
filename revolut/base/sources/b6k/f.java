package b6k;

import b4g.f0;
import com.revolut.core.model.account.AccountId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f12849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f12850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9l.a f12851c;

    public f(n walletInteractor, ppk.f ratesInteractor, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f12849a = walletInteractor;
        this.f12850b = ratesInteractor;
        this.f12851c = moneyCalculator;
    }

    public final ufm.n a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        ufm.i iVar = new ufm.i(this.f12849a.x(AccountId.Personal.f51414a), new b0a.h(16, new b58.f(11, this, false, transactions)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(ue0.e.I(iVar, h0.f322473a, new f0(25)));
    }
}
