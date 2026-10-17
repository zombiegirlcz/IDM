package ww8;

import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wvg.r1;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cli.n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(t1.t(domainState.f300623a, domainState.f300624b), new r1(this, 8), new wug.k(this, 17), new w2a.o(this, 27));
    }
}
