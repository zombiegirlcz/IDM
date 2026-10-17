package ds4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs4.g f117197a;

    public a0(fs4.g instalmentHubModelMapper) {
        Intrinsics.checkNotNullParameter(instalmentHubModelMapper, "instalmentHubModelMapper");
        this.f117197a = instalmentHubModelMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f117211a, new b(this, 1), new dmb.m(this, 23), new dbg.b(this, 9));
    }
}
