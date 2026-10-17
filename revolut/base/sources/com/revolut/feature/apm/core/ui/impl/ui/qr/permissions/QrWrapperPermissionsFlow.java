package com.revolut.feature.apm.core.ui.impl.ui.qr.permissions;

import aii.r;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/permissions/QrWrapperPermissionsFlow;", "Laii/r;", "OUT", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrWrapperPermissionsFlow<OUT extends r> extends ViewController<OUT> implements f {
    public final int K;
    public final xki.a L;
    public final a M;
    public final Object N;

    public QrWrapperPermissionsFlow(ViewController controller, r permissionDeniedOutput, y80.a permissionProvider, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(permissionDeniedOutput, "permissionDeniedOutput");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.K = R$layout.base_flow_container;
        this.L = xki.a.f306815a;
        this.M = new a(controller, permissionDeniedOutput, permissionProvider, intentProvider);
        this.N = w.y0(new tyl.a(this, 3));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.M;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
