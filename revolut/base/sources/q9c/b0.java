package q9c;

import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends yji.n implements t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f243858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f243859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ogm.i f243860n;
    public final vki.a o;

    public b0(m inputData, gte.a featureToggleInteractor, ogm.i interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f243858l = inputData;
        this.f243859m = featureToggleInteractor;
        this.f243860n = interactor;
        this.o = pyd.c.a(this, new s(null, PaymentScheduleSelection.PayNow.f84446a, false, null));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
