package e69;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h69.a f122960a;

    public w(h69.a fundingSourceMapper, h69.b detailsMapper) {
        Intrinsics.checkNotNullParameter(fundingSourceMapper, "fundingSourceMapper");
        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
        this.f122960a = fundingSourceMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f122941a, new e4k.f(this, 18), new e07.k(27), new dn8.k(this, domainState, 10));
    }
}
