package fci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements cli.n {

    @NotNull
    private static final f0 Companion = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f133777b = zhm.v.k(q.f133803b, q.f133802a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f133778a;

    public g0(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f133778a = uiKitResources;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        t0 domainState = (t0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (x0) iii.c.f(domainState.f133813a, new fag.o0(24), new e0(0), new f0e.i(this, domainState, 6));
    }
}
