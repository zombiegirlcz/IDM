package w3c;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(t1.w(domainState.f294270a, domainState.f294271b, domainState.f294272c, domainState.d, domainState.e), new w29.a(this, 13), new w2.d(12), new vjh.c(this, domainState, 11));
    }
}
