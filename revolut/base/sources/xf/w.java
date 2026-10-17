package xf;

import com.google.protobuf.e2;

/* JADX INFO: loaded from: classes17.dex */
public final class w extends com.google.protobuf.p0 implements e2 {
    public w() {
        super(x.DEFAULT_INSTANCE);
    }

    public final void h(f fVar) {
        c();
        ((x) this.f49761b).addAndroidMemoryReadings(fVar);
    }

    public final void i(q qVar) {
        c();
        ((x) this.f49761b).addCpuMetricReadings(qVar);
    }

    public final void j(u uVar) {
        c();
        ((x) this.f49761b).setGaugeMetadata(uVar);
    }

    public final void k(String str) {
        c();
        ((x) this.f49761b).setSessionId(str);
    }
}
