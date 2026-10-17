package n12;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.QrDetailsFlow;
import com.revolut.feature.apm.core.ui.impl.ui.qr.pager.QrFlow;
import com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.QrWrapperPermissionsFlow;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlow;
import g12.f;
import g12.k;
import g12.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f211201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f211202b;

    public a(s70.a intentProvider, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f211201a = permissionProvider;
        this.f211202b = intentProvider;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean z = descriptor instanceof f;
        s70.a aVar = this.f211202b;
        y80.a aVar2 = this.f211201a;
        if (z) {
            f fVar = (f) descriptor;
            return fVar.a(new QrWrapperPermissionsFlow(new QrFlow(fVar.f139520a), g12.g.f139521a, aVar2, aVar));
        }
        if (descriptor instanceof k) {
            k kVar = (k) descriptor;
            return kVar.a(new QrWrapperPermissionsFlow(new QrScannerFlow(kVar.f139524a, kVar.f139525b), n.f139526a, aVar2, aVar));
        }
        if (!(descriptor instanceof g12.b)) {
            return null;
        }
        g12.b bVar = (g12.b) descriptor;
        return bVar.a(new QrDetailsFlow(bVar.f139517a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
