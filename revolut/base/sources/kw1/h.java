package kw1;

import cli.j;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import ip0.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f190205a;

    public h(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f190205a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f190200a;
        dj0.d dVar2 = domainState.f190201b;
        return new f(u.c(new CenteredAmountDelegate.Model("AMOUNT_FIELD_ID", null, new bw0.h(this.f190205a.e(dVar2), o.b(new u80.g(dVar2, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, null, Boolean.TRUE, false, false, null, null, null, null, 32724), null, null, null, b9.MATCH_PARENT, null, null, null, null, null, null, 8122)), !Intrinsics.f(dVar, dVar2));
    }
}
