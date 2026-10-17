package qm8;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qjj.g;
import qk2.h;
import ql6.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(t1.t(domainState.f247779a, domainState.f247780b), new s(this, 7), new g(this, 9), new h(this, 1));
    }
}
