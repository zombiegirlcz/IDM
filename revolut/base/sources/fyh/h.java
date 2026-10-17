package fyh;

import cli.q;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139005b;

    public h(boolean z, boolean z3) {
        this.f139004a = z;
        this.f139005b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f139004a == hVar.f139004a && this.f139005b == hVar.f139005b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139005b) + (Boolean.hashCode(this.f139004a) * 31);
    }
}
