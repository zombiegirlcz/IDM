package gf5;

import cli.j;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f143348a;

    public f(ttd.a interestRateFormatter) {
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        this.f143348a = interestRateFormatter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new b(domainState.f143343c, (List) iii.c.f(domainState.f143341a, new gd8.j(15), new gcc.c(8), new fyg.b(domainState, this, 13)));
    }
}
