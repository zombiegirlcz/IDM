package ch1;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    @Override // cli.n
    public final o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f24106a, new cge.g(4), new ccg.a(12), new cf1.h(this, domainState, 2)));
    }
}
