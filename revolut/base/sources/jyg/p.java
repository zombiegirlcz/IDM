package jyg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyg.l f179441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f179442b;

    public p(uyg.l analyticsTypeMapper, kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(analyticsTypeMapper, "analyticsTypeMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f179441a = analyticsTypeMapper;
        this.f179442b = wealthAccountHeaderUiMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f179429c, new jxb.g(26), new jul.c(10), new joa.j(this, domainState, 10)));
    }
}
