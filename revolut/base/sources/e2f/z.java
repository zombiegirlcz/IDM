package e2f;

import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b f122093b;

    public /* synthetic */ z(com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar, int i) {
        this.f122092a = i;
        this.f122093b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f122092a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                y0 y0VarI2 = com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b.I2();
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = this.f122093b;
                yji.l.a1(bVar, bVar.X1(y0VarI2), null, null, null, 7);
                return Boolean.TRUE;
            case 1:
                uvb.l result = (uvb.l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof uvb.j;
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar2 = this.f122093b;
                if (z) {
                    u2f.d dVar = (u2f.d) ((n) ((j2) bVar2.A.f22677a).getValue()).f122075a.getContent();
                    if (dVar != null && (str = dVar.f276626p) != null) {
                        bVar2.l2(new dz6.o(bVar2, str, null, 14), new yi5.b(26));
                    }
                } else {
                    if (!(result instanceof uvb.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.C1(new RevPointsFeatureConfig.RevPointsEarnConfig(0).f98274b);
                }
                return Unit.f186387a;
            case 2:
                c2f.g result2 = (c2f.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z3 = result2 instanceof c2f.e;
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar3 = this.f122093b;
                if (z3) {
                    u2f.d dVar2 = (u2f.d) ((n) ((j2) bVar3.A.f22677a).getValue()).f122075a.getContent();
                    if (dVar2 != null) {
                        u2f.h hVar = dVar2.f276624m;
                        yji.l.a1(bVar3, bVar3.X1(bVar3.u.f(hVar.f276640c, ((c2f.e) result2).f20770a).f191791a), null, null, new g0(bVar3, hVar, null), 3);
                    }
                } else {
                    if (!(result2 instanceof c2f.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.C2(new u(((c2f.f) result2).f20771a, bVar3.o.f91137a));
                }
                return Unit.f186387a;
            default:
                aii.q it9 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar4 = this.f122093b;
                if (((u2f.d) ((n) ((j2) bVar4.A.f22677a).getValue()).f122075a.getContent()) != null) {
                    bVar4.J2();
                }
                return Unit.f186387a;
        }
    }
}
