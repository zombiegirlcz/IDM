package com.revolut.feature.pockets.impl.details_v2.pocket_actions;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f80838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f80839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f80840c;
    public final l61.a d;
    public final gr6.a e;

    public b(n walletInteractor, n8b.a countryInteractor, r0 jointInteractor, l61.a userCompanyInteractor, gr6.a freelancerAccountDetailsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        this.f80838a = walletInteractor;
        this.f80839b = countryInteractor;
        this.f80840c = jointInteractor;
        this.d = userCompanyInteractor;
        this.e = freelancerAccountDetailsInteractor;
    }
}
