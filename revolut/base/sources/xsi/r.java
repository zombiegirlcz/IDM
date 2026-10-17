package xsi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f308545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f308546b;

    public r(w80.b amountFormatter, thf.c transactionCategoryResourcesMapper, u80.o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f308545a = amountFormatter;
        this.f308546b = transactionCategoryResourcesMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f308526a, new xng.l(this, domainState, 19), new xlb.l(27), new wx6.k(this, domainState, 18));
    }
}
