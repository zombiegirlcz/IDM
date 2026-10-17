package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class y5 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f185029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bub.a f185030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fub.f f185031n;
    public final klf.b1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final klf.b3 f185032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final klf.m1 f185033q;

    public y5(klf.h0 commonDataSource, bub.a revPointsOptInPlacementsExtension, fub.f revPointsOptInPlacementsMapper, klf.b1 donationsDataSource, klf.b3 warrantDataSource, klf.m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsExtension, "revPointsOptInPlacementsExtension");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsMapper, "revPointsOptInPlacementsMapper");
        Intrinsics.checkNotNullParameter(donationsDataSource, "donationsDataSource");
        Intrinsics.checkNotNullParameter(warrantDataSource, "warrantDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f185029l = commonDataSource;
        this.f185030m = revPointsOptInPlacementsExtension;
        this.f185031n = revPointsOptInPlacementsMapper;
        this.o = donationsDataSource;
        this.f185032p = warrantDataSource;
        this.f185033q = juniorDataSource;
    }

    public final cmf.p Z2() {
        return new cmf.p(new vkm.y(new g2d.c(2, 23, null), ta6.a.g(new kh4.f(((hyb.c) this.f185030m).b3(new m1c.w0(this.f185029l.f185494j)), this, 26), vkm.q.P(zi0.c.w((SharedFlow) this.o.f.getValue()), 1), vkm.q.P(zi0.c.w((SharedFlow) this.f185032p.d.getValue()), 1), new x5(this.f185033q.a(), 0), new u5(5, null))), new chc.c0(23), zhm.u.c(this), "RevPointsOptInPlacements");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean zC3;
        if (obj2 instanceof com.revolut.core.ui_kit.delegates.t) {
            zC3 = ((hyb.c) this.f185030m).c3((com.revolut.core.ui_kit.delegates.t) obj2);
        } else {
            zC3 = false;
        }
        return Boolean.valueOf(zC3);
    }
}
