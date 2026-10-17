package ytj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f316829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f316830b;

    public t(l80.e dateProvider, w challengeStepsMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(challengeStepsMapper, "challengeStepsMapper");
        this.f316829a = dateProvider;
        this.f316830b = challengeStepsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f316817a, new ysk.a(this, 7), new ypg.h(this), new y(this, 1));
    }
}
