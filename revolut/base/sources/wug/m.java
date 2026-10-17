package wug;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp4.j0;
import z0h.q1;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f300145a;

    public m(q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f300145a = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(t1.u(domainState.f300131a, domainState.f300132b, domainState.f300133c), new wsg.a(this, 28), new k(0), new j0(this, 5));
    }
}
