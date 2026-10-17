package x3a;

import cli.n;
import cli.y;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements dli.b {
    public final t3a.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OnboardingContactSyncNotifyScreenContract$InputData f302722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f302723q;

    public l(t3a.f interactor, OnboardingContactSyncNotifyScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f302722p = inputData;
        this.f302723q = mra.d.b(this, new e(inputData.f80110a, inputData.f80111b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f302723q;
    }
}
