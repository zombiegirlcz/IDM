package in1;

import cli.y;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import imk.p0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends oki.h implements j {
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f162610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zof.f f162611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gn1.b f162612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l2j.a f162613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f162614t;

    public s(h inputData, w80.b amountFormatter, zof.f transferFeatureScreensProvider, gn1.b balanceInteractor, l2j.a currencyChooserFlowFactory, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(balanceInteractor, "balanceInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f162610p = amountFormatter;
        this.f162611q = transferFeatureScreensProvider;
        this.f162612r = balanceInteractor;
        this.f162613s = currencyChooserFlowFactory;
        this.f162614t = mra.d.b(this, new g(inputData.f162589a, inputData.f162590b, inputData.f162591c, inputData.d, inputData.e, inputData.f, inputData.f162592g, (TransferScheduleData) inputData.f162593h.getValue(), new hn1.a(0)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new p0(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, this.o.f162593h, null, null, new ibg.g(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f162614t;
    }
}
