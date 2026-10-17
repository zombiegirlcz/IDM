package og2;

import kotlin.jvm.internal.Intrinsics;
import obg.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f225007a;

    public o(l80.e dateProvider, t12.b frequencyMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(frequencyMapper, "frequencyMapper");
        this.f225007a = dateProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f224998a, new q(29), new ob2.a(20), new nrd.i(this, 16));
    }
}
