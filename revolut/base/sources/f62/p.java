package f62;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentProfile f132395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h12.h f132396b;

    public p(ApmPaymentProfile profile, h12.h apmAreaProvider) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        this.f132395a = profile;
        this.f132396b = apmAreaProvider;
    }

    @Override // e12.f
    public final vkm.d a() {
        return h12.h.b(this.f132396b, tof.n.IRIS, tof.l.IRIS, null, t52.b.a(this.f132395a), 4);
    }

    @Override // e12.f
    public final Flow b() {
        return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
    }
}
