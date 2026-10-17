package kmc;

import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingFlowContract$Input f185763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4f.b f185764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f185765c;

    public h(OnboardingFlowContract$Input input, m4f.b wealthAddMoneyCommandProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f185763a = input;
        this.f185764b = wealthAddMoneyCommandProvider;
        this.f185765c = dateProvider;
    }
}
