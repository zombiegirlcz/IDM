package b7a;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f12987a;

    public q(u80.o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f12987a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306275l;
        long j2 = domainState.f12976a;
        eVarB.add(new CenteredAmountDelegate.Model("LIST_ID_AMOUNT", null, new bw0.h(this.f12987a.d(j2, bVar.f306286a), u80.o.b(new u80.g(new dj0.d(j2, bVar), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, null, Boolean.TRUE, false, false, null, null, null, null, 32724), null, null, null, null, true, false, new yof.b(bVar, null), null, 1402));
        return new o(u.a(eVarB), domainState.f12976a > 0);
    }
}
