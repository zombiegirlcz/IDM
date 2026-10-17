package px;

import com.google.common.collect.ImmutableSet;
import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlowContract$InputData;
import java.util.Set;
import ppd.u;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeQrReaderFlowContract$InputData f240495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f240496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f240497c = this;
    public final e4m.e d;

    public c(g gVar, BarcodeQrReaderFlowContract$InputData barcodeQrReaderFlowContract$InputData) {
        this.f240496b = gVar;
        this.f240495a = barcodeQrReaderFlowContract$InputData;
        this.d = e4m.b.b(new u(gVar, this, 20));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
