package nwf;

import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import nuc.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements p {

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
        return new i((List) iii.c.f(domainState.f219862c, new n(23), new nsl.d(14), new nrd.i(this, domainState, 6)));
    }
}
