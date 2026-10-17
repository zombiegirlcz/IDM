package v58;

import com.revolut.feature.junior.account_activation.impl.data.network.JuniorActivationClaimService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorActivationClaimService f286170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f286171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao.h f286172c;

    public k(JuniorActivationClaimService claimService, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(claimService, "claimService");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f286170a = claimService;
        this.f286171b = serverErrorParser;
        this.f286172c = new ao.h(20, new j(this, 1));
    }
}
