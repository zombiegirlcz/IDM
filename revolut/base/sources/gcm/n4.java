package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes22.dex */
public final class n4 extends ecm.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.v0 f142783a;

    public n4(ecm.v0 v0Var) {
        this.f142783a = (ecm.v0) Preconditions.checkNotNull(v0Var, "result");
    }

    @Override // ecm.y0
    public final ecm.v0 a(q4 q4Var) {
        return this.f142783a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Class<?>) n4.class).add("result", this.f142783a).toString();
    }
}
