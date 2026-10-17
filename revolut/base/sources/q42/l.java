package q42;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e12.h f242002a;

    public l(e12.h transactionMapper) {
        Intrinsics.checkNotNullParameter(transactionMapper, "transactionMapper");
        this.f242002a = transactionMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f241996a, new q3d.i(this, 2), new q34.a(3), new p40.n(this, 23)));
    }
}
