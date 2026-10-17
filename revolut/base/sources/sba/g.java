package sba;

import cli.j;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.jvm.internal.Intrinsics;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f261523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.d f261524b;

    public g(o moneyPrefixFormatter, w80.b amountFormatter, yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f261523a = amountFormatter;
        this.f261524b = transferAmountMapper;
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f261518a;
        dj0.d dVar2 = domainState.f261519b;
        return new f(u.c(new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, new bw0.h(this.f261523a.e(dVar2), o.b(new u80.g(dVar2, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, ((ppf.c) this.f261524b).f238600b, Boolean.TRUE, false, false, null, null, null, null, 32708), null, null, null, null, false, false, null, null, 2042)), !Intrinsics.f(dVar, dVar2));
    }
}
