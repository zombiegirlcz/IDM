package cuj;

import cie.l1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f109033a;

    public b0(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f109033a = uiKitResources;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new p((k) iii.c.f(domainState.f109039a, new cui.s(9), new ct6.o(7), new l1(12)), (List) iii.c.f(domainState.f109039a, new cui.s(8), new ct6.o(6), new cf1.h(this, 11)));
    }
}
