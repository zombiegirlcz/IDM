package bmj;

import au6.a3;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData;
import dfj.i1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements f {
    public final EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i1 f16842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f16843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f16844r;

    public h(n stateMapper, EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData inputData, i1 esimPhoneNumberInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberInteractor, "esimPhoneNumberInteractor");
        this.o = inputData;
        this.f16842p = esimPhoneNumberInteractor;
        this.f16843q = new vii.b();
        this.f16844r = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f16843q, new a3(continuation, this, 24)), null, null, new bi2.n(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f16844r;
    }
}
