package hq8;

import hp3.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u80.o;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f154638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f154639b;

    public n(h inputData, w80.b amountFormatter, o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f154638a = inputData;
        this.f154639b = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l(domainState.f154627a.getContent() != null, (List) iii.c.f(domainState.f154627a, new r(26), new hkb.e(27), new hnc.a(this, 3)));
    }
}
