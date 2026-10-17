package c02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f20110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20111b;

    public h(dj0.d total, i fee2) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f20110a = total;
        this.f20111b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f20110a, hVar.f20110a) && Intrinsics.f(this.f20111b, hVar.f20111b);
    }

    public final int hashCode() {
        return this.f20111b.hashCode() + (this.f20110a.hashCode() * 31);
    }
}
