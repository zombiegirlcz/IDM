package b7f;

import a2f.q;
import cli.j;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f13037a;

    public g(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f13037a = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e((List) iii.c.f(domainState.f13035a, new b73.h(8), new b6d.a(6), new q(this, 29)));
    }
}
