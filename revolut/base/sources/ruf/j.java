package ruf;

import ruf.k;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f257552a;

    public j(long j2) {
        this.f257552a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f257552a == ((j) obj2).f257552a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257552a);
    }
}
