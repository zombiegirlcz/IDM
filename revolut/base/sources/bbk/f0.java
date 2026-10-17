package bbk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements cli.n {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4b.f f14324a;

    public f0(i4b.f fundingMapper) {
        Intrinsics.checkNotNullParameter(fundingMapper, "fundingMapper");
        this.f14324a = fundingMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f14326b, new bbh.a(this, 4), new bb2.t(7), new b1c.p(this, domainState, 10));
    }
}
