package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingContactSyncPermissionScreenContract$InputData f259507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f259508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f259509c;

    public f(k kVar, d dVar, OnboardingContactSyncPermissionScreenContract$InputData onboardingContactSyncPermissionScreenContract$InputData) {
        this.f259507a = onboardingContactSyncPermissionScreenContract$InputData;
        int i = 5;
        this.f259508b = e4m.b.b(new ryc.d(kVar, this, 1, i));
        this.f259509c = e4m.b.b(new ryc.d(kVar, this, 0, i));
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
