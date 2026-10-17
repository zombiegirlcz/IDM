package gcm;

import com.google.common.base.MoreObjects;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g1 implements i0 {
    @Override // ecm.m0
    public final ecm.n0 a() {
        return e().a();
    }

    @Override // gcm.s3
    public final Runnable b(r3 r3Var) {
        return e().b(r3Var);
    }

    @Override // gcm.s3
    public void c(ecm.g2 g2Var) {
        e().c(g2Var);
    }

    public abstract i0 e();

    @Override // gcm.i0
    public final ecm.b getAttributes() {
        return e().getAttributes();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", e()).toString();
    }
}
