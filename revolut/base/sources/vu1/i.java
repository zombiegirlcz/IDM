package vu1;

import cli.j;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vo8.t;
import vrl.i0;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f292191a, new i0(16), new t(27), new uw2.n(this, 27)), ((List) domainState.f292191a.getContent()) != null ? !r1.isEmpty() : false, domainState.f292193c, domainState.d);
    }
}
