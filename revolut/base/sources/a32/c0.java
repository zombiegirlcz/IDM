package a32;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d32.b f1017a;

    public c0(d32.b fundingMapper) {
        Intrinsics.checkNotNullParameter(fundingMapper, "fundingMapper");
        this.f1017a = fundingMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f1029b, new a09.a(29), new a08.n(16), new a15.n(domainState, this, 2));
    }
}
