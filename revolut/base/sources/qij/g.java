package qij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dej.n f246732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f246733b;

    public g(dej.n event, long j2) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f246732a = event;
        this.f246733b = j2;
    }

    @Override // qij.k
    public final long a() {
        return this.f246733b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f246732a, gVar.f246732a) && this.f246733b == gVar.f246733b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f246733b) + (this.f246732a.hashCode() * 31);
    }
}
