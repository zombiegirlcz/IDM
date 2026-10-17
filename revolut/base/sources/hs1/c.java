package hs1;

import com.revolut.feature.apm.bizum.impl.data.network.BizumService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumService f154859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj0.a f154860b;

    public c(BizumService service, rj0.a networkFeatureTogglesProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        this.f154859a = service;
        this.f154860b = networkFeatureTogglesProvider;
    }

    public static final wj0.b a(c cVar) {
        if (cVar.f154860b.a()) {
            return new wj0.b("payments_bizum_transfer");
        }
        return null;
    }
}
