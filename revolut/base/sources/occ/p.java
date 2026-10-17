package occ;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import obg.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(t1.t(domainState.f224207b, domainState.f224208c), new q(this, 10), new oa4.c(this, domainState), new nrd.i(this, domainState, 15));
    }
}
