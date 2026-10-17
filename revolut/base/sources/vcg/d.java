package vcg;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f287692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f287693b;

    public d(boolean z, boolean z3) {
        this.f287692a = z;
        this.f287693b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f287692a == dVar.f287692a && this.f287693b == dVar.f287693b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287693b) + (Boolean.hashCode(this.f287692a) * 31);
    }
}
