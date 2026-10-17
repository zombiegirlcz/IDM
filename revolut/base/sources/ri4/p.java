package ri4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f254538a, new rg3.d(this, 28), new rhj.m(this, 3), new o(this, domainState, 0));
    }
}
