package nnj;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import nmb.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(t1.v(domainState.f217692a, domainState.f, domainState.d, domainState.e), new nnf.h(this, 2), new v(8), new mgh.i(26, domainState, this));
    }
}
