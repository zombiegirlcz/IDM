package ruf;

import ruf.k;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f257554a;

    public l(long j2) {
        this.f257554a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f257554a == ((l) obj2).f257554a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257554a);
    }
}
