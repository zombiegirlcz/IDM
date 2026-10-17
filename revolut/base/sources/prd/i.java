package prd;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import com.revolut.retail.common.ui.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements dli.b {
    public final AdjustAssetValueContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tsj.g f238991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f238992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f238993r;

    public i(AdjustAssetValueContract$InputData inputData, tsj.g customAssetsInteractor, w80.b amountFormatter, com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f238991p = customAssetsInteractor;
        this.f238992q = amountFormatter;
        this.f238993r = mra.d.b(this, new a(inputData.getF87939b()), stateMapper, null, false, 12);
    }

    public static final Object I2(i iVar, int i, gim.i iVar2) {
        Object objZ = q.z(iVar.X1(new y0(null, new z(new TextLocalisedClause(i, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), iVar2);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f238993r;
    }
}
