package o83;

import cli.q;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f222920a;

    public i(boolean z) {
        this.f222920a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f222920a == ((i) obj2).f222920a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222920a);
    }
}
