package lw;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f200382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f200384c;

    public a(long j2, long j3, long j5) {
        this.f200382a = j2;
        this.f200383b = j3;
        this.f200384c = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f200382a == aVar.f200382a && this.f200383b == aVar.f200383b && this.f200384c == aVar.f200384c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f200384c) + d.c(Long.hashCode(this.f200382a) * 31, 31, this.f200383b);
    }
}
