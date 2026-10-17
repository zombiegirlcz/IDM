package meb;

import cli.j;
import cli.n;
import cli.o;
import ip0.a10;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        meb.a domainState = (meb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c(u.c(new a10("PARTY_SIZE_PICKER", domainState.f204639b, domainState.f204640c)));
    }
}
