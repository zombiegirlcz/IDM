package qxd;

import cli.n;
import cli.y;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends oki.h implements dli.b {
    public final CustomOrderAmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f250082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f250083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f250084r;

    public k(n stateMapper, CustomOrderAmountScreenContract$InputData inputData, fk3.a configurationInteractor, w80.b moneyEditAmountFormatter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(moneyEditAmountFormatter, "moneyEditAmountFormatter");
        this.o = inputData;
        this.f250082p = configurationInteractor;
        this.f250083q = moneyEditAmountFormatter;
        dj0.d dVar = inputData.f88202c;
        this.f250084r = mra.d.b(this, new e(dVar == null ? new dj0.d(0L, inputData.f88200a) : dVar, null, false, true), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null), new yi5.b(26));
        l2(new qc8.b(this, null, 17), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f250084r;
    }
}
