package dce;

import cie.l1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        p domainState = (p) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new q((List) iii.c.f(domainState.d, new dak.c(13), new d7j.o0(24), new l1(23)), (hce.a) domainState.e.getContent());
    }
}
