package mrc;

import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        mrc.a domainState = (mrc.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(t1.t(domainState.f208099a, domainState.f208100b), new mqg.b(this), new mqg.a(this), new mig.a(this, 5));
    }
}
