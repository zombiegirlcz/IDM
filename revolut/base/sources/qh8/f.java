package qh8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements zh8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorOnboardingDestination.AppInvite.InputData f246520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246521b;

    public f(k kVar, JuniorOnboardingDestination.AppInvite.InputData inputData) {
        this.f246520a = inputData;
        this.f246521b = e4m.b.b(new e(kVar, this));
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
