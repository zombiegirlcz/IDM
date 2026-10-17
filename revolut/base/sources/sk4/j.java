package sk4;

import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd3.x;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        sk4.a domainState = (sk4.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(domainState.f263766a, new sk2.f(4), new sa5.a(this, 27), new x(this, 26));
    }
}
