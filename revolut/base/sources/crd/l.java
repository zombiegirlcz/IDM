package crd;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final erd.c f108357a;

    public l(erd.c spendingCycleTextMapper) {
        Intrinsics.checkNotNullParameter(spendingCycleTextMapper, "spendingCycleTextMapper");
        this.f108357a = spendingCycleTextMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f108350a, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(this, 27), new clk.b(21), new cf1.h(this, 9)));
    }
}
