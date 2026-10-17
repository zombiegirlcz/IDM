package yu7;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements dli.b {
    public final InsuranceCoverageActivationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eu7.b f316907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tr7.a f316908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f316909r;

    public k(n stateMapper, InsuranceCoverageActivationScreenContract$InputData inputData, eu7.b cardsInteractor, tr7.a copyToClipboardHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        this.o = inputData;
        this.f316907p = cardsInteractor;
        this.f316908q = copyToClipboardHelper;
        this.f316909r = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f316907p.b(this.o.f76082b), null, null, new yk6.m(this, (Continuation) null, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f316909r;
    }
}
