package fk4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zj4.a f135716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f135717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f135718r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, zj4.a externalLinkedAccountsInteractor, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(externalLinkedAccountsInteractor, "externalLinkedAccountsInteractor");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        this.f135716p = externalLinkedAccountsInteractor;
        this.f135717q = externalPocketNavigationFactory;
        this.f135718r = new f(0);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, ((hk4.b) this.f135716p).a(), null, new p(this, null), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f135718r;
    }
}
