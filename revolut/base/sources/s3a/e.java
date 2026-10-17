package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingContactSyncNotifyScreenContract$InputData f259504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f259505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f259506c;

    public e(k kVar, d dVar, OnboardingContactSyncNotifyScreenContract$InputData onboardingContactSyncNotifyScreenContract$InputData) {
        this.f259504a = onboardingContactSyncNotifyScreenContract$InputData;
        int i = 4;
        this.f259505b = e4m.b.b(new ryc.d(kVar, this, 1, i));
        this.f259506c = e4m.b.b(new ryc.d(kVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
