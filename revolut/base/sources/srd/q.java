package srd;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import s6e.v;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends oki.h implements d {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tsj.g f265182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f265183q;

    public q(c inputData, tsj.g customAssetsInteractor, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f265182p = customAssetsInteractor;
        CustomAsset customAsset = inputData.f265166a;
        CustomAssetCategoryDefinition customAssetCategoryDefinition = inputData.f265167b;
        xi0.b bVar = inputData.f265168c;
        h0 h0Var = h0.f322473a;
        this.f265183q = mra.d.b(this, new a(customAsset, customAssetCategoryDefinition, bVar, false, h0Var, h0Var), stateMapper, null, false, 12);
    }

    public static final Object I2(q qVar, int i, m mVar) {
        qVar.getClass();
        Object objZ = vkm.q.z(qVar.X1(new y0(null, new z(new TextLocalisedClause(i, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), mVar);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    public final void J2(dj0.d dVar) {
        aii.o oVarL1 = l1();
        y yVar = this.f265183q;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        String str = ((a) j2Var.getValue()).f265160a.f99216a;
        if (dVar == null && (dVar = ((a) j2Var2.getValue()).f265160a.f99218c) == null) {
            dVar = new dj0.d(0L, ((a) j2Var2.getValue()).f265162c);
        }
        oVarL1.M0(new TotalWealthContract$Events.AdjustCurrentValue(dVar, str, false));
    }

    @Override // yji.l
    public final void T1(long j2) {
        w4l.i iVar = w4l.i.f294643c;
        tsj.g gVar = this.f265182p;
        Flow flowQ = vkm.q.q(new v(mo3.a.g(gVar.f(iVar), null, new sl5.g(28), 1), this, 10));
        h0 h0Var = h0.f322473a;
        yji.l.b1(this, rd0.e.d(flowQ, h0Var), null, new p(this, null, 0), 3);
        yji.l.b1(this, rd0.e.d(vkm.q.q(mo3.a.g(nim.a.v(gVar.g(w4l.j.f294644c), new soi.a(17)), null, new sl5.g(29), 1)), h0Var), null, new p(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f265183q;
    }
}
