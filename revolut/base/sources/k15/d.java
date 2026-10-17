package k15;

import kotlin.jvm.internal.Intrinsics;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p15.b f180100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f180101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f180102c;

    public d(p15.b creditHelpRepository, j creditApplicationsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(creditHelpRepository, "creditHelpRepository");
        Intrinsics.checkNotNullParameter(creditApplicationsInteractor, "creditApplicationsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f180100a = creditHelpRepository;
        this.f180101b = creditApplicationsInteractor;
        this.f180102c = userInteractor;
    }
}
