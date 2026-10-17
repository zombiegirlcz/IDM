package sf;

import xf.x;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f262245a;

    public b(x xVar) {
        this.f262245a = xVar;
    }

    @Override // sf.e
    public final boolean a() {
        x xVar = this.f262245a;
        if (!xVar.hasSessionId()) {
            return false;
        }
        if (xVar.getCpuMetricReadingsCount() > 0 || xVar.getAndroidMemoryReadingsCount() > 0) {
            return true;
        }
        return xVar.hasGaugeMetadata() && xVar.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb();
    }
}
