package vgg;

import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b f289179b;

    public /* synthetic */ v(com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar, int i) {
        this.f289178a = i;
        this.f289179b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f289178a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f289179b.X1(com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b.I2());
                return Boolean.TRUE;
            case 1:
                ygg.c result = (ygg.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof ygg.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f289179b.J2();
                return Unit.f186387a;
            default:
                uvb.l result2 = (uvb.l) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof uvb.j;
                com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = this.f289179b;
                if (z) {
                    hfg.e eVar = (hfg.e) ((j) ((j2) bVar.f94277w.f22677a).getValue()).f289161a.getContent();
                    if (eVar != null && (str = eVar.f151830n) != null) {
                        bVar.l2(new vge.r(bVar, str, null, 3), new yi5.b(26));
                    }
                } else {
                    if (!(result2 instanceof uvb.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C1(new RevPointsFeatureConfig.RevPointsEarnConfig(0).f98274b);
                }
                return Unit.f186387a;
        }
    }
}
