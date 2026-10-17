package j48;

import ba4.x;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsProductCatalogMigration;
import iz1.p;
import java.util.concurrent.atomic.AtomicReference;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn2.c f171314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f171315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f171316c;

    public b(fn2.c productCatalogLoader, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogLoader, "productCatalogLoader");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f171314a = productCatalogLoader;
        this.f171315b = featureToggleInteractor;
        this.f171316c = new AtomicReference(null);
    }

    public final Flow a(x originFlow) {
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        return ((d) this.f171315b).c(JointAccountsApi$Toggles$JointAccountsProductCatalogMigration.f76459c) ? new q0(originFlow, new p(this, null, 10), 1) : originFlow;
    }
}
