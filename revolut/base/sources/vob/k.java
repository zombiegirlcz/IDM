package vob;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vo8.t;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.h f290943a;

    public k(yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f290943a = pricingPlanStringMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f290931a, new vn8.a(this, 14), new t(6), new vjh.c(this, 5));
    }
}
