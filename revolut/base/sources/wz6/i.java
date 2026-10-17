package wz6;

import cli.j;
import cli.n;
import cli.o;
import ft6.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wx6.k;
import wyc.p;
import wyg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgc.d f301378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f301379b;

    public i(kgc.d rewardImageMapper, l freelancerPerksMapper) {
        Intrinsics.checkNotNullParameter(rewardImageMapper, "rewardImageMapper");
        Intrinsics.checkNotNullParameter(freelancerPerksMapper, "freelancerPerksMapper");
        this.f301378a = rewardImageMapper;
        this.f301379b = freelancerPerksMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f301372a, new p(11), new s(2), new k(this, domainState, 3)));
    }
}
