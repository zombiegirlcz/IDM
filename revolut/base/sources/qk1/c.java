package qk1;

import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMNetworkService;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyRequest;
import fnc.s;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements APMPMNetworkService {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f246940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f246941b;

    public c(s repository, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f246940a = repository;
        this.f246941b = scope;
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMNetworkService
    public final void performProxy(APMPMProxyRequest request, APMPMCallback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e0.C(this.f246941b, null, null, new b(this, request, callback, null), 3);
    }
}
