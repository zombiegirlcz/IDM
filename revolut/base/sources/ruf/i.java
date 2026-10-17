package ruf;

import ruf.k;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f257551a;

    public i(long j2) {
        this.f257551a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f257551a == ((i) obj2).f257551a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257551a);
    }
}
