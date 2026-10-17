package r6d;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r40.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x80.a f251675a;

    public k(x80.a packageNameProvider) {
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        this.f251675a = packageNameProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f251665b, new y0(this), new h(0), new j(this, domainState)));
    }
}
