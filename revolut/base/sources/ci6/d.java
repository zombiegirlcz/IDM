package ci6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements yfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f24392a;

    public d(com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory) {
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        this.f24392a = externalPocketNavigationFactory;
    }

    @Override // yfe.d
    public final yfe.c a() {
        return new c(this.f24392a);
    }
}
