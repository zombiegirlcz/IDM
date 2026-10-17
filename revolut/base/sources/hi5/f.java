package hi5;

import ji5.i;
import kotlin.jvm.internal.Intrinsics;
import til.m;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f152499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc5.a f152500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f152501c;

    public f(hc5.a cryptoAccountInteractor, i cryptoOnboardingInteractor, m workflowFlowDestinationProvider) {
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        this.f152499a = cryptoOnboardingInteractor;
        this.f152500b = cryptoAccountInteractor;
        this.f152501c = workflowFlowDestinationProvider;
    }
}
