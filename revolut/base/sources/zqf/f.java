package zqf;

import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;
import znd.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f324476a, new u0(22), new znc.j(22), new y(this, domainState, 22));
    }
}
