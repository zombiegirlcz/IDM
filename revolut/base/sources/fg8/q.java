package fg8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om4.d0 f134986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f134987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sri.m f134988c;
    public final te8.e d;
    public final q78.e e;

    public q(om4.d0 juniorAllowancesInteractor, ang.f userInteractor, sri.m navigator, te8.e juniorAccountInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(juniorAllowancesInteractor, "juniorAllowancesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f134986a = juniorAllowancesInteractor;
        this.f134987b = userInteractor;
        this.f134988c = navigator;
        this.d = juniorAccountInteractor;
        this.e = juniorAccountDestinationResolver;
    }
}
