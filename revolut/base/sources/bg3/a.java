package bg3;

import b80.c;
import com.revolut.feature.check_topup.impl.network.CheckTopUpService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f15092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckTopUpService f15093b;

    public a(f80.a uriHelper, CheckTopUpService service, c networkStateRepository) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f15092a = uriHelper;
        this.f15093b = service;
    }
}
