package e7e;

import g6e.d;
import kotlin.jvm.internal.Intrinsics;
import v6e.s;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f123309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f123310b;

    public b(s subscriptionDetailsNavigationProvider, d subaccountInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionDetailsNavigationProvider, "subscriptionDetailsNavigationProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f123309a = subscriptionDetailsNavigationProvider;
        this.f123310b = subaccountInteractor;
    }
}
