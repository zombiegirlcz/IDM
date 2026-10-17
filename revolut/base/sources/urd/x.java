package urd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends oki.h implements d {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tsj.g f282298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a f282299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wli.x f282300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f282301s;

    public x(c inputData, tsj.g customAssetsInteractor, com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a smartEstimationExtension, wli.x deeplinkHandler, g0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(smartEstimationExtension, "smartEstimationExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f282298p = customAssetsInteractor;
        this.f282299q = smartEstimationExtension;
        this.f282300r = deeplinkHandler;
        CustomAsset customAsset = inputData.f282274a;
        CustomAssetCategoryDefinition customAssetCategoryDefinition = inputData.f282275b;
        boolean z = customAsset.k;
        amd.a aVar = amd.a.YEAR;
        h0 h0Var = h0.f322473a;
        this.f282301s = mra.d.b(this, new a(customAsset, customAssetCategoryDefinition, z, aVar, -1, null, h0Var, h0Var), stateMapper, null, false, 12);
    }

    public final boolean I2() {
        return ((a) ((j2) this.f282301s.f22677a).getValue()).f282265b.f99226c && this.f282298p.e();
    }

    @Override // yji.l
    public final void T1(long j2) {
        w4l.i iVar = w4l.i.f294643c;
        tsj.g gVar = this.f282298p;
        Flow flowQ = vkm.q.q(new tse.c(mo3.a.g(gVar.f(iVar), null, new up5.k(20), 1), this, 25));
        h0 h0Var = h0.f322473a;
        yji.l.b1(this, rd0.e.d(flowQ, h0Var), null, new w(this, null, 0), 3);
        Flow flowQ2 = vkm.q.q(nim.a.v(gVar.g(w4l.j.f294644c), new upc.b(29)));
        if (I2()) {
            yji.l.b1(this, rd0.e.d(mo3.a.g(u0.m(flowQ2, this.f282299q.c3(w4l.h.f294642c)), null, new up5.k(19), 1), h0Var), null, new w(this, null, 2), 3);
        } else {
            yji.l.b1(this, rd0.e.d(mo3.a.g(flowQ2, null, new up5.k(18), 1), h0Var), null, new w(this, null, 1), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f282301s;
    }
}
