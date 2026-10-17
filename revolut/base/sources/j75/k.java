package j75;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f171861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ky4.c f171862b;

    public k(c45.b accountMapper, ky4.c numberFormatter) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        this.f171861a = accountMapper;
        this.f171862b = numberFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(domainState.f171856a, new j3f.d(this, 28), new j0g.b(29), new i(this, 0)));
    }
}
