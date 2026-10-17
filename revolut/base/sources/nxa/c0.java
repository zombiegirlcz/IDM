package nxa;

import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f220489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f220490b;

    public c0(f personalizedSubheaderProvider, d personalizedStepsProvider, a personalizedRewardProvider) {
        Intrinsics.checkNotNullParameter(personalizedSubheaderProvider, "personalizedSubheaderProvider");
        Intrinsics.checkNotNullParameter(personalizedStepsProvider, "personalizedStepsProvider");
        Intrinsics.checkNotNullParameter(personalizedRewardProvider, "personalizedRewardProvider");
        this.f220489a = personalizedSubheaderProvider;
        this.f220490b = personalizedStepsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(domainState.f220502b, new v(1), new nsl.d(16), new c1(this, domainState, 9));
    }
}
