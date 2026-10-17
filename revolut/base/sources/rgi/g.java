package rgi;

import cli.q;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f254191a;

    public g(boolean z) {
        this.f254191a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f254191a == ((g) obj2).f254191a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254191a);
    }
}
