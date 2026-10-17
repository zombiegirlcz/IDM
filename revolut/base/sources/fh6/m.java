package fh6;

import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f135164a;

    public m(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f135164a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String strE = this.f135164a.e(domainState.f135156a);
        String string = o.b(new u80.g(domainState.f135156a, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        Clause clause = domainState.f135158c;
        return new j(domainState.f135157b.getD(), u.c(new CenteredAmountDelegate.Model("LIST_ID_AMOUNT", null, new bw0.h(strE, string, null, clause == null, null, Boolean.TRUE, false, false, null, null, null, null, 32724), null, clause != null ? new bw0.m(clause, bw0.l.ERROR, null, false, null, 28) : null, null, b9.MATCH_PARENT, null, null, null, null, null, null, 8106)), domainState.d);
    }
}
