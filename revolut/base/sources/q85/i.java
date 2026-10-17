package q85;

import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv7.t;
import q75.n;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e((List) iii.c.f(domainState.f242986a, new n(21), new q34.a(25), new t(this, 12)));
    }
}
