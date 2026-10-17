package aqd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class s1 implements cli.n {

    @NotNull
    public static final q1 Companion = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cqd.d f8399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cqd.b f8400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cqd.i f8401c;
    public final cqd.g d;

    public s1(cqd.f footerMapper, cqd.d destinationsMapper, cqd.b incomeSorterCrossSellMapper, cqd.i incomeSorterToolbarMapper, cqd.g remainingBalanceMapper, cqd.j incomeSorterSortModeMapper) {
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(destinationsMapper, "destinationsMapper");
        Intrinsics.checkNotNullParameter(incomeSorterCrossSellMapper, "incomeSorterCrossSellMapper");
        Intrinsics.checkNotNullParameter(incomeSorterToolbarMapper, "incomeSorterToolbarMapper");
        Intrinsics.checkNotNullParameter(remainingBalanceMapper, "remainingBalanceMapper");
        Intrinsics.checkNotNullParameter(incomeSorterSortModeMapper, "incomeSorterSortModeMapper");
        this.f8399a = destinationsMapper;
        this.f8400b = incomeSorterCrossSellMapper;
        this.f8401c = incomeSorterToolbarMapper;
        this.d = remainingBalanceMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        t domainState = (t) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q0) iii.c.f(domainState.f8402a, new aqb.s(this, 12), new h1(1), new a15.n(this, domainState, 24));
    }
}
