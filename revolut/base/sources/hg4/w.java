package hg4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f152107a;

    public w(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f152107a = languageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f152093a, new he4.r(this, 20), new hb6.g(this, 21), new hb4.n(this, domainState, 8));
    }
}
