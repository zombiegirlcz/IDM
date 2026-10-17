package x78;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(t1.u(domainState.f303161a, domainState.f303162b, domainState.f303163c), new x64.a(this, 10), new x48.a(10), new x0b.h(this, 2)));
    }
}
