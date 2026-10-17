package ukm;

import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes13.dex */
public final class g0 extends v implements ProducerScope {
    @Override // kotlinx.coroutines.channels.ProducerScope
    public final j0 G() {
        return this;
    }

    @Override // skm.a
    public final void h0(Throwable th10, boolean z) {
        if (this.d.close(th10) || z) {
            return;
        }
        skm.e0.v(this.f263953c, th10);
    }

    @Override // skm.a
    public final void i0(Object obj2) {
        this.d.close(null);
    }
}
