package s8d;

import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd3.x;
import s6d.r;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f260973a, new s6e.g(this, 27), new r(20), new x(this, 21)));
    }
}
