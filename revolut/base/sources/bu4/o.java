package bu4;

import b1c.p;
import bn4.y;
import bt9.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f18687a;

    public o(w80.b amountFormatter, du4.a hintMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        this.f18687a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f18670a, new t(this, 7), new y(this, 23), new p(this, domainState, 22));
    }
}
