package gcm;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.d f142839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.m1 f142840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.p1 f142841c;
    public final v2 d;

    public q4(ecm.p1 p1Var, ecm.m1 m1Var, ecm.d dVar, v2 v2Var) {
        this.f142841c = (ecm.p1) Preconditions.checkNotNull(p1Var, "method");
        this.f142840b = (ecm.m1) Preconditions.checkNotNull(m1Var, "headers");
        this.f142839a = (ecm.d) Preconditions.checkNotNull(dVar, "callOptions");
        this.d = (v2) Preconditions.checkNotNull(v2Var, "pickDetailsConsumer");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && q4.class == obj2.getClass()) {
            q4 q4Var = (q4) obj2;
            if (Objects.equal(this.f142839a, q4Var.f142839a) && Objects.equal(this.f142840b, q4Var.f142840b) && Objects.equal(this.f142841c, q4Var.f142841c) && Objects.equal(this.d, q4Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f142839a, this.f142840b, this.f142841c, this.d);
    }

    public final String toString() {
        return "[method=" + this.f142841c + " headers=" + this.f142840b + " callOptions=" + this.f142839a + "]";
    }
}
