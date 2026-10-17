package p1g;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f231925a;

    public h(boolean z) {
        this.f231925a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f231925a == ((h) obj2).f231925a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231925a);
    }
}
