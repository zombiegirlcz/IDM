package e75;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f123082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ky4.c f123083b;

    public q(c45.b accountMapper, c55.h loanBackUpCardMethodMapper, ky4.c numberFormatter) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        Intrinsics.checkNotNullParameter(loanBackUpCardMethodMapper, "loanBackUpCardMethodMapper");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        this.f123082a = accountMapper;
        this.f123083b = numberFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m((List) iii.c.f(domainState.f123067a, new e4k.f(this, 21), new e6e.a(1), new dbg.b(this, 24)));
    }
}
