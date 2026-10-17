package bba;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.n f14222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hp.g f14223b;

    public u(m3j.n beneficiaryItemViewMapper, hp.g pixKeyValidator) {
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(pixKeyValidator, "pixKeyValidator");
        this.f14222a = beneficiaryItemViewMapper;
        this.f14223b = pixKeyValidator;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f14200a, new b96.a(24), new bb2.t(3), new b1c.p(this, domainState, 8));
    }
}
