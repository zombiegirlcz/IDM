package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerAccountService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAccountService f9643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go3.b f9644b;

    public v1(FreelancerAccountService api2, go3.b walletMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        this.f9643a = api2;
        this.f9644b = walletMapper;
    }
}
