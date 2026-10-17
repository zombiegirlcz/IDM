package sek;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends oki.h implements m {
    public final PodNomineesListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lek.b f262219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qek.a f262220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f262221r;

    public r(PodNomineesListScreenContract$InputData inputData, lek.b podNomineesInteractor, qek.a dialogMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(podNomineesInteractor, "podNomineesInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f262219p = podNomineesInteractor;
        this.f262220q = dialogMapper;
        this.f262221r = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        w4l.k loadingStrategy = this.o.f102624c ? w4l.i.f294643c : w4l.h.f294642c;
        lek.m mVar = (lek.m) this.f262219p;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        bek.g gVar = mVar.f194586a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.b(gVar.f14870c.e(Unit.f186387a, loadingStrategy)), null, null, new q(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f262221r;
    }
}
