package m58;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp0.d f202870a;

    public p(u80.o moneyPrefixFormatter, mp0.d amountInputFilter) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountInputFilter, "amountInputFilter");
        this.f202870a = amountInputFilter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c) iii.c.f(t1.u(domainState.f202849b, domainState.f202848a, domainState.d), new m30.c(25), new m56.g(1), new lk7.n(this, 21));
    }
}
