package slj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData;
import dfj.q1;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements h {
    public final EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f264217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q1 f264218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final skj.a f264219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f264220s;

    public k(n stateMapper, EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData inputData, x deeplinkHandler, q1 phoneNumberPortingInteractor, skj.a portingStatusDialogConfig) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(phoneNumberPortingInteractor, "phoneNumberPortingInteractor");
        Intrinsics.checkNotNullParameter(portingStatusDialogConfig, "portingStatusDialogConfig");
        this.o = inputData;
        this.f264217p = deeplinkHandler;
        this.f264218q = phoneNumberPortingInteractor;
        this.f264219r = portingStatusDialogConfig;
        this.f264220s = mra.d.b(this, new e(false, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f264220s;
    }
}
