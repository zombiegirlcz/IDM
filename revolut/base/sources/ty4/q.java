package ty4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy4.b f275486a;

    public q(vy4.b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f275486a = mapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f275466a, new tx.f(19), new tw8.g(8), new tch.c(this, 11)));
    }
}
