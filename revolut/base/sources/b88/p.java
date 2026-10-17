package b88;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(t1.u(domainState.f13117a, domainState.f13118b, domainState.d), new b73.h(this, 15), new b6d.a(11), new o(0, domainState, this)));
    }
}
