package gcm;

import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f142621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ecm.b f142622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ecm.f0 f142623c;

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f142621a.equals(e0Var.f142621a) && this.f142622b.equals(e0Var.f142622b) && Objects.equal(null, null) && Objects.equal(this.f142623c, e0Var.f142623c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f142621a, this.f142622b, null, this.f142623c);
    }
}
