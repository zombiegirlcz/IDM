package rh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements lh8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f254374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbb.c f254375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uxj.a f254376c;

    public w(a accountCreationInteractor, kbb.c juniorConfigInteractor, uxj.a juniorUpgradeFactory) {
        Intrinsics.checkNotNullParameter(accountCreationInteractor, "accountCreationInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorUpgradeFactory, "juniorUpgradeFactory");
        this.f254374a = accountCreationInteractor;
        this.f254375b = juniorConfigInteractor;
        this.f254376c = juniorUpgradeFactory;
    }
}
